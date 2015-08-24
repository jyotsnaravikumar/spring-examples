package com.jyo.cf.demo.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by Jyotsna R on 1/20/15.
 */
@Service
public class SampleBean {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @PostConstruct
    public void init()
    {
        log.debug("SampleBean initialized!!!");
    }

    public boolean getFlag()
    {
        return true;
    }
}
