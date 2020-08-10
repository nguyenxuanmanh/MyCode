package entities;

import entities.TbBrand;
import entities.TbCategory;
import entities.TbEventDetails;
import entities.TbExImport;
import entities.TbOrderDetails;
import entities.TbRating;
import entities.TbWishListDetails;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2020-08-09T23:22:41")
@StaticMetamodel(TbProduct.class)
public class TbProduct_ { 

    public static volatile SingularAttribute<TbProduct, Integer> eventID;
    public static volatile SingularAttribute<TbProduct, Integer> sold;
    public static volatile SingularAttribute<TbProduct, Integer> quantity;
    public static volatile SingularAttribute<TbProduct, Integer> productID;
    public static volatile CollectionAttribute<TbProduct, TbExImport> tbExImportCollection;
    public static volatile SingularAttribute<TbProduct, Date> insertAt;
    public static volatile CollectionAttribute<TbProduct, TbEventDetails> tbEventDetailsCollection;
    public static volatile SingularAttribute<TbProduct, Integer> totalRating;
    public static volatile SingularAttribute<TbProduct, Long> discount;
    public static volatile SingularAttribute<TbProduct, Date> updateAt;
    public static volatile SingularAttribute<TbProduct, Integer> numberRating;
    public static volatile SingularAttribute<TbProduct, String> productName;
    public static volatile CollectionAttribute<TbProduct, TbOrderDetails> tbOrderDetailsCollection;
    public static volatile CollectionAttribute<TbProduct, TbRating> tbRatingCollection;
    public static volatile SingularAttribute<TbProduct, String> productImage;
    public static volatile CollectionAttribute<TbProduct, TbWishListDetails> tbWishListDetailsCollection;
    public static volatile SingularAttribute<TbProduct, Long> price;
    public static volatile SingularAttribute<TbProduct, TbCategory> cateID;
    public static volatile SingularAttribute<TbProduct, TbBrand> brandID;
    public static volatile SingularAttribute<TbProduct, String> sku;
    public static volatile SingularAttribute<TbProduct, String> productSpec;
    public static volatile SingularAttribute<TbProduct, Long> importPrice;
    public static volatile SingularAttribute<TbProduct, Boolean> status;

}