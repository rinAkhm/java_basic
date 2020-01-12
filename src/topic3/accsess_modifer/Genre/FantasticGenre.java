package topic3.accsess_modifer.Genre;

public class FantasticGenre extends GenreByContent {
    @Override
    public String getGenreName() {
        return GenreEnum.FANTASTIC.name();
    }
}
