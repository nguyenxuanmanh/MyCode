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
@Table(name = "tbUser")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbUser.findAll", query = "SELECT t FROM TbUser t"),
    @NamedQuery(name = "TbUser.findByUserName", query = "SELECT t FROM TbUser t WHERE t.userName = :userName"),
    @NamedQuery(name = "TbUser.findByFullName", query = "SELECT t FROM TbUser t WHERE t.fullName = :fullName"),
    @NamedQuery(name = "TbUser.findByGender", query = "SELECT t FROM TbUser t WHERE t.gender = :gender"),
    @NamedQuery(name = "TbUser.findByEmail", query = "SELECT t FROM TbUser t WHERE t.email = :email"),
    @NamedQuery(name = "TbUser.findByPhone", query = "SELECT t FROM TbUser t WHERE t.phone = :phone"),
    @NamedQuery(name = "TbUser.findByPassword", query = "SELECT t FROM TbUser t WHERE t.password = :password"),
    @NamedQuery(name = "TbUser.findByAddress", query = "SELECT t FROM TbUser t WHERE t.address = :address"),
    @NamedQuery(name = "TbUser.findByDob", query = "SELECT t FROM TbUser t WHERE t.dob = :dob"),
    @NamedQuery(name = "TbUser.findByStatus", query = "SELECT t FROM TbUser t WHERE t.status = :status"),
    @NamedQuery(name = "TbUser.findByInsertAt", query = "SELECT t FROM TbUser t WHERE t.insertAt = :insertAt"),
    @NamedQuery(name = "TbUser.findByUpdateAt", query = "SELECT t FROM TbUser t WHERE t.updateAt = :updateAt")})
public class TbUser implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "UserName")
    private String userName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "FullName")
    private String fullName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Gender")
    private boolean gender;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
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
    @Size(min = 1, max = 256)
    @Column(name = "Password")
    private String password;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "Address")
    private String address;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DOB")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dob;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "username")
    private Collection<TbUserNoti> tbUserNotiCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userName")
    private Collection<TbRating> tbRatingCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "username")
    private Collection<TbFeedback> tbFeedbackCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userName")
    private Collection<TbWishList> tbWishListCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userName")
    private Collection<TbOrder> tbOrderCollection;

    public TbUser() {
    }

    public TbUser(String userName) {
        this.userName = userName;
    }

    public TbUser(String userName, String fullName, boolean gender, String email, String phone, String password, String address, Date dob, boolean status, Date insertAt, Date updateAt) {
        this.userName = userName;
        this.fullName = fullName;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.address = address;
        this.dob = dob;
        this.status = status;
        this.insertAt = insertAt;
        this.updateAt = updateAt;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
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
    public Collection<TbUserNoti> getTbUserNotiCollection() {
        return tbUserNotiCollection;
    }

    public void setTbUserNotiCollection(Collection<TbUserNoti> tbUserNotiCollection) {
        this.tbUserNotiCollection = tbUserNotiCollection;
    }

    @XmlTransient
    public Collection<TbRating> getTbRatingCollection() {
        return tbRatingCollection;
    }

    public void setTbRatingCollection(Collection<TbRating> tbRatingCollection) {
        this.tbRatingCollection = tbRatingCollection;
    }

    @XmlTransient
    public Collection<TbFeedback> getTbFeedbackCollection() {
        return tbFeedbackCollection;
    }

    public void setTbFeedbackCollection(Collection<TbFeedback> tbFeedbackCollection) {
        this.tbFeedbackCollection = tbFeedbackCollection;
    }

    @XmlTransient
    public Collection<TbWishList> getTbWishListCollection() {
        return tbWishListCollection;
    }

    public void setTbWishListCollection(Collection<TbWishList> tbWishListCollection) {
        this.tbWishListCollection = tbWishListCollection;
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
        hash += (userName != null ? userName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbUser)) {
            return false;
        }
        TbUser other = (TbUser) object;
        if ((this.userName == null && other.userName != null) || (this.userName != null && !this.userName.equals(other.userName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbUser[ userName=" + userName + " ]";
    }
    
}
