package UnitTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

public class StudentTestWhitExceptionHandler {

    @ExtendWith(IllegalArgumentExceptionHandlerExtension.class)
    @Nested
    @DisplayName("Add Courese to Student (Exceptional)")
    @Tag("Exceptional")
    class AddCoursetoStudentExceptionalScenario{
        @Test
        @DisplayName("Got an exception when add a null lecturer courese record to student")
        void throwsExceptionWhenAddToNullCoureseToStrudent(){

            final Student busra = new Student ("id1", "Busra","Sahin");
            busra.addCourse(null);
        }
    }
}
