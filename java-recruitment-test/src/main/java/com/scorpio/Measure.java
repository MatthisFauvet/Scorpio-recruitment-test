package com.scorpio;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *  This class represents a measure into a plc data tree
 */
@Data
@NoArgsConstructor
public class Measure {
    private Long id;

    private String name;

    private DataType dataType;

    /**
     * This function is crucial for eltment research.
     * This function allow users to get any one of these value as long as it has a filter 
     * @param filter - A simple string filled by users when he made a search request
     * @return - Object | return the value asked (by filter)
     */
    public Object measuresFilter(String filter){
        if(filter == "Name"){
            return name;
        }else if(filter == "Id"){
            return id;
        }else if(filter == "DataType"){
            return dataType;
        }else{
            return null;
        }
    }
}
