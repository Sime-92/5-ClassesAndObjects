class MagicWord {
    private String word;
    private boolean[] guessed;

    public MagicWord(String word) {
        this.word = word;
        this.guessed = new boolean[word.length()];
    }

    public int guess(char character) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == character) {
                guessed[i] = true;
                count++;
            }
        }
        return count;
    }

    public String getResult() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            result.append(guessed[i] ? word.charAt(i) : "_");
        }
        return result.toString();
    }

    public boolean isComplete() {
        for (boolean guess : guessed) {
            if (!guess) {
                return false;
            }
        }
        return true;
    }

    public void setComplete(boolean complete) {
        for (int i = 0; i < guessed.length; i++) {
            guessed[i] = true;
        }
    }
}
