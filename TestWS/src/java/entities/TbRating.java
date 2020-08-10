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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author NK
 */
@Entity
@Table(name = "tbRating")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbRating.findAll", query = "SELECT t FROM TbRating t"),
    @NamedQuery(name = "TbRating.findByRateID", query = "SELECT t FROM TbRating t WHERE t.rateID = :rateID"),
    @NamedQuery(name = "TbRating.findByStatus", query = "SELECT t FROM TbRating t WHERE t.status = :status"),
    @NamedQuery(name = "TbRating.findByRatingPoint", query = "SELECT t FROM TbRating t WHERE t.ratingPoint = :ratingPoint"),
    @NamedQuery(name = "TbRating.findByContent", query = "SELECT t FROM TbRating t WHERE t.content = :content"),
    @NamedQuery(name = "TbRating.findByLayer", query = "SELECT t FROM TbRating t WHERE t.layer = :layer"),
    @NamedQuery(name = "TbRating.findByInsertAt", query = "SELECT t FROM TbRating t WHERE t.insertAt = :insertAt"),
    @NamedQuery(name = "TbRating.findByUpdateAt", query = "SELECT t FROM TbRating t WHERE t.updateAt = :updateAt")})
public class TbRating implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "RateID")
    private Integer rateID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Status")
    private boolean status;
    @Basic(optional = false)
    @NotNull
    @Column(name = "RatingPoint")
    private short ratingPoint;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3000)
    @Column(name = "Content")
    private String content;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Layer")
    private short layer;
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
    @JoinColumn(name = "UserName", referencedColumnName = "UserName")
    @ManyToOne(optional = false)
    private TbUser userName;

    public TbRating() {
    }

    public TbRating(Integer rateID) {
        this.rateID = rateID;
    }

    public TbRating(Integer rateID, boolean status, short ratingPoint, String content, short layer, Date insertAt, Date updateAt) {
        this.rateID = rateID;
        this.status = status;
        this.ratingPoint = ratingPoint;
        this.content = content;
        this.layer = layer;
        this.insertAt = insertAt;
        this.updateAt = updateAt;
    }

    public Integer getRateID() {
        return rateID;
    }

    public void setRateID(Integer rateID) {
        this.rateID = rateID;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public short getRatingPoint() {
        return ratingPoint;
    }

    public void setRatingPoint(short ratingPoint) {
        this.ratingPoint = ratingPoint;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public short getLayer() {
        return layer;
    }

    public void setLayer(short layer) {
        this.layer = layer;
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

    public TbUser getUserName() {
        return userName;
    }

    public void setUserName(TbUser userName) {
        this.userName = userName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rateID != null ? rateID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbRating)) {
            return false;
        }
        TbRating other = (TbRating) object;
        if ((this.rateID == null && other.rateID != null) || (this.rateID != null && !this.rateID.equals(other.rateID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbRating[ rateID=" + rateID + " ]";
    }
    
}
