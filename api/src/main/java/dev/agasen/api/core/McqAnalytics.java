package dev.agasen.api.core;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class McqAnalytics {
  private Long mcqId;
  private Long timesTaken;
  private Long timesCorrect;
  private List<McqChoiceAnalytics> choiceAnalytics;
}
