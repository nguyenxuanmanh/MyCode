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
@Table(name = "tbAdminNoti")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbAdminNoti.findAll", query = "SELECT t FROM TbAdminNoti t"),
    @NamedQuery(name = "TbAdminNoti.findById", query = "SELECT t FROM TbAdminNoti t WHERE t.id = :id"),
    @NamedQuery(name = "TbAdminNoti.findByContent", query = "SELECT t FROM TbAdminNoti t WHERE t.content = :content"),
    @NamedQuery(name = "TbAdminNoti.findByDueDate", query = "SELECT t FROM TbAdminNoti t WHERE t.dueDate = :dueDate"),
    @NamedQuery(name = "TbAdminNoti.findByInsertAt", query = "SELECT t FROM TbAdminNoti t WHERE t.insertAt = :insertAt"),
    @NamedQuery(name = "TbAdminNoti.findByUpdateAt", query = "SELECT t FROM TbAdminNoti t WHERE t.updateAt = :updateAt"),
    @NamedQuery(name = "TbAdminNoti.findByStatus", query = "SELECT t FROM TbAdminNoti t WHERE t.status = :status")})
public class TbAdminNoti implements Serializable {
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
    @JoinColumn(name = "AdminID", referencedColumnName = "AdminID")
    @ManyToOne(optional = false)
    private TbAdmin adminID;

    public TbAdminNoti() {
    }

    public TbAdminNoti(Integer id) {
        this.id = id;
    }

    public TbAdminNoti(Integer id, String content, Date dueDate, Date insertAt, Date updateAt, boolean status) {
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

    public TbAdmin getAdminID() {
        return adminID;
    }

    public void setAdminID(TbAdmin adminID) {
        this.adminID = adminID;
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
        if (!(object instanceof TbAdminNoti)) {
            return false;
        }
        TbAdminNoti other = (TbAdminNoti) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbAdminNoti[ id=" + id + " ]";
    }
    
}
