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
@Table(name = "tbEventDetails")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbEventDetails.findAll", query = "SELECT t FROM TbEventDetails t"),
    @NamedQuery(name = "TbEventDetails.findById", query = "SELECT t FROM TbEventDetails t WHERE t.id = :id"),
    @NamedQuery(name = "TbEventDetails.findByAmount", query = "SELECT t FROM TbEventDetails t WHERE t.amount = :amount"),
    @NamedQuery(name = "TbEventDetails.findByPercent", query = "SELECT t FROM TbEventDetails t WHERE t.percent = :percent"),
    @NamedQuery(name = "TbEventDetails.findByStatus", query = "SELECT t FROM TbEventDetails t WHERE t.status = :status"),
    @NamedQuery(name = "TbEventDetails.findByInsertAt", query = "SELECT t FROM TbEventDetails t WHERE t.insertAt = :insertAt"),
    @NamedQuery(name = "TbEventDetails.findByUpdateAt", query = "SELECT t FROM TbEventDetails t WHERE t.updateAt = :updateAt"),
    @NamedQuery(name = "TbEventDetails.findByQuantity", query = "SELECT t FROM TbEventDetails t WHERE t.quantity = :quantity")})
public class TbEventDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Amount")
    private int amount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Percent")
    private short percent;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Status")
    private boolean status;
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
    @Column(name = "Quantity")
    private int quantity;
    @JoinColumn(name = "EventID", referencedColumnName = "EventID")
    @ManyToOne(optional = false)
    private TbEvent eventID;
    @JoinColumn(name = "ProductID", referencedColumnName = "ProductID")
    @ManyToOne(optional = false)
    private TbProduct productID;

    public TbEventDetails() {
    }

    public TbEventDetails(Integer id) {
        this.id = id;
    }

    public TbEventDetails(Integer id, int amount, short percent, boolean status, Date insertAt, Date updateAt, int quantity) {
        this.id = id;
        this.amount = amount;
        this.percent = percent;
        this.status = status;
        this.insertAt = insertAt;
        this.updateAt = updateAt;
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public short getPercent() {
        return percent;
    }

    public void setPercent(short percent) {
        this.percent = percent;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public TbEvent getEventID() {
        return eventID;
    }

    public void setEventID(TbEvent eventID) {
        this.eventID = eventID;
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
        if (!(object instanceof TbEventDetails)) {
            return false;
        }
        TbEventDetails other = (TbEventDetails) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbEventDetails[ id=" + id + " ]";
    }
    
}
