package com.skeleton.converter;


import com.skeleton.entities.Users;
import java.math.BigDecimal;
import javax.faces.application.FacesMessage;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;

import com.skeleton.util.EJBUtil;
import com.skeleton.util.PersistenceHelper;

public class UserConverter implements Converter {
    
    private PersistenceHelper persistenceHelper = EJBUtil.lookupPersistenceHelperBean();
    
    public Object getAsObject(FacesContext facesContext, UIComponent component, String submittedValue) {
        if (submittedValue==null || submittedValue.trim().isEmpty()  ) {
            return null;
        } else {
            try {
                BigDecimal number = new BigDecimal(submittedValue);
                Users user = persistenceHelper.getEntityManager().find(Users.class, number);
                return user;

            } catch (Exception exception) {
                exception.printStackTrace();
                throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Conversion Error", "Not a valid product"));                
            }
        }
    }

    public String getAsString(FacesContext facesContext, UIComponent component, Object value) {
        try {
            if (value == null || value.equals("")) {
                return "";
            } else {
                return String.valueOf(((Users) value).getUserid());
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
