package ru.geekbrains.ads.lesson6.homework;

import ru.geekbrains.ads.lesson6.Tree;
import ru.geekbrains.ads.lesson6.TreeImpl;

public class TreeTest {

    public static void main(String[] args) {
        int treeCount = 20;
        int balancedTreeCount = 0;
        Tree<Integer> tree;

        for (int i = 0; i < treeCount; i++) {
            tree = newTree(4, 25);
            tree.display();
            if (tree.isBalanced()) balancedTreeCount++;
            System.out.println(tree.isBalanced());
        }

        System.out.println("Balanced " + (double) balancedTreeCount/treeCount * 100 + "% : " + balancedTreeCount + " from " + treeCount);
    }

    private static Tree<Integer> newTree (int level, int spread) {
        Tree<Integer> tree = new TreeImpl<>(level);
        int countNodes = (int) Math.pow(2, level);

        for(int i = 0; i < countNodes; i++) {
            tree.add((int) (Math.random() * spread));
        }
        return tree;
    }


}
