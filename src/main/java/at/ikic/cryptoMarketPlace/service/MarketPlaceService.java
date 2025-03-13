package at.ikic.cryptoMarketPlace.service;

import at.ikic.cryptoMarketPlace.entity.Marketplace;
import at.ikic.cryptoMarketPlace.repository.MarketPlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MarketPlaceService {

    @Autowired
    private MarketPlaceRepository marketplaceRepository;

    public Marketplace getOrCreateMarketplace() {
        Optional<Marketplace> marketplace = marketplaceRepository.findFirstByOrderByIdAsc();

        if (marketplace.isPresent()) {
            return marketplace.get();
        } else {
            Marketplace newMarketplace = new Marketplace();
            return marketplaceRepository.save(newMarketplace);
        }
    }
}
