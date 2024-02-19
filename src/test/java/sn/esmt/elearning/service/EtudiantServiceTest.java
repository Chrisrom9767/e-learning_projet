package sn.esmt.elearning.service;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class EtudiantServiceTest {

  @Autowired
  private EtudiantService etudiantService;

  @BeforeEach
  void setUp() {
    this.etudiantService = new EtudiantService();
  }

  @AfterEach
  void tearDown() {
  }

  @Test
  void checkAgeTrue() {
    Assertions.assertEquals(true,etudiantService.checkAge(16));
  }
  @Test
  void checkAgeFalse() {
    Assertions.assertEquals(false,etudiantService.checkAge(19));
  }
}