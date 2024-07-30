package pqr.pqrapp.domain.dto;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.PrePersist;

@Embeddable
public class Audit {
    @Column(name = "create_At")
    private LocalDateTime createAt;
    @Column(name = "update_At")
    private LocalDateTime updateAt;

    @PrePersist
    public void PrePersistAudit() {
        createAt = LocalDateTime.now();
    }
}
