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
