package builder.samsung;

public class Samsung {

	private String storage;
	private String ram;
	private String duration;
	
	public Samsung() {
		// TODO Auto-generated constructor stub
	}

	public String getStorage() {
		return storage;
	}

	public void setStorage(String storage) {
		this.storage = storage;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	public void data() {
		System.out.println("Duration " + (this.duration == null ? "unkown" : this.duration) );
		System.out.println("RAM " + (this.ram == null ? "unkown" : this.ram) );
		System.out.println("Storage " + (this.storage == null ? "unkown" : this.storage) );
	}

}
