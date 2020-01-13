/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailycoding;

import java.util.Scanner;

/**
 *
 * @author mohini
 */
public class ReverseOfArray {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner (System.in);
        int n = sc.nextInt();
        //int k= sc.nextInt();

        int arr[] = new int[n];
               
        for (int i = 0; i < n; i++) {
            
            arr[i]=sc.nextInt();
          
        }
//       
            for (int j = n-1; j > 0; j--) {
                System.out.println(arr[j]);
                
            }
                    }
    }
    

