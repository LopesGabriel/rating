package dev.glopes.awscodepipeline.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.glopes.awscodepipeline.models.Rating;
import dev.glopes.awscodepipeline.repositories.RatingRepository;

@Service
public class RatingService {

	@Autowired
	private RatingRepository repo;

	public Rating saveRating(Rating r) {
		return repo.save(r);
	}

	public Rating getRating(Integer id) {
		return repo.getById(id);
	}

	public List<Rating> listRating() {
		return repo.findAll();
	}

	public void deleteRating(Integer id) {
		repo.deleteById(id);
	}

}
