/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.sjms2;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.sjms.SjmsEndpointConfigurer;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class Sjms2EndpointConfigurer extends SjmsEndpointConfigurer implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("destinationType", java.lang.String.class);
        map.put("destinationName", java.lang.String.class);
        map.put("acknowledgementMode", org.apache.camel.component.sjms.jms.SessionAcknowledgementType.class);
        map.put("bridgeErrorHandler", boolean.class);
        map.put("consumerCount", int.class);
        map.put("durable", boolean.class);
        map.put("durableSubscriptionId", java.lang.String.class);
        map.put("reconnectBackOff", long.class);
        map.put("reconnectOnError", boolean.class);
        map.put("shared", boolean.class);
        map.put("subscriptionId", java.lang.String.class);
        map.put("synchronous", boolean.class);
        map.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        map.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        map.put("messageSelector", java.lang.String.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("namedReplyTo", java.lang.String.class);
        map.put("persistent", boolean.class);
        map.put("producerCount", int.class);
        map.put("ttl", long.class);
        map.put("allowNullBody", boolean.class);
        map.put("prefillPool", boolean.class);
        map.put("responseTimeOut", long.class);
        map.put("asyncStartListener", boolean.class);
        map.put("asyncStopListener", boolean.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("connectionCount", java.lang.Integer.class);
        map.put("connectionFactory", javax.jms.ConnectionFactory.class);
        map.put("connectionResource", org.apache.camel.component.sjms.jms.ConnectionResource.class);
        map.put("destinationCreationStrategy", org.apache.camel.component.sjms.jms.DestinationCreationStrategy.class);
        map.put("exceptionListener", javax.jms.ExceptionListener.class);
        map.put("headerFilterStrategy", org.apache.camel.spi.HeaderFilterStrategy.class);
        map.put("includeAllJMSXProperties", boolean.class);
        map.put("jmsKeyFormatStrategy", org.apache.camel.component.sjms.jms.JmsKeyFormatStrategy.class);
        map.put("mapJmsMessage", boolean.class);
        map.put("messageCreatedStrategy", org.apache.camel.component.sjms.jms.MessageCreatedStrategy.class);
        map.put("errorHandlerLoggingLevel", org.apache.camel.LoggingLevel.class);
        map.put("errorHandlerLogStackTrace", boolean.class);
        map.put("transacted", boolean.class);
        map.put("transactionBatchCount", int.class);
        map.put("transactionBatchTimeout", long.class);
        map.put("transactionCommitStrategy", org.apache.camel.component.sjms.TransactionCommitStrategy.class);
        map.put("sharedJMSSession", boolean.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addConfigurerClearer(Sjms2EndpointConfigurer::clearConfigurers);
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        Sjms2Endpoint target = (Sjms2Endpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "durable": target.setDurable(property(camelContext, boolean.class, value)); return true;
        case "shared": target.setShared(property(camelContext, boolean.class, value)); return true;
        case "subscriptionid":
        case "subscriptionId": target.setSubscriptionId(property(camelContext, java.lang.String.class, value)); return true;
        default: return super.configure(camelContext, obj, name, value, ignoreCase);
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    public static void clearBootstrapConfigurers() {
    }

    public static void clearConfigurers() {
        ALL_OPTIONS.clear();
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        Sjms2Endpoint target = (Sjms2Endpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "durable": return target.isDurable();
        case "shared": return target.isShared();
        case "subscriptionid":
        case "subscriptionId": return target.getSubscriptionId();
        default: return super.getOptionValue(obj, name, ignoreCase);
        }
    }
}

