package com.InternalDB.DPS;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.mapping.PrimaryKey;

import java.sql.Time;

@Entity
@Data
@Table(name ="Datastore")
public class InternalDB {
    @Id
    @Column(name="ID")
    private int id ;

    @Column(name="TYPE")
    private String Type;

    @Column(name="NAME")
    private String name;

    @Column(name = "Details")
    private String Detatils;

    @Column(name = "CreatedAt")
    private Time CreatedAt;
}
