package ru.tn.courses.dyakimainen.v2.task2.service;

public abstract class AbstractMessageSender { //абстрактный класс
    abstract boolean sendMessage(String subject, String body); //абстрактный метод отправки

    public void notifyUser() {
        System.out.println("Everything fine! Your message sended");
    }
}
