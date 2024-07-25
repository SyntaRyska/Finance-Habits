package kg.syntaryska.financehabit.services.impl;

import jakarta.transaction.Transactional;
import kg.syntaryska.financehabit.exceptions.UserAlreadyExistsException;
import kg.syntaryska.financehabit.exceptions.UserNotFoundExcepion;
import kg.syntaryska.financehabit.mappers.UserMapper;
import kg.syntaryska.financehabit.models.dtos.UserDto;
import kg.syntaryska.financehabit.models.entities.UserEntity;
import kg.syntaryska.financehabit.repositories.UserRepository;
import kg.syntaryska.financehabit.services.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private static final Logger logger = Logger.getLogger(UserServiceImpl.class.getName());
    private final UserMapper userMapper;

    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional <UserEntity> getUserById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public UserEntity getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Transactional
    @Override
    public UserEntity createUser(UserDto userDto) {

        if (userRepository.findByUsername(userDto.getUsername()) != null) {
            throw new UserAlreadyExistsException("Имя пользователя" + userDto.getUsername() + " уже используется");
        }

        UserEntity userEntity = userMapper.toEntity(userDto);
        return userRepository.save(userEntity);
    }

    @Override
    public void deleteUser(Long id) {
        if (!userRepository.existsById(id)) {
            throw new UserNotFoundExcepion("Пользователь с идентификатором " + id + " не существует!");
        }

        logger.info("Удаление пользователя с идентификатором:" + id);
        userRepository.deleteById(id);
        userRepository.deleteById(id);
    }
}
