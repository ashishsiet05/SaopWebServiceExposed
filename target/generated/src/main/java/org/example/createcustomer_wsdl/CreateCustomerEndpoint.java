package org.example.createcustomer_wsdl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.4.redhat-621084
 * 2019-07-16T20:17:37.392+05:30
 * Generated source version: 3.0.4.redhat-621084
 * 
 */
@WebService(targetNamespace = "http://www.example.org/CreateCustomer_WSDL/", name = "CreateCustomerEndpoint")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface CreateCustomerEndpoint {

    @WebMethod(operationName = "CreateCustomer", action = "http://www.example.org/CreateCustomer_WSDL/CreateCustomer")
    @WebResult(name = "CreateCustomerResponse", targetNamespace = "http://www.example.org/CreateCustomer_WSDL/", partName = "out")
    public CreateCustomerResponse createCustomer(
        @WebParam(partName = "in", name = "CreateCustomerRequest", targetNamespace = "http://www.example.org/CreateCustomer_WSDL/")
        CreateCustomerRequest in
    );
}
