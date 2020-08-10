/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;
import entities.TbAdmin;
import java.util.Date;
import java.util.List;
/**
 *
 * @author NK
 */
public interface  IAdmin {
    boolean checkLogin(String email, String pass);
    List<TbAdmin> findAll();
    boolean update(TbAdmin tbAdmin);
    boolean create(String id, String name, boolean gender, String email, 
            String phone, String password, String address, String role, 
            boolean status, Date insertat, Date updateat);
    boolean delete(String id);
    boolean search(String email, String address);
   
    boolean removewl(String id);
    boolean addwl(String id, String name, boolean type, Date insertat, Date updateat);
}
