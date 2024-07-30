package pqr.pqrapp.persistence.entity;

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
    private void setCreateTime() {
        createAt = LocalDateTime.now();
    }
}
