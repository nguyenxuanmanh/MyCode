package entities;

import entities.TbExImport;
import entities.TbOrder;
import entities.TbWareHouse;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2020-08-09T23:22:41")
@StaticMetamodel(TbFinancialPaper.class)
public class TbFinancialPaper_ { 

    public static volatile SingularAttribute<TbFinancialPaper, String> employeeName;
    public static volatile SingularAttribute<TbFinancialPaper, Integer> shippingFee;
    public static volatile SingularAttribute<TbFinancialPaper, String> partner;
    public static volatile SingularAttribute<TbFinancialPaper, TbOrder> orderID;
    public static volatile CollectionAttribute<TbFinancialPaper, TbExImport> tbExImportCollection;
    public static volatile SingularAttribute<TbFinancialPaper, Date> insertAt;
    public static volatile SingularAttribute<TbFinancialPaper, Date> updateAt;
    public static volatile SingularAttribute<TbFinancialPaper, TbWareHouse> wareHouseID;
    public static volatile SingularAttribute<TbFinancialPaper, String> type;
    public static volatile SingularAttribute<TbFinancialPaper, Integer> financialID;
    public static volatile SingularAttribute<TbFinancialPaper, Boolean> status;

}