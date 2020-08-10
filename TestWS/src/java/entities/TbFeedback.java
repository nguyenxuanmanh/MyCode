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
@Table(name = "tbFeedback")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbFeedback.findAll", query = "SELECT t FROM TbFeedback t"),
    @NamedQuery(name = "TbFeedback.findByFid", query = "SELECT t FROM TbFeedback t WHERE t.fid = :fid"),
    @NamedQuery(name = "TbFeedback.findByContent", query = "SELECT t FROM TbFeedback t WHERE t.content = :content"),
    @NamedQuery(name = "TbFeedback.findByTitle", query = "SELECT t FROM TbFeedback t WHERE t.title = :title"),
    @NamedQuery(name = "TbFeedback.findByType", query = "SELECT t FROM TbFeedback t WHERE t.type = :type"),
    @NamedQuery(name = "TbFeedback.findByReplyContent", query = "SELECT t FROM TbFeedback t WHERE t.replyContent = :replyContent"),
    @NamedQuery(name = "TbFeedback.findByInsertAt", query = "SELECT t FROM TbFeedback t WHERE t.insertAt = :insertAt"),
    @NamedQuery(name = "TbFeedback.findByUpdateAt", query = "SELECT t FROM TbFeedback t WHERE t.updateAt = :updateAt")})
public class TbFeedback implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "FID")
    private Integer fid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3000)
    @Column(name = "Content")
    private String content;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3000)
    @Column(name = "Title")
    private String title;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3000)
    @Column(name = "Type")
    private String type;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3000)
    @Column(name = "ReplyContent")
    private String replyContent;
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
    @JoinColumn(name = "ReplyBy", referencedColumnName = "AdminID")
    @ManyToOne(optional = false)
    private TbAdmin replyBy;
    @JoinColumn(name = "OrderID", referencedColumnName = "OrderID")
    @ManyToOne(optional = false)
    private TbOrder orderID;
    @JoinColumn(name = "Username", referencedColumnName = "UserName")
    @ManyToOne(optional = false)
    private TbUser username;

    public TbFeedback() {
    }

    public TbFeedback(Integer fid) {
        this.fid = fid;
    }

    public TbFeedback(Integer fid, String content, String title, String type, String replyContent, Date insertAt, Date updateAt) {
        this.fid = fid;
        this.content = content;
        this.title = title;
        this.type = type;
        this.replyContent = replyContent;
        this.insertAt = insertAt;
        this.updateAt = updateAt;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
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

    public TbAdmin getReplyBy() {
        return replyBy;
    }

    public void setReplyBy(TbAdmin replyBy) {
        this.replyBy = replyBy;
    }

    public TbOrder getOrderID() {
        return orderID;
    }

    public void setOrderID(TbOrder orderID) {
        this.orderID = orderID;
    }

    public TbUser getUsername() {
        return username;
    }

    public void setUsername(TbUser username) {
        this.username = username;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fid != null ? fid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbFeedback)) {
            return false;
        }
        TbFeedback other = (TbFeedback) object;
        if ((this.fid == null && other.fid != null) || (this.fid != null && !this.fid.equals(other.fid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbFeedback[ fid=" + fid + " ]";
    }
    
}
