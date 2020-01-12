package topic3.accsess_modifer.BookMover.book;

public class Book {
    private String tittle;
    private StatusEnum status;


    public Book(String tittle) {
        this.tittle = tittle;
        this.status = StatusEnum.AVAILABLE;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }
}
