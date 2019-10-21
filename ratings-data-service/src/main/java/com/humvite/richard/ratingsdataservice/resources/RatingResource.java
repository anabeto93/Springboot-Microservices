package com.humvite.richard.ratingsdataservice.resources;

import com.humvite.richard.ratingsdataservice.models.Rating;
import com.humvite.richard.ratingsdataservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingResource {

    @RequestMapping("/{movieId}")
    public Rating getMovieRating(@PathVariable("movieId") String movieId) {
        return new Rating(movieId, 4);
    }

    @RequestMapping("users/{userId}")
    public UserRating getRating(@PathVariable("userId") String userId) {
        List<Rating> ratings = Arrays.asList(
                new Rating("1234", 4),
                new Rating("5678", 3)
        );

        UserRating userRating = new UserRating();
        userRating.setUserRating(ratings);
        return userRating;
    }

//    @RequestMapping("/users/{userId}")
//    public UserRating getUserRatings(@PathVariable("userId") String userId) {
//        UserRating userRating = new UserRating();
//        userRating.initData(userId);
//        return userRating;
//
//    }
}
