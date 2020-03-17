/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.atmos;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class AtmosEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        AtmosEndpoint target = (AtmosEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "fulltokenid":
        case "fullTokenId": target.getConfiguration().setFullTokenId(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "localpath":
        case "localPath": target.getConfiguration().setLocalPath(property(camelContext, java.lang.String.class, value)); return true;
        case "newremotepath":
        case "newRemotePath": target.getConfiguration().setNewRemotePath(property(camelContext, java.lang.String.class, value)); return true;
        case "query": target.getConfiguration().setQuery(property(camelContext, java.lang.String.class, value)); return true;
        case "remotepath":
        case "remotePath": target.getConfiguration().setRemotePath(property(camelContext, java.lang.String.class, value)); return true;
        case "secretkey":
        case "secretKey": target.getConfiguration().setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "sslvalidation":
        case "sslValidation": target.getConfiguration().setSslValidation(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "uri": target.getConfiguration().setUri(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

}
