public interface PerfectSquare{

  public static boolean method(double f){
     double sr = Math.sqrt(f);
     return ((sr - Math.floor(sr)) == 0); 
  } 
}
