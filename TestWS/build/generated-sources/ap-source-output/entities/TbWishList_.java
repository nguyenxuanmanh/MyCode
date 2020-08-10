package entities;

import entities.TbUser;
import entities.TbWishListDetails;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2020-08-09T23:22:41")
@StaticMetamodel(TbWishList.class)
public class TbWishList_ { 

    public static volatile CollectionAttribute<TbWishList, TbWishListDetails> tbWishListDetailsCollection;
    public static volatile SingularAttribute<TbWishList, Integer> wlid;
    public static volatile SingularAttribute<TbWishList, Date> insertAt;
    public static volatile SingularAttribute<TbWishList, Date> updateAt;
    public static volatile SingularAttribute<TbWishList, Boolean> type;
    public static volatile SingularAttribute<TbWishList, TbUser> userName;

}