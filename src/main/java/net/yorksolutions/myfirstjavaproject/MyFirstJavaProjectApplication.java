package net.yorksolutions.myfirstjavaproject;

// import - give me access to a thing in another package
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.web.client.RestTemplate;

// visibility in general applies to everything (classes, fields, methods)
// visibility has 4 difference values:
//     public - any other class can access this thing
//     private - only the class that defined this thing can access it
//     protected - private + any class that extends this class can access it
//     (default) or (package) - any class that is in this package can access it

// interface - local building codes
// class - blueprint for a house
// object - is a house

// null - black
// void - the absence of any color

@SpringBootApplication//(exclude={DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class MyFirstJavaProjectApplication {

    public int p;
    private int i;
    public static int s;

    // visibility, modifiers (static), return type, name,
    // arg list
    //      - surrounded by parenthesis
    //      - seperated by commas
    //      - Type
    //      - name
    // method body
    public static void main(String[] args) {
        SpringApplication.run(MyFirstJavaProjectApplication.class, args);
        // fetch in JS makes an HTTP request and provides the response via a promise
        // HTTP request
        // url - where should this request go? who should it go to?
        // method - the kind of request that is being made
        //      GET - retrieve some data
        //      POST - sending information and getting a response
        //      PUT - change something
        //      DELETE - removes an existing thing
        //      PATCH - change a part of something
        // Body - payload related to the request

        // Client makes a request
        // Server listens for a request

        // Spring makes it easy for us to create an HTTP server in Java
        // Spring boot packages everything into one jar file


    }

}
