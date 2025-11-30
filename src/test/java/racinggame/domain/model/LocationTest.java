package racinggame.domain.model;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LocationTest {
    
    @Test
    void 차의_처음위치는_0이다() {
        Location location = new Location();
        assertThat(location.getLocation()).isEqualTo(0);
    }
    
    @Test
    void 차의_현재위치는_최대값보다_크다() {
        Location location = new Location(5);
        assertThat(location.isMaxLocation(4)).isTrue();
    }
    
    @Test
    void 차의_최댓값위치에_있는_차는_mo이다() {
        Location location = new Location(5);
        assertThat(location.isSameLocation(5)).isTrue();
    }
    
    @Test
    void 차의_최댓값위치에_있는_차는_mo_가_아니다() {
        Location location = new Location(6);
        assertThat(location.isSameLocation(5)).isFalse();
    }
    
}