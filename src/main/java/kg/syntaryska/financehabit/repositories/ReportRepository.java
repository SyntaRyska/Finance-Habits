package kg.syntaryska.financehabit.repositories;

import kg.syntaryska.financehabit.models.entities.ReportEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportRepository extends JpaRepository<ReportEntity,Long> {
}
