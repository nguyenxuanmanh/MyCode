/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author NK
 */
@Entity
@Table(name = "tbEvent")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbEvent.findAll", query = "SELECT t FROM TbEvent t"),
    @NamedQuery(name = "TbEvent.findByEventID", query = "SELECT t FROM TbEvent t WHERE t.eventID = :eventID"),
    @NamedQuery(name = "TbEvent.findByBrand", query = "SELECT t FROM TbEvent t WHERE t.brand = :brand"),
    @NamedQuery(name = "TbEvent.findByCategory", query = "SELECT t FROM TbEvent t WHERE t.category = :category"),
    @NamedQuery(name = "TbEvent.findByEventName", query = "SELECT t FROM TbEvent t WHERE t.eventName = :eventName"),
    @NamedQuery(name = "TbEvent.findByDescription", query = "SELECT t FROM TbEvent t WHERE t.description = :description"),
    @NamedQuery(name = "TbEvent.findByStartDate", query = "SELECT t FROM TbEvent t WHERE t.startDate = :startDate"),
    @NamedQuery(name = "TbEvent.findByEndDate", query = "SELECT t FROM TbEvent t WHERE t.endDate = :endDate"),
    @NamedQuery(name = "TbEvent.findByAmount", query = "SELECT t FROM TbEvent t WHERE t.amount = :amount"),
    @NamedQuery(name = "TbEvent.findByMin", query = "SELECT t FROM TbEvent t WHERE t.min = :min"),
    @NamedQuery(name = "TbEvent.findByMax", query = "SELECT t FROM TbEvent t WHERE t.max = :max"),
    @NamedQuery(name = "TbEvent.findByType", query = "SELECT t FROM TbEvent t WHERE t.type = :type"),
    @NamedQuery(name = "TbEvent.findByInsertAt", query = "SELECT t FROM TbEvent t WHERE t.insertAt = :insertAt"),
    @NamedQuery(name = "TbEvent.findByUpdateAt", query = "SELECT t FROM TbEvent t WHERE t.updateAt = :updateAt"),
    @NamedQuery(name = "TbEvent.findByQuantity", query = "SELECT t FROM TbEvent t WHERE t.quantity = :quantity"),
    @NamedQuery(name = "TbEvent.findByStatus", query = "SELECT t FROM TbEvent t WHERE t.status = :status")})
public class TbEvent implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "EventID")
    private Integer eventID;
    @Size(max = 500)
    @Column(name = "Brand")
    private String brand;
    @Size(max = 500)
    @Column(name = "Category")
    private String category;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "EventName")
    private String eventName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3000)
    @Column(name = "Description")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Column(name = "StartDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EndDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Amount")
    private int amount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Min")
    private int min;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Max")
    private int max;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Type")
    private String type;
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "Status")
    private boolean status;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "eventID")
    private Collection<TbEventDetails> tbEventDetailsCollection;

    public TbEvent() {
    }

    public TbEvent(Integer eventID) {
        this.eventID = eventID;
    }

    public TbEvent(Integer eventID, String eventName, String description, Date startDate, Date endDate, int amount, int min, int max, String type, Date insertAt, Date updateAt, int quantity, boolean status) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.amount = amount;
        this.min = min;
        this.max = max;
        this.type = type;
        this.insertAt = insertAt;
        this.updateAt = updateAt;
        this.quantity = quantity;
        this.status = status;
    }

    public Integer getEventID() {
        return eventID;
    }

    public void setEventID(Integer eventID) {
        this.eventID = eventID;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @XmlTransient
    public Collection<TbEventDetails> getTbEventDetailsCollection() {
        return tbEventDetailsCollection;
    }

    public void setTbEventDetailsCollection(Collection<TbEventDetails> tbEventDetailsCollection) {
        this.tbEventDetailsCollection = tbEventDetailsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eventID != null ? eventID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbEvent)) {
            return false;
        }
        TbEvent other = (TbEvent) object;
        if ((this.eventID == null && other.eventID != null) || (this.eventID != null && !this.eventID.equals(other.eventID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbEvent[ eventID=" + eventID + " ]";
    }
    
}
