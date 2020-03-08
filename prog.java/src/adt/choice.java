package adt;

import java.util.InputMismatchException;

import java.util.Objects;
import java.util.Scanner;

public class choice {
    Node head;
    public void insert(String s) {
        /***
         * method to insert the candidates in a queue
         * call by input class
     ***/
        Node n = new Node(s);  //creation of empty new node to store next data
        if (head == null) {
            head = n;
            System.out.println("Inserted ");
            n.getNext();
        }

        else {
            Node temp = head; //create a temporary node refer to head of the queue
            while (temp.getNext() != null) {
                /***
                 * loop run till next is not equal to null
             ***/
                temp = temp.getNext(); //help to reach the last index
            }
            temp.setNext(n); //set the new node to last index of the queue
            System.out.println("Inserted ");
        }
    }

    public void DisplayAllCandidates() {
        /***
         * method to display all the candidates in queue
         * call by input class
         */
        Node temp = head; //create a temporary node refer to head of the queue
        System.out.println("the candidates in the queue is:");
        while (temp.getNext() != null) {
            /***
             * loop run till next is not equal to null
             ***/
            System.out.print(temp.data + " ");
            temp = temp.getNext();//help to reach at next node after print data
        }
        System.out.println(temp.data + " ");//print last data of queue
    }

    public void removeCandidate(String data) {
        /***
         * method to remove first data in queue
         * call by input class
         */
        if (head.getNext() == null) {
            //runs when list is empty
            System.out.println("can't remove, list is empty");
        } else {
            // runs when list have some data
            Node temp = head; //create a temporary node refer to head of the queue
            temp.data = "null";
            temp = temp.getNext();
            System.out.println(" first data is removed successfully");
        }
    }

    public void lengthOfQueue() {
        /**
         * print the number of candidates in queue
         * call by input class
         */
        int count = 0;
        Node temp = head; //create a temporary node refer to head of the queue
        while (temp.getNext() != null) {
            /***
             * loop run till next is not equal to null
             ***/
            count++;
            temp = temp.getNext();
        }
        int total = count + 1;
        System.out.println("total length " + total);
    }

    public void aheadOfCandidate() {
        /***
         * method to find the total candidate before a perticular user input candidate
         * call by input class
         ***/
        System.out.println("make sure that data must be in queue:");
        System.out.println("enter the name of candidate: ");
        Scanner sc = new Scanner(System.in);
        String data2 = sc.nextLine();
        //Node n2=new Node(data);
        int count = 0;
        Node temp = head; //create a temporary node refer to head of the queue
        while (temp.getNext() != null) {
            /***
             * loop run till next is not equal to null
             ***/
            if (data2.equals(temp.data)) {
                break;
            } else {
                count++;
            }
            temp = temp.getNext();
        }
        int total = count;
        System.out.println("ahead " + total);
    }
    public void searchCandidate() {
        /***
         * method to search a particular candidate exits in queue or not
         * if found print found , if not found print not found
         * call by input class
         ***/
        Node temp = head; //create a temporary node refer to head of the queue
        System.out.println("enter the name of candidate: ");
        Scanner sc = new Scanner(System.in);
        /***
         *scanner class for take user input
         ***/
        String val = sc.nextLine();//take input from user
        int ctr=0; //counter variable to count searched data
        while (temp.getNext() != null) {
            /***
             * loop run till next is not equal to null
             ***/
            if (val.equals(temp.data)) {
                System.out.println(" found");
                ctr++;
                break;
            }
            temp = temp.getNext();
        }
        if(ctr==0){
            System.out.println(" not found");
        }
    }
    public void ExitTheProgram(){
        System.out.println("successfully exit...");
    }
}


