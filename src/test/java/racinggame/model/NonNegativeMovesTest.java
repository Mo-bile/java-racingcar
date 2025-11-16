package racinggame.model;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class NonNegativeMovesTest {
    @ParameterizedTest
    @ValueSource(ints = {0, -1})
    void moveSetTest(int num) {
        assertThatThrownBy(() -> {
            new NonNegativeMoves(num);
        }).isInstanceOf(IllegalArgumentException.class)
            .hasMessage("%s", "이동횟수에 입력이 생략되거나, 0이하");
    }
}