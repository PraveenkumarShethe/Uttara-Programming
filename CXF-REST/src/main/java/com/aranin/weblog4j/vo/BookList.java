package com.aranin.weblog4j.vo;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Niraj Singh
 * Date: 3/13/13
 * Time: 3:53 PM
 * To change this template use File | Settings | File Templates.
 */
@XmlRootElement(name="BookList")
public class BookList {
    private List<BookVO> bookList;

    public List<BookVO> getBookList() {
        if(bookList == null){
        bookList = new ArrayList<BookVO>();
        }
        return bookList;
    }

    public void setBookList(List<BookVO> bookList) {
        this.bookList = bookList;
    }
}
