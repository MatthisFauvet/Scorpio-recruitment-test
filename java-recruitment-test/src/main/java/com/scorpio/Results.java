package com.scorpio;

public class Results {
    
    public boolean doesExist;
    
    /**
     * COnstructor :  create a simple boolean variable 
     */
    public Results() {
        this.doesExist = false;
    }

    /**
     * Set the boolean doesExist to true
     */
    public void setTrue() {
        this.doesExist = true;
    }

    /**
     * Set the boolean doesExist to false
     */
    public void setFalse() {
        this.doesExist = false;
    }

    /**
     * @return - return the boolean value of doesExist variable. 
     */
    public boolean getValue(){
        return this.doesExist;
    }

    /**
     * This methode is use to print as a String the DoesExist variable value. 
     */
    public void getString(){
        if(this.doesExist==true){
            System.out.println("la valeur vaut : true ");
        } else {
            System.out.println("la valeur vaut : false ");
        }
    }
    
}
