/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.consul;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class ConsulComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("connectTimeout", java.time.Duration.class);
        map.put("connectTimeoutMillis", java.lang.Long.class);
        map.put("consulClient", com.orbitz.consul.Consul.class);
        map.put("key", java.lang.String.class);
        map.put("pingInstance", boolean.class);
        map.put("readTimeout", java.time.Duration.class);
        map.put("readTimeoutMillis", java.lang.Long.class);
        map.put("tags", java.lang.String.class);
        map.put("url", java.lang.String.class);
        map.put("writeTimeout", java.time.Duration.class);
        map.put("writeTimeoutMillis", java.lang.Long.class);
        map.put("bridgeErrorHandler", boolean.class);
        map.put("action", java.lang.String.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("valueAsString", boolean.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("configuration", org.apache.camel.component.consul.ConsulConfiguration.class);
        map.put("consistencyMode", com.orbitz.consul.option.ConsistencyMode.class);
        map.put("datacenter", java.lang.String.class);
        map.put("nearNode", java.lang.String.class);
        map.put("nodeMeta", java.util.List.class);
        map.put("aclToken", java.lang.String.class);
        map.put("password", java.lang.String.class);
        map.put("sslContextParameters", org.apache.camel.support.jsse.SSLContextParameters.class);
        map.put("useGlobalSslContextParameters", boolean.class);
        map.put("userName", java.lang.String.class);
        map.put("blockSeconds", java.lang.Integer.class);
        map.put("firstIndex", java.math.BigInteger.class);
        map.put("recursive", boolean.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addConfigurerClearer(ConsulComponentConfigurer::clearConfigurers);
    }

    private org.apache.camel.component.consul.ConsulConfiguration getOrCreateConfiguration(ConsulComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.consul.ConsulConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        ConsulComponent target = (ConsulComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "acltoken":
        case "aclToken": getOrCreateConfiguration(target).setAclToken(property(camelContext, java.lang.String.class, value)); return true;
        case "action": getOrCreateConfiguration(target).setAction(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "blockseconds":
        case "blockSeconds": getOrCreateConfiguration(target).setBlockSeconds(property(camelContext, java.lang.Integer.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.consul.ConsulConfiguration.class, value)); return true;
        case "connecttimeout":
        case "connectTimeout": getOrCreateConfiguration(target).setConnectTimeout(property(camelContext, java.time.Duration.class, value)); return true;
        case "connecttimeoutmillis":
        case "connectTimeoutMillis": getOrCreateConfiguration(target).setConnectTimeoutMillis(property(camelContext, java.lang.Long.class, value)); return true;
        case "consistencymode":
        case "consistencyMode": getOrCreateConfiguration(target).setConsistencyMode(property(camelContext, com.orbitz.consul.option.ConsistencyMode.class, value)); return true;
        case "consulclient":
        case "consulClient": getOrCreateConfiguration(target).setConsulClient(property(camelContext, com.orbitz.consul.Consul.class, value)); return true;
        case "datacenter": getOrCreateConfiguration(target).setDatacenter(property(camelContext, java.lang.String.class, value)); return true;
        case "firstindex":
        case "firstIndex": getOrCreateConfiguration(target).setFirstIndex(property(camelContext, java.math.BigInteger.class, value)); return true;
        case "key": getOrCreateConfiguration(target).setKey(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "nearnode":
        case "nearNode": getOrCreateConfiguration(target).setNearNode(property(camelContext, java.lang.String.class, value)); return true;
        case "nodemeta":
        case "nodeMeta": getOrCreateConfiguration(target).setNodeMeta(property(camelContext, java.util.List.class, value)); return true;
        case "password": getOrCreateConfiguration(target).setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "pinginstance":
        case "pingInstance": getOrCreateConfiguration(target).setPingInstance(property(camelContext, boolean.class, value)); return true;
        case "readtimeout":
        case "readTimeout": getOrCreateConfiguration(target).setReadTimeout(property(camelContext, java.time.Duration.class, value)); return true;
        case "readtimeoutmillis":
        case "readTimeoutMillis": getOrCreateConfiguration(target).setReadTimeoutMillis(property(camelContext, java.lang.Long.class, value)); return true;
        case "recursive": getOrCreateConfiguration(target).setRecursive(property(camelContext, boolean.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": getOrCreateConfiguration(target).setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "tags": getOrCreateConfiguration(target).setTags(property(camelContext, java.lang.String.class, value)); return true;
        case "url": getOrCreateConfiguration(target).setUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": target.setUseGlobalSslContextParameters(property(camelContext, boolean.class, value)); return true;
        case "username":
        case "userName": getOrCreateConfiguration(target).setUserName(property(camelContext, java.lang.String.class, value)); return true;
        case "valueasstring":
        case "valueAsString": getOrCreateConfiguration(target).setValueAsString(property(camelContext, boolean.class, value)); return true;
        case "writetimeout":
        case "writeTimeout": getOrCreateConfiguration(target).setWriteTimeout(property(camelContext, java.time.Duration.class, value)); return true;
        case "writetimeoutmillis":
        case "writeTimeoutMillis": getOrCreateConfiguration(target).setWriteTimeoutMillis(property(camelContext, java.lang.Long.class, value)); return true;
        default: return false;
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
        ConsulComponent target = (ConsulComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "acltoken":
        case "aclToken": return getOrCreateConfiguration(target).getAclToken();
        case "action": return getOrCreateConfiguration(target).getAction();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "blockseconds":
        case "blockSeconds": return getOrCreateConfiguration(target).getBlockSeconds();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "configuration": return target.getConfiguration();
        case "connecttimeout":
        case "connectTimeout": return getOrCreateConfiguration(target).getConnectTimeout();
        case "connecttimeoutmillis":
        case "connectTimeoutMillis": return getOrCreateConfiguration(target).getConnectTimeoutMillis();
        case "consistencymode":
        case "consistencyMode": return getOrCreateConfiguration(target).getConsistencyMode();
        case "consulclient":
        case "consulClient": return getOrCreateConfiguration(target).getConsulClient();
        case "datacenter": return getOrCreateConfiguration(target).getDatacenter();
        case "firstindex":
        case "firstIndex": return getOrCreateConfiguration(target).getFirstIndex();
        case "key": return getOrCreateConfiguration(target).getKey();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "nearnode":
        case "nearNode": return getOrCreateConfiguration(target).getNearNode();
        case "nodemeta":
        case "nodeMeta": return getOrCreateConfiguration(target).getNodeMeta();
        case "password": return getOrCreateConfiguration(target).getPassword();
        case "pinginstance":
        case "pingInstance": return getOrCreateConfiguration(target).isPingInstance();
        case "readtimeout":
        case "readTimeout": return getOrCreateConfiguration(target).getReadTimeout();
        case "readtimeoutmillis":
        case "readTimeoutMillis": return getOrCreateConfiguration(target).getReadTimeoutMillis();
        case "recursive": return getOrCreateConfiguration(target).isRecursive();
        case "sslcontextparameters":
        case "sslContextParameters": return getOrCreateConfiguration(target).getSslContextParameters();
        case "tags": return getOrCreateConfiguration(target).getTags();
        case "url": return getOrCreateConfiguration(target).getUrl();
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": return target.isUseGlobalSslContextParameters();
        case "username":
        case "userName": return getOrCreateConfiguration(target).getUserName();
        case "valueasstring":
        case "valueAsString": return getOrCreateConfiguration(target).isValueAsString();
        case "writetimeout":
        case "writeTimeout": return getOrCreateConfiguration(target).getWriteTimeout();
        case "writetimeoutmillis":
        case "writeTimeoutMillis": return getOrCreateConfiguration(target).getWriteTimeoutMillis();
        default: return null;
        }
    }
}

