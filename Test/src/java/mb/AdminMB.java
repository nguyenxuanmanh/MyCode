/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mb;


import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.xml.ws.WebServiceRef;
import webservice.TbAdmin;
import webservice.AdminWS_Service;

/**
 *
 * @author NK
 */
@ManagedBean
@SessionScoped
public class AdminMB {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/TestWS/AdminWS.wsdl")
    private webservice.AdminWS_Service service;
    
   
    private String AdminID;
    private String AdminName;
    
    private String Email;
    private String Phone;
    private String Password;
    private String Address;
    
    private String Role;
    private boolean Status;
    private boolean Gender;
    private Date InsertAt;
    private Date UpdateAt;
    
    private TbAdmin currUpdate = null;
   
    
    private String WLID;
    private String UserName;
    private boolean Type;
    
    
    public AdminWS_Service getService() {
        return service;
    }

    public void setService(AdminWS_Service service) {
        this.service = service;
    }

  
    
    public AdminMB() {
    }
    
    
public String dologin(){
        if(checkLogin(Email, Password)){
            return "show";
        }else{
            return "login";
        }
    }
  public List<TbAdmin> dofindAll(){
        return findAll();
    }
  
    public String update() {
        update(currUpdate);
        return "show";
    }
    
    public String create(){
        create3(Email, Role, Gender, Email, Phone, Password, Address, Role, Status, null, null);
        
                return "show";
    }
    
    public String delete(){
        delete(AdminID);
        return "show";
    }
     
    public String search(){
        search(Email,Address);
        return "show";
    }
    
    public String addwl(){
        addwl(WLID, UserName, Type, null, null);
        return "show";
    }
    public String removewl(){
        removewl(WLID);
                return "show";
    }
   

    private java.util.List<webservice.TbAdmin> findAll() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservice.AdminWS port = service.getAdminWSPort();
        return port.findAll();
    }

    public boolean checkLogin(java.lang.String email, java.lang.String pass) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservice.AdminWS port = service.getAdminWSPort();
        return port.checkLogin(email, pass);
    }
    
     private boolean update(webservice.TbAdmin arg0) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservice.AdminWS port = service.getAdminWSPort();
        return port.update(arg0);
    }
     
    private boolean create3(java.lang.String id, java.lang.String name, boolean gender, java.lang.String email,
        java.lang.String phone, java.lang.String password, java.lang.String address,
        java.lang.String role, boolean status,
        javax.xml.datatype.XMLGregorianCalendar insertat, javax.xml.datatype.XMLGregorianCalendar updateat) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservice.AdminWS port = service.getAdminWSPort();
        return port.create3(id, name, gender, email, phone, password, address, role, status, insertat, updateat);
    }

    private boolean delete(java.lang.String id) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservice.AdminWS port = service.getAdminWSPort();
        return port.delete(id);
    }

     private boolean search(java.lang.String email, java.lang.String address) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservice.AdminWS port = service.getAdminWSPort();
        return port.search(email, address);
    }
     
     private boolean addwl(java.lang.String id, java.lang.String name, boolean type, javax.xml.datatype.XMLGregorianCalendar insertat, javax.xml.datatype.XMLGregorianCalendar updateat) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservice.AdminWS port = service.getAdminWSPort();
        return port.addwl(id, name, type, insertat, updateat);
    }
     
     
     private boolean removewl(java.lang.String id) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservice.AdminWS port = service.getAdminWSPort();
        return port.removewl(id);
    }

    
      public String getAdminID() {
        return AdminID;
    }

    public void setAdminID(String AdminID) {
        this.AdminID = AdminID;
    }

    public String getAdminName() {
        return AdminName;
    }

    public void setAdminName(String AdminName) {
        this.AdminName = AdminName;
    }

    

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

  

    public TbAdmin getCurrUpdate() {
        return currUpdate;
    }

    public void setCurrUpdate(TbAdmin currUpdate) {
        this.currUpdate = currUpdate;
    }

    /**
     * @return the Role
     */
    public String getRole() {
        return Role;
    }

    /**
     * @param Role the Role to set
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * @return the Status
     */
    public boolean isStatus() {
        return Status;
    }

    /**
     * @param Status the Status to set
     */
    public void setStatus(boolean Status) {
        this.Status = Status;
    }

    /**
     * @return the Gender
     */
    public boolean isGender() {
        return Gender;
    }

    /**
     * @param Gender the Gender to set
     */
    public void setGender(boolean Gender) {
        this.Gender = Gender;
    }

    /**
     * @return the InsertAt
     */
    public Date getInsertAt() {
        return InsertAt;
    }

    /**
     * @param InsertAt the InsertAt to set
     */
    public void setInsertAt(Date InsertAt) {
        this.InsertAt = InsertAt;
    }

    /**
     * @return the UpdateAt
     */
    public Date getUpdateAt() {
        return UpdateAt;
    }

    /**
     * @param UpdateAt the UpdateAt to set
     */
    public void setUpdateAt(Date UpdateAt) {
        this.UpdateAt = UpdateAt;
    }
    
    

    public String getWLID() {
        return WLID;
    }

    public void setWLID(String WLID) {
        this.WLID = WLID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public boolean isType() {
        return Type;
    }

    public void setType(boolean Type) {
        this.Type = Type;
    }
    

    

    

    
   
    

    
    

   

    

    

    

   

   

   
   

    
   

  
    
}
