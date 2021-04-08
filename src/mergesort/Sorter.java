/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;

public class Sorter {
    
    static int [] sorter(int[] array){
        return sorter(array, new int[array.length], 0, array.length -1); 
      
    }
    
    static int[] sorter(int[] array, int[] temp, int left, int right){
        if(left >= right){
            return array;
        }
        int mid = (left + right) /2;
        sorter(array, temp,left, mid);
        sorter(array, temp, mid + 1, right);
        return merge(array,temp, left, right);
        
        
        
    }
    
    static int[] merge(int[] array, int[] temp, int leftStart, int rightEnd){
        int leftEnd = (rightEnd + leftStart)/2;
        int rightStart = leftEnd +1;
        
        int size = rightEnd - leftStart +1;
        
        int left = leftStart;
        int right  = rightStart;
        int index = leftStart;
        
        while(left <= leftEnd && right <=rightEnd){
            if(array[left] <= array[right]){
            temp[index] = array[left];
            left++;
        }else{
                temp[index] = array[right];
                right++;
            }
            index++;
        }
        System.arraycopy(array, left, temp, index, leftEnd -left +1);
        System.arraycopy(array, right, temp, index, rightEnd -right +1);
        System.arraycopy(temp, leftStart, array, leftStart, size);
        
        return temp;

    }
}
