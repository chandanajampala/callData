package com.example.demo;




public class userEntity {
	
    public userEntity() {
		super();
	}

	
	private Long id;
    
    private String firstName;
    
    private String secondName;
	
    private String phoneNo;
    
    private String emailId;
    private String address;
    
    
    
    public userEntity(String firstName, String secondName, String phoneNo, String emailId, String address) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		this.phoneNo = phoneNo;
		this.emailId = emailId;
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}
	
    public String getSecondName() {
		return secondName;
	}
	
    public String getPhoneNo() {
		return phoneNo;
	}
	
    public String getEmailId() {
		return emailId;
	}
	
    public String getAddress() {
		return address;
	}

    
   

}
