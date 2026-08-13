class Solution {
    public int maxProduct(int[] arr) {
        int maxProd = arr[0];
        int minProd = arr[0];
        int ans = arr[0];

        for(int i = 1; i < arr.length; i++){
            int oldMin = minProd;
            int oldMax = maxProd;

            maxProd = Math.max(arr[i],Math.max(arr[i]*oldMax,arr[i]*oldMin));
            minProd = Math.min(arr[i],Math.min(arr[i]*oldMax,arr[i]*oldMin));

            ans = Math.max(ans,maxProd);

        }

        return ans;
    }
}
