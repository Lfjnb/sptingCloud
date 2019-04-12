package com.jk.controller;

import com.jk.model.BookBean;
import com.jk.model.TreeBean;
import com.jk.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Controller
@RequestMapping("UserController")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;




    //查询树
    @RequestMapping("findTreeList")
    @ResponseBody
    public String findTreeList() {
        String list = restTemplate.getForObject("http://SPRINGCLOUD-SERVER/UserController/findTreeList",String.class);
        return list;
    }
    //查询图书
    @RequestMapping("selectBookAll")
    @ResponseBody
    public String selectBookAll() {
        String list = restTemplate.getForObject("http://SPRINGCLOUD-SERVER/UserController/selectBookAll",String.class);
        return list;
    }
   //selectAut  查询作者
   @RequestMapping("selectAut")
   @ResponseBody
   public String selectAut() {
       String list = restTemplate.getForObject("http://SPRINGCLOUD-SERVER/UserController/selectAut",String.class);
       return list;
   }
   //selectHouse  查询c出版设
   @RequestMapping("selectHouse")
   @ResponseBody
   public String selectHouse() {
       String list = restTemplate.getForObject("http://SPRINGCLOUD-SERVER/UserController/selectHouse",String.class);
       return list;
   }
   //selectWrapUp  查询c出版设
   @RequestMapping("selectWrapUp")
   @ResponseBody
   public String selectWrapUp() {
       String list = restTemplate.getForObject("http://SPRINGCLOUD-SERVER/UserController/selectWrapUp",String.class);
       return list;
   }

   //addBook  新增图书
   @RequestMapping("addBook")
   @ResponseBody
   public String addBook(BookBean bookBean) {
       String s = restTemplate.postForObject("http://SPRINGCLOUD-SERVER/UserController/addBook",bookBean, String.class);
       return s;
   }
   //deleteBook 删除图书
   @RequestMapping("deleteBook")
   @ResponseBody
   public String deleteBook(String id) {
       String s = restTemplate.postForObject("http://SPRINGCLOUD-SERVER/UserController/deleteBook",id, String.class);
       return s;
   }
   //selectBookById 根据id查询回显
   @RequestMapping("selectBookById")
   @ResponseBody
   public BookBean selectBookById(String id) {
       BookBean  bookBean= restTemplate.postForObject("http://SPRINGCLOUD-SERVER/UserController/selectBookById",id, BookBean.class);
       return bookBean;
   }

   //selectBookById 根据id查询回显
   @RequestMapping("baocunBook")
   @ResponseBody
   public String baocunBook(BookBean bookBean) {
       restTemplate.postForObject("http://SPRINGCLOUD-SERVER/UserController/baocunBook",bookBean, String.class);
       return "1";
   }


//---------------------------------------------------------------------------------------------------------




    @RequestMapping("selectUser")
    @ResponseBody
    public User  selectUser(String userName){
        User  user=restTemplate.postForObject("http://SPRINGCLOUD-SERVER/UserController/selectUser",userName,User.class);
        return user;
    }


    @RequestMapping("selectUserAll")
    @ResponseBody
    public String  selectUserAll(){
       String  user=restTemplate.getForObject("http://SPRINGCLOUD-SERVER/UserController/selectUserAll",String.class);
        return user;
    }
    //deleteUser
    @RequestMapping("deleteUser")
    @ResponseBody
    public String  deleteUser(String  id){
        String s = restTemplate.postForObject("http://SPRINGCLOUD-SERVER/UserController/deleteUser",id, String.class);
        return s;
    }
//addUser
@RequestMapping("addUser")
@ResponseBody
public String  addUser(User   user){
    String s = restTemplate.postForObject("http://SPRINGCLOUD-SERVER/UserController/addUser",user, String.class);
    return s;
}
//selectUserById

    @RequestMapping("selectUserById")
    @ResponseBody
    public User  selectUserById(String  id){
        User  user=restTemplate.postForObject("http://SPRINGCLOUD-SERVER/UserController/selectUserById",id, User.class);
        return user;
    }

    //baocunUser
    @RequestMapping("baocunUser")
    @ResponseBody
    public String  baocunUser(User   user){
        String s = restTemplate.postForObject("http://SPRINGCLOUD-SERVER/UserController/baocunUser",user, String.class);
        return s;
    }
}

