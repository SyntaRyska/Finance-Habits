package kg.syntaryska.habit.repositories;

import kg.syntaryska.habit.models.entities.ReportEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportRepository extends JpaRepository<ReportEntity,Long> {
}
