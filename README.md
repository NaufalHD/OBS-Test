Muhammad Naufal Habibie Dwihar
Java Developer

*Personal notes/journal
At first, i've spent 2-3 days just to explore and remind my memories on java programming. Also build my confidence again because it's probably been 5+ years since my last interaction with java environment. Get familiar again with concept of Class, Object, Data structures (Array, List, Map), etc. Utilizing ChatGPT A LOT to understand each concept piece by piece, such asking directly how this specific syntax is works, what are the use of this concept, why use arraylist instead of linkedlist (when I thought linkedlist is the most ideal way because it can add or remove nodes directly in the middle, but i learned that it's not necessary in real-industry scenario and also it uses a lot of CPU power). So much things I've learned, tried to understand to, all of this on the whole 4 days of exploring and doing this project. It really helps to clear the mental fog & mental block while starting on this project

-PROBLEM 1-  
*thought process 
-Initially i didn't understand or get the idea of how the structures of the program was supposed to look like. Is there any other class other than Main Class? Is this involves the concept of objects? How the data gonna be stored and processed? Is the whole test (problem 1, 2, 3) doable with just using CLI or its gonna need a UI and separate DBMS? The mental fog was strong
-

*how to run 
-build the category inside the main method, after flatData list initialization. Shown below. Repeat for each objects initialization and addition to the flatData (flat list). Parameters are (Integer id, String "name", Integer parentsID)
        
		LinkedList<Category> flatData = new LinkedList<Category>();
		
		Category a = new Category(1,"Electronics",null);
        flatData.add(a);
		
-run Main.java

-PROBLEM 2-  
*thought process  

*how to run 
-In the main method under productList initialization, create the product like shown below
-criteria filter is already written. Adjust the filter/criteria by changing the filterCriteria parameter (minPrice, maxPrice, Category)
-example shown below        

		List<Product> productList = new ArrayList<Product>();
        productList.add(new Product(1,"Laptop acer",1500,null));
        productList.add(new Product(2,"Headset BIRU",28700,null));

        Criteria filterCriteria = new Criteria(1400,4000,null);
		
-run Main.java

-PROBLEM 3-  
*thought process  

*how to run 
-add the sourceA and sourceB by adding the data in addDatabase method, as shown below. Repeat for each data        

        Map<String, Object> a1 = new HashMap<String, Object>();
        a1.put("id",1);
        a1.put("name","Apple");
        a1.put("price",5200);
        sourceA.add(a1);
		
		Map<String, Object> b1 = new HashMap<String, Object>();
        b1.put("id",3);
        b1.put("stock",32);
        b1.put("warehouse","WH1");
        sourceB.add(b1);
		
-run Main.java
        
