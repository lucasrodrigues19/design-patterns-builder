package br.dp.builder.services;

import br.dp.builder.interfaces.IBuilder;

/**
 * @author Lucas Rodrigues
 * @since 2021/10/22
 */
public class BlockHouseService implements IBuilder {

	@Override
	public void buildFoundation() {
		System.out.println("Construindo fundaçao com: blocos pedra e cimento...");
	}

	@Override
	public void buildWall() {
		System.out.println("Construindo muro com blocos...");
	}

	@Override
	public void buildStructure(String plant) {
		System.out.println("Construindo estrutura: paredes externas e internas, com blocos...");
	}

	@Override
	public void buildRoof() {
		System.out.println("Construindo o telhado de cerâmica...");
	}

}
