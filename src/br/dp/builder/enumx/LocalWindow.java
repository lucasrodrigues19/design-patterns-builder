package br.dp.builder.enumx;

public enum LocalWindow {
	
	FRONT_OUTER_WALL("Frente"),
	
	OUTER_WALL_SIDE("Lados"),
	
	OUTER_WALL_BEHIND("Atrás"),
	
	BEDROOMS("Quartos"),
	
	BATHROOM("Baheiro");
	
	private String name;

	private LocalWindow(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
}
