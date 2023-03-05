package com.example.students_management_system;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name= "Course")
public class Course {
    @Id
    @Column
    public int CourseId;

    @Column
    public String CourseName;

    @Column
    public int Duration;
}
