// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Person> personList = createPersonList();
//1. This method prints the employees only
        printEmployees(personList);
//2. This method finds the average salary of employees
        double avgSalary = avgSalary(personList);
        System.out.println("avg salary of = " + avgSalary);
//3. This method prints the students only
        printStudents(personList);
//4. This method finds the average GPA of students
        double avgGpa = avgGpa(personList);
        System.out.println("avg GPA of students = " + avgGpa);
    }

    private static ArrayList<Person> createPersonList() {
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Employee("Saad", "0563428255", 200003, 16000));
        personList.add(new Student("Reem", "0564448202", 20000, 3.6));
        personList.add(new Employee("Salem", "0501331845", 200001, 9000));
        personList.add(new Student("Hasan", "0594448202", 20002, 2.8));
        return personList;
    }


    public static void printEmployees(ArrayList<Person> personList) {
        System.out.println("List of Employees:\nName    Phone       ID      Salary");
        for (Person person : personList) {
            if (person instanceof Employee) {
                System.out.println(person.toString());
            }
        }
    }

    public static void printStudents(ArrayList<Person> personList) {
        System.out.println("List of Students:\nName    Phone       ID      GPA");
        for (Person person : personList) {
            if (person instanceof Student) {
                System.out.println(person.toString());
            }
        }
    }

    public static double avgSalary(ArrayList<Person> personList){
        double finalAns = 0;
        int count = 0;
        for (Person person : personList) {
            if (person instanceof Employee) {
                finalAns += ((Employee)person).getSalary();
                count++;
            }
        }
        return finalAns / count;
    }

    public static double avgGpa(ArrayList<Person> personList ){
        double finalAns = 0;
        int count = 0;
        for (Person person : personList) {
            if (person instanceof Student) {
                finalAns += ((Student)person).getGpa();
                count++;
            }
        }
        return finalAns / count;
    }
}
