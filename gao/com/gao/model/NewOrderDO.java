package com.gao.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;
@Alias("NEWorder")
public class NewOrderDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6044010937929332469L;

	private Long id;

	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
