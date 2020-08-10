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
@Table(name = "tbOrder")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbOrder.findAll", query = "SELECT t FROM TbOrder t"),
    @NamedQuery(name = "TbOrder.findByOrderID", query = "SELECT t FROM TbOrder t WHERE t.orderID = :orderID"),
    @NamedQuery(name = "TbOrder.findByOrderDate", query = "SELECT t FROM TbOrder t WHERE t.orderDate = :orderDate"),
    @NamedQuery(name = "TbOrder.findByOrderStatus", query = "SELECT t FROM TbOrder t WHERE t.orderStatus = :orderStatus"),
    @NamedQuery(name = "TbOrder.findByDeliveryDate", query = "SELECT t FROM TbOrder t WHERE t.deliveryDate = :deliveryDate"),
    @NamedQuery(name = "TbOrder.findByTotal", query = "SELECT t FROM TbOrder t WHERE t.total = :total"),
    @NamedQuery(name = "TbOrder.findByPayment", query = "SELECT t FROM TbOrder t WHERE t.payment = :payment"),
    @NamedQuery(name = "TbOrder.findByAddress", query = "SELECT t FROM TbOrder t WHERE t.address = :address"),
    @NamedQuery(name = "TbOrder.findByPhone", query = "SELECT t FROM TbOrder t WHERE t.phone = :phone"),
    @NamedQuery(name = "TbOrder.findByEmail", query = "SELECT t FROM TbOrder t WHERE t.email = :email"),
    @NamedQuery(name = "TbOrder.findByInfo", query = "SELECT t FROM TbOrder t WHERE t.info = :info"),
    @NamedQuery(name = "TbOrder.findByInsertAt", query = "SELECT t FROM TbOrder t WHERE t.insertAt = :insertAt"),
    @NamedQuery(name = "TbOrder.findByUpdateAt", query = "SELECT t FROM TbOrder t WHERE t.updateAt = :updateAt"),
    @NamedQuery(name = "TbOrder.findByDeliveryFee", query = "SELECT t FROM TbOrder t WHERE t.deliveryFee = :deliveryFee"),
    @NamedQuery(name = "TbOrder.findByFinalTotal", query = "SELECT t FROM TbOrder t WHERE t.finalTotal = :finalTotal")})
public class TbOrder implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "OrderID")
    private Integer orderID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "OrderDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "OrderStatus")
    private String orderStatus;
    @Column(name = "DeliveryDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deliveryDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Total")
    private long total;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Payment")
    private String payment;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "Address")
    private String address;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "Phone")
    private String phone;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "Email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3000)
    @Column(name = "Info")
    private String info;
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
    @Column(name = "DeliveryFee")
    private int deliveryFee;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FinalTotal")
    private long finalTotal;
    @OneToMany(mappedBy = "orderID")
    private Collection<TbFinancialPaper> tbFinancialPaperCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "orderID")
    private Collection<TbCcTransaction> tbCcTransactionCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "orderID")
    private Collection<TbFeedback> tbFeedbackCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "orderID")
    private Collection<TbOrderDetails> tbOrderDetailsCollection;
    @JoinColumn(name = "VerifyBy", referencedColumnName = "AdminID")
    @ManyToOne
    private TbAdmin verifyBy;
    @JoinColumn(name = "UserName", referencedColumnName = "UserName")
    @ManyToOne(optional = false)
    private TbUser userName;
    @JoinColumn(name = "VoucherID", referencedColumnName = "ID")
    @ManyToOne
    private TbVoucher voucherID;

    public TbOrder() {
    }

    public TbOrder(Integer orderID) {
        this.orderID = orderID;
    }

    public TbOrder(Integer orderID, Date orderDate, String orderStatus, long total, String payment, String address, String phone, String email, String info, Date insertAt, Date updateAt, int deliveryFee, long finalTotal) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
        this.total = total;
        this.payment = payment;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.info = info;
        this.insertAt = insertAt;
        this.updateAt = updateAt;
        this.deliveryFee = deliveryFee;
        this.finalTotal = finalTotal;
    }

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
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

    public int getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(int deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public long getFinalTotal() {
        return finalTotal;
    }

    public void setFinalTotal(long finalTotal) {
        this.finalTotal = finalTotal;
    }

    @XmlTransient
    public Collection<TbFinancialPaper> getTbFinancialPaperCollection() {
        return tbFinancialPaperCollection;
    }

    public void setTbFinancialPaperCollection(Collection<TbFinancialPaper> tbFinancialPaperCollection) {
        this.tbFinancialPaperCollection = tbFinancialPaperCollection;
    }

    @XmlTransient
    public Collection<TbCcTransaction> getTbCcTransactionCollection() {
        return tbCcTransactionCollection;
    }

    public void setTbCcTransactionCollection(Collection<TbCcTransaction> tbCcTransactionCollection) {
        this.tbCcTransactionCollection = tbCcTransactionCollection;
    }

    @XmlTransient
    public Collection<TbFeedback> getTbFeedbackCollection() {
        return tbFeedbackCollection;
    }

    public void setTbFeedbackCollection(Collection<TbFeedback> tbFeedbackCollection) {
        this.tbFeedbackCollection = tbFeedbackCollection;
    }

    @XmlTransient
    public Collection<TbOrderDetails> getTbOrderDetailsCollection() {
        return tbOrderDetailsCollection;
    }

    public void setTbOrderDetailsCollection(Collection<TbOrderDetails> tbOrderDetailsCollection) {
        this.tbOrderDetailsCollection = tbOrderDetailsCollection;
    }

    public TbAdmin getVerifyBy() {
        return verifyBy;
    }

    public void setVerifyBy(TbAdmin verifyBy) {
        this.verifyBy = verifyBy;
    }

    public TbUser getUserName() {
        return userName;
    }

    public void setUserName(TbUser userName) {
        this.userName = userName;
    }

    public TbVoucher getVoucherID() {
        return voucherID;
    }

    public void setVoucherID(TbVoucher voucherID) {
        this.voucherID = voucherID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderID != null ? orderID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbOrder)) {
            return false;
        }
        TbOrder other = (TbOrder) object;
        if ((this.orderID == null && other.orderID != null) || (this.orderID != null && !this.orderID.equals(other.orderID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbOrder[ orderID=" + orderID + " ]";
    }
    
}
