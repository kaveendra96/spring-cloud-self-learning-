package com.kaveendra.demo001.services;

import com.kaveendra.demo001.web.model.BeerDTO;

import java.util.UUID;

public interface BeerService {
    BeerDTO getBeerByID(UUID beerId);

    BeerDTO saveBeer(BeerDTO beerDTO);

    BeerDTO updateBeer(UUID beerID, BeerDTO beerDTO);

    void deleteBeer(UUID beerID);
}
