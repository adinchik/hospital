package ru.geekbrains;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("room")
@Scope("prototype")
public class Room implements IRoom{

    @Override
    public void goRoom() {
        System.out.println("Patient can go to the room");
    }
}
