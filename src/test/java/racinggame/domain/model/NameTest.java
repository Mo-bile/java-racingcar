package racinggame.domain.model;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

class NameTest {
    
    @Test
    void 차_이름이_5글자_초과하면_에러() {
        assertThatThrownBy(() ->
            new Name("abcdef")
        ).isInstanceOf(IllegalArgumentException.class)
            .hasMessage("%s", "자동차 이름은 5자를 초과할 수 없다.");
    }
    
}