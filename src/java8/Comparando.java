package java8;

import java.util.*;
import java.util.function.Function;

import static java.util.Comparator.comparing;

public class Comparando {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Leo", 1500);
        Usuario usuario2 = new Usuario("Lara", 1700);
        Usuario usuario3 = new Usuario("Lucas", 1200);
        List<Usuario> usuarios =  new ArrayList<>();
        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

        List<String> nomes = new ArrayList<>();
        nomes.add("Leo");
        nomes.add("Andre");
        nomes.add("Pedro");

        Collections.sort(nomes);
        System.out.println(usuarios);

        MeuComparador meuComparador = new MeuComparador();

        Comparator<Usuario> comparator2 = (u1,u2) -> u1.getNome().compareTo(u2.getNome());

        Comparator<Usuario> comparator = new Comparator<>() {
            @Override
            public int compare(Usuario u1, Usuario u2) {
                return u1.getNome().compareTo(u2.getNome());
            }
        }; // Classe anonima
        Collections.sort(usuarios,meuComparador);
        System.out.println(usuarios);

        Collections.sort(usuarios, (u1,u2) -> u1.getNome().compareTo(u2.getNome()));
        usuarios.sort((u1,u2) -> u1.getNome().compareTo(u2.getNome()));

        nomes.sort(Comparator.reverseOrder());


        Function<Usuario,String> extraiNome = u -> u.getNome();
        Comparator<Usuario> comparator3 = comparing(extraiNome);
        usuarios.sort(comparator3);

        Function<Usuario, Integer> extraiPontos = u -> u.getPontos();
        Comparator<Usuario> comparator4 = comparing(extraiPontos);
        usuarios.sort(comparator4);
        System.out.println(usuarios);
        usuarios.sort(comparing(Usuario::getPontos)
                .thenComparing(Usuario::getNome)
                .thenComparing(Usuario::isModerador)
        );

    }
}

class MeuComparador implements Comparator<Usuario> {

    @Override
    public int compare(Usuario o1, Usuario o2) {
        return 0;
    }
}
