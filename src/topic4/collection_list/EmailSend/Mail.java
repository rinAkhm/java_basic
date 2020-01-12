package topic4.collection_list.EmailSend;

public class Mail {
    private String email;
    private String massage;

    public Mail(String email, String massage) {
        this.email = email;
        this.massage = massage;
    }

    @Override
    public String toString() {
        return String.format("mail to: %s,\n%s", email,massage);
    }
}
