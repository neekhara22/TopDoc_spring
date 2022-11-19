package com.app.topdoc.pojo;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TeamSetupPojo {
	private String doctorTeamId ;
	private String email;
	private Double experience ;
	private String firstName;
	private String lastName ;
	private String[] mappedTo;
	private Long mobileNumber;
	private String password;
	private Integer pin;
	private String[] qualification;
	private String[] role;
	
	@Override
	public String toString() {
		return "TeamSetupPojo [firstName=" + firstName + ", lastName=" + lastName + ", mobileNumber=" + mobileNumber
				+ ", email=" + email + ", role=" + Arrays.toString(role) + ", mappedTo=" + Arrays.toString(mappedTo)
				+ ", qualification=" + Arrays.toString(qualification) + ", experience=" + experience + ", pin=" + pin
				+ ", password=" + password + ", doctorTeamId=" + doctorTeamId + "]";
	}

}
