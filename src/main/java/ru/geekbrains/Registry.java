package ru.geekbrains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("registry")
@Scope("prototype")
public class Registry implements IRegistry{
    private IArchive archive;
    private ISchedule schedule;
    private  IHospitalPlan hospitalPlan;

    public Registry() {
        System.out.println("Patient comes to the registry");
    }

    @Autowired
    @Qualifier("archive")
    public void setArchive(IArchive archive) {
        this.archive = archive;
    }

    @Autowired
    @Qualifier("plan")
    public void setHospitalPlan(IHospitalPlan hospitalPlan) {
        this.hospitalPlan = hospitalPlan;
    }

    @Autowired
    @Qualifier("schedule")
    public void setSchedule(ISchedule schedule) {
        this.schedule = schedule;
    }

    public void goToDoctor() {
        archive.findPatientChart();
        schedule.findDoctorTimetable();
        hospitalPlan.findRoomLocation();
    }
}
