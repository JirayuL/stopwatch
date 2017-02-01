# Stopwatch tasks by Jirayu Laungwilawan (5910546635)

I ran the tasks on a MacBook Pro (Retina, 13-inch, Early 2015), and got these result:

Task                                                        |Time            
------------------------------------------------------------|---------------:
Append 50,000 chars to String                               |1.598859 sec    
Append 100,000 chars to String                              |4.336637 sec    
Append 100,000 chars to StringBuilder                       |0.005050 sec    
Sum array of double primitives with count=1,000,000,000     |1.387367 sec    
Sum array of Double objects with count=1,000,000,000        |7.764714 sec    
Sum array of BigDecimal with count=1,000,000,000            |11.968344 sec   

## Explanation of Results
### 1.Why does appending 100,000 chars to a String take more than 2X the time to append 50,000 chars?
Ans ...
