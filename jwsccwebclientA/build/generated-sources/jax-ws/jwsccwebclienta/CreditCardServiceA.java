
package jwsccwebclienta;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CreditCardServiceA", targetNamespace = "http://jwsccA/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CreditCardServiceA {


    /**
     * 
     * @param accno
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod(operationName = "List")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "List", targetNamespace = "http://jwsccA/", className = "jwsccwebclienta.List")
    @ResponseWrapper(localName = "ListResponse", targetNamespace = "http://jwsccA/", className = "jwsccwebclienta.ListResponse")
    @Action(input = "http://jwsccA/CreditCardServiceA/ListRequest", output = "http://jwsccA/CreditCardServiceA/ListResponse")
    public List<Object> list(
        @WebParam(name = "accno", targetNamespace = "")
        String accno);

    /**
     * 
     * @param amount
     * @param accno
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Charge")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Charge", targetNamespace = "http://jwsccA/", className = "jwsccwebclienta.Charge")
    @ResponseWrapper(localName = "ChargeResponse", targetNamespace = "http://jwsccA/", className = "jwsccwebclienta.ChargeResponse")
    @Action(input = "http://jwsccA/CreditCardServiceA/ChargeRequest", output = "http://jwsccA/CreditCardServiceA/ChargeResponse")
    public String charge(
        @WebParam(name = "accno", targetNamespace = "")
        String accno,
        @WebParam(name = "amount", targetNamespace = "")
        String amount);

    /**
     * 
     * @param sql
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod(operationName = "Read")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Read", targetNamespace = "http://jwsccA/", className = "jwsccwebclienta.Read")
    @ResponseWrapper(localName = "ReadResponse", targetNamespace = "http://jwsccA/", className = "jwsccwebclienta.ReadResponse")
    @Action(input = "http://jwsccA/CreditCardServiceA/ReadRequest", output = "http://jwsccA/CreditCardServiceA/ReadResponse")
    public List<Object> read(
        @WebParam(name = "sql", targetNamespace = "")
        String sql);

    /**
     * 
     * @param amount
     * @param accno
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod(operationName = "Update")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Update", targetNamespace = "http://jwsccA/", className = "jwsccwebclienta.Update")
    @ResponseWrapper(localName = "UpdateResponse", targetNamespace = "http://jwsccA/", className = "jwsccwebclienta.UpdateResponse")
    @Action(input = "http://jwsccA/CreditCardServiceA/UpdateRequest", output = "http://jwsccA/CreditCardServiceA/UpdateResponse")
    public Integer update(
        @WebParam(name = "accno", targetNamespace = "")
        String accno,
        @WebParam(name = "amount", targetNamespace = "")
        String amount);

}
