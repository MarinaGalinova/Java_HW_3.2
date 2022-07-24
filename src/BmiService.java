public class BmiService {
    public double calculate(int m, double h) { //заводим функцию (метод) calculate типа double от 2-х параметров m (целая) и h (дробная)
        double height = h * h; //промежуточные вычисления
        double bmi = m / height; //инициализируем переменную bmi, которая будет результатом отработки метода
        return bmi;
    }
}
