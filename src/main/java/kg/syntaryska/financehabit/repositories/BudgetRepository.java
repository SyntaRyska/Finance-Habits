package kg.syntaryska.financehabit.repositories;

import kg.syntaryska.financehabit.models.entities.BudgetEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetRepository extends JpaRepository<BudgetEntity, Long> {
}
