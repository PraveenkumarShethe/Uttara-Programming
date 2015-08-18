package com.tecnomen.httpclient;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.sf.json.JSONObject;

import org.apache.commons.httpclient.NameValuePair;

public class LoginLoadTestParams extends LoadTest{

	private String sigInfoJson = "{}";

	private List<NameValuePair> reqParams;

	public String getSigInfoJson() {
		return sigInfoJson;
	}

	public void setSigInfoJson(String sigInfoJson) {
		this.sigInfoJson = sigInfoJson;
		this.setReqParams(addSigParamTpHttpRequest(sigInfoJson));
	}

	public List<NameValuePair> addSigParamTpHttpRequest(String sigInfoJson) {
		JSONObject sigObj = new JSONObject(sigInfoJson);
		Iterator<String> keys = sigObj.keys();
		List<NameValuePair> nvps = new ArrayList<NameValuePair>();
		while (keys.hasNext()) {
			String key = keys.next();
			nvps.add(new NameValuePair(key, sigObj.optString(key, "")));

		}

		return nvps;
	}

	public List<NameValuePair> getReqParams() {
		return reqParams;
	}

	public void setReqParams(List<NameValuePair> reqParams) {
		this.reqParams = reqParams;
	}

}
