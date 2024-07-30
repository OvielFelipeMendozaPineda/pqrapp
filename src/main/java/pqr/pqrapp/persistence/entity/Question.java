package pqr.pqrapp.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Question
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String questionNumber;
    private String questionText;
    private String responseText;
    private String commentQuestion;

    // Relaciones  llaves foraneas

    @ManyToOne()
    @JoinColumn(name = "chapter_id")
    private Chapter chapter;

    @ManyToOne()
    @JoinColumn(name = "survey_id")
    private Survey survey;

    @ManyToOne()
    @JoinColumn(name = "parent_question_id")
    private Question parentQuestion;

    // Listas

}