package com.keepthinker;

import java.util.ArrayList;
import java.util.Locale;

public class Capital {
	private String name;
	private int id;
	public Capital(){}
	public Capital(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
