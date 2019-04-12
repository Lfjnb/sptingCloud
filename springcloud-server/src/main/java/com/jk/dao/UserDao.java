package com.jk.dao;

import com.jk.model.*;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserDao {

    @Select("select t.id  userId,t.`name` userName  from  t_user_dubbo t")
    List<User> selectUserAll();

    @Delete("DELETE from  t_user_dubbo  where  id=#{value}")
    void deleteUser(String  id);

    @Insert("INSERT INTO  t_user_dubbo (`name`)values(#{userName})")
    void addUser(User user);

    @Select("SELECT t.id userId,t.`name` userName from  t_user_dubbo t  where t.id=#{value}")
    User selectUserById(String id);

    @Update("UPDATE  t_user_dubbo  set  `name`=#{userName}  where id=#{userId}")
    void baocunUser(User user);

    @Select("select t.ids id,t.pid,t.texts  text,t.url  from  t_tree t where t.pid=#{value}")
    List<TreeBean> findTreeList(Integer id);


    List<BookBean> selectBookAll();

    @Select("select t.autId autId,t.autName autName from t_author t")
    List<AuthorBean> selectAut();

    @Select("select t.houseId  houseId,t.houseName houseName from t_house t")
    List<HouseBean> selectHouse();

    @Select("select t.paperId  paperId,t.paperName paperName from t_paper t")
    List<PaperBean> selectWrapUp();

    void addBook(BookBean bookBean);

    @Select("delete  from  t_book  where bookISBN=#{value}")
    void deleteBook(String id);

    BookBean selectBookById(String id);

    void baocunBook(BookBean bookBean);
}
