package kg.syntaryska.financehabit.models.dtos;

import java.util.Date;

/**
 * Data Transfer Object for Report.
 */
public class ReportDto {

    private Date startDate;

    private Date endDate;

    private Double totalIncome;

    private Double totalExpense;

    private Double netSavings;

    public ReportDto() {
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Double getNetSavings() {
        return netSavings;
    }

    public void setNetSavings(Double netSavings) {
        this.netSavings = netSavings;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Double getTotalExpense() {
        return totalExpense;
    }

    public void setTotalExpense(Double totalExpense) {
        this.totalExpense = totalExpense;
    }

    public Double getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(Double totalIncome) {
        this.totalIncome = totalIncome;
    }
}

