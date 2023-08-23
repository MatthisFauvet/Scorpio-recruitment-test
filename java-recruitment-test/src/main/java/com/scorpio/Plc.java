package com.scorpio;

import lombok.extern.slf4j.Slf4j;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.*;

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
        category.searchByName("Temperature");
        category.searchByDataType(DataType.FLOAT);
    }

    /**
     * Load the data tree of the Plc from a json file
     *
     * @param filePath - the tree file path
     * @return the root category of the tree
     */
    public Category loadPlcTree(String filePath) throws IOException {
        ObjectMapper temp = new ObjectMapper();
        File treeFileFluxFile = new File(filePath);
        Category tempCategory = temp.readValue(treeFileFluxFile, Category.class);
        return tempCategory;
    }
}
