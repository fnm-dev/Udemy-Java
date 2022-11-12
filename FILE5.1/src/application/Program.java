package application;

import entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a file path: ");
        String strPath = sc.nextLine();
        File path = new File(strPath);

        List<Product> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(strPath))){
          String line = br.readLine();
          while (line != null){
              String[] item = line.split(", ");
              list.add(new Product(item[0], Double.parseDouble(item[1]), Integer.parseInt(item[2])));
              line = br.readLine();
          }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        boolean success = new File(path.getParent() + "\\out").mkdir();
        System.out.println("Directory created successfully: " + success);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path.getParent() + "\\out\\summary.csv"))) {
            for (Product product: list) {
                bw.write(product.getName() + ", " + product.getPrice() * product.getQuantity());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
