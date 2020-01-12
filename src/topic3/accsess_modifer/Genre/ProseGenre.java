package topic3.accsess_modifer.Genre;

public class ProseGenre extends GenreByForm {
    @Override
    public String getGenreName() {
        return GenreEnum.PROSE.name();
    }
}
