import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class RetanguloTest {

    @Parameterized.Parameters
    public static Collection<Object [] > parametros(){
        return Arrays.asList(new Object[][]{
            {10,20,200},
            {10,30,300}
        });

    }

    private int base;
    private int altura;
    private int area;

    public RetanguloTest(int base , int altura, int area) {
        this.base = base;
        this.altura = altura;
        this.area = area;
    }

    @Test
    public void testCalcularArea(){
        Retangulo retangulo = new Retangulo(base, altura);

        int resultado = retangulo.calcularArea();

        assertEquals(area, resultado);

    }

    @Ignore
    public void testCalcularPerimetro(){

    }


}
