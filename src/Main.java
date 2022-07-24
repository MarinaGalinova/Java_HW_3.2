public class Main {

    public static void main(String[] args) { //какая-то обязательная часть, про которую еще ничего не объясняли

        BmiService service = new BmiService(); //завели новую переменную service класса BmiService
        int m = 100; //вводим значение 1 параметра для метода service
        double h = 1.68; //вводим значение 2 параметра для метода service
        double bmi = service.calculate(m, h); //инициализируем переменную bmi, которая возвращает значение метода service от параметров m и h

        System.out.printf("Ваш индекс массы тела составляет " + "%.1f %n", bmi);
    }
}
