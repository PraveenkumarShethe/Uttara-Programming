package com.tecnomen.httpclient;

import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;

public class MapToJson {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		 JSONObject ss=new JSONObject(new MapToJson().reqParams);
		System.out.println(ss.toString());
		// TODO Auto-generated method stub

	}
	
	
	static  Map<String, String> reqParams=new HashMap<String, String>();
		public MapToJson()
		{
			reqParams.put("tecnomen.video", "false");
			reqParams.put("local.uri", "tel:678");
			reqParams.put("local.na", "4");
			reqParams.put("local.np", "0");
			reqParams.put("local.pi", "0");
			reqParams.put("remote.na", "4");
			reqParams.put("remote.np", "1");
			reqParams.put("remote.pi", "0");
			reqParams.put("remote.si", "3");
			reqParams.put("remote.uri", "tel:222222");
			reqParams.put("redirect[1].uri", "tel:411483");
			reqParams.put("redirect[1].na", "4");
			reqParams.put("redirect[1].np", "1");
			reqParams.put("redirect[1].pi", "0");
			reqParams.put("redirect[1].si", "3");
			reqParams.put("redirect[1].qi", "0");
			reqParams.put("redirect[1].reason", "4");
			reqParams.put("redirectinfo.reason", "6");
			reqParams.put("redirectinfo.indicator", "6");
			reqParams.put("redirectinfo.count", "1");
			reqParams.put("protocol.name", "SIP");
			
			
				
		}
		

}
