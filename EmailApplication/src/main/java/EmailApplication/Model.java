package EmailApplication;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class Model {

	@Id
	private String id;
	@Column
	private String senderName;
	@Column
	private String senderMail;
	@Column
	private String receiverName;
	@Column
	private String receiverMail;
	
	@CreatedDate
	private Date createdAt;

	@LastModifiedDate
	private Date updatedAt;
	@Column
	// private Datetime scheduledAt
	private Long duration;   //Long????
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
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
	public String getReceiverName() {
		return receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	public String getReceiverMail() {
		return receiverMail;
	}
	public void setReceiverMail(String receiverMail) {
		this.receiverMail = receiverMail;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public Long getDuration() {
		return duration;
	}
	public void setDuration(Long duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Model [id=" + id + ", senderName=" + senderName + ", senderMail=" + senderMail + ", receiverName="
				+ receiverName + ", receiverMail=" + receiverMail + ", createdAt=" + createdAt + ", updatedAt="
				+ updatedAt + ", duration=" + duration + "]";
	}

	
	
	
}
