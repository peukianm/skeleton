/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.skeleton.bean;

import com.skeleton.entities.Address;
import com.skeleton.entities.Company;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import org.primefaces.model.TreeNode;

/**
 *
 * @author peukianm
 */
@ManagedBean
@ViewScoped
public class CompanyBean implements Serializable {

    @ManagedProperty(value = "#{sessionBean}")
    private SessionBean sessionBean;
    private List<Company> companies = new ArrayList<Company>(0);
    private Company company;
    private Boolean isInsert = false;
    private Address address;

    @PostConstruct
    public void init() {        
        System.out.println("INITIALIZING IN Company Bean!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1111");

    }

    @PreDestroy
    public void reset() {
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Boolean getIsInsert() {
        return isInsert;
    }

    public void setIsInsert(Boolean isInsert) {
        this.isInsert = isInsert;
    }

   
    public List<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public SessionBean getSessionBean() {
        return sessionBean;
    }

    public void setSessionBean(SessionBean sessionBean) {
        this.sessionBean = sessionBean;
    }
}
