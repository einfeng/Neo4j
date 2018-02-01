package com.ace.Neo4j.bean;

import javafx.beans.property.SimpleStringProperty;

public class PropertiesBean {

	private SimpleStringProperty key;
	private SimpleStringProperty value;
	
	public PropertiesBean(String key, String value) {
		this.key = new SimpleStringProperty(key);
		this.value = new SimpleStringProperty(value);
	}
	
	public SimpleStringProperty getKey() {
		return key;
	}
	public void setKey(SimpleStringProperty key) {
		this.key = key;
	}
	public SimpleStringProperty getValue() {
		return value;
	}
	public void setValue(SimpleStringProperty value) {
		this.value = value;
	}
}
