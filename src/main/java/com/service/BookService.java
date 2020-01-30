package com.service;

import com.pojo.Books;
import java.util.List;

public interface BookService {
    //增加一本书
    int addBook(Books books);
    //删除一本书
    int deleteBookById(int bookId);
    //更新一本书
    int updateBook(Books books);
    //查询一本书
    Books queryBookById(int bookId);
    //查询全部的书
    List<Books> queryAllBook();
}
