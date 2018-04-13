package com.kong_food_map.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnDefault;

import lombok.Data;

@Entity
@Data
public class Member {
	
	@Id
	@GeneratedValue
	int id;
	String email;
	String password;
	
	@ColumnDefault("'N'")
	String del_yn;

}
