package by.jonline.module3.like_arrays;

// Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

public class Task1 {
    private static String [] toSnakeCase (String [] camelCase) {
        String [] snakeCase = new String[camelCase.length]; //создаем массив стрингов с длиной исходного массива
        for (int i = 0; i < snakeCase.length; i++) { //проходим по элементам массива стрингов
            StringBuilder str = new StringBuilder(); //создаем обьект стрингбилдера
            for (int j = 0; j < camelCase[i].length(); j++) { //запускаем счетчик по кол-ву букв элемента массива стринга
                char symbol = camelCase[i].toCharArray()[j]; //содаем переменную чар и присваеваем ей значений буквы из 1 строки массива
                if (Character.isLowerCase(symbol)) { //если буква нижнего регистра, то
                    str.append(symbol); //добавляем её к обьекту стрингбилдера
                } else { //иначе
                    str.append("_"); //добавляем _
                    str.append(Character.toLowerCase(symbol)); //добавляем символ, переведенный в нижний регистр
                }
            }
            snakeCase[i] = str.toString(); //изменяем конкретный элемент на элемент стрингбилдера
        }
        return snakeCase; //возвращаем измененный массив стрингов
    }

    public static void main(String[] args) {
        String [] camelCase = {"getChars", "equalsIgnoreCase", "toLowerCase",
                "toUpperCase", "toCharArray", "charAt"};
        String [] snakeCase = toSnakeCase(camelCase);

        System.out.println(String.join(", ", camelCase));
        System.out.println(String.join(", ", snakeCase));
    }
}
