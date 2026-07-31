import java.util.*;

class Solution {

    public boolean searchEle(List<Integer> arr, int x) {
        return arr.contains(x);
    }

    public boolean insertEle(List<Integer> arr, int y, int yi) {
        if (yi < 0 || yi > arr.size())
            return false;

        arr.add(yi, y);
        return true;
    }

    public boolean deleteEle(List<Integer> arr, int z) {
        int index = arr.indexOf(z);

        if (index == -1)
            return false;

        arr.remove(index);
        return true;
    }
}