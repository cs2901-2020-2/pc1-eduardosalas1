import org.junit.rules.ExpectedException;
import org.testng.annotations.Test;
import org.testng.Assert;
import java.io.InputStream;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;


public class RegistrarClaseTest {

    @Test(expectedExceptions = VacioException.class)
    public void test_emptyname() throws Exception{
        String nombre = "";
        RegistrarClase Clase1 = new RegistrarClase();
        Clase1.IniciarSesion(nombre);
    }

    @Test(expectedExceptions = FormatoException.class)
    public void test_formato() throws Exception{

        RegistrarClase clase = new RegistrarClase();
        clase.IngresarFormatoClase("");
    }

    @Test(invocationCount = 100, threadPoolSize = 100)
    public void testCase3() throws Exception {
        long startTime = System.currentTimeMillis();
        generic(0);
        long endTime = System.currentTimeMillis();
        long timeElapsed = endTime - startTime;
        Assert.assertTrue(timeElapsed < 500);
    }

    private void generic(int i) throws Exception,VacioException {
        RegistrarClase Clase1 = new RegistrarClase();
        /*Scanner scan = new Scanner(System.in);
        String nombre = scan.next();*/
        String nombre = "Eduardo";
        Clase1.IniciarSesion(nombre);
    }



}
