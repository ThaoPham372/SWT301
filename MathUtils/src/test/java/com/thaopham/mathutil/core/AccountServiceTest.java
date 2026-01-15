package com.thaopham.mathutil.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

class AccountServiceTest {

  private final AccountService accountService = new AccountService();

  @DisplayName("registerAccount should respect validation rules (CSV file data)")
  @ParameterizedTest
  @CsvFileSource(resources = "/data/test_data.csv", numLinesToSkip = 1)
  void testRegisterAccountFromCsv(String username, String password, String email, boolean expected) {
    boolean actual = accountService.registerAccount(username, password, email);
    assertEquals(expected, actual);
  }

  @DisplayName("isValidEmail basic positive and negative cases")
  @ParameterizedTest
  @CsvSource({
      "user@example.com, true",
      "john.doe@mail.co, true",
      "missing-at-sign.com, false",
      "nouser@, false",
      "@nodomain, false",
      "'', false",
      "   , false"
  })
  void testIsValidEmail(String email, boolean expected) {
    boolean actual = accountService.isValidEmail(email == null ? null : email.trim());
    assertEquals(expected, actual);
  }

  @DisplayName("Password must be longer than 6 characters")
  @ParameterizedTest
  @CsvSource({
      "123456, false",
      "1234567, true",
      "longpassword, true"
  })
  void testIsValidPassword(String password, boolean expected) {
    assertEquals(expected, accountService.isValidPassword(password));
  }

  @DisplayName("Username must not be null or blank")
  @ParameterizedTest
  @CsvSource({
      "john123, true",
      "'', false",
      "'   ', false"
  })
  void testUsernameValidation(String username, boolean expected) {
    boolean result = accountService.registerAccount(username, "password123", "user@mail.com");
    if (expected) {
      assertTrue(result);
    } else {
      assertFalse(result);
    }
  }
}
