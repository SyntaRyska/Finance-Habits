package kg.syntaryska.financehabit.repositories;

import kg.syntaryska.financehabit.models.entities.IncomeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncomeRepository extends JpaRepository<IncomeEntity, Long> {
}
