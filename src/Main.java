public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1.");
        Author Bulgakov = new Author("Михаил", "Булгаков");
        Author Dostoevskiy = new Author("Федор", "Достоевский");
        Book masterAndMargaritha = new Book("Мастер и Маргарита",Bulgakov ,1940);
        Book brothersKaramazovs = new Book("Братья Карамазовы", Dostoevskiy , 1880);
//        System.out.println(masterAndMargaritha.getNameOfBook());
//        System.out.println(masterAndMargaritha.getYearOfPublication());
//        System.out.println(Bulgakov.getName()+"  "+ Bulgakov.getSurname());

         masterAndMargaritha.setYearOfPublication(1955);
        System.out.println("masterAndMargaritha.getYearOfPublication() = " + masterAndMargaritha.getYearOfPublication());

        System.out.println("Проверка метода to String");
            System.out.println( Bulgakov.toString());
            System.out.println( masterAndMargaritha.toString());
        System.out.println("Проверка метода equals");
            Author Tolstoy = new Author("Лев", "Толстой");
            Author Tolstoy1 = new Author("Лев", "Толстой");
            System.out.println(Tolstoy1.equals(Tolstoy));

        Book brothersKaramazovs1 = new Book("Братья вКарамазовы", Dostoevskiy , 1880);
        System.out.println(brothersKaramazovs1.equals(brothersKaramazovs));

    }
}