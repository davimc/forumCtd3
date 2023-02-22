package br.com.ctd.Forum.entities;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public non-sealed class Question extends SamplePost{

    private boolean solved;
    public Question() {
    }

    public Question(Long id, User user, String message, LocalDate date, Long upVote, Long downVote, SamplePost originalPost) {
        super(id, user, message, date, upVote, downVote, originalPost);
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

    @Override
    public Map<String, ?> getInfos() {
        Map<String, Boolean> infos = new HashMap<>();
        infos.put("Solved", isSolved());

        return infos;
    }
}
