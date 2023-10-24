import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainTest {
    @Test
    public void test(){
        String str = "test!";

        assertThat(str).isEqualTo("test!");
    }
}
