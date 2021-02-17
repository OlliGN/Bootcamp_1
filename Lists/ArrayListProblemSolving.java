package Lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListProblemSolving {
    public static void main(String[] args) {
        List<String> product = new ArrayList<>();
        product.add("Apple");
        product.add("Orange");
        product.add("Pineapple");
        product.add("Tomato");
        product.add("Milk");

        addIfNotPresent(product, "Apple");


    }
    //create a method which will take a list of Strings for product
    //add newProduct to the list if the product does not exist in the list

    public static void addIfNotPresent(List<String> product, String newProduct) {
        if (!product.contains(newProduct)) {
            product.add(newProduct);
            System.out.println(product);
        }
        else{
            System.out.println("Product " + newProduct + " already exists!");
        }
    }

}
