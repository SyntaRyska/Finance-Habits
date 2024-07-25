package kg.syntaryska.financehabit.repositories;

import kg.syntaryska.financehabit.models.entities.BudgetEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BudgetRepository extends JpaRepository<BudgetEntity, Long> {
}
