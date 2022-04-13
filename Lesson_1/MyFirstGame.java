public class MyFirstGame {
    public static void main(String[] args) {
        int computerNum = (int) (Math.random() * 100);
        int playerNum = 47;
        System.out.println(computerNum);
        while (playerNum != computerNum) {
            if (playerNum < computerNum) {
                System.out.println("Число " + playerNum + " меньше того, что загадал компьютер");
                playerNum++;
            } else if (playerNum > computerNum) {
                System.out.println("Число " + playerNum + " больше того, что загадал компьютер");
                playerNum--;
            }
        System.out.println("Вы победили");
        }
    }
}