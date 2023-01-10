public class NinetyNineBottlesOfBeer {

    public static void main(String[] args) {
        int beerAmount = 99;

        while (beerAmount >= 0) {
            switch (beerAmount) {
                case 0: // No bottles of beer left
                    System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
                    System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
                    System.out.println("99 bottles of beer on the wall, 99 bottles of beer...");
                    break;

                case 1: // 1 bottle of beer left
                    System.out.println("1 bottle of beer on the wall, 1 bottle of beer.");
                    System.out.println("And if this bottle happened to fall, there would be no more bottles of beer on the wall.\n");
                    break;

                case 2: // Changes the word "bottles" to "bottle" in the second "System.out.println",
                        // as there is only 1 bottle of beer left on the wall
                    System.out.println("2 bottles of beer on the wall, 2 bottles of beer.");
                    System.out.println("And if one of those bottles happened to fall, there would be 1 bottle of beer on the wall.\n");
                    break;

                default:
                    System.out.println(beerAmount + " bottles of beer on the wall, " + beerAmount + " bottles of beer.");
                    System.out.printf("And if one of those bottles happened to fall, there would be %d bottles of beer on the wall.\n%n", beerAmount - 1);
                    break;
            }

            // Decrease the number of beer bottles
            beerAmount--;
        }
    }

}