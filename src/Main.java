import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ControlPanel controlPanel = new ControlPanel();
        CoffeMashine coffeMashine = new CoffeMashine();
        while(true){
            System.out.println("\n\t\t\t*** Добро пожаловать ***");
            System.out.println("Американо: 1\nЭспрессо: 2\nКапучино:" +
                    " 3\nЛатте: 4\nОстаток ингридиентов: 5\nДобавить ингридиентов:" +
                    " 6\n\n\t\t*** Выберите напиток ***");
            int command = new Scanner(System.in).nextInt();
            switch (command){
                case 1 -> controlPanel.americano(coffeMashine);
                case 2 -> controlPanel.espresso(coffeMashine);
                case 3 -> controlPanel.cappuchino(coffeMashine);
                case 4 -> controlPanel.latte(coffeMashine);
                case 5 -> coffeMashine.printIngridient();
                case 6 -> coffeMashine.setIngridient();
                default -> System.out.println("Неверный ввод !!!\nВыберите команду от 1 до 6");
            }

        }
    }
}