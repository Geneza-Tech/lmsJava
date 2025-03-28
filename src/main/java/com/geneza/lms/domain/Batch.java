package com.geneza.lms.domain;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Batch Entity
 * 
 * Generated by Dunamis App Generator
 */

@Entity
@Table(name = "batch") // Changed to lowercase to match PostgreSQL naming conventions
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "GenezaRest/com/geneza/lms/domain", name = "batch")
public class Batch implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;  // Changed from Integer to Long

    @Column(name = "batch")
    private String batch;

    @Column(name = "start_date") // Changed to snake_case to match PostgreSQL conventions
    private Date startDate;

    @Column(name = "location")
    private String location;

    @ManyToOne
    @JoinColumn(name = "course_id") // Changed column name for consistency
    private Course course;

    @ManyToOne
    @JoinColumn(name = "country_id") // Changed column name for consistency
    private Country country;

    @ManyToOne
    @JoinColumn(name = "batch_status_id") // Changed column name for consistency
    private BatchStatus batchStatus;

    // Constructors
    public Batch() {}

    // Getters and Setters
    public Long getId() { return id; } // Changed return type to Long
    public void setId(Long id) { this.id = id; }

    public String getBatch() { return batch; }
    public void setBatch(String batch) { this.batch = batch; }

    public Date getStartDate() { return startDate; }
    public void setStartDate(Date startDate) { this.startDate = startDate; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public Course getCourse() { return course; }
    public void setCourse(Course course) { this.course = course; }

    public Country getCountry() { return country; }
    public void setCountry(Country country) { this.country = country; }

    public BatchStatus getBatchStatus() { return batchStatus; }
    public void setBatchStatus(BatchStatus batchStatus) { this.batchStatus = batchStatus; }

    // toString() Method
    @Override
    public String toString() {
        return "batch{id=" + id + ", batch='" + batch + "', startDate=" + startDate + ", location='" + location + "'}";
    }

    // hashCode and equals Methods
    @Override
    public int hashCode() {
        return (id == null) ? 0 : id.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Batch batch = (Batch) obj;
        return id != null && id.equals(batch.id);
    }

    public Batch orElseThrow(Object object) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'orElseThrow'");
    }
}
