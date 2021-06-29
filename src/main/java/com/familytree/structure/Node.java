package com.familytree.structure;

import java.util.ArrayList;

/**
 * This  class consists of Parents. Only two allowed
 * Parent1 and Parent2 are couples
 * Children list is the list of children for these couple
 * previous is previous generation
 **/
public class Node {
    private Person parent1;
    private Person parent2;
    private ArrayList<Node> children;
    private Node previous;

    public Node()
    {
        children = new ArrayList<>();
    }

    public ArrayList<Node> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Node> children) {
        this.children = children;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
        if(previous != null)
            previous.getChildren().add(this);
    }

    public Person getParent1() {
        return parent1;
    }

    public Person getParent2() {
        return parent2;
    }

    public void setParents(Person p1, Person p2) {
        this.parent1 = p1;
        this.parent2 = p2;
    }

    public void setParents(Person p1) {
        this.parent1 = p1;
        this.parent2 = null;
    }
}