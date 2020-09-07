package com.startree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StarTreeTest {

    @Test
    void treeLayerValid() {
        boolean validLayer = StarTree.isTreeLayerValid(6);
        assertEquals(true,validLayer);
    }

    @Test
    void treeLayerTooBig() {
        boolean invalidLayer = StarTree.isTreeLayerValid(30);
        assertEquals(false,invalidLayer);
    }

    @Test
    void treeLayerTooSmall() {
        boolean invalidLayer = StarTree.isTreeLayerValid(-5);
        assertEquals(false,invalidLayer);
    }

}