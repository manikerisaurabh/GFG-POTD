public class 22-June {
    long ExtractNumber(String sentence) {
        // code here
        String[] ar=sentence.split(" ");
        long ans=-1,max=-5;
        for(int i=0;i<ar.length;i++){
            boolean c=false;
            for(int j=0;j<ar[i].length();j++){
                if(Character.isDigit(ar[i].charAt(j))){
                    if(ar[i].charAt(j)!='9'){
                        c=true;
                    }
                    else{
                        c=false;
                        break;
                    }
                }
            }
            if(c)
                ans=Long.parseLong(ar[i]);
            if(ans>max){
                max=ans;
            }
        }
        return max;
        
    }
}
