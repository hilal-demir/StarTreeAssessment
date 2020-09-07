package com.startree;

import java.util.Scanner;

/**
 * @author Hilal Demir
 */
public class StarTree {

    public static void main(String[] args) {
        System.out.println("Welcome to Star Tree. Enter a number:");
        getTreeLayer();
    }

    /**
     * Gets the number from user for deciding the tree level
     */
    public static void getTreeLayer() {
        int treeLayer = -1;
        Scanner in = new Scanner(System.in);
        while (treeLayer < 0) {
            try {
                treeLayer = in.nextInt();
                if (isTreeLayerValid(treeLayer)) {
                    treeBuilder(treeLayer);
                } else {
                    System.out.println("The number should be between 0 and 20");
                    treeLayer = -1;
                }
            } catch (Exception e) {
                System.out.println("Invalid Input. Try Again:");
                in.next();
            }
        }
    }

    /**
     * Controls if the tree layer number is a valid number for this program
     * @param treeLayer number of tree layers
     * @return true if it is valid
     */
    public static boolean isTreeLayerValid(int treeLayer) {
        if (treeLayer < 0 || treeLayer > 20) {
            return false;
        }
        return true;
    }

    /**
     * Builds the star tree according to the tree layer number
     * @param treeLayer number of tree layers
     */
    public static void treeBuilder(int treeLayer) {
        for (int i = 0; i < treeLayer; i++) {
            for (int j = 0; j < treeLayer - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
