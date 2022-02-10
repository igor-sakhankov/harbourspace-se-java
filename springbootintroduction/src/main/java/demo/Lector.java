package demo;

import java.util.Random;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Lector {

    final String name;

    public boolean isThereAQuizToday() {
        var r = new Random();
        return r.nextBoolean();
    }
}
