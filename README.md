# Stopwatch tasks by Jirayu Laungwilawan (5910546635)

I ran the tasks on a MacBook Pro (Retina, 13-inch, Early 2015), and got these result:

Task                                                        |Time            
------------------------------------------------------------|---------------:
Append 50,000 chars to String                               |1.598859 sec    
Append 100,000 chars to String                              |4.336637 sec    
Append 100,000 chars to StringBuilder                       |0.005050 sec    
Sum array of double primitives with count = 1,000,000,000   |1.387367 sec    
Sum array of Double objects with count = 1,000,000,000      |7.764714 sec    
Sum array of BigDecimal with count = 1,000,000,000          |11.968344 sec   

## Explanation of Results
### 1. Why does appending 100,000 chars to a String take more than 2X the time to append 50,000 chars?
Ans : Every time when we use + it will create new String and the pointer will point to that memory. What if we create new String it will create new String and point at new memory and leave the old memory like that wait until the new data will overlap the old data. When we have too much old data it will cause computer to slower than usual.
### 2. Why is appending to StringBuilder so much different than appending to String? What is happening to the String?
Ans : When we create StringBuilder instead of create new StringBuilder it will replace the StringBuilder over the old data unlike String.
### 3. Explain difference in time to sum double, Double, and BigDecimal. Which is faster and why?
Ans : double is the fastest because it isn't an objects it is a primitives sometime it round up or down to the nearest value. Double is slower than double and faster than BigDecimal because it have only 2 constructor and have less method than BigDecimal. BigDecimal is the slowest because it have many constructor and method.
### 4. Why is there such a big difference in the time used to append chars to a String and to a StringBuilder? Even though we eventually "copy" the StringBuilder into a String so the final result is the same.
Ans : Because String left data in the memory and that memory will wait until the new data overlap it but StringBuilder will replace that memory when you create new StringBuilder. The leftover data will cause computer slower than usual.
### 5. Why is there a significant difference in times to sum double, Double, and BigDecimal values?
Ans : double is a primitives it require small memory when use it. Double is an class it wraps a value of the primitive type double in an object. The BigDecimal class provides operations for arithmetic, scale manipulation, rounding, comparison, hashing, and format conversion. The toString() method provides a canonical representation of a BigDecimal so it can do a lot of work but it will slow your computer down.
