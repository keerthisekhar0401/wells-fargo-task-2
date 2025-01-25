package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long portfolioId;

    @OneToOne
    @JoinColumn(name = "client_id", nullable = false)
    private client client;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private LocalDateTime updatedAt;

    protected portfolio() {
    }

    public portfolio(client client, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.client = client;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public client getClient() {
        return client;
    }

    public void setClient(client client) {
        this.client = client;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
