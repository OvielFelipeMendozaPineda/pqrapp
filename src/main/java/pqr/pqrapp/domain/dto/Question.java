package pqr.pqrapp.domain.dto;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "parentQuestion", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Question> childrenQuestions;

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL, orphanRemoval = true)
    private List <ResponseOption> responseOptions;
    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL, orphanRemoval = true)
    private List <DetailResponse> detailResponses;
    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL, orphanRemoval = true)
    private List <ResponseCatalog> responseCatalogs;


    @ManyToOne
    @JoinColumn(name = "chapter_id")
    private Chapter chapter;

    @ManyToOne
    @JoinColumn(name = "parent_question_id")
    private Question parentQuestion;

    @ManyToOne
    @JoinColumn(name = "survey_id")
    private Survey survey;

    private String questionNumber;
    private String questionText;
    private String responseType;
    private String commentQuestion;


    // @OneToMany(mappedBy = "question")
    // private List<ResponseOption> responseOptions;



}
