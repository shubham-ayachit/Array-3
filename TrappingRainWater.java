class Solution {
    public int trap(int[] height) {
        
        int totalWater = 0; // Initialize total water trapped to 0
        int n = height.length; // Get the length of the height array
        int l = 0; // Initialize left pointer to the start of the array
        int r = n - 1; // Initialize right pointer to the end of the array
        int lw = 0, rw = 0; // Initialize left and right walls to 0

        // Loop until the left pointer is less than or equal to the right pointer
        while(l <= r) {
            // If the left wall is less than or equal to the right wall
            if(lw <= rw) {
                // If the current height at left pointer is less than the left wall
                if(height[l] < lw) {
                    // Add the difference between left wall and current height to total water
                    totalWater += lw - height[l];
                } else {
                    // Update the left wall to the current height
                    lw = height[l];
                }
                l++; // Move the left pointer to the right
            } else {
                // If the current height at right pointer is less than the right wall
                if(height[r] < rw) {
                    // Add the difference between right wall and current height to total water
                    totalWater += rw - height[r];
                } else {
                    // Update the right wall to the current height
                    rw = height[r];
                }
                r--; // Move the right pointer to the left
            }
        }

        return totalWater; // Return the total water trapped
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(1)
*/
