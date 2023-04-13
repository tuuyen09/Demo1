package product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Bút", 5000));
        products.add(new Product(2, "Vở", 12000));
        products.add(new Product(3, "Hộp bút", 20000));
        products.add(new Product(4, "Tẩy", 8000));
        products.add(new Product(5, "Bút chì", 5000));
        writeProduct("product.txt", products);
        List<Product> products1 = readProduct("product.txt");
        for (Product product : products1){
            System.out.println(product);
        }

    }

    public static void writeProduct(String path, List<Product> products){
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public static List<Product> readProduct(String path){
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return products;
    }
}
