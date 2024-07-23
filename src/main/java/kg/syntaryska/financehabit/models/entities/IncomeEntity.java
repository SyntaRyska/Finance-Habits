package kg.syntaryska.financehabit.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.util.Date;

public class IncomeEntity {

    private Long userId;

    @Column(nullable = false)
    private Double amount;

    @Column(nullable = false)
    private String source;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date date;

    public IncomeEntity() {
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
