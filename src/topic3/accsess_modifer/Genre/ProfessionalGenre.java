package topic3.accsess_modifer.Genre;

public class ProfessionalGenre extends GenreByContent {
    @Override
    public String getGenreName() {
        return GenreEnum.PROFESSIONAL.name();
    }
}
