public class QuestionAndAnswer {
    private String question;
    private String answer;

    @Override
    public String toString() {
        return "QuestionAndAnswer{" +
                "question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public QuestionAndAnswer(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }
}
