package kg.syntaryska.financehabit.services.impl;

import jakarta.transaction.Transactional;
import kg.syntaryska.financehabit.models.dtos.ReportDto;
import kg.syntaryska.financehabit.models.entities.ReportEntity;
import kg.syntaryska.financehabit.repositories.ReportRepository;
import kg.syntaryska.financehabit.services.ReportService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ReportServiceImpl implements ReportService {

    private final ReportRepository reportRepository;
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    public ReportServiceImpl(ReportRepository reportRepository) {
        this.reportRepository = reportRepository;
    }

    @Override
    public ReportEntity createReport(ReportDto reportDto) {
        return null;
    }

    @Override
    public ReportEntity updateReport(Long id, ReportDto reportDto) {
        return null;
    }

    @Transactional
    @Override
    public void deleteReport(Long id) {
        logger.info("Удаление отчета с идентификатором: {}", id);
        reportRepository.deleteById(id);
    }

    @Override
    public ReportEntity getReportById(Long id) {
        return null;
    }

    @Override
    public List<ReportEntity> getAllReportsByUserId(Long userId) {
        return List.of();
    }

    @Override
    public ReportEntity generateReportForPeriod(Long userId, Date startDate, Date endDate) {
        return null;
    }

    @Override
    public Double calculateTotalIncomeForPeriod(Long userId, Date startDate, Date endDate) {
        return 0.0;
    }

    @Override
    public Double calculateTotalExpenseForPeriod(Long userId, Date startDate, Date endDate) {
        return 0.0;
    }

    @Override
    public Double calculateNetSavingsForPeriod(Long userId, Date startDate, Date endDate) {
        return 0.0;
    }

    @Override
    public List<ReportEntity> getReportsByFilter(Long userId, Date startDate, Date endDate) {
        return List.of();
    }
}
