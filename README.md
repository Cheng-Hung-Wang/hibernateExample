hibernateExample
==================

Configuration hibernate(4.3.10) connect two databases
-------------------------------------------------------


### STEP 1
    create your database in mysql 

    # bash init_databases.sh

### STEP 2
    open your eclipse and import maven project (hibernateExample) and run main.java
    you will see like this

    Hibernate: insert into stock1.stock (STOCK_CODE, STOCK_NAME) values (?, ?)
    Success update to db 89216530
    Hibernate: insert into stock2.stock (STOCK_CODE, STOCK_NAME) values (?, ?)
    Success update to db 89216530
    
    your databases stock1 and stock2 will update the row datab 

### Note
    If you need to use hibernate version 3.X, in pom.xml add some depedency
    <dependency>
	<groupId>javassist</groupId>
    	<artifactId>javassist</artifactId>
    	<version>3.12.1.GA</version>
    </dependency>

   

   
