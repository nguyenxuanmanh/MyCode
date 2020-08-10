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
@Table(name = "tbAdmin")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbAdmin.findAll", query = "SELECT t FROM TbAdmin t"),
    @NamedQuery(name = "TbAdmin.findByAdminID", query = "SELECT t FROM TbAdmin t WHERE t.adminID = :adminID"),
    @NamedQuery(name = "TbAdmin.findByAdminName", query = "SELECT t FROM TbAdmin t WHERE t.adminName = :adminName"),
    @NamedQuery(name = "TbAdmin.findByGender", query = "SELECT t FROM TbAdmin t WHERE t.gender = :gender"),
    @NamedQuery(name = "TbAdmin.findByEmail", query = "SELECT t FROM TbAdmin t WHERE t.email = :email"),
    @NamedQuery(name = "TbAdmin.findByPhone", query = "SELECT t FROM TbAdmin t WHERE t.phone = :phone"),
    @NamedQuery(name = "TbAdmin.findByPassword", query = "SELECT t FROM TbAdmin t WHERE t.password = :password"),
    @NamedQuery(name = "TbAdmin.findByAddress", query = "SELECT t FROM TbAdmin t WHERE t.address = :address"),
    @NamedQuery(name = "TbAdmin.findByRole", query = "SELECT t FROM TbAdmin t WHERE t.role = :role"),
    @NamedQuery(name = "TbAdmin.findByStatus", query = "SELECT t FROM TbAdmin t WHERE t.status = :status"),
    @NamedQuery(name = "TbAdmin.findByInsertAt", query = "SELECT t FROM TbAdmin t WHERE t.insertAt = :insertAt"),
    @NamedQuery(name = "TbAdmin.findByUpdateAt", query = "SELECT t FROM TbAdmin t WHERE t.updateAt = :updateAt")})
public class TbAdmin implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "AdminID")
    private String adminID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "AdminName")
    private String adminName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Gender")
    private boolean gender;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "Email")
    private String email;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "Phone")
    private String phone;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "Password")
    private String password;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "Address")
    private String address;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Role")
    private String role;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Status")
    private boolean status;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "adminID")
    private Collection<TbAdminNoti> tbAdminNotiCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "replyBy")
    private Collection<TbFeedback> tbFeedbackCollection;
    @OneToMany(mappedBy = "verifyBy")
    private Collection<TbOrder> tbOrderCollection;

    public TbAdmin() {
    }

    public TbAdmin(String adminID) {
        this.adminID = adminID;
    }

    public TbAdmin(String adminID, String adminName, boolean gender, String email, String phone, String password, String address, String role, boolean status, Date insertAt, Date updateAt) {
        this.adminID = adminID;
        this.adminName = adminName;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.address = address;
        this.role = role;
        this.status = status;
        this.insertAt = insertAt;
        this.updateAt = updateAt;
    }

    public String getAdminID() {
        return adminID;
    }

    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
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
    public Collection<TbAdminNoti> getTbAdminNotiCollection() {
        return tbAdminNotiCollection;
    }

    public void setTbAdminNotiCollection(Collection<TbAdminNoti> tbAdminNotiCollection) {
        this.tbAdminNotiCollection = tbAdminNotiCollection;
    }

    @XmlTransient
    public Collection<TbFeedback> getTbFeedbackCollection() {
        return tbFeedbackCollection;
    }

    public void setTbFeedbackCollection(Collection<TbFeedback> tbFeedbackCollection) {
        this.tbFeedbackCollection = tbFeedbackCollection;
    }

    @XmlTransient
    public Collection<TbOrder> getTbOrderCollection() {
        return tbOrderCollection;
    }

    public void setTbOrderCollection(Collection<TbOrder> tbOrderCollection) {
        this.tbOrderCollection = tbOrderCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (adminID != null ? adminID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbAdmin)) {
            return false;
        }
        TbAdmin other = (TbAdmin) object;
        if ((this.adminID == null && other.adminID != null) || (this.adminID != null && !this.adminID.equals(other.adminID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbAdmin[ adminID=" + adminID + " ]";
    }
    
}
