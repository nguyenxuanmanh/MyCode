package entities;

import entities.TbProduct;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2020-08-09T23:22:41")
@StaticMetamodel(TbBrand.class)
public class TbBrand_ { 

    public static volatile SingularAttribute<TbBrand, String> brandName;
    public static volatile CollectionAttribute<TbBrand, TbProduct> tbProductCollection;
    public static volatile SingularAttribute<TbBrand, Integer> brandID;
    public static volatile SingularAttribute<TbBrand, Date> insertAt;
    public static volatile SingularAttribute<TbBrand, String> description;
    public static volatile SingularAttribute<TbBrand, Date> updateAt;
    public static volatile SingularAttribute<TbBrand, Boolean> status;

}