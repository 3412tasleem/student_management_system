package com.example.students_management_system;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name= "Admin")
public class Admin {
    @Id
    @Column
    public int AdminId;

    @Column
    public String AdminName;

    @Column
    public int Password;
}
