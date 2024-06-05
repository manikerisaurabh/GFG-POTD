public class 05-June {
    long find(long a[],long b[],long s1,long s2){
        if((s1-s2)%2==1) return -1L;
        long diff=(s1-s2)/2;
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0,j=0;
        while(i<a.length && j<b.length){
            if(a[i]-b[j]==diff) return 1L;
            else if(a[i]-b[j]>diff) j++;
            else i++;
        }
        return -1L;
    }
    long findSwapValues(long a[], int n, long b[], int m) {
        long s1=0,s2=0;
        for(long i:a) s1+=i;
        for(long i:b) s2+=i;
        long diff=s1-s2;
        if(s1>s2) return find(a,b,s1,s2);
        return find(b,a,s2,s1);
    }
}
