/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author NK
 */
@Entity
@Table(name = "tbOrderDetails")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbOrderDetails.findAll", query = "SELECT t FROM TbOrderDetails t"),
    @NamedQuery(name = "TbOrderDetails.findById", query = "SELECT t FROM TbOrderDetails t WHERE t.id = :id"),
    @NamedQuery(name = "TbOrderDetails.findByQuantity", query = "SELECT t FROM TbOrderDetails t WHERE t.quantity = :quantity"),
    @NamedQuery(name = "TbOrderDetails.findBySubtotal", query = "SELECT t FROM TbOrderDetails t WHERE t.subtotal = :subtotal"),
    @NamedQuery(name = "TbOrderDetails.findByInsertAt", query = "SELECT t FROM TbOrderDetails t WHERE t.insertAt = :insertAt"),
    @NamedQuery(name = "TbOrderDetails.findByUpdateAt", query = "SELECT t FROM TbOrderDetails t WHERE t.updateAt = :updateAt"),
    @NamedQuery(name = "TbOrderDetails.findByStatus", query = "SELECT t FROM TbOrderDetails t WHERE t.status = :status")})
public class TbOrderDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Quantity")
    private int quantity;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Subtotal")
    private long subtotal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "InsertAt")
    @Temporal(TemporalType.TIMESTAMP)
    private Date insertAt;
    @Basic(optional = false)
    @NotNull
    @Column(name = "UpdateAt")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateAt;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Status")
    private boolean status;
    @JoinColumn(name = "OrderID", referencedColumnName = "OrderID")
    @ManyToOne(optional = false)
    private TbOrder orderID;
    @JoinColumn(name = "ProductID", referencedColumnName = "ProductID")
    @ManyToOne(optional = false)
    private TbProduct productID;

    public TbOrderDetails() {
    }

    public TbOrderDetails(Long id) {
        this.id = id;
    }

    public TbOrderDetails(Long id, int quantity, long subtotal, Date insertAt, Date updateAt, boolean status) {
        this.id = id;
        this.quantity = quantity;
        this.subtotal = subtotal;
        this.insertAt = insertAt;
        this.updateAt = updateAt;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public long getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(long subtotal) {
        this.subtotal = subtotal;
    }

    public Date getInsertAt() {
        return insertAt;
    }

    public void setInsertAt(Date insertAt) {
        this.insertAt = insertAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public TbOrder getOrderID() {
        return orderID;
    }

    public void setOrderID(TbOrder orderID) {
        this.orderID = orderID;
    }

    public TbProduct getProductID() {
        return productID;
    }

    public void setProductID(TbProduct productID) {
        this.productID = productID;
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
        if (!(object instanceof TbOrderDetails)) {
            return false;
        }
        TbOrderDetails other = (TbOrderDetails) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbOrderDetails[ id=" + id + " ]";
    }
    
}
