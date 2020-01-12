package topic3.accsess_modifer.Genre;

public class Genre {
    protected String attribute;

    public Genre(String attribute) {
        this.attribute = attribute;
    }

    public String getAttributeOfGenre() {
        return attribute;
    }

    public String getGenreName() {
        return "Жанр не указан";
    }

}
