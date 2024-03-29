import java.util.Random;

//класс ,отвечающих за создание случайных людей
public class HumansGenerator {


//поле-массив имен разделенных пробелом
    String names [] =   {
            "Владислав Зверев",
            "Дарья Прохорова",
            "Никита Баранов",
            "Виктория Дубровина",
            "Анастасия Платонова",
            "Богдан Покровский",
            "Ева Кузнецова",
            "Полина Воронина",
            "Георгий Рогов",
            "Артур Ковалев",
            "Артём Гаврилов",
            "Данил Сорокин",
            "Дарина Федорова",
            "Никита Новиков",
            "Захар Юдин",
            "Варвара Русанова",
            "Амина Кузнецова",
            "Александра Михайлова",
            "Дмитрий Левин",
            "Альфия Романова",
            "Виктория Кудрявцева",
            "Александра Свиридова",
            "Дарья Герасимова",
            "Даниил Смирнов",
            "Василиса Курочкина",
            "Макар Федосеев",
            "Оливия Волкова",
            "Константин Иванов",
            "Амина Горелова",
            "Артём Осипов",
            "Михаил Верещагин",
            "Матвей Карпов",
            "Варвара Грачева",
            "Алина Громова",
            "Семён Агеев",
            "Алиса Иванова",
            "Александр Новиков",
            "Фёдор Воронцов",
            "Виктория Иванова",
            "Арсений Токарев",
            "Михаил Андреев",
            "Даниил Стариков",
            "Ирина Савельева",
            "Алиса Семенова",
            "Андрей Яковлев",
            "Фёдор Агеев",
            "Анисия Архипова",
            "Борис Балашов",
            "Семён Медведев",
            "Тигран Корчагин",
            "Ника Мельникова",
            "Иван Фирсов",
            "Дамир Поляков",
            "Марина Фомина",
            "Тимофей Панов",
            "Алиса Филатова",
            "Дмитрий Вавилов",
            "Пётр Спиридонов",
            "Василиса Игнатьева",
            "Олеся Свешникова",
            "Милана Евдокимова",
            "Злата Назарова",
            "Елена Макарова",
            "Ульяна Самсонова",
            "Дмитрий Самсонов",
            "Софья Королева",
            "Марта Крылова",
            "Елизавета Родионова",
            "Виктория Афанасьева",
            "Ульяна Иванова",
            "Амира Сидорова",
            "Никита Николаев",
            "Руслан Антонов",
            "Валерия Воробьева",
            "Анна Иванова",
            "Ксения Морозова",
            "Мирон Леонов",
            "Денис Коротков",
            "Иван Игнатьев",
            "Кирилл Сорокин",
            "Виктория Цветкова",
            "Анастасия Васильева",
            "Мария Федорова",
            "Кира Власова",
            "Тимофей Лопатин",
            "Денис Соболев",
            "Дарья Петрова",
            "Глеб Кузнецов",
            "Вера Шестакова",
            "Ульяна Федосеева",
            "София Павлова",
            "Павел Исаев",
            "Полина Михайлова",
            "Елизавета Елисеева",
            "Ника Лебедева",
            "Александр Кузнецов",
            "Александр Фролов",
            "Софья Любимова",
            "Степан Черкасов",
            "Полина Федотова"
    };
    // поля которые будут содержать отдельно имена и фамилии
    String firstNames[];
    String lastNames[];

    // конструктор - вызывается при создании обьекта humangenerator
    HumansGenerator(){
        //выделяем память под массив имен и фамилий
        this.firstNames = new String[names.length];
        this.lastNames = new String[names.length];

        //заполняем память под массивы имен и фамилий
        for( int i = 0; i < names.length; i++){
            // разделяем имена и фамилии по пробелу на два элемента и кладем 0 в имя первый в фамилию
            firstNames[i] = names[i].split(" ")[0];
            lastNames[i] = names[i].split(" ")[1];
        }
    }
    // метод отвечающий за генерацию случайных людей в кол-ве count
    Human[] generate(int count){


        // обьявляем генератор случайных чисел
        Random random = new Random();
        //создаем массив людей , требуемого размера
        Human humans[] = new Human[count];
        //заполняем массив людей
        for( int i = 0; i < humans.length; i++){
            // создаем человека
            Human newHuman = new Human();
            //даем ему случайное имя
            newHuman.firstName = firstNames[random.nextInt(firstNames.length)];
            // даем ему случайную фамилию
            newHuman.lastName = lastNames[random.nextInt(lastNames.length)];
            //newHuman.age = random.nextInt(100);
            newHuman.setAge(random.nextInt(100));
            // положили человека массив
            humans[i] = newHuman;
        }
        // вернули список людей
        return humans;
    }
}
