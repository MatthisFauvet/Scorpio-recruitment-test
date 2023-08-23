package com.scorpio;

public class results {
    
    public boolean doesExist;
    
    public results() {
        this.doesExist = false;
    }

    public void setTrue() {
        this.doesExist = true;
    }

    public void setFalse() {
        this.doesExist = false;
    }

    public boolean getValue(){
        return this.doesExist;
    }

    public void getString(){
        if(this.doesExist==true){
            System.out.println("la valeur vaut : true ");
        } else {
            System.out.println("la valeur vaut : false ");
        }
    }
    
}
