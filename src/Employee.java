public class Employee {
    int salary = 50000;
}
    class Labor extends Employee{
        int bonus = 10000;

        public static void main(String[] args) {
            Labor l = new Labor();
            System.out.println("Salary is "+ l.salary);
            System.out.println("Bonus is "+ l.bonus);
            System.out.println("Salary is "+ (l.bonus+l.salary));
        }
}

