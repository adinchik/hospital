package ru.geekbrains;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("schedule")
@Scope("prototype")
public class Schedule implements ISchedule{

    @Override
    public void findDoctorTimetable() {
        System.out.println("Doctor's timetable is found");
    }
}
