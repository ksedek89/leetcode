package pl.aswit.leetcode.easy.task108;


import pl.aswit.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public TreeNode sortedArrayToBST(int[] nums) {
        int currentIndex = nums.length/2;
        TreeNode root = new TreeNode(nums[currentIndex]);
        addToLeft(Arrays.copyOfRange(nums, 0, currentIndex), root);
        addToRight(Arrays.copyOfRange(nums, currentIndex+1, nums.length), root);


        return root;
    }

    private void addToLeft(int[] nums, TreeNode root) {
        if(nums.length == 0){
            return;
        }
        int currentIndex = nums.length/2;
        root.left = new TreeNode(nums[currentIndex]);
        addToLeft(Arrays.copyOfRange(nums, 0, currentIndex), root.left);
        addToRight(Arrays.copyOfRange(nums, currentIndex+1, nums.length), root.left);
    }


    private void addToRight(int[] nums, TreeNode root) {
        if(nums.length == 0){
            return;
        }
        int currentIndex = nums.length/2;
        root.right = new TreeNode(nums[currentIndex]);
        addToLeft(Arrays.copyOfRange(nums, 0, currentIndex), root.right);
        addToRight(Arrays.copyOfRange(nums, currentIndex+1, nums.length), root.right);
    }

}
