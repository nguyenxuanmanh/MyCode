package entities;

import entities.TbOrder;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2020-08-09T23:22:41")
@StaticMetamodel(TbVoucher.class)
public class TbVoucher_ { 

    public static volatile SingularAttribute<TbVoucher, String> code;
    public static volatile SingularAttribute<TbVoucher, Integer> quantity;
    public static volatile SingularAttribute<TbVoucher, Date> endDate;
    public static volatile SingularAttribute<TbVoucher, Integer> fixAmount;
    public static volatile SingularAttribute<TbVoucher, Date> insertAt;
    public static volatile SingularAttribute<TbVoucher, Date> updateAt;
    public static volatile SingularAttribute<TbVoucher, Boolean> type;
    public static volatile SingularAttribute<TbVoucher, Integer> minRequire;
    public static volatile SingularAttribute<TbVoucher, Short> percent;
    public static volatile CollectionAttribute<TbVoucher, TbOrder> tbOrderCollection;
    public static volatile SingularAttribute<TbVoucher, Integer> id;
    public static volatile SingularAttribute<TbVoucher, Integer> maxAmount;
    public static volatile SingularAttribute<TbVoucher, Date> startDate;
    public static volatile SingularAttribute<TbVoucher, Boolean> status;

}