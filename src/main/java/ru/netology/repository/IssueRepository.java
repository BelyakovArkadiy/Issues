package ru.netology.repository;

import ru.netology.domain.Issue;

import java.util.ArrayList;
import java.util.Collection;

public class IssueRepository {
     private Collection<Issue> issues = new ArrayList<>();

    public void save(Issue issue) {
        issues.add(issue);
    }

    public Collection<Issue> findAll() {
        return issues;
    }

    public Issue findById(int id) {
        for (Issue issue : issues) {
            if (issue.getId() == id) {
                return issue;
            }
        }
        return null;
    }

    public void removeById(int id) {
        issues.removeIf(item ->item.getId() == id);

    }
    public void saveAll(Collection<? extends Issue> products){
        issues.addAll(products);
    }
    public void removeAll(Collection<? extends Issue> products){
        issues.removeAll(products);
    }




}
