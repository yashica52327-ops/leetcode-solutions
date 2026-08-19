// class Solution {
    // public int removeDuplicates(int[] nums) {
        // method 1 
        // if (nums.length == 0)
        //     return 0;

        // int i = 0;

        // for (int j = 1; j < nums.length; j++) {

        //     if (nums[i] != nums[j]) {
        //         i++;
        //         nums[i] = nums[j];
        //     }
        // }

        // return i + 1;
            // }
            // }
        import java.util.ArrayList;

class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : nums) {
            if (!list.contains(num)) {
                list.add(num);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }

        return list.size();
    }
}
    

