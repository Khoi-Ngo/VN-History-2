package com.swp.vnhistory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swp.vnhistory.model.User;
import com.swp.vnhistory.model.ViewedEvent;

public interface IViewedEventRepo extends JpaRepository<ViewedEvent, Long> {
	List<ViewedEvent> findAllByUser(User user);

}
