package christmas;


import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import christmas.model.Menu;

public class MenuTest {
    @Test
    void 정상적인_특정_메뉴_가격_반환() {
        Menu menu = new Menu();

        int price = menu.getPriceOfMenu("아이스크림");
        int expectedOutput = 500;

        assertThat(price).isEqualTo(expectedOutput);
    }
}
