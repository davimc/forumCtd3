package br.com.ctd.Forum.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;

public class PostTest {

    private SamplePost post;

    @Test
    public void postShouldInstantiateWhenConcretClass() throws ClassNotFoundException {
        Class<SamplePost> classe = SamplePost.class;
        System.out.println(classe.getPermittedSubclasses().length);
        Arrays.stream(classe.getPermittedSubclasses()).forEach(p-> System.out.println(p.getSimpleName()));
    }
}
