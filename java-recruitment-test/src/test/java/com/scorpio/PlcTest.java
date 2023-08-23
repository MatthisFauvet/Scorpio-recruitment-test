package com.scorpio;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PlcTest {

    @Test
    void loadPlcTree() throws IOException {
        Plc ArbreX = new Plc();
        Category CategoryX = ArbreX.loadPlcTree(System.getProperty("user.dir") + "/../resources/plcTree.json");

        Assertions.assertEquals("root", CategoryX.getName());        

    }

}

// 