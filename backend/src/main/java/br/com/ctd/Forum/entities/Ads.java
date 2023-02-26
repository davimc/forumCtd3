package br.com.ctd.Forum.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@Entity
@DiscriminatorValue("ADS")
public non-sealed class Ads extends SamplePost{

    private Long entry;
    public Ads() {
    }

    public Ads(Long id, User user, String message, SamplePost originalPost) {
        super(id, user, message, originalPost);
        entry = 0L;
    }

    @Override
    public void execute() {
        entry++;
    }

    public static PostCommnad getInstance(PostCommnad obj) {
        SamplePost newObj = (SamplePost) obj;
        newObj = new Ads(newObj.getId(), newObj.getUser(),newObj.getMessage(), newObj.getOriginalPost());
        return newObj;
    }

    public Long getEntry() {
        return entry;
    }

    public void setEntry(Long entry) {
        this.entry = entry;
    }


}
