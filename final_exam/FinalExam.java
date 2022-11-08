public class FinalExam {
    public static void main(String[] args) throws Exception {

        // Print the words in their given pattern.

        char[][] array = {
                // 0    1    2    3    4    5    6    7    8    9   10   11   12   13   14
         /*0 */ { 'X', 'X', 'R', 'T', 'E', 'S', 'C', 'E', 'B', 'F', 'I', 'O', 'O', 'S', 'U' },
         /*1 */ { 'L', 'I', 'J', 'G', 'I', 'A', 'Z', 'F', 'R', 'T', 'F', 'H', 'F', 'W', 'W' },
         /*2 */ { 'L', 'L', 'N', 'F', 'U', 'H', 'M', 'I', 'O', 'E', 'N', 'R', 'H', 'D', 'E' },
         /*3 */ { 'U', 'W', 'O', 'S', 'Q', 'B', 'D', 'W', 'S', 'P', 'Q', 'Y', 'R', 'D', 'P' },
         /*4 */ { 'Z', 'U', 'R', 'Q', 'T', 'A', 'V', 'K', 'N', 'Y', 'F', 'L', 'C', 'O', 'S' },
         /*5 */ { 'A', 'J', 'B', 'C', 'Y', 'A', 'H', 'V', 'O', 'H', 'R', 'P', 'T', 'S', 'T' },
         /*6 */ { 'P', 'L', 'L', 'Z', 'P', 'J', 'G', 'B', 'F', 'Q', 'F', 'L', 'V', 'P', 'A' },
         /*7 */ { 'F', 'I', 'I', 'A', 'P', 'U', 'J', 'R', 'L', 'V', 'L', 'L', 'P', 'H', 'R' },
         /*8 */ { 'V', 'T', 'Z', 'N', 'I', 'K', 'U', 'C', 'A', 'I', 'B', 'Q', 'Q', 'Q', 'B' },
         /*9 */ { 'U', 'U', 'Q', 'Z', 'A', 'J', 'M', 'J', 'H', 'M', 'U', 'J', 'M', 'J', 'U' },
         /*10*/ { 'N', 'E', 'L', 'H', 'A', 'M', 'W', 'C', 'F', 'C', 'W', 'U', 'W', 'Z', 'C' },
         /*11*/ { 'G', 'S', 'N', 'P', 'D', 'I', 'M', 'Q', 'X', 'J', 'D', 'A', 'P', 'Z', 'K' },
         /*12*/ { 'C', 'D', 'S', 'K', 'C', 'U', 'Y', 'C', 'O', 'L', 'A', 'P', 'M', 'A', 'S' },
         /*13*/ { 'M', 'A', 'P', 'U', 'L', 'U', 'T', 'A', 'N', 'H', 'X', 'H', 'S', 'W', 'Z' },
         /*14*/ { 'Z', 'Y', 'N', 'E', 'D', 'I', 'N', 'J', 'P', 'U', 'Z', 'G', 'K', 'Q', 'K' },
        };

        // =============================================================
        // ALFONSO - (10 points)
        System.out.println(" ");
        System.out.println("1. ALFONSO ");
        for (int column = 0; column < 15; column++){
               
            System.out.println("");
           
            for (int row = 0; row < 15; row ++){
                if (row == 2 && (column == 8 || column == 8))  {
                    System.out.println("" + array[row][column] );
                } 
                else if (row == 3 && (column == 8 || column == 8))  {
                    System.out.println( "  " + array[row][column] );
                }
                else if (row == 4 && (column == 8 || column == 8))  {
                    System.out.println("  " + array[row][column] );
                }
                else if (row == 5 && (column == 8 || column == 8))  {
                    System.out.println("  " + array[row][column] );
                }
                else if (row == 6 && (column == 8 || column == 8))  {
                    System.out.println("  " + array[row][column] );
                }
                else if (row == 7 && (column == 8 || column == 8))  {
                    System.out.println("  " + array[row][column] );
                }
                else if (row == 8 && (column == 8 || column == 8))  {
                    System.out.println("  " + array[row][column] );
                }
                else {
                    System.out.print(" ");
                }
            }
        }
       

        // =============================================================
        // INSTAGRAM - (10 points)
        System.out.println(" ");
        System.out.println("2. INSTAGRAM ");
        for (int column = 0; column < 15; column++){
               
            System.out.println("");
           
            for (int row = 0; row < 15; row ++){
                if (row == 1 && (column == 1 || column == 1))  {
                    System.out.println(array[row][column] );
                } 
                else if (row == 2 && (column == 2 || column == 2))  {
                    System.out.println(array[row][column] );
                }
                else if (row == 3 && (column == 3 || column == 3))  {
                    System.out.println(array[row][column] );
                }
                else if (row == 4 && (column == 4 || column == 4))  {
                    System.out.println(array[row][column] );
                }
                else if (row == 5 && (column == 5 || column == 5))  {
                    System.out.println(array[row][column] );
                }
                else if (row == 6 && (column == 6 || column == 6))  {
                    System.out.println(array[row][column] );
                }
                else if (row == 7 && (column == 7 || column == 7))  {
                    System.out.println(array[row][column] );
                }
                else if (row == 8&& (column == 8 || column == 8))  {
                    System.out.println(array[row][column] );
                }
                else if (row == 9 && (column == 9 || column == 9))  {
                    System.out.println(array[row][column] );
                }

                else {
                    System.out.print(" ");
                }
            }
        }

        // =============================================================
        // PULUTAN - (10 points)
        System.out.println(" ");
        System.out.println("3. PULUTAN ");
        for (int column = 0; column < 15; column++){
               
            System.out.println("");
           
            for (int row = 0; row < 15; row ++){
                if (row == 1 && (column == 1 || column == 1))  {
                    System.out.println(array[row][column] );
                } 
                else if (row == 13 && (column == 2 || column == 2))  {
                    System.out.println(array[row][column] );
                }
                else if (row == 13 && (column == 3 || column == 3))  {
                    System.out.println(array[row][column] );
                }
                else if (row == 13 && (column == 4 || column == 4))  {
                    System.out.println(array[row][column] );
                }
                else if (row == 13 && (column == 5 || column == 5))  {
                    System.out.println(array[row][column] );
                }
                else if (row == 13 && (column == 6 || column == 6))  {
                    System.out.println(array[row][column] );
                }
                else if (row == 13 && (column == 7 || column == 7))  {
                    System.out.println(array[row][column] );
                }
                else if (row ==  13 && (column == 8 || column == 8))  {
                    System.out.println(array[row][column] );
                }
                    }
                        }
        // =============================================================
        // TUESDAY - (10 points)
        System.out.println(" ");
        System.out.println("4. TUESDAY ");
        for (int column = 0; column < 15; column++){
               
            System.out.println("");
           
            for (int row = 0; row < 15; row ++){
               
                if (row == 8 && (column == 1 || column == 1))  {
                    System.out.println(array[row][column] );
                }
                else if (row == 9 && (column == 1 || column == 1))  {
                    System.out.println(array[row][column] );
                }
                else if (row == 10 && (column == 1 || column == 1))  {
                    System.out.println(array[row][column] );
                }
                else if (row == 11 && (column == 1 || column == 1))  {
                    System.out.println(array[row][column] );
                }
                else if (row == 12 && (column == 1 || column == 1))  {
                    System.out.println(array[row][column] );
                }
                else if (row == 13 && (column == 1 || column == 1))  {
                    System.out.println(array[row][column] );
                }
                else if (row ==  14 && (column == 1 || column == 1))  {
                    System.out.println(array[row][column] );
                }
                    }
                        }

        // =============================================================
        // CHILLTOP - (10 points)
        System.out.println(" ");
        System.out.println("5. CHILLTOP ");
        for (int column = 0; column < 15; column++){
               
            System.out.println("");
           
            for (int row = 0; row < 15; row ++){
                if (row == 3 && (column == 14 || column == 14))  {
                    System.out.print(array[row][column] );
                } 
                else if (row == 4 && (column == 13 || column == 13))  {
                    System.out.println(array[row][column] );
                }
                else if (row == 5 && (column == 12 || column == 12))  {
                    System.out.println(array[row][column] );
                }
                else if (row == 6 && (column == 11 || column == 11))  {
                    System.out.println(array[row][column] );
                }
                else if (row == 7 && (column == 10 || column == 10))  {
                    System.out.println(array[row][column] );
                }
                else if (row == 8 && (column == 9 || column == 9))  {
                    System.out.println(array[row][column] );
                }
                else if (row == 9 && (column ==8|| column == 8))  {
                    System.out.println(array[row][column] );
                }
                else if (row == 10 && (column == 7 || column == 7))  {
                    System.out.println(array[row][column] );
                }
                else {
                    System.out.print(" ");
                }
            }
        }

        // =============================================================
        // MANILA - (10 points)
        System.out.println(" ");
        System.out.println("6. MANILA ");

        // =============================================================
        // SAMPALOC - (10 points)
        System.out.println(" ");
        System.out.println("7. SAMPALOC ");

        // =============================================================
        // FRIDAY - (10 points)
        System.out.println(" ");
        System.out.println("8. FRIDAY ");

        // =============================================================
        // PIZZA - (10 points)
        System.out.println(" ");
        System.out.println("9. PIZZA ");

        // =============================================================
        // STARBUCKS - (10 points)
        System.out.println(" ");
        System.out.println("10. STARBUCKS ");

        // =============================================================

        // BONUS (PRIZE AWAITS!)
        System.out.println(" ");
        System.out.println("11. EVERYBODY HAS A PRICE! ");

        // Let s be a string of lowercase Latin letters. Its price is the sum of the
        // indices of letters (an integer between 1 and 26) that are included in it. For
        // example, the price of the string abca is 1 + 2 + 3 + 1 = 7.

        // The string w and the integer p are given. Remove the minimal number of
        // letters from w so that its price becomes less than or equal to p and print
        // the resulting string. Note that the resulting string may be empty. You can
        // delete arbitrary letters, they do not have to go in a row. If the price of a
        // given string w is less than or equal to p, then nothing needs to be deleted
        // and w must be output.

        // Note that when you delete a letter from w, the order of the remaining letters
        // is preserved. For example, if you delete the letter e from the string test,
        // you get tst.

        // Input:
        // Each case consists of two lines.

        // The first of them is the string w, it is non-empty and consists of lowercase
        // Latin letters.

        // The second line contains an integer p (1 ≤ p ≤ 5200000).

        // Output:
        // Output exactly t rows, the i-th of them should contain the answer to the i-th
        // set of input data. Print the longest string that is obtained from w by
        // deleting letters such that its price is less or equal to p. If there are
        // several answers, then output any of them.

        // Note that the empty string — is one of the possible answers. In this case,
        // just output an empty string.

        // ================================================================================

        // Example 1
        // Input:
        // abca
        // 2

        // Output:
        // aa

        // Example 2
        // Input:
        // abca
        // 6

        // Output:
        // abc
        
        // Example 3
        // Input:
        // elizer
        // 50

        // Output:
        // elier

        }}
    
