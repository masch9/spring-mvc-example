The project can be easily tested within eclipse by running or debugging the
```
src/main/java/de/masch/webstarter/App.java
```
as a java application.

To build and run the app from command line you can use the following steps.<br/>
How to build:
To build the project, run the following command within the project folder.
```
mvn clean install
```

How to run:
To run the produced war, run the following command within the project folder.
```
java -jar target/webstarter-0.0.1-SNAPSHOT.war
```

The dashboard is now reachable on <a>http://localhost:8080/main</a>. <br/>
The default password for the "admin" account is "admin".

The login data are specified within
```
src/main/java/de/masch/webstarter/configuration/SecurityConfiguration.java
```

