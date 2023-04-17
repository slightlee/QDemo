package com.demain.base;

import com.demain.entity.Question;
import com.demain.entity.Question2;
import com.demain.entity.RealOption;
import com.demain.entity.RealOption2;
import com.demain.enums.MediaTypeEnum;
import com.demain.enums.OptionTypeEnum;
import com.demain.vo.Option;
import com.google.gson.Gson;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;

/**
 * 单元测试
 */
public class QuestionTest {

    private final Logger logger = LoggerFactory.getLogger(QuestionTest.class);

    Gson gson = new Gson();


    /**
     * 测试 Question 类
     */
    @Test
    public void testQuestion() {
        Question2<RealOption> question = new Question2<>();
        question.setQId("1");
        question.setQTitle("题干");
        question.setQType(1);
        question.setSort(1);

        RealOption option = new RealOption();
        option.setOId("Op1");
        option.setOTitle("选项1");
        option.setOType(1);
        option.setScore(1);
        option.setMedia(new String[]{"https://www"});
        option.setMediaType(MediaTypeEnum.VIDEO.getCode());

        RealOption option2 = new RealOption();
        option2.setOId("Op2");
        option2.setOTitle("选项2");
        option2.setOType(1);
        option2.setScore(1);
        option2.setMedia(new String[]{"https://www"});
        option2.setMediaType(MediaTypeEnum.VIDEO.getCode());

        List<RealOption> realOptionList = List.of(option, option2);
        question.setOptions(realOptionList);
        logger.info("题目数据:" + gson.toJson(question));
    }

    /**
     * 测试 Question2 类
     */
    @Test
    public void testQuestion2() {
        Question<RealOption2> question = new Question<>();
        question.setQId("1");
        question.setQTitle("题干");
        question.setQType(1);
        question.setSort(1);
        question.setMedia(new String[]{"https://www1", "https://www2"});

        RealOption2 option = new RealOption2();
        option.setOId("Op1");
        option.setOTitle("选项1");
        option.setOType(1);
        option.setScore(1);

        RealOption2 option2 = new RealOption2();
        option2.setOId("Op2");
        option2.setOTitle("选项2");
        option2.setOType(1);
        option2.setScore(1);

        List<RealOption2> realOptionList = List.of(option, option2);
        question.setOptions(realOptionList);
        logger.info("题目数据:" + gson.toJson(question));

    }

    @Test
    public void testRealOption() {
        RealOption option = new RealOption();
        option.setOId("1");
        option.setOTitle("选项");
        option.setOType(1);
        option.setScore(1);
        option.setMedia(new String[]{"https://www"});

        logger.info("题支数据:" + gson.toJson(option));
        int code = OptionTypeEnum.SINGLE.getCode();
        String name = OptionTypeEnum.SINGLE.getName();
        logger.info("code码：" + code + "--" + name);
    }


    /**
     * 测试 Question<T,E> 、Option<E> 类
     * <p>
     * 此方式 题干 题支 信息分开
     *
     * @see com.demain.vo.Question
     * @see com.demain.vo.Option
     */
    @Test
    public void QuestionOption() {

        com.demain.vo.Question<Question<RealOption>, RealOption> questionRealOptionQuestion = new com.demain.vo.Question<>();

        Question<RealOption> question = new Question<>();
        question.setQId("1");
        question.setQTitle("题干");
        question.setQType(1);
        question.setSort(1);
        question.setMedia(new String[]{"https://www1", "https://www2"});

        Option<RealOption> option = new Option<>();
        option.setType(1);

        RealOption option1 = new RealOption();
        option1.setOId("Op1");
        option1.setOTitle("选项1");
        option1.setOType(1);
        option1.setScore(1);
        option1.setMedia(new String[]{"https://www"});

        RealOption option2 = new RealOption();
        option2.setOId("Op2");
        option2.setOTitle("选项2");
        option2.setOType(1);
        option2.setScore(1);
        option2.setMedia(new String[]{"https://www"});

        option.setData(Arrays.asList(option1, option2));

        // 题干信息
        questionRealOptionQuestion.setTopic(question);

        // 题支信息
        questionRealOptionQuestion.setOptions(option);

        logger.info("题目数据:" + gson.toJson(questionRealOptionQuestion));
    }
}
