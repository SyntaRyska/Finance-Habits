package kg.syntaryska.financehabit.models.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "budgets")
public class BudgetEntity extends BaseEntity {

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private Double budgetLimit;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date startDate;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date endDate;

    public BudgetEntity() {
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Double getLimit() {
        return budgetLimit;
    }

    public void setLimit(Double limit) {
        this.budgetLimit = limit;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
}
