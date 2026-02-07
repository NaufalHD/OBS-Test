//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.*;
import java.util.function.Predicate;

class Product{
    int id;
    String name;
    int price;
    String category;

    public Product(int id, String name, int price, String category){
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;

    }
}

class Criteria{
    Integer minPrice;
    Integer maxPrice;
    String category;

    public Criteria(Integer minPrice, Integer maxPrice, String category){
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
        this.category = category;
    }
}

class FilterEngine{
//    public static List<Product> filter(List<Product> product, Criteria criteria){
//        List<Product> result = new ArrayList<Product>();
//
//        for (Product p : product){
//            if(criteria.minPrice!=null && p.price < criteria.minPrice){
//                continue;
//            }
//            if(criteria.maxPrice!=null && p.price > criteria.maxPrice){
//                continue;
//            }
//            if(criteria.category!=null && !p.category.equals(criteria.category)){
//                continue;
//            }
//
//            result.add(p);
//        }
//
//        return result;
//    }

//    public static List<Product> filter(List<Product> p, Criteria c){
//        List<Product> result = new ArrayList<Product>();
//
//        for(Product loopP : p){
//            if(matches(loopP,c)){
//                result.add(loopP);
//            }
//        }
//        return result;
//    }

//    private static boolean matches(Product p, Criteria c){
//        if (c.minPrice != null && p.price < c.minPrice) return false;
//        if (c.maxPrice != null && p.price > c.maxPrice) return false;
//        if (c.category != null && !c.category.equals(p.category)) return false;
//        return true;
//    }

    public static List<Product> filter(List<Product> products, Criteria criteria) {

        Predicate<Product> predicate = p -> true;

        if (criteria.minPrice != null) {
            predicate = predicate.and(p -> p.price >= criteria.minPrice);
        }

        if (criteria.maxPrice != null) {
            predicate = predicate.and(p -> p.price <= criteria.maxPrice);
        }

        if (criteria.category != null) {
            predicate = predicate.and(p -> p.category.equals(criteria.category));
        }

        List<Product> result = new ArrayList<>();
        for (Product p : products) {
            if (predicate.test(p)) {
                result.add(p);
            }
        }

        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<Product>();
//        productList.add(new Product(1,"Laptop acer",1500,null));
//        productList.add(new Product(2,"Headset BIRU",28700,null));
//        productList.add(new Product(3,"Baterai Kayu",800,null));

//        Criteria filterCriteria = new Criteria(1400,4000,null);

        List<Product> filteredProduct = FilterEngine.filter(productList,filterCriteria);

        System.out.println("Filtered products is:");
        for(Product fp : filteredProduct){
            System.out.println(fp.id + " " + fp.name + " " + fp.price + " " +fp.category);
        }
    }
}