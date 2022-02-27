package com.kaveendra.demo001.services;

import com.kaveendra.demo001.web.model.BeerDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDTO getBeerByID(UUID beerId) {
        return BeerDTO.builder().id(UUID.randomUUID())
                .beerName("Ginger Blast").
                        beerStyle("GingerBlast")
                .build();
    }

    @Override
    public BeerDTO saveBeer(BeerDTO beerDTO) {
        beerDTO.setId(UUID.randomUUID());
        return beerDTO;
    }

    @Override
    public BeerDTO updateBeer(UUID beerID, BeerDTO beerDTO) {
        beerDTO.setId(UUID.randomUUID());
        return beerDTO;
    }

    @Override
    public void deleteBeer(UUID beerID) {
        log.info("Delete Beer");
    }
}
