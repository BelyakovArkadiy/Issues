package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.function.Predicate;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class Issue implements Predicate<Issue> {
 private int id;
 private String author;
 private String label;
 private String assignee;
 private String project;
 private boolean open;
 private boolean closed;



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
