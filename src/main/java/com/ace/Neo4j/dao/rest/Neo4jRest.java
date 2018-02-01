package com.ace.Neo4j.dao.rest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.ace.Neo4j.common.HttpRequestUtil;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class Neo4jRest {

	public List<String> getLabels() throws JsonSyntaxException, IOException
	{
		List<String> labelList = new ArrayList<String>();
		String labels_json = HttpRequestUtil.getHttpRequest("/db/data/labels").toString();
		JsonArray labels_array = new JsonParser().parse(labels_json).getAsJsonArray();

		for(JsonElement label : labels_array)
		{
			labelList.add(label.getAsString());
		}
		
		return labelList;
	}
	
}
