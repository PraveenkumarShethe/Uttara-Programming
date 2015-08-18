package com.aranin.weblog4j.client;

import com.aranin.weblog4j.services.BookShelfService;
import com.aranin.weblog4j.vo.BookVO;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * Created by IntelliJ IDEA.
 * User: Niraj Singh
 * Date: 5/1/12
 * Time: 10:24 AM
 * To change this template use File | Settings | File Templates.
 */
public class DemoClient {
    public static void main(String[] args){
        String serviceUrl = "http://localhost:8080/weblog4jdemo/bookshelfservice";
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(BookShelfService.class);
		factory.setAddress(serviceUrl);
		BookShelfService bookService = (BookShelfService) factory.create();

        //insert book
        BookVO bookVO = new BookVO();
        bookVO.setAuthor("Issac Asimov");
        bookVO.setBookName("Foundation and Earth");

        String result = bookService.insertBook(bookVO);

        System.out.println("result : " + result);

        bookVO = new BookVO();
        bookVO.setAuthor("Issac Asimov");
        bookVO.setBookName("Foundation and Empire");

        result = bookService.insertBook(bookVO);

        System.out.println("result : " + result);

        bookVO = new BookVO();
        bookVO.setAuthor("Arthur C Clarke");
        bookVO.setBookName("Rama Revealed");

        result = bookService.insertBook(bookVO);

        System.out.println("result : " + result);

        //retrieve book

        bookVO = bookService.getBook("Foundation and Earth");

        System.out.println("book name : " + bookVO.getBookName());
        System.out.println("book author : " + bookVO.getAuthor());

    }
}
