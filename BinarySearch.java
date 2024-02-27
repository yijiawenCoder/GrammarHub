import static java.lang.StrictMath.floor;

public class BinarySearch {
    public static void main(String[] args) {


       int[] array = {1, 2, 3, 4, 5};
        int target = 5;

        int result = find(array, target);
        System.out.println("目标元素在数组中的索引为：" + result);
    }
    public static int find(int[] arr, int target) {
        int r = arr.length - 1;
        int l = 0;
        while (true) {
            if(l>r){
                break;
            }
            int mid = (int) floor((r + l) / 2);
            if (target < arr[mid]) {
                r = mid - 1;
            } else if (target > arr[mid]) {
                l = mid + 1;
            } else if (target == arr[mid]) {

                return mid;
            }




        }
        return -1;
    }
 }