package app.needs;

import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stephen
 */
public class Needs {
    String name;
    boolean isChecked;
    Date dateAdded;
    
    public Needs(String name, boolean isChecked, Date dateAdded){
        this.name = name;
        this.isChecked = isChecked;
        this.dateAdded = dateAdded;
    }

    public String getName() {
        return name;
    }

    public boolean isIsChecked() {
        return isChecked;
    }

    public Date getDateAdded() {
        return dateAdded;
    }
    
    
}
