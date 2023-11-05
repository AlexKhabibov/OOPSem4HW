import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList <Employee>arrayList1 = new ArrayList<>();
        arrayList1.add(new Employee("Name1"));
        arrayList1.add(new Employee("Name2"));
        arrayList1.add(new Employee("Name3"));

        for (Employee o : arrayList1 ) {
                System.out.println(o.getName());
        }

        MyArrayList<Employee> myArrayList = new MyArrayList<> (new Employee[100]);
        myArrayList.add(new Employee("Name1"));
        myArrayList.add(new Employee("Name2"));
        myArrayList.add(new Employee("Name3"));
        System.out.println("Кол-во эл-ов: " + myArrayList.size());
    }
}
