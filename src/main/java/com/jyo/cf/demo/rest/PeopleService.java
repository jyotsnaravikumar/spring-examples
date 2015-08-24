package com.jyo.cf.demo.rest;

import com.jyo.cf.demo.rest.domain.Person;

import java.util.Map;

/**
 * Created by Jyotsna R on 1/12/15.
 */
public interface PeopleService {

    public Person getPerson(int id);
    public Map listPeople();

}
