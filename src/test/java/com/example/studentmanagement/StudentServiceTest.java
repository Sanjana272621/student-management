package com.example.studentmanagement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    @Test
    void shouldAddStudent() {

        StudentService service = new StudentService();

        Student student =
                new Student(1, "Sanjana", "CSE");

        Student result = service.addStudent(student);

        assertEquals(1, result.getId());
        assertEquals("Sanjana", result.getName());
        assertEquals("CSE", result.getDepartment());

        assertEquals(1, service.getStudents().size());
    }
}