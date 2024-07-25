package kg.syntaryska.financehabit.repositories;

import kg.syntaryska.financehabit.models.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

     UserEntity findByUsername(String username);
}
