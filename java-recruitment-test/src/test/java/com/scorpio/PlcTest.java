package com.scorpio;

import lombok.extern.slf4j.Slf4j;


import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.*;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlcTest {

    @Test
    void loadPlcTree() throws IOException {
        Stack ceStack = new Stack();

        Plc ArbreX = new Plc();
        Category CategoryX = ArbreX.loadPlcTree(System.getProperty("user.dir") + "/../resources/plcTree.json");

        /* 
        ObjectMapper temp = new ObjectMapper();
        File treeFileFluxFile = new File(System.getProperty("user.dir") + "/../resources/plcTree.json");
        Category CategoryY = temp.readValue(treeFileFluxFile, Category.class);
        */

        Assertions.assertEquals("root", CategoryX.getName());        

    }

}

// 