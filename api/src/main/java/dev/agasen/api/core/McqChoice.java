package dev.agasen.api.core;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class McqChoice {
  private Long id;
  private String choice;
  private String explanation;
  private String isCorrect;
}
