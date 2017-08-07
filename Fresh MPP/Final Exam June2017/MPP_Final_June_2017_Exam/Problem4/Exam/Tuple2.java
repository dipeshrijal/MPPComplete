package Problem4.Exam;
public class Tuple2<T1, T2>
{
  public T1 t1;
  public T2 t2;
 
  public Tuple2(T1 first, T2 second)
  {
    t1 = first;
    t2 = second;
  }
 
  @Override
  public String toString()
  {
    return "(" + t1 + ", " + t2 + " " + ")";
  }
}