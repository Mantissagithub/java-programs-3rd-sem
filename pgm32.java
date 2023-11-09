//pgm32
//demonstration of obect oriented programing

class Student {
   
        String name;
        int age;
        int regno;
        Student(String name,int age,int regno) //constructor
        {
            this.name=name;
            this.age=age;
            this.regno=regno;
        }
        float calcavg(int m1,int m2)   //function
        {
            float avg;
            avg=(m1+m2)/2;
            return avg;
        }
    
}

public class pgm32 {
    public static void main(String args[])
    {
        Student e1=new Student("navu",20,1234); //object
        System.out.println(e1.name);
        System.out.println(e1.age);
        System.out.println(e1.regno);
        float avg=e1.calcavg(75,80);
        System.out.println(avg);
    }
}