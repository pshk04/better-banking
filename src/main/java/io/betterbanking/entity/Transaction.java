package io.betterbanking.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "transactions")
@Data
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer accountNumber;
    private String type;
    private Date date;
    private String currency;
    private double amount;
    private String merchantName;
    private String merchantLogo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return Objects.equals(type, that.type) &&
                Objects.equals(date, that.date) &&
                Objects.equals(accountNumber, that.accountNumber)
                && Objects.equals(currency, that.currency)
                && Objects.equals(amount, that.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, date, accountNumber, currency, amount);
    }
}
