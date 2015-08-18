package com.aranin.weblog4j.services;

import com.aranin.weblog4j.hashdb.HashDB;
import com.aranin.weblog4j.vo.BookVO;

import javax.jws.WebService;

/**
 * Created by IntelliJ IDEA.
 * User: Niraj Singh
 * Date: 4/30/12
 * Time: 12:38 PM
 * To change this template use File | Settings | File Templates.
 */
@WebService(endpointInterface = "com.aranin.weblog4j.services.BookShelfService",
		serviceName="bookShelfService")
public class BookShelfServiceImpl implements BookShelfService {
    public String insertBook(BookVO bookVO) {
        HashDB.insertBook(bookVO);
        return "Book with name : " + bookVO.getBookName() + " is now available on the shelf";  //To change body of implemented methods use File | Settings | File Templates.
    }

    public BookVO getBook(String title) {

        return HashDB.getBook(title);  //To change body of implemented methods use File | Settings | File Templates.
    }
}
