package com.ace.Neo4j.bean;

import javafx.beans.property.SimpleStringProperty;

public class LabelBean {

	private SimpleStringProperty labelName;
	private PropertiesBean properties;
	
	public LabelBean(String labelName, PropertiesBean properties) {
		this.labelName = new SimpleStringProperty(labelName);
		this.properties = properties;
	}
	
	public SimpleStringProperty getLabelName() {
		return labelName;
	}
	public void setLabelName(SimpleStringProperty labelName) {
		this.labelName = labelName;
	}
	public PropertiesBean getProperties() {
		return properties;
	}
	public void setProperties(PropertiesBean properties) {
		this.properties = properties;
	}
	
}
