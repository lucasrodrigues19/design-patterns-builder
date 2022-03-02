package br.dp.builder.services;

import br.dp.builder.interfaces.IBuilder;

/**
 * @author Lucas Rodrigues
 * @since 2021/10/22
 */
public class WoodHouseService implements IBuilder{

	@Override
	public void buildFoundation() {
		System.out.println("Construindo fundaçao com: madeira pedra e cimento...");
	}

	@Override
	public void buildWall() {
		System.out.println("Construindo muro com madeira...");
	}

	@Override
	public void buildStructure(String plant) {
		System.out.println("Construindo estrutura: paredes externas e internas, com madeira...");
	}

	@Override
	public void buildRoof() {
		System.out.println("Construindo o telhado de madeira...");
	}

}
