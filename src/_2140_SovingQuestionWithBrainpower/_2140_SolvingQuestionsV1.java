package _2140_SovingQuestionWithBrainpower;

public class _2140_SolvingQuestionsV1 {


    private static int numsQuestions;
    private static Long[] cache;
    private static int[][] questionsData;

    public static void main(String[] args) {

    }

    private static long solvingQuestion(int[][] questions) {
        numsQuestions = questions.length;
        cache = new Long[numsQuestions];
        questionsData = questions;

        return dfsV1(0);
    }


    private static long dfsV1(int index) {

        if(index >= numsQuestions)  return 0;

        if(cache[index] != null) return cache[index];

        int point = questionsData[index][0];

        int bonus = questionsData[index][1];

        return cache[index] = Math.max(point + dfsV1(index + 1 + bonus), dfsV1(index + 1));
    }
}
