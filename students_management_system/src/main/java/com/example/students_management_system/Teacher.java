package com.example.students_management_system;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name= "Teacher")
public class Teacher {
    @Id
    @Column
    public int TeacherId;

    @Column
    public String TeacherName;

    @Column
    public int Education;
}
