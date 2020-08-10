package entities;

import entities.TbAdmin;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2020-08-09T23:22:41")
@StaticMetamodel(TbAdminNoti.class)
public class TbAdminNoti_ { 

    public static volatile SingularAttribute<TbAdminNoti, Date> dueDate;
    public static volatile SingularAttribute<TbAdminNoti, Date> insertAt;
    public static volatile SingularAttribute<TbAdminNoti, TbAdmin> adminID;
    public static volatile SingularAttribute<TbAdminNoti, Date> updateAt;
    public static volatile SingularAttribute<TbAdminNoti, Integer> id;
    public static volatile SingularAttribute<TbAdminNoti, String> content;
    public static volatile SingularAttribute<TbAdminNoti, Boolean> status;

}