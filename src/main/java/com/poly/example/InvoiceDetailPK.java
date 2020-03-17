/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.example;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author THANHLONG
 */
@Embeddable
public class InvoiceDetailPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "invoice_id")
    private int invoiceId;
    @Basic(optional = false)
    @Column(name = "product_id")
    private String productId;

    public InvoiceDetailPK() {
    }

    public InvoiceDetailPK(int invoiceId, String productId) {
        this.invoiceId = invoiceId;
        this.productId = productId;
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) invoiceId;
        hash += (productId != null ? productId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvoiceDetailPK)) {
            return false;
        }
        InvoiceDetailPK other = (InvoiceDetailPK) object;
        if (this.invoiceId != other.invoiceId) {
            return false;
        }
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.InvoiceDetailPK[ invoiceId=" + invoiceId + ", productId=" + productId + " ]";
    }
    
}
