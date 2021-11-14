package ru.tn.courses.dyakimainen.v2.task2.service;

public class SmsMessenger implements IMessenger {//реализация отправки по смс
    @Override
    public void sendMessage(String subject, String body) {
        System.out.println("Message sended via SMS");
    }
}
