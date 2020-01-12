package topic3.accsess_modifer.Genre;

public class VerseGenre extends GenreByForm {
    @Override
    public String getGenreName() {
        return GenreEnum.VERSE.name();
    }
}
