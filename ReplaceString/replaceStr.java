package ReplaceString;

public class replaceStr {

  public static void main(String[] args) {
    String str1 = "Hi, I am Nishant Rajpoot and I am a programmer.";

    String replacement = str1.replace("programmer", "developer");
    // Use replaceAll if there is more than one word to replace.
    System.out.println(replacement);
  }
}
