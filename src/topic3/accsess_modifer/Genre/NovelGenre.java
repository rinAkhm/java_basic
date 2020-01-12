package topic3.accsess_modifer.Genre;

public class NovelGenre extends GenreByNumberOfPages {
    @Override
    public String getGenreName() {
        return GenreEnum.NOVEL.name();
    }
}
