package rpm_java;
import java.util.*;

public class main {
    public static void main(String[] args) {
        /*System.out.println("Hello");
        int[] int1 =new int[10];
        Integer[] int2 =new Integer[10];
        System.out.println(Arrays.toString(int1));
        System.out.println(Arrays.toString(int2));
        for (int j: int1){
            System.out.println(j+" ");
        }
        String s1 = "2345assd1";
        System.out.println(s1.indexOf('1'));
        System.out.println(s1.toUpperCase());*/
        /*Scanner myscan = new Scanner(System.in);
        System.out.println("Введите диапазон");
        int min = myscan.nextInt();
        int max = myscan.nextInt();

        int count = 1;
        Random rand = new Random();
        int num;
        num = rand.nextInt(max-min+1);
        num = num+min;
        System.out.println("Введите кол-во попыток");
        int max_count = myscan.nextInt();
        System.out.println("Диапазон: " + min + "-" + max + "\n введите число");
        int inp = myscan.nextInt();
        do {
            if (inp < num) {
                min = inp;
                System.out.println("Число меньше");
                System.out.println("Диапазон: " + min + "-" + max + "\n введите число");
                inp = myscan.nextInt();
                count++;
            } else if (inp > num) {
                max = inp;
                System.out.println("Число больше");
                System.out.println("Диапазон: " + min + "-" + max + "\n введите число");
                inp = myscan.nextInt();
                count++;
            }

        } while ((inp != num) && (count <= max_count));
        if (count > max_count) {
            System.out.println("Закончились попытки");
        } else
            System.out.println("Вы угадали! число попыток:" + count);*/
        /*Teacher teacher = new Teacher("Ivan", "Ivanov", "Ivanovich",  GenderEnum.MALE, 65, "biology", 3);
        Student student = new Student("Petr", "Petrov", "Petrovich",  GenderEnum.MALE, 18, 2);
        Student student1 = new Student("Olga", "Sidorova", "Ivanovna",  GenderEnum.FEMALE, 19, 3);
        School school = new School("pr. Lenina", 4, 13, "Hogwarts",
                new ArrayList<Teacher>(Arrays.asList(teacher)), new ArrayList<>(Arrays.asList(student1)));
        System.out.println(school.addEntity(student));
        System.out.println(school);
        System.out.println(school.getBuildingType().getRus());
        school.workAll();
        System.out.println(school.nextYearAll());*/
        Book book1 =new Book("Сказка о царе Салтане", "Пушкин", 100);
        Book book2 = new Book("Евгений Онегин", "Пушкин", 200);
        Book book3 = new Book("Мцыри", "Лермонтов", 50);
        Map<String, Integer> map = new HashMap<>();
        map.put("Сказка о царе Салтане", 1);
        map.put("Евгений Онегин", 5);
        Library library =new Library("Школа №5", "ул. Устинова, 12", new ArrayList<Book>(Arrays.asList(book1, book2)), map);
        System.out.println(library.hasBook("Евгений Онегин"));
        library.addBook(book3);
        System.out.println(library);
        System.out.println(library.takeBook("Сказка о царе Салтане"));
        System.out.println(library);
        System.out.println(library.bookCount("Мцыри"));
        System.out.println(library.hasBook("Сказка о царе Салтане"));
    }
}
