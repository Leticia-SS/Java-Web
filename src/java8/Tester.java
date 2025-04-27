package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Tester {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Leo", 1500);
        Usuario usuario2 = new Usuario("Lara", 1700);
        Usuario usuario3 = new Usuario("Lucas", 1200);
        List<Usuario> usuarios =  Arrays.asList(usuario1,usuario2,usuario3);

        for(Usuario u: usuarios){
            System.out.println(u.getNome());
        }

        usuarios.forEach(new Mostrador());

        // Classes Anonimas
        Consumer<Usuario> consumer = new Consumer<Usuario>(){
            public void accept(Usuario usuario){
                System.out.println(usuario.getNome());
            }
        };
        usuarios.forEach(consumer);

    }
}

class Mostrador implements Consumer<Usuario>{

    @Override
    public void accept(Usuario usuario) {
        System.out.println("Usuario: " + usuario.getNome() + " Moderador: " + usuario.isModerador());
    }
}
