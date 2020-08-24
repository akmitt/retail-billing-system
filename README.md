billing-system


Bill Amount Calculator for Retail Store

 * Problem Statement
 * 
 * On a retail website, the following discounts apply: 
 * 
 * 1. If the user is an employee of the store, he gets a 30% discount 
 * 2. If the user is an affiliate of the store, he gets a 10% discount 
 * 3. If the user has been a customer for over 2 years, he gets a 5% discount. 
 * 4. For every $100 on the bill, there would be a $ 5 discount (e.g. for $ 990, you get $ 45 as a discount). 
 * 5. The percentage based discounts do not apply on groceries. 
 * 6. A user can get only one of the percentage based discounts on a bill.  
 
 * Finds the net payable amount.
 
 
 1.Its a maven project and can this can be imported in eclipse as a Maven Project specifying the pom file. Run [mvn clean eclipse:eclipse] to generate eclipse files for the project.
 
 2. Run [mvn clean install] to install and run all the test cases.
 
 3. Cobertura is used  for Coverage Analysis and Reporting.  Profile named 'qualitycheck' is created in maven with Cobertura plugin.
    To generate Cobertura reports run [mvn clean cobertura:cobertura -Pqualitycheck] . Reports will be generated in the target folder of the project.
 
 4. This Application uses Java 10 and JUnit4.10. IN order to run this from command line Java home and maven  path should be set in enviornment variable
 5. UML diagram is uploaded
 