package com.jk.controller;

import com.jk.model.BookBean;
import com.jk.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("BookController")
public class BookController {

    @Autowired
    private BookService   bookService;

      @RequestMapping("jumpBook")
        public  String   jumpBook(){
            return "book2";
        }

    @ResponseBody
    @RequestMapping("selectBookAll")
    public List<BookBean>  selectBookAll(){
        List<BookBean>  book=bookService.selectBookAll();
        return  book;
    }
}
