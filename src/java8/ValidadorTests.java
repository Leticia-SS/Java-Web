package java8;

public class ValidadorTests {
    public static void main(String[] args) {
        Validador<String> validadorDeCep = new Validador<>() {
            @Override
            public boolean valida(String valor) {
                return valor.matches("[0-9]{5}-[0-9]{3}");
                //24501-336
                // [0-9][0-9][0-9][0-9][0-9]-[0-9][0-9][0-9]
                // Para testar regex: regex101.com
            }
        };
    }
}
