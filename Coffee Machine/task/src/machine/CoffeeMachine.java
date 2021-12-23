package machine;

import java.util.Scanner;

public class CoffeeMachine {
    static Scanner scanner = new Scanner(System.in);
    static int amountWater = 400;
    static int amountMilk = 540;
    static int amountBeans = 120;
    static int disposableCups = 9;
    static int amountMoney = 550;

    public static void coffeeMachineDisplay() {
        System.out.println();
        System.out.println("The coffee machine has:");
        System.out.printf("%d ml of water\n", amountWater);
        System.out.printf("%d ml of milk\n", amountMilk);
        System.out.printf("%d g of coffee beans\n", amountBeans);
        System.out.printf("%d disposable cups\n", disposableCups);
        System.out.printf("$%d of money\n", amountMoney);
        System.out.println();
    }

    public static void buy() {
        System.out.println();
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String coffeeType = scanner.next();

        switch (coffeeType) {
            case "back":
                break;

            case "1":
                if (amountWater >= 250 && amountBeans >= 16 && disposableCups >= 1) {
                    System.out.println("I have enough resources, making you a coffee!\n");
                    amountWater -= 250;
                    amountBeans -= 16;
                    disposableCups -= 1;
                    amountMoney += 4;

                } else if (amountWater < 250) {
                    System.out.println("Sorry, not enough water!\n");

                } else if (amountBeans < 16) {
                    System.out.println("Sorry, not enough beans!\n");

                } else {
                    System.out.println("Sorry, not enough Disposable Cups!\n");
                }
                break;

            case "2":
                if (amountWater >= 350 && amountMilk >= 75 && amountBeans >= 20 && disposableCups >= 1) {
                    System.out.println("I have enough resources, making you a coffee!\n");
                    amountWater -= 350;
                    amountMilk -= 75;
                    amountBeans -= 20;
                    disposableCups -= 1;
                    amountMoney += 7;

                } else if (amountWater < 350) {
                    System.out.println("Sorry, not enough water!\n");

                } else if (amountMilk < 75) {
                    System.out.println("Sorry, not enough milk!\n");

                } else if (amountBeans < 20) {
                    System.out.println("Sorry, not enough beans\n");

                } else {
                    System.out.println("Sorry, not enough Disposable Cups!\n");
                }
                break;

            case "3":
                if (amountWater >= 200 && amountMilk >= 100 && amountBeans >= 12 && disposableCups >= 1) {
                    System.out.println("I have enough resources, making you a coffee!\n");
                    amountWater -= 200;
                    amountMilk -= 100;
                    amountBeans -= 12;
                    disposableCups -= 1;
                    amountMoney += 6;

                } else if (amountWater < 200) {
                    System.out.println("Sorry, not enough water!\n");

                } else if (amountMilk < 100) {
                    System.out.println("Sorry, not enough milk!\n");

                } else if (amountBeans < 12) {
                    System.out.println("Sorry, not enough beans!\n");

                } else {
                    System.out.println("Sorry, not enough Disposable Cups!\n");
                }
                break;

            default:
                System.out.println("Option is not valid\n");
                break;
        }

    }

    public static void fill() {
        System.out.println();
        System.out.println("Write how many ml of water you want to add:");
        amountWater += scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        amountMilk += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        amountBeans += scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add:");
        disposableCups += scanner.nextInt();
        System.out.println();
    }

    public static void take() {
        System.out.println();
        System.out.printf("I gave you $%d\n", amountMoney);
        amountMoney = 0;
        System.out.println();
    }


    public static void main(String[] args) {
        boolean showMenu = true;

        while (showMenu) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.next().toLowerCase();

            switch (action) {
                case "buy":
                    buy();
                    break;
                case "fill":
                    fill();
                    break;
                case "take":
                   take();
                    break;
                case "remaining":
                    coffeeMachineDisplay();
                    break;
                case "exit":
                    showMenu = false;
                    break;
                default:
                    System.out.println("Option is not valid\n");
                    break;
            }

        }

    }

}

/*import java.util.Scanner;
enum CoffeeState {
    ACTION,
    BUY,
    FILL,
    TAKE,
    REMAINING,
    EXIT,
    ESPRESS0,
    LATTE,
    CAPPUCCINO,
    ADD_WATER,
    ADD_MILK,
    ADD_BEANS,
    ADD_CUP
}
public class CoffeeMachine {
    static int waterAmount = 400;
    static int milkAmount = 540;
    static int beansAmount = 120;
    static int cupsAmount = 9;
    static int currentPrice = 550;
    static CoffeeState coffeeState;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        while (coffeeState != CoffeeState.EXIT) {
            runMachine(sc.nextLine());
        }
    }

    public static void runMachine (String state) {
        switch (state) {
            case "buy":
                coffeeState = CoffeeState.BUY;
                break;
            case "fill":
                coffeeState = CoffeeState.FILL;
                break;
            case "take":
                coffeeState = CoffeeState.TAKE;
                break;
            case "remaining":
                coffeeState = CoffeeState.REMAINING;
                break;
            case "exit":
                coffeeState = CoffeeState.EXIT;
                break;
            case "1":
                coffeeState = CoffeeState.ESPRESS0;
                break;
            case "2":
                coffeeState = CoffeeState.LATTE;
                break;
            case "3":
                coffeeState = CoffeeState.CAPPUCCINO;
                break;
            case "back":
                coffeeState = CoffeeState.ACTION;
                break;

        }
        switch (coffeeState) {
            case BUY:
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                break;
            case FILL:
                coffeeState = CoffeeState.ADD_WATER;
                break;
            case ADD_WATER:
                System.out.println("Write how many ml of water do you want to add:");
                waterAmount += Integer.parseInt(state);
                coffeeState = CoffeeState.ADD_MILK;
                break;
            case ADD_MILK:
                System.out.println("Write how many ml of milk do you want to add:");
                milkAmount += Integer.parseInt(state);
                coffeeState = CoffeeState.ADD_BEANS;
                break;
            case ADD_BEANS:
                System.out.println("Write how many grams of coffee beans do you want to add:");
                beansAmount += Integer.parseInt(state);
                coffeeState = CoffeeState.ADD_CUP;
                break;
            case ADD_CUP:
                System.out.println("Write how many disposable cups of coffee do you want to add:");
                cupsAmount += Integer.parseInt(state);
                coffeeState = CoffeeState.ACTION;
                break;
            case TAKE:
                System.out.println("I gave you $" + currentPrice);
                currentPrice -= currentPrice;
                coffeeState = CoffeeState.ACTION;
                break;
            case REMAINING:
                System.out.println("The coffee machine has:");
                System.out.println(waterAmount + " of water");
                System.out.println(milkAmount + " of milk");
                System.out.println(beansAmount + " of coffee beans");
                System.out.println(cupsAmount + " of disposable cups");
                System.out.println(currentPrice + " of money");
                coffeeState = CoffeeState.ACTION;
                break;
            case EXIT:
                break;
            case ESPRESS0:
                if (waterAmount - 250 < 0) {
                    System.out.println("Sorry, not enough water!");
                } else if (beansAmount - 16 < 0) {
                    System.out.println("Sorry, not enough beans!");
                } else if (cupsAmount - 1 < 0) {
                    System.out.println("Sorry, not enough cups!");
                } else if (milkAmount - 0 < 0){
                    System.out.println("Sorry, not enough milk!");
                } else {
                    waterAmount -= 250;
                    beansAmount -= 16;
                    cupsAmount -= 1;
                    milkAmount -= 0;
                    currentPrice += 4;
                    System.out.println("I have enough resources, making you a coffee!");
                }
                coffeeState = CoffeeState.ACTION;
                break;
            case LATTE:
                if (waterAmount - 350 < 0) {
                    System.out.println("Sorry, not enough water!");
                } else if (beansAmount - 20 < 0) {
                    System.out.println("Sorry, not enough beans!");
                } else if (cupsAmount - 1 < 0) {
                    System.out.println("Sorry, not enough cups!");
                } else if (milkAmount - 75 < 0){
                    System.out.println("Sorry, not enough milk!");
                } else {
                    waterAmount -= 350;
                    beansAmount -= 20;
                    cupsAmount -= 1;
                    milkAmount -= 75;
                    currentPrice += 7;
                    System.out.println("I have enough resources, making you a coffee!");
                }
                coffeeState = CoffeeState.ACTION;
                break;
            case CAPPUCCINO:
                if (waterAmount - 200 < 0) {
                    System.out.println("Sorry, not enough water!");
                } else if (beansAmount - 12 < 0) {
                    System.out.println("Sorry, not enough beans!");
                } else if (cupsAmount - 1 < 0) {
                    System.out.println("Sorry, not enough cups!");
                } else if (milkAmount - 100 < 0){
                    System.out.println("Sorry, not enough milk!");
                } else {
                    waterAmount -= 200;
                    beansAmount -= 12;
                    cupsAmount -= 1;
                    milkAmount -= 100;
                    currentPrice += 6;
                    System.out.println("I have enough resources, making you a coffee!");
                }
                coffeeState = CoffeeState.ACTION;
                break;
        }
        if (coffeeState == CoffeeState.ACTION) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
        }
    }
}*/

