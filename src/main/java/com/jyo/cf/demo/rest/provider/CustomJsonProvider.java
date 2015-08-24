package com.jyo.cf.demo.rest.provider;


import org.codehaus.jackson.jaxrs.JacksonJaxbJsonProvider;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.xc.JaxbAnnotationIntrospector;

/**
 * Created by Jyotsna R on 1/12/15.
 */
public class CustomJsonProvider extends JacksonJaxbJsonProvider {

    public CustomJsonProvider() {

        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(org.codehaus.jackson.map.SerializationConfig.Feature.WRAP_ROOT_VALUE, true);
        _mapperConfig.setMapper(mapper);
        _mapperConfig.getConfiguredMapper().setAnnotationIntrospector(new JaxbAnnotationIntrospector());
    }
}
