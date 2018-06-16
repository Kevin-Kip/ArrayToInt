## ArrayToInt
Java code to convert an integer array to integer e.g {1,2,4,5} to 1245

I had a hard time figuring this out :smile:
So I chose to share my solution

## The magic?
```java
public class ArrayToInt{
  public static void main(String[] args) {
    int[] intArray = {1,2,3,4};
    int stuff = arrayToInt(intArray);
  }

  public int function arrayToInt(int[] integerArray){
    int result = 0;
    for (int i=0; i<intArray.length; i++) {
      result *= 10;
      result += integerArray[i];
    }
    return result;
  }
}
```
