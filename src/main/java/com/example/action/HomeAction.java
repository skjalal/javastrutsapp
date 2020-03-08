package com.example.action;

import com.example.model.Person;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HomeAction extends ActionSupport implements ModelDriven<Person> {

    private static final Logger LOGGER = LogManager.getLogger(HomeAction.class);
    private Person person = new Person();

    @Override
    public String execute() {
        LOGGER.info("This is HomeAction...!");
        person.setId(101);
        person.setName("ABC");
        return SUCCESS;
    }

    @Override
    public Person getModel() {
        LOGGER.info("Getting Model Object...!");
        return person;
    }
}
