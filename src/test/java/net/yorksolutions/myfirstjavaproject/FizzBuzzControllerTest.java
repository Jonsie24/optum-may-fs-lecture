package net.yorksolutions.myfirstjavaproject;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ExtendWith(MockitoExtension.class) // Tell Mockito to perform all of its setup when this class is instantiated
class FizzBuzzControllerTest {
    @LocalServerPort
    int port;

    // Tell Mockito to mock this field
    //     mock - fake something
    // Mockito will initialize this field for us
    @Mock
    FizzBuzz mockFizzBuzz; // = new FizzBuzz()

    // Spring, please give me object that you created of type: FizzBuzzController
    @Autowired
    FizzBuzzController controller;

    private static class GenericTest<T> {
        final T object;

        private GenericTest(T object) {
            this.object = object;
        }
    }

    @Test
    void itShouldCallFizzBuzzAndReturnItsValue() {
        final GenericTest<String> g = new GenericTest<String>("hello");
        System.out.println(g.object); // hello
        final var i = new GenericTest<Integer>(5);
        System.out.println(i.object);// 5
        // If anywhere in the app, fizzbuzz is called on the butterfly object, with an input of 4, then
        //    simply return the string "it was called"
        final var m = mockFizzBuzz.fizzbuzz(4);
        final var w = when(m);
        w.thenReturn("it was called");
        controller.setFizzBuzz(mockFizzBuzz);
        final RestTemplate rest = new RestTemplate();
        final ResponseEntity<String> actual = rest.getForEntity("http://localhost:" + port + "/fizzbuzz?input=4", String.class);
        assertEquals(HttpStatus.OK, actual.getStatusCode());
        assertEquals("it was called", actual.getBody());

        final String body = rest.getForObject("http://localhost:" + port + "/fizzbuzz?input=4", String.class);
        assertEquals("it was called", body);
    }
}