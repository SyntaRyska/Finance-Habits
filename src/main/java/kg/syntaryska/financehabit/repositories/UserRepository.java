package kg.syntaryska.financehabit.repositories;

import kg.syntaryska.financehabit.models.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
