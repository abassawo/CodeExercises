package nyc.c4q.abassawo;

/**
 * Created by c4q-Abass on 7/31/15.
 */
public class LuckySeven {
    private static boolean luckySeven;


    public static void main(String[] args) {
        int[] set = {7, 0, 0};
        System.out.println("length of set " + set.length);
        System.out.println("Lucky Seven " + getLuckySeven(set));
    }

    public static boolean getLuckySeven(int[] intArray) throws ArrayIndexOutOfBoundsException{
        int currentNumber;


        for (int i = 0; i < intArray.length - 1; i++) {
            currentNumber = intArray[i];
            boolean iInMiddle = currentNumber != intArray[0] && currentNumber != intArray[intArray.length - 1];
            if(intArray.length >= 3) {                                                //beginning
                if (currentNumber == intArray[0]) {
                    luckySeven = (currentNumber + intArray[i + 1] + intArray[i + 2] == 7);
                    break;
                } else if (i == intArray[intArray.length - 1]){                           //end
                    luckySeven = (currentNumber + intArray[i - 1] + intArray[i - 2] == 7);
                    break;

                }
                else if (iInMiddle){
                    luckySeven = currentNumber + intArray[i - 1] + intArray[i + 1] == 7; //betwween
                    break;
                }
            } else {
                luckySeven = false;
            }

        }
        return luckySeven;
    }
}
