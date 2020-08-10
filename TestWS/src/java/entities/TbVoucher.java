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
@Table(name = "tbVoucher")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbVoucher.findAll", query = "SELECT t FROM TbVoucher t"),
    @NamedQuery(name = "TbVoucher.findById", query = "SELECT t FROM TbVoucher t WHERE t.id = :id"),
    @NamedQuery(name = "TbVoucher.findByCode", query = "SELECT t FROM TbVoucher t WHERE t.code = :code"),
    @NamedQuery(name = "TbVoucher.findByStartDate", query = "SELECT t FROM TbVoucher t WHERE t.startDate = :startDate"),
    @NamedQuery(name = "TbVoucher.findByEndDate", query = "SELECT t FROM TbVoucher t WHERE t.endDate = :endDate"),
    @NamedQuery(name = "TbVoucher.findByType", query = "SELECT t FROM TbVoucher t WHERE t.type = :type"),
    @NamedQuery(name = "TbVoucher.findByFixAmount", query = "SELECT t FROM TbVoucher t WHERE t.fixAmount = :fixAmount"),
    @NamedQuery(name = "TbVoucher.findByMinRequire", query = "SELECT t FROM TbVoucher t WHERE t.minRequire = :minRequire"),
    @NamedQuery(name = "TbVoucher.findByMaxAmount", query = "SELECT t FROM TbVoucher t WHERE t.maxAmount = :maxAmount"),
    @NamedQuery(name = "TbVoucher.findByPercent", query = "SELECT t FROM TbVoucher t WHERE t.percent = :percent"),
    @NamedQuery(name = "TbVoucher.findByQuantity", query = "SELECT t FROM TbVoucher t WHERE t.quantity = :quantity"),
    @NamedQuery(name = "TbVoucher.findByInsertAt", query = "SELECT t FROM TbVoucher t WHERE t.insertAt = :insertAt"),
    @NamedQuery(name = "TbVoucher.findByUpdateAt", query = "SELECT t FROM TbVoucher t WHERE t.updateAt = :updateAt"),
    @NamedQuery(name = "TbVoucher.findByStatus", query = "SELECT t FROM TbVoucher t WHERE t.status = :status")})
public class TbVoucher implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Code")
    private String code;
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
    @Column(name = "Type")
    private boolean type;
    @Column(name = "FixAmount")
    private Integer fixAmount;
    @Column(name = "MinRequire")
    private Integer minRequire;
    @Column(name = "MaxAmount")
    private Integer maxAmount;
    @Column(name = "Percent")
    private Short percent;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Quantity")
    private int quantity;
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
    @OneToMany(mappedBy = "voucherID")
    private Collection<TbOrder> tbOrderCollection;

    public TbVoucher() {
    }

    public TbVoucher(Integer id) {
        this.id = id;
    }

    public TbVoucher(Integer id, String code, Date startDate, Date endDate, boolean type, int quantity, Date insertAt, Date updateAt, boolean status) {
        this.id = id;
        this.code = code;
        this.startDate = startDate;
        this.endDate = endDate;
        this.type = type;
        this.quantity = quantity;
        this.insertAt = insertAt;
        this.updateAt = updateAt;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public boolean getType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public Integer getFixAmount() {
        return fixAmount;
    }

    public void setFixAmount(Integer fixAmount) {
        this.fixAmount = fixAmount;
    }

    public Integer getMinRequire() {
        return minRequire;
    }

    public void setMinRequire(Integer minRequire) {
        this.minRequire = minRequire;
    }

    public Integer getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(Integer maxAmount) {
        this.maxAmount = maxAmount;
    }

    public Short getPercent() {
        return percent;
    }

    public void setPercent(Short percent) {
        this.percent = percent;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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

    @XmlTransient
    public Collection<TbOrder> getTbOrderCollection() {
        return tbOrderCollection;
    }

    public void setTbOrderCollection(Collection<TbOrder> tbOrderCollection) {
        this.tbOrderCollection = tbOrderCollection;
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
        if (!(object instanceof TbVoucher)) {
            return false;
        }
        TbVoucher other = (TbVoucher) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbVoucher[ id=" + id + " ]";
    }
    
}
