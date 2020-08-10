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
@Table(name = "tbUserNoti")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbUserNoti.findAll", query = "SELECT t FROM TbUserNoti t"),
    @NamedQuery(name = "TbUserNoti.findById", query = "SELECT t FROM TbUserNoti t WHERE t.id = :id"),
    @NamedQuery(name = "TbUserNoti.findByContent", query = "SELECT t FROM TbUserNoti t WHERE t.content = :content"),
    @NamedQuery(name = "TbUserNoti.findByDueDate", query = "SELECT t FROM TbUserNoti t WHERE t.dueDate = :dueDate"),
    @NamedQuery(name = "TbUserNoti.findByInsertAt", query = "SELECT t FROM TbUserNoti t WHERE t.insertAt = :insertAt"),
    @NamedQuery(name = "TbUserNoti.findByUpdateAt", query = "SELECT t FROM TbUserNoti t WHERE t.updateAt = :updateAt"),
    @NamedQuery(name = "TbUserNoti.findByStatus", query = "SELECT t FROM TbUserNoti t WHERE t.status = :status")})
public class TbUserNoti implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3000)
    @Column(name = "Content")
    private String content;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DueDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dueDate;
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
    @JoinColumn(name = "Username", referencedColumnName = "UserName")
    @ManyToOne(optional = false)
    private TbUser username;

    public TbUserNoti() {
    }

    public TbUserNoti(Integer id) {
        this.id = id;
    }

    public TbUserNoti(Integer id, String content, Date dueDate, Date insertAt, Date updateAt, boolean status) {
        this.id = id;
        this.content = content;
        this.dueDate = dueDate;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
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

    public TbUser getUsername() {
        return username;
    }

    public void setUsername(TbUser username) {
        this.username = username;
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
        if (!(object instanceof TbUserNoti)) {
            return false;
        }
        TbUserNoti other = (TbUserNoti) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbUserNoti[ id=" + id + " ]";
    }
    
}
