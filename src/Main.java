public class Main {
    public static void main(String[] args) {
        Author dostoevskii = new Author("Федор", "Достоевский");
        Author pushkin = new Author("Александр", "Пушкин");
        Book idiot = new Book ( "Идиот",dostoevskii,1860 );
        System.out.println(idiot);
        Book blizzard = new Book("Метель", pushkin,1810);
        System.out.println(blizzard);
        blizzard.setYear(1800);
        System.out.println(blizzard);

    }
}