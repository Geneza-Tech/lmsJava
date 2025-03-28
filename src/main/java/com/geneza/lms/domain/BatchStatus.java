package com.geneza.lms.domain;
import java.io.Serializable;
import java.lang.StringBuilder;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.persistence.Id;
import java.util.Date;
import java.math.*;
import javax.xml.bind.annotation.*;
import javax.persistence.*;

/**
 * BatchStatus Entity
 * 
 * Generated by Dunamis App Generator
 */

@Entity
@Table(name = "batchstatus")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "GenezaRest/com/geneza/lms/domain", name = "batchstatus")
public class BatchStatus implements Serializable {
    private static final long serialVersionUID = 1L;


    @Column(name = "id")
    @Basic(fetch = FetchType.EAGER)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @XmlElement
    private Integer id;  
    @Column(name = "batchStatus")
    @Basic(fetch = FetchType.EAGER)
    @XmlElement
    private String batchStatus;
    


    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

        
    public String getBatchStatus() {
        return batchStatus;
    }
    
    public void setBatchStatus(String batchStatus) {
        this.batchStatus = batchStatus;
    }


    public BatchStatus() {
    }


    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("id=[").append(id).append("] ");
        return buffer.toString();
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (int) (prime * result + ((id == null) ? 0 : id.hashCode()));
        return result;
    }


    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof BatchStatus))
            return false;
        BatchStatus equalCheck = (BatchStatus) obj;
        if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
            return false;
        if (id != null && !id.equals(equalCheck.id))
            return false;
        return true;
    }

}