package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Issue implements Comparable<String>{
      private int id;
      private ArrayList<String> author;
      private ArrayList<String> label;
      private ArrayList<String> assignee;
      private String project;
      private boolean open;
      private boolean closed;


      public ArrayList<String> setAuthor() {
            this.author = author;
            return null;
      }

      @Override
      public int compareTo(String o) {
            return 0;
      }
}
