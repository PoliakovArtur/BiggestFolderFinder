import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> todoList = new ArrayList<>();
    public final static String TODO_NOT_EXIST = "Дело с таким номером не существует";

    public void add(String todo) {
        todoList.add(todo);
        System.out.println("Добавлено дело " + "\"" + todo + "\"");
    }

    public void add(int index, String todo) {
        if ((index > todoList.size() - 1) || (index < 0)) {
            add(todo);
            return;
        }
        todoList.add(index, todo);
        System.out.println("Добавлено дело " + "\"" + todo + "\"");
    }

    public void edit(String todo, int index) {
        if ((index > todoList.size() - 1) || (index < 0)) {
            System.out.println(TODO_NOT_EXIST);
            return;
        }
        System.out.println("Дело " + "\"" + todoList.get(index) + "\"" + " заменено на "  + "\"" + todo + "\"");
        todoList.remove(index);
        todoList.add(index, todo);
    }

    public void delete(int index) {
        if ((index > todoList.size() - 1) || (index < 0)) {
            System.out.println(TODO_NOT_EXIST);
            return;
        }
        System.out.println("Дело " + "\"" + todoList.get(index) + "\"" + " удалено");
        todoList.remove(index);
    }

    public ArrayList<String> getTodos() {
        for (int i = 0; i < todoList.size(); i++) {
            System.out.println(i + " - " + todoList.get(i));
        }
        return todoList;
    }
}