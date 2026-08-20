package io.betterbanking.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
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
}
