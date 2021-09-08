package com.devrev.saladereuniao.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="meetingroom")
@Data
public class Room implements Serializable{
	private static final long serialVersionUID = 1L;
	
	public Room() {
		
	}
	
	public Room(Long id, String name, String date, String startHour, String endHour) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.startHour = startHour;
		this.endHour = endHour;
	}

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Long id;

	@Column(name="name", nullable = false)
	private String name;
	
	@Column(name="date", nullable = false)
	private String date;
	
	@Column(name="startHour", nullable = false)
	private String startHour;
	
	@Column(name="endHour", nullable = false)
	private String endHour;
 	
}
