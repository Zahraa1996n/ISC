package ir.freeland.spring.validator;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;


public class Input {

  @Min(1)
  @Max(10)
  private int numberBetweenOneAndTen;

  // Note that this is actually not a valid IP address pattern, since
  // it allows values greater than 255 per octet.
  @Pattern(regexp = "^[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}$")
  private String ipAddress;
  
  @NotEmpty
  private String id;
  
  @Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")
  private String Email;
  
  
  public String getEmail() {
	return Email;
}

public void setEmail(String email) {
	Email = email;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public int getNumberBetweenOneAndTen() {
    return numberBetweenOneAndTen;
  }

  public void setNumberBetweenOneAndTen(int numberBetweenOneAndTen) {
    this.numberBetweenOneAndTen = numberBetweenOneAndTen;
  }

  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }
}
