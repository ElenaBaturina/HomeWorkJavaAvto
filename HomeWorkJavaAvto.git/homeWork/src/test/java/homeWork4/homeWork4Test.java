package homeWork4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.assertThat;


public class homeWork4Test {
    private static Logger logger = LoggerFactory.getLogger("homeWork4Test");

    @Test
    void homeWork4PositiveTest() throws Exception {
        Assertions.assertEquals(homeWork4.areaTriangle(10, 10, 10), 43.3012, 0.001);
    }

    @Test
    void homeWork4NegativeTest() {
        Assertions.assertThrows(Exception.class, () -> homeWork4.areaTriangle(-10, 10, 10));
    }

    @Test
    void assertExample() throws Exception {
        assertThat(homeWork4.areaTriangle(10,10,10)).isPositive();

        logger.info("positive test");

    }

}
