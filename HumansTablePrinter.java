public class HumansTablePrinter {

    //класс, отвечающий за вывод информации в удобном виде
    void printTable(Human humans[]) {
        System.out.printf("|%15s|%15s|%3s|\n", "Firstname", "Lastname", "Age");
        System.out.println("-------------------------------------");
        for (int i = 0; i < humans.length; i++) {
            System.out.printf("|%15s|%15s|%3d|\n", humans[i].firstName, humans[i].lastName, humans[i].getAge());
        }
    }



    void printTable(int ages[]) {
            System.out.printf("|%10s|%22s|\n", "Возраст", "Сколько раз встретился");
            System.out.println("-------------------------");
            for (int i = 0; i < ages.length; i++) {
                if (ages[i] != 0) {
                    System.out.printf("|%10d|%22d|\n", i, ages[i]);
                }
            }
        }
    }





