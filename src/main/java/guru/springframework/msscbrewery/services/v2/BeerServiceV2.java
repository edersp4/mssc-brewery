package guru.springframework.msscbrewery.services.v2;

import guru.springframework.msscbrewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

public interface BeerServiceV2 {
    BeerDtoV2 save(BeerDtoV2 beerDto);

    BeerDtoV2 getBeerById(UUID beerId);

    void update(UUID beerId, BeerDtoV2 beerDto);

    void delete(String beerId);
}
