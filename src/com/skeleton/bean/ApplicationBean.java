/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.skeleton.bean;

import com.skeleton.dao.ActionDAO;
import com.skeleton.dao.CompanyDAO;
import com.skeleton.dao.RoleDAO;

import com.skeleton.entities.Action;
import com.skeleton.entities.Company;
import com.skeleton.entities.Role;

import com.skeleton.util.SkeletonUtil;
import com.skeleton.util.SystemParameters;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import org.primefaces.model.TreeNode;

/**
 *
 * @author peukianm
 */
@Named(value = "applicationBean")
@ApplicationScoped
public class ApplicationBean implements Serializable {

    String propertyValue;
    List<Company> companies;
    List<Role> roles;
    List<Action> actions;
    
    @PostConstruct
    public void init() {}


    public String getPropertyValue(String key) {
        propertyValue = SystemParameters.getInstance().getProperty(key);
        return propertyValue;
    }
          
    public List<Company> getCompanies() {
        if (companies == null) {
            CompanyDAO dao = new CompanyDAO();
            companies = dao.findByProperty("active", BigDecimal.ONE);
        }
        return companies;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }    
   

    public List<Role> getRoles() {
        if (roles == null) {
            RoleDAO dao = new RoleDAO();
            roles = dao.findAll();
        }
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
    
    
    
    public void resetCompanies() {
        this.companies = null;
    }
      
    
    public List<Action> getActions() {
        if (actions == null) {
            ActionDAO dao = new ActionDAO();
            actions = dao.findAll();
        }
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }
    
}
