package kg.syntaryska.habit.repositories;

import kg.syntaryska.habit.models.entities.BudgetEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetRepository extends JpaRepository<BudgetEntity, Long> {
}
