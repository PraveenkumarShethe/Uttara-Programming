package com.aranin.weblog4j.client;


import com.aranin.weblog4j.vo.BookVO;
import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;

import java.net.URLEncoder;

/**
 * Created by IntelliJ IDEA.
 * User: Niraj Singh
 * Date: 3/13/13
 * Time: 4:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class DemoRestClient {
    public static void main(String[] args){
        DemoRestClient restClient = new DemoRestClient();
        try {
            //restClient.addBook("Naked Sun", "Issac Asimov");
            restClient.getBook("Naked Sun");
        } catch (Exception e) {
            e.printStackTrace(); //To change body of catch statement use File | Settings | File Templates.
        }

    }

    public BookVO getBook(String bookName) throws Exception {

        String output = null;
        try{
            String url = "http://localhost:8080/weblog4jdemo/bookservice/getbook/";

            url = url + URLEncoder.encode(bookName, "UTF-8");

            HttpClient client = new HttpClient();
            PostMethod mPost = new PostMethod(url);
            client.executeMethod( mPost );
            Header mtHeader = new Header();
            mtHeader.setName("content-type");
            mtHeader.setValue("application/x-www-form-urlencoded");
            mtHeader.setName("accept");
            mtHeader.setValue("application/xml");
            mPost.addRequestHeader(mtHeader);
            client.executeMethod(mPost);
            output = mPost.getResponseBodyAsString( );
            mPost.releaseConnection( );
            System.out.println("out : " + output);
        }catch(Exception e){
            throw new Exception("Exception in retriving group page info : " + e);
        }
        return null;
    }

    public void addBook(String bookName, String author) throws Exception {

        String output = null;
        try{
            String url = "http://localhost:8080/weblog4jdemo/bookservice/addbook";
            HttpClient client = new HttpClient();
            PostMethod mPost = new PostMethod(url);
            mPost.addParameter("name", "Naked Sun");
            mPost.addParameter("author", "Issac Asimov");
            Header mtHeader = new Header();
            mtHeader.setName("content-type");
            mtHeader.setValue("application/x-www-form-urlencoded");
            mtHeader.setName("accept");
            mtHeader.setValue("application/xml");
            //mtHeader.setValue("application/json");
            mPost.addRequestHeader(mtHeader);
            client.executeMethod(mPost);
            output = mPost.getResponseBodyAsString( );
            mPost.releaseConnection( );
            System.out.println("output : " + output);
        }catch(Exception e){
        throw new Exception("Exception in adding bucket : " + e);
        }

    }

}
