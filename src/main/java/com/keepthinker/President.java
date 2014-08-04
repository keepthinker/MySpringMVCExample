package com.keepthinker;

import org.springframework.beans.factory.annotation.Required;

public class President {
	private String name;
	public President(){
	}
	public President(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	@Required
	public void setName(String name) {
		this.name = name;
	}

}
