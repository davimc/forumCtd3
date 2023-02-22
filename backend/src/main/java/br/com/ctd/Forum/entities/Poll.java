package br.com.ctd.Forum.entities;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public non-sealed class Poll extends SamplePost{

    private Long positive;
    private Long negative;
    public Poll() {
    }

    public Poll(Long id, User user, String message, LocalDate date, Long upVote, Long downVote, SamplePost originalPost, Long positive, Long negative) {
        super(id, user, message, date, upVote, downVote, originalPost);
        this.positive = positive;
        this.negative = negative;
    }

    public Long getPositive() {
        return positive;
    }

    public void setPositive(Long positive) {
        this.positive = positive;
    }

    public Long getNegative() {
        return negative;
    }

    public void setNegative(Long negative) {
        this.negative = negative;
    }

    @Override
    public void execute() {

    }

    @Override
    public Map<String, ?> getInfos() {
        Map<String, Long> infos = new HashMap<>();
        infos.put("Positive",getPositive());
        infos.put("Negative", getNegative());

        return infos;
    }
}
