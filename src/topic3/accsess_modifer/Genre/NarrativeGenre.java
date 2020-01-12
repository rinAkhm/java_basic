package topic3.accsess_modifer.Genre;

public class NarrativeGenre extends GenreByNumberOfPages {
    @Override
    public String getGenreName() {
        return GenreEnum.NARRATIVE.name();
    }
}
