package singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

class SingletonTest {

    @Test
    @DisplayName("호출되는 모든 인스턴스는 같은 인스턴스이다.")
    void test01() {
        // given
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        // when & then
        assertSame(instance1, instance2);
    }
}
