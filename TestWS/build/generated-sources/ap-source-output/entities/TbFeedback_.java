package entities;

import entities.TbAdmin;
import entities.TbOrder;
import entities.TbUser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2020-08-09T23:22:41")
@StaticMetamodel(TbFeedback.class)
public class TbFeedback_ { 

    public static volatile SingularAttribute<TbFeedback, Integer> fid;
    public static volatile SingularAttribute<TbFeedback, TbOrder> orderID;
    public static volatile SingularAttribute<TbFeedback, Date> insertAt;
    public static volatile SingularAttribute<TbFeedback, Date> updateAt;
    public static volatile SingularAttribute<TbFeedback, String> replyContent;
    public static volatile SingularAttribute<TbFeedback, String> title;
    public static volatile SingularAttribute<TbFeedback, String> type;
    public static volatile SingularAttribute<TbFeedback, TbAdmin> replyBy;
    public static volatile SingularAttribute<TbFeedback, String> content;
    public static volatile SingularAttribute<TbFeedback, TbUser> username;

}