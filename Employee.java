import java.util.ArrayList;
// import java.util.Collection;
import java.util.Comparator;
// import java.util.List;

public class Employee {

    int id; String name; String department; double salary; int experience;

    Employee( int i, String n, String d, double s, int e ){ //constructor
        id = i; name = n; department = d; salary = s; experience = e;

    }

    void display(){
        System.out.println(id + "|" + name + "|" + department + "|" + salary + "|" + experience);
    }

    public static void main (String [] args){

        Employee e1 = new Employee(1, "abhishek", "btech cse", 100000.0, 2 ) ;
        Employee e2 = new Employee(2, "anshul", "btech ft", 10000.0, 3 ) ;
        Employee e3 = new Employee(3, "aditya", "btech ece", 20000.0, 4 ) ;
        Employee e4 = new Employee(4, "anurag", "iti", 200000.0, 1 ) ;
        Employee e5 = new Employee(5, "ankit", "pharmacy", 200000.0, 2 ) ;

        ArrayList < Employee > list = new ArrayList<>();

        //Adding
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);

        for (Employee e : list){
            System.out.println("Id: " + e.id + " Name: " + e.name + " Department: " + e.department + " Salary: " + e.salary + " Experience: " + e.experience);
        }

        //Collections.sort(list); //why i am getting error while using this..

        //  finding max salary
        // method 1
        double maxSalary = 0  ;
        for ( Employee e : list){
            if(e.salary > maxSalary){
                maxSalary = e.salary;
            }
        }
        System.out.println("max salary is " + maxSalary);

        Comparator <Employee> byName = (s1,s2) -> s1.name.compareTo(s2.name);
        list.sort(byName);
        
        for (Employee e : list){
            e.display();
        }
        
        Comparator <Employee> bySalary = (s1,s2) -> Double.compare(s1.salary, s2.salary);
        list.sort(bySalary);

    }
    
}