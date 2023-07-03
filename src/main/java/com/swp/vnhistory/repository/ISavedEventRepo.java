package com.swp.vnhistory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swp.vnhistory.model.Event;
import com.swp.vnhistory.model.SavedEvent;
import com.swp.vnhistory.model.User;
import com.swp.vnhistory.model.ViewedEvent;

public interface ISavedEventRepo extends JpaRepository<SavedEvent, Long> {

	// find by user and eventid
	SavedEvent findByUserAndEvent(User user, Event event);

	// find all by user
	List<SavedEvent> findAllByUser(User user);

}
