package kg.syntaryska.financehabit.services.impl;

import jakarta.transaction.Transactional;
import kg.syntaryska.financehabit.exceptions.UserAlreadyExistsException;
import kg.syntaryska.financehabit.exceptions.UserNotFoundExcepion;
import kg.syntaryska.financehabit.mappers.UserMapper;
import kg.syntaryska.financehabit.models.dtos.UserDto;
import kg.syntaryska.financehabit.models.entities.UserEntity;
import kg.syntaryska.financehabit.repositories.UserRepository;
import kg.syntaryska.financehabit.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService, UserDetailsService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public List<UserEntity> getAllUsers() {
        logger.info("Получение всех пользователей");
        return userRepository.findAll();
    }

    @Override
    public Optional<UserEntity> getUserById(Long id) {
        logger.info("Получение пользователя с идентификатором: {}", id);
        return userRepository.findById(id);
    }

    @Transactional
    @Override
    public UserEntity createUser(UserDto userDto) {
        logger.info("Создание пользователя с именем: {}", userDto.getUsername());
        if (userRepository.existsByUsername(userDto.getUsername())) {
            throw new UserAlreadyExistsException("Имя пользователя " + userDto.getUsername() + " уже используется");
        }

        UserEntity userEntity = userMapper.toEntity(userDto);
        return userRepository.save(userEntity);
    }

    @Transactional
    @Override
    public void deleteUser(Long id) {
        logger.info("Удаление пользователя с идентификатором: {}", id);
        if (!userRepository.existsById(id)) {
            throw new UserNotFoundExcepion("Пользователь с идентификатором " + id + " не существует!");
        }

        userRepository.deleteById(id);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity = userRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));
        return userEntity;
    }
}
