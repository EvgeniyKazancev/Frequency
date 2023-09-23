package com.test.Frequency.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.LinkedHashMap;

import static org.junit.jupiter.api.Assertions.*;

class FrequencyServiceTest {

    private final FrequencyService frequencyService = new FrequencyService();




    @Test
    public void testCounter() {
       LinkedHashMap<Character,Integer> actual = frequencyService.counter("aaabvv");
       LinkedHashMap<Character,Integer> expected = new LinkedHashMap<>(){{
           put('a',3);
           put('v',2);
           put('b',1);
       }};
        System.out.println(expected);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testCounter2() {
        LinkedHashMap<Character,Integer> actual = frequencyService.counter("мтнквлвлвлв");
        LinkedHashMap<Character,Integer> expected = new LinkedHashMap<>(){{
            put('в',4);
            put('л',3);
            put('т',1);
            put('к',1);
            put('м',1);
            put('н',1);
        }};
        System.out.println(expected);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testCounter3() {
        LinkedHashMap<Character,Integer> actual = frequencyService.counter("ASSSRRTNYYYYY");
        LinkedHashMap<Character,Integer> expected = new LinkedHashMap<>(){{
            put('Y',5);
            put('S',3);
            put('R',2);
            put('A',1);
            put('T',1);
            put('N',1);
        }};
        System.out.println(expected);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testCounter4() {
        LinkedHashMap<Character,Integer> actual = frequencyService.counter("AAAAaaaaBBBBbbb");
        LinkedHashMap<Character,Integer> expected = new LinkedHashMap<>(){{
            put('A',4);
            put('a',4);
            put('B',4);
            put('b',3);

        }};
        System.out.println(expected);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testCounter5() {
        LinkedHashMap<Character,Integer> actual = frequencyService.counter("ADDD55557777ааенеоо");
        LinkedHashMap<Character,Integer> expected = new LinkedHashMap<>(){{
            put('5',4);
            put('7',4);
            put('D',3);
            put('а',2);
            put('е',2);
            put('о',2);
            put('A',1);
            put('н',1);
        }};
        System.out.println(expected);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testCounter6() {
        LinkedHashMap<Character,Integer> actual = frequencyService.counter("~!@#$%^&()_+Q{}|A:\"Z<>?Ё!\"№;%:?()_+Й/ФЯ,");
        LinkedHashMap<Character,Integer> expected = new LinkedHashMap<>(){{
            put('_',2);
            put('!',2);
            put('"',2);
            put('%',2);
            put('(',2);
            put(')',2);
            put('+',2);
            put(':',2);
            put('?',2);
            put('@',1);
            put('A',1);
            put('Ё',1);
            put('Q',1);
            put('№',1);
            put('Й',1);
            put('Z',1);
            put('^',1);
            put('#',1);
            put('$',1);
            put('Ф',1);
            put('&',1);
            put(',',1);
            put('/',1);
            put('Я',1);
            put('{',1);
            put(';',1);
            put('|',1);
            put('<',1);
            put('}',1);
            put('~',1);
            put('>',1);
        }};
        System.out.println(expected);
        Assertions.assertEquals(expected,actual);
    }
}