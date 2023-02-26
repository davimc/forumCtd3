package br.com.ctd.Forum.dtos;

import br.com.ctd.Forum.entities.Post;
import br.com.ctd.Forum.entities.PostCommnad;
import br.com.ctd.Forum.entities.SamplePost;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class PostDTO extends SamplePostDTO{


    public PostDTO() {
    }

    public PostDTO(Long id, String message, LocalDate date, Long upVote, Long downVotes, Long relevance) {
        super(id, message, date, upVote, downVotes, relevance);
    }

    public PostDTO(SamplePost obj) {
        super(obj);
        Post p = (Post) obj;
    }
}
