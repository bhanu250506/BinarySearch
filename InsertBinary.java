public class InsertBinary {
    public static int SearchInsert(int[] arr,int target){
        int left = 0;
        int right = arr.length - 1;

        while(left<=right){
            int mid = left+(right-left)/2;
            if(arr[mid] == target){
                return mid; //Target Found
            }
            else if(arr[mid]<target){
                left = mid+1;
            }
            else {
                right =  mid-1;
            }
        }

        return left;
    }


    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};
        int target = 22;
        System.out.println("Insert Position : "+SearchInsert(arr,target));
    }


}
