package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split_1() {
        String str = "1,2";
        String[] strArr = str.split(",");
        assertThat(strArr).contains("1");
        assertThat(strArr).contains("2");
    }

    @Test
    void split_2() {
        String str = "1";
        String[] strArr = str.split(",");
        assertThat(strArr).containsExactly("1");

    }

    @Test
    void substring() {
        String str = "(1,2)";
        String newStr = str.substring(1,str.length()-1);
        assertThat(newStr).isEqualTo("1,2");
    }

    @Test
    void StringIndexOutOfBoundsException() {
        String str = "abc";

        assertThatThrownBy(() -> {
            str.charAt(6);
        })
                .isInstanceOf(StringIndexOutOfBoundsException.class)
                .hasMessage("error");
    }



}
