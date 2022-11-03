package days69_Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_Cozum3 {


        /*
     // ORIGINAL = 3,6,7,8,9,12,15,17,359
Task 1
Implement a solution to square each integer in the collection named ORIGINAL
and output to the console a comma separated list of the processed values
Expected output : 9,36,49,64,81,144,225,289,128881

Task 2
Implement a solution to obtain only the numbers in the collection named ORIGINAL that are divisible by 3
and output to the console a comma separated list of the values
Expected output : 3,6,9,12,15

Task 3
Implement a solution to sum the adjacent integers in the collection named ORIGINAL
and output to the console a comma separated list of the values
Expected output : 9,16,21,24,29,36,44,391
     */
        public static void main(String[] args) {
            List<Integer> ORIGINAL=new ArrayList<>(Arrays.asList(3,6,7,8,9,12,15,17,359));
            String temp;

            temp=task1(ORIGINAL).toString();
            System.out.println(temp.substring(1,(temp.length()-1)).replace(" ",""));

            temp=task2(ORIGINAL).toString();
            System.out.println(temp.substring(1,(temp.length()-1)).replace(" ",""));

            temp=task3(ORIGINAL).toString();
            System.out.println(temp.substring(1,(temp.length()-1)).replace(" ",""));
        }
        public static List<Integer> task1(List<Integer> arr1){
            Integer temp;
            List<Integer> arr=new ArrayList<>();
            arr.addAll(arr1) ;
            for(int i=0; i<arr.size(); i++){
                temp=arr.get(i)*arr.get(i);
                arr.set(i,temp);
            }
            return arr;
        }
        public static List<Integer> task2(List<Integer> arr1){
            List<Integer> arr=new ArrayList<>();
            for(int i=0; i<arr1.size(); i++) {
                if (arr1.get(i)%3 == 0) {
                    arr.add(arr1.get(i));
                }
            }
            return arr;
        }
        public static List<Integer> task3(List<Integer> arr1){
            List<Integer> arr=new ArrayList<>();
            arr.add((arr1.get(0)+arr1.get(0+1)));
            for(int i=0; i<arr1.size()-2; i++) {
                arr.add((arr1.get(i)+arr1.get(i+1)+arr1.get(i+2)));
            }
            return arr;
        }
    }


