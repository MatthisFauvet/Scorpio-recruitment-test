package com.scorpio;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

import java.io.IOException;

class CategoryTest {

    @BeforeAll
    public static void setUp() {
        System.out.println("Avant tous les tests");
    }

    
    @Test
    void searchName() throws IOException {
        Plc ArbreX = new Plc();
        Category CategoryX = ArbreX.loadPlcTree(System.getProperty("user.dir") + "/../resources/plcTree.json");
        Assertions.assertTrue(CategoryX.search("Temperature", "Name"));
    }

    @Test
    void searchId() throws IOException {
        Plc ArbreX = new Plc();
        Category CategoryX = ArbreX.loadPlcTree(System.getProperty("user.dir") + "/../resources/plcTree.json");
        Assertions.assertTrue(CategoryX.search(6287015995768832L, "Id"));
    }

    
    @Test
    void searchFalse() throws IOException {
        Plc ArbreX = new Plc();
        Category CategoryX = ArbreX.loadPlcTree(System.getProperty("user.dir") + "/../resources/plcTree.json");
        Assertions.assertFalse(CategoryX.search("Temperature", "Id"));
    }

    @Test
    void searchFalse2() throws IOException {
        Plc ArbreX = new Plc();
        Category CategoryX = ArbreX.loadPlcTree(System.getProperty("user.dir") + "/../resources/plcTree.json");
        Assertions.assertFalse(CategoryX.search("aze", "Name"));
    }


    @Test
    void searchByDataType() throws IOException {
        Plc ArbreX = new Plc();
        Category CategoryX = ArbreX.loadPlcTree(System.getProperty("user.dir") + "/../resources/plcTree.json");
        
        Assertions.assertEquals(true, CategoryX.search(DataType.FLOAT, "DataType"));
    }

    @AfterAll
    public static void tearDown() {
        System.out.println("Une fois que les tests soient passés.");
    }
}