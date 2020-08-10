package entities;

import entities.TbEvent;
import entities.TbProduct;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2020-08-09T23:22:41")
@StaticMetamodel(TbEventDetails.class)
public class TbEventDetails_ { 

    public static volatile SingularAttribute<TbEventDetails, TbEvent> eventID;
    public static volatile SingularAttribute<TbEventDetails, Integer> amount;
    public static volatile SingularAttribute<TbEventDetails, Integer> quantity;
    public static volatile SingularAttribute<TbEventDetails, TbProduct> productID;
    public static volatile SingularAttribute<TbEventDetails, Date> insertAt;
    public static volatile SingularAttribute<TbEventDetails, Date> updateAt;
    public static volatile SingularAttribute<TbEventDetails, Integer> id;
    public static volatile SingularAttribute<TbEventDetails, Short> percent;
    public static volatile SingularAttribute<TbEventDetails, Boolean> status;

}