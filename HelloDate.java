import java.util.Random;

class HelloDate {
    public static void main(String[] args) {
        int result = 0;

        Random random = new Random(26);
        int i = random.nextInt(47);

        for (int k = 0; k < 26; ++k) {
            while (true) {
            result++;
            i++;


                if (i < result) {
                    System.out.println( i + "<" + result);
                } else if (i > result) {
                    System.out.println( i + ">" + result);
                } else
                    System.out.println( i + "=" + result);

            }


        }
    }
}