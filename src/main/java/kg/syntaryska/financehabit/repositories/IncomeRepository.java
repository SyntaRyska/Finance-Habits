package kg.syntaryska.habit.repositories;

import kg.syntaryska.habit.models.entities.IncomeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncomeRepository extends JpaRepository<IncomeEntity, Long> {
}
