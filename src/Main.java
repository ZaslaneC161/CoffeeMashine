import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ControlPanel controlPanel = new ControlPanel();
        CofeMashine cofeMashine = new CofeMashine();
        while(true){
            System.out.println("\n\t\t\t*** Добро пожаловать ***");
            System.out.println("Американо: 1\nЭспрессо: 2\nКапучино:" +
                    " 3\nЛатте: 4\nОстаток ингридиентов: 5\nДобавить ингридиентов:" +
                    " 6\n\n\t\t*** Выберите напиток ***");
            int command = new Scanner(System.in).nextInt();
            switch (command){
                case 1 -> controlPanel.americano(cofeMashine);
                case 2 -> controlPanel.espresso(cofeMashine);
                case 3 -> controlPanel.cappuchino(cofeMashine);
                case 4 -> controlPanel.latte(cofeMashine);
                case 5 -> cofeMashine.printIngridient();
                case 6 -> cofeMashine.setIngridient();
                default -> System.out.println("Не верный ввод !!!\nВыберите команду от 1 до 6");
            }

        }
    }
}