package codewarsTest.urlShortenerTest;
import codewars.urlShortener.UrlShortener;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.HashMap;
import java.util.stream.Stream;
import java.util.regex.*;
import static org.junit.jupiter.api.Assertions.*;

public class UrlShortenerTest {
    @Test
    public void test_two_different_URLs() {
        HashMap<String,String> urlShortenerDataBase = new HashMap<String,String>();
        String shortURL1 = UrlShortener.urlShortener(urlShortenerDataBase,"https://www.codewars.com/kata/5ef9ca8b76be6d001d5e1c3e");
        urlShortenerDataBase.put("https://www.codewars.com/kata/5ef9ca8b76be6d001d5e1c3e",shortURL1);
        assertTrue(testFormat(shortURL1));
        String shortURL2 = UrlShortener.urlShortener(urlShortenerDataBase,"https://www.codewars.com/kata/5efae11e2d12df00331f91a6");
        urlShortenerDataBase.put("https://www.codewars.com/kata/5efae11e2d12df00331f91a6",shortURL2);
        assertTrue(testFormat(shortURL2));
        assertEquals("https://www.codewars.com/kata/5ef9ca8b76be6d001d5e1c3e", UrlShortener.urlRedirector(urlShortenerDataBase,shortURL1));
        assertEquals("https://www.codewars.com/kata/5efae11e2d12df00331f91a6", UrlShortener.urlRedirector(urlShortenerDataBase,shortURL2));
    }

    @Test
    public void test_same_URLs() {

        HashMap<String,String> urlShortenerDataBase = new HashMap<String,String>();
        String shortURL1 = UrlShortener.urlShortener(urlShortenerDataBase,"https://www.codewars.com/kata/5ef9c85dc41b4e000f9a645f");
        urlShortenerDataBase.put("https://www.codewars.com/kata/5ef9c85dc41b4e000f9a645f",shortURL1);
        assertTrue(testFormat(shortURL1));
        String shortURL2 = UrlShortener.urlShortener(urlShortenerDataBase,"https://www.codewars.com/kata/5ef9c85dc41b4e000f9a645f");
        urlShortenerDataBase.put("https://www.codewars.com/kata/5ef9c85dc41b4e000f9a645f",shortURL2);
        assertTrue(testFormat(shortURL1));
        assertEquals(shortURL1, shortURL2);
        assertEquals(UrlShortener.urlRedirector(urlShortenerDataBase,shortURL1), UrlShortener.urlRedirector(urlShortenerDataBase,shortURL2));
    }

    private static boolean testFormat(String string) {
        return Pattern.matches("^short.ly\\/[a-z]{1,4}$", string);
    }
    @Test
    @DisplayName("Test Verificar Si Long Url ya existe en Base de Datos")
    void testCheckUrlInDatabase() {

        int testRepetitionsValue = 5;
        UrlShortener urlShortener = new UrlShortener();
        HashMap<String,String> urlShortenerDataBase = new HashMap<String,String>();
        urlShortenerDataBase.put("short.ly/akaf", "https://www.codewars.com/kata/5ef9c85dc41b4e000f9a645f");
        urlShortenerDataBase.put("short.ly/yuevb", "https://www.codewars.com/kata/5efae11e2d12df00331f91a6");
        assertAll(
                () -> assertTrue(urlShortener.checkUrlInDatabase(urlShortenerDataBase, "https://www.codewars.com/kata/5efae11e2d12df00331f91a6")),
                () -> assertFalse(urlShortener.checkUrlInDatabase(urlShortenerDataBase, "https://www.codewars.com/kata/5efae11e2d12df00331f91a5")),
                () -> assertTrue(urlShortener.checkUrlInDatabase(urlShortenerDataBase, "https://www.codewars.com/kata/5ef9c85dc41b4e000f9a645f"))

        );

    }

    static Stream<Arguments> getRandomSlugLengthTestArgumentsProvider() {
        return Stream.of(
                Arguments.of(UrlShortener.getRandomSlugLength()),
                Arguments.of(UrlShortener.getRandomSlugLength()),
                Arguments.of(UrlShortener.getRandomSlugLength()),
                Arguments.of(UrlShortener.getRandomSlugLength()),
                Arguments.of(UrlShortener.getRandomSlugLength())
        );
    }

    @ParameterizedTest
    @DisplayName("Test Longitud Slug Url Entre 1 y 4 Ambos Incluídos")
    @MethodSource("getRandomSlugLengthTestArgumentsProvider")
    void testGetRandomSlugLength(int randomValue) {
        assertTrue(randomValue >= 1 && randomValue <= 4);
    }



}
