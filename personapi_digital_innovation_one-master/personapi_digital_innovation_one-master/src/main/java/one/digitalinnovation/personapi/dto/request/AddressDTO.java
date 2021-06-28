package one.digitalinnovation.personapi.dto.request;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class AddressDTO {

	private Long id;
	
	@NotEmpty
	@Size(min = 2, max = 100)
	private String street;
	
	@NotEmpty
	@Size(min = 2, max = 100)
	private String district;
	
	@NotEmpty
	@Size(min = 2, max = 100)
	private String city;
	
	@NotEmpty
	@Size(min = 2, max = 100)
	private String state;

	@NotEmpty
	@Size(min = 2, max = 100)
	private String country;
}
