package com.scorpio;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.*;

import javax.naming.spi.DirStateFactory.Result;

/***
 * This class represents a category into a plc data tree
 */
@Slf4j
@Data
@NoArgsConstructor
public class Category {
    private long id;

    private String name;

    private List<Category> categories;

    private List<Measure> measures;
    
    /**
     * This getMethode help the user to get the category's name
     * 
     * @return the name (String)
     */
    public String getName(){
        return name;
    }

    /**
     * This GetMethode help users to get Category categories.
     * @return
     */
    public List<Category> getCategories(){
        return categories;
    }

    /**
     * This GetMethode help users to get Category categories.
     * @return
     */
    public List<Measure> getMeasures(){
        return measures;
    }


    /**
     * 
     * @param searchString
     * @return - return a boolean for tests [True is word searched had been find]
     */
    public Boolean searchByName(String searchString){
        Stack pile0 = new Stack();
        results tests = new results();
        return searchingByName(searchString, pile0, tests);
    }

    /**
     * @param searchingString - string to search into measure names
     * @param pile - A stack to keep each path to each DataType searched
     * @param doesExist - an object to know if word searched was find 
     */
    private Boolean searchingByName(String searchingString, Stack pile, results doesExist) {
        //Test made to know if the measures has the good name, 
        //If it's the corect name, we're returning previous categories too locate its easier.
        for(int x=0; x<measures.size(); x++){
            if(measures.get(x).getName().equals(searchingString) == true)
            {
                doesExist.setTrue();
                System.out.println(pile + "  " +measures.get(x).getName());
            }
        }   
        for(int i=0; i<categories.size(); i++){
            pile.push(categories.get(i).getName());
            categories.get(i).searchingByName(searchingString, pile, doesExist);
        }
        if(pile.empty() == false){
            pile.pop();
        }
        return doesExist.getValue();
    }


    /**
     * 
     * @param dataType -  dataType to search all measure which matching dataType
     * @return - return a boolean for tests [True is word searched had been find]
     */
    public Boolean searchByDataType(DataType dataType){
        Stack pile0 = new Stack();
        
        results tests = new results();
        return searchingByDataType(dataType, pile0, tests);
    }

    /**
     *
     * @param dataType - dataType to search all measure which matching dataType
     * @param pile - A stack to keep each path to each DataType searched
     * @param doesExist - an object to know if word searched was find 
     */
    private Boolean searchingByDataType(DataType dataType, Stack pile, results doesExist) {

        //Test pour savoir si l'on a trouvé la mesure que l'on veut
        for(int x=0; x<measures.size(); x++){
            if(measures.get(x).getDataType().equals(dataType) == true)
            {
                doesExist.setTrue();
                System.out.println(pile+"  "+measures.get(x).getDataType());
            }
        }   

        for(int i=0; i<categories.size(); i++){
            pile.push(categories.get(i).getName());
            categories.get(i).searchingByDataType(dataType, pile, doesExist);
        }

        if(pile.empty() == false){
            pile.pop();
        }

        return doesExist.getValue();        
    }
}
