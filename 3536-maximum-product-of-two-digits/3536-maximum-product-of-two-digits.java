class Solution {
    public int maxProduct(int n) {
      int max=0;
       int l=1;
       String s = String.valueOf(n);
       int [] arr = new int[s.length()];
       for(int i =0;i<s.length();i++){
        arr[i]=s.charAt(i)-'0';
       }
       for(int j=0;j<arr.length-1;j++){
        for(int k=j+1;k<arr.length;k++){
           l= arr[j] * arr[k];
            if(max<l){
                max=l;
            }
        }

       }
       return max;
    }
}