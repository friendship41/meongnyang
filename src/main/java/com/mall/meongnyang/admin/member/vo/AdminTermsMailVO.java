package com.mall.meongnyang.admin.member.vo;

public class AdminTermsMailVO {
	 private String senderName;   
	    private String senderMail;    
	    private String receiveMail;  
	    private String subject;           
	    private String message;
	    
	    
	    public String getSenderName() {
	        return senderName;
	    }
	    public void setSenderName(String senderName) {
	        this.senderName = senderName;
	    }
	    public String getSenderMail() {
	        return senderMail;
	    }
	    public void setSenderMail(String senderMail) {
	        this.senderMail = senderMail;
	    }
	    public String getReceiveMail() {
	        return receiveMail;
	    }
	    public void setReceiveMail(String receiveMail) {
	        this.receiveMail = receiveMail;
	    }
	    public String getSubject() {
	        return subject;
	    }
	    public void setSubject(String subject) {
	        this.subject = subject;
	    }
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
	
		

}
