package racinggame.domain.util;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RandomUtilTest {
    
    @Test
    void 랜덤으로_0_9사이_값을_출력한다() {
        assertThat(RandomUtil.generateInt())
            .isLessThan(10);
        assertThat(RandomUtil.generateInt())
            .isGreaterThanOrEqualTo(0);
    }
    
}