package topic3.accsess_modifer.BookMover.book;

public enum StatusEnum {
    BORROWED("Доступно"),
    AVAILABLE("Взято в пользование"),
    OVERDUED("В архиве"),
    ARCHIVED("Задержана");

    private String description;

    StatusEnum (String description) {
        this.description = description;
    }
}
