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
 * DetailResponse
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DetailResponse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String responseText;

    // llaves foraneas
    @ManyToOne
    @JoinColumn(name = "response_option_id")
    private ResponseOption responseOption;

    @ManyToOne
    @JoinColumn(name = "response_id")
    private Response response;


}