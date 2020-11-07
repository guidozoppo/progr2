
public class Actor {

	private String persona;
	
	public Actor(String persona) {
		this.persona = persona;
	}

	public String getPersona() {
		return persona;
	}

	public void setPersona(String persona) {
		this.persona = persona;
	}
	
	public String toString() {
		return getPersona();
	}
	
}
