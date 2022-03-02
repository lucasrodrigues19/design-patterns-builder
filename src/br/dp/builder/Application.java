package br.dp.builder;

import br.dp.builder.enumx.LocalDoor;
import br.dp.builder.enumx.LocalWindow;
import br.dp.builder.services.BlockHouseService;
import br.dp.builder.services.WoodHouseService;

/**
 * @author Lucas Rodrigues
 * @since 2021/10/22
 */
public class Application {

	public static void main(String[] args) {
		
		BlockHouseService blockHouse = new BlockHouseService();
		WoodHouseService woodHouse = new WoodHouseService();
		
		
		System.out.println("---------------------------------------------");
		System.out.println("BlockHouse builder....");
		blockHouse.buildFoundation();
		
		blockHouse.buildStructure("10X10");
		
		blockHouse.buildRoof();
		
		blockHouse.buildDoors(LocalDoor.FRONT_OUTER_WALL);
		blockHouse.buildDoors(LocalDoor.OUTER_WALL_BEHIND);
		blockHouse.buildDoors(LocalDoor.BATHROOM);
		blockHouse.buildDoors(LocalDoor.BEDROOMS);
		
		blockHouse.buildWindow(LocalWindow.FRONT_OUTER_WALL);
		blockHouse.buildWindow(LocalWindow.OUTER_WALL_SIDE);
		blockHouse.buildWindow(LocalWindow.BATHROOM);
		blockHouse.buildWindow(LocalWindow.BEDROOMS);
		
		blockHouse.buildWall();
		
		System.out.println();
		
		
		System.out.println("---------------------------------------------");
		System.out.println("WoodHouse builder....");
		
		woodHouse.buildFoundation();
		
		woodHouse.buildStructure("10X10");
		
		woodHouse.buildRoof();
		
		woodHouse.buildDoors(LocalDoor.FRONT_OUTER_WALL);
		woodHouse.buildDoors(LocalDoor.OUTER_WALL_BEHIND);
		woodHouse.buildDoors(LocalDoor.BATHROOM);
		woodHouse.buildDoors(LocalDoor.BEDROOMS);
		
		woodHouse.buildWindow(LocalWindow.FRONT_OUTER_WALL);
		woodHouse.buildWindow(LocalWindow.OUTER_WALL_SIDE);
		woodHouse.buildWindow(LocalWindow.BATHROOM);
		woodHouse.buildWindow(LocalWindow.BEDROOMS);
		
		woodHouse.buildWall();
		
		woodHouse.buildGarden();
		
		woodHouse.buildPool();
		
		
	}
}
