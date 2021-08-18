package Lesson5.person;

public class Main {
    public static void main(String[] args) {
        Broker broker = new Broker();
        Client client = new Client();
        Employee employee = new Employee();
        broker.setBonus(15);
        client.setClientId(987654);
        employee.setSalary(100);
        System.out.println("Бонус брокера = " + broker.getBonus());
        System.out.println("ID клиента: " + client.getClientId());
        System.out.println("Зарплата сотрудника банка = " + employee.getSalary());
    }
}
