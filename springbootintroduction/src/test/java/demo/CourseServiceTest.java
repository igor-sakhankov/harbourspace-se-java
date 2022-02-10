package demo;

import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.openMocks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CourseServiceTest {

    Lector lector;

    CourseService courseService;

    @BeforeEach
    void setUp() {
        courseService = new CourseService(new Lector("name"));
    }

    @Test
    void myTest() {
        final var i = courseService.startCourse();
    }


}
