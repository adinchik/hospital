package ru.geekbrains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("plan")
@Scope("prototype")
public class HospitalPlan implements IHospitalPlan{
    private IRoom room;

    @Autowired
    @Qualifier("room")
    public void setRoom(IRoom room) {
        this.room = room;
    }

    @Override
    public void findRoomLocation() {
        System.out.println("Room location is found");
        room.goRoom();
    }
}
