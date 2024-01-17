// i am not able to solve this problem so i am just coping the code of anothers 
public class 17-Jan {
    vector<vector<int>> uniquePerms(vector<int> &arr ,int n) {
        // code here
        sort(arr.begin(), arr.end());
        vector<vector<int>> out;
        do{
            out.push_back(arr);
        } while(next_permutation(arr.begin(), arr.end()));
        
        return out;
    }
}