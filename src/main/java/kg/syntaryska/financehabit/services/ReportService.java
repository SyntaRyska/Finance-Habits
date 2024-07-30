package kg.syntaryska.financehabit.services;

import kg.syntaryska.financehabit.models.dtos.ReportDto;
import kg.syntaryska.financehabit.models.entities.ReportEntity;

import java.util.Date;
import java.util.List;

public interface ReportService {

    ReportEntity createReport(ReportDto reportDto);

    ReportEntity updateReport(Long id, ReportDto reportDto);

    void deleteReport(Long id);

    ReportEntity getReportById(Long id);

    List<ReportEntity> getAllReportsByUserId(Long userId);

    ReportEntity generateReportForPeriod(Long userId, Date startDate, Date endDate);

    Double calculateTotalIncomeForPeriod(Long userId, Date startDate, Date endDate);

    Double calculateTotalExpenseForPeriod(Long userId, Date startDate, Date endDate);

    Double calculateNetSavingsForPeriod(Long userId, Date startDate, Date endDate);

    List<ReportEntity> getReportsByFilter(Long userId, Date startDate, Date endDate);
}
