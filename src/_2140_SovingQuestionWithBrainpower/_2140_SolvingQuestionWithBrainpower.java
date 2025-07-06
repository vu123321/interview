package _2140_SovingQuestionWithBrainpower;

public class _2140_SolvingQuestionWithBrainpower {

    private static int numsQuestions;
    private static Long[] cache;

    private static int[][] questionsData;


    public static void main(String[] args) {
        int[][] data = new int[][]{{3, 2}, {4, 3}, {4, 4}, {2, 5}};
        _2140_SolvingQuestionWithBrainpower questionBrain = new _2140_SolvingQuestionWithBrainpower();

        questionBrain.questionsData = data;

        System.out.println(questionBrain.solvingQuestion(data));

        System.out.println("----------------------");

        Integer x = 100;
        Integer y = 100;

        System.out.println(System.identityHashCode("x" + x));
        System.out.println(System.identityHashCode("y" + y));
        if (x == y) {
            System.out.println();
            System.out.println("equal");
        } else {
            System.out.println("Not equals");
}
    }

    private static long solvingQuestion(int[][] questions) {
        numsQuestions = questions.length;
        cache = new Long[numsQuestions];

        questionsData = questions;

        return dfs(0);
    }

    private static long dfs(int index) {

        if (index >= numsQuestions) {
            return 0;
        }

        if (cache[index] != null) {
            return cache[index];
        }

        int point = questionsData[index][0];

        int bonus = questionsData[index][1];

        return cache[index] = Math.max(point + dfs(index + bonus + 1), dfs(index + 1));
    }

}
