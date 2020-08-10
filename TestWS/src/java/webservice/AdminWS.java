/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservice;

import bean.AdminDAO;
import entities.TbAdmin;
import java.util.Date;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author NK
 */
@WebService(serviceName = "AdminWS")
public class AdminWS {

    AdminDAO dao = new AdminDAO();

    @WebMethod(operationName = "findAll")
    public List<TbAdmin> findAll() {
        return dao.findAll();
    }

    @WebMethod(operationName = "checkLogin")
    public boolean checkLogin(@WebParam(name = "email") String email,
            @WebParam(name = "pass") String pass) {
        return dao.checkLogin(email, pass);
    }

    @WebMethod(operationName = "update")
    public boolean update(TbAdmin tbAdmin) {
        return dao.update(tbAdmin);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "create3")
    public boolean create3(@WebParam(name = "id") String id,
            @WebParam(name = "name") String name,
            @WebParam(name = "gender") boolean gender,
            @WebParam(name = "email") String email,
            @WebParam(name = "phone") String phone,
            @WebParam(name = "password") String password,
            @WebParam(name = "address") String address, @WebParam(name = "role") String role,
            @WebParam(name = "status") boolean status,
            @WebParam(name = "insertat") java.util.Date insertat,
            @WebParam(name = "updateat") java.util.Date updateat) {
        //TODO write your implementation code here:
        return dao.create(id, name, gender, email, phone, password, address, role, status, insertat, updateat);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "delete")
    public boolean delete(@WebParam(name = "id") String id) {
        //TODO write your implementation code here:
        return dao.delete(id);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "search")
    public boolean search(@WebParam(name = "email") String email,
            @WebParam(name = "address") String address) {
        //TODO write your implementation code here:
        return dao.search(email, address);
    }

      @WebMethod(operationName = "addwl")
    public boolean addwl(@WebParam(name = "id") String id,
            @WebParam(name = "name") String name,
            @WebParam(name = "type") boolean type,
            @WebParam(name = "insertat") java.util.Date insertat,
            @WebParam(name = "updateat") java.util.Date updateat) {
        //TODO write your implementation code here:
        return dao.addwl(id, name, type, insertat, updateat);

    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "removewl")
    public boolean removewl(@WebParam(name = "id") String id) {
        //TODO write your implementation code here:
        return dao.removewl(id);
    }
}

    
    
    
    
    
    
    


