class Solution {
    public int[] replaceElements(int[] arr) {
       int max = arr[arr.length - 1];

    for(int i = arr.length - 2; i >= 0 ; i--)
    {
        int number = arr[i];
        arr[i] = max;

        if(number > max)
        {
            max = number;
        }
    }
    arr[arr.length - 1] = -1;
    return arr;

    }
}