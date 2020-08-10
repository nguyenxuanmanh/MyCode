package entities;

import entities.TbFinancialPaper;
import entities.TbProduct;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2020-08-09T23:22:41")
@StaticMetamodel(TbExImport.class)
public class TbExImport_ { 

    public static volatile SingularAttribute<TbExImport, Integer> realQuantity;
    public static volatile SingularAttribute<TbExImport, Long> total;
    public static volatile SingularAttribute<TbExImport, Integer> quantity;
    public static volatile SingularAttribute<TbExImport, TbProduct> productID;
    public static volatile SingularAttribute<TbExImport, Integer> price;
    public static volatile SingularAttribute<TbExImport, Date> insertAt;
    public static volatile SingularAttribute<TbExImport, Date> updateAt;
    public static volatile SingularAttribute<TbExImport, Integer> id;
    public static volatile SingularAttribute<TbExImport, TbFinancialPaper> financialID;
    public static volatile SingularAttribute<TbExImport, Boolean> status;

}