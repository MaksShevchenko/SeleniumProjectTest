import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> statuses = Arrays.asList(
        200, 404, 201, 500, 200, 403, 204);
        System.out.println(statuses.stream().filter(i -> i >= 200 & i < 300).distinct().sorted().toList());

    }

}

//Проверка Jenkins
//
//Часть 1. Stream API
//1. Фильтрация HTTP-статусов
//        Easy
//List<Integer> statuses = Arrays.asList(
//        200, 404, 201, 500, 200, 403, 204
//);
//Найти все уникальные успешные HTTP-статусы (2xx), отсортировать по возрастанию.
//Ожидаемый результат:
//        [200, 201, 204]




//выбрать 2 компании в которых яко бы мог работать
//выбрать 2 компании IT-вендора - через ИИ, как пример IT-ONE, SELECTY, X5, Бэллнтергатор ------ и  выбрать 2 проекта, на которых мог бы ты работать
//если указываешь БД в резюме, нет опыта, не тестировал через java, тестировал руками до этого.
//kafka - не упоминать, только теоретические знания
//