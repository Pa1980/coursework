public class Main {
    static int counter = 1;
    static Employee[] list = new Employee[10];

    public static void printList() {
        for (int i =0; i < counter-1; i++ ){
            System.out.println(list[i].toString());
        }
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
        System.out.println(counter);

    }
}