package com.example.students_management_system;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {

    @Column
    public int studentId;

    @Column
    public String studentName;

    @Column
    public int feeduse;

}
