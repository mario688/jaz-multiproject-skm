/*
package pl.edu.pjwstk.jazc.controller;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;



@WebMvcTest(CarCatalogueController.class)
public class CarCatalogueControllerTest {

    @Autowired
    private MockMvc mvc;
    @Test
    void sayHello() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/hello");

        MvcResult result = mvc.perform(request).andReturn();

        assertEquals("Hello, World", result.getResponse().getContentAsString());



    }
    @Test
    void sayHelloWithName() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/hello?name=Mario");
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals("Hello, Mario", result.getResponse().getContentAsString());

    }
}
*/
