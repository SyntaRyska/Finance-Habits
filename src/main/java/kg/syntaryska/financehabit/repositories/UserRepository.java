package kg.syntaryska.habit.repositories;

import kg.syntaryska.habit.models.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
