class Solution {
    public int[] replaceElements(int[] arr) {
        for(int i=0; i<arr.length; i++){
            if(i==arr.length-1){
                arr[i]=-1;
                break;
            }
            for(int j = i+1; j<arr.length-1; i++){
                if(arr[j]>arr[i]){
                    arr[i]=arr[j];
                }else{
                    continue;
                }
            }
        }
        return arr;
    }
}