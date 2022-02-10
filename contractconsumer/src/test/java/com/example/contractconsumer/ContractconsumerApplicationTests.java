package com.example.contractconsumer;

import com.example.contractconsumer.hello.Person;
import org.assertj.core.api.BDDAssertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.junit.StubRunnerExtension;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class ContractconsumerApplicationTests {

    @Test
    void contextLoads() {
    }

//    @RegisterExtension
    public StubRunnerExtension stubRunner = new StubRunnerExtension()
        .downloadStub("com.example", "contractproducer", "0.0.1-SNAPSHOT", "stubs")
        .withPort(8100)
        .stubsMode(StubRunnerProperties.StubsMode.LOCAL);

//    @Test
    public void get_person_from_service_contract() {
        // given:
        RestTemplate restTemplate = new RestTemplate();

        // when:
        ResponseEntity<Person> personResponseEntity = restTemplate.getForEntity("http://localhost:8100/person/1", Person.class);

        // then:
        BDDAssertions.then(personResponseEntity.getStatusCodeValue()).isEqualTo(200);
        BDDAssertions.then(personResponseEntity.getBody().getId()).isEqualTo(1L);

    }
}
