/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] array = {9,3,2,1,4,5,7, 9};
        Sorter s = new Sorter();
//        s.sorter(array);
        System.out.println(Arrays.toString(s.sorter(array)));
    }
    
}
