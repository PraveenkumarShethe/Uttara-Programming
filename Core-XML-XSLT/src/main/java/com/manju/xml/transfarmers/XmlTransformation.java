package com.manju.xml.transfarmers;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.BasicClientConnectionManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.CoreConnectionPNames;
import org.apache.http.params.HttpParams;


public class XmlTransformation {
	private   Transformer transformer;
	TransformerFactory factory = TransformerFactory.newInstance();	
	  public XmlTransformation() {
		// TODO Auto-generated constructor stub
		  try {
			transformer = factory.newTransformer();
		} catch (TransformerConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	  
	  public XmlTransformation(File xsltFile) {
		  
			
			  try {
				transformer = factory.newTransformer(new StreamSource(xsltFile));
			} catch (TransformerConfigurationException e) {
				e.printStackTrace();
			}
			
		}
	  
	  
	  public void transfer(File xmlFile)
	  {
		  try {
			transformer.transform(new StreamSource(xmlFile), new StreamResult(new File("//NEED-EXAMPLES//Core-XML-XSLT/src/main/resources/result-"+xmlFile.getName())));
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	  private  HttpClient client;
	  
		
		public InputStream getWSDL(String url)  {		
			
			HttpResponse resp = null;
			ClientConnectionManager manager = new BasicClientConnectionManager();
			HttpParams params = new BasicHttpParams();
			params.setParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, 1000);
			params.setParameter(CoreConnectionPNames.SO_TIMEOUT, 500);							
			client = new DefaultHttpClient(manager, params);	
			
			HttpGet get = new HttpGet(url);
			try {
				 resp  = client.execute(get);
				int statusCode = resp.getStatusLine().getStatusCode();
				if(statusCode != 200) throw new IllegalStateException("Failed to fetch wsdl from MAS, http response " + statusCode);
			}catch (Exception e) {
				// TODO: handle exception
			}
			try {
				return resp.getEntity().getContent();
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
			
	    }
	
		  public void transfer1(File xmlFile)
		  {
			  try {
				StreamSource source = new StreamSource(getWSDL("http://localhost:8080/m2m/subscriberws.wsdl"));
			//	StreamSource source = new StreamSource(xmlFile);
				transformer.transform(source, new StreamResult(System.out));
				//transfer(xmlFile);
			} catch (TransformerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }
		
		
	
	
	public static void main(String[] args) {
		
		
		
		XmlTransformation xmlTrn=new XmlTransformation(new File("D:/NEED-EXAMPLES/Core-XML-XSLT/src/main/resources/wsdl.xslt"));
		/*try {
			IOUtils.copy(xmlTrn.getWSDL("http://localhost:8080/mas/rest/subscriberws?wsdl"), new FileOutputStream("D:/NEED-EXAMPLES//Core-XML-XSLT/src/main/resources/subscriberws.xml"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		xmlTrn.transfer(new File("D:/NEED-EXAMPLES/Core-XML-XSLT/src/main/resources/subscriberws.xml"));
		
	}

}
