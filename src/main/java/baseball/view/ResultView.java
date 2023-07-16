package baseball.view;

import baseball.code.Hint;

import java.util.EnumMap;
import java.util.stream.Collectors;

public class ResultView {

    private static final StringBuilder sb = new StringBuilder();

    public static void printResult(EnumMap<Hint, Integer> hints) {
        hints.keySet().stream()
                .sorted((e1, e2) -> Integer.compare(e1.getSort(), e2.getSort()))
                .filter(hint -> hints.get(hint) > 0)
                .collect(Collectors.toMap(k -> k, hints::get))
                .forEach(ResultView::append);
        System.out.println(sb.toString());
        clearStringBuilder();
    }

    private static void append(Hint hint, Integer count) {
        sb.append(count);
        sb.append(hint.getDescription());
        sb.append(" ");
    }

    private static void clearStringBuilder() {
        sb.setLength(0);
    }

}
