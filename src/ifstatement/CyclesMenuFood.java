package ifstatement;

import java.io.IOException;

public class CyclesMenuFood {
    public static void main(String[] args) throws IOException {
        while(true) {
            System.out.println(" Меню по блюдам: ");
            System.out.println(" 1.Пицца Маргарита ");
            System.out.println(" 2.Люля-кебаб ");
            System.out.println(" 3.Грибной суп ");
            System.out.println(" 4.Салат Оливье ");
            System.out.println(" 5.Сельдь под Шубой ");
            System.out.println(" 6.Винегрет ");
            System.out.println(" 7.Вишнёвый Морс ");
            System.out.println(" 8.Холодец ");
            System.out.println(" 9.Медовуха ");
            System.out.println(" A.Иван-чай ");
            System.out.print(" Bаш выбор (N - отказ): ");
            char choice = (char)System.in.read();

            char ignore;
            do {
                ignore = (char)System.in.read();
            } while(ignore != '\n');

            if (!(choice < '1' | choice > 'A' & choice != 'N')) {
                if (choice == 'N') {
                    return;
                }

                System.out.println();
                switch (choice) {
                    case '1':
                        System.out.println("Принимаем заказ: Пицца Маргарита");
                        break;
                    case '2':
                        System.out.println("Принимаем заказ: Люля-кебаб");
                        break;
                    case '3':
                        System.out.println("Принимаем заказ: Грибной суп");
                        break;
                    case '4':
                        System.out.println("Принимаем заказ: Салат Оливье");
                        break;
                    case '5':
                        System.out.println("Принимаем заказ: Селдь под Шубой");
                        break;
                    case '6':
                        System.out.println("Принимаем заказ: Винегрет");
                        break;
                    case '7':
                        System.out.println("Принимаем заказ: Вишнёвый Морс");
                        break;
                    case '8':
                        System.out.println("Принимаем заказ: Холодец");
                        break;
                    case '9':
                        System.out.println("Принимаем заказ: Медовуха");
                        break;
                    case 'A':
                        System.out.println("Принимаем заказ: Иван-чай");
                }

                System.out.println();
            }
        }
    }
}
