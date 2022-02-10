package com.example.hello;

import static org.mockito.ArgumentMatchers.anyLong;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest(classes = ContractproducerApplication.class)
public abstract class BaseClass {

    @Autowired
    PersonRestController personRestController;

    @MockBean
    PersonService personService;

    @BeforeEach
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(personRestController);

        Mockito.when(personService.findPersonById(1L))
               .thenReturn(new Person(1L, "foo", "bee"));
    }

}
