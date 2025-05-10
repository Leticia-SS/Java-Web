package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class DefaultMethods {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Leo", 1500);
        Usuario usuario2 = new Usuario("Lara", 1700);
        Usuario usuario3 = new Usuario("Lucas", 1200);
        List<Usuario> usuarios =  Arrays.asList(usuario1,usuario2,usuario3);

        Consumer<Usuario> mostrarMensagem = u -> System.out.print("Nome: ");
        Consumer<Usuario> imprimirNome = u -> System.out.println(u.getNome());


        usuarios.forEach(mostrarMensagem.andThen(imprimirNome));

        // Cria um predicado para separa usuarios com pontos acima de 600
        Predicate<Usuario> predicate = new Predicate<>() {
            @Override
            public boolean test(Usuario usuario) {
                return usuario.getPontos() > 600;
            }
        };
        // Remove todos que atendem ao predicado
        usuarios.removeIf(predicate);


        // É possivel aplica também como lambda
        usuarios.removeIf(u -> u.getPontos() > 600);



        // Se fosse usar o for (ma pratica de orientacao a objeto)
        for(Usuario u: usuarios){
            if(u.getPontos() > 600){
                usuarios.remove(u);
            }
        }


    }
}
