package ru.tn.courses.dyakimainen.v2.task2;

import ru.tn.courses.dyakimainen.v2.task2.model.Message;
import ru.tn.courses.dyakimainen.v2.task2.model.MessageType;
import ru.tn.courses.dyakimainen.v2.task2.service.MessageSender;

public class Subtask_2 {
    public static void main(String[] args) {
        Message msg = new Message(MessageType.TELEGRAM,"Привет! Я Дима!","Галя");
        MessageSender messageSender = new MessageSender();
        messageSender.initiateChannelAndSend(msg);

        msg.setMessageType(MessageType.EMAIL);
        messageSender.initiateChannelAndSend(msg);

        msg.setMessageType(MessageType.SMS);
        messageSender.initiateChannelAndSend(msg);

    }
}
