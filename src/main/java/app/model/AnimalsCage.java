package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage extends Timer {


    private final Animal cat;
    private final Animal dog;
    private final Timer time;

    @Autowired
    public AnimalsCage(@Qualifier("cat") Animal cat, @Qualifier("dog") Animal dog, Timer time) {
        this.cat = cat;
        this.dog = dog;
        this.time = time;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(cat.toString() +", " + dog.toString());
        System.out.println("At:");
        System.out.println(time.getTime());
        System.out.println("________________________");
    }
}
