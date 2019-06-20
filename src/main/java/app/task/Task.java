/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.task;

import java.util.Date;

/**
 *
 * @author Stephen
 */
public class Task {
    String name;
    Date dateAdded;
    boolean isChecked;

    public Task(String name, Date dateAdded, boolean isChecked) {
        this.name = name;
        this.dateAdded = dateAdded;
        this.isChecked = isChecked;
    }

    public String getName() {
        return name;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public boolean isIsChecked() {
        return isChecked;
    }
    
    
    
}
