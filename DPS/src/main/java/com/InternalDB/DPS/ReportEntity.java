package com.InternalDB.DPS;
import jakarta.persistence.*;
import lombok.Data;

import java.sql.Blob;

@Entity
@Data
@Table(name = "Report")
public class ReportEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "Report_ID")
        private Integer Report_Id;

        @ManyToOne
        @JoinColumn(name = "Scan_ID", nullable = false)
        private ScanEntity scan_Id;

        @ManyToOne
        @JoinColumn(name = "Datastore_ID", nullable = false)
        private InternalDB datastore_id;
g
        @Lob
        @Column(name = "ReportContent", nullable = false)
        private Blob reportContent;

        // Constructors, getters, and setters...
 }

