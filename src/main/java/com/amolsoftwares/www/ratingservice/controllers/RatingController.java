package com.amolsoftwares.www.ratingservice.controllers;

import com.amolsoftwares.www.ratingservice.entities.Rating;
import com.amolsoftwares.www.ratingservice.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    //create
    @PostMapping()
    public ResponseEntity<Rating> createRating(@RequestBody Rating rating){
        return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.create(rating));
    }

    //getAll
    @GetMapping()
    public ResponseEntity<List<Rating>> getAllRatings(){
        return ResponseEntity.ok().body(ratingService.getAllRatings());
    }

    //getByUserId
    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Rating>> getAllRatingsByUserId(@PathVariable String userId){
        return ResponseEntity.ok().body(ratingService.getAllRatingsByUserId(userId));
    }

    //getByHotelId
    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Rating>> getAllRatingsByHotelId(@PathVariable String hotelId){
        return ResponseEntity.ok().body(ratingService.getAllRatingsByHotelId(hotelId));
    }
}
