package entities;

import entities.TbAdminNoti;
import entities.TbFeedback;
import entities.TbOrder;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2020-08-09T23:22:41")
@StaticMetamodel(TbAdmin.class)
public class TbAdmin_ { 

    public static volatile SingularAttribute<TbAdmin, String> address;
    public static volatile SingularAttribute<TbAdmin, String> role;
    public static volatile SingularAttribute<TbAdmin, Boolean> gender;
    public static volatile SingularAttribute<TbAdmin, Date> insertAt;
    public static volatile CollectionAttribute<TbAdmin, TbFeedback> tbFeedbackCollection;
    public static volatile SingularAttribute<TbAdmin, Date> updateAt;
    public static volatile SingularAttribute<TbAdmin, String> adminName;
    public static volatile SingularAttribute<TbAdmin, String> password;
    public static volatile CollectionAttribute<TbAdmin, TbOrder> tbOrderCollection;
    public static volatile SingularAttribute<TbAdmin, String> phone;
    public static volatile SingularAttribute<TbAdmin, String> adminID;
    public static volatile CollectionAttribute<TbAdmin, TbAdminNoti> tbAdminNotiCollection;
    public static volatile SingularAttribute<TbAdmin, String> email;
    public static volatile SingularAttribute<TbAdmin, Boolean> status;

}