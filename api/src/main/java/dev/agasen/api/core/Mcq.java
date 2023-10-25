package dev.agasen.api.core;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class Mcq {
  private Long id;
  private String topic;
  private String question;
  private Set<McqChoice> choices;
}
