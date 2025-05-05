public class Main{
    public static void main (String[] args) {
        WordMatch w = new WordMatch("mississippi"); 
        System.out.println(w.scoreGuess("i"));
        System.out.println(w.scoreGuess("iss"));
        System.out.println(w.scoreGuess("issipp"));
        System.out.println(w.scoreGuess("mississippi"));
        System.out.println();
        WordMatch b = new WordMatch("aaaabb"); 
        System.out.println(b.scoreGuess("a"));
        System.out.println(b.scoreGuess("aa"));
        System.out.println(b.scoreGuess("aaa"));
        System.out.println(b.scoreGuess("aabb"));
        System.out.println(b.scoreGuess("c"));
        System.out.println();
        WordMatch c = new WordMatch("concatenation"); 
        System.out.println(c.scoreGuess("ten"));
        System.out.println(c.scoreGuess("nation"));
        System.out.println(c.findBetterGuess("ten", "nation"));
        System.out.println(c.scoreGuess("con"));
        System.out.println(c.scoreGuess("cat"));
        System.out.println(c.findBetterGuess("con", "cat"));
    }
}
