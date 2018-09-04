#### In cxfrs-routing do
```bash
mvn clean install
```

In the **JBoss Fuse client**, install the bundle using maven:
```bash
osgi:install -s mvn:org.bob.cxfrs/example/0.0.1-SNAPSHOT
```

###FOR BOB!

#### JBoss Fuse Deploy Folder
```
3 Jar files are needed within the deploy folder, commons-dbcp-1.4.jar, mysql-connector-java-5.1.38.jar and 
spring-jdbc-5.07.RELEASE.jar
```

#### OSGI Wiring Frame Problems
```
Just add them to the export file in the pom :)
```

#### Database
```
docker run -p 3306:3306 --name user-mysql -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=user -e MYSQL_USER=user -e MYSQL_PASSWORD=user_pass -d mysql:5.6
```
So the database for me currently takes user_name and user_id so remember to change that for database processor if you use another table that doesn't have
the columns user_name


####Additional Notes!

EmployeeServiceResource is a file that can be deleted the purpose of it was mainly because it was configured already so inital coding
went on the file after code worked they were transferred to their correct files.
