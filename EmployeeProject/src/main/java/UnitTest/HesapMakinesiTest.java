package UnitTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HesapMakinesiTest {

    @Test
    public void TestTopla(){

        //GİVEN
       HesapMakinesi hesapmakinesi = new HesapMakinesi();
       int sayı1=5;
       int sayı2=19;

       //WHEN
       int topla=hesapmakinesi.topla(sayı1,sayı2);

       //THEN
        assertEquals(24,topla);

    }

    @Test
    public void TestCikar() throws Exception {

        HesapMakinesi hesapMakinesi= new HesapMakinesi();

        assertEquals(20,hesapMakinesi.cikar(50,30));

    }

}
