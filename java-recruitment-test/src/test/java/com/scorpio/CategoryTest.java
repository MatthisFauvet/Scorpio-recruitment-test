package com.scorpio;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.Stack;

class CategoryTest {

    @BeforeAll
    public static void setUp() {
        System.out.println("Avant tous les tests");
    }

    @Test
    void searchByName() throws IOException {
        Stack ceStack = new Stack();
        results tests = new results();

        Plc ArbreX = new Plc();
        Category CategoryX = ArbreX.loadPlcTree(System.getProperty("user.dir") + "/../resources/plcTree.json");
        

        Assertions.assertEquals(true, CategoryX.searchByName("Temperature"));
    }

    
    @Test
    void searchByDataType() throws IOException {
        Stack ceStack = new Stack();
        results tests = new results();

        Plc ArbreX = new Plc();
        Category CategoryX = ArbreX.loadPlcTree(System.getProperty("user.dir") + "/../resources/plcTree.json");
        

        Assertions.assertEquals(true, CategoryX.searchByDataType(DataType.FLOAT));
    }

    @AfterAll
    public static void tearDown() {
        System.out.println("Une fois que les tests soient passés.");
    }
}