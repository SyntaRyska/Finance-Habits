package kg.syntaryska.financehabit.controllers;

import jakarta.validation.Valid;
import kg.syntaryska.financehabit.models.dtos.UserDto;
import kg.syntaryska.financehabit.models.entities.UserEntity;
import kg.syntaryska.financehabit.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<UserEntity>> getAllUsers() {
        List<UserEntity> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserEntity> getUserById(@PathVariable Long id) {
        return userService.getUserById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<UserEntity> createUser(@Valid @RequestBody UserDto userDto) {
        try {
            UserEntity userEntity = userService.createUser(userDto);
            return ResponseEntity.ok(userEntity);
        } catch (Exception e) {
            logger.error("Error creating user: {}", e.getMessage());
            return ResponseEntity.badRequest().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        return userService.getUserById(id)
                .map(user -> {
                    userService.deleteUser(id);
                    return ResponseEntity.noContent().<Void>build();
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
