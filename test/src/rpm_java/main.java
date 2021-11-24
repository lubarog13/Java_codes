package rpm_java;
import java.io.File;
import java.io.IOException;
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
        Book book1 =new Book(1, "Сказка о царе Салтане", "Пушкин", 1820);
        Book book2 = new Book(2, "Евгений Онегин", "Пушкин", 1821);
        Book book3 = new Book(3, "Мцыри", "Лермонтов", 1830);
        /*Map<String, Integer> map = new HashMap<>();
        map.put("Сказка о царе Салтане", 1);
        map.put("Евгений Онегин", 5);*/
        /*Library library =new Library(1, "ул. Устинова, 12", new ArrayList<Book>(Arrays.asList(book1, book2, book3)));

        File file = new File("library.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Library library2 = new Library();
        try{
        FileUtils.write(file, library);
        library2 = FileUtils.read(file);}
        catch (IOException e){
            System.out.println(e);
        }
        System.out.println(library2);*/
        Random random = new Random();
        Integer arr[] = new Integer[10000];
        for ( int i=0;i<10000;i++ ){
            arr[i]= random.nextInt();
        }
        BubbleSortinger<Integer> bubbleSortinger = new BubbleSortinger<>();
        System.out.println(bubbleSortinger.sortWithTime(arr));
        for ( int i=0;i<10000;i++ ){
            arr[i]= random.nextInt();
        }
        InsertionSort<Integer> insertionSort = new InsertionSort<>();
        System.out.println(insertionSort.sortWithTime(arr));
        for ( int i=0;i<10000;i++ ){
            arr[i]= random.nextInt();
        }
        SelectionSorrtinger<Integer> selectionSorrtinger = new SelectionSorrtinger<>();
        System.out.println(selectionSorrtinger.sortWithTime(arr));
    }
}
