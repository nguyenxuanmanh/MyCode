
package webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Search_QNAME = new QName("http://webservice/", "search");
    private final static QName _TbAdmin_QNAME = new QName("http://webservice/", "tbAdmin");
    private final static QName _SearchResponse_QNAME = new QName("http://webservice/", "searchResponse");
    private final static QName _Create3Response_QNAME = new QName("http://webservice/", "create3Response");
    private final static QName _DeleteResponse_QNAME = new QName("http://webservice/", "deleteResponse");
    private final static QName _FindAllResponse_QNAME = new QName("http://webservice/", "findAllResponse");
    private final static QName _Create3_QNAME = new QName("http://webservice/", "create3");
    private final static QName _UpdateResponse_QNAME = new QName("http://webservice/", "updateResponse");
    private final static QName _Update_QNAME = new QName("http://webservice/", "update");
    private final static QName _CheckLogin_QNAME = new QName("http://webservice/", "checkLogin");
    private final static QName _CheckLoginResponse_QNAME = new QName("http://webservice/", "checkLoginResponse");
    private final static QName _Delete_QNAME = new QName("http://webservice/", "delete");
    private final static QName _FindAll_QNAME = new QName("http://webservice/", "findAll");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link CheckLogin }
     * 
     */
    public CheckLogin createCheckLogin() {
        return new CheckLogin();
    }

    /**
     * Create an instance of {@link CheckLoginResponse }
     * 
     */
    public CheckLoginResponse createCheckLoginResponse() {
        return new CheckLoginResponse();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link FindAll }
     * 
     */
    public FindAll createFindAll() {
        return new FindAll();
    }

    /**
     * Create an instance of {@link TbAdmin }
     * 
     */
    public TbAdmin createTbAdmin() {
        return new TbAdmin();
    }

    /**
     * Create an instance of {@link Search }
     * 
     */
    public Search createSearch() {
        return new Search();
    }

    /**
     * Create an instance of {@link Create3Response }
     * 
     */
    public Create3Response createCreate3Response() {
        return new Create3Response();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link SearchResponse }
     * 
     */
    public SearchResponse createSearchResponse() {
        return new SearchResponse();
    }

    /**
     * Create an instance of {@link Create3 }
     * 
     */
    public Create3 createCreate3() {
        return new Create3();
    }

    /**
     * Create an instance of {@link FindAllResponse }
     * 
     */
    public FindAllResponse createFindAllResponse() {
        return new FindAllResponse();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Search }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "search")
    public JAXBElement<Search> createSearch(Search value) {
        return new JAXBElement<Search>(_Search_QNAME, Search.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TbAdmin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "tbAdmin")
    public JAXBElement<TbAdmin> createTbAdmin(TbAdmin value) {
        return new JAXBElement<TbAdmin>(_TbAdmin_QNAME, TbAdmin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "searchResponse")
    public JAXBElement<SearchResponse> createSearchResponse(SearchResponse value) {
        return new JAXBElement<SearchResponse>(_SearchResponse_QNAME, SearchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Create3Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "create3Response")
    public JAXBElement<Create3Response> createCreate3Response(Create3Response value) {
        return new JAXBElement<Create3Response>(_Create3Response_QNAME, Create3Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "findAllResponse")
    public JAXBElement<FindAllResponse> createFindAllResponse(FindAllResponse value) {
        return new JAXBElement<FindAllResponse>(_FindAllResponse_QNAME, FindAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Create3 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "create3")
    public JAXBElement<Create3> createCreate3(Create3 value) {
        return new JAXBElement<Create3>(_Create3_QNAME, Create3 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "updateResponse")
    public JAXBElement<UpdateResponse> createUpdateResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateResponse_QNAME, UpdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Update }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "update")
    public JAXBElement<Update> createUpdate(Update value) {
        return new JAXBElement<Update>(_Update_QNAME, Update.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "checkLogin")
    public JAXBElement<CheckLogin> createCheckLogin(CheckLogin value) {
        return new JAXBElement<CheckLogin>(_CheckLogin_QNAME, CheckLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "checkLoginResponse")
    public JAXBElement<CheckLoginResponse> createCheckLoginResponse(CheckLoginResponse value) {
        return new JAXBElement<CheckLoginResponse>(_CheckLoginResponse_QNAME, CheckLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "findAll")
    public JAXBElement<FindAll> createFindAll(FindAll value) {
        return new JAXBElement<FindAll>(_FindAll_QNAME, FindAll.class, null, value);
    }

}
