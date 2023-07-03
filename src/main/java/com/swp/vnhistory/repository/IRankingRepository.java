package com.swp.vnhistory.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.swp.vnhistory.model.Ranking;

//@Repository
public interface IRankingRepository extends JpaRepository<Ranking, Long> {

	// find all
	List<Ranking> findAll();

	// get by user id;
	Ranking findByUserUserId(long userId);

	// Find all rankings ordered by total score in descending order
	@Query("SELECT r FROM Ranking r ORDER BY r.total_score DESC")
	List<Ranking> findAllOrderByTotalScoreDesc();

}
