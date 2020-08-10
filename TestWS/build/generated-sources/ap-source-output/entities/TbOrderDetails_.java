package entities;

import entities.TbOrder;
import entities.TbProduct;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2020-08-09T23:22:41")
@StaticMetamodel(TbOrderDetails.class)
public class TbOrderDetails_ { 

    public static volatile SingularAttribute<TbOrderDetails, Integer> quantity;
    public static volatile SingularAttribute<TbOrderDetails, TbProduct> productID;
    public static volatile SingularAttribute<TbOrderDetails, TbOrder> orderID;
    public static volatile SingularAttribute<TbOrderDetails, Long> subtotal;
    public static volatile SingularAttribute<TbOrderDetails, Date> insertAt;
    public static volatile SingularAttribute<TbOrderDetails, Date> updateAt;
    public static volatile SingularAttribute<TbOrderDetails, Long> id;
    public static volatile SingularAttribute<TbOrderDetails, Boolean> status;

}