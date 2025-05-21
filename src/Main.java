public class Main {
    static int counter = 1;
    static Employee[] list = new Employee[10];

    public static void printList() {
        for (int i =0; i < counter-1; i++ ){
            System.out.println(list[i].toString());
        }
    }
    public static void printFullName() {
        for (int i =0; i < counter-1; i++ ){
            System.out.println(list[i].getFullName());
        }
    }
    public static double result() {
        double res = 0d;
        for (int i = 0; i < counter-1; i++) {
            res += list[i].getSalary();
        }
        return res;
    }
    public static double average() {
        double res = 0d;
        for (int i = 0; i < counter-1; i++) {
            res += list[i].getSalary();
        }
        return res/(counter-1);
    }
    public static int minList() {
        int min = list[0].getSalary();
        for (int i=1; i < counter-1; i++) {
            if (min > list[i].getSalary()) min = list[i].getSalary();
        }
        return min;
    }
    public static int maxList() {
        int max = list[0].getSalary();
        for (int i=1; i < counter-1; i++) {
            if (max < list[i].getSalary()) max = list[i].getSalary();
        }
        return max;
    }


    public static void main(String[] args) {
        list[0] = new Employee( "Иванов Павел Викторович", 1, 50000);
        list[1] = new Employee( "Иванов Иван Викторович", 1, 35000);
        list[2] = new Employee( "Афанасьева Ольга Алексеевна", 1, 45000);
        list[3] = new Employee( "Сидорова Ксения Сергеевна", 1, 15000);
        list[4] = new Employee( "Набижулина Эльвира Сахипзадовна", 1, 500000);
        list[5] = new Employee( "Айтипов Эдмунд Зигмунтович", 1, 65000);
        list[6] = new Employee( "Сидоров Рамзес Арапович", 1, 99000);

        printList();
        System.out.println();
        System.out.println("сумма затрат на ЗП в месяц - "+result());
        System.out.println("минимальная ЗП - "+minList());
        System.out.println("максимальная ЗП - "+maxList());
        System.out.println("среднее значение ЗП - "+average());
        System.out.println();
        printFullName();
    }
}