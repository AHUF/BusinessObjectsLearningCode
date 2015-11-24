/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jwsccA;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import ccdblibA.*;
import java.util.List;
/**
 *
 * @author Ann
 */
@WebService(serviceName = "CreditCardServiceA")
public class CreditCardServiceA {

    private crudA db;
    public CreditCardServiceA(){
        db = new crudA("DATABASENAME","USER","PASSWORD");
    }
    


    /**
     * Web service operation
     */
    @WebMethod(operationName = "Read")
    public List Read(@WebParam(name = "sql") String sql) {
        //TODO write your implementation code here:
        return db.Read(sql);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "List")
    public List List(@WebParam(name = "accno") String accno) {
        //TODO write your implementation code here:
        return db.List(accno);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Update")
    public Integer Update(@WebParam(name = "accno") String accno, @WebParam(name = "amount") String amount) {
        //TODO write your implementation code here:
        return db.Update(accno, amount);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Charge")
    public String Charge(@WebParam(name = "accno") String accno, @WebParam(name = "amount") String amount) {
        //TODO write your implementation code here:
        return db.Charge(accno, amount);
    }
}
