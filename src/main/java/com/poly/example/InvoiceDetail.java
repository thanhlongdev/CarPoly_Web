/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.example;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author THANHLONG
 */
@Entity
@Table(name = "InvoiceDetail")
public class InvoiceDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvoiceDetailPK invoiceDetailPK;
    @Basic(optional = false)
    @Column(name = "quantity")
    private int quantity;
    @JoinColumn(name = "invoice_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Invoices invoices;
    @JoinColumn(name = "product_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Products products;

    public InvoiceDetail() {
    }

    public InvoiceDetail(InvoiceDetailPK invoiceDetailPK) {
        this.invoiceDetailPK = invoiceDetailPK;
    }

    public InvoiceDetail(InvoiceDetailPK invoiceDetailPK, int quantity) {
        this.invoiceDetailPK = invoiceDetailPK;
        this.quantity = quantity;
    }

    public InvoiceDetail(int invoiceId, String productId) {
        this.invoiceDetailPK = new InvoiceDetailPK(invoiceId, productId);
    }

    public InvoiceDetailPK getInvoiceDetailPK() {
        return invoiceDetailPK;
    }

    public void setInvoiceDetailPK(InvoiceDetailPK invoiceDetailPK) {
        this.invoiceDetailPK = invoiceDetailPK;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Invoices getInvoices() {
        return invoices;
    }

    public void setInvoices(Invoices invoices) {
        this.invoices = invoices;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invoiceDetailPK != null ? invoiceDetailPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvoiceDetail)) {
            return false;
        }
        InvoiceDetail other = (InvoiceDetail) object;
        if ((this.invoiceDetailPK == null && other.invoiceDetailPK != null) || (this.invoiceDetailPK != null && !this.invoiceDetailPK.equals(other.invoiceDetailPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.InvoiceDetail[ invoiceDetailPK=" + invoiceDetailPK + " ]";
    }
    
}
