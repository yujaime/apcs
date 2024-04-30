public class Sorting {
    int[] arr;
    public Sorting(int[] a){
        arr = a;
    }
    
    public int[] selectionSort(int[] arr){
        for( int x = 0; x < arr.length-1; x++ ){
            int index = x;
            for( int y = x+1; y < arr.length; y++ ){
                if( arr[index] > arr[y] ){
                    index = y;
                }
            }
            int temp = arr[x];
            arr[x] = arr[index];
            arr[index] = temp;
        }
        return arr;
    }

    public int[] insertionSort(int[] arr){
        for( int x = 1; x < arr.length; x++ ){
            int move = x-1;
            int temp = arr[x];
            while( temp < arr[x-1] && move >= 0 ){
                move--;
                arr[x] = arr[x-1];
            }
            arr[move] = temp;
        }
        return arr;
    }

    public int binarySearch( int goal ){
        int low = 0;
        int high = arr.length-1;
        int mid;
        while( low < high ){
            mid = low+high/2;
            if( arr[mid] == goal ){
                return mid;
            }
            else if( arr[mid] > goal ){
                high = mid/2;
            }
            else if( arr[mid] < goal ){
                high = mid + (mid/2);
                low = mid+1;
            }
        }
        return -1;
    }

    public static int[] merge(int[] arr1, int[] arr2)
	{
			int[] result = new int[arr1.length+arr2.length];

			int pointer1 = 0;
			int pointer2 = 0;
			int pointer3 = 0;

			while(pointer1 < arr1.length && pointer2 < arr2.length){
					if(arr1[pointer1] < arr2[pointer2]) 
					{
						result[pointer3] = arr1[pointer1];
						pointer1++;
					}
					else
					{
						result[pointer3] = arr2[pointer2];
						pointer2++;
					}
			pointer3++;
			}

			while(pointer1 < arr1.length)   
			{
				result[pointer3] = arr1[pointer1];
				pointer3++;
				pointer1++;
			}

			while(pointer2 < arr2.length)    
			{
				result[pointer3] = arr2[pointer2];
				pointer3++;
				pointer1++;
			}

		return result;
	}

    public int partition(int[] arr, int left, int right)
{
  int pivot = left;
  int leftBound = left + 1;
  int rightBound = right;

  while(leftBound <= rightBound){
    while(leftBound <= rightBound && arr[leftBound] <= arr[pivot])  //move leftBound
    {
      leftBound++;
    }

    while(leftBound <= rightBound && arr[rightBound] > arr[pivot])  //move RightBound
    {
      rightBound--;
    }

    if(rightBound < leftBound)
    {
      int temp = arr[pivot];
      arr[pivot] = arr[rightBound];
      arr[rightBound] = temp;
      break;            
    }else{
      int temp = arr[leftBound];
      arr[leftBound] = arr[rightBound];
      arr[rightBound] = temp;
    }  
  }
  return rightBound;
}


}
