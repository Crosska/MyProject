package com.crosska.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bank bank = null;
        Client client1 = null;
        Client client2 = null;

        try {
            bank = context.getBean("bankBean", Bank.class);
            client1 = context.getBean("clientBean", Client.class);
            client2 = context.getBean("clientBean", Client.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        } finally {
            context.close();
        }
        List<Client> clients = new ArrayList<>();

        client1.setName("Vladislav");
        client1.setSurname("Muzichin");
        client1.setAge(21);
        client1.setAccountID("19949");

        client2.setName("Grigoriy");
        client2.setSurname("Shevchuk");
        client2.setAge(47);
        client2.setAccountID("18");

        clients.add(client1);
        clients.add(client2);
        bank.setClients(clients);

        System.out.println(bank);

    }
}
