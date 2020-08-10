package entities;

import entities.TbOrder;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2020-08-09T23:22:41")
@StaticMetamodel(TbCcTransaction.class)
public class TbCcTransaction_ { 

    public static volatile SingularAttribute<TbCcTransaction, String> ccType;
    public static volatile SingularAttribute<TbCcTransaction, Long> amount;
    public static volatile SingularAttribute<TbCcTransaction, String> code;
    public static volatile SingularAttribute<TbCcTransaction, TbOrder> orderID;
    public static volatile SingularAttribute<TbCcTransaction, String> response;
    public static volatile SingularAttribute<TbCcTransaction, String> ccNum;
    public static volatile SingularAttribute<TbCcTransaction, Date> insertAt;
    public static volatile SingularAttribute<TbCcTransaction, Date> updateAt;
    public static volatile SingularAttribute<TbCcTransaction, Date> transdate;
    public static volatile SingularAttribute<TbCcTransaction, Integer> id;
    public static volatile SingularAttribute<TbCcTransaction, String> processorTransID;
    public static volatile SingularAttribute<TbCcTransaction, String> processor;

}