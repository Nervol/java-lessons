package ru.tn.courses.dyakimainen.v2.task2.service;

import ru.tn.courses.dyakimainen.v2.task2.model.Message;

public class MessageSender extends AbstractMessageSender {//расширяемся
    private IMessenger messenger;//указываем интерфейс

    public void initiateChannelAndSend(Message message) {
        switch (message.getMessageType()) {
            case SMS -> messenger = new SmsMessenger();//реализуем смс-мессенджер
            case EMAIL -> messenger = new EmailMessenger();//реализуем эмейл-мессенджер
            case TELEGRAM -> messenger = new TelegaMessenger();//реализуем тг-мессенджер
        }
        sendMessage(message.getSubject(), message.getBody());//отправляем
    }

    @Override
    boolean sendMessage(String subject, String body) {//переопределяем абстрактный метод
        messenger.sendMessage(subject, body); //собственно, отправляем в зависимости от enum
        notifyUser();//извещаем
        return true;
    }
}
