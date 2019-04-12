package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("PageController")
public class PageController {

    @RequestMapping("jumpamdshow")
    public  String  jumpamdshow(){
        return "cmdshow";
    }

    @RequestMapping("jumpamdadd")
    public  String  jumpamdadd(){
        return "add";
    }

    @RequestMapping("jumptree")
    public  String  jumptree(){
        return "tree";
    }

    @RequestMapping("jumpbook")
    public  String  jumpbook(){
        return "book";
    }
}
