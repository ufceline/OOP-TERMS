/*
a contrctor:this is a method wich is invoked automatucally whenever a calss instance is called. it takes no return type.

*/

class ConstDemo{
    public ConstDemo(){
        System.out.println("thi is a constractor demonstration");        
        System.out.println("and it will be called automaticaly"); 

    }
    public ConstDemo(int a, int b){
        int answer=a+b;
        System.out.println("and a constractor  can be passed arguments to do operation like here it sums up "+answer);

    }
}

/*
method overloading:this is a way of naming a method with the same name but with differrent argumebnts because it does different things
we can acces parents(super) class's elements with child's instance but never to access child's methods with parent class's instance

*/

class overloadingDemo{
    public int AddNumbers(int a, int b){
         int answer=a+b;
         System.out.println("\nAddition by first method bacause its two arguments, answer is :"+answer);
        return answer;
    }
     public int AddNumbers(int a, int b, int c){
         int answer=a+b+c;
         System.out.println("addition by second method because it is three arguments and answer is : "+answer);
        return answer;
    }

    
}


/*
Inheritance:this is a way in which a class is derivered from another one which they share some properties;
a keyword 'extend' is used to do an inherritance 
a derivered class is called a child class
a class which deliver other is called a parent class
a child class can access public and protected elements of a parent class not private ones


*/

class InheritanceDemo{
    public void BwiraPublic(){
        System.out.println("this is a public method being accesed by an inherited class");
    }
    public void BwiraProtected(){
        System.out.println("this is a protected method being accesed by an inherited class");
    
    }
     private void BwiraPrivate(){
            System.out.println("this is an error, it is never going tobe accessed by a child classes because it is private");
        }
}

class ChildClass extends  InheritanceDemo{

}

/*
method overridding: this is the ability of overtaking superclasses'(parent class) methods over child class, it is implemented in inheritance.

it gives the ability to choose which method to run, either one from parent class or from child class depending on pririor of what we want
it's a simple implementation of polymorphism in OOP.
'super' keyword is used to override a superclasses' methiods.
we can never override a constractor because it two classes can't have the same name in the same program since a constractor must have tha same name as  class's.


*/

class OverriddingDemo{
    public void show(){
        System.out.println("this metthod is going to be overridden over child one");
    }

}
class ChildClassToOverride extends OverriddingDemo{
    
    public void show(){
        super.show();
        System.out.println("let's overrid this method");
    }
    public void showAgain(){
        System.out.println("this wont be invoked a overridden");
    }
}
class OopTerms{
    public static void main(String[] args){
        // constractor demonstration
        //this will run a constractor autotically
        System.out.println("\n\nABOUT CONSTRACTORS");
            System.out.println("--------------------------------------------- ");
        ConstDemo ConstObj=new ConstDemo();
        ConstDemo ConstObj1=new ConstDemo(20,34);


        // inherritance demonstrations 
        System.out.println("\n\n ABOUT INHERITANCE ");
            System.out.println("--------------------------------------------- ");
        ChildClass inObj=new ChildClass();
        //now use child class to access parent methods(elements: variables,methods,arrays, stacks, lists etc...);
        inObj.BwiraPublic();
        inObj.BwiraProtected();
        //inObj.BwiraPrivate(); //if you uncomment this it is never going to run. becouse it is a private 
                                //method to the class InheritanceDemo and we're trying to access it with a child class object 

    //overloading demonstration 
    System.out.println("\n\nABOUT METHOD OVERLOADING ");
    System.out.println(" --------------------------------------------- ");

    overloadingDemo ovlobj=new overloadingDemo();
    ovlobj.AddNumbers(20,30,40);
    ovlobj.AddNumbers(10,20);


    System.out.println(" \n\nABOUT METHOD OVERRIDDING ");

    System.out.println("------------------------- \n\n");

    //by this we can acces show method through
    OverriddingDemo ovrObj1=new ChildClassToOverride();
    ovrObj1.show();
    //ovrObj1.showAgain();//this is an error (if un commented) becouse we are trying to access a ,ethod which we haven't overriden.


    
    }

}
