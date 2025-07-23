class Solution {
    public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> ans = new ArrayList<>();
    helper(nums, 0, new ArrayList<>(), ans);
    return ans;
}

public static void helper(int[] nums, int idx, List<Integer> curr, List<List<Integer>> ans) {
    if (idx == nums.length) {
        ans.add(new ArrayList<>(curr));  // copy of current list
        return;
    }

    // Exclude current element
    helper(nums, idx + 1, curr, ans);

    // Include current element
    curr.add(nums[idx]);
    helper(nums, idx + 1, curr, ans);
    curr.remove(curr.size() - 1);  // backtrack
}

}