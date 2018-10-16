package bakingapp.nanodegreeprojects.edu.javalibrary;

import java.util.Random;

public class MyClass {

    private static final String[] jokes = new String[17];
    private static final Random randomize = new Random();

    private static int getJokeIndex() {
        return randomize.nextInt(jokes.length);
    }

    public static String getJoke() {
        return getRandomJoke();
    }

    private static String getRandomJoke() {
        return jokes[getJokeIndex()];
    }

    static {
        jokes[0] = "What do you call a belt with a watch on it? A waist of time.";
        jokes[1] = "What did the Buffalo say to his little boy when he dropped him off at school? Bison.";
        jokes[2] = "Did you hear about the guy who lost the left side of his body? He's alright now.";
        jokes[3] = "I did a theatrical performance on jokes. It was a play on words.";
        jokes[4] = "Towels can’t tell jokes. They have a dry sense of humor.";
        jokes[5] = "A cross eyed teacher couldn’t control his pupils.";
        jokes[6] = "To write with a broken pencil is pointless.";
        jokes[7] = "What should you do if you are cold? Stand in the corner. It’s 90 degrees.";
        jokes[8] = "The energizer bunny went to jail. He was charged with battery.";
        jokes[9] = "What do you call a bear with no teeth? A gummy bear.";
        jokes[10] = "What’s it called when you put a cow in an elevator? Raising the steaks.";
        jokes[11] = "How do trees access the internet? They log on.";
        jokes[12] = "Is your refrigerator running? Better go catch it.";
        jokes[13] = "I saw an ad for burial plots, and thought to myself this is the last thing I need.";
        jokes[14] = "Yesterday a clown held the door for me. It was a nice jester.";
        jokes[15] = "The wedding was so emotional even the cake was in tiers.";
        jokes[16] = "Why can't bicycles stand up on their own? Since they are 2 tired.";
    }
}
