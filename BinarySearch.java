

public class BinarySearch {

  
  public static int binarySearch(int[] list, int key) {
          int low = 0;
          int high = list.length - 1;
          System.out.println("low " + low);
          System.out.println("high " + high);
      
         while (high >= low) {
           System.out.println("low " + low);
           System.out.println("high " + high);
            int mid = (low + high) / 2;
            System.out.println("mid " + "= " + low + " + " + high + " " + "/" + " 2 = " + mid);
            if (key < list[mid]) {
              high = mid - 1;
            System.out.println(" if key < mid high = mid-1 " + mid + " - 1 = " + high);}
            else if (key == list[mid]) {
             return mid;}
         else {
             low = mid + 1;
            System.out.println("else low = mid + 1 = " + low);}
         }
         System.out.println("return " + (-low - 1));
         return -low - 1; // Now high < low
         
       }
  
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
    System.out.println(binarySearch(list, 12));
  }

}