import org.junit.rules.ExpectedException;
import org.testng.annotations.Test;
import org.testng.Assert;
import java.io.InputStream;

import java.io.IOException;
import java.io.InputStream;


public class RegistrarClaseTest {

    @Test(expectedExceptions = VacioException.class)
    public void test_emptyname() throws Exception{
        String nombre = "";
        RegistrarClase.IniciarSesion(nombre);
    }

    @Test(expectedExceptions = FormatoException)
    public void test_formato() throws Exception{

    }

}
