package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Autowired
    @Qualifier("dogBean")
    private Animal animal;

    @Autowired
    private Timer timerBean;

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(timerBean.getTime());
        System.out.println("________________________");
    }

    public Timer getTimer() {
        return timerBean;
    }
}
