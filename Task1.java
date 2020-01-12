/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegeproject;

import java.util.Scanner;

/**
 *
 * @author mohini
 */
public class Task1 {

    /**
     * @param args the command line arguments
     */
    int a,b=1,c=0;
    
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a:");
        a=sc.nextInt();
       // b=sc.nextInt();
       
    }
    void prime_check() {
        
        //while (b<=a) {
        for (int b = 1; b <= a; b++) {
           
            if ((a%b) == 0){
                c=c+1;
                //b=b+1;
            }
        //}
      // }
        b=b+1;
        }
        
        if (c == 2) {
            System.out.println("no. is prime");
        }
        else{
        
            System.out.println("no. is not prime");
        }
    }
    
    
    public static void main(String[] args) {
        
        Task1 obj = new Task1();
        obj.input();
        obj.prime_check();
    }
    
}
