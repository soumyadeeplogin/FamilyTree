package com.familytree.structure;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * This is the main tree structure. Consists of Nodes.
 * @author soumyroy
 *
 */
public class FamilyTree {

    //private Node root;
    PriorityQueue<Person> pq;

    public FamilyTree() {
        //root = new Node();
        pq = new PriorityQueue<Person>(Collections.reverseOrder());
    }


    public String display(Node root)
    {
    	String result="";
        if(root==null)
            return "";

        Queue<Node> queue = new ArrayDeque<Node>();
        queue.add(root);
        int size = queue.size();
        int gen = 1;
        while(!queue.isEmpty())
        {
            //System.out.print("Gen " + gen++ + "\n");
        	result+="Gen " + gen++ + "\n";
            for (int i = 0; i < size; i++) {
                Node temp = queue.poll();
                if (temp != null && temp.getParent1() != null && temp.getParent2() != null) {
                    //System.out.print(temp.getParent1().getName() + " -- " + temp.getParent2().getName()+"\t");
                	result+=temp.getParent1().getName() + " -- " + temp.getParent2().getName()+"\t";
                }
                else if (temp.getParent1().getName() == null) {
//                    System.out.print(temp.getParent2().getName()+"\t");
                	result+=temp.getParent2().getName()+"\t";
                } else {
//                    System.out.print(temp.getParent1().getName()+"\t");
                    result+=temp.getParent1().getName()+"\t";
                }
                for (Node node : temp.getChildren()) {
                    queue.offer(node);
                }
                result+="\n";
//                System.out.println();
            }
//            System.out.println();
            	result+="\n";
            size = queue.size();
        }
        System.out.println(result);
        return result;
    }


    public String sortByAge(Node root)
    {
    	String result = "";
        if(root == null)
            return result;
        addToQueue(root);
        while(!pq.isEmpty())
        {
            Person person = pq.poll();
            //System.out.println(person.getName()+" -> "+ person.getAge());
            result+=person.getName()+" -> "+ person.getAge()+"\n";
        }
        System.out.println(result);
        return result;
    }

    private void addToQueue(Node root)
    {
        if(root==null)
            return;
        if(root.getParent1()!=null)
            pq.offer(root.getParent1());
        if(root.getParent2()!=null)
            pq.offer(root.getParent2());

        for(Node node:root.getChildren())
        {
            addToQueue(node);
        }
    }

    public void insert(Node root, Person person)
    {
        if(!insertUtil(root, person))
        {
            root = lastNode(root);

            Node newNode = new Node();
            newNode.setParents(person);
            newNode.setPrevious(root.getPrevious());
            System.out.println(person.getName() + " added to "+root.getPrevious().getParent1().getName());
        }
    }

    private Node lastNode(Node root)
    {
        if(root==null)
            return root;
        Queue<Node> queue = new ArrayDeque<Node>();
        queue.add(root);
        int size = queue.size();
        Node temp = root;
        while(!queue.isEmpty())
        {
            for (int i = 0; i < size; i++) {
                temp = queue.poll();
                if (temp.getParent1() != null && temp.getParent2() != null) {
                }
                else if (temp.getParent1().getName() == null) {
                } else {
                }
                for (Node node : temp.getChildren()) {
                    queue.offer(node);
                }
            }
            size = queue.size();
        }
        return temp;
    }

    private boolean insertUtil(Node root, Person person)
    {
        if(root==null)
        {
            System.out.println("Root is null");
            return false;
        }

        if((root.getParent1() != null && (root.getParent1().getAge() > person.getAge())) || (root.getParent2() != null && (root.getParent2().getAge() > person.getAge())))
        {

            for(int i = 0; i < root.getChildren().size(); i++)
            {
                if(insertUtil(root.getChildren().get(i), person))
                    return true;
            }

        } else {
            Node newNode = new Node();
            newNode.setParents(person);
            newNode.setPrevious(root.getPrevious());
            if(root.getPrevious()==null)
            {
                root.setPrevious(newNode);
            }
            System.out.println(person.getName() + " added to "+root.getPrevious().getParent1().getName());
            return true;
        }

        return false;
    }

}