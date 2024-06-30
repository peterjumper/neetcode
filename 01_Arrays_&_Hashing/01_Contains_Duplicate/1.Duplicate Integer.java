// Duplicate Integer
//
// Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

import java.util.HashSet;

class Solution {
  public boolean hasDuplicate(int[] nums) {
    set<Integer> set = new HashSet<>();
    for (int i = 0; i < nums.length; i++){
        if (set.contains(nums[i])) {
            return true;
        }
        set.add(nums[i]);

    }
      return false;
  }
}

class Solution2 {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }
}

class Solution3 {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) // if the current element is equal to the previous element, there is a duplicate
                return true;
        }
        return false;
    }
}

// hastmap
class Solution4 {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        for (int num : nums) {
            if (seen.containsKey(num) && seen.get(num) >= 1)
                return true;
            seen.put(num, seen.getOrDefault(num, 0) + 1);
        }
        return false;
    }
}
