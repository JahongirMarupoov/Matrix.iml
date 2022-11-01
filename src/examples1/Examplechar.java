package examples1;

public class Examplechar {
    public static void main(String[] args) {
        int index=0;
        for (int i = 0; i < 65536; i++) {
            char c = 'Ż';
            index=c;
        }
        System.out.println(index);
    }
}
