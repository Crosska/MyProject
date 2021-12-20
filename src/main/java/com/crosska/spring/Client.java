package com.crosska.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("clientBean")
@Scope("prototype")
public class Client {

    private String surname;
    private String name;
    private int age;
    private String accountID;

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }
}
