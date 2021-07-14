import java.util.*;
import java.lang.*;
import java.io.*;

class Employee
{
    int Age,DOB;
    String Name, Emailaddress;

    public Employee(int Age, String Name,
                   String Emailaddress)
    {
        this.Age = Age;
        this.Name = Name;
        this.Emailaddress = Emailaddress;

    }

    public String toString()
    {
        return this.Age + " " + this.Name +
                " " + this.Emailaddress + " " + this.DOB + " ";
    }
}

class SortbyName implements Comparator<Employee>
{

    public int compare(Employee a, Employee b)
    {
        return a.Age - b.Age;
    }
}

class Main {
    public static void main(String[] args)
    {
        ArrayList<Employee> ar = new ArrayList<Employee>();
        ar.add(new Employee(20, "Shashank", "Shashanktripathi20197@acropolis.in", ));
        ar.add(new Employee(21, "Sheetal", "Sheetal@gmai.com"));
        ar.add(new Employee(19, "Sakshi", "Sakshi@gmail.com"));

        System.out.println("Unsorted");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));

        Collections.sort(ar, new SortbyName());

        System.out.println("\nSorted by Age");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));

        Collections.sort(ar, new SortbyName());

        System.out.println("\n Sorted by name");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
    }
}