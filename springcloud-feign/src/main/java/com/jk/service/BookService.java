package com.jk.service;

import com.jk.model.BookBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "springcloud-server", fallback = BookServiceHystrix.class)
public interface BookService {


    @RequestMapping("UserController/selectBookAll")
    public List<BookBean> selectBookAll();
}
