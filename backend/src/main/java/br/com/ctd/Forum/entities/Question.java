package br.com.ctd.Forum.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
@DiscriminatorValue("QUESTION")
public non-sealed class Question extends SamplePost{

    private boolean solved;
    public Question() {
    }

    public Question(Long id, User user, String message, SamplePost originalPost) {
        super(id, user, message, originalPost);
        solved = false;
    }




    public boolean isSolved() {
        return solved;
    }

    public void setSolved(boolean solved) {
        this.solved = solved;
    }

    @Override
    public void execute() {
        setSolved(!isSolved());
    }

    public static PostCommnad getInstance(PostCommnad obj) {
        SamplePost newObj = (SamplePost) obj;
        newObj = new Question(newObj.getId(), newObj.getUser(),newObj.getMessage(), newObj.getOriginalPost());
        return newObj;
    }

}
