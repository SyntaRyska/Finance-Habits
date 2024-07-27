package kg.syntaryska.financehabit.services;

import kg.syntaryska.financehabit.models.dtos.UserDto;
import kg.syntaryska.financehabit.models.entities.UserEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<UserEntity> getAllUsers();

    Optional<UserEntity> getUserById(Long id);

    UserEntity getUserByUsername(String username);

    UserEntity createUser(UserDto userDto);

    ResponseEntity<?> deleteUser(Long id);

}
