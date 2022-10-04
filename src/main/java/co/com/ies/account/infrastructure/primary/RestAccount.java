package co.com.ies.account.infrastructure.primary;

import co.com.ies.error.domain.Assert;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Set;

@Schema(name = "account", description = "Information for the authenticated user account")
class RestAccount {

  private final String login;
  private final Set<String> authorities;

  public RestAccount(String login, Set<String> authorities) {
    Assert.notBlank("login", login);

    this.login = login;
    this.authorities = authorities;
  }

  @Schema(description = "Login of the authenticated user", required = true)
  public String getLogin() {
    return login;
  }

  @Schema(description = "Authorities of the authenticated user")
  public Set<String> getAuthorities() {
    return authorities;
  }
}
