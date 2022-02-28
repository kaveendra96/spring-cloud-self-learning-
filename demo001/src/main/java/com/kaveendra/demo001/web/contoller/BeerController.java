package com.kaveendra.demo001.web.contoller;

import com.kaveendra.demo001.services.BeerService;
import com.kaveendra.demo001.web.model.BeerDTO;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDTO> getBeer(@PathVariable("beerId") UUID beerId) {
        return new ResponseEntity<>(beerService.getBeerByID(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveBeer(@RequestBody BeerDTO beerDTO) {
        BeerDTO response = beerService.saveBeer(beerDTO);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/beer" + response.getId().toString());
        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @PutMapping({"/{beerId}"})
    public ResponseEntity updateBeer(@PathVariable UUID beerId, @RequestBody BeerDTO beerDTO) {
        BeerDTO response = beerService.updateBeer(beerId, beerDTO);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/beer" + response.getId().toString());
        return new ResponseEntity(headers, HttpStatus.CREATED);
    }
    @DeleteMapping({"/{beerId}"})
    public void deleteBeer(@PathVariable UUID beerId){
        beerService.deleteBeer(beerId);
    }

}
