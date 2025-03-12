package com.nt.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

import lombok.AllArgsConstructor;

@Data 
@NoArgsConstructor
@AllArgsConstructor
public class ActorInfo implements Serializable {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private Integer actorid;
 private String actorname;
 private String actorAddrs;
}
