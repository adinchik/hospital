package ru.geekbrains;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("archive")
@Scope("prototype")
public class Archive implements IArchive{

    @Override
    public void findPatientChart() {
        System.out.println("Patient chart is found");
    }
}
