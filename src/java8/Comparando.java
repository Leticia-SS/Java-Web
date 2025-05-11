package java8;

import java.util.*;

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

    }
}

class MeuComparador implements Comparator<Usuario> {

    @Override
    public int compare(Usuario o1, Usuario o2) {
        return 0;
    }
}
