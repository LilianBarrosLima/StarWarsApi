package com.apiStarwars.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "FILMS")
public class Films implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "episode_id")
	private Integer episode_id;
	
	@Column(name = "film")
	private String film;
	
	@Column(name = "opening_crawl")
	private String opening_crawl;	
	
	@Column(name = "director")
	private String director;
	
	@Column(name = "producer")
	private String producer;
	
	@Column(name = "release_date")
	private Date release_date;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT")
	@Column(name = "created")
	private Date created;
	
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT")
	@Column(name = "edited")
	private Date edited;
}
