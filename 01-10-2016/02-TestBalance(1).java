
/* Now, the Balance class, its constructor, and its
show() method are public. This means that they can
be used by non-subclass code outside their package.
*/




package MyPack;
public class Balance {
String name;
double bal;
public Balance(String n, double b) {
name = n;
bal = b;
}
public void show() {
if(bal<0)
System.out.print("--> ");
System.out.println(name + ": $" + bal);
}
}

import MyPack.*;
class TestBalance1 {
public static void main(String args[]) {
/* Because Balance is public, you may use Balance
class and call its constructor. */
Balance test = new Balance("J. J. Jaspers", 99.88);
test.show(); // you may also call show()
}
}









/*As you can see, the Balance class is now public. Also, its constructor and its show( )
method are public, too. This means that they can be accessed by any type of code outside
the MyPack package. For example, here TestBalance imports MyPack and is then able to
make use of the Balance class:*/
/* Call this file AccountBalance.java 
put it in a directory called MyPack.
compile the file. Make sure that the resulting .class file is also in the MyPack
directory. 
executing the AccountBalance class, using the following command line:
java MyPack.AccountBalance
Remember, you will need to be in the directory above MyPack when you execute this command.
 AccountBalance is now part of the package MyPack. This means that it
cannot be executed by itself. That is, you cannot use this command line:
java AccountBalance
AccountBalance must be qualified with its package name.*/




