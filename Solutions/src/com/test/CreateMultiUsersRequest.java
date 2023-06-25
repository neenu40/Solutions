package com.test;

import java.util.ArrayList;

public class CreateMultiUsersRequest {

	public MultiUserProfile userProfile;
	
}

class MultiUserProfile {

	public ArrayList<UserRequest> user;
	
}
class UserRequest{
	public Integer seqNumber;
	public IndividualName individualName;
	public ArrayList<Locator> locator;
}

class IndividualName{
	public String givenName;
	public String familyName;
}

class Locator{
	public TelephoneNumber telephoneNumber;
	public EmailAddress emailAddress;
}

class TelephoneNumber{
	public String countryCodeNum;
	public String telephoneNum;
}

class EmailAddress{
	public String text;
}