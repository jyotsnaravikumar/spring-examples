package com.jyo.cf.demo.rest;

import com.jyo.cf.demo.rest.domain.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jyotsna R on 1/12/15.
 */
@Component
@Path("/")
public class PeopleServiceImpl implements PeopleService {

    private static Map people = new HashMap();

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SampleBean sampleBean;

    static {
        people.put(1, new Person("John", "Wright","San Jose, CA", "COE"));
        people.put(2, new Person("Jack", "Wright","San Jose, CA", "COO"));
        people.put(3, new Person("James", "Wright","San Jose, CA", "CFO"));
    }

    @Override
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/people/{id}")
    public Person getPerson(@PathParam("id") int id) {
        log.debug("sampleBean:::" + sampleBean);
        log.debug("sampleBean.getFlag:::" + sampleBean.getFlag());
        return (Person) people.get(id);
    }


    @Override
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/people")
    public Map listPeople() {
        log.debug("sampleBean:::" + sampleBean);
        log.debug("sampleBean.getFlag:::" + sampleBean.getFlag());
        return people;
    }
}
