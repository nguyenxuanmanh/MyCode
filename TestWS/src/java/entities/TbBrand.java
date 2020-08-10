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
@Table(name = "tbBrand")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbBrand.findAll", query = "SELECT t FROM TbBrand t"),
    @NamedQuery(name = "TbBrand.findByBrandID", query = "SELECT t FROM TbBrand t WHERE t.brandID = :brandID"),
    @NamedQuery(name = "TbBrand.findByBrandName", query = "SELECT t FROM TbBrand t WHERE t.brandName = :brandName"),
    @NamedQuery(name = "TbBrand.findByDescription", query = "SELECT t FROM TbBrand t WHERE t.description = :description"),
    @NamedQuery(name = "TbBrand.findByInsertAt", query = "SELECT t FROM TbBrand t WHERE t.insertAt = :insertAt"),
    @NamedQuery(name = "TbBrand.findByUpdateAt", query = "SELECT t FROM TbBrand t WHERE t.updateAt = :updateAt"),
    @NamedQuery(name = "TbBrand.findByStatus", query = "SELECT t FROM TbBrand t WHERE t.status = :status")})
public class TbBrand implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "BrandID")
    private Integer brandID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "BrandName")
    private String brandName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3000)
    @Column(name = "Description")
    private String description;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "brandID")
    private Collection<TbProduct> tbProductCollection;

    public TbBrand() {
    }

    public TbBrand(Integer brandID) {
        this.brandID = brandID;
    }

    public TbBrand(Integer brandID, String brandName, String description, Date insertAt, Date updateAt, boolean status) {
        this.brandID = brandID;
        this.brandName = brandName;
        this.description = description;
        this.insertAt = insertAt;
        this.updateAt = updateAt;
        this.status = status;
    }

    public Integer getBrandID() {
        return brandID;
    }

    public void setBrandID(Integer brandID) {
        this.brandID = brandID;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
    public Collection<TbProduct> getTbProductCollection() {
        return tbProductCollection;
    }

    public void setTbProductCollection(Collection<TbProduct> tbProductCollection) {
        this.tbProductCollection = tbProductCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (brandID != null ? brandID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbBrand)) {
            return false;
        }
        TbBrand other = (TbBrand) object;
        if ((this.brandID == null && other.brandID != null) || (this.brandID != null && !this.brandID.equals(other.brandID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbBrand[ brandID=" + brandID + " ]";
    }
    
}
