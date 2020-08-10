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
@Table(name = "tbWishListDetails")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbWishListDetails.findAll", query = "SELECT t FROM TbWishListDetails t"),
    @NamedQuery(name = "TbWishListDetails.findById", query = "SELECT t FROM TbWishListDetails t WHERE t.id = :id"),
    @NamedQuery(name = "TbWishListDetails.findByInsertAt", query = "SELECT t FROM TbWishListDetails t WHERE t.insertAt = :insertAt"),
    @NamedQuery(name = "TbWishListDetails.findByUpdateAt", query = "SELECT t FROM TbWishListDetails t WHERE t.updateAt = :updateAt")})
public class TbWishListDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
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
    @JoinColumn(name = "ProductID", referencedColumnName = "ProductID")
    @ManyToOne(optional = false)
    private TbProduct productID;
    @JoinColumn(name = "WLID", referencedColumnName = "WLID")
    @ManyToOne(optional = false)
    private TbWishList wlid;

    public TbWishListDetails() {
    }

    public TbWishListDetails(Integer id) {
        this.id = id;
    }

    public TbWishListDetails(Integer id, Date insertAt, Date updateAt) {
        this.id = id;
        this.insertAt = insertAt;
        this.updateAt = updateAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public TbProduct getProductID() {
        return productID;
    }

    public void setProductID(TbProduct productID) {
        this.productID = productID;
    }

    public TbWishList getWlid() {
        return wlid;
    }

    public void setWlid(TbWishList wlid) {
        this.wlid = wlid;
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
        if (!(object instanceof TbWishListDetails)) {
            return false;
        }
        TbWishListDetails other = (TbWishListDetails) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbWishListDetails[ id=" + id + " ]";
    }
    
}
