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
@Table(name = "tbCategory")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbCategory.findAll", query = "SELECT t FROM TbCategory t"),
    @NamedQuery(name = "TbCategory.findByCateID", query = "SELECT t FROM TbCategory t WHERE t.cateID = :cateID"),
    @NamedQuery(name = "TbCategory.findByName", query = "SELECT t FROM TbCategory t WHERE t.name = :name"),
    @NamedQuery(name = "TbCategory.findByInsertAt", query = "SELECT t FROM TbCategory t WHERE t.insertAt = :insertAt"),
    @NamedQuery(name = "TbCategory.findByUpdateAt", query = "SELECT t FROM TbCategory t WHERE t.updateAt = :updateAt"),
    @NamedQuery(name = "TbCategory.findByDescription", query = "SELECT t FROM TbCategory t WHERE t.description = :description"),
    @NamedQuery(name = "TbCategory.findByStatus", query = "SELECT t FROM TbCategory t WHERE t.status = :status")})
public class TbCategory implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CateID")
    private Integer cateID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "Name")
    private String name;
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
    @Size(min = 1, max = 3000)
    @Column(name = "Description")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Status")
    private boolean status;
    @OneToMany(mappedBy = "parentID")
    private Collection<TbCategory> tbCategoryCollection;
    @JoinColumn(name = "ParentID", referencedColumnName = "CateID")
    @ManyToOne
    private TbCategory parentID;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cateID")
    private Collection<TbProduct> tbProductCollection;

    public TbCategory() {
    }

    public TbCategory(Integer cateID) {
        this.cateID = cateID;
    }

    public TbCategory(Integer cateID, String name, Date insertAt, Date updateAt, String description, boolean status) {
        this.cateID = cateID;
        this.name = name;
        this.insertAt = insertAt;
        this.updateAt = updateAt;
        this.description = description;
        this.status = status;
    }

    public Integer getCateID() {
        return cateID;
    }

    public void setCateID(Integer cateID) {
        this.cateID = cateID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @XmlTransient
    public Collection<TbCategory> getTbCategoryCollection() {
        return tbCategoryCollection;
    }

    public void setTbCategoryCollection(Collection<TbCategory> tbCategoryCollection) {
        this.tbCategoryCollection = tbCategoryCollection;
    }

    public TbCategory getParentID() {
        return parentID;
    }

    public void setParentID(TbCategory parentID) {
        this.parentID = parentID;
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
        hash += (cateID != null ? cateID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbCategory)) {
            return false;
        }
        TbCategory other = (TbCategory) object;
        if ((this.cateID == null && other.cateID != null) || (this.cateID != null && !this.cateID.equals(other.cateID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbCategory[ cateID=" + cateID + " ]";
    }
    
}
