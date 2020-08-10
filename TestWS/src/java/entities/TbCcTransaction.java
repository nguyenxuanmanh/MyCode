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
@Table(name = "tbCcTransaction")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbCcTransaction.findAll", query = "SELECT t FROM TbCcTransaction t"),
    @NamedQuery(name = "TbCcTransaction.findById", query = "SELECT t FROM TbCcTransaction t WHERE t.id = :id"),
    @NamedQuery(name = "TbCcTransaction.findByCode", query = "SELECT t FROM TbCcTransaction t WHERE t.code = :code"),
    @NamedQuery(name = "TbCcTransaction.findByTransdate", query = "SELECT t FROM TbCcTransaction t WHERE t.transdate = :transdate"),
    @NamedQuery(name = "TbCcTransaction.findByProcessor", query = "SELECT t FROM TbCcTransaction t WHERE t.processor = :processor"),
    @NamedQuery(name = "TbCcTransaction.findByProcessorTransID", query = "SELECT t FROM TbCcTransaction t WHERE t.processorTransID = :processorTransID"),
    @NamedQuery(name = "TbCcTransaction.findByAmount", query = "SELECT t FROM TbCcTransaction t WHERE t.amount = :amount"),
    @NamedQuery(name = "TbCcTransaction.findByCcNum", query = "SELECT t FROM TbCcTransaction t WHERE t.ccNum = :ccNum"),
    @NamedQuery(name = "TbCcTransaction.findByCcType", query = "SELECT t FROM TbCcTransaction t WHERE t.ccType = :ccType"),
    @NamedQuery(name = "TbCcTransaction.findByResponse", query = "SELECT t FROM TbCcTransaction t WHERE t.response = :response"),
    @NamedQuery(name = "TbCcTransaction.findByInsertAt", query = "SELECT t FROM TbCcTransaction t WHERE t.insertAt = :insertAt"),
    @NamedQuery(name = "TbCcTransaction.findByUpdateAt", query = "SELECT t FROM TbCcTransaction t WHERE t.updateAt = :updateAt")})
public class TbCcTransaction implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "Code")
    private String code;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Transdate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date transdate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "Processor")
    private String processor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "ProcessorTransID")
    private String processorTransID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Amount")
    private long amount;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "CcNum")
    private String ccNum;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "CcType")
    private String ccType;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "Response")
    private String response;
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
    @JoinColumn(name = "OrderID", referencedColumnName = "OrderID")
    @ManyToOne(optional = false)
    private TbOrder orderID;

    public TbCcTransaction() {
    }

    public TbCcTransaction(Integer id) {
        this.id = id;
    }

    public TbCcTransaction(Integer id, String code, Date transdate, String processor, String processorTransID, long amount, String ccNum, String ccType, String response, Date insertAt, Date updateAt) {
        this.id = id;
        this.code = code;
        this.transdate = transdate;
        this.processor = processor;
        this.processorTransID = processorTransID;
        this.amount = amount;
        this.ccNum = ccNum;
        this.ccType = ccType;
        this.response = response;
        this.insertAt = insertAt;
        this.updateAt = updateAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getTransdate() {
        return transdate;
    }

    public void setTransdate(Date transdate) {
        this.transdate = transdate;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getProcessorTransID() {
        return processorTransID;
    }

    public void setProcessorTransID(String processorTransID) {
        this.processorTransID = processorTransID;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getCcNum() {
        return ccNum;
    }

    public void setCcNum(String ccNum) {
        this.ccNum = ccNum;
    }

    public String getCcType() {
        return ccType;
    }

    public void setCcType(String ccType) {
        this.ccType = ccType;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
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

    public TbOrder getOrderID() {
        return orderID;
    }

    public void setOrderID(TbOrder orderID) {
        this.orderID = orderID;
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
        if (!(object instanceof TbCcTransaction)) {
            return false;
        }
        TbCcTransaction other = (TbCcTransaction) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbCcTransaction[ id=" + id + " ]";
    }
    
}
