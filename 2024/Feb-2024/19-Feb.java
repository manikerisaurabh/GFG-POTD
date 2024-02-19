public class 19-Feb {

    static int minValue(String s, int k){
        if(s.length()== 0) {
            return 0;
        }
        if(s.length()==1 && k==1) {
            return 0;
        }
        
        int freq[] = new int[26];
        
        for(char c : s.toCharArray()){
            freq[c - 'a']++;
        }
        
        for(int i=0; i<k; i++){
            Arrays.sort(freq);
            freq[25] -= 1;
        }
        
        int sum = 0;
        for(int i=25; i>=0; i--){
            sum += freq[i]*freq[i];
        }
        
        return sum;
    }
}