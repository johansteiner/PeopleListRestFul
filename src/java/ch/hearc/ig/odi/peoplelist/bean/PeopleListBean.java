/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.peoplelist.bean;

import ch.hearc.ig.odi.peoplelist.services.Services;
import java.util.Date;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author johan.steiner
 */
@Named(value = "peopleListBean")
@RequestScoped
public class PeopleListBean {
    
    private String gender;
    private String firstname;
    private String lastname;
    private boolean married;
    private Date birthDate;

    @Inject Services services;
    
    /**
     * Creates a new instance of PeopleListBean
     */
    public PeopleListBean() {
    }
    
    public List getPeopleList() {
        return services.getPeopleList();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }
    
    public String addPerson() {
        
        services.savePerson(gender, firstname, lastname, married, birthDate);
        return "index.xhtml";
    }
}
