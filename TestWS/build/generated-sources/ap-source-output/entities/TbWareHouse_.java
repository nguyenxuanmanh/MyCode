package entities;

import entities.TbFinancialPaper;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2020-08-09T23:22:41")
@StaticMetamodel(TbWareHouse.class)
public class TbWareHouse_ { 

    public static volatile SingularAttribute<TbWareHouse, String> address;
    public static volatile SingularAttribute<TbWareHouse, Date> insertAt;
    public static volatile SingularAttribute<TbWareHouse, String> name;
    public static volatile SingularAttribute<TbWareHouse, Date> updateAt;
    public static volatile SingularAttribute<TbWareHouse, Integer> wareHouseID;
    public static volatile CollectionAttribute<TbWareHouse, TbFinancialPaper> tbFinancialPaperCollection;
    public static volatile SingularAttribute<TbWareHouse, Boolean> status;

}