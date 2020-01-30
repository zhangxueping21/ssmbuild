package com.dao;

import com.pojo.Books;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface BookMapper {
    //增加一本书
    int addBook(Books books);
    //删除一本书
    int deleteBookById(@Param("bookId") int bookId);
    //更新一本书
    int updateBook(Books books);
    //查询一本书
    Books queryBookById(@Param("bookId") int bookId);
    //查询全部的书
    List<Books> queryAllBook();
}
