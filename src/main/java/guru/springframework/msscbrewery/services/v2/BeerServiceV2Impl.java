package guru.springframework.msscbrewery.services.v2;

import guru.springframework.msscbrewery.web.model.v2.BeerDtoV2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDtoV2 save(BeerDtoV2 beerDto) {
        return null;
    }

    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return null;
    }

    @Override
    public void update(UUID beerId, BeerDtoV2 beerDto) {

    }

    @Override
    public void delete(String beerId) {

    }
}
