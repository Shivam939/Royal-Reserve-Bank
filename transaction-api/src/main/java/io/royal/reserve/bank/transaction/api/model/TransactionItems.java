package io.royal.reserve.bank.transaction.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Represents a transaction item.
 */
@Entity
@Table(name = "t_transaction_items")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TransactionItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String assetCode;
    private String assetName;
    private int value;
}
