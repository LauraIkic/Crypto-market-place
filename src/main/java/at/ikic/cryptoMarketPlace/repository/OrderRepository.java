package at.ikic.cryptoMarketPlace.repository;

import at.ikic.cryptoMarketPlace.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface OrderRepository extends JpaRepository <Order, UUID>{

}
