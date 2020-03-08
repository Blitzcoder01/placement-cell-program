package adt;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * program name: Placement Cell Program
 * developer name: Riya Mathur
 * time:01:26:00 pm
 * date:22nd-feb-2020
 * venue:GLA University
 */

public class input {
    /***
     * a user intract class
     * call by main class
     ***/
    public void userFunction() {
        /***
         * user intract function
         ***/
        try {
            System.out.println("*****Placement Cell Program*****");
            Scanner sc = new Scanner(System.in);
            System.out.println("want to enter in program");
            System.out.println("press " + 1 + " for enter:");
            System.out.println("press " + 0 + " for exit");
            int choice = sc.nextInt();
            if (choice == 1) {
                try {
                    choice ob = new choice();  /***
                     * object declaration as ob of class choice
                     * ob help to call various choice class functions whenever required
                     ***/
                    System.out.println("press " + 1 + " for insert a queue of candidates:");
                    int input_choice1 = sc.nextInt(); //variable to storethe choice
                    if (input_choice1 == 1) {
                        System.out.println("Number of candidates want to insert is:");
                        int count = sc.nextInt();
                        sc.nextLine();
                        System.out.println("enter your data:");
                        for (int i = 0; i < count; i++) {
                            /***
                             * loop help to enter the data to user
                             ***/
                            System.out.println("Enter "+(i+1) +" data");
                            String input2 = sc.nextLine();
                            ob.insert(input2); //calling of input function
                        }
                        while (true) {
                            System.out.println(" * press " + 2 + " for display the list of all candidates:");
                            System.out.println(" * press " + 3 + " for remove a particular candidate:");
                            System.out.println(" * press " + 4 + " for total length of queue:");
                            System.out.println(" * press " + 5 + " for number of candidates ahead a particular candidate:");
                            System.out.println(" * press " + 6 + " to search for the candidate:");
                            System.out.println(" * press " + 7 + " for Exit the program:");
                            int input_choice = sc.nextInt(); //variable to store the choice
                            if (input_choice == 2) {
                                ob.DisplayAllCandidates(); // calling od DisplayAllCandidates() function
                            } else if (input_choice == 3) {
                                String input3 = sc.nextLine();
                                ob.removeCandidate(input3);//calling of removeCandidate function()
                            } else if (input_choice == 4) {
                                ob.lengthOfQueue(); //calling of lengthOfQueue() function
                            } else if (input_choice == 5) {
                                ob.aheadOfCandidate();// calling of aheadOfCandidate() function
                            } else if (input_choice == 6) {
                                ob.searchCandidate();//calling of searchCandidate() function
                            }
                            else if (input_choice == 7) {
                                ob.ExitTheProgram();//calling of ExitTheProgram() function
                                break;
                            }
                        }
                    }
                     else {
                         //runs when user input different choice mentioned above
                        System.out.println("try again");
                    }

                } catch (InputMismatchException e) {
                    //block to handle exception
                    System.out.println(" wrong value try again..");
                }
            } else if (choice == 0) {
                //runs when user press 0 to exit the program
                System.out.println("successfully exit..... ");
            } else {
                //runs when user input unexpected input
                System.out.println("wrong input, try again....");
            }
        }
        catch(InputMismatchException e){
            //block to handle exception
                System.out.println(" please enter correct input....");
            }
    }
}
