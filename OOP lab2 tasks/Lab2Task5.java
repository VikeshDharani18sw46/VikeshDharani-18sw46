class Lab2Task5 {
 public static void main(String[] args) {
 
  int a = 30, b = 6, c =0;

  System.out.println("a & b = " + (a & b));
  
  System.out.println("a | b = " + (a | b) );
  
  System.out.println("a ^ b = " + (a ^ b) );
  
  System.out.println("~a = " + ~b );

  c = a <<  2;
  System.out.println("a << 1 = " + c );

    c = a >>  2;
  System.out.println("a >> 1  = " + c );

  c = a >>> 2;
  System.out.println("a >>> 1 = " + c );
  
 }
}