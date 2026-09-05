import java.util.*;

public class NumbersArray {
    public static void main(String[] args) {
        Integer[] input = {1,2,3,4,1,5};

        System.out.println("Input : " + Arrays.toString(input));
        System.out.println("Max number : " + findMax(input));
        System.out.println("Duplicate numbers : " + Arrays.toString(findDuplicates(input)));
        System.out.println("Unique numbers : " + Arrays.toString(findUnique(input)));       
        
        System.out.println();

        input = new Integer[] {1,2,3,4,1,2,5,3};

        System.out.println("Input : " + Arrays.toString(input));
        System.out.println("Max number : " + findMax(input));
        System.out.println("Duplicate numbers : " + Arrays.toString(findDuplicates(input)));
        System.out.println("Unique numbers : " + Arrays.toString(findUnique(input))); 
    }

    // Write your methods here
    public static int findMax(Integer[] input){
        int max = input[0];
        for (int i = 1; i < input.length; i++){
            if (input[i] > max){
                max = input[i];
            }
        }
        return max;
    }

    public static Integer[] findDuplicates(Integer[] input){
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> count = new HashMap<>();
        for (Integer num : input){
            count.put(num, count.getOrDefault(num,0)+1);
        }
        for (Integer key : count.keySet()){
            if (count.get(key) > 1){
                result.add(key);
            }
        }
        return result.toArray(new Integer[0]);
    }

    public static Integer[] findUnique(Integer[] input){
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> count = new HashMap<>();
        for (Integer num : input){
            count.put(num, count.getOrDefault(num,0)+1);
        }
        for (Integer key : count.keySet()){
            if (count.get(key).equals(1)){
                result.add(key);
            }
        }
        return result.toArray(new Integer[0]);
    }
    
}

