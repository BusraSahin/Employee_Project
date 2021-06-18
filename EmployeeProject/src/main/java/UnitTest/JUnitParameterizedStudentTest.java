package UnitTest;

import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Student Test with TestInfo and TestReporter Parameters ")
public class JUnitParameterizedStudentTest {


    private Student student;

    public JUnitParameterizedStudentTest(TestInfo testInfo) {
        assertEquals("Student Test with TestInfo and TestReporter Parameters", testInfo.getDisplayName());
    }

    @BeforeEach
    void setStudent(TestInfo testInfo) {

        if (testInfo.getTags().contains("Create")) {
            student = new Student("id1", "Busra", "Sahin");

        } else {
            student = new Student("id2", "Aleyna", "Sahin");

        }
    }

    @Test
    @DisplayName("Create Student")
    @Tag("Create")
    void createStudent() {
        assertEquals("Busra", student.getName());


    }

    @Test
    @DisplayName("Add Course to Student")
    @Tag("addCourse")
    void addCoursetoStudent(TestReporter reporter) {

        reporter.publishEntry("StartTİme: ", LocalDateTime.now().toString());
        assertEquals("Aleyna", student.getName());
        reporter.publishEntry("EndTime: ", LocalDateTime.now().toString());

    }
}
