package entities;

import entities.TbAdmin;
import entities.TbCcTransaction;
import entities.TbFeedback;
import entities.TbFinancialPaper;
import entities.TbOrderDetails;
import entities.TbUser;
import entities.TbVoucher;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2020-08-09T23:22:41")
@StaticMetamodel(TbOrder.class)
public class TbOrder_ { 

    public static volatile CollectionAttribute<TbOrder, TbCcTransaction> tbCcTransactionCollection;
    public static volatile SingularAttribute<TbOrder, String> address;
    public static volatile SingularAttribute<TbOrder, Integer> orderID;
    public static volatile SingularAttribute<TbOrder, Date> insertAt;
    public static volatile CollectionAttribute<TbOrder, TbFeedback> tbFeedbackCollection;
    public static volatile SingularAttribute<TbOrder, String> orderStatus;
    public static volatile SingularAttribute<TbOrder, Date> updateAt;
    public static volatile SingularAttribute<TbOrder, TbUser> userName;
    public static volatile CollectionAttribute<TbOrder, TbOrderDetails> tbOrderDetailsCollection;
    public static volatile SingularAttribute<TbOrder, TbAdmin> verifyBy;
    public static volatile SingularAttribute<TbOrder, Long> total;
    public static volatile SingularAttribute<TbOrder, Integer> deliveryFee;
    public static volatile SingularAttribute<TbOrder, String> phone;
    public static volatile SingularAttribute<TbOrder, TbVoucher> voucherID;
    public static volatile SingularAttribute<TbOrder, String> payment;
    public static volatile CollectionAttribute<TbOrder, TbFinancialPaper> tbFinancialPaperCollection;
    public static volatile SingularAttribute<TbOrder, Date> deliveryDate;
    public static volatile SingularAttribute<TbOrder, Date> orderDate;
    public static volatile SingularAttribute<TbOrder, String> email;
    public static volatile SingularAttribute<TbOrder, String> info;
    public static volatile SingularAttribute<TbOrder, Long> finalTotal;

}