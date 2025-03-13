package at.ikic.cryptoMarketPlace.entity;

import at.ikic.cryptoMarketPlace.enums.TransactionStatus;
import at.ikic.cryptoMarketPlace.enums.TransactionType;
import jakarta.persistence.*;
import lombok.Data;
import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name="orders")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private UUID userId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "coin_id")
    private Coin coin;

    private TransactionType type;

    private int quantity;

    private double price;

    private TransactionStatus status;

    private Instant date;
}
