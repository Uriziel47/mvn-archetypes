package ${package}.test;

import ${package}.SimpleEntity;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SimpleEntityTest {

    @Test
    void builderTest() {
        var human = SimpleEntity.builder()
                .givenName("John")
                .familyName("Doe")
                .age(47)
                .build();

        assertThat(human).as("human")
                .satisfies(h -> {
                    assertThat(h.givenName()).isEqualTo("John");
                    assertThat(h.familyName()).isEqualTo("Doe");
                    assertThat(h.age()).isEqualTo(47);
                    assertThat(h.name()).isEqualTo("John Doe");
                });
    }

}
