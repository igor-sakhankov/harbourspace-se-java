package demo;


import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CourseService {

    private final Lector lector;

    public CourseService(@Qualifier("Vasya") Lector lector) {
        this.lector = lector;
    }

    public int startCourse() {
        if (!lector.isThereAQuizToday()) {
            return 1;
        } else {
            return 0;
        }
    }
}
