Leaders_in_an_array.md
class Solution{
    //Function to find the leaders in the array.
    public:
    vector<int> leaders(int a[], int n){
        // Code here
        vector<int> list;
        list.push_back(a[n-1]);
        for(int i=n-2; i>=0; i--){
            if(a[i] >= list.back()){
                list.push_back(a[i]);
            }
        }
        reverse(list.begin(),list.end());
        return list;
        
        
        
    }
