package com.example.examen;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IdentityServiceTest {

    private final IdentityService identityService = new IdentityService(); // Configuración

    @Test
    @DisplayName("Verify an existent CI")
    void verifyExistence() {
        // Acción
        boolean result = identityService.verifyExistence(1);

        // Verificación
        assertTrue(result, "The CI should exist");
    }

    @Test
    @DisplayName("Verify a non-existent CI")
    void verifyUnExistence() {
        // Acción
        boolean result = identityService.verifyExistence(5);

        // Verificación
        assertFalse(result, "The CI should not exist");
    }
}
