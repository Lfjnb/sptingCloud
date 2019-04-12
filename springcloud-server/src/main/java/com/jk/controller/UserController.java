package com.jk.controller;

import com.jk.dao.UserDao;
import com.jk.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Controller
@RequestMapping("UserController")
public class UserController {

    @Autowired
    private UserDao userDao;

    @Autowired
    private RedisTemplate redisTemplate;
        //baocunBook
        @ResponseBody
        @RequestMapping("baocunBook")
        public String baocunBook(@RequestBody BookBean bookBean) {
            userDao.baocunBook(bookBean);
            redisCr();
            return "1";
        }

    //selectBookById
    @ResponseBody
    @RequestMapping("selectBookById")
    public BookBean selectBookById(@RequestBody String id) {
        BookBean bookBean=userDao.selectBookById(id);
        return bookBean;
    }

    //deleteBook  删除图书
    @ResponseBody
    @RequestMapping("deleteBook")
    public String deleteBook(@RequestBody String id) {
        userDao.deleteBook(id);
        redisCr();
        return "1";
    }
    //addBook  新增图书
    @ResponseBody
    @RequestMapping("addBook")
    public String addBook(@RequestBody BookBean bookBean) {
         userDao.addBook(bookBean);
        redisCr();
        return "1";
    }

    //selectWrapUp  查询纸张
    @ResponseBody
    @RequestMapping("selectWrapUp")
    public List<PaperBean> selectWrapUp() {
        List<PaperBean> list = userDao.selectWrapUp();
        return list;
    }

    //查询出版设 selectHouse
    @ResponseBody
    @RequestMapping("selectHouse")
    public List<HouseBean> selectHouse() {
        List<HouseBean> list = userDao.selectHouse();
        return list;
    }

    //查询作者 selectAut
    @ResponseBody
    @RequestMapping("selectAut")
    public List<AuthorBean> selectAut() {
        List<AuthorBean> list = userDao.selectAut();
        return list;
    }

    //selectBookAll 查询图书
    @ResponseBody
    @RequestMapping("selectBookAll")
    public List<BookBean> selectBookAll() {
        List<BookBean> bookBean =new ArrayList<>();
        Boolean bookBean1 = redisTemplate.hasKey("bookBean");
        if (bookBean1) {
            bookBean = (List<BookBean>) redisTemplate.opsForValue().get("bookBean");
        }else{
            bookBean=userDao.selectBookAll();
        }
        redisTemplate.opsForValue().set("bookBean",bookBean,20 , TimeUnit.MINUTES);
        return bookBean;



    }

    //查询树
    @ResponseBody
    @RequestMapping("findTreeList")
    public List<TreeBean> findTreeList() {
        int id = 0;
        List<TreeBean> tree =new ArrayList<>();
        Boolean tree1 = redisTemplate.hasKey("tree");
        if (tree1) {
            tree = (List<TreeBean>) redisTemplate.opsForValue().get("tree");
        }else{
            tree=getTreeBeans(id);
        }
        redisTemplate.opsForValue().set("tree",tree,20 , TimeUnit.MINUTES);
        return tree;
    }
    private List<TreeBean> getTreeBeans(Integer id) {
        List<TreeBean> list = userDao.findTreeList(id);
        for (TreeBean treeBean : list) {
            Integer id1 = treeBean.getId();
            List<TreeBean> treeBeans = getTreeBeans(id1);
            if(treeBeans == null || treeBeans.size()<=0){
                treeBean.setSelectable(true);
            }else{
                treeBean.setSelectable(false);
                treeBean.setNodes(treeBeans);
            }
        }
        return list;
    }
    public  void  redisCr(){
        List<BookBean> bookBean =new ArrayList<>();
        Boolean bookBean1 = redisTemplate.hasKey("bookBean");
        if (bookBean1){
            Boolean bool = redisTemplate.delete("bookBean");
        }
        bookBean=userDao.selectBookAll();
        redisTemplate.opsForValue().set("bookBean",bookBean,20 , TimeUnit.MINUTES);
    }
//-------------------------------------------------------------------------------------------

    @ResponseBody
    @RequestMapping("selectUser")
    public User  selectUser(@RequestBody String userName){
        User user = new User();
        user.setUserId(1);
        user.setUserName(userName);
        return user;
    }
    @ResponseBody
    @RequestMapping("selectUserAll")
    public List<User>  selectUserAll(){
        List<User> user =new ArrayList<>();
        Boolean user1 = redisTemplate.hasKey("user");
        if (user1) {
            user = (List<User>) redisTemplate.opsForValue().get("user");
        }else{
            user=userDao.selectUserAll();
        }
        redisTemplate.opsForValue().set("user",user,20 , TimeUnit.MINUTES);
        return user;
    }

    @ResponseBody
    @RequestMapping("deleteUser")
    public String  deleteUser(@RequestBody String id){
        userDao.deleteUser(id);
        aaa();
        return  "1";
    }

    //addUser
    @ResponseBody
    @RequestMapping("addUser")
    public String  addUser(@RequestBody  User  user3){
        userDao.addUser(user3);
        aaa();
        return  "1";
    }
    //selectUserById
    @ResponseBody
    @RequestMapping("selectUserById")
    public User  selectUserById(@RequestBody  String  id){
        User user=userDao.selectUserById(id);
        return  user;
    }
    //baocunUser
    @ResponseBody
    @RequestMapping("baocunUser")
    public String  baocunUser(@RequestBody  User user){
        userDao.baocunUser(user);
        aaa();
        return  "1";
    }

    public  void  aaa(){
        List<User> user =new ArrayList<>();
        Boolean user1 = redisTemplate.hasKey("user");
        if (user1){
            Boolean user2 = redisTemplate.delete("user");
        }
        user=userDao.selectUserAll();
        redisTemplate.opsForValue().set("user",user,20 , TimeUnit.MINUTES);
    }
}
