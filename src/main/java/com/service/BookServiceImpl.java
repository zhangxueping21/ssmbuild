package com.service;

import com.dao.BookMapper;
import com.pojo.Books;

import java.util.List;

public class BookServiceImpl implements BookService {
    //service调dao层
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBookById(int bookId) {
        return bookMapper.deleteBookById(bookId);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int bookId) {
        return bookMapper.queryBookById(bookId);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
