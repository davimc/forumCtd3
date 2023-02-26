package br.com.ctd.Forum.entities;

import br.com.ctd.Forum.dtos.PostMapperDTO;
import br.com.ctd.Forum.entities.enums.PostMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PostTest {

    private SamplePost post;

    @Test
    public void postMapperShouldHaveSameNumberOfPermitted() throws ClassNotFoundException {
        int postMapperrQtt = PostMapper.values().length;
        List<Class<?>> permitedPost = getPermittedPost();
        int postPermittedQtt = permitedPost.size();

        Assertions.assertEquals(postMapperrQtt, postPermittedQtt);
    }

    @Test
    public void postMapperDTOShouldReturnQuestionDTOWhenMapperAQuestion() {
        Question q = new Question(null, new User(),"asdasd", null);
        Assertions.assertDoesNotThrow(() -> {
            Assertions.assertEquals(PostMapperDTO.mapper(q).getClass().getSimpleName(), "QuestionDTO");

        });
    }

    private List<Class<?>> getPermittedPost() {
        List<Class<?>> classes =  Arrays.stream(PostCommnad.class.getPermittedSubclasses()).toList();
        List<Class<?>> permittedClasses = new ArrayList<>();
        classes.stream().forEach(c -> permittedClasses.addAll(Arrays.stream(c.getPermittedSubclasses()).toList()));

        return permittedClasses;
    }
}
