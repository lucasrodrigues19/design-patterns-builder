package br.dp.builder.enumx;

public enum LocalDoor {

	FRONT_OUTER_WALL("Frente"),
	
	OUTER_WALL_BEHIND("Atrás"),
	
	BEDROOMS("Quartos"),
	
	BATHROOM("Baheiro");
	
	private String name;

	private LocalDoor(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
