Muhammad Naufal Habibie Dwihar
<br>Java Developer

*Personal notes/journal<br>
At first, i've spent 2-3 days just to explore and remind my memories on java programming. Also build my confidence again because it's probably been 5+ years since my last interaction with java environment. Get familiar again with concept of Class, Object, Data structures (Array, List, Map), etc. Utilizing ChatGPT A LOT to understand each concept piece by piece, such asking directly how this specific syntax is works, what are the use of this concept, why use arraylist instead of linkedlist (when I thought linkedlist is the most ideal way because it can add or remove nodes directly in the middle, but i learned that it's not necessary in real-industry scenario and also it uses a lot of CPU power). So much things I've learned, tried to understand to, all of this on the whole 4 days of exploring and doing this project. It really helps to clear the mental fog & mental block while starting on this project

-PROBLEM 1-  
*thought process 
<br>
<p>
-Initially i didn't understand or get the idea of how the structures of the program was supposed to look like. Is there any other class other than Main Class? Is this involves the concept of objects? How the data gonna be stored and processed? Is the whole test (problem 1, 2, 3) doable with just using CLI or its gonna need a UI and separate DBMS? The mental fog was strong. Spending 2-3 days to grasp the concept slowly, how to ACTUALLY complete this project (What to expect, where to start, where to explore, etc). What is flat list, what is tree, how to use Object in java, how to create a tree utilizing Object (I have no idea at all / forgotten it if i ever learned it in college). And much more thing<br>
-Figured out how the data might look like. I even thought that user has to input one by one on the CLI.<br>
-Exploring on how to create (initialize) a single object, how the output might look like (I dont know yet how to print a tree on CLI. I dont know if  it's possible)<br>
-I consult on chatgpt, is this will use an if-condition to do the filter? how do I assign an object inside another object? <br>
-figured out that it will involves 3 type of data structure. 1st list is for the initial flat data (each node of the list is an object of Category with its own attributes), 2nd is a hashmap. Iterate through the flat list, and add each of them into the new map, with id attribute uses as the key, and the whole object will put into the value of the map. Why use hashmap? because of how it able to search directly on a data (using on key) without having to loop/iterate the whole list just for a single data (gonna be useful later on the parent-child assigning process)
-While doing this, I wonder, what could be wrong with the flat list data. Is the data will always be valid? With my past knowledge, I instantly knew that one of the probability is that there is case of different data with same id. I ask chatgpt what could be wrong if this case happened? They said that if this happened while transforming the flatlist into hashmap, the previous data will get overwritten by the latest data of the same key (same "id", in this case). I learned something new again, on how the behavior of a Map
-With that consideration in mind, I build a function to let the user know that there's duplicate on this record and the system keep the first data registered and dumped the duplicate (while on the process of transforming flat list into hashmap)
-
</p>
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
        
