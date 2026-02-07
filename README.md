Muhammad Naufal Habibie Dwihar
Java Developer

-PROBLEM 1-  
*thought process  

*how to run 
-build the category inside the main method like shown below. repeat for each objects initialization and addition to the list.
        
		Category a = new Category(1,"Electronics",null);
        LinkedList<Category> flatData = new LinkedList<Category>();
        flatData.add(a);
		
-run Main.java

-PROBLEM 2-  
*thought process  

*how to run 
-under productList initialization, create the product like shown below
-criteria filter is already written. Adjust the filter/criteria by changing at the parameter (minPrice, maxPrice, Category)
-example shown below        

		List<Product> productList = new ArrayList<Product>();
        productList.add(new Product(1,"Laptop acer",1500,null));
        productList.add(new Product(2,"Headset BIRU",28700,null));

        Criteria filterCriteria = new Criteria(1400,4000,null);
		
-run Main.java

-PROBLEM 3-  
*thought process  

*how to run 
-add the sourceA and sourceB by        

		List<Product> productList = new ArrayList<Product>();
        productList.add(new Product(1,"Laptop acer",1500,null));
        productList.add(new Product(2,"Headset BIRU",28700,null));

        Criteria filterCriteria = new Criteria(1400,4000,null);
		
-run Main.java
        
