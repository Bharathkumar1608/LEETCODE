class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        int[] arr=new int[3];
        int count=0;
        int i=0;

        for(int j=0;j<n;j++){
            char ch=s.charAt(j);
            arr[ch-'a']++;
            while(arr[0]>0 && arr[1]>0 && arr[2]>0){
                count+=n-j;
                arr[s.charAt(i)-'a']--;
                i++;
            }
        }
        return count;
    }
}