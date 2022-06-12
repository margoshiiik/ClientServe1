import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class CipherTEst {
    @Test
    public void testDeencode() {
        String sourceText = "test12345";
        String cypheredText = Cipher.encode(sourceText);
        String decypheredText = Cipher.decode(cypheredText);
        assertTrue(sourceText.equals(decypheredText));
    }

    @Test
    public void testDeencode2() {
        String sourceText = "sdlfdsfklsoei32op4239432";
        String cypheredText = Cipher.encode(sourceText);
        String decypheredText = Cipher.decode(cypheredText);
        assertTrue(sourceText.equals(decypheredText));
    }
}
