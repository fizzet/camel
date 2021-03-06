/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.mybatis;

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
public class MyBatisComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("configurationUri", java.lang.String.class);
        map.put("bridgeErrorHandler", boolean.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("sqlSessionFactory", org.apache.ibatis.session.SqlSessionFactory.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addConfigurerClearer(MyBatisComponentConfigurer::clearConfigurers);
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        MyBatisComponent target = (MyBatisComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "configurationuri":
        case "configurationUri": target.setConfigurationUri(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "sqlsessionfactory":
        case "sqlSessionFactory": target.setSqlSessionFactory(property(camelContext, org.apache.ibatis.session.SqlSessionFactory.class, value)); return true;
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
        MyBatisComponent target = (MyBatisComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "configurationuri":
        case "configurationUri": return target.getConfigurationUri();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "sqlsessionfactory":
        case "sqlSessionFactory": return target.getSqlSessionFactory();
        default: return null;
        }
    }
}

