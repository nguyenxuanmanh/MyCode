package entities;

import entities.TbFeedback;
import entities.TbOrder;
import entities.TbRating;
import entities.TbUserNoti;
import entities.TbWishList;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2020-08-09T23:22:41")
@StaticMetamodel(TbUser.class)
public class TbUser_ { 

    public static volatile SingularAttribute<TbUser, String> address;
    public static volatile SingularAttribute<TbUser, Boolean> gender;
    public static volatile SingularAttribute<TbUser, Date> insertAt;
    public static volatile CollectionAttribute<TbUser, TbFeedback> tbFeedbackCollection;
    public static volatile SingularAttribute<TbUser, String> fullName;
    public static volatile SingularAttribute<TbUser, Date> updateAt;
    public static volatile CollectionAttribute<TbUser, TbUserNoti> tbUserNotiCollection;
    public static volatile SingularAttribute<TbUser, String> userName;
    public static volatile SingularAttribute<TbUser, String> password;
    public static volatile CollectionAttribute<TbUser, TbRating> tbRatingCollection;
    public static volatile CollectionAttribute<TbUser, TbWishList> tbWishListCollection;
    public static volatile CollectionAttribute<TbUser, TbOrder> tbOrderCollection;
    public static volatile SingularAttribute<TbUser, String> phone;
    public static volatile SingularAttribute<TbUser, Date> dob;
    public static volatile SingularAttribute<TbUser, String> email;
    public static volatile SingularAttribute<TbUser, Boolean> status;

}