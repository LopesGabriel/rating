package dev.glopes.awscodepipeline.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.glopes.awscodepipeline.models.Rating;

@Repository
public interface RatingRepository extends JpaRepository<Rating, Integer> {

}
