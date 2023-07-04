package com.example.movieReview.models;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TrendingRepository extends JpaRepository<Trending,String> {

   public Trending findByMovieMovieId(String movieId);
    
    
}
