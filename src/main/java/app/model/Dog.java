package app.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("myDog")
public class Dog extends Animal {

    @Override
    public String toString() {
        return "Im a Dog";
    }
}
