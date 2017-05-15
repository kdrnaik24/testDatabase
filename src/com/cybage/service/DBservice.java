package com.cybage.service;

import java.io.IOException;
import java.util.ArrayList;

import com.cybage.dao.DBDao;

import com.cybage.dto.IssueDetails;
import com.cybage.dto.IssueWrapper;
import com.cybage.model.DBModel;
import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

public class DBservice 
{
	public void getAllIssues(String uname, String upass, String uprojectId) throws IOException 
	{ 
		
		OkHttpClient client = new OkHttpClient();
		
		Request request = new Request.Builder()
				  .url("http://172.27.59.128:8095/rest/api/2/issue/picker")
				  .get()
				  .addHeader("authorization", "Basic eW9naXRhZG86eW9naXRh")
				  .build();
		Response response = client.newCall(request).execute();
		String data = (response.body().string());
		//System.out.println(data);
		
		IssueWrapper issuewrapper = new IssueWrapper();
		Gson gson = new Gson();
		issuewrapper = gson.fromJson(data, IssueWrapper.class); 
		
		ArrayList<String> templist= new ArrayList<String>();
		//ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < issuewrapper.getSections().get(0).getIssues().size(); i++) 
		{
			String str=issuewrapper.getSections().get(0).getIssues().get(i).getKey();
			if(str.startsWith(uprojectId))
			{
				templist.add(str);
				System.out.println(str);
			}		
		}
		
		OkHttpClient client1 = new OkHttpClient();
		IssueDetails issuesinfo = new IssueDetails();
		for( int j = 0; j < templist.size(); j++)
		{
			Request request2 = new Request.Builder()
					.url("http://172.27.59.128:8095/rest/api/2/issue/"+templist.get(j)).get()
					.addHeader("authorization", "Basic eW9naXRhZG86eW9naXRh").build();
			Response response1 = client1.newCall(request2).execute();
		
			String data1 = (response1.body().string());
	
			Gson gson1 = new Gson();
			issuesinfo = gson1.fromJson(data1, IssueDetails.class);
			
			DBModel dbmodel = new DBModel();
			dbmodel.setKeyid(issuesinfo.getKey());
			dbmodel.setAssignee(issuesinfo.getFields().getAssignee().getName());
			dbmodel.setFixversion(issuesinfo.getFields().getFixVersions().get(0).getName());
			System.out.println(dbmodel);
			
			 DBDao dbdao = new DBDao();
			 dbdao.addIssueDetails(dbmodel);
			
		}
		
		
	}
	
}
