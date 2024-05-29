import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ControlPanel controlPanel = new ControlPanel();
        CofeMashine cofeMashine = new CofeMashine();
        while (true){
            System.out.println("\n\t\t\t*** Добро пожаловать ***");
            System.out.println("Американо: 1\nЭспрессо: 2\nКапучино:" +
                    " 3\nЛатте: 4\nОстаток ингридиентов: 5\nДобавить ингридиентов: 6\n\n\t\t*** Выберите напиток ***");
            int command = new Scanner(System.in).nextInt();
            if(command == 1){
                controlPanel.americano(cofeMashine);
            }else if(command == 2){
                controlPanel.espresso(cofeMashine);
            }else if(command == 3){
                controlPanel.cappuchino(cofeMashine);
            }else if(command == 4){
                controlPanel.latte(cofeMashine);
            }else if(command == 5){
                cofeMashine.printIngridient();
            }else if(command == 6){
                cofeMashine.setIngridient();
            }else{
                System.out.println("Не верный ввод !!!\nВыберите команду от 1 до 5");
            }
        }
    }
}