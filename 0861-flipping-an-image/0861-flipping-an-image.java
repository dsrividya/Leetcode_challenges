class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        
        for (int i = 0; i < n; i++) {
            int left = 0, right = image[i].length - 1;
            
            while (left <= right) {
                // Swap and invert at the same time
                int temp = image[i][left] ^ 1;
                image[i][left] = image[i][right] ^ 1;
                image[i][right] = temp;
                left++;
                right--;
            }
        }
        
        return image;
    }
}
