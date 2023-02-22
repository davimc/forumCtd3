package br.com.ctd.Forum.entities;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public non-sealed class Ads extends SamplePost{

    private Long entry;
    public Ads() {
    }

    public Ads(Long id, User user, String message, LocalDate date, Long upVote, Long downVote, SamplePost originalPost) {
        super(id, user, message, date, upVote, downVote, originalPost);
        entry = 0L;
    }

    @Override
    public void execute() {
        entry++;
    }

    @Override
    public Map<String, ?> getInfos() {
        Map<String, Long> info = new HashMap<>();
        info.put("Entry", getEntry());
        return info;
    }

    public Long getEntry() {
        return entry;
    }

    public void setEntry(Long entry) {
        this.entry = entry;
    }


}
