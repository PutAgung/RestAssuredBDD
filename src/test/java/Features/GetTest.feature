Feature:
  Verify different Get type data

  Scenario: Check correct datatype
    Given I perform GET operation from post
    When I perform GET for the post
    Then I should see the each parameter has correct datatype value coba
