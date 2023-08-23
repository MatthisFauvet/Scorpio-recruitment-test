package com.scorpio;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.*;

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
     * @param eltSearch - Elt search by user .
     * @param filter - filter choosed by user to filter measures.
     * @return Boolean return true or false for tests (Junit). 
     */
    public Boolean search(Object eltSearch, String filter){
        Stack<String> pile0 = new Stack();
        Results resultsTests = new Results();

        if(isCorrectValue(filter)){
            return research(eltSearch, pile0, filter, resultsTests).getValue();
        }

        return null;
    }

    /**
     * This methode is use to know if the filter placed by users can be use. 
     * @param filter - A simple string filled by users when he made a search request
     * @return Boolean | True -> filter is valid || false -> filter isn't valid.
     */
    public Boolean isCorrectValue(String filter){
        if(filter.equals(AcceptedData.NAME.getValue()) || filter.equals(AcceptedData.ID.getValue()) || filter.equals(AcceptedData.DATATYPE.getValue())){
            return true;
        } else {
            return false;
        }
    }


    /**
     * 
     * @param eltSearch - Object - Element search by user 
     * @param pile - Stack - A stack to save and print each path to each elt 
     * @param filter - String - A simple string filled by users when he made a search request
     */
    private Results research(Object eltSearch, Stack<String> pile, String filter, Results resultsTests){

        //Test pour savoir si l'on a trouvé la mesure que l'on veut
        for(int x=0; x<measures.size(); x++){

            if(measures.get(x).measuresFilter(filter).equals(eltSearch)){
                System.out.println(pile + "  " + eltSearch);
                resultsTests.setTrue();
            }
        }          

        //Gestion des appels récursifs
        for(int i=0; i<categories.size(); i++){
            pile.push(categories.get(i).getName());
            categories.get(i).research(eltSearch, pile, filter, resultsTests);
        }
        
        //gestion depilage
        if(!pile.empty()){
            pile.pop();
        }

        return resultsTests;
    }

}
