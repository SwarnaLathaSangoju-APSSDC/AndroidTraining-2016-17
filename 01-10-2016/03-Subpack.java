package pack1;
public class X
   public void show();
    {  System.out.print("super");
}

}


package pack1.pack2
public class Y
{
  public void display()
{
   System.out.print("sub");
}
}



import pack1.X;
import pack1.pack2.Y;
class Subpack
{

    public static void main(String [] args)
{


   X obj1 = new X();
     obj1.show();
   Y obj2 = new Y();
       obj2.display();
}
}
