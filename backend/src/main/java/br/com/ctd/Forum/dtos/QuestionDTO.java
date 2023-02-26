package br.com.ctd.Forum.dtos;

import br.com.ctd.Forum.entities.Post;
import br.com.ctd.Forum.entities.Question;
import br.com.ctd.Forum.entities.SamplePost;

import java.time.LocalDate;

public class QuestionDTO extends SamplePostDTO{
    private boolean solved;
    public QuestionDTO() {
    }

    public QuestionDTO(Long id, String message, LocalDate date, Long upVote, Long downVotes, Long relevance, boolean solved) {
        super(id, message, date, upVote, downVotes, relevance);
        this.solved = solved;
    }

    public QuestionDTO(SamplePost obj) {
        super(obj);
        Question p = (Question) obj;
        solved = p.isSolved();
    }

    public boolean isSolved() {
        return solved;
    }
}
