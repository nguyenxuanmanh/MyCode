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
@Table(name = "tbWareHouse")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbWareHouse.findAll", query = "SELECT t FROM TbWareHouse t"),
    @NamedQuery(name = "TbWareHouse.findByWareHouseID", query = "SELECT t FROM TbWareHouse t WHERE t.wareHouseID = :wareHouseID"),
    @NamedQuery(name = "TbWareHouse.findByName", query = "SELECT t FROM TbWareHouse t WHERE t.name = :name"),
    @NamedQuery(name = "TbWareHouse.findByAddress", query = "SELECT t FROM TbWareHouse t WHERE t.address = :address"),
    @NamedQuery(name = "TbWareHouse.findByInsertAt", query = "SELECT t FROM TbWareHouse t WHERE t.insertAt = :insertAt"),
    @NamedQuery(name = "TbWareHouse.findByUpdateAt", query = "SELECT t FROM TbWareHouse t WHERE t.updateAt = :updateAt"),
    @NamedQuery(name = "TbWareHouse.findByStatus", query = "SELECT t FROM TbWareHouse t WHERE t.status = :status")})
public class TbWareHouse implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "WareHouseID")
    private Integer wareHouseID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "Address")
    private String address;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "wareHouseID")
    private Collection<TbFinancialPaper> tbFinancialPaperCollection;

    public TbWareHouse() {
    }

    public TbWareHouse(Integer wareHouseID) {
        this.wareHouseID = wareHouseID;
    }

    public TbWareHouse(Integer wareHouseID, String name, String address, Date insertAt, Date updateAt, boolean status) {
        this.wareHouseID = wareHouseID;
        this.name = name;
        this.address = address;
        this.insertAt = insertAt;
        this.updateAt = updateAt;
        this.status = status;
    }

    public Integer getWareHouseID() {
        return wareHouseID;
    }

    public void setWareHouseID(Integer wareHouseID) {
        this.wareHouseID = wareHouseID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
    public Collection<TbFinancialPaper> getTbFinancialPaperCollection() {
        return tbFinancialPaperCollection;
    }

    public void setTbFinancialPaperCollection(Collection<TbFinancialPaper> tbFinancialPaperCollection) {
        this.tbFinancialPaperCollection = tbFinancialPaperCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (wareHouseID != null ? wareHouseID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbWareHouse)) {
            return false;
        }
        TbWareHouse other = (TbWareHouse) object;
        if ((this.wareHouseID == null && other.wareHouseID != null) || (this.wareHouseID != null && !this.wareHouseID.equals(other.wareHouseID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbWareHouse[ wareHouseID=" + wareHouseID + " ]";
    }
    
}
