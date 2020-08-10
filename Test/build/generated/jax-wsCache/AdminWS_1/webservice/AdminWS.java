
package webservice;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AdminWS", targetNamespace = "http://webservice/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AdminWS {


    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "update", targetNamespace = "http://webservice/", className = "webservice.Update")
    @ResponseWrapper(localName = "updateResponse", targetNamespace = "http://webservice/", className = "webservice.UpdateResponse")
    @Action(input = "http://webservice/AdminWS/updateRequest", output = "http://webservice/AdminWS/updateResponse")
    public boolean update(
        @WebParam(name = "arg0", targetNamespace = "")
        TbAdmin arg0);

    /**
     * 
     * @param id
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "delete", targetNamespace = "http://webservice/", className = "webservice.Delete")
    @ResponseWrapper(localName = "deleteResponse", targetNamespace = "http://webservice/", className = "webservice.DeleteResponse")
    @Action(input = "http://webservice/AdminWS/deleteRequest", output = "http://webservice/AdminWS/deleteResponse")
    public boolean delete(
        @WebParam(name = "id", targetNamespace = "")
        String id);

    /**
     * 
     * @param address
     * @param email
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "search", targetNamespace = "http://webservice/", className = "webservice.Search")
    @ResponseWrapper(localName = "searchResponse", targetNamespace = "http://webservice/", className = "webservice.SearchResponse")
    @Action(input = "http://webservice/AdminWS/searchRequest", output = "http://webservice/AdminWS/searchResponse")
    public boolean search(
        @WebParam(name = "email", targetNamespace = "")
        String email,
        @WebParam(name = "address", targetNamespace = "")
        String address);

    /**
     * 
     * @return
     *     returns java.util.List<webservice.TbAdmin>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAll", targetNamespace = "http://webservice/", className = "webservice.FindAll")
    @ResponseWrapper(localName = "findAllResponse", targetNamespace = "http://webservice/", className = "webservice.FindAllResponse")
    @Action(input = "http://webservice/AdminWS/findAllRequest", output = "http://webservice/AdminWS/findAllResponse")
    public List<TbAdmin> findAll();

    /**
     * 
     * @param password
     * @param address
     * @param role
     * @param gender
     * @param phone
     * @param insertat
     * @param name
     * @param updateat
     * @param id
     * @param email
     * @param status
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "create3", targetNamespace = "http://webservice/", className = "webservice.Create3")
    @ResponseWrapper(localName = "create3Response", targetNamespace = "http://webservice/", className = "webservice.Create3Response")
    @Action(input = "http://webservice/AdminWS/create3Request", output = "http://webservice/AdminWS/create3Response")
    public boolean create3(
        @WebParam(name = "id", targetNamespace = "")
        String id,
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "gender", targetNamespace = "")
        boolean gender,
        @WebParam(name = "email", targetNamespace = "")
        String email,
        @WebParam(name = "phone", targetNamespace = "")
        String phone,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "address", targetNamespace = "")
        String address,
        @WebParam(name = "role", targetNamespace = "")
        String role,
        @WebParam(name = "status", targetNamespace = "")
        boolean status,
        @WebParam(name = "insertat", targetNamespace = "")
        XMLGregorianCalendar insertat,
        @WebParam(name = "updateat", targetNamespace = "")
        XMLGregorianCalendar updateat);

    /**
     * 
     * @param pass
     * @param email
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "checkLogin", targetNamespace = "http://webservice/", className = "webservice.CheckLogin")
    @ResponseWrapper(localName = "checkLoginResponse", targetNamespace = "http://webservice/", className = "webservice.CheckLoginResponse")
    @Action(input = "http://webservice/AdminWS/checkLoginRequest", output = "http://webservice/AdminWS/checkLoginResponse")
    public boolean checkLogin(
        @WebParam(name = "email", targetNamespace = "")
        String email,
        @WebParam(name = "pass", targetNamespace = "")
        String pass);

    /**
     * 
     * @param insertat
     * @param name
     * @param updateat
     * @param id
     * @param type
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addwl", targetNamespace = "http://webservice/", className = "webservice.Addwl")
    @ResponseWrapper(localName = "addwlResponse", targetNamespace = "http://webservice/", className = "webservice.AddwlResponse")
    @Action(input = "http://webservice/AdminWS/addwlRequest", output = "http://webservice/AdminWS/addwlResponse")
    public boolean addwl(
        @WebParam(name = "id", targetNamespace = "")
        String id,
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "type", targetNamespace = "")
        boolean type,
        @WebParam(name = "insertat", targetNamespace = "")
        XMLGregorianCalendar insertat,
        @WebParam(name = "updateat", targetNamespace = "")
        XMLGregorianCalendar updateat);

    /**
     * 
     * @param id
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "removewl", targetNamespace = "http://webservice/", className = "webservice.Removewl")
    @ResponseWrapper(localName = "removewlResponse", targetNamespace = "http://webservice/", className = "webservice.RemovewlResponse")
    @Action(input = "http://webservice/AdminWS/removewlRequest", output = "http://webservice/AdminWS/removewlResponse")
    public boolean removewl(
        @WebParam(name = "id", targetNamespace = "")
        String id);

}
