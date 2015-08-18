package com.aranin.weblog4j.hashdb;

import com.aranin.weblog4j.vo.BookVO;

import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * User: Niraj Singh
 * Date: 4/30/12
 * Time: 12:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class HashDB {
    public static HashMap<String, BookVO> bookDB = new HashMap<String, BookVO>();
    public static int counter = 0;
    public static void insertBook(BookVO bookVO){
        if(HashDB.bookDB.size() > 10000){
             HashDB.bookDB.clear();
             counter++;
        }
        HashDB.bookDB.put(bookVO.getBookName(), bookVO);
    }

    public static BookVO getBook(String bookName){
        return HashDB.bookDB.get(bookName);
    }

}
