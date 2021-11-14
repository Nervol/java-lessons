package ru.tn.courses.dyakimainen.v2.task2.service;

public class TelegaMessenger implements IMessenger {//реализация отправки по телеграм
    @Override
    public void sendMessage(String subject, String body) {
        System.out.println("Message sended via Telegram");
    }
}
