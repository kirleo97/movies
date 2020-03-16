package com.example.ratingsdataservice.resources;

import com.example.ratingsdataservice.models.Rating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsDataSource {

    @GetMapping("/{movieId}")
    public Rating getRaiting(@PathVariable("movieId") String movieId) {
        return new Rating(movieId, 4);
    }

    @GetMapping("users/{userId}")
    public List<Rating> getUserRatings(@PathVariable("userId") String userId) {
        List<Rating> ratingList = Arrays.asList(
                new Rating("1234", 4),
                new Rating("5678", 3)
        );
        return ratingList;
    }
}