package com.Task9.capybaralist.controller.capybara;

import java.util.Date;

public class CapybaraResponse {

    private  int id;
    private  String capybara_name;
    private Date date_of_birth;
    private int zoo_id;

    public CapybaraResponse(int id, String capybara_name, Date date_of_birth, int zoo_id) {
        this.id = id;
        this.capybara_name = capybara_name;
        this.date_of_birth = date_of_birth;
        this.zoo_id = zoo_id;
    }

    public int getId() {
        return id;
    }

    public String getCapybara_name() {
        return capybara_name;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public int getZoo_id() {
        return zoo_id;
    }
}
