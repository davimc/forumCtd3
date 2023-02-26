package br.com.ctd.Forum.dtos;

import br.com.ctd.Forum.entities.PostCommnad;
import br.com.ctd.Forum.entities.Question;
import br.com.ctd.Forum.entities.SamplePost;
import br.com.ctd.Forum.entities.User;
import br.com.ctd.Forum.entities.enums.PostMapper;
import jakarta.persistence.DiscriminatorValue;

public class PostMapperDTO {

    public static SamplePostDTO mapper(PostCommnad obj) throws ClassNotFoundException {
        String postType = obj.getClass().getAnnotation(DiscriminatorValue.class).value();
        SamplePost sample = (SamplePost) obj;
        switch (postType) {
            case "POST":
                return new PostDTO(sample);
            case "ADS":
                return new AdsDTO(sample);
            case "QUESTION":
                return new QuestionDTO(sample);
            default:
                throw new ClassNotFoundException("Classe não encontrada para tipo: " + postType);
        }
    }
}
