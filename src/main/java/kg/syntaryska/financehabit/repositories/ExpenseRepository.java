package kg.syntaryska.financehabit.repositories;

import kg.syntaryska.financehabit.models.entities.ExpenseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<ExpenseEntity,Long> {
}
