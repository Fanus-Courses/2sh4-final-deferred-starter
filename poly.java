/* Question 2
[Java Programming]
[20 Marks]

Inheritance and Polymorphism
Consider the following code snippet:
*/
public class Foo {
 public void method1() {
 System.out.println("foo 1");
 }
 public void method2() {
 System.out.println("foo 2");
 }
 public String toString() {
 return "foo";
 }
}
public class Bar extends Foo {
 public void method2() {
 System.out.println("bar 2");
 }
}
public class Baz extends Foo {
 public void method1() {
 System.out.println("baz 1");
 }
 public String toString() {
 return "baz";
 }
}
public class Mumble extends Baz {
 public void method2() {
 System.out.println("mumble 2");
 }
}
public class Polymorphism{
public static void main(String [] args){
Foo[] pity = { new Baz(), new Bar(),
 new Mumble(), new Foo() };
for (int i = 0; i < pity.length; i++) {
 System.out.println(pity[i]);
 pity[i].method1();
 pity[i].method2();
 System.out.println();
}
} 


/*
Write below the output of this program exactly as you might see in the screen (you are NOT allowed to compile or run this code)
*/

