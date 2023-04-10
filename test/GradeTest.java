package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.util.UUID;
import org.junit.Test;
import backEnd.Grade;

public class GradeTest {

    
    @Test
    void testGradeDefaultConstructor() {
        Grade grade = new Grade();
        assertEquals(grade.getId(), Grade.NIL_UUID);
        assertEquals(grade.getQuizID(), Grade.NIL_UUID);
        assertEquals(Grade.getGradePercentage(), -1);
    }

    @Test
    void testGradeConstructorWithId() {
        UUID id = UUID.randomUUID();
        UUID quizID = UUID.randomUUID();
        double gradePercentage = 80.5;
        Grade grade = new Grade(id, quizID, gradePercentage);
        assertEquals(grade.getId(), id);
        assertEquals(grade.getQuizID(), quizID);
        assertEquals(Grade.getGradePercentage(), gradePercentage);
    }

    @Test
    void testGradeConstructorWithoutId() {
        UUID quizID = UUID.randomUUID();
        double gradePercentage = 70.2;
        Grade grade = new Grade(quizID, gradePercentage);
        assertNotNull(grade.getId());
        assertEquals(grade.getQuizID(), quizID);
        assertEquals(grade.getGradePercentage(), gradePercentage);
    }
}
