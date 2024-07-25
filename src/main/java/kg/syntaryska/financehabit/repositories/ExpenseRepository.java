package kg.syntaryska.financehabit.repositories;

import kg.syntaryska.financehabit.models.entities.ExpenseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends JpaRepository<ExpenseEntity,Long> {
}
