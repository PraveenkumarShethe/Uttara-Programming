package com.aranin.weblog4j.services;

import com.aranin.weblog4j.vo.BookVO;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by IntelliJ IDEA.
 * User: Niraj Singh
 * Date: 4/30/12
 * Time: 11:37 AM
 * To change this template use File | Settings | File Templates.
 */

@WebService
public interface BookShelfService {

    @WebMethod
    public  String insertBook(BookVO bookVO);
    @WebMethod
    public  BookVO getBook(String title);
}
