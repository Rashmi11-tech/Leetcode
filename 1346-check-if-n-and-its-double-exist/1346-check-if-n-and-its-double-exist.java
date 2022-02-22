class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> check = new HashSet<>();
        for(int elem : arr){
            if(check.contains(elem)) {
                return true;
            }
            if(elem%2 ==0) {
                check.add(elem/2);
            }
            check.add(elem*2);
                
        }
        return false;
    }
}