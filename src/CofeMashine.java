import java.util.Scanner;

public class CofeMashine implements Maker{
    private int milk = 150;
    private int cofe = 60;
    private int water = 150;
    private int sugar = 10;


    @Override
    public void makeAmericano() {
        System.out.println("Введите кол-во сахара");
        int countSugar = new Scanner(System.in).nextInt();
        if(this.cofe >= 60 && this.water >= 150 && this.sugar >= countSugar) {
            System.out.println("Вы выбрали Американо.");
            this.cofe -= 60;
            this.water -= 150;
            this.sugar -= countSugar;
            System.out.println("Ваш Американо готов !!!");
        }else{
            System.out.println("Не хватает ингридиентов !!!");
            printIngridient();
            setIngridient();
        }
    }

    @Override
    public void makeEspresso() {
        System.out.println("Введите кол-во сахара");
        int countSugar = new Scanner(System.in).nextInt();
        if(this.cofe >= 30 && this.water >= 60 && this.sugar >= countSugar) {
            System.out.println("Вы выбрали Эспрессо.");
            this.cofe -= 30;
            this.water -= 60;
            this.sugar -= countSugar;
            System.out.println("Ваш Эспрессо готов !!!");
        }else{
            System.out.println("Не хватает ингридиентов !!!");
            printIngridient();
            setIngridient();
        }
    }

    @Override
    public void makeCappuccino() {
        System.out.println("Введите кол-во сахара");
        int countSugar = new Scanner(System.in).nextInt();
        if(this.cofe >= 30 && this.milk >= 60 && this.sugar >= countSugar) {
            System.out.println("Вы выбрали Капучино.");
            this.cofe -= 30;
            this.milk -= 150;
            this.sugar -= countSugar;
            System.out.println("Ваш Капучино готов !!!");
        }else{
            System.out.println("Не хватает ингридиентов !!!");
            printIngridient();
            setIngridient();
        }
    }

    @Override
    public void makeLatte() {
        System.out.println("Введите кол-во сахара");
        int countSugar = new Scanner(System.in).nextInt();
        if(this.cofe >= 30 && this.milk >= 60 && this.sugar >= countSugar) {
            System.out.println("Вы выбрали Латте.");
            this.cofe -= 30;
            this.milk -= 150;
            this.sugar -= countSugar;
            System.out.println("Ваш Латте готов !!!");
        }else{
            System.out.println("Не хватает ингридиентов !!!");
            printIngridient();
            setIngridient();
        }
    }

    public void printIngridient(){
        System.out.println("\t *** Остатоток ингридиентов ***\nкофе - " + this.cofe + "гр.  " +
                "вода - " + this.water + "мл.  молоко - " + this.milk + "мл.  сахар - " + this.sugar + "гр.");
    }

    public void setIngridient(){
        System.out.println("Сколько добавить молока в мл.");
        this.milk += new Scanner(System.in).nextInt();
        System.out.println("Сколько добавить кофе в гр.");
        this.cofe += new Scanner(System.in).nextInt();
        System.out.println("Сколько добавить воды в мл.");
        this.water += new Scanner(System.in).nextInt();
        System.out.println("Сколько добавить сахара в гр.");
        this.sugar += new Scanner(System.in).nextInt();
    }
}
