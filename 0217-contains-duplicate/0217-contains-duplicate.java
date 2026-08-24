// import java.util.ArrayList;
// // method 1 o(n*n)
// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         ArrayList<Integer> list = new ArrayList<>();

//         for (int num : nums) {
//             if (list.contains(num)) {
//                 return true;
//             }
//             list.add(num);
//         }

//         return false;
//     }
// }}
import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }
}