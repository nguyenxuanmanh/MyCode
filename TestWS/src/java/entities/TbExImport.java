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
@Table(name = "tbEx_Import")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbExImport.findAll", query = "SELECT t FROM TbExImport t"),
    @NamedQuery(name = "TbExImport.findById", query = "SELECT t FROM TbExImport t WHERE t.id = :id"),
    @NamedQuery(name = "TbExImport.findByQuantity", query = "SELECT t FROM TbExImport t WHERE t.quantity = :quantity"),
    @NamedQuery(name = "TbExImport.findByRealQuantity", query = "SELECT t FROM TbExImport t WHERE t.realQuantity = :realQuantity"),
    @NamedQuery(name = "TbExImport.findByPrice", query = "SELECT t FROM TbExImport t WHERE t.price = :price"),
    @NamedQuery(name = "TbExImport.findByTotal", query = "SELECT t FROM TbExImport t WHERE t.total = :total"),
    @NamedQuery(name = "TbExImport.findByInsertAt", query = "SELECT t FROM TbExImport t WHERE t.insertAt = :insertAt"),
    @NamedQuery(name = "TbExImport.findByUpdateAt", query = "SELECT t FROM TbExImport t WHERE t.updateAt = :updateAt"),
    @NamedQuery(name = "TbExImport.findByStatus", query = "SELECT t FROM TbExImport t WHERE t.status = :status")})
public class TbExImport implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Quantity")
    private int quantity;
    @Basic(optional = false)
    @NotNull
    @Column(name = "RealQuantity")
    private int realQuantity;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Price")
    private int price;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Total")
    private long total;
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
    @JoinColumn(name = "Financial_ID", referencedColumnName = "Financial_ID")
    @ManyToOne(optional = false)
    private TbFinancialPaper financialID;
    @JoinColumn(name = "ProductID", referencedColumnName = "ProductID")
    @ManyToOne(optional = false)
    private TbProduct productID;

    public TbExImport() {
    }

    public TbExImport(Integer id) {
        this.id = id;
    }

    public TbExImport(Integer id, int quantity, int realQuantity, int price, long total, Date insertAt, Date updateAt, boolean status) {
        this.id = id;
        this.quantity = quantity;
        this.realQuantity = realQuantity;
        this.price = price;
        this.total = total;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getRealQuantity() {
        return realQuantity;
    }

    public void setRealQuantity(int realQuantity) {
        this.realQuantity = realQuantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
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

    public TbFinancialPaper getFinancialID() {
        return financialID;
    }

    public void setFinancialID(TbFinancialPaper financialID) {
        this.financialID = financialID;
    }

    public TbProduct getProductID() {
        return productID;
    }

    public void setProductID(TbProduct productID) {
        this.productID = productID;
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
        if (!(object instanceof TbExImport)) {
            return false;
        }
        TbExImport other = (TbExImport) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbExImport[ id=" + id + " ]";
    }
    
}
