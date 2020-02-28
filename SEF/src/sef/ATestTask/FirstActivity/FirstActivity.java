package sef.ATestTask.FirstActivity;

import java.util.*;

public class FirstActivity {

    public static void main(String[] args) {

        //TODO 1 Create collection of employee (more than 5) list or map
        //		System.out.println() result
        Employee a = new Employee();
        a.setFirstName("Johanna");
        a.setSecondName("Nickelson");
        a.setEmpId(1);
        a.setCompanyName("redmadrobot");
        a.setJobTitle("iOS developer");
        a.setSalary(2200);

        Employee b = new Employee();
        b.setFirstName("Steve");
        b.setSecondName("Ronny");
        b.setEmpId(2);
        b.setCompanyName("redmadrobot");
        b.setJobTitle("Android developer");
        b.setSalary(2000);

        Employee c = new Employee();
        c.setFirstName("Emily");
        c.setSecondName("Richards");
        c.setEmpId(3);
        c.setCompanyName("redmadrobot");
        c.setJobTitle("Product Owner");
        c.setSalary(1700);

        Employee d = new Employee();
        d.setFirstName("Gregory");
        d.setSecondName("Chernyshevsky");
        d.setEmpId(4);
        d.setCompanyName("redmadrobot");
        d.setJobTitle("Project Manager");
        d.setSalary(1900);

        Employee e = new Employee();
        e.setFirstName("Olaf");
        e.setSecondName("Cruzenshtern");
        e.setEmpId(5);
        e.setCompanyName("redmadrobot");
        e.setJobTitle("iOS developer");
        e.setSalary(2500);

        Employee f = new Employee();
        f.setFirstName("Marika");
        f.setSecondName("Klodt");
        f.setEmpId(6);
        f.setCompanyName("redmadrobot");
        f.setJobTitle("Sales Manager");
        f.setSalary(2600);

        List EmployeesList = new ArrayList();
        EmployeesList.add(a);
        EmployeesList.add(b);
        EmployeesList.add(c);
        EmployeesList.add(d);
        EmployeesList.add(e);
        EmployeesList.add(f);
        for(Object element : EmployeesList) {
            System.out.println(element.toString());
        }

        //TODO 2 sort and this employees by salary (from min to max)
        // TIP - google bubble sort
        //		System.out.println() result
        public static void bubbleSort(Employee[] EmployeesList) {
            for (int a = 1; a < EmployeesList.size(); a++) {
                for (int b = 0; b < EmployeesList.size() - a; b++) {
                    if (((EmployeesList.get(b).getSalary())
                            .compareTo((EmployeesList.get(b + 1).getSalary()))) > 0) {
                        // swap movies[b] with movies[b+1]
                        Employee temp = (Employee) EmployeesList.get(b);
                        EmployeesList.set(b, EmployeesList.get(b + 1));
                        EmployeesList.set(b + 1, temp);
                    }
                }
            }
        }

 //       Collections.sort(EmployeesList, SalaryComparator);

        //TODO 3 create instance of a Student as a Person ->
        // than ask him introduce()
        // than make them Student
        // than ask him introduce()
        Person gP = new Person();
        gP.setFirstName("Holly");
        gP.setSecondName("Din");
        gP.setAge(25);
        gP.introduce();
       // System.out.println("I am " + gP.getFirstName() + " " + gP.getSecondName() + " and I am " + gP.getAge() + "years old.");
        Student gS = (Student) gP; // convert person to student
        gS.announce();
        //TODO 4 Create method for full change of employee information
        // for example some employee change his work


    }


}
