package Tasks.Task6;

public final class StoryBuilder {

    private final StringBuilder words;

    private StoryBuilder() {
        this.words = new StringBuilder();
    }

    static StoryBuilder builder() {
        return new StoryBuilder();
    }

    StoryBuilder add(String word) {
        StoryBuilder newBuilder = new StoryBuilder();
        newBuilder.words.append(words);
        newBuilder.words.append(word);
        return newBuilder;
    }

    String build() {
        return words.toString();
    }

}
