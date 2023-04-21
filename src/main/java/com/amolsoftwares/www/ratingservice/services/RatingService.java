package com.amolsoftwares.www.ratingservice.services;

import com.amolsoftwares.www.ratingservice.entities.Rating;

import java.util.List;

public interface RatingService {

    //create
    Rating create(Rating rating);

    //getAllRating
    List<Rating> getAllRatings();

    //getAllByUserId
    List<Rating> getAllRatingsByUserId(String userId);

    //getAllByHotelId
    List<Rating> getAllRatingsByHotelId(String hotelId);
}
