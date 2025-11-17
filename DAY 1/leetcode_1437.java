public class leetcode_1437{
    //Check If All 1's Are at Least Length K Places Away
    public static boolean check(int arr[] , int  k){
       int n = arr.length;
       int lastone = -(k+1);
       for(int i = 0; i<n; i++){
        if(arr[i] == 1){
            if(i - lastone -1 < k){
                return false;
            }
            lastone = i;
        }
       }
       return true;
    }
    public static void main(String[] args){
        int arr[] = {1 , 0 , 0 , 0 , 1 , 0 , 0 ,1};
        int k = 2;
        System.out.print("The Answer is this -> " + check(arr , k));
    }
}