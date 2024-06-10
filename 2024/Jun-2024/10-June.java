public class 10-June {

    void matchPairs(int n, char nuts[], char bolts[]) {
        // code here
         HashSet<Character> hs = new HashSet<>();
        for(int i = 0; i < n; i++)
        {
            hs.add(nuts[i]);
        }
        
        int j = 0;
        if(hs.contains('!'))
        {
            nuts[j] = '!';
            bolts[j] = '!';
            j++;
        }
        if(hs.contains('#'))
        {
            nuts[j] = '#';
            bolts[j] = '#';
            j++;
        }
        if(hs.contains('$'))
        {
            nuts[j] = '$';
            bolts[j] = '$';
            j++;
        }
        if(hs.contains('%'))
        {
            nuts[j] = '%';
            bolts[j] = '%';
            j++;
        }
        if(hs.contains('&'))
        {
            nuts[j] = '&';
            bolts[j] = '&';
            j++;
        }
        if(hs.contains('*'))
        {
            nuts[j] = '*';
            bolts[j] = '*';
            j++;
        }
        if(hs.contains('?'))
        {
            nuts[j] = '?';
            bolts[j] = '?';
            j++;
        }
        if(hs.contains('@'))
        {
            nuts[j] = '@';
            bolts[j] = '@';
            j++;
        }
        if(hs.contains('^'))
        {
            nuts[j] = '^';
            bolts[j] = '^';
            j++;
        }
    }
}