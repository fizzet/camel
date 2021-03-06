/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.atlasmap;

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
public class AtlasMapEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("resourceUri", java.lang.String.class);
        map.put("allowContextMapAll", boolean.class);
        map.put("contentCache", boolean.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("sourceMapName", java.lang.String.class);
        map.put("targetMapMode", org.apache.camel.component.atlasmap.AtlasMapEndpoint.TargetMapMode.class);
        map.put("targetMapName", java.lang.String.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("propertiesFile", java.lang.String.class);
        map.put("synchronous", boolean.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addConfigurerClearer(AtlasMapEndpointConfigurer::clearConfigurers);
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        AtlasMapEndpoint target = (AtlasMapEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowcontextmapall":
        case "allowContextMapAll": target.setAllowContextMapAll(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "contentcache":
        case "contentCache": target.setContentCache(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "propertiesfile":
        case "propertiesFile": target.setPropertiesFile(property(camelContext, java.lang.String.class, value)); return true;
        case "sourcemapname":
        case "sourceMapName": target.setSourceMapName(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "targetmapmode":
        case "targetMapMode": target.setTargetMapMode(property(camelContext, org.apache.camel.component.atlasmap.AtlasMapEndpoint.TargetMapMode.class, value)); return true;
        case "targetmapname":
        case "targetMapName": target.setTargetMapName(property(camelContext, java.lang.String.class, value)); return true;
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
        AtlasMapEndpoint target = (AtlasMapEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowcontextmapall":
        case "allowContextMapAll": return target.isAllowContextMapAll();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "contentcache":
        case "contentCache": return target.isContentCache();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "propertiesfile":
        case "propertiesFile": return target.getPropertiesFile();
        case "sourcemapname":
        case "sourceMapName": return target.getSourceMapName();
        case "synchronous": return target.isSynchronous();
        case "targetmapmode":
        case "targetMapMode": return target.getTargetMapMode();
        case "targetmapname":
        case "targetMapName": return target.getTargetMapName();
        default: return null;
        }
    }
}

