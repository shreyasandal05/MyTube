package com.mytube;

public class NotificationService implements EmailService{
    @Override
    public User notify(User email) {
        System.out.println("Notifying user");
        return email;
    }
}
