package com.jid.datastructures.linkedlists.linkedlist;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by Jorge on 2015-11-03.
 */
public class Node {
    int data;
    Node next;

    public Node(){}

    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

    void Print(Node head) {

        if (head != null){
            System.out.println(head.data);
            Print(head.next);
        }
    }

    Node InsertTail(Node head,int data) {
        Node newNode;
        if(head == null) {
            newNode = new Node(data, null);
            head = newNode;
        } else if (head.next == null) {
            newNode = new Node(data, null);
            head.next = newNode;
        } else {
            InsertTail(head.next, data);
        }
        return head;
    }

    Node InsertHead(Node head,int x) {
        Node newNode = new Node();
        newNode.data = x;
        newNode.next = head;
        return newNode;
    }

    Node InsertNth(Node head, int data, int position) {
        //Will Need to Return Head Node
        Node trackedHeadNode = head;

        Node nodeToInsert = new Node();
        nodeToInsert.data = data;

        //Empty List - Returned newly created node or null
        if (head==null){
            return nodeToInsert;
        }

        //Inserting a Node ahead of the List
        if (position == 0){
            nodeToInsert.next = head;
            return nodeToInsert;
        }

        //Traverse the Singly Linked List to 1 Position Prior
        //Stop traversing if you reached the end of the List
        int currPosition = 0;

        while (currPosition < position -1 && head.next != null){
            head = head.next;
            currPosition++;
        }

        //Inserting a Node in-between a List or at the end of of a List
        Node nodeAtPosition = head.next;
        head.next = nodeToInsert;
        head = head.next;
        head.next = nodeAtPosition;

        return trackedHeadNode;
    }

    Node Delete(Node head, int position){

        if(head == null){
            return null;
        }
        if(position == 0){
            head = head.next;
            return head;
        } else {
            int currentPosition = 1;
            Node temp = head;
            while(temp.next != null) {
                if(currentPosition == position){
                    temp.next = temp.next.next;
                    break;
                } else {
                    temp = temp.next;
                }
                currentPosition++;
            }

            return head;
        }
    }

    Node DeleteRecursive(Node head, int position) {
        if (position == 0){ return head.next; }
        head.next = DeleteRecursive(head.next, position - 1);
        return head;
    }

//    void ReversePrint(Node head) {
//        if(head == null) return;
//
//        Stack<Integer> stack = new Stack<Integer>();
//
//        while(head != null){
//            stack.push(head.data);
//            head = head.next;
//        }
//
//        while(stack.size() > 0){
//            System.out.println(stack.pop());
//        }
//        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//        map.containsKey()
//    }


}
