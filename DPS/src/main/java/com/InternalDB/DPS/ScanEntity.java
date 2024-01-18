package com.InternalDB.DPS;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Time;

@Entity
@Data
@Table(name = "Scan")
public class ScanEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Scan_ID")
    private Integer Scan_id;

    @Column(name = "Name", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private InternalDB datastore_ID;

    @Column(name = "Status", nullable = false)
    private String status;

    @Column(name = "CreatedAt")
    private Time createdAt;

    @Column(name = "CompletedAt")
    private Time completedAt;

    // Constructors, getters, and setters...

}
