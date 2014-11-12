package hello;

public class Mood {
    public enum MoodDetecter {
        AGGRESSIVE("RED"), DEPRESSED("BLACK"), IGNORANT("GRAY"), UNKNOWN("");
        private String value;

        private MoodDetecter(String colour) {
            this.value = colour;
        }
    }

    private String mood;

    public Mood(String colour){
        for (MoodDetecter detecter : MoodDetecter.values()) {
            if (detecter.value.equals(colour)) {
                mood = detecter.toString();
            }
        }
        mood = mood != null ? mood : MoodDetecter.UNKNOWN.toString();
    }

    public String getMood() {
        return mood;
    }
}
