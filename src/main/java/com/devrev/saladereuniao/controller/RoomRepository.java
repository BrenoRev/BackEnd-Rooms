package com.devrev.saladereuniao.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devrev.saladereuniao.model.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long>{
	
}
