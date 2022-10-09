Feature: Je verifier l existance 
  En tant que utilisateur je souhaite de verifier l existance de formation python niveau fondamentale

  @twss
   Scenario: Je verifier l existance 
     Given Je me connecte sur le site TheWay
    When Je clique sur formations
    And Je clique sur developpement
    And Je clique sur python 
    Then Je verifie l existance de niveau fondamentale "Fondamental"
   