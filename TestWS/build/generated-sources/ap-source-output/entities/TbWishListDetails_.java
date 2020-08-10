package entities;

import entities.TbProduct;
import entities.TbWishList;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2020-08-09T23:22:40")
@StaticMetamodel(TbWishListDetails.class)
public class TbWishListDetails_ { 

    public static volatile SingularAttribute<TbWishListDetails, TbProduct> productID;
    public static volatile SingularAttribute<TbWishListDetails, Date> insertAt;
    public static volatile SingularAttribute<TbWishListDetails, TbWishList> wlid;
    public static volatile SingularAttribute<TbWishListDetails, Date> updateAt;
    public static volatile SingularAttribute<TbWishListDetails, Integer> id;

}