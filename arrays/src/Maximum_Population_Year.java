public class Maximum_Population_Year {
    public static void main(String[] args) {
        int[][] logs = {
                {1992,1999},
                {2000,2010}
        };

        int result = maximumPopulation2(logs);
        System.out.println(result);
    }

        static int maximumPopulation(int[][] logs) {
        int[] year = new int[2051];

            for (int[] log: logs) {
                year[log[0]]++;
                year[log[1]]--;
            }

            int maxNum = year[1950];
            int maxYear = 1950;

            for (int i = 1951; i < year.length ; i++) {
                year[i] += year[i-1];
                if (year[i] > maxNum) {
                    maxNum = year[i];
                    maxYear = i;
                }
            }
            return maxYear;


        }

        static int maximumPopulation2(int[][] logs) {
        int[] year = new int[101];

            for (int[] log: logs) {
                year[log[0] - 1950]++;
                year[log[1] - 1950]--;

            }

            int maxNum = year[0],maxYear = 1950;

            for (int i =1; i < year.length ; i++) {
                year[i] += year[i-1];
                if (year[i] > maxNum) {
                    maxNum = year[i];
                    maxYear = i + 1950;
                }
            }
            return maxYear;
        }

}
