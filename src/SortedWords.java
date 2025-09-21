public class SortedWords {
    public static void main(String[] args) {

        String text = "To be or not to be, that is the question;"
                + "Whether `tis nobler in the mind to suffer"
                + " the slings and arrows of outrageous fortune,"
                + " or to take arms against a sea of troubles,"
                + " and by opposing end them?";

        //Split the text by non-letters
        String[] words = text.split("[^a-zA-Z]+");

        //Bubble sort algorithm
        int i, j, n;
        boolean swapped;
        String temp;
        n = words.length;
        for(i = 0; i < n - 1; i++){
            swapped = false;
            for(j = 0; j < n - i - 1; j++){
                if(words[j].compareTo(words[j + 1]) > 0){
                    temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }


        //Print the words
        for(String word: words){
            System.out.println(word);
        }


    }
}
