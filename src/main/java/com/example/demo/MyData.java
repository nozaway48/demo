package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class MyData {
	
	
	@JsonProperty("Id")
	private int id;
	@JsonProperty("Name")
	private String name;
	@JsonProperty("Making_time")
	private String making_time;
	@JsonProperty("Serves")
	private String serves;
	@JsonProperty("Ingredients")
	private String ingredients;
	@JsonProperty("Cost")
	private int cost;
	@JsonProperty("Created_at")
	private String created_at;
	@JsonProperty("Updated_at")
	private String updated_at;
}
