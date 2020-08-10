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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "tbFinancialPaper")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbFinancialPaper.findAll", query = "SELECT t FROM TbFinancialPaper t"),
    @NamedQuery(name = "TbFinancialPaper.findByFinancialID", query = "SELECT t FROM TbFinancialPaper t WHERE t.financialID = :financialID"),
    @NamedQuery(name = "TbFinancialPaper.findByType", query = "SELECT t FROM TbFinancialPaper t WHERE t.type = :type"),
    @NamedQuery(name = "TbFinancialPaper.findByInsertAt", query = "SELECT t FROM TbFinancialPaper t WHERE t.insertAt = :insertAt"),
    @NamedQuery(name = "TbFinancialPaper.findByUpdateAt", query = "SELECT t FROM TbFinancialPaper t WHERE t.updateAt = :updateAt"),
    @NamedQuery(name = "TbFinancialPaper.findByEmployeeName", query = "SELECT t FROM TbFinancialPaper t WHERE t.employeeName = :employeeName"),
    @NamedQuery(name = "TbFinancialPaper.findByShippingFee", query = "SELECT t FROM TbFinancialPaper t WHERE t.shippingFee = :shippingFee"),
    @NamedQuery(name = "TbFinancialPaper.findByPartner", query = "SELECT t FROM TbFinancialPaper t WHERE t.partner = :partner"),
    @NamedQuery(name = "TbFinancialPaper.findByStatus", query = "SELECT t FROM TbFinancialPaper t WHERE t.status = :status")})
public class TbFinancialPaper implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Financial_ID")
    private Integer financialID;
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
    @Size(min = 1, max = 100)
    @Column(name = "EmployeeName")
    private String employeeName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ShippingFee")
    private int shippingFee;
    @Size(max = 500)
    @Column(name = "Partner")
    private String partner;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Status")
    private boolean status;
    @JoinColumn(name = "OrderID", referencedColumnName = "OrderID")
    @ManyToOne
    private TbOrder orderID;
    @JoinColumn(name = "WareHouseID", referencedColumnName = "WareHouseID")
    @ManyToOne(optional = false)
    private TbWareHouse wareHouseID;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "financialID")
    private Collection<TbExImport> tbExImportCollection;

    public TbFinancialPaper() {
    }

    public TbFinancialPaper(Integer financialID) {
        this.financialID = financialID;
    }

    public TbFinancialPaper(Integer financialID, String type, Date insertAt, Date updateAt, String employeeName, int shippingFee, boolean status) {
        this.financialID = financialID;
        this.type = type;
        this.insertAt = insertAt;
        this.updateAt = updateAt;
        this.employeeName = employeeName;
        this.shippingFee = shippingFee;
        this.status = status;
    }

    public Integer getFinancialID() {
        return financialID;
    }

    public void setFinancialID(Integer financialID) {
        this.financialID = financialID;
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

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(int shippingFee) {
        this.shippingFee = shippingFee;
    }

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner;
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

    public TbWareHouse getWareHouseID() {
        return wareHouseID;
    }

    public void setWareHouseID(TbWareHouse wareHouseID) {
        this.wareHouseID = wareHouseID;
    }

    @XmlTransient
    public Collection<TbExImport> getTbExImportCollection() {
        return tbExImportCollection;
    }

    public void setTbExImportCollection(Collection<TbExImport> tbExImportCollection) {
        this.tbExImportCollection = tbExImportCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (financialID != null ? financialID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbFinancialPaper)) {
            return false;
        }
        TbFinancialPaper other = (TbFinancialPaper) object;
        if ((this.financialID == null && other.financialID != null) || (this.financialID != null && !this.financialID.equals(other.financialID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbFinancialPaper[ financialID=" + financialID + " ]";
    }
    
}
