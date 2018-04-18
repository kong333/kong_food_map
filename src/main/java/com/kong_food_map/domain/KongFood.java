package com.kong_food_map.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class KongFood {
	
	@Id
	@GeneratedValue
	private int kong_id;
	
	private String kong_title;
	private String kong_addr;
	private float lat;
	private float lng;
	private String kong_type;
	private String del_yn;
}
