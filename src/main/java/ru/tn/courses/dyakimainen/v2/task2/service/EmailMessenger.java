package ru.tn.courses.dyakimainen.v2.task2.service;

public class EmailMessenger implements IMessenger { //реализация отправки по эмейл
    @Override
    public void sendMessage(String subject, String body) {
        System.out.println("Message sended via e-mail");
    }
}
