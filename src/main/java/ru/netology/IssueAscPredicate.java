package ru.netology;

import ru.netology.domain.Issue;

import java.util.ArrayList;
import java.util.function.Predicate;

public class IssueAscPredicate implements Predicate<Issue> {
    ArrayList<Issue> issues = new ArrayList<>();

    @Override
    public boolean test(Issue issue) {
        ArrayList<String> issueSet = issue.setAuthor();
        ArrayList<String> issueGet = issue.getAuthor();
        equals(issueSet,issueGet);
            return true;


    }

    private void equals(ArrayList<String> issueFind, ArrayList<String> issueGet) {
    }
}
