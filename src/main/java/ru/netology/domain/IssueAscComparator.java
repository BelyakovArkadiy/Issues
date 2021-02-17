package ru.netology.domain;

import java.util.function.Predicate;

public class IssueAscComparator implements Predicate<Issue> {
    @Override
    public boolean test(Issue issue) {
        return false;
    }

    @Override
    public Predicate<Issue> and(Predicate<? super Issue> other) {
        return null;
    }

    @Override
    public Predicate<Issue> negate() {
        return null;
    }

    @Override
    public Predicate<Issue> or(Predicate<? super Issue> other) {
        return null;
    }
}
