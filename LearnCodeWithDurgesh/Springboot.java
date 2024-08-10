------------- what is springboot?
  1.Springboot is a java framework that makes it easier to create and run java application.
  2. It simplifies the configuration and setup process,allowing developers to focus more on writing code for their applications.
  3. Springboot facilates rapid application development that allows developers to get production ready code.

----------- What is maven central repository ?
  The Maven Central Repository is a public repository that Java developers can use to find open-source libraries and artifacts for Maven projects.


-------------Garbage collection in Java is the process by which Java programs perform automatic memory management. Java programs compile to bytecode that can be run on a Java Virtual Machine, or JVM for short. When Java programs run on the JVM, objects are created on the heap, which is a portion of memory dedicated to the program. Eventually, some objects will no longer be needed. The garbage collector finds these unused objects and deletes them to free up memory.
--- Just before destroying an object, Garbage Collector calls finalize() method on the object to perform cleanup activities. Once finalize() method completes, Garbage Collector destroys that object.
finalize() method is present in Object class with the following prototype.

---------------------------------------- static binding
When type of the object is determined at compiled time(by the compiler), it is known as static binding.

If there is any private, final or static method in a class, there is static binding.

---------------------------------------Example of static binding
class Dog{  
 private void eat(){System.out.println("dog is eating...");}  
  
 public static void main(String args[]){  
  Dog d1=new Dog();  
  d1.eat();  
 }  
}  
--------------------------------------------Dynamic binding
When type of the object is determined at run-time, it is known as dynamic binding.

------------------------------------------Example of dynamic binding
class Animal{  
 void eat(){System.out.println("animal is eating...");}  
}  
  
class Dog extends Animal{  
 void eat(){System.out.println("dog is eating...");}  
  
 public static void main(String args[]){  
  Animal a=new Dog();  
  a.eat();  
 }  
}  
Test it Now
Output:dog is eating...
In the above example object type cannot be determined by the compiler, because the instance of Dog is also an instance of Animal.So compiler doesn't know its type, only its base type.
