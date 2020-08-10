package entities;

import entities.TbProduct;
import entities.TbUser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2020-08-09T23:22:41")
@StaticMetamodel(TbRating.class)
public class TbRating_ { 

    public static volatile SingularAttribute<TbRating, TbProduct> productID;
    public static volatile SingularAttribute<TbRating, Short> ratingPoint;
    public static volatile SingularAttribute<TbRating, Date> insertAt;
    public static volatile SingularAttribute<TbRating, Date> updateAt;
    public static volatile SingularAttribute<TbRating, TbUser> userName;
    public static volatile SingularAttribute<TbRating, Integer> rateID;
    public static volatile SingularAttribute<TbRating, String> content;
    public static volatile SingularAttribute<TbRating, Short> layer;
    public static volatile SingularAttribute<TbRating, Boolean> status;

}