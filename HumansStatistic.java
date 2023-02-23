public class HumansStatistic {

    // класс отвечающий за формирование статистики
    int[] getAgesStatistic(Human humans[]){
        int ages[] = new int[100];

        // алгоритм подстчета
        for(int i = 0; i < humans.length; i++){
            Human currentHuman = humans[i];
            //currentHuman = 81
            int currentHumanAge =  humans[i].getAge();
            //ages[81]++
            ages[currentHumanAge]++;
            //ages[humans[i].age]++; - сокращенная запись двух прошлых строк
        }
        return ages;
    }
}
