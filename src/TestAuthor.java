//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TestAuthor {
    public static void main(String[] args) {
        Author a = new Author("Пушкин Александр Сергеевич", "pushkn.a.s@yandex.ru", 'm');
        System.out.println("Имя: " + a.getName());
        System.out.println("Email: " + a.getEmail());
        System.out.println("Пол: " + a.getGender());
        a.setEmail("pushkin.a.s@mail.ru");
        System.out.println("Новый Email: " + a.getEmail());
        System.out.println(a);
    }
}