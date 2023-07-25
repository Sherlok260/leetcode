import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoinChangeII {

    public static int helper(int[] arr, int amount, int count) {
        if(amount == 0) return count;
        if(arr.length == 1) {
            if (amount % arr[0] == 0) {
                count += 1;
            }
            return count;
        }
        int x = amount / arr[0];
        if(x >= 1) {
            int[] arr2 = new int[arr.length-0-1];
            for (int j = 0; j<arr.length-0-1; j++) {
                arr2[j] = arr[j+0+1];
            }
            for (int j=0; j<x; j++) {
                count = helper(arr2, amount - ((x-j) * arr[0]), count);
            }
        } return count;
    }

    static void reverseArray(int intArray[], int size)
    {
        int i, k, temp;
        for (i = 0; i < size / 2; i++) {
            temp = intArray[i];
            intArray[i] = intArray[size - i - 1];
            intArray[size - i - 1] = temp;
        }

    }

    private static void generateCombinations(int[] arr, int index, List<Integer> currentCombination, List<List<Integer>> result) {
        if (index == arr.length) {
            result.add(new ArrayList<>(currentCombination));
            return;
        }

        currentCombination.add(arr[index]);
        generateCombinations(arr, index + 1, currentCombination, result);

        currentCombination.remove(currentCombination.size() - 1);
        generateCombinations(arr, index + 1, currentCombination, result);
    }

    public static int change(int amount, int[] coins) {

        int count = 0;
        if(amount == 0) return 1;

        Arrays.sort(coins);
        reverseArray(coins, coins.length);

        List<List<Integer>> list = new ArrayList<>();
        List<Integer> currentCombination = new ArrayList<>();
        generateCombinations(coins, 0, currentCombination, list);

        list.remove(list.get(list.size()-1));

        int w = 0;
        for (List<Integer> l: list) {
            int[] arr = new int[l.size()];
            for (Integer i: l) {
                arr[w++] = i;
            }
            w = 0;
            count = helper(arr, amount, count);
        }
        return count;
    }

    public static void main(String[] args) {
//        int amount = 17;
//        int amount = 5;
        int amount = 1000;
        int[] coins = {3,5,7,8,9,10,11};
//        int[] coins = {1,2,5};
//        int[] coins = {1,2,3,4};
        System.out.println(change(amount, coins));
    }
}