package com.home.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.Table;



import javax.persistence.Column;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;


@Entity
@Table(name="Document")
public class Document {
	
	@Id
	@Column(name="doc_Id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Doc_GEN")
	@SequenceGenerator(name ="Doc_GEN", sequenceName = "doc_seq_id")
	private Long docId;
	
	@Column(name="doc_Name")
	private String  docName;
	
	@Column(name="doc_Path")
	private String docPath;
	
	@ManyToOne
	@JoinColumn(name = "appId")
	private Application application;
	
	public Application getApplication() {
		return application;
	}
	public void setApplication(Application application) {
		this.application = application;
	}
	public byte[] getDocument() {
		return document;
	}
	public void setDocument(byte[] document) {
		this.document = document;
	}

	@Column(name="document")
	private byte[] document;
	
	
	public Long getDocId() {
		return docId;
	}
	public void setDocId(Long docId) {
		this.docId = docId;
	}
	public String getDocName() {
		return docName;
	}
	public void setDocName(String docName) {
		this.docName = docName;
	}
	public String getDocPath() {
		return docPath;
	}
	public void setDocPath(String docPath) {
		this.docPath = docPath;
	}
	
	
	@Override
	public String toString() {
		return "Document [docId=" + docId + ", docName=" + docName + ", docPath=" + docPath + "]";
	}
	
	public Document(Long docId, String docName, String docPath) {
		this.docId = docId;
		this.docName = docName;
		this.docPath = docPath;
	}
	
	public Document() {
		
	}
	
	
}


