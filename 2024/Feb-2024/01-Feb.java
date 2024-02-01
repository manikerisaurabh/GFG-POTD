public class 01-Feb {

    //Function to check if a string is Pangram or not.
    public static boolean checkPangram  (String s) {
        // your code here
        if(s.length() <26) {
            return false;
        }
        
        char a =  'a';
        
        for(int i=0; i<26; i++){
            if(s.contains(Character.toString(a)) || s.contains(Character.toString(a).toUpperCase())){
                a++;
            }
            
            else{
                return false;
            }
        }
        
        return true;
    }
}