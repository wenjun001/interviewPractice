#### Programming Challenge 1:

One thread to generated Random Integer. 
One thread to print result;
One thread to check whehter primer.

Java_interveiw/pc1/
  Randomizer.java   genrate random and printer result;
  PrimeCheck.java   check whether is prime(use cache to store previous data to speed up)
  Main.java         create thread pool and task to run it.
  
  sample out put:


  PrimeRes{original data =91988483, isPrime:true}
  PrimeRes{original data =689916878, isPrime:false}
  PrimeRes{original data =1558480510, isPrime:false}
  PrimeRes{original data =1800099297, isPrime:false}
  PrimeRes{original data =40224510, isPrime:false}
  PrimeRes{original data =764503442, isPrime:false}
  PrimeRes{original data =1152777053, isPrime:false}
  PrimeRes{original data =998330669, isPrime:false}
  PrimeRes{original data =1751915488, isPrime:false}
  PrimeRes{original data =931604349, isPrime:false}
  PrimeRes{original data =1870955603, isPrime:false}
  PrimeRes{original data =42855512, isPrime:false}
  PrimeRes{original data =1627674714, isPrime:false}
  PrimeRes{original data =1490700818, isPrime:false}
  PrimeRes{original data =1691292112, isPrime:false}
  
If have more time we can use distributed server to check make sure the server always avaiable. 

#### Programming Challenge 2:

1) Reverse of a string without reverse method.
   see the :java_interveiw/pc1/pc2/ReverseUtil.java
2) Find a palindrome
   see the :java_interveiw/pc1/pc2/PalindromeCheck.java
3) Please create a class for the below and send it,
We have a table which has 4 columns as id, name, phone and address.
You need to have a method which will return me the data.
Create a method where you can hard code the data and print the details.
The main aim of above example is how you use data structure.
see the see the :java_interveiw/pc1/pc2/DBUtil.java

#### Question
How do you design an application with JMS messaging?
A:use JMS to handle asychronized use case or integreate other system to decouple association. 

How do you handle exception in JMS consumers and how to you recover?
A: JMS protocol will handle exception we can send messages again 

How do you implement LRU or MRU cache?

A:use hashMap and linkedlist data structure. 
linkedlist to maintain cache and HashMap to quckly get data. 

How would you implement Executor Service?

A:firstly we need implment thread pool and then run tasks from client. 
Then implment queue to cache tasks from client.

Describe singleton design pattern – how would you implement?

A:There are three ways to implment it. 
see my project https://github.com/wenjun001/Singleton

Describe properties of Java String.

A:It's immuablle so it's thread safe.
