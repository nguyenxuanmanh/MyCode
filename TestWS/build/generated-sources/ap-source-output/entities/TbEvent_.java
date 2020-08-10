package entities;

import entities.TbEventDetails;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2020-08-09T23:22:41")
@StaticMetamodel(TbEvent.class)
public class TbEvent_ { 

    public static volatile SingularAttribute<TbEvent, Integer> eventID;
    public static volatile SingularAttribute<TbEvent, Integer> amount;
    public static volatile SingularAttribute<TbEvent, Integer> quantity;
    public static volatile SingularAttribute<TbEvent, Date> endDate;
    public static volatile SingularAttribute<TbEvent, Integer> max;
    public static volatile SingularAttribute<TbEvent, Date> insertAt;
    public static volatile CollectionAttribute<TbEvent, TbEventDetails> tbEventDetailsCollection;
    public static volatile SingularAttribute<TbEvent, String> description;
    public static volatile SingularAttribute<TbEvent, Date> updateAt;
    public static volatile SingularAttribute<TbEvent, String> type;
    public static volatile SingularAttribute<TbEvent, Integer> min;
    public static volatile SingularAttribute<TbEvent, String> eventName;
    public static volatile SingularAttribute<TbEvent, String> category;
    public static volatile SingularAttribute<TbEvent, String> brand;
    public static volatile SingularAttribute<TbEvent, Date> startDate;
    public static volatile SingularAttribute<TbEvent, Boolean> status;

}