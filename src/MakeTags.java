public class MakeTags {
    public void makeTags(String tag, String word) {
        String tag1 = "<"+tag+">";
        String tag2 = "</"+tag+">";
        System.out.println(tag1 + word + tag2);
    }

}
