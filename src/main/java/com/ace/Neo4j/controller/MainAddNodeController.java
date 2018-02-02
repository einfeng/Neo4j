package com.ace.Neo4j.controller;

import com.ace.Neo4j.bean.PropertiesBean;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

public class MainAddNodeController {

	@FXML
	private TextField main_left_addnode_label_name;
	@FXML
	private TableView<PropertiesBean> main_left_addnode_properties;
	@FXML
	private TableColumn<PropertiesBean, String> main_left_addnode_properties_name;
	@FXML
	private TableColumn<PropertiesBean, String> main_left_addnode_properties_value;
	@FXML
	private Button main_left_addnode_add_properties;
	@FXML
	private Button main_left_addnode_add_save;

	private ObservableList<PropertiesBean> PropertiesBeanData;

	public void init()
	{
		PropertiesBeanData = FXCollections.observableArrayList();
				
		main_left_addnode_properties_name.setCellValueFactory(new PropertyValueFactory<>("key"));
		main_left_addnode_properties_name.setCellFactory(TextFieldTableCell.<PropertiesBean>forTableColumn());

		main_left_addnode_properties_value.setCellValueFactory(new PropertyValueFactory<>("value"));
		main_left_addnode_properties_value.setCellFactory(TextFieldTableCell.<PropertiesBean>forTableColumn());

		main_left_addnode_properties.setItems(PropertiesBeanData);
	}
	
	@FXML
	public void addProperties() {
		PropertiesBeanData.add(new PropertiesBean("NULL", "NULL"));
	}

	public void saveKey(CellEditEvent<PropertiesBean, String> event) {
		((PropertiesBean) event.getTableView().getItems().get(event.getTablePosition().getRow()))
				.setKey(event.getNewValue());
	}

	public void saveValue(CellEditEvent<PropertiesBean, String> event) {
		((PropertiesBean) event.getTableView().getItems().get(event.getTablePosition().getRow()))
				.setValue(event.getNewValue());
	}

	public void saveNode() {
		for (PropertiesBean item : main_left_addnode_properties.getItems()) {
			System.out.println(item.getKey());
			System.out.println(item.getValue());
		}
	}

}
