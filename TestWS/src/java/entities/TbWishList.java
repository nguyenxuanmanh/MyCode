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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author NK
 */
@Entity
@Table(name = "tbWishList")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbWishList.findAll", query = "SELECT t FROM TbWishList t"),
    @NamedQuery(name = "TbWishList.findByWlid", query = "SELECT t FROM TbWishList t WHERE t.wlid = :wlid"),
    @NamedQuery(name = "TbWishList.findByType", query = "SELECT t FROM TbWishList t WHERE t.type = :type"),
    @NamedQuery(name = "TbWishList.findByInsertAt", query = "SELECT t FROM TbWishList t WHERE t.insertAt = :insertAt"),
    @NamedQuery(name = "TbWishList.findByUpdateAt", query = "SELECT t FROM TbWishList t WHERE t.updateAt = :updateAt")})
public class TbWishList implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "WLID")
    private Integer wlid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Type")
    private boolean type;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "wlid")
    private Collection<TbWishListDetails> tbWishListDetailsCollection;
    @JoinColumn(name = "UserName", referencedColumnName = "UserName")
    @ManyToOne(optional = false)
    private TbUser userName;

    public TbWishList() {
    }

    public TbWishList(Integer wlid) {
        this.wlid = wlid;
    }

    public TbWishList(Integer wlid, boolean type, Date insertAt, Date updateAt) {
        this.wlid = wlid;
        this.type = type;
        this.insertAt = insertAt;
        this.updateAt = updateAt;
    }

    public Integer getWlid() {
        return wlid;
    }

    public void setWlid(Integer wlid) {
        this.wlid = wlid;
    }

    public boolean getType() {
        return type;
    }

    public void setType(boolean type) {
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

    @XmlTransient
    public Collection<TbWishListDetails> getTbWishListDetailsCollection() {
        return tbWishListDetailsCollection;
    }

    public void setTbWishListDetailsCollection(Collection<TbWishListDetails> tbWishListDetailsCollection) {
        this.tbWishListDetailsCollection = tbWishListDetailsCollection;
    }

    public TbUser getUserName() {
        return userName;
    }

    public void setUserName(TbUser userName) {
        this.userName = userName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (wlid != null ? wlid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbWishList)) {
            return false;
        }
        TbWishList other = (TbWishList) object;
        if ((this.wlid == null && other.wlid != null) || (this.wlid != null && !this.wlid.equals(other.wlid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbWishList[ wlid=" + wlid + " ]";
    }
    
}
