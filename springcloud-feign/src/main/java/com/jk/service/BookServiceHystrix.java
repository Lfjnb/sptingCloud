package com.jk.service;

import com.jk.model.BookBean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component //添加注解@Compent 将熔断器类注入spring容器中
public class BookServiceHystrix implements BookService {


    @Override
    public List<BookBean> selectBookAll() {
        List<BookBean> objects = new ArrayList<>();
        BookBean  bookBean=new BookBean();
        bookBean.setBookAuthorName("网络不稳定");
        objects.add(bookBean);
        jumpexcut(objects);
        return objects;
    }

    public   String  jumpexcut(List<BookBean> list){
        BookBean bookBean = list.get(0);
        String bookAuthorName = bookBean.getBookAuthorName();
        return bookAuthorName;
    }
}
