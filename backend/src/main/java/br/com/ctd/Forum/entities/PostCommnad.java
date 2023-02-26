package br.com.ctd.Forum.entities;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public sealed interface PostCommnad permits SamplePost {
    void downVote();
    void upVote();
    Long getRelevance();
    void execute();




    static List<Class<?>> permitedList() {
        List<Class<?>> classes =  Arrays.stream(PostCommnad.class.getPermittedSubclasses()).toList();
        List<Class<?>> permittedClasses = new ArrayList<>();
        classes.stream().forEach(c -> permittedClasses.addAll(Arrays.stream(c.getPermittedSubclasses()).toList()));

        return permittedClasses;
    }
}
