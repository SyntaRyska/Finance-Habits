package kg.syntaryska.habit.repositories;

import kg.syntaryska.habit.models.entities.ExpenseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<ExpenseEntity,Long> {
}
