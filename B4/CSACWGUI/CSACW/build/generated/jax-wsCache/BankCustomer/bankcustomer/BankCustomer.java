
package bankcustomer;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BankCustomer", targetNamespace = "http://BankCustomer/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BankCustomer {


    /**
     * 
     * @param sql
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "addCustomer", targetNamespace = "http://BankCustomer/", className = "bankcustomer.AddCustomer")
    @Action(input = "http://BankCustomer/BankCustomer/addCustomer")
    public void addCustomer(
        @WebParam(name = "sql", targetNamespace = "")
        String sql);

}
