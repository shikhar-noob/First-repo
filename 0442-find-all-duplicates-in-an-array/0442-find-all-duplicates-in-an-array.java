class Solution {
   
    public List<Integer> findDuplicates(int[] arr){
      List<Integer> list = new ArrayList<>();

        int i = 0;
        while (i< arr.length){
           
            if (arr[i] != i+1){
             int correct =arr[i];
             int temp=arr[correct-1];
             if(correct!=temp){
             arr[correct-1]=correct;
             arr[i]=temp;}
             else
             i++;
            }else{
                i++;
            }
        }

       for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j+1){
                list.add(arr[j]);
            }
       }
        return list;
   }



//    public void swap(int[] arr, int first, int second) {
//         int temp = arr[first];
//         arr[first] = arr[second];
//         arr[second] = temp;
//     }




}