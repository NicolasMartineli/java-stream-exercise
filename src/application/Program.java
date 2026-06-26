package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a full file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Employee> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                String email = fields[1];
                Double salary = Double.parseDouble(fields[2]);
                list.add(new Employee(name, email, salary));
                line = br.readLine();

            }
            System.out.print("Enter salary: ");
            double n = sc.nextDouble();

            Comparator<String> comp = (x, y) -> x.toUpperCase().compareTo(y.toUpperCase());

            List<String> emails = list.stream()
                    .filter(p -> p.getSalary() > n)
                    .map(p -> p.getEmail())
                    .sorted(comp)
                    .collect(Collectors.toList());

            System.out.println("Email of people whose salary is more than " + String.format("%.2f", n) + ":");
            emails.forEach(System.out::println);

            Double sum = list.stream()
                    .filter(p -> p.getName().toUpperCase().charAt(0) == 'M')
                    .map(p -> p.getSalary())
                    .reduce(0.0, (x, y) -> x + y);

            System.out.print("Sum of salary of people whose name starts with 'M': " + sum);


        } catch (IOException e) {
            System.out.print("Error: " + e.getMessage());
        }
        sc.close();
    }
}
