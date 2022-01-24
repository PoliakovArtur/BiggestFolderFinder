import java.util.Scanner;

public class Main {
    private static final String ADD_COMMAND = "add Василий Петров " +
            "vasily-petrov@gmail.com +79215637722";
    private static final String COMMAND_EXAMPLES = "\t" + ADD_COMMAND + "\n" +
            "\tlist\n\tcount\n\tremove Василий Петров";
    private static final String COMMAND_ERROR = "Wrong command! Available command examples: \n" +
            COMMAND_EXAMPLES;
    private static final String helpText = "Command examples:\n" + COMMAND_EXAMPLES;
    private static final String REGEX_NAME_AND_SURNAME = CustomerStorage.SYMBOLS + "[\\s]" + CustomerStorage.SYMBOLS;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomerStorage executor = new CustomerStorage();

        while (true) {
            String command = scanner.nextLine().trim();
            String[] tokens = command.split("\\s+", 2);

            try {
                switch (tokens[0]) {
                    case "add" -> executor.addCustomer(tokens[1]);
                    case "list" -> executor.listCustomers();
                    case "remove" -> {
                        if (tokens.length < 2 || !tokens[1].matches(REGEX_NAME_AND_SURNAME)) {
                            throw new IllegalArgumentException(COMMAND_ERROR);
                        }
                        executor.removeCustomer(tokens[1]);
                    }
                    case "count" -> System.out.println("There are " + executor.getCount() + " customers");
                    case "help" -> System.out.println(helpText);
                    default -> System.out.println(COMMAND_ERROR);
                }
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
