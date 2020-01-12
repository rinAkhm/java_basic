package topic3.accsess_modifer.Genre;

public class StoryGenre extends GenreByNumberOfPages {
    @Override
    public String getGenreName() {
        return GenreEnum.STORY.name();
    }
}
