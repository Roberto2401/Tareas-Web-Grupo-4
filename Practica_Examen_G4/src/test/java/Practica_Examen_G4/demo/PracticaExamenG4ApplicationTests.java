package Practica_Examen_G4.demo;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
@SpringBootTest(classes = PracticaExamenG4Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)


class PracticaExamenG4ApplicationTests {

	@Autowired
    private TestRestTemplate template;

  @Test
    void contextLoads() {
    }

}
