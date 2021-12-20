package com.crosska.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("bankBean")
@Scope("singleton")
public class Bank {

    @Value("${bank.name}")
    private String name;

    @Value("${bank.year}")
    private int year;

    private List<Client> clients;

    @Override
    public String toString() {
        String output = "";
        for (Client client : clients) {
            output = output + "\n" + client.getSurname() +
                    "\n" + client.getName() +
                    "\n" + client.getAge() +
                    "\n" + client.getAccountID();
        }
        return output;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

}
