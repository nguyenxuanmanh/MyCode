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
@Table(name = "tbProduct")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbProduct.findAll", query = "SELECT t FROM TbProduct t"),
    @NamedQuery(name = "TbProduct.findByProductID", query = "SELECT t FROM TbProduct t WHERE t.productID = :productID"),
    @NamedQuery(name = "TbProduct.findBySku", query = "SELECT t FROM TbProduct t WHERE t.sku = :sku"),
    @NamedQuery(name = "TbProduct.findByProductName", query = "SELECT t FROM TbProduct t WHERE t.productName = :productName"),
    @NamedQuery(name = "TbProduct.findByTotalRating", query = "SELECT t FROM TbProduct t WHERE t.totalRating = :totalRating"),
    @NamedQuery(name = "TbProduct.findByNumberRating", query = "SELECT t FROM TbProduct t WHERE t.numberRating = :numberRating"),
    @NamedQuery(name = "TbProduct.findByEventID", query = "SELECT t FROM TbProduct t WHERE t.eventID = :eventID"),
    @NamedQuery(name = "TbProduct.findByImportPrice", query = "SELECT t FROM TbProduct t WHERE t.importPrice = :importPrice"),
    @NamedQuery(name = "TbProduct.findByPrice", query = "SELECT t FROM TbProduct t WHERE t.price = :price"),
    @NamedQuery(name = "TbProduct.findByDiscount", query = "SELECT t FROM TbProduct t WHERE t.discount = :discount"),
    @NamedQuery(name = "TbProduct.findByProductImage", query = "SELECT t FROM TbProduct t WHERE t.productImage = :productImage"),
    @NamedQuery(name = "TbProduct.findByProductSpec", query = "SELECT t FROM TbProduct t WHERE t.productSpec = :productSpec"),
    @NamedQuery(name = "TbProduct.findByQuantity", query = "SELECT t FROM TbProduct t WHERE t.quantity = :quantity"),
    @NamedQuery(name = "TbProduct.findByStatus", query = "SELECT t FROM TbProduct t WHERE t.status = :status"),
    @NamedQuery(name = "TbProduct.findBySold", query = "SELECT t FROM TbProduct t WHERE t.sold = :sold"),
    @NamedQuery(name = "TbProduct.findByInsertAt", query = "SELECT t FROM TbProduct t WHERE t.insertAt = :insertAt"),
    @NamedQuery(name = "TbProduct.findByUpdateAt", query = "SELECT t FROM TbProduct t WHERE t.updateAt = :updateAt")})
public class TbProduct implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductID")
    private Integer productID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "SKU")
    private String sku;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3000)
    @Column(name = "ProductName")
    private String productName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TotalRating")
    private int totalRating;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NumberRating")
    private int numberRating;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EventID")
    private int eventID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ImportPrice")
    private long importPrice;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Price")
    private long price;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Discount")
    private long discount;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3000)
    @Column(name = "ProductImage")
    private String productImage;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "ProductSpec")
    private String productSpec;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Quantity")
    private int quantity;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Status")
    private boolean status;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Sold")
    private int sold;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productID")
    private Collection<TbRating> tbRatingCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productID")
    private Collection<TbExImport> tbExImportCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productID")
    private Collection<TbWishListDetails> tbWishListDetailsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productID")
    private Collection<TbEventDetails> tbEventDetailsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productID")
    private Collection<TbOrderDetails> tbOrderDetailsCollection;
    @JoinColumn(name = "BrandID", referencedColumnName = "BrandID")
    @ManyToOne(optional = false)
    private TbBrand brandID;
    @JoinColumn(name = "CateID", referencedColumnName = "CateID")
    @ManyToOne(optional = false)
    private TbCategory cateID;

    public TbProduct() {
    }

    public TbProduct(Integer productID) {
        this.productID = productID;
    }

    public TbProduct(Integer productID, String sku, String productName, int totalRating, int numberRating, int eventID, long importPrice, long price, long discount, String productImage, String productSpec, int quantity, boolean status, int sold, Date insertAt, Date updateAt) {
        this.productID = productID;
        this.sku = sku;
        this.productName = productName;
        this.totalRating = totalRating;
        this.numberRating = numberRating;
        this.eventID = eventID;
        this.importPrice = importPrice;
        this.price = price;
        this.discount = discount;
        this.productImage = productImage;
        this.productSpec = productSpec;
        this.quantity = quantity;
        this.status = status;
        this.sold = sold;
        this.insertAt = insertAt;
        this.updateAt = updateAt;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getTotalRating() {
        return totalRating;
    }

    public void setTotalRating(int totalRating) {
        this.totalRating = totalRating;
    }

    public int getNumberRating() {
        return numberRating;
    }

    public void setNumberRating(int numberRating) {
        this.numberRating = numberRating;
    }

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public long getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(long importPrice) {
        this.importPrice = importPrice;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getDiscount() {
        return discount;
    }

    public void setDiscount(long discount) {
        this.discount = discount;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getProductSpec() {
        return productSpec;
    }

    public void setProductSpec(String productSpec) {
        this.productSpec = productSpec;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
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
    public Collection<TbRating> getTbRatingCollection() {
        return tbRatingCollection;
    }

    public void setTbRatingCollection(Collection<TbRating> tbRatingCollection) {
        this.tbRatingCollection = tbRatingCollection;
    }

    @XmlTransient
    public Collection<TbExImport> getTbExImportCollection() {
        return tbExImportCollection;
    }

    public void setTbExImportCollection(Collection<TbExImport> tbExImportCollection) {
        this.tbExImportCollection = tbExImportCollection;
    }

    @XmlTransient
    public Collection<TbWishListDetails> getTbWishListDetailsCollection() {
        return tbWishListDetailsCollection;
    }

    public void setTbWishListDetailsCollection(Collection<TbWishListDetails> tbWishListDetailsCollection) {
        this.tbWishListDetailsCollection = tbWishListDetailsCollection;
    }

    @XmlTransient
    public Collection<TbEventDetails> getTbEventDetailsCollection() {
        return tbEventDetailsCollection;
    }

    public void setTbEventDetailsCollection(Collection<TbEventDetails> tbEventDetailsCollection) {
        this.tbEventDetailsCollection = tbEventDetailsCollection;
    }

    @XmlTransient
    public Collection<TbOrderDetails> getTbOrderDetailsCollection() {
        return tbOrderDetailsCollection;
    }

    public void setTbOrderDetailsCollection(Collection<TbOrderDetails> tbOrderDetailsCollection) {
        this.tbOrderDetailsCollection = tbOrderDetailsCollection;
    }

    public TbBrand getBrandID() {
        return brandID;
    }

    public void setBrandID(TbBrand brandID) {
        this.brandID = brandID;
    }

    public TbCategory getCateID() {
        return cateID;
    }

    public void setCateID(TbCategory cateID) {
        this.cateID = cateID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productID != null ? productID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbProduct)) {
            return false;
        }
        TbProduct other = (TbProduct) object;
        if ((this.productID == null && other.productID != null) || (this.productID != null && !this.productID.equals(other.productID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TbProduct[ productID=" + productID + " ]";
    }
    
}
