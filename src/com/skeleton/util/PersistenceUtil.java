package com.skeleton.util;

import com.skeleton.entities.Action;
import com.skeleton.entities.Auditing;
import com.skeleton.entities.Users;
import java.math.BigDecimal;
import java.util.Date;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class PersistenceUtil {

    @EJB
    private PersistenceHelper persistenceHelper;

    public void audit(Users user, BigDecimal actionID,  String comments) throws Exception {
        try {
            Action action = (Action) persistenceHelper.find(Action.class, actionID);
            Auditing auditing = new Auditing();
            auditing.setUsers(user);

            auditing.setActiondate(FormatUtils.formatDateToTimestamp(new Date(), FormatUtils.FULLDATEPATTERN));
            auditing.setAction(action);
            if (user.getCompany()!=null)
                auditing.setCompany(user.getCompany());
            
            auditing.setComments(comments);
           
            persistenceHelper.create(auditing);

        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
  
   
}
