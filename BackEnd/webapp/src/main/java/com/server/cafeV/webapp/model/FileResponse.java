package com.server.cafeV.webapp.model;

public class FileResponse {

	private String filename;
	private String fileDownloadUri;
	public FileResponse(String filename, String fileDownloadUri) {
		super();
		this.filename = filename;
		this.fileDownloadUri = fileDownloadUri;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getFileDownloadUri() {
		return fileDownloadUri;
	}
	public void setFileDownloadUri(String fileDownloadUri) {
		this.fileDownloadUri = fileDownloadUri;
	}
	
}
