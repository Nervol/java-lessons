package ru.tn.courses.dyakimainen.v2.task2.model;

public class Message {
    private MessageType messageType;
    private String body;
    private String subject;

    public Message(MessageType messageType, String body, String subject) {
        this.messageType = messageType;
        this.body = body;
        this.subject = subject;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Message{" +
                "messageType=" + messageType +
                ", body='" + body + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
