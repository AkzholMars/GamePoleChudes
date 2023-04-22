import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<QuestionAndAnswer> list = List.of(
                new QuestionAndAnswer("Столица Кыргызстана", "Бишкек"),
                new QuestionAndAnswer("Столица России", "Москва"),
                new QuestionAndAnswer("Столица Японии", "Токио"));

        String start = "Да";
        int n = 0;
        while (start.equalsIgnoreCase("да")){
            if (n < list.size()) {
                String q = list.get(n).getQuestion();
                String a = list.get(n).getAnswer().toLowerCase();
                String h = "*".repeat(a.length());
                StringBuilder sb = new StringBuilder(h);
                int c = (int) Math.ceil((float) a.length() / 4);
                System.out.printf("Вопрос №%s: %s\nОтвет: %s\nУ вас %s попытки что-бы отгадать букву\n",
                        n + 1, q, h, c);
                for (int i = 0; i < c; i++) {
                    System.out.println("Введите букву:");
                    String letter = scanner.next();
                    if (a.contains(letter)) {
                        int index = a.indexOf(letter);
                        while (index != -1) {
                            sb.setCharAt(index, letter.charAt(0));
                            index = a.indexOf(letter, index + 1);

                        }
                        h = sb.toString();
                        System.out.println(h);


                    } else {
                        System.out.println("Этой буквы в ответе нет.");
                    }

                }
                System.out.println("Ваш ответ: ");
                String youAnswer = scanner.next().toLowerCase();
                if (youAnswer.equals(a)) {
                    System.out.println("Верно!");

                } else {
                    System.out.println("Неверно!");

                }
                System.out.println("Хотите продолжить? Напишите Да или Нет:");
                n++;
                start = scanner.next();

            }
            else {
                System.out.println("Вопросов больше нет.");
                start = "нет";
            }
        }
    }
}