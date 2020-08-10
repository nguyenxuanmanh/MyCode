package entities;

import entities.TbUser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2020-08-09T23:22:41")
@StaticMetamodel(TbUserNoti.class)
public class TbUserNoti_ { 

    public static volatile SingularAttribute<TbUserNoti, Date> dueDate;
    public static volatile SingularAttribute<TbUserNoti, Date> insertAt;
    public static volatile SingularAttribute<TbUserNoti, Date> updateAt;
    public static volatile SingularAttribute<TbUserNoti, Integer> id;
    public static volatile SingularAttribute<TbUserNoti, String> content;
    public static volatile SingularAttribute<TbUserNoti, Boolean> status;
    public static volatile SingularAttribute<TbUserNoti, TbUser> username;

}