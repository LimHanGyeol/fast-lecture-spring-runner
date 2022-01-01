package moviebuddy;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author springrunner.kr@gmail
 */
class MovieBuddyApplicationTest {

    public static void main(String[] args) {
        MovieBuddyApplication application = new MovieBuddyApplication();

        List<Movie> result = application.directedBy("Michael Bay");
        assertEquals(3, result.size());

        result = application.releasedYearBy(2015);
        assertEquals(225, result.size());
    }

    static void assertEquals(long expected, long actual) {
        if (expected != actual) {
            throw new RuntimeException(String.format("actual(%d) is different from the expected(%d)", actual, expected));
        }
    }
}
