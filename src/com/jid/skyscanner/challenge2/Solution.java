package com.jid.skyscanner.challenge2;

/**
 * Created by Jorge on 2015-10-16.
 * 6
 * mark
 * fred
 * joanne claudia
 * joanne fred
 * Claudia Tom
 * Claudia Mark
 * Mark John
 *
 * From the selected employees, get the highest
 *
 */

import java.util.*;

public class Solution {

    static void OutputCommonManager(int count, Scanner in) {
        Node node = null;

        String selected1 = in.nextLine();
        String selected2 = in.nextLine();

        int loops = 0;

        while(in.hasNext()){
            String employees = in.nextLine();
            String employeeX = employees.substring(0, employees.indexOf(' '));
            String employeeY = employees.substring(employees.indexOf(' ') + 1);


            if(loops == 0){
                node = new Node(employeeX);
                node.value = employeeX;
                node.left = new Node(employeeY);
                loops++;
            }

            insert(node, employeeX, employeeY);
        }
    }

    static void insert(Node node, String employeeX, String employeeY){
        if(node.value.equals(employeeX)){
            if(node.isEmpty(node.left)) {
                node.left = new Node(employeeY);
            } else {
                node.right = new Node(employeeY);
            }
            return;
        }
        else{
            insert(node.left, employeeX, employeeY);
            insert(node.right, employeeX, employeeY);
        }
    }

    static void search(Node node, String selected1, String selected2) {

    }


    static class Node {
        String value;

        Node left;
        Node right;

        public Node(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        boolean isEmpty(Node node){
            return node == null;
        }
    }
}
