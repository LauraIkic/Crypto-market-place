package at.ikic.cryptoMarketPlace.kafka.consumer;

import at.ikic.cryptoMarketPlace.constants.KafkaConstant;
import at.ikic.cryptoMarketPlace.entity.Order;
import at.ikic.cryptoMarketPlace.service.MarketPlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderRequestConsumer {

    @Autowired
    private MarketPlaceService marketPlaceService;


    @KafkaListener(topics = KafkaConstant.ORDER_TOPIC, groupId = KafkaConstant.CRYPTO_GROUP)
    public void consume(Order order) {
        marketPlaceService.addOrderToMarketPlace(order);
        System.out.println("HEUREKA NEU 8");
    }
}
