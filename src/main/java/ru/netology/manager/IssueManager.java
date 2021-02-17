package ru.netology.manager;

import ru.netology.domain.Issue;
import ru.netology.repository.IssueRepository;

import java.util.Arrays;
import java.util.function.Predicate;

public class IssueManager {
    private IssueRepository repository;
    private Predicate<Issue> comparator;

    public IssueManager(IssueRepository repository) {
        this.repository = repository;
    }

    public Issue[] searchByAuthor(String author, Predicate<Issue> comparator) {
        Issue[] result = new Issue[0];
        for (Issue issue : repository.findAll()) {
            if (matches(issue, author)) {
                Issue[] tmp = new Issue[result.length + 1];
                System.arraycopy(result, 0, tmp, 0, result.length);
                tmp[tmp.length - 1] = issue;
                result = tmp;
            }
        }
        Arrays.asList(result, comparator);

        return result;
    }


    public boolean matches(Issue issue, String author) {
        if (issue.getAuthor().equalsIgnoreCase(author) ) {
            return true;
        }
        return false;
    }
}
