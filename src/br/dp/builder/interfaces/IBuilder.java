package br.dp.builder.interfaces;

import br.dp.builder.enumx.LocalDoor;
import br.dp.builder.enumx.LocalWindow;

/**
 * @author Lucas Rodrigues
 * @since 2021/10/22
 */
public interface IBuilder {

	/**
	 * Contruir fundação
	 * @author Lucas Rodrigues
	 * @since 2021/10/22
	 */
	void buildFoundation();
	
	
	/**
	 * Contruir muro
	 * @author Lucas Rodrigues
	 * @since 2021/10/22
	 */
	void buildWall();
	

	/**
	 * Contruir estrutrua
	 * @author Lucas Rodrigues
	 * @since 2021/10/22
	 */
	void buildStructure(String plant);

	/**
	 * Contruir porta
	 * @author Lucas Rodrigues
	 * @since 2021/10/22
	 */
	default void buildDoors(LocalDoor local) {
		System.out.println("Construindo a porta em: "+local.getName());
	}
	
	
	/**
	 * Contruir janela
	 * @author Lucas Rodrigues
	 * @since 2021/10/22
	 */
	default void buildWindow(LocalWindow local) {
		System.out.println("Construindo a janela em: "+local.getName());
	}
	
	/**
	 * Contruir telhado
	 * @author Lucas Rodrigues
	 * @since 2021/10/22
	 */
	void buildRoof();
	
	/**
	 * Contruir piscina
	 * @author Lucas Rodrigues
	 * @since 2021/10/22
	 */
	default void  buildPool() {
		System.out.println("Construindo a piscina...");
	}
	
	/**
	 * Contruir jardim
	 * @author Lucas Rodrigues
	 * @since 2021/10/22
	 */
	default void buildGarden() {
		System.out.println("Construindo o jardim...");
	}
	
	/**
	 * Contruir área de lazer
	 * @author Lucas Rodrigues
	 * @since 2021/10/22
	 */
	default void buildLeisureArea() {
		System.out.println("Construindo a área de lazer...");
	}
	
}
