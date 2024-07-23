package kg.syntaryska.financehabit.repositories;

import kg.syntaryska.financehabit.models.entities.IncomeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncomeRepository extends JpaRepository<IncomeEntity, Long> {
}
