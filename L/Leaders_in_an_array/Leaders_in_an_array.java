class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[n-1]);
        for(int i=n-2; i>=0; i--){
            if(arr[i]>= list.get(list.size()-1)){
                list.add(arr[i]);
            }
        }
        Collections.reverse(list);
        return list;
    }
}
