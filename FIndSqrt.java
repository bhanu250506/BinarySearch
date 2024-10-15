public class FIndSqrt {
    public static int Sqrt(int x){
        if(x==0) return 0;

        int left = 1;
        int right = x;

        while(left<=right){
            int mid = left+(right-left)/2;
            if(mid<=x/mid && (mid+1)>x/(mid+1)){
                return mid; // found the integer sqaure root

            }
            else if(mid>x/mid){
                right = mid-1;
            }
            else{
                left =  mid+1;

            }
        }

        return left-1;
    }

    public static void main(String[] args) {
        int x = 25;
        System.out.println("square root of "+ x+ " is "+Sqrt(x));
    }
}
