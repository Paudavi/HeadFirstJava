package Books;

import java.util.*;

public class TestTreeComparator {
    public void go() {
        Book b1 = new Book("Rayuela", "Julio Cortazar");
        Book b2 = new Book("Ficciones", "Jorge Luis Borges");
        Book b3 = new Book("Cien años de soledad", "Gabriel Garcia Marquez");
        Book b4 = new Book("Don Quijote", "Miguel de Cervantes");
        Book b5 = new Book("El tunel", "Ernesto Sabato");


    Set<Book> tree = new TreeSet<>();
    tree.add(b1);
    tree.add(b2);
    tree.add(b3);
    tree.add(b4);
    tree.add(b5);
    System.out.println(tree);
    }

    public static void main(String[] args) {
        TestTreeComparator test = new TestTreeComparator();
        test.go();
    }
}
