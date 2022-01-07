import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private final static String ERROR_MESSAGE = "Неверная команда";
    private final static String regex = "[0-9]+";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TodoList todoList = new TodoList();

        while (true) {
            String command = scanner.nextLine();
            String[] split = command.split("\\s");

            if (split.length < 2) {
                System.out.println(ERROR_MESSAGE);
                continue;
            }

            switch (split[0]) {
                case "ADD" -> {
                    if (split[1].matches(regex) && split.length > 2) {
                        int start = command.indexOf(split[2]);
                        int number = Integer.parseInt(split[1]);
                        todoList.add(number, command.substring(start));
                        break;
                    }
                    int start = command.indexOf(split[1]);
                    todoList.add(command.substring(start));
                }

                case "LIST" -> {
                    for (int i = 0; i < todoList.getTodos().size(); i++) {
                        System.out.println(i + " - " + todoList.getTodos().get(i));
                    }
                }

                case "EDIT" -> {
                    if (!split[1].matches(regex) || split.length == 2) {
                        System.out.println(TodoList.TODO_NOT_EXIST);
                        break;
                    }
                    int start = command.indexOf(split[2]);
                    int number = Integer.parseInt(split[1]);
                    todoList.edit(command.substring(start), number);
                }

                case "DELETE" -> todoList.delete(Integer.parseInt(split[1]));

                default -> System.out.println(ERROR_MESSAGE);
            }
        }
    }
}
