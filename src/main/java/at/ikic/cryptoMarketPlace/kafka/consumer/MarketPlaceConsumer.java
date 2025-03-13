package at.ikic.cryptoMarketPlace.kafka.consumer;

import at.ikic.cryptoMarketPlace.constants.KafkaConstant;
import at.ikic.cryptoMarketPlace.entity.Order;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MarketPlaceConsumer {

    @KafkaListener(topics = KafkaConstant.MARKET_PLACE_TOPIC, groupId = KafkaConstant.CRYPTO_GROUP)
    public void consume(Order order)
    {
        System.out.println("ORDER CONSUMED " + order);

        
        /**
         * TODO process order;
         */
    }
}
