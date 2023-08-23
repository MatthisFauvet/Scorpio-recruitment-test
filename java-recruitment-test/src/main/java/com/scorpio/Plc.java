package com.scorpio;

import lombok.extern.slf4j.Slf4j;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

@Slf4j
public class Plc {
    /**
     * main function of the application
     *
     * @param args
     */
    public static void main(String[] args) throws IOException{
        Plc plc = new Plc();

        Category category = plc.loadPlcTree(System.getProperty("user.dir") + "/resources/plcTree.json");
        
        category.search("Temperature", "Name");
        //category.search(DataType.FLOAT, "DataType");
        //category.search(6287015995768832L, "Id");
    }

    /**
     * Load the data tree of the Plc from a json file
     *
     * @param filePath - the tree file path
     * @return the main category of a Json file. 
     */
    public Category loadPlcTree(String filePath) throws IOException {
        ObjectMapper temp = new ObjectMapper();
        File file = new File(filePath);
        Category tempCategory = temp.readValue(file, Category.class);
        return tempCategory;
    }
}
