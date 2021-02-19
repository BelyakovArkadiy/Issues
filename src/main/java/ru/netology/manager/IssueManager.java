package ru.netology.manager;

import ru.netology.domain.Issue;
import ru.netology.repository.IssueRepository;

import java.util.Arrays;
import java.util.function.Predicate;

public class IssueManager {
    private IssueRepository repository;


    public IssueManager(IssueRepository repository) {
        this.repository = repository;
    }

    /*public Issue[] searchByAuthor(String author) {
        Issue[] result = new Issue[0];
        for (Issue issue : repository.findAll()) {
            if (equals(issue.setAuthor(),issue.getAuthor()) {
                Issue[] tmp = new Issue[result.length + 1];
                System.arraycopy(result, 0, tmp, 0, result.length);
                tmp[tmp.length - 1] = issue;
                result = tmp;
            }
        }
        Arrays.sort(result);

        return result;
    }*/



}
