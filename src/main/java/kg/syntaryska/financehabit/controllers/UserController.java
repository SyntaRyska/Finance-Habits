package kg.syntaryska.financehabit.controllers;

import jakarta.validation.Valid;
import kg.syntaryska.financehabit.models.dtos.UserDto;
import kg.syntaryska.financehabit.models.entities.UserEntity;
import kg.syntaryska.financehabit.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<UserEntity>> getAllUsers() {
        List<UserEntity> users = userService.getAllUsers();
        logger.info("Получены все пользователи");
        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserEntity> getUserById(@PathVariable Long id) {
        return userService.getUserById(id)
                .map(user -> {
                    logger.info("Пользователь с идентификатором {} найден", id);
                    return ResponseEntity.ok(user);
                })
                .orElseGet(() -> {
                    logger.warn("Пользователь с идентификатором {} не найден", id);
                    return ResponseEntity.notFound().build();
                });
    }

    @PostMapping("/create")
    public ResponseEntity<UserEntity> createUser(@Valid @RequestBody UserDto userDto) {
        try {
            UserEntity userEntity = userService.createUser(userDto);
            URI location = URI.create(String.format("/api/users/%s", userEntity.getId()));
            logger.info("Пользователь с именем {} создан", userEntity.getUsername());
            return ResponseEntity.created(location).body(userEntity);
        } catch (Exception e) {
            logger.error("Ошибка при создании пользователя: {}", e.getMessage());
            return ResponseEntity.badRequest().build();
        }
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        try {
            userService.deleteUser(id);
            logger.info("Пользователь с идентификатором {} удален", id);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            logger.error("Ошибка при удалении пользователя: {}", e.getMessage());
            return ResponseEntity.notFound().build();
        }
    }
}
