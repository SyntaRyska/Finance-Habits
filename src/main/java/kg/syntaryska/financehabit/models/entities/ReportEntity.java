package kg.syntaryska.financehabit.models.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "reports")
public class ReportEntity extends BaseEntity {

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date startDate;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date endDate;

    @Column(nullable = false)
    private Double totalIncome;

    @Column(nullable = false)
    private Double totalExpense;

    @Column(nullable = false)
    private Double netSavings;

    public ReportEntity() {
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
