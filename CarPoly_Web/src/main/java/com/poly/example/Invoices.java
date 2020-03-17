/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.example;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author THANHLONG
 */
@Entity
@Table(name = "Invoices")
public class Invoices implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "date_create")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreate;
    @Column(name = "status")
    private Boolean status;
    @Column(name = "notes")
    private String notes;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invoices")
    private Collection<InvoiceDetail> invoiceDetailCollection;
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Customers customerId;
    @JoinColumn(name = "promotion_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Promotions promotionId;
    @JoinColumn(name = "staff_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Staffs staffId;

    public Invoices() {
    }

    public Invoices(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @XmlTransient
    public Collection<InvoiceDetail> getInvoiceDetailCollection() {
        return invoiceDetailCollection;
    }

    public void setInvoiceDetailCollection(Collection<InvoiceDetail> invoiceDetailCollection) {
        this.invoiceDetailCollection = invoiceDetailCollection;
    }

    public Customers getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customers customerId) {
        this.customerId = customerId;
    }

    public Promotions getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(Promotions promotionId) {
        this.promotionId = promotionId;
    }

    public Staffs getStaffId() {
        return staffId;
    }

    public void setStaffId(Staffs staffId) {
        this.staffId = staffId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Invoices)) {
            return false;
        }
        Invoices other = (Invoices) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Invoices[ id=" + id + " ]";
    }
    
}
