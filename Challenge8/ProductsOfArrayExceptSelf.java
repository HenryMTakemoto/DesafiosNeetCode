// A partir desse desafio tentarei escrever o código em inglês
// Starting from this challenge, I will start to write the code in english
// In this challenge, I have noticed that it is easier if you use 2 auxiliary arrays
// One for left product results and one for right

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int sizeArray = nums.length;
        int[] left = new int[sizeArray];
        int[] right = new int[sizeArray];
        int[] result = new int[sizeArray];
        left[0] = 1;  // Starting with 1, because there is nothing to the left of the first position
        int x = sizeArray - 1;
        right[x] = 1; // Starting with 1, because there is nothing to the right of the last position

        for (int i = 1; i < nums.length ; i++ ){
            left[i] = left[i-1] * nums[i-1]; // To know the left product of a position, it's just get the left value and multiply by the left product
        }
        for (int i = x-1 ; i >= 0 ; i-- ){
            right[i] = right[i+1] * nums[i+1]; // Same logic here but for right
        }

        for (int i = 0 ; i < nums.length ; i++ ){
            result[i] = left[i] * right[i]; // The final result for a position is the multiplication of its left and right products.
        }
        return result;
    }
}  
