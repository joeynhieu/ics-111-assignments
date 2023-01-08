public class TestSquare {


    public static void main(String[] args) {
        
   
int[][] a2d = new int[2][2];
a2d[0][0] = 1;
a2d[0][1] = 2;

a2d[1][0] = 4;



boolean isSquare = true;
for (int i = 0; i < a2d.length && isSquare; i++){
  if (a2d[i].length != a2d.length)
  System.out.println(a2d[i].length);
    isSquare = false;
  
}
System.out.print(isSquare);
}
} 
