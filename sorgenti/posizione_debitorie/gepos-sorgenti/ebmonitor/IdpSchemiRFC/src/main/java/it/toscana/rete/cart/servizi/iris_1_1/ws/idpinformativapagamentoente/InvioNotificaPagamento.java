package it.toscana.rete.cart.servizi.iris_1_1.ws.idpinformativapagamentoente;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2019-05-08T20:00:09.952+02:00
 * Generated source version: 2.7.11
 * 
 */
@WebService(targetNamespace = "http://www.cart.rete.toscana.it/servizi/iris_1_1/proxy", name = "InvioNotificaPagamento")
@XmlSeeAlso({it.toscana.rete.cart.servizi.iris_1_1.idpheader.ObjectFactory.class, it.toscana.rete.cart.servizi.iris_1_1.idpesito.ObjectFactory.class, it.toscana.rete.cart.servizi.iris_1_1.idpinformativapagamento.ObjectFactory.class, it.toscana.rete.cart.servizi.iris_1_1.idpinclude.ObjectFactory.class, it.toscana.rete.cart.servizi.iris_1_1.ws.proxy.idpinformativapagamentoente.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface InvioNotificaPagamento {

    @WebResult(name = "IdpInformativaPagamentoResponse", targetNamespace = "http://www.cart.rete.toscana.it/servizi/iris_1_1/proxy", partName = "IdpinformativaPagamentoResponse")
    @WebMethod(operationName = "IdpInformativaPagamento", action = "IdpInformativaPagamento")
    public it.toscana.rete.cart.servizi.iris_1_1.ws.proxy.idpinformativapagamentoente.IdpInformativaPagamentoResponse idpInformativaPagamento(
        @WebParam(partName = "IdpInformativaPagamento", name = "IdpInformativaPagamento", targetNamespace = "http://www.cart.rete.toscana.it/servizi/iris_1_1/proxy")
        it.toscana.rete.cart.servizi.iris_1_1.ws.proxy.idpinformativapagamentoente.IdpInformativaPagamento idpInformativaPagamento
    );
}