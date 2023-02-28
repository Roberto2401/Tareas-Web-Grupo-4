package iticket.grupo4;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
@SpringBootTest(classes = Grupo4Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)


class Grupo4ApplicationTests {

	@Autowired
    private TestRestTemplate template;

  @Test
    void contextLoads() {
    }

}