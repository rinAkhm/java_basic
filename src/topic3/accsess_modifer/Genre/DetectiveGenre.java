package topic3.accsess_modifer.Genre;

public class DetectiveGenre extends GenreByContent {

    @Override
    public String getGenreName() {
        return GenreEnum.DETECTIVE.name(); //'Detective'
    }
}
