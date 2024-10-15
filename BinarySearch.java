public class BinarySearch {

    public static int Binary(int [] arr , int Target){
        int left = 0;
        int right = arr.length-1;

        while(left<=right){
            int mid = left + (right - left )/2;
            if(mid == Target){
                return Target;
            }
            else if(arr[mid]<Target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int Target = 5;

        System.out.println("Target founad at index "+Binary(arr,Target));
    }
}
