package ru.netology.domain;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class IssueAscComparator implements Comparator<Issue> {


    @Override
    public int compare(Issue o1, Issue o2) {return o1.getId()-o2.getId();
    }

    @Override
    public Comparator<Issue> reversed() {
        return null;
    }

    @Override
    public Comparator<Issue> thenComparing(Comparator<? super Issue> other) {
        return null;
    }

    @Override
    public <U> Comparator<Issue> thenComparing(Function<? super Issue, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return null;
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<Issue> thenComparing(Function<? super Issue, ? extends U> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Issue> thenComparingInt(ToIntFunction<? super Issue> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Issue> thenComparingLong(ToLongFunction<? super Issue> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Issue> thenComparingDouble(ToDoubleFunction<? super Issue> keyExtractor) {
        return null;
    }

    ;
    }


