package com.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojo.Books;
import com.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class BookController {
    //controller调service层
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    //查询全部的书籍并返回到书籍展示页面
    @RequestMapping("/book/allBook")
    @ResponseBody//不会经过视图解析器，直接给前端返回一个字符串
    public String list(Model model) throws JsonProcessingException {
        List<Books> list = bookService.queryAllBook();
        ObjectMapper mapper = new ObjectMapper();
        String listStr = mapper.writeValueAsString(list);
        System.out.println(listStr);
        return listStr;
    }
}
