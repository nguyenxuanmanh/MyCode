package entities;

import entities.TbCategory;
import entities.TbProduct;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2020-08-09T23:22:41")
@StaticMetamodel(TbCategory.class)
public class TbCategory_ { 

    public static volatile CollectionAttribute<TbCategory, TbCategory> tbCategoryCollection;
    public static volatile CollectionAttribute<TbCategory, TbProduct> tbProductCollection;
    public static volatile SingularAttribute<TbCategory, Integer> cateID;
    public static volatile SingularAttribute<TbCategory, Date> insertAt;
    public static volatile SingularAttribute<TbCategory, String> name;
    public static volatile SingularAttribute<TbCategory, Date> updateAt;
    public static volatile SingularAttribute<TbCategory, String> description;
    public static volatile SingularAttribute<TbCategory, TbCategory> parentID;
    public static volatile SingularAttribute<TbCategory, Boolean> status;

}