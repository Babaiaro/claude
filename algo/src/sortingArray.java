import java.util.Arrays;
import java.util.Scanner;

public class sortingArray {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            // Move left pointer until we find an ODD number
            while (left < right && nums[left] % 2 == 0) {
                left++;
            }

            // Move right pointer until we find an EVEN number
            while (left < right && nums[right] % 2 == 1) {
                right--;
            }

            // Swap the odd and even numbers
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            // Move both pointers after swap
            left++;
            right--;
        }

        return nums;


    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        sortingArray sa = new sortingArray();

        System.out.println("Give the list of numbers to sort by parity: ");
        int size = scanner.nextInt();
        int[] nums = new int[size];

        System.out.println("Enter " + size + "numbers: ");
        for (int i = 0; i < size; i++){
            nums[i] = scanner.nextInt();
        }

        sa.sortArrayByParity(nums);
        System.out.println(Arrays.toString(nums));

    }
}
