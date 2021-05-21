package com.example.coding;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ContarPalabrasTest {

    private Map<String, Integer> resultadoEsperado;
    String arrayPalabras =
                    "En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un " +
                    "hidalgo de los de lanza en astillero, adarga antigua, rocín flaco y galgo corredor. " +
                    "Una olla de algo más vaca que carnero, salpicón las más noches, duelos y quebrantos " +
                    "los sábados, lantejas los viernes, algún palomino de añadidura los domingos, consumían " +
                    "las tres partes de su hacienda. El resto della concluían sayo de velarte, calzas de " +
                    "velludo para las fiestas, con sus pantuflos de lo mesmo, y los días de entresemana se " +
                    "honraba con su vellorí de lo más fino. Tenía en su casa una ama que pasaba de los " +
                    "cuarenta y una sobrina que no llegaba a los veinte, y un mozo de campo y plaza que " +
                    "así ensillaba el rocín como tomaba la podadera. Frisaba la edad de nuestro hidalgo " +
                    "con los cincuenta años. Era de complexión recia, seco de carnes, enjuto de rostro, " +
                    "gran madrugador y amigo de la caza. Quieren decir que tenía el sobrenombre de Quijada, " +
                    "o Quesada, que en esto hay alguna diferencia en los autores que deste caso escriben, " +
                    "aunque por conjeturas verisímilesII se deja entender que se llamaba Quijana. Pero " +
                    "esto importa poco a nuestro cuento: basta que en la narración dél no se salga un " +
                    "punto de la verdad.";

    @BeforeEach
    void setUp() {
        resultadoEsperado = new HashMap<>();

        resultadoEsperado.put("de",21);
        resultadoEsperado.put("que",10);
        resultadoEsperado.put("los",9);
        resultadoEsperado.put("y", 7);
        resultadoEsperado.put("la", 6);
        resultadoEsperado.put("en", 5);
        resultadoEsperado.put("se", 4);
        resultadoEsperado.put("un", 4);
        resultadoEsperado.put("no", 4);
        resultadoEsperado.put("su", 3);
        resultadoEsperado.put("con", 3);
        resultadoEsperado.put("las", 3);
        resultadoEsperado.put("más", 3);
        resultadoEsperado.put("rocín", 2);
        resultadoEsperado.put("hidalgo", 2);
        resultadoEsperado.put("a", 2);
        resultadoEsperado.put("lo", 2);
        resultadoEsperado.put("nuestro", 2);
        resultadoEsperado.put("esto", 2);
        resultadoEsperado.put("el", 2);
        resultadoEsperado.put("una", 2);
        resultadoEsperado.put("carnero", 1);
        resultadoEsperado.put("narración", 1);
        resultadoEsperado.put("casa", 1);
        resultadoEsperado.put("vellorí", 1);
        resultadoEsperado.put("dél", 1);
        resultadoEsperado.put("quiero", 1);
        resultadoEsperado.put("seco", 1);
        resultadoEsperado.put("concluían", 1);
        resultadoEsperado.put("basta", 1);
        resultadoEsperado.put("antigua", 1);
        resultadoEsperado.put("caso", 1);
        resultadoEsperado.put("hacienda", 1);
        resultadoEsperado.put("decir", 1);
        resultadoEsperado.put("Tenía", 1);
        resultadoEsperado.put("como", 1);
        resultadoEsperado.put("verdad", 1);
        resultadoEsperado.put("punto", 1);
        resultadoEsperado.put("cuyo", 1);
        resultadoEsperado.put("olla", 1);
        resultadoEsperado.put("Quesada", 1);
        resultadoEsperado.put("caza", 1);
        resultadoEsperado.put("edad", 1);
        resultadoEsperado.put("cuarenta", 1);
        resultadoEsperado.put("mucho", 1);
        resultadoEsperado.put("carnes", 1);
        resultadoEsperado.put("Era", 1);
        resultadoEsperado.put("escriben", 1);
        resultadoEsperado.put("Quijana", 1);
        resultadoEsperado.put("Pero", 1);
        resultadoEsperado.put("honraba", 1);
        resultadoEsperado.put("partes", 1);
        resultadoEsperado.put("Quieren", 1);
        resultadoEsperado.put("sus", 1);
        resultadoEsperado.put("por", 1);
        resultadoEsperado.put("madrugador", 1);
        resultadoEsperado.put("deja", 1);
        resultadoEsperado.put("consumían", 1);
        resultadoEsperado.put("adarga", 1);
        resultadoEsperado.put("cincuenta", 1);
        resultadoEsperado.put("Quijada", 1);
        resultadoEsperado.put("tenía", 1);
        resultadoEsperado.put("quebrantos", 1);
        resultadoEsperado.put("mozo", 1);
        resultadoEsperado.put("alguna", 1);
        resultadoEsperado.put("gran", 1);
        resultadoEsperado.put("sábados", 1);
        resultadoEsperado.put("velludo", 1);
        resultadoEsperado.put("resto", 1);
        resultadoEsperado.put("o", 1);
        resultadoEsperado.put("della", 1);
        resultadoEsperado.put("tiempo", 1);
        resultadoEsperado.put("algo", 1);
        resultadoEsperado.put("vaca", 1);
        resultadoEsperado.put("domingos", 1);
        resultadoEsperado.put("acordarme", 1);
        resultadoEsperado.put("lugar", 1);
        resultadoEsperado.put("corredor", 1);
        resultadoEsperado.put("tomaba", 1);
        resultadoEsperado.put("lantejas", 1);
        resultadoEsperado.put("plaza", 1);
        resultadoEsperado.put("entresemana", 1);
        resultadoEsperado.put("importa", 1);
        resultadoEsperado.put("mesmo", 1);
        resultadoEsperado.put("duelos", 1);
        resultadoEsperado.put("veinte", 1);
        resultadoEsperado.put("tres", 1);
        resultadoEsperado.put("lanza", 1);
        resultadoEsperado.put("poco", 1);
        resultadoEsperado.put("hay", 1);
        resultadoEsperado.put("astillero", 1);
        resultadoEsperado.put("sobrenombre", 1);
        resultadoEsperado.put("podadera", 1);
        resultadoEsperado.put("campo", 1);
        resultadoEsperado.put("deste", 1);
        resultadoEsperado.put("ama", 1);
        resultadoEsperado.put("enjuto", 1);
        resultadoEsperado.put("añadidura", 1);
        resultadoEsperado.put("salga", 1);
        resultadoEsperado.put("años", 1);
        resultadoEsperado.put("sobrina", 1);
        resultadoEsperado.put("rostro", 1);
        resultadoEsperado.put("llamaba", 1);
        resultadoEsperado.put("entender", 1);
        resultadoEsperado.put("vivía", 1);
        resultadoEsperado.put("El", 1);
        resultadoEsperado.put("flaco", 1);
        resultadoEsperado.put("En", 1);
        resultadoEsperado.put("Una", 1);
        resultadoEsperado.put("pantuflos", 1);
        resultadoEsperado.put("palomino", 1);
        resultadoEsperado.put("días", 1);
        resultadoEsperado.put("Mancha", 1);
        resultadoEsperado.put("nombre", 1);
        resultadoEsperado.put("salpicón", 1);
        resultadoEsperado.put("sayo", 1);
        resultadoEsperado.put("para", 1);
        resultadoEsperado.put("pasaba", 1);
        resultadoEsperado.put("llegaba", 1);
        resultadoEsperado.put("cuento", 1);
        resultadoEsperado.put("algún", 1);
        resultadoEsperado.put("recia", 1);
        resultadoEsperado.put("diferencia", 1);
        resultadoEsperado.put("verisímilesII", 1);
        resultadoEsperado.put("galgo", 1);
        resultadoEsperado.put("velarte", 1);
        resultadoEsperado.put("calzas", 1);
        resultadoEsperado.put("noches", 1);
        resultadoEsperado.put("fino", 1);
        resultadoEsperado.put("complexión", 1);
        resultadoEsperado.put("autores", 1);
        resultadoEsperado.put("viernes", 1);
        resultadoEsperado.put("aunque", 1);
        resultadoEsperado.put("amigo", 1);
        resultadoEsperado.put("Frisaba", 1);
        resultadoEsperado.put("fiestas", 1);
        resultadoEsperado.put("ha", 1);
        resultadoEsperado.put("así", 1);
        resultadoEsperado.put("conjeturas", 1);
        resultadoEsperado.put("ensillaba", 1);
    }

    @AfterEach
    void tearDown() {
        resultadoEsperado = null;
    }

    @Test
    void contarPalabrasConFor() {
        assertTrue(ContarPalabras.sonIguales(resultadoEsperado,ContarPalabras.ContarPalabrasConFor(arrayPalabras)));
    }

    @Test
    void contarPalabrasConStreams() {
        assertEquals(resultadoEsperado, ContarPalabras.ContarPalabrasConStreams(arrayPalabras));
    }
}