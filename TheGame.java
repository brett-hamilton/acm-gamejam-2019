import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

// ---------------------------------------------------------------------------
// File name: TheGame.java
// Project name: Game Jam - March 2019
// ---------------------------------------------------------------------------
// Creator's name and email: Brett Hamilton hamiltonb@etsu.edu
// Creation Date: 3/12/19
// Date of Last Modification: 3/24/19
// ---------------------------------------------------------------------------

/**
 * Class Name: TheGame <br>
 * Class Purpose: Run the game while player is alive until they win <br>
 *
 * <hr>
 * Date created: 3/12/19 <br>
 * Date last modified: 3/24/19
 * @author Brett Hamilton
 */

public class TheGame
{
	/**
	 * Method Name: main <br>
	 * Method Purpose: Intiate and run the game <br>
	 *
	 * <hr>
	 * Date created: 3/12/19 <br>
	 * Date last modified: 3/20/19 <br>
	 *
	 * <hr>
	 * Notes on specifications, special algorithms, and assumptions: N/A
	 *   
	 *
	 * <hr>
	 *   @param  args array of Strings (not used in this program)
	 */
	
	public static void main(String[] args)
	{
		Scanner kbAlpha = new Scanner(System.in);	//gets alphabetic keyboard input
		Scanner kbNum = new Scanner(System.in);		//gets numeric keyboard input
		Player player = new Player();					//creates player object
		
		String strInput;					//user-input before char is determined
		char cStartOption;					//determined choice based on strInput
		char cAction;						//determined choice based on strInput
		int iRoom;							//holds room number
		
		cStartOption = 'x';
		
		while (cStartOption != 's' || cStartOption != 'S')
		{
			System.out.print("\n\n____________________________________________________________"
				+ "______________\n\n");
			System.out.print("                              V O L C A N O                               \n");
			System.out.print("                                   O F                                    \n");
			System.out.print("                                 H O P E                                  \n");
			System.out.print("                                                                          \n");
			System.out.print("                                                                          \n");
			System.out.print("           *                *      *         *           *                \n");
			System.out.print("           *               *       *        *          *                  \n");
			System.out.print("             *            *       *        *         *                    \n");
			System.out.print("               *          *     *         *         *                     \n");
			System.out.print("                *        *     *          *       *                       \n");
			System.out.print("                 *      *       *        *      *                         \n");
			System.out.print("                  *      *      *       *     *                           \n");
			System.out.print("                    *    *       *     *     *                            \n");
			System.out.print("                     *    *    *  *   *     *                             \n");
			System.out.print("                     *   *  *  *      *   *   ##                          \n");
			System.out.print("                      *  *    *      *   *   #  #  #                      \n");
			System.out.print("                 ##    *  *  *       *  *   #    ## ##                    \n");
			System.out.print("                #   #   * * *       *   * ##         #                    \n");
			System.out.print("               #     #   *  *      *    * #           #                   \n");
			System.out.print("             ##      #    #  *  ##     * #            #                   \n");
			System.out.print("            #         ####  ####  #######              #                  \n");
			System.out.print("           #                                            ###               \n");
			System.out.print("         ##                                                #              \n");
			System.out.print("        #                                                   ###           \n");
			System.out.print("       #                                                       ####       \n");
			System.out.print("      #                                                            #      \n");
			System.out.print("                                                                          \n");
			System.out.print("\t\t      [S] Start\t\t[I] Instructions\n");
			System.out.print("\n____________________________________________________________" +
				"______________\n\n");
			System.out.print("Action: ");
			strInput = kbAlpha.nextLine();
			cStartOption = strInput.charAt(0);
		
			while (cStartOption != 'i' && cStartOption != 'I' && cStartOption != 's' && 
				cStartOption != 'S')
			{
				System.out.print("\nInvalid choice.");
				System.out.print("\n________________________________________________________"
					+ "__________________\n\n");
				System.out.print("                              V O L C A N O                               \n");
				System.out.print("                                   O F                                    \n");
				System.out.print("                                 H O P E                                  \n");
				System.out.print("                                                                          \n");
				System.out.print("                                                                          \n");
				System.out.print("           *                *      *         *           *                \n");
				System.out.print("           *               *       *        *          *                  \n");
				System.out.print("             *            *       *        *         *                    \n");
				System.out.print("               *          *     *         *         *                     \n");
				System.out.print("                *        *     *          *       *                       \n");
				System.out.print("                 *      *       *        *      *                         \n");
				System.out.print("                  *      *      *       *     *                           \n");
				System.out.print("                    *    *       *     *     *                            \n");
				System.out.print("                     *    *    *  *   *     *                             \n");
				System.out.print("                     *   *  *  *      *   *   ##                          \n");
				System.out.print("                      *  *    *      *   *   #  #  #                      \n");
				System.out.print("                 ##    *  *  *       *  *   #    ## ##                    \n");
				System.out.print("                #   #   * * *       *   * ##         #                    \n");
				System.out.print("               #     #   *  *      *    * #           #                   \n");
				System.out.print("             ##      #    #  *  ##     * #            #                   \n");
				System.out.print("            #         ####  ####  #######              #                  \n");
				System.out.print("           #                                            ###               \n");
				System.out.print("         ##                                                #              \n");
				System.out.print("        #                                                   ###           \n");
				System.out.print("       #                                                       ####       \n");
				System.out.print("      #                                                            #      \n");
				System.out.print("                                                                          \n");
				System.out.print("\t\t      [S] Start\t\t[I] Instructions\n");
				System.out.print("\n__________________________________________________________"
					+ "________________\n\n");
				System.out.print("Action: ");
				strInput = kbAlpha.nextLine();
				cStartOption = strInput.charAt(0);
			}

			if (cStartOption == 'i' || cStartOption == 'I')
			{
				cStartOption = instructions();
			}
			
			if (cStartOption == 's' || cStartOption == 'S')
			{
				break;
			}
		}
		
		player.setRoom(1);
		
		// THE GAME LOOP
		while (player.getPlayerState() && !(player.getVictory()))
		{
			iRoom = player.getRoom();
			cAction = player.showMessage(iRoom);
			if (player.getPlayerState() && !(player.getVictory()))
			{
				if (cAction == 'm' || cAction == 'M')
				{
					map(player.getRoom());
					System.out.print("Action: ");
					strInput = kbAlpha.nextLine();
					cAction = strInput.charAt(0);
					while (cAction != 'r' && cAction != 'R')
					{
						System.out.print("\nInvalid choice.\n");
						map(player.getRoom());
						System.out.print("Action: ");
						strInput = kbAlpha.nextLine();
						cAction = strInput.charAt(0);
					}
				}
				else if (cAction == 'e' || cAction == 'E')
				{
					player.showInventory();
					strInput = kbAlpha.nextLine();
					cAction = strInput.charAt(0);
					while (cAction != 'r' && cAction != 'R')
					{
						System.out.print("\nInvalid choice.\n");
						player.showInventory();
						strInput = kbAlpha.nextLine();
						cAction = strInput.charAt(0);
					}
				}
			}
		}
	}//end main(String[])
	
	/**
	 * Method Name: instructions <br>
	 * Method Purpose: Display instructions and backstory of the game <br>
	 *
	 * <hr>
	 * Date created: 3/13/19 <br>
	 * Date last modified: 3/25/19 <br>
	 *
	 * <hr>
	 * Notes on specifications, special algorithms, and assumptions: N/A
	 *   
	 *
	 * <hr>
	 * @return char user selected option
	 */
	
	public static char instructions()
	{
		Scanner kbAlpha = new Scanner(System.in);	//gets alphabetic keyboard input
		Scanner kbNum = new Scanner(System.in);		//gets numeric keyboard input
		
		String strInput;					//user-input before char is determined
		char cStartOption;					//determined choice based on strInput
		
		System.out.print("____________________________________________________________"
			+ "______________\n\n");
		System.out.print("\t\t\t     INSTRUCTIONS\nA pandemic has spread throughout the world, "
			+ "threatening the survival\nof humanity. A non-advanced alien species has "
			+ "made contact with\nEarth, and they display an immunity to the virus. " 
			+ "The aliens want to\noccupy Earth, using our current infrastructure, so "
			+ "they are waiting for\nhumanity to go extinct. However, the CDC has not "
			+ "given up. They have\nlocated a mineral, obsidite, at the base of a "
			+ "volcano that can be used to\nmake a vaccine to fight the virus. The CDC "
			+ "has contacted you to travel\ninto the volcano and extract the obsidite. "
			+ "Unfortunately, the aliens are\nguarding the obsidite in the volcano. "
			+ "You will have to fight your way\nthrough the cave in the volcano to "
			+ "save humanity.\n\n[R] Return to menu");
		System.out.print("\n\n________________________________________________________"
			+ "__________________\n\n");
		
		System.out.print("Action: ");
		strInput = kbAlpha.nextLine();
		cStartOption = strInput.charAt(0);
		while (cStartOption != 'r' && cStartOption != 'R')
		{
			System.out.print("\nInvalid choice.");
			System.out.print("\n____________________________________________________________"
				+ "______________\n\n");
			System.out.print("\t\t\t     INSTRUCTIONS\nA pandemic has spread throughout the world, "
				+ "threatening the survival\nof humanity. A non-advanced alien species has "
				+ "made contact with\nEarth, and they display an immunity to the virus. " 
				+ "The aliens want to\noccupy Earth, using our current infrastructure, so "
				+ "they are waiting for\nhumanity to go extinct. However, the CDC has not "
				+ "given up. They have\nlocated a mineral, obsidite, at the base of a "
				+ "volcano that can be used to\nmake a vaccine to fight the virus. The CDC "
				+ "has contacted you to travel\ninto the volcano and extract the obsidite. "
				+ "Unfortunately, the aliens are\nguarding the obsidite in the volcano. "
				+ "You will have to fight your way\nthrough the cave in the volcano to "
				+ "save humanity.\n\n[R] Return to menu");
			System.out.print("\n\n________________________________________________________"
				+ "__________________\n\n");
			System.out.print("Action: ");
			strInput = kbAlpha.nextLine();
			cStartOption = strInput.charAt(0);
		}
		
		return cStartOption;
		
	}//end instructions()
	
	/**
	 * Method Name: map <br>
	 * Method Purpose: Displays map with current player location <br>
	 *
	 * <hr>
	 * Date created: 3/13/19 <br>
	 * Date last modified: 3/13/19 <br>
	 *
	 * <hr>
	 * Notes on specifications, special algorithms, and assumptions: N/A
	 *   
	 *
	 * <hr>
	 *   @param  location:int current player location
	 */
	 
	public static void map(int location)
	{
		switch(location)
		{	
			case 1:
				System.out.print("________________________________________________________"
					+ "__________________\n\n");
				System.out.print("         -LEGEND-                                                         \n");
				System.out.print("   X = Current Location                                                   \n");	
				System.out.print("   # = Wall                 ############################################  \n");
				System.out.print("   * = Door                 #                               #          #  \n");
				System.out.print("                            #                               #          #  \n");
				System.out.print("  ########################  #                               *          #  \n");
				System.out.print("  #                      #  #                               *          #  \n");
				System.out.print("  #                      #  #                               #          #  \n");
				System.out.print("  #                      #  #                               #          #  \n");
				System.out.print("  #                      #  #                               ############  \n");
				System.out.print("  #                      #  #                               #             \n");
				System.out.print("  #                      #  #                               #             \n");
				System.out.print("  #                      #  ###############   ###############             \n");
				System.out.print("  #                      #                #   #                           \n");
				System.out.print("  #                      #      ###########***###########                 \n");
				System.out.print("  ####################***#      #                       #                 \n");
				System.out.print("                     #   #      #                       #                 \n");
				System.out.print("                     #   #      #                       #                 \n");
				System.out.print("                     #   #      #                       #                 \n");
				System.out.print("                     #   #      #                       #                 \n");
				System.out.print("             #########***#####  #                       ########          \n");
				System.out.print("             #               #  #                       *      #          \n");
				System.out.print("             #               #  #                       *      #          \n");
				System.out.print("             #               #  #                       ####   #          \n");
				System.out.print("  ############               #  #                       #  #   #          \n");
				System.out.print("  #          *               #  #                       #  #   #          \n");
				System.out.print("  #          *               #  ###########***###########  #   #          \n");
				System.out.print("  #   ########               #            #   #          ###***#########  \n");
				System.out.print("  #   #      #               ##############   #          #       #     #  \n");
				System.out.print("  #   #      #               *                #          #       *     #  \n");
				System.out.print("  #   #      #               *                #          #       *     #  \n");
				System.out.print("  # X #      #               ##############***#####      #       #     #  \n");
				System.out.print("  #***#      #               #      #             #      #       #######  \n");
				System.out.print("             #               #      #             #      #       #        \n");
				System.out.print("             #################      #             #      #########        \n");
				System.out.print("                                    ###############                       \n");
				System.out.print("[R] Return\n");
				System.out.print("\n______________________________________________________"
					+ "____________________\n\n"); break;
			case 2:
				System.out.print("________________________________________________________"
					+ "__________________\n\n");
				System.out.print("         -LEGEND-                                                         \n");
				System.out.print("   X = Current Location                                                   \n");	
				System.out.print("   # = Wall                 ############################################  \n");
				System.out.print("   * = Door                 #                               #          #  \n");
				System.out.print("                            #                               #          #  \n");
				System.out.print("  ########################  #                               *          #  \n");
				System.out.print("  #                      #  #                               *          #  \n");
				System.out.print("  #                      #  #                               #          #  \n");
				System.out.print("  #                      #  #                               #          #  \n");
				System.out.print("  #                      #  #                               ############  \n");
				System.out.print("  #                      #  #                               #             \n");
				System.out.print("  #                      #  #                               #             \n");
				System.out.print("  #                      #  ###############   ###############             \n");
				System.out.print("  #                      #                #   #                           \n");
				System.out.print("  #                      #      ###########***###########                 \n");
				System.out.print("  ####################***#      #                       #                 \n");
				System.out.print("                     #   #      #                       #                 \n");
				System.out.print("                     #   #      #                       #                 \n");
				System.out.print("                     #   #      #                       #                 \n");
				System.out.print("                     #   #      #                       #                 \n");
				System.out.print("             #########***#####  #                       ########          \n");
				System.out.print("             #               #  #                       *      #          \n");
				System.out.print("             #               #  #                       *      #          \n");
				System.out.print("             #               #  #                       ####   #          \n");
				System.out.print("  ############               #  #                       #  #   #          \n");
				System.out.print("  #          *      X        #  #                       #  #   #          \n");
				System.out.print("  #          *               #  ###########***###########  #   #          \n");
				System.out.print("  #   ########               #            #   #          ###***#########  \n");
				System.out.print("  #   #      #               ##############   #          #       #     #  \n");
				System.out.print("  #   #      #               *                #          #       *     #  \n");
				System.out.print("  #   #      #               *                #          #       *     #  \n");
				System.out.print("  #   #      #               ##############***#####      #       #     #  \n");
				System.out.print("  #***#      #               #      #             #      #       #######  \n");
				System.out.print("             #               #      #             #      #       #        \n");
				System.out.print("             #################      #             #      #########        \n");
				System.out.print("                                    ###############                       \n");
				System.out.print("[R] Return\n");
				System.out.print("\n______________________________________________________"
					+ "____________________\n\n"); break;
			case 3:
				System.out.print("________________________________________________________"
					+ "__________________\n\n");
				System.out.print("         -LEGEND-                                                         \n");
				System.out.print("   X = Current Location                                                   \n");	
				System.out.print("   # = Wall                 ############################################  \n");
				System.out.print("   * = Door                 #                               #          #  \n");
				System.out.print("                            #                               #          #  \n");
				System.out.print("  ########################  #                               *          #  \n");
				System.out.print("  #                      #  #                               *          #  \n");
				System.out.print("  #                      #  #                               #          #  \n");
				System.out.print("  #                      #  #                               #          #  \n");
				System.out.print("  #                      #  #                               ############  \n");
				System.out.print("  #                      #  #                               #             \n");
				System.out.print("  #                      #  #                               #             \n");
				System.out.print("  #                      #  ###############   ###############             \n");
				System.out.print("  #                      #                #   #                           \n");
				System.out.print("  #                      #      ###########***###########                 \n");
				System.out.print("  ####################***#      #                       #                 \n");
				System.out.print("                     #   #      #                       #                 \n");
				System.out.print("                     #   #      #                       #                 \n");
				System.out.print("                     # X #      #                       #                 \n");
				System.out.print("                     #   #      #                       #                 \n");
				System.out.print("             #########***#####  #                       ########          \n");
				System.out.print("             #               #  #                       *      #          \n");
				System.out.print("             #               #  #                       *      #          \n");
				System.out.print("             #               #  #                       ####   #          \n");
				System.out.print("  ############               #  #                       #  #   #          \n");
				System.out.print("  #          *               #  #                       #  #   #          \n");
				System.out.print("  #          *               #  ###########***###########  #   #          \n");
				System.out.print("  #   ########               #            #   #          ###***#########  \n");
				System.out.print("  #   #      #               ##############   #          #       #     #  \n");
				System.out.print("  #   #      #               *                #          #       *     #  \n");
				System.out.print("  #   #      #               *                #          #       *     #  \n");
				System.out.print("  #   #      #               ##############***#####      #       #     #  \n");
				System.out.print("  #***#      #               #      #             #      #       #######  \n");
				System.out.print("             #               #      #             #      #       #        \n");
				System.out.print("             #################      #             #      #########        \n");
				System.out.print("                                    ###############                       \n");
				System.out.print("[R] Return\n");
				System.out.print("\n______________________________________________________"
					+ "____________________\n\n"); break;
			case 4:
				System.out.print("________________________________________________________"
					+ "__________________\n\n");
				System.out.print("         -LEGEND-                                                         \n");
				System.out.print("   X = Current Location                                                   \n");	
				System.out.print("   # = Wall                 ############################################  \n");
				System.out.print("   * = Door                 #                               #          #  \n");
				System.out.print("                            #                               #          #  \n");
				System.out.print("  ########################  #                               *          #  \n");
				System.out.print("  #                      #  #                               *          #  \n");
				System.out.print("  #                      #  #                               #          #  \n");
				System.out.print("  #                      #  #                               #          #  \n");
				System.out.print("  #                      #  #                               ############  \n");
				System.out.print("  #                      #  #                               #             \n");
				System.out.print("  #                      #  #                               #             \n");
				System.out.print("  #             X        #  ###############   ###############             \n");
				System.out.print("  #                      #                #   #                           \n");
				System.out.print("  #                      #      ###########***###########                 \n");
				System.out.print("  ####################***#      #                       #                 \n");
				System.out.print("                     #   #      #                       #                 \n");
				System.out.print("                     #   #      #                       #                 \n");
				System.out.print("                     #   #      #                       #                 \n");
				System.out.print("                     #   #      #                       #                 \n");
				System.out.print("             #########***#####  #                       ########          \n");
				System.out.print("             #               #  #                       *      #          \n");
				System.out.print("             #               #  #                       *      #          \n");
				System.out.print("             #               #  #                       ####   #          \n");
				System.out.print("  ############               #  #                       #  #   #          \n");
				System.out.print("  #          *               #  #                       #  #   #          \n");
				System.out.print("  #          *               #  ###########***###########  #   #          \n");
				System.out.print("  #   ########               #            #   #          ###***#########  \n");
				System.out.print("  #   #      #               ##############   #          #       #     #  \n");
				System.out.print("  #   #      #               *                #          #       *     #  \n");
				System.out.print("  #   #      #               *                #          #       *     #  \n");
				System.out.print("  #   #      #               ##############***#####      #       #     #  \n");
				System.out.print("  #***#      #               #      #             #      #       #######  \n");
				System.out.print("             #               #      #             #      #       #        \n");
				System.out.print("             #################      #             #      #########        \n");
				System.out.print("                                    ###############                       \n");
				System.out.print("[R] Return\n");
				System.out.print("\n______________________________________________________"
					+ "____________________\n\n"); break;
			case 5:
				System.out.print("________________________________________________________"
					+ "__________________\n\n");
				System.out.print("         -LEGEND-                                                         \n");
				System.out.print("   X = Current Location                                                   \n");	
				System.out.print("   # = Wall                 ############################################  \n");
				System.out.print("   * = Door                 #                               #          #  \n");
				System.out.print("                            #                               #          #  \n");
				System.out.print("  ########################  #                               *          #  \n");
				System.out.print("  #                      #  #                               *          #  \n");
				System.out.print("  #                      #  #                               #          #  \n");
				System.out.print("  #                      #  #                               #          #  \n");
				System.out.print("  #                      #  #                               ############  \n");
				System.out.print("  #                      #  #                               #             \n");
				System.out.print("  #                      #  #                               #             \n");
				System.out.print("  #                      #  ###############   ###############             \n");
				System.out.print("  #                      #                #   #                           \n");
				System.out.print("  #                      #      ###########***###########                 \n");
				System.out.print("  ####################***#      #                       #                 \n");
				System.out.print("                     #   #      #                       #                 \n");
				System.out.print("                     #   #      #                       #                 \n");
				System.out.print("                     #   #      #                       #                 \n");
				System.out.print("                     #   #      #                       #                 \n");
				System.out.print("             #########***#####  #                       ########          \n");
				System.out.print("             #               #  #                       *      #          \n");
				System.out.print("             #               #  #                       *      #          \n");
				System.out.print("             #               #  #                       ####   #          \n");
				System.out.print("  ############               #  #                       #  #   #          \n");
				System.out.print("  #          *               #  #                       #  #   #          \n");
				System.out.print("  #          *               #  ###########***###########  #   #          \n");
				System.out.print("  #   ########               #            #   #          ###***#########  \n");
				System.out.print("  #   #      #               ##############   #          #       #     #  \n");
				System.out.print("  #   #      #               *              X #          #       *     #  \n");
				System.out.print("  #   #      #               *                #          #       *     #  \n");
				System.out.print("  #   #      #               ##############***#####      #       #     #  \n");
				System.out.print("  #***#      #               #      #             #      #       #######  \n");
				System.out.print("             #               #      #             #      #       #        \n");
				System.out.print("             #################      #             #      #########        \n");
				System.out.print("                                    ###############                       \n");
				System.out.print("[R] Return\n");
				System.out.print("\n______________________________________________________"
					+ "____________________\n\n"); break;
			case 6:
				System.out.print("________________________________________________________"
					+ "__________________\n\n");
				System.out.print("         -LEGEND-                                                         \n");
				System.out.print("   X = Current Location                                                   \n");	
				System.out.print("   # = Wall                 ############################################  \n");
				System.out.print("   * = Door                 #                               #          #  \n");
				System.out.print("                            #                               #          #  \n");
				System.out.print("  ########################  #                               *          #  \n");
				System.out.print("  #                      #  #                               *          #  \n");
				System.out.print("  #                      #  #                               #          #  \n");
				System.out.print("  #                      #  #                               #          #  \n");
				System.out.print("  #                      #  #                               ############  \n");
				System.out.print("  #                      #  #                               #             \n");
				System.out.print("  #                      #  #                               #             \n");
				System.out.print("  #                      #  ###############   ###############             \n");
				System.out.print("  #                      #                #   #                           \n");
				System.out.print("  #                      #      ###########***###########                 \n");
				System.out.print("  ####################***#      #                       #                 \n");
				System.out.print("                     #   #      #                       #                 \n");
				System.out.print("                     #   #      #                       #                 \n");
				System.out.print("                     #   #      #                       #                 \n");
				System.out.print("                     #   #      #                       #                 \n");
				System.out.print("             #########***#####  #                       ########          \n");
				System.out.print("             #               #  #                       *      #          \n");
				System.out.print("             #               #  #                       *      #          \n");
				System.out.print("             #               #  #                       ####   #          \n");
				System.out.print("  ############               #  #                       #  #   #          \n");
				System.out.print("  #          *               #  #                       #  #   #          \n");
				System.out.print("  #          *               #  ###########***###########  #   #          \n");
				System.out.print("  #   ########               #            #   #          ###***#########  \n");
				System.out.print("  #   #      #               ##############   #          #       #     #  \n");
				System.out.print("  #   #      #               *                #          #       *     #  \n");
				System.out.print("  #   #      #               *                #          #       *     #  \n");
				System.out.print("  #   #      #               ##############***#####      #       #     #  \n");
				System.out.print("  #***#      #               #      #             #      #       #######  \n");
				System.out.print("             #               #      #        X    #      #       #        \n");
				System.out.print("             #################      #             #      #########        \n");
				System.out.print("                                    ###############                       \n");
				System.out.print("[R] Return\n");
				System.out.print("\n______________________________________________________"
					+ "____________________\n\n"); break;
			case 7:
				System.out.print("________________________________________________________"
					+ "__________________\n\n");
				System.out.print("         -LEGEND-                                                         \n");
				System.out.print("   X = Current Location                                                   \n");	
				System.out.print("   # = Wall                 ############################################  \n");
				System.out.print("   * = Door                 #                               #          #  \n");
				System.out.print("                            #                               #          #  \n");
				System.out.print("  ########################  #                               *          #  \n");
				System.out.print("  #                      #  #                               *          #  \n");
				System.out.print("  #                      #  #                               #          #  \n");
				System.out.print("  #                      #  #                               #          #  \n");
				System.out.print("  #                      #  #                               ############  \n");
				System.out.print("  #                      #  #                               #             \n");
				System.out.print("  #                      #  #                               #             \n");
				System.out.print("  #                      #  ###############   ###############             \n");
				System.out.print("  #                      #                #   #                           \n");
				System.out.print("  #                      #      ###########***###########                 \n");
				System.out.print("  ####################***#      #                       #                 \n");
				System.out.print("                     #   #      #                       #                 \n");
				System.out.print("                     #   #      #                       #                 \n");
				System.out.print("                     #   #      #                       #                 \n");
				System.out.print("                     #   #      #                       #                 \n");
				System.out.print("             #########***#####  #                       ########          \n");
				System.out.print("             #               #  #                       *      #          \n");
				System.out.print("             #               #  #           X           *      #          \n");
				System.out.print("             #               #  #                       ####   #          \n");
				System.out.print("  ############               #  #                       #  #   #          \n");
				System.out.print("  #          *               #  #                       #  #   #          \n");
				System.out.print("  #          *               #  ###########***###########  #   #          \n");
				System.out.print("  #   ########               #            #   #          ###***#########  \n");
				System.out.print("  #   #      #               ##############   #          #       #     #  \n");
				System.out.print("  #   #      #               *                #          #       *     #  \n");
				System.out.print("  #   #      #               *                #          #       *     #  \n");
				System.out.print("  #   #      #               ##############***#####      #       #     #  \n");
				System.out.print("  #***#      #               #      #             #      #       #######  \n");
				System.out.print("             #               #      #             #      #       #        \n");
				System.out.print("             #################      #             #      #########        \n");
				System.out.print("                                    ###############                       \n");
				System.out.print("[R] Return\n");
				System.out.print("\n______________________________________________________"
					+ "____________________\n\n"); break;
			case 8:
				System.out.print("________________________________________________________"
					+ "__________________\n\n");
				System.out.print("         -LEGEND-                                                         \n");
				System.out.print("   X = Current Location                                                   \n");	
				System.out.print("   # = Wall                 ############################################  \n");
				System.out.print("   * = Door                 #                               #          #  \n");
				System.out.print("                            #                               #          #  \n");
				System.out.print("  ########################  #                               *          #  \n");
				System.out.print("  #                      #  #                               *          #  \n");
				System.out.print("  #                      #  #                               #          #  \n");
				System.out.print("  #                      #  #                               #          #  \n");
				System.out.print("  #                      #  #                               ############  \n");
				System.out.print("  #                      #  #                               #             \n");
				System.out.print("  #                      #  #                               #             \n");
				System.out.print("  #                      #  ###############   ###############             \n");
				System.out.print("  #                      #                #   #                           \n");
				System.out.print("  #                      #      ###########***###########                 \n");
				System.out.print("  ####################***#      #                       #                 \n");
				System.out.print("                     #   #      #                       #                 \n");
				System.out.print("                     #   #      #                       #                 \n");
				System.out.print("                     #   #      #                       #                 \n");
				System.out.print("                     #   #      #                       #                 \n");
				System.out.print("             #########***#####  #                       ########          \n");
				System.out.print("             #               #  #                       *      #          \n");
				System.out.print("             #               #  #                       *    X #          \n");
				System.out.print("             #               #  #                       ####   #          \n");
				System.out.print("  ############               #  #                       #  #   #          \n");
				System.out.print("  #          *               #  #                       #  #   #          \n");
				System.out.print("  #          *               #  ###########***###########  #   #          \n");
				System.out.print("  #   ########               #            #   #          ###***#########  \n");
				System.out.print("  #   #      #               ##############   #          #       #     #  \n");
				System.out.print("  #   #      #               *                #          #       *     #  \n");
				System.out.print("  #   #      #               *                #          #       *     #  \n");
				System.out.print("  #   #      #               ##############***#####      #       #     #  \n");
				System.out.print("  #***#      #               #      #             #      #       #######  \n");
				System.out.print("             #               #      #             #      #       #        \n");
				System.out.print("             #################      #             #      #########        \n");
				System.out.print("                                    ###############                       \n");
				System.out.print("[R] Return\n");
				System.out.print("\n______________________________________________________"
					+ "____________________\n\n"); break;
			case 9:
				System.out.print("________________________________________________________"
					+ "__________________\n\n");
				System.out.print("         -LEGEND-                                                         \n");
				System.out.print("   X = Current Location                                                   \n");	
				System.out.print("   # = Wall                 ############################################  \n");
				System.out.print("   * = Door                 #                               #          #  \n");
				System.out.print("                            #                               #          #  \n");
				System.out.print("  ########################  #                               *          #  \n");
				System.out.print("  #                      #  #                               *          #  \n");
				System.out.print("  #                      #  #                               #          #  \n");
				System.out.print("  #                      #  #                               #          #  \n");
				System.out.print("  #                      #  #                               ############  \n");
				System.out.print("  #                      #  #                               #             \n");
				System.out.print("  #                      #  #                               #             \n");
				System.out.print("  #                      #  ###############   ###############             \n");
				System.out.print("  #                      #                #   #                           \n");
				System.out.print("  #                      #      ###########***###########                 \n");
				System.out.print("  ####################***#      #                       #                 \n");
				System.out.print("                     #   #      #                       #                 \n");
				System.out.print("                     #   #      #                       #                 \n");
				System.out.print("                     #   #      #                       #                 \n");
				System.out.print("                     #   #      #                       #                 \n");
				System.out.print("             #########***#####  #                       ########          \n");
				System.out.print("             #               #  #                       *      #          \n");
				System.out.print("             #               #  #                       *      #          \n");
				System.out.print("             #               #  #                       ####   #          \n");
				System.out.print("  ############               #  #                       #  #   #          \n");
				System.out.print("  #          *               #  #                       #  #   #          \n");
				System.out.print("  #          *               #  ###########***###########  #   #          \n");
				System.out.print("  #   ########               #            #   #          ###***#########  \n");
				System.out.print("  #   #      #               ##############   #          #       #     #  \n");
				System.out.print("  #   #      #               *                #          #    X  *     #  \n");
				System.out.print("  #   #      #               *                #          #       *     #  \n");
				System.out.print("  #   #      #               ##############***#####      #       #     #  \n");
				System.out.print("  #***#      #               #      #             #      #       #######  \n");
				System.out.print("             #               #      #             #      #       #        \n");
				System.out.print("             #################      #             #      #########        \n");
				System.out.print("                                    ###############                       \n");
				System.out.print("[R] Return\n");
				System.out.print("\n______________________________________________________"
					+ "____________________\n\n"); break;
			case 10:
				System.out.print("________________________________________________________"
					+ "__________________\n\n");
				System.out.print("         -LEGEND-                                                         \n");
				System.out.print("   X = Current Location                                                   \n");	
				System.out.print("   # = Wall                 ############################################  \n");
				System.out.print("   * = Door                 #                               #          #  \n");
				System.out.print("                            #                               #          #  \n");
				System.out.print("  ########################  #                               *          #  \n");
				System.out.print("  #                      #  #                               *          #  \n");
				System.out.print("  #                      #  #                               #          #  \n");
				System.out.print("  #                      #  #                               #          #  \n");
				System.out.print("  #                      #  #                               ############  \n");
				System.out.print("  #                      #  #                               #             \n");
				System.out.print("  #                      #  #                               #             \n");
				System.out.print("  #                      #  ###############   ###############             \n");
				System.out.print("  #                      #                #   #                           \n");
				System.out.print("  #                      #      ###########***###########                 \n");
				System.out.print("  ####################***#      #                       #                 \n");
				System.out.print("                     #   #      #                       #                 \n");
				System.out.print("                     #   #      #                       #                 \n");
				System.out.print("                     #   #      #                       #                 \n");
				System.out.print("                     #   #      #                       #                 \n");
				System.out.print("             #########***#####  #                       ########          \n");
				System.out.print("             #               #  #                       *      #          \n");
				System.out.print("             #               #  #                       *      #          \n");
				System.out.print("             #               #  #                       ####   #          \n");
				System.out.print("  ############               #  #                       #  #   #          \n");
				System.out.print("  #          *               #  #                       #  #   #          \n");
				System.out.print("  #          *               #  ###########***###########  #   #          \n");
				System.out.print("  #   ########               #            #   #          ###***#########  \n");
				System.out.print("  #   #      #               ##############   #          #       #     #  \n");
				System.out.print("  #   #      #               *                #          #       *  X  #  \n");
				System.out.print("  #   #      #               *                #          #       *     #  \n");
				System.out.print("  #   #      #               ##############***#####      #       #     #  \n");
				System.out.print("  #***#      #               #      #             #      #       #######  \n");
				System.out.print("             #               #      #             #      #       #        \n");
				System.out.print("             #################      #             #      #########        \n");
				System.out.print("                                    ###############                       \n");
				System.out.print("[R] Return\n");
				System.out.print("\n______________________________________________________"
					+ "____________________\n\n"); break;
			case 11:
				System.out.print("________________________________________________________"
					+ "__________________\n\n");
				System.out.print("         -LEGEND-                                                         \n");
				System.out.print("   X = Current Location                                                   \n");	
				System.out.print("   # = Wall                 ############################################  \n");
				System.out.print("   * = Door                 #                               #          #  \n");
				System.out.print("                            #                               #          #  \n");
				System.out.print("  ########################  #                               *          #  \n");
				System.out.print("  #                      #  #                               *          #  \n");
				System.out.print("  #                      #  #                               #          #  \n");
				System.out.print("  #                      #  #               X               #          #  \n");
				System.out.print("  #                      #  #                               ############  \n");
				System.out.print("  #                      #  #                               #             \n");
				System.out.print("  #                      #  #                               #             \n");
				System.out.print("  #                      #  ###############   ###############             \n");
				System.out.print("  #                      #                #   #                           \n");
				System.out.print("  #                      #      ###########***###########                 \n");
				System.out.print("  ####################***#      #                       #                 \n");
				System.out.print("                     #   #      #                       #                 \n");
				System.out.print("                     #   #      #                       #                 \n");
				System.out.print("                     #   #      #                       #                 \n");
				System.out.print("                     #   #      #                       #                 \n");
				System.out.print("             #########***#####  #                       ########          \n");
				System.out.print("             #               #  #                       *      #          \n");
				System.out.print("             #               #  #                       *      #          \n");
				System.out.print("             #               #  #                       ####   #          \n");
				System.out.print("  ############               #  #                       #  #   #          \n");
				System.out.print("  #          *               #  #                       #  #   #          \n");
				System.out.print("  #          *               #  ###########***###########  #   #          \n");
				System.out.print("  #   ########               #            #   #          ###***#########  \n");
				System.out.print("  #   #      #               ##############   #          #       #     #  \n");
				System.out.print("  #   #      #               *                #          #       *     #  \n");
				System.out.print("  #   #      #               *                #          #       *     #  \n");
				System.out.print("  #   #      #               ##############***#####      #       #     #  \n");
				System.out.print("  #***#      #               #      #             #      #       #######  \n");
				System.out.print("             #               #      #             #      #       #        \n");
				System.out.print("             #################      #             #      #########        \n");
				System.out.print("                                    ###############                       \n");
				System.out.print("[R] Return\n");
				System.out.print("\n______________________________________________________"
					+ "____________________\n\n"); break;
			case 12:
				System.out.print("________________________________________________________"
					+ "__________________\n\n");
				System.out.print("         -LEGEND-                                                         \n");
				System.out.print("   X = Current Location                                                   \n");	
				System.out.print("   # = Wall                 ############################################  \n");
				System.out.print("   * = Door                 #                               #          #  \n");
				System.out.print("                            #                               #      X   #  \n");
				System.out.print("  ########################  #                               *          #  \n");
				System.out.print("  #                      #  #                               *          #  \n");
				System.out.print("  #                      #  #                               #          #  \n");
				System.out.print("  #                      #  #                               #          #  \n");
				System.out.print("  #                      #  #                               ############  \n");
				System.out.print("  #                      #  #                               #             \n");
				System.out.print("  #                      #  #                               #             \n");
				System.out.print("  #                      #  ###############   ###############             \n");
				System.out.print("  #                      #                #   #                           \n");
				System.out.print("  #                      #      ###########***###########                 \n");
				System.out.print("  ####################***#      #                       #                 \n");
				System.out.print("                     #   #      #                       #                 \n");
				System.out.print("                     #   #      #                       #                 \n");
				System.out.print("                     #   #      #                       #                 \n");
				System.out.print("                     #   #      #                       #                 \n");
				System.out.print("             #########***#####  #                       ########          \n");
				System.out.print("             #               #  #                       *      #          \n");
				System.out.print("             #               #  #                       *      #          \n");
				System.out.print("             #               #  #                       ####   #          \n");
				System.out.print("  ############               #  #                       #  #   #          \n");
				System.out.print("  #          *               #  #                       #  #   #          \n");
				System.out.print("  #          *               #  ###########***###########  #   #          \n");
				System.out.print("  #   ########               #            #   #          ###***#########  \n");
				System.out.print("  #   #      #               ##############   #          #       #     #  \n");
				System.out.print("  #   #      #               *                #          #       *     #  \n");
				System.out.print("  #   #      #               *                #          #       *     #  \n");
				System.out.print("  #   #      #               ##############***#####      #       #     #  \n");
				System.out.print("  #***#      #               #      #             #      #       #######  \n");
				System.out.print("             #               #      #             #      #       #        \n");
				System.out.print("             #################      #             #      #########        \n");
				System.out.print("                                    ###############                       \n");
				System.out.print("[R] Return\n");
				System.out.print("\n______________________________________________________"
					+ "____________________\n\n");
		}//end switch(location)
		
	}//end map(int)
		
}//end TheGame

/**
 * Class Name: Player <br>
 * Class Purpose: Provide attributes and behaviors for the Player <br>
 *
 * <hr>
 * Date created: 3/16/19 <br>
 * Date last modified: 3/25/19
 * @author Brett Hamilton
 */
 
class Player
{
	private int iHP;								//player hitpoints level
	private String strEquippedWeapon;				//current equipped weapon
	private int iLocation;							//player location
	private ArrayList<String> inventory = new ArrayList<String>();		//inventory
	private ArrayList<Integer> hasTravelled = new ArrayList<Integer>();		//locations visited
	private boolean blnPlayerState;					//determines if player is alive
	private boolean blnPlayerVictory;				//determines if player has won
	private int iCurrentRoom;				//holds current player room
	private int iNextRoom;					//holds player's next room
	private int iMaxDmg;					//holds current max damage
	private int iMinDmg;					//holds current min damage
	private int iDmgTaken;					//holds damage incurred
	private int iDmgDealt;					//holds damage inflicted
	private int iAlienHP;					//holds alien hitpoints level
	private int iAlienMaxDmg;				//holds alien max damage
	private int iAlienMinDmg;				//holds alien min damage
	private Random random;
	private boolean blnSearchedDirt;		//tracks if player has searched dirt
	private boolean blnSearchedBarrels;		//tracks if player has searched barrels
	
	
	
	/**
	 * Method Name: Player <br>
	 * Method Purpose: Constuctor for player <br>
	 *
	 * <hr>
	 * Date created: 3/16/19 <br>
	 * Date last modified: 3/21/19 <br>
	 *
	 * <hr>
	 * Notes on specifications, special algorithms, and assumptions: N/A
	 *   
	 *
	 * <hr>
	 */
	
	Player()
	{
		iHP = 30;
		strEquippedWeapon = "None";
		iLocation = 1;
		blnPlayerState = true;
		blnPlayerVictory = false;
		blnSearchedDirt = false;
		blnSearchedBarrels = false;
		
	}//end Player()
	
	/**
	 * Method Name: getHP <br>
	 * Method Purpose: Gets current player hitpoints <br>
	 *
	 * <hr>
	 * Date created: 3/16/19 <br>
	 * Date last modified: 3/16/19 <br>
	 *
	 * <hr>
	 * Notes on specifications, special algorithms, and assumptions: N/A
	 *   
	 *
	 * <hr>
	 *   @return an int containing player's hitpoints
	 */
	
	public int getHP()
	{
		return iHP;
		
	}//end getHP()
	
	/**
	 * Method Name: setHP <br>
	 * Method Purpose: Sets player's hitpoints <br>
	 *
	 * <hr>
	 * Date created: 3/16/19 <br>
	 * Date last modified: 3/16/19 <br>
	 *
	 * <hr>
	 * Notes on specifications, special algorithms, and assumptions: N/A
	 *   
	 *
	 * <hr>
	 *   @param  h:int what hitpoints should be set to
	 */
	
	public void setHP(int h)
	{
		iHP = h;
		
	}//end setHP(int)
	
	/**
	 * Method Name: getEquippedWeapon <br>
	 * Method Purpose: Gets player's currently equipped weapon <br>
	 *
	 * <hr>
	 * Date created: 3/16/19 <br>
	 * Date last modified: 3/16/19 <br>
	 *
	 * <hr>
	 * Notes on specifications, special algorithms, and assumptions: N/A
	 *   
	 *
	 * <hr>
	 *   @return a String containing the currently equipped weapon
	 */
	
	public String getEquippedWeapon()
	{
		return strEquippedWeapon;
		
	}//end getEquippedWeapon()
	
	/**
	 * Method Name: setEquippedWeapon <br>
	 * Method Purpose: Sets player's equipped weapon <br>
	 *
	 * <hr>
	 * Date created: 3/16/19 <br>
	 * Date last modified: 3/16/19 <br>
	 *
	 * <hr>
	 * Notes on specifications, special algorithms, and assumptions: N/A
	 *   
	 *
	 * <hr>
	 *   @param  w:String the name of the weapon to be currently equipped
	 */
	
	public void setEquippedWeapon(String w)
	{
		strEquippedWeapon = w;
		
	}//end setEquippedWeapon(String)
	 
	/**
	 * Method Name: getPlayerState <br>
	 * Method Purpose: Gets the status of if player is alive or not <br>
	 *
	 * <hr>
	 * Date created: 3/20/19 <br>
	 * Date last modified: 3/20/19 <br>
	 *
	 * <hr>
	 * Notes on specifications, special algorithms, and assumptions: N/A
	 *   
	 *
	 * <hr>
	 *   @return a boolean that is true if player is alive and false if not
	 */
	
	public boolean getPlayerState()
	{
		return blnPlayerState;
		
	}//end getPlayerState()
	
	/**
	 * Method Name: setPlayerState <br>
	 * Method Purpose: Sets if player is alive or not <br>
	 *
	 * <hr>
	 * Date created: 3/21/19 <br>
	 * Date last modified: 3/21/19 <br>
	 *
	 * <hr>
	 * Notes on specifications, special algorithms, and assumptions: N/A
	 *   
	 *
	 * <hr>
	 *   @param  state:boolean true if player is alive
	 */
	
	public void setPlayerState(boolean state)
	{
		this.blnPlayerState = state;
		
	}//end setPlayerState(boolean)
	
	/**
	 * Method Name: getVictory <br>
	 * Method Purpose: Gets if player has won or not <br>
	 *
	 * <hr>
	 * Date created: 3/20/19 <br>
	 * Date last modified: 3/20/19 <br>
	 *
	 * <hr>
	 * Notes on specifications, special algorithms, and assumptions: N/A
	 *   
	 *
	 * <hr>
	 *   @return a boolean that is true if player has won
	 */
	
	public boolean getVictory()
	{
		return blnPlayerVictory;
		
	}//end getVictory()
	
	/**
	 * Method Name: showInventory <br>
	 * Method Purpose: Displays player's current inventory <br>
	 *
	 * <hr>
	 * Date created: 3/16/19 <br>
	 * Date last modified: 3/16/19 <br>
	 *
	 * <hr>
	 * Notes on specifications, special algorithms, and assumptions: Will always show at 
	 *   least "Dagger"
	 *
	 * <hr>
	 */
	
	public void showInventory()
	{
		System.out.print("________________________________________________________"
			+ "__________________\n\n");
		System.out.print("\t\t\t\tInventory");
		
		for (String s: inventory)
		{
			System.out.print("\n" + s);
		}
		
		System.out.print("\n\n[R] Return\n");
		System.out.print("________________________________________________________"
			+ "__________________\n\n");
		System.out.print("Action: ");
		
	}//end showInventory()
	
	/**
	 * Method Name: evaluateInventory <br>
	 * Method Purpose: Checks if item is in inventory <br>
	 *
	 * <hr>
	 * Date created: 3/20/19 <br>
	 * Date last modified: 3/20/19 <br>
	 *
	 * <hr>
	 * Notes on specifications, special algorithms, and assumptions: N/A
	 *   
	 *
	 * <hr>
	 *   @param  s:String item that is checked if in inventory or not
	 *   @return a boolean that is true if item is in inventory
	 */
	
	public boolean evaluateInventory(String s)
	{
		boolean blnResult;						//if item is in inventory or not
		
		blnResult = inventory.contains(s);
		
		return blnResult;
		
	}//end evaluateInventory(String)
	
	/**
	 * Method Name: evaluateTravelled <br>
	 * Method Purpose: Checks if player has travelled to a certain room <br>
	 *
	 * <hr>
	 * Date created: 3/20/19 <br>
	 * Date last modified: 3/20/19 <br>
	 *
	 * <hr>
	 * Notes on specifications, special algorithms, and assumptions: N/A
	 *   
	 *
	 * <hr>
	 *   @param  i:int location that is checked
	 *   @return a boolean that is true if player has travelled to location
	 */
	
	public boolean evaluateTravelled(int i)
	{
		boolean blnResult;						//if player has travelled here or not
		
		blnResult = hasTravelled.contains(i);
		
		return blnResult;
		
	}//end evaluateTravelled(int)
	
	/**
	 * Method Name: getRoom <br>
	 * Method Purpose: Gets the player's current room location <br>
	 *
	 * <hr>
	 * Date created: 3/19/19 <br>
	 * Date last modified: 3/19/19 <br>
	 *
	 * <hr>
	 * Notes on specifications, special algorithms, and assumptions: N/A
	 *   
	 *
	 * <hr>
	 *   @return an int that indicates what room player is in
	 */
	
	public int getRoom()
	{	
		return iCurrentRoom;
		
	}//end getRoom()
	
	/**
	 * Method Name: setRoom <br>
	 * Method Purpose: Sets what room player is currently in <br>
	 *
	 * <hr>
	 * Date created: 3/19/19 <br>
	 * Date last modified: 3/19/19 <br>
	 *
	 * <hr>
	 * Notes on specifications, special algorithms, and assumptions: N/A
	 *   
	 *
	 * <hr>
	 *   @param  next:int room that is to be set as player's current room
	 */
	 
	public void setRoom(int next)
	{
		iCurrentRoom = next;
		
	}//end setRoom	
	
	/**
	 * Method Name: showMessage <br>
	 * Method Purpose: Shows message based on user's decisions and input <br>
	 *
	 * <hr>
	 * Date created: 3/20/19 <br>
	 * Date last modified: 3/24/19 <br>
	 *
	 * <hr>
	 * Notes on specifications, special algorithms, and assumptions: Shows message,
	 *   validates input, and performs actions based on those choices.
	 *
	 * <hr>
	 *   @param  room:int room that player is in
	 *   @return a char that represents player's input choice
	 */
	
	public char showMessage(int room)
	{
		Scanner kbAlpha = new Scanner(System.in);			//gets input
		
		String strInput;						//holds player input
		char cAction;							//player choice of action
		
		cAction = 'x';
		
		switch (room)
		{
			case 1:
				if (evaluateInventory("Dagger") && evaluateTravelled(1))
				{
					System.out.print("____________________________________________________________"
						+ "______________\n\n");
					System.out.print("There is no turning back now. You must proceed through" +
						" the door in front\nof you.\n\n");
					System.out.print("[A] Open the door\n\n");
					System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
						getEquippedWeapon());
					System.out.print("\n__________________________________________________________"
						+ "________________\n\n");
					System.out.print("Action: ");
					strInput = kbAlpha.nextLine();
					cAction = strInput.charAt(0);
					
					while (cAction != 'a' && cAction != 'A' && cAction != 'e' && 
						cAction != 'E' && cAction != 'm' && cAction != 'M')
					{
						System.out.print("\nInvalid choice.");
						System.out.print("\n________________________________________________________"
							+ "__________________\n\n");
						System.out.print("There is no turning back now. You must proceed through" +
							" the door in front of you.\n\n");
						System.out.print("[A] Open the door\n\n");
						System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
							getEquippedWeapon());
						System.out.print("\n__________________________________________________________"
							+ "________________\n\n");
						System.out.print("Action: ");
						strInput = kbAlpha.nextLine();
						cAction = strInput.charAt(0);
					}
					
					if (cAction == 'a' || cAction == 'A')
					{
						setRoom(2);
					}
					
				}
				else if (evaluateTravelled(1))
				{
					//adds "Dagger" to inventory
					this.inventory.add("Dagger");
					this.setEquippedWeapon("Dagger");
					System.out.print("____________________________________________________________"
						+ "______________\n\n");
					System.out.print("You found an old backpack! This will help you carry " +
						"items. Inside the\nbackpack you find a rusty dagger. Not much, but " +
						"better than your fists,\nright?\n\n");
					System.out.print("[A] Continue\n\n");
					System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
						getEquippedWeapon());
					System.out.print("\n__________________________________________________________"
						+ "________________\n\n");
					System.out.print("Action: ");
					strInput = kbAlpha.nextLine();
					cAction = strInput.charAt(0);
					while (cAction != 'a' && cAction != 'A' && cAction != 'e' && 
						cAction != 'E' && cAction != 'm' && cAction != 'M')
					{
						System.out.print("\nInvalid choice.");
						System.out.print("\n________________________________________________________"
							+ "__________________\n\n");
						System.out.print("You found an old backpack! This will help you carry " +
							"items. Inside the\nbackpack you find a rusty dagger. Not much, but " +
							"better than your fists,\nright?\n\n");
						System.out.print("[A] Continue\n\n");
						System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
						getEquippedWeapon());
						System.out.print("\n__________________________________________________________"
							+ "________________\n\n");
						System.out.print("Action: ");
						strInput = kbAlpha.nextLine();
						cAction = strInput.charAt(0);
					}
				}
				else
				{
					System.out.print("____________________________________________________________"
						+ "______________\n\n");
					System.out.print("You find yourself in a dark hallway. Your back is against " +
						"the iron door\nthat you entered. You see something in the floor at the " +
						"end of the\nhallway just before a right turn.\n\n");
					System.out.print("[A] Inspect what is in the floor at the end of the" +
						" hallway\n\n");
					System.out.print("\t[M] Map\n\nHP: " + getHP() + 
						"\nWeapon: " + getEquippedWeapon());
					System.out.print("\n__________________________________________________________"
						+ "________________\n\n");
					System.out.print("Action: ");
					strInput = kbAlpha.nextLine();
					cAction = strInput.charAt(0);
					
					while (cAction != 'a' && cAction != 'A' && cAction != 'm' && 
						cAction != 'M')
					{
						System.out.print("\nInvalid choice.");
						System.out.print("\n________________________________________________________"
							+ "__________________\n\n");
						System.out.print("You find yourself in a dark hallway. Your back is against " +
							"the iron door\nthat you entered. You see something in the floor at the " +
							"end of the\nhallway just before a right turn.\n\n");
						System.out.print("[A] Inspect what is in the floor at the end of" +
							" the hallway\n\n");
						System.out.print("\t[M] Map\n\nHP: " + getHP() + 
							"\nWeapon: " + getEquippedWeapon());
						System.out.print("\n__________________________________________________________"
							+ "________________\n\n");
						System.out.print("Action: ");
						strInput = kbAlpha.nextLine();
						cAction = strInput.charAt(0);
					}
					
					if (cAction == 'a' || cAction == 'A')
					{
						this.hasTravelled.add(1);
					}
				}
				break;					
			case 2:
				//if player has visited room 2 before
				if (evaluateTravelled(2) && !(evaluateInventory("Steampunk 4-Barrel Pistol"))
					&& evaluateTravelled(3))
				{
					System.out.print("____________________________________________________________"
						+ "______________\n\n");
					System.out.print("You enter a familiar room... the eastern door is still "
						+ "guarded by an alien.\n\n");
					System.out.print("[A] Open north door\n[B] Fight alien\n\n");
					System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
						getEquippedWeapon());
					System.out.print("\n__________________________________________________________"
						+ "________________\n\n");
					System.out.print("Action: ");
					strInput = kbAlpha.nextLine();
					cAction = strInput.charAt(0);
					while (cAction != 'a' && cAction != 'A' && cAction != 'b' && cAction != 'B'
						&& cAction != 'e' && cAction != 'E' && cAction != 'm' && 
						cAction != 'M')
					{
						System.out.print("\nInvalid choice.");
						System.out.print("\n________________________________________________________"
							+ "__________________\n\n");
						System.out.print("You enter a familiar room... the eastern door is still "
							+ "guarded by an alien.\n\n");
						System.out.print("[A] Open north door\n[B] Fight alien\n\n");
						System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
							getEquippedWeapon());
						System.out.print("\n__________________________________________________________"
							+ "________________\n\n");
						System.out.print("Action: ");
						strInput = kbAlpha.nextLine();
						cAction = strInput.charAt(0);
					}
					
					if (cAction == 'a' || cAction == 'A')
					{
						setRoom(3);
					}
					
					if (cAction == 'b' || cAction == 'B')
					{
						fight("alien1");
					}
				}
				// Opens door
				else if (evaluateInventory("Steampunk 4-Barrel Pistol")
					&& evaluateInventory("Iron Key"))
				{
					System.out.print("____________________________________________________________"
						+ "______________\n\n");
					System.out.print("Now that nothing stands in your way... it looks " +
						"like that key you found\nis about to come in handy!\n\n");
					System.out.print("[A] Use Iron Key on the iron door\n\n");
					System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
						getEquippedWeapon());
					System.out.print("\n__________________________________________________________"
						+ "________________\n\n");
					System.out.print("Action: ");
					strInput = kbAlpha.nextLine();
					cAction = strInput.charAt(0);
					
					while (cAction != 'a' && cAction != 'A' && cAction != 'e' && 
						cAction != 'E' && cAction != 'm' && cAction != 'M')
					{
						System.out.print("\nInvalid choice.");
						System.out.print("\n________________________________________________________"
							+ "__________________\n\n");
						System.out.print("You enter a familiar room... the eastern door is still "
							+ "guarded by an alien.\n\n");
						System.out.print("[A] Open north door\n[B] Fight alien\n\n");
						System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
							getEquippedWeapon());
						System.out.print("\n__________________________________________________________"
							+ "________________\n\n");
						System.out.print("Action: ");
						strInput = kbAlpha.nextLine();
						cAction = strInput.charAt(0);
					}
					
					if (cAction == 'a' || cAction == 'A')
					{
						setRoom(5);
						inventory.remove(new String("Iron Key"));
					}					
				}
				//player can't open door without Iron Key
				else if (evaluateInventory("Steampunk 4-Barrel Pistol") && 
					!(evaluateInventory("Iron Key")))
				{
					System.out.print("____________________________________________________________"
						+ "______________\n\n");
					System.out.print("With the alien out of the way, you attempt to open " +
						"the door. Locked!\nThere has to be a key around here somewhere... " +
						"\n\n");
					System.out.print("[A] Open north door\n\n");
					System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
						getEquippedWeapon());
					System.out.print("\n__________________________________________________________"
						+ "________________\n\n");
					System.out.print("Action: ");
					strInput = kbAlpha.nextLine();
					cAction = strInput.charAt(0);
					
					while (cAction != 'a' && cAction != 'A' && cAction != 'e' && 
						cAction != 'E' && cAction != 'm' && cAction != 'M')
					{
						System.out.print("\nInvalid choice.");
						System.out.print("\n________________________________________________________"
							+ "__________________\n\n");
						System.out.print("With the alien out of the way, you attempt to open " +
							"the door. Locked!\nThere has to be a key around here somewhere... " +
							"\n\n");
						System.out.print("[A] Open north door\n\n");
						System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
							getEquippedWeapon());
						System.out.print("\n__________________________________________________________"
							+ "________________\n\n");
						System.out.print("Action: ");
						strInput = kbAlpha.nextLine();
						cAction = strInput.charAt(0);
					}
					
					if (cAction == 'a' || cAction == 'A')
					{
						setRoom(3);
					}
				}
				//player first time entering
				else
				{
					this.hasTravelled.add(2);
					System.out.print("____________________________________________________________"
						+ "______________\n\n");
					System.out.print("You slowly open the door to a large room. Looking " +
						"around, you can see two\ndoors: one to the north and one to the " +
						"east. Guarding the eastern door is\nan alien!\n\n");
					System.out.print("[A] Open north door\n[B] Fight alien\n\n");
					System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
						getEquippedWeapon());
					System.out.print("\n__________________________________________________________"
						+ "________________\n\n");
					System.out.print("Action: ");
					strInput = kbAlpha.nextLine();
					cAction = strInput.charAt(0);
					
					while (cAction != 'a' && cAction != 'A' && cAction != 'b' && cAction != 'B'
						&& cAction != 'e' && cAction != 'E' && cAction != 'm' && 
						cAction != 'M')
					{
						System.out.print("\nInvalid choice.");
						System.out.print("\n________________________________________________________"
							+ "__________________\n\n");
						System.out.print("You slowly open the door to a large room. Looking " +
							"around, you can see two\ndoors: one to the north and one to the " +
							"east. Guarding the eastern door is\nan alien!\n\n");
						System.out.print("[A] Open north door\n[B] Fight alien\n\n");
						System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
						getEquippedWeapon());
						System.out.print("\n__________________________________________________________"
							+ "________________\n\n");
						System.out.print("Action: ");
						strInput = kbAlpha.nextLine();
						cAction = strInput.charAt(0);
					}
					
					if (cAction == 'a' || cAction == 'A')
					{
						setRoom(3);
					}
					
					if (cAction == 'b' || cAction == 'B')
					{
						fight("alien1");
					}
				}
				break;
			case 3:
				//player has been here before
				if (evaluateTravelled(3))
				{
					System.out.print("____________________________________________________________"
						+ "______________\n\n");
					System.out.print("You have travelled this hallway before. Which way " +
						"would you like to go\nnext?\n\n");
					System.out.print("[A] Through the northern door\n[B] Through the " +
						"southern door\n\n");
					System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
						getEquippedWeapon());
					System.out.print("\n__________________________________________________________"
						+ "________________\n\n");
					System.out.print("Action: ");
					strInput = kbAlpha.nextLine();
					cAction = strInput.charAt(0);
					while (cAction != 'a' && cAction != 'A' && cAction != 'b' && cAction != 'B'
						&& cAction != 'e' && cAction != 'E' && cAction != 'm' && 
						cAction != 'M')
					{
						System.out.print("\nInvalid choice.");
						System.out.print("\n________________________________________________________"
							+ "__________________\n\n");
						System.out.print("You have travelled this hallway before. Which way " +
							"would you like to go\nnext?\n\n");
						System.out.print("[A] Through the northern door\n[B] Through the " +
							"southern door\n\n");
						System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
						getEquippedWeapon());
						System.out.print("\n__________________________________________________________"
							+ "________________\n\n");
						System.out.print("Action: ");
						strInput = kbAlpha.nextLine();
						cAction = strInput.charAt(0);
					}
					
					if (cAction == 'a' || cAction == 'A')
					{
						setRoom(4);
					}
					
					if (cAction == 'b' || cAction == 'B')
					{
						setRoom(2);
					}
				}
				//first time player enters room
				else if (!(evaluateTravelled(3)))
				{
					System.out.print("____________________________________________________________"
						+ "______________\n\n");
					System.out.print("You walk north and open the door, revealing a hallway." +
						" It does not appear\nto have anything interesting inside. " +
						"There is another door at the end of\nthe hallway to the north.\n\n");
					System.out.print("[A] Continue through the door at the end of the " +
						"hallway\n[B] Return to previous room\n\n");
					System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
						getEquippedWeapon());
					System.out.print("\n__________________________________________________________"
						+ "________________\n\n");
					System.out.print("Action: ");
					strInput = kbAlpha.nextLine();
					cAction = strInput.charAt(0);
					
					while (cAction != 'a' && cAction != 'A' && cAction != 'b' && cAction != 'B'
						&& cAction != 'e' && cAction != 'E' && cAction != 'm' && 
						cAction != 'M')
					{
						System.out.print("\nInvalid choice.");
						System.out.print("\n________________________________________________________"
							+ "__________________\n\n");
						System.out.print("You walk north and open the door, revealing a hallway." +
							" It does not appear\nto have anything interesting inside. " +
							"There is another door at the end of\nthe hallway to the north.\n\n");
						System.out.print("[A] Continue through the door at the end of the " +
							"hallway\n[B] Return to previous room\n\n");
						System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
							getEquippedWeapon());
						System.out.print("\n__________________________________________________________"
							+ "________________\n\n");
						System.out.print("Action: ");
						strInput = kbAlpha.nextLine();
						cAction = strInput.charAt(0);
					}
					
					if (cAction == 'a' || cAction == 'A')
					{
						setRoom(4);
						this.hasTravelled.add(3);
					}
					else if (cAction == 'b' || cAction == 'B')
					{
						setRoom(2);
						this.hasTravelled.add(3);
					}
				}
				break;
			case 4:
				//player has found Iron Key
				if (evaluateInventory("Iron Key"))
				{
					System.out.print("____________________________________________________________"
						+ "______________\n\n");
					System.out.print("There is nothing else interesting in this room.\n\n");
					System.out.print("[A] Exit the way you entered\n\n");
					System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
						getEquippedWeapon());
					System.out.print("\n__________________________________________________________"
						+ "________________\n\n");
					System.out.print("Action: ");
					strInput = kbAlpha.nextLine();
					cAction = strInput.charAt(0);
					
					while (cAction != 'a' && cAction != 'A' && cAction != 'e' && cAction != 'E'
						&& cAction != 'm' && cAction != 'M')
					{
						System.out.print("\nInvalid choice.");
						System.out.print("\n________________________________________________________"
							+ "__________________\n\n");
						System.out.print("There is nothing else interesting in this room.\n\n");
						System.out.print("[A] Exit the way you entered\n\n");
						System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
							getEquippedWeapon());
						System.out.print("\n__________________________________________________________"
							+ "________________\n\n");
						System.out.print("Action: ");
						strInput = kbAlpha.nextLine();
						cAction = strInput.charAt(0);
					}
					
					if (cAction == 'a' || cAction == 'A')
					{
						setRoom(3);
					}
				}
				//player does not have shovel but has searched dirt
				else if (!(evaluateInventory("Shovel")) && blnSearchedDirt && 
					!blnSearchedBarrels)
				{
					System.out.print("____________________________________________________________"
						+ "______________\n\n");
					System.out.print("A mound of dirt. It looks like something was burried, " +
						"but you recently\nreceived a manicure and would prefer not to dig " +
						"with your hands.\n\n");
					System.out.print("[A] Inspect dirt mound\n[B] Search barrels\n[C] Exit " +
						"the way you entered\n\n");
					System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
						getEquippedWeapon());
					System.out.print("\n__________________________________________________________"
						+ "________________\n\n");
					System.out.print("Action: ");
					strInput = kbAlpha.nextLine();
					cAction = strInput.charAt(0);
					
					while (cAction != 'a' && cAction != 'A' && cAction != 'b' && cAction != 'B'
						&& cAction != 'c' && cAction != 'C' && cAction != 'e' && cAction != 'E'
						&& cAction != 'm' && cAction != 'M')
					{
						System.out.print("\nInvalid choice.");
						System.out.print("\n________________________________________________________"
							+ "__________________\n\n");
						System.out.print("A mound of dirt. It looks like something was burried, " +
							"but you recently\nreceived a manicure and would prefer not to dig " +
							"with your hands.\n\n");
						System.out.print("[A] Inspect dirt mound\n[B] Search barrels\n[C] Exit " +
							"the way you entered\n\n");
						System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
							getEquippedWeapon());
						System.out.print("\n__________________________________________________________"
							+ "________________\n\n");
						System.out.print("Action: ");
						strInput = kbAlpha.nextLine();
						cAction = strInput.charAt(0);
					}
					
					if (cAction == 'b' || cAction == 'B')
					{
						this.inventory.add("Shovel");
						this.blnSearchedBarrels = true;
						
					}
					
					if (cAction == 'c' || cAction == 'C')
					{
						setRoom(3);
					}
				}
				//player has shovel but not iron key
				else if (evaluateInventory("Shovel") && !(evaluateInventory("Iron Key"))
					&& !(evaluateTravelled(4)) && blnSearchedBarrels)
				{
					System.out.print("____________________________________________________________"
						+ "______________\n\n");
					System.out.print("The barrels contained a shovel. What would you like "
						+ "to do now?\n\n");
					System.out.print("[A] Inspect dirt mound\n[B] Exit the way you entered\n\n");
					System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
						getEquippedWeapon());
					System.out.print("\n__________________________________________________________"
						+ "________________\n\n");
					System.out.print("Action: ");
					strInput = kbAlpha.nextLine();
					cAction = strInput.charAt(0);
					
					while (cAction != 'a' && cAction != 'A' && cAction != 'b' && cAction != 'B'
						&& cAction != 'e' && cAction != 'E' && cAction != 'm' && 
						cAction != 'M')
					{
						System.out.print("\nInvalid choice.");
						System.out.print("\n________________________________________________________"
							+ "__________________\n\n");
						System.out.print("The barrels contained a shovel. What would you like "
							+ "to do now?\n\n");
						System.out.print("[A] Inspect dirt mound\n[B] Exit the way you entered\n\n");
						System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
						getEquippedWeapon());
						System.out.print("\n__________________________________________________________"
							+ "________________\n\n");
						System.out.print("Action: ");
						strInput = kbAlpha.nextLine();
						cAction = strInput.charAt(0);
					}
					
					if (cAction == 'b' || cAction == 'B')
					{
						setRoom(3);
					}
					else if (cAction == 'a' || cAction == 'A')
					{
						this.hasTravelled.add(4);
						this.blnSearchedDirt = true;
					}
				}
				//player digs dirt to find Iron Key
				else if (evaluateInventory("Shovel") && evaluateTravelled(4) && blnSearchedDirt
					&& !(evaluateInventory("Iron Key")))
				{
					this.inventory.add("Iron Key");
					System.out.print("____________________________________________________________"
						+ "______________\n\n");
					System.out.print("You use the shovel to dig into the dirt mound. You " +
						"found an iron key!\n\n");
					System.out.print("[A] Exit the way you entered\n\n");
					System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
						getEquippedWeapon());
					System.out.print("\n__________________________________________________________"
						+ "________________\n\n");
					System.out.print("Action: ");
					strInput = kbAlpha.nextLine();
					cAction = strInput.charAt(0);
					while (cAction != 'a' && cAction != 'A' && cAction != 'e' && cAction != 'E'
						&& cAction != 'm' && cAction != 'M')
					{
						System.out.print("\nInvalid choice.");
						System.out.print("\n________________________________________________________"
							+ "__________________\n\n");
						System.out.print("You use the shovel to dig into the dirt mound. You " +
							"found an iron key!\n\n");
						System.out.print("[A] Exit the way you entered\n\n");
						System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
							getEquippedWeapon());
						System.out.print("\n__________________________________________________________"
							+ "________________\n\n");
						System.out.print("Action: ");
						strInput = kbAlpha.nextLine();
						cAction = strInput.charAt(0);
					}
					
					if (cAction == 'a' || cAction == 'A')
					{
						setRoom(3);
					}
				}
				//first time player enters
				else if (!(evaluateInventory("Shovel")) && !(evaluateTravelled(4)) &&
					!(evaluateInventory("Iron Key")))
				{
					System.out.print("____________________________________________________________"
						+ "______________\n\n");
					System.out.print("You open the door to another large room. In one " + 
						"corner you see a few\nbarrels. There is an odd looking dirt mound " +
						"in the center of the room. No\naliens in sight, phew!\n\n");
					System.out.print("[A] Inspect dirt mound\n[B] Search barrels\n[C] Exit " +
						"the way you entered\n\n");
					System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
						getEquippedWeapon());
					System.out.print("\n__________________________________________________________"
						+ "________________\n\n");
					System.out.print("Action: ");
					strInput = kbAlpha.nextLine();
					cAction = strInput.charAt(0);
					while (cAction != 'a' && cAction != 'A' && cAction != 'b' && cAction != 'B'
						&& cAction != 'c' && cAction != 'C' && cAction != 'e' && cAction != 'E'
						&& cAction != 'm' && cAction != 'M')
					{
						System.out.print("\nInvalid choice.");
						System.out.print("\n________________________________________________________"
							+ "__________________\n\n");
						System.out.print("You open the door to another large room. In one " + 
							"corner you see a few\nbarrels. There is an odd looking dirt mound " +
							"in the center of the room. No\naliens in sight, phew!\n\n");
						System.out.print("[A] Inspect dirt mound\n[B] Search barrels\n[C] Exit " +
							"the way you entered\n\n");
						System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
						getEquippedWeapon());
						System.out.print("\n__________________________________________________________"
							+ "________________\n\n");
						System.out.print("Action: ");
						strInput = kbAlpha.nextLine();
						cAction = strInput.charAt(0);
					}
					
					if (cAction == 'a' || cAction == 'A')
					{
						this.blnSearchedDirt = true;
					}
					else if (cAction == 'c' || cAction == 'C')
					{
						setRoom(3);
					}
					else if (cAction == 'b' || cAction == 'B')
					{
						this.blnSearchedBarrels = true;
						this.inventory.add("Shovel");
					}
				}
				break;
			case 5:
				//player has been in this hallway before
				if (evaluateTravelled(5))
				{
					System.out.print("____________________________________________________________"
						+ "______________\n\n");
					System.out.print("You walk back into a hallway. It looks like you have " +
						"been here before.\n\n");
					System.out.print("[A] Open northern door\n[B] Open southern door\n\n");
					System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
						getEquippedWeapon());
					System.out.print("\n__________________________________________________________"
						+ "________________\n\n");
					System.out.print("Action: ");
					strInput = kbAlpha.nextLine();
					cAction = strInput.charAt(0);
					
					while (cAction != 'a' && cAction != 'A' && cAction != 'b' && cAction != 'B'
						&& cAction != 'e' && cAction != 'E' && cAction != 'm' && 
						cAction != 'M')
					{
						System.out.print("\nInvalid choice.");
						System.out.print("\n________________________________________________________"
							+ "__________________\n\n");
						System.out.print("You walk back into a hallway. It looks like you have " +
							"been here before.\n\n");
						System.out.print("[A] Open northern door\n[B] Open southern door\n\n");
						System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
							getEquippedWeapon());
						System.out.print("\n__________________________________________________________"
							+ "________________\n\n");
						System.out.print("Action: ");
						strInput = kbAlpha.nextLine();
						cAction = strInput.charAt(0);
					}
					
					if (cAction == 'a' || cAction == 'A')
					{
						setRoom(7);
					}
					else if (cAction == 'b' || cAction == 'B')
					{
						setRoom(6);
					}
				}
				//first time player enters hallway
				else
				{
					System.out.print("____________________________________________________________"
						+ "______________\n\n");
					System.out.print("You enter a hallway that turns north and reveals another"
						+ " door. Just when\nrounding the corner you see an old door along " +
						"the southern wall that is\ncovered in vines, almost impossible to " +
						"spot. \n\n");
					System.out.print("[A] Open northern door\n[B] Open southern door\n\n");
					System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
						getEquippedWeapon());
					System.out.print("\n__________________________________________________________"
						+ "________________\n\n");
					System.out.print("Action: ");
					strInput = kbAlpha.nextLine();
					cAction = strInput.charAt(0);
					
					while (cAction != 'a' && cAction != 'A' && cAction != 'b' && cAction != 'B'
						&& cAction != 'e' && cAction != 'E' && cAction != 'm' && 
						cAction != 'M')
					{
						System.out.print("\nInvalid choice.");
						System.out.print("\n________________________________________________________"
							+ "__________________\n\n");
						System.out.print("You enter a hallway that turns north and reveals another"
							+ " door. Just when\nrounding the corner you see an old door along " +
							"the southern wall that is\ncovered in vines, almost impossible to " +
							"spot. \n\n");
						System.out.print("[A] Open northern door\n[B] Open southern door\n\n");
						System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
							getEquippedWeapon());
						System.out.print("\n__________________________________________________________"
							+ "________________\n\n");
						System.out.print("Action: ");
						strInput = kbAlpha.nextLine();
						cAction = strInput.charAt(0);
					}
					
					if (cAction == 'a' || cAction == 'A')
					{
						setRoom(7);
						this.hasTravelled.add(5);
					}
					else if (cAction == 'b' || cAction == 'B')
					{
						setRoom(6);
						this.hasTravelled.add(5);
					}
				}
				break;
			case 6:
				//player has killed alien
				if (evaluateTravelled(6))
				{
					System.out.print("____________________________________________________________"
						+ "______________\n\n");
					System.out.print("The alien corpse is still fresh... There is nothing " +
						"else of interest here.\n\n");
					System.out.print("[A] Return to hallway\n\n");
					System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
						getEquippedWeapon());
					System.out.print("\n__________________________________________________________"
						+ "________________\n\n");
					System.out.print("Action: ");
					strInput = kbAlpha.nextLine();
					cAction = strInput.charAt(0);
					
					while (cAction != 'a' && cAction != 'A' && cAction != 'e' && 
						cAction != 'E' && cAction != 'm' && cAction != 'M')
					{
						System.out.print("\nInvalid choice.");
						System.out.print("\n________________________________________________________"
							+ "__________________\n\n");
						System.out.print("The alien corpse is still fresh... There is nothing " +
							"else of interest here.\n\n");
						System.out.print("[A] Return to hallway\n\n");
						System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
							getEquippedWeapon());
						System.out.print("\n__________________________________________________________"
							+ "________________\n\n");
						System.out.print("Action: ");
						strInput = kbAlpha.nextLine();
						cAction = strInput.charAt(0);
					}
					
					if (cAction == 'a' || cAction == 'A')
					{
						setRoom(5);
					}
				}
				//alien is still alive
				else
				{
					System.out.print("____________________________________________________________"
						+ "______________\n\n");
					System.out.print("You enter a small room. Out of the corner of your eye " +
						"you see a slow\nmovement... an alien has spotted you!\n\n");
					System.out.print("[A] Fight alien\n[B] Run back through door way\n\n");
					System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
						getEquippedWeapon());
					System.out.print("\n__________________________________________________________"
						+ "________________\n\n");
					System.out.print("Action: ");
					strInput = kbAlpha.nextLine();
					cAction = strInput.charAt(0);
					
					while (cAction != 'a' && cAction != 'A' && cAction != 'b' && cAction != 'B'
						&& cAction != 'e' && cAction != 'E' && cAction != 'm' && 
						cAction != 'M')
					{
						System.out.print("\nInvalid choice.");
						System.out.print("\n________________________________________________________"
							+ "__________________\n\n");
						System.out.print("You enter a small room. Out of the corner of your eye " +
							"you see a slow\nmovement... an alien has spotted you!\n\n");
						System.out.print("[A] Fight alien\n[B] Run back through door way\n\n");
						System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
							getEquippedWeapon());
						System.out.print("\n__________________________________________________________"
							+ "________________\n\n");
						System.out.print("Action: ");
						strInput = kbAlpha.nextLine();
						cAction = strInput.charAt(0);
					}
					
					if (cAction == 'a' || cAction == 'A')
					{
						fight("alien2");
						this.hasTravelled.add(6);
					}
					else if (cAction == 'b' || cAction == 'B')
					{
						setRoom(5);
					}
				}
				break;
			case 7:
				//player enters first time
				if (!(evaluateTravelled(7)))
				{
					System.out.print("____________________________________________________________"
						+ "______________\n\n");
					System.out.print("The door opens to large a cavern. You can feel the " +
						"ground rumbling and\nthere is a low mist rising just above the " +
						"floor. There are two doors\nbesides the one you entered through. " +
						"There is one on the eastern cavern\nwall, and you can barely see a " +
						"door at the far northern part of the\ncavern, at the end of steep " +
						"decline from your position. Unfortunately,\nanother alien is guarding "
						+ "this door.\n\n");
					System.out.print("[A] Follow the path down to the northern door and " +
						"fight the alien\n[B] Open the eastern door\n[C] Return to the hallway"
						+ " you just came from\n\n");
					System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
						getEquippedWeapon());
					System.out.print("\n__________________________________________________________"
						+ "________________\n\n");
					System.out.print("Action: ");
					strInput = kbAlpha.nextLine();
					cAction = strInput.charAt(0);
					
					while (cAction != 'a' && cAction != 'A' && cAction != 'b' && cAction != 'B'
						&& cAction != 'c' && cAction != 'C' && cAction != 'e' && cAction != 'E'
						&& cAction != 'm' && cAction != 'M')
					{
						System.out.print("\nInvalid choice.");
						System.out.print("\n________________________________________________________"
							+ "__________________\n\n");
						System.out.print("The door opens to large a cavern. You can feel the " +
							"ground rumbling and\nthere is a low mist rising just above the " +
							"floor. There are two doors\nbesides the one you entered through. " +
							"There is one on the eastern cavern\nwall, and you can barely see a " +
							"door at the far northern part of the\ncavern, at the end of steep " +
							"decline from your position. Unfortunately,\nanother alien is guarding "
							+ "this door.\n\n");
						System.out.print("[A] Follow the path down to the northern door and " +
							"fight the alien\n[B] Open the eastern door\n[C] Return to the hallway"
							+ " you just came from\n\n");
						System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
							getEquippedWeapon());
						System.out.print("\n__________________________________________________________"
							+ "________________\n\n");
						System.out.print("Action: ");
						strInput = kbAlpha.nextLine();
						cAction = strInput.charAt(0);
					}
				
					if (cAction == 'a' || cAction == 'A')
					{
						this.hasTravelled.add(7);
						fight("alien3");
					}
					else if (cAction == 'b' || cAction == 'B')
					{
						this.hasTravelled.add(7);
						setRoom(8);
					}
					else if (cAction == 'c' || cAction == 'C')
					{
						this.hasTravelled.add(7);
						setRoom(5);
					}
				}
				//player has been here before but not fought alien
				else if (evaluateTravelled(7) && !(evaluateInventory("Edison Grenade")))
				{
					System.out.print("____________________________________________________________"
						+ "______________\n\n");
					System.out.print("You are in a familiar large cavern.\n\n");
					System.out.print("[A] Follow the path down to the northern door and " +
						"fight the alien\n[B] Open the eastern door\n[C] Return to the hallway"
						+ " you just came from\n\n");
					System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
						getEquippedWeapon());
					System.out.print("\n__________________________________________________________"
						+ "________________\n\n");
					System.out.print("Action: ");
					strInput = kbAlpha.nextLine();
					cAction = strInput.charAt(0);
					
					while (cAction != 'a' && cAction != 'A' && cAction != 'b' && cAction != 'B'
						&& cAction != 'c' && cAction != 'C' && cAction != 'e' && cAction != 'E'
						&& cAction != 'm' && cAction != 'M')
					{
						System.out.print("\nInvalid choice.");
						System.out.print("\n________________________________________________________"
							+ "__________________\n\n");
						System.out.print("The door opens to large a cavern, you can feel the " +
							"ground rumbling and\nthere is a low mist rising just above the " +
							"floor. There are two doors\nbesides the one you entered through. " +
							"There is one on the eastern cavern\nwall, and you can barely see a " +
							"door at the far northern part of the\ncavern, at the end of steep " +
							"decline from your position. Unfortunately,\nanother alien is guarding "
							+ "this door.\n\n");
						System.out.print("[A] Follow the path down to the northern door and " +
							"fight the alien\n[B] Open the eastern door\n[C] Return to the hallway"
							+ " you just came from\n\n");
						System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
							getEquippedWeapon());
						System.out.print("\n__________________________________________________________"
							+ "________________\n\n");
						System.out.print("Action: ");
						strInput = kbAlpha.nextLine();
						cAction = strInput.charAt(0);
					}
				
					if (cAction == 'a' || cAction == 'A')
					{
						fight("alien3");
					}
					else if (cAction == 'b' || cAction == 'B')
					{
						setRoom(8);
					}
					else if (cAction == 'c' || cAction == 'C')
					{
						setRoom(5);
					}
				}
				//player defeats alien but does not have Steel Key
				else if (evaluateTravelled(7) && evaluateInventory("Edison Grenade") &&
					!(evaluateInventory("Steel Key")))
				{
					System.out.print("____________________________________________________________"
						+ "______________\n\n");
					System.out.print("The steel door is locked. If I had to guess, there" +
						" is probably a key to be\nfound...\n\n");
					System.out.print("[A] Open the eastern door\n[B] Open the southern " +
						"door\n\n");
					System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
						getEquippedWeapon());
					System.out.print("\n__________________________________________________________"
						+ "________________\n\n");
					System.out.print("Action: ");
					strInput = kbAlpha.nextLine();
					cAction = strInput.charAt(0);
					
					while (cAction != 'a' && cAction != 'A' && cAction != 'b' && cAction != 'B'
						&& cAction != 'c' && cAction != 'C' && cAction != 'e' && cAction != 'E'
						&& cAction != 'm' && cAction != 'M')
					{
						System.out.print("\nInvalid choice.");
						System.out.print("\n________________________________________________________"
							+ "__________________\n\n");
						System.out.print("The steel door is locked. If I had to guess, there" +
							" is probably a key to be\nfound...\n\n");
						System.out.print("[A] Open the eastern door\n[B] Open the southern " +
							"door\n\n");
						System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
							getEquippedWeapon());
						System.out.print("\n__________________________________________________________"
							+ "________________\n\n");
						System.out.print("Action: ");
						strInput = kbAlpha.nextLine();
						cAction = strInput.charAt(0);
					}
					
					if (cAction == 'a' || cAction == 'A')
					{
						setRoom(8);
					}
					else if (cAction == 'b' || cAction == 'B')
					{
						setRoom(5);
					}
				}
				//player has defeated alien and has Steel Key
				else if (evaluateInventory("Edison Grenade") && 
					evaluateInventory("Steel Key") && evaluateTravelled(7))
				{
					System.out.print("____________________________________________________________"
						+ "______________\n\n");
					System.out.print("Since we did away with the alien, it is time to use "
						+ "the Steek Key on the\nsteel door. What could be on the other " +
						"side of the door?...\n\n");
					System.out.print("[A] Continue through doorway\n\n");
					System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
						getEquippedWeapon());
					System.out.print("\n__________________________________________________________"
						+ "________________\n\n");
					System.out.print("Action: ");
					strInput = kbAlpha.nextLine();
					cAction = strInput.charAt(0);
					
					while (cAction != 'a' && cAction != 'A' && cAction != 'e' && 
						cAction != 'E' && cAction != 'm' && cAction != 'M')
					{
						System.out.print("\nInvalid choice.");
						System.out.print("\n________________________________________________________"
							+ "__________________\n\n");
						System.out.print("Since we did away with the alien, it is time to use "
							+ "the Steek Key on the\nsteel door. What could be on the other " +
							"side of the door?...\n\n");
						System.out.print("[A] Continue through doorway\n\n");
						System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
							getEquippedWeapon());
						System.out.print("\n__________________________________________________________"
							+ "________________\n\n");
						System.out.print("Action: ");
						strInput = kbAlpha.nextLine();
						cAction = strInput.charAt(0);
					}
					
					if (cAction == 'a' || cAction == 'A')
					{
						setRoom(11);
					}
				}
				break;
			case 8:
				//player enters hallway
				this.hasTravelled.add(8);
				System.out.print("____________________________________________________________"
					+ "______________\n\n");
				System.out.print("You enter a hallway with a turn in it. You slowly walk" +
					" around the corner\nand see a door at the end of the hall.\n\n");
				System.out.print("[A] Open western door back to cavern\n[B] Open southern "
					+ "door\n\n");
				System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
					getEquippedWeapon());
				System.out.print("\n__________________________________________________________"
					+ "________________\n\n");
				System.out.print("Action: ");
				strInput = kbAlpha.nextLine();
				cAction = strInput.charAt(0);
				
				while (cAction != 'a' && cAction != 'A' && cAction != 'b' && cAction != 'B'
					&& cAction != 'e' && cAction != 'E' && cAction != 'm' && 
					cAction != 'M')
				{
					System.out.print("\nInvalid choice.");
					System.out.print("\n________________________________________________________"
						+ "__________________\n\n");
					System.out.print("You enter a hallway with a turn in it. You slowly walk" +
						" around the corner\nand see a door at the end of the hall.\n\n");
					System.out.print("[A] Open western door back to cavern\n[B] Open southern "
						+ "door\n\n");
					System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
						getEquippedWeapon());
					System.out.print("\n__________________________________________________________"
						+ "________________\n\n");
					System.out.print("Action: ");
					strInput = kbAlpha.nextLine();
					cAction = strInput.charAt(0);
				}
				
				if (cAction == 'a' || cAction == 'A')
				{
					setRoom(7);
				}
				else if (cAction == 'b' || cAction == 'B')
				{
					setRoom(9);
				}
				
				break;
			case 9:
				//first time player enters
				if (!(evaluateTravelled(9)))
				{
					System.out.print("____________________________________________________________"
						+ "______________\n\n");
					System.out.print("When you open the door, you can hear the sound of an " +
						"alien standing up!\nYou lock eyes with it's one eye - no chance of " +
						"getting by unnoticed. You\nsee a door behind the alien.\n\n");
					System.out.print("[A] Fight alien\n[B] Run back into the hallway\n\n");
					System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
						getEquippedWeapon());
					System.out.print("\n__________________________________________________________"
						+ "________________\n\n");
					System.out.print("Action: ");
					strInput = kbAlpha.nextLine();
					cAction = strInput.charAt(0);
					while (cAction != 'a' && cAction != 'A' && cAction != 'b' && cAction != 'B'
						&& cAction != 'e' && cAction != 'E' && cAction != 'm' && 
						cAction != 'M')
					{
						System.out.print("\nInvalid choice.");
						System.out.print("\n________________________________________________________"
							+ "__________________\n\n");
						System.out.print("When you open the door, you can hear the sound of an " +
							"alien standing up!\nYou lock eyes with it's one eye - no chance of " +
							"getting by unnoticed. You\nsee a door behind the alien.\n\n");
						System.out.print("[A] Fight alien\n[B] Run back into the hallway\n\n");
						System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
							getEquippedWeapon());
						System.out.print("\n__________________________________________________________"
							+ "________________\n\n");
						System.out.print("Action: ");
						strInput = kbAlpha.nextLine();
						cAction = strInput.charAt(0);
					}
					
					if (cAction == 'a' || cAction == 'A')
					{
						this.hasTravelled.add(9);
						fight("alien4");
					}
					else if (cAction == 'b' || cAction == 'B')
					{
						setRoom(8);
					}
				}
				//player defeats alien
				else if (evaluateTravelled(9) && 
					evaluateInventory("Steampunk Mach. II Riflesword"))
				{
					System.out.print("____________________________________________________________"
						+ "______________\n\n");
					System.out.print("Where would you like to go next?\n\n");
					System.out.print("[A] Open door that alien was guarding\n[B] Exit to " +
						"hallway where you came from\n\n");
					System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
						getEquippedWeapon());
					System.out.print("\n__________________________________________________________"
						+ "________________\n\n");
					System.out.print("Action: ");
					strInput = kbAlpha.nextLine();
					cAction = strInput.charAt(0);
					
					while (cAction != 'a' && cAction != 'A' && cAction != 'b' && cAction != 'B'
						&& cAction != 'e' && cAction != 'E' && cAction != 'm' && 
						cAction != 'M')
					{
						System.out.print("\nInvalid choice.");
						System.out.print("\n________________________________________________________"
							+ "__________________\n\n");
						System.out.print("That was an epic battle! You pick up the alien's " +
							"weapon. It is a Mach. II\nRiflesword! This is a lot better than the " +
							getEquippedWeapon() + "!\n\n");
						System.out.print("[A] Open door that alien was guarding\n[B] Exit to " +
							"hallway where you came from\n\n");
						System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
							getEquippedWeapon());
						System.out.print("\n__________________________________________________________"
							+ "________________\n\n");
						System.out.print("Action: ");
						strInput = kbAlpha.nextLine();
						cAction = strInput.charAt(0);
					}
					
					if (cAction == 'a' || cAction == 'A')
					{
						setRoom(10);
					}
					else if (cAction == 'b' || cAction == 'B')
					{
						setRoom(8);
					}
				}
				break;
			case 10:
				//first time player enters
				if (!(evaluateTravelled(10)) && !(evaluateInventory("Steel Key")))
				{
					this.inventory.add("Steel Key");
					this.hasTravelled.add(10);
					System.out.print("____________________________________________________________"
						+ "______________\n\n");
					System.out.print("This is a small room, but right in front of you on the" +
						" ground is a Steel\nKey! This probably opens something!\n\n");
					System.out.print("[A] Exit room\n\n");
					System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
						getEquippedWeapon());
					System.out.print("\n__________________________________________________________"
						+ "________________\n\n");
					System.out.print("Action: ");
					strInput = kbAlpha.nextLine();
					cAction = strInput.charAt(0);
					
					while (cAction != 'a' && cAction != 'A' && cAction != 'e' && 
						cAction != 'E' && cAction != 'm' && cAction != 'M')
					{
						System.out.print("\nInvalid choice.");
						System.out.print("\n________________________________________________________"
							+ "__________________\n\n");
						System.out.print("This is a small room, but right in front of you on the" +
							" ground is a Steel\nKey! This probably opens something!\n\n");
						System.out.print("[A] Exit room\n\n");
						System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
							getEquippedWeapon());
						System.out.print("\n__________________________________________________________"
							+ "________________\n\n");
						System.out.print("Action: ");
						strInput = kbAlpha.nextLine();
						cAction = strInput.charAt(0);
					}
					
					if (cAction == 'a' || cAction == 'A')
					{
						setRoom(9);
					}
				}
				//player has entered before
				else if (evaluateInventory("Steel Key") && evaluateTravelled(10))
				{
					System.out.print("____________________________________________________________"
						+ "______________\n\n");
					System.out.print("This tiny room has been explored already. Nothing to see"
						+ " here.\n\n");
					System.out.print("[A] Exit room\n\n");
					System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
						getEquippedWeapon());
					System.out.print("\n__________________________________________________________"
						+ "________________\n\n");
					System.out.print("Action: ");
					strInput = kbAlpha.nextLine();
					cAction = strInput.charAt(0);
					while (cAction != 'a' && cAction != 'A' && cAction != 'e' && 
						cAction != 'E' && cAction != 'm' && cAction != 'M')
					{
						System.out.print("\nInvalid choice.");
						System.out.print("\n________________________________________________________"
							+ "__________________\n\n");
						System.out.print("This tiny room has been explored already. Nothing to see"
							+ " here.\n\n");
						System.out.print("[A] Exit room\n\n");
						System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
							getEquippedWeapon());
						System.out.print("\n__________________________________________________________"
							+ "________________\n\n");
						System.out.print("Action: ");
						strInput = kbAlpha.nextLine();
						cAction = strInput.charAt(0);
					}
					
					if (cAction == 'a' || cAction == 'A')
					{
						setRoom(9);
					}
				}
				break;
			case 11:
				//player enters room
				if (!(evaluateTravelled(11)) && !(evaluateInventory("Platinum Key")))
				{
					this.inventory.remove("Steel Key");
					System.out.print("____________________________________________________________"
						+ "______________\n\n");
					System.out.print("You enter another large room. The ground is oozing "
						+ "lava, adding to lava\nrunning down the walls. In the center of "
						+ "the room... you see the BOSS\nALIEN! He is guarding a door "
						+ "on the eastern wall. This will be your\nhardest challenge " +
						"yet. Good luck!\n\n");
					System.out.print("[A] Fight boss alien\n\n");
					System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
						getEquippedWeapon());
					System.out.print("\n__________________________________________________________"
						+ "________________\n\n");
					System.out.print("Action: ");
					strInput = kbAlpha.nextLine();
					cAction = strInput.charAt(0);
					
					while (cAction != 'a' && cAction != 'A' && cAction != 'e' && 
						cAction != 'E' && cAction != 'm' && cAction != 'M')
					{
						System.out.print("\nInvalid choice.");
						System.out.print("\n________________________________________________________"
							+ "__________________\n\n");
						System.out.print("You enter another large room. The ground is oozing "
							+ "lava, adding to lava\nrunning down the walls. In the center of "
							+ "the room... you see the BOSS\nALIEN! He is guarding a door "
							+ "on the eastern wall. This will be your\nhardest challenge " +
							"yet. Good luck!\n\n");
						System.out.print("[A] Exit room\n\n");
						System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
							getEquippedWeapon());
						System.out.print("\n__________________________________________________________"
							+ "________________\n\n");
						System.out.print("Action: ");
						strInput = kbAlpha.nextLine();
						cAction = strInput.charAt(0);
					}
					
					if (cAction == 'a' || cAction == 'A')
					{
						fight("boss");
						this.hasTravelled.add(11);
					}
				}
				//player has defeated the boss
				else if (evaluateTravelled(11) && evaluateInventory("Platinum Key"))
				{
					System.out.print("____________________________________________________________"
						+ "______________\n\n");
					System.out.print("Now that you have the Platinum Key, let us try to "
						+ "open the door behind the\nboss alien corpse.\n\n");
					System.out.print("[A] Open eastern door\n\n");
					System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
						getEquippedWeapon());
					System.out.print("\n__________________________________________________________"
						+ "________________\n\n");
					System.out.print("Action: ");
					strInput = kbAlpha.nextLine();
					cAction = strInput.charAt(0);
					
					while (cAction != 'a' && cAction != 'A' && cAction != 'e' && 
						cAction != 'E' && cAction != 'm' && cAction != 'M')
					{
						System.out.print("\nInvalid choice.");
						System.out.print("\n________________________________________________________"
							+ "__________________\n\n");
						System.out.print("Now that you have the Platinum Key, let us try to "
							+ "open the door behind the\nboss alien corpse.\n\n");
						System.out.print("[A] Open eastern door\n\n");
						System.out.print("\t[M] Map\n\t[E] Backpack\n\nHP: " + getHP() + "\nWeapon: " + 
							getEquippedWeapon());
						System.out.print("\n__________________________________________________________"
							+ "________________\n\n");
						System.out.print("Action: ");
						strInput = kbAlpha.nextLine();
						cAction = strInput.charAt(0);
					}
					
					if (cAction == 'a' || cAction == 'A')
					{
						setRoom(12);
					}					
				}
				
				break;
			case 12:
				//player wins!
				this.blnPlayerVictory = true;
				System.out.print("____________________________________________________________"
					+ "______________\n\n");
				System.out.print("You have found the obsidite! The CDC evacuates you and "
					+ "the obsidite back\nto the CDC and production of the vaccine against "
					+ "the pandemic begins. You\nhave saved the humanity!");
				System.out.print("\n__________________________________________________________"
					+ "________________\n\n");
		}//end switch (room)
		
		return cAction;
	
	}//end showMessage(int)
	
	/**
	 * Method Name: fight <br>
	 * Method Purpose: Shows messages and determines fight sequence <br>
	 *
	 * <hr>
	 * Date created: 3/21/19 <br>
	 * Date last modified: 3/25/19 <br>
	 *
	 * <hr>
	 * Notes on specifications, special algorithms, and assumptions: Different alien HP
	 *   and how much damage they do. Different damage outputs based on currently equipped
	 *	 weapon. Tracks if player has died during fight or won.
	 * <hr>
	 *   @param  enemy:String which enemy player is fighting
	 */
	
	public void fight(String enemy)
	{
		Scanner kbAlpha = new Scanner(System.in);
		
		String strInput;						//player input
		char cAttack;							//player input attack button
		random = new Random();
		
		cAttack = 'x';
		
		if (strEquippedWeapon.equals("Dagger"))
		{
			this.iMaxDmg = 5; 					//exclusive
			this.iMinDmg = 2;					//inclusive
		}
		else if (strEquippedWeapon.equals("Steampunk 4-Barrel Pistol"))
		{
			this.iMaxDmg = 8; 					//exclusive
			this.iMinDmg = 3;					//inclusive			
		}
		else if (strEquippedWeapon.equals("Steampunk Mach. II Riflesword"))
		{
			this.iMaxDmg = 16; 					//exclusive
			this.iMinDmg = 6;					//inclusive
		}
		
		if (enemy.equals("alien1"))
		{
			this.iAlienHP = 15;
			this.iAlienMaxDmg = 3;				//exclusive
			this.iAlienMinDmg = 1;				//inclusive
			
			System.out.print("____________________________________________________________"
				+ "______________\n\n");
			System.out.print("You have entered the fight! Attack!\n\n");
			System.out.print("[A] Attack\n\n");
			System.out.print("HP: " + getHP() + "\nWeapon: " + getEquippedWeapon());
			System.out.print("\n____________________________________________________________"
				+ "______________\n\n");
			System.out.print("Action: ");
			strInput = kbAlpha.nextLine();
			cAttack = strInput.charAt(0);
			
			while (cAttack != 'a' && cAttack != 'A')
			{
				System.out.print("\nInvalid choice.\n");
				System.out.print("____________________________________________________________"
					+ "______________\n\n");
				System.out.print("You have entered the fight! Attack!\n\n");
				System.out.print("[A] Attack\n\n");
				System.out.print("HP: " + getHP() + "\nWeapon: " + getEquippedWeapon());
				System.out.print("\n____________________________________________________________"
					+ "______________\n\n");
				System.out.print("Action: ");
				strInput = kbAlpha.nextLine();
				cAttack = strInput.charAt(0);
			}			
			
			while (this.iHP > 0 && this.iAlienHP > 0)
			{
				this.iDmgDealt = random.nextInt(this.iMaxDmg - this.iMinDmg) + 
					this.iMinDmg;
				this.iAlienHP -= this.iDmgDealt;
				
				this.iDmgTaken = random.nextInt(this.iAlienMaxDmg - this.iAlienMinDmg) +
					this.iAlienMinDmg;
				this.iHP -= this.iDmgTaken;
				
				if (this.iHP <= 0)
				{
					setPlayerState(false);
					System.out.print("________________________________________________________"
						+ "__________________\n\n");
					System.out.print("Oh no! You took " + this.iDmgTaken + " damage and died! " +
						"It looks like the aliens got the best\nof you and humanity " + 
						"is\ndoomed... better luck next time!\n\n");
					System.out.print("\n__________________________________________________________"
						+ "________________\n\n");
					break;
				}
				else if (this.iAlienHP <= 0)
				{
					this.inventory.add("Steampunk 4-Barrel Pistol");
					setEquippedWeapon("Steampunk 4-Barrel Pistol");
					System.out.print("________________________________________________________"
						+ "__________________\n\n");
					System.out.print("You took " + this.iDmgTaken + ", but you have killed"
						+ " the alien!\nThe alien dropped his " +
						"weapon! You pick it up an examine it. It looks like\nit is a " +
						"Steampunk 4-Barrel Pistol. This might be a better option than " +
						"the\n" + getEquippedWeapon() + ". You equip it.\n\n");
					System.out.print("[A] Continue\n\n");
					System.out.print("HP: " + getHP() + "\nWeapon: " + getEquippedWeapon());
					System.out.print("\n__________________________________________________________"
						+ "________________\n\n");
					System.out.print("Action: ");
					strInput = kbAlpha.nextLine();
					cAttack = strInput.charAt(0);
					
					while (cAttack != 'a' && cAttack != 'A')
					{
						System.out.print("\nInvalid choice.\n");
						System.out.print("________________________________________________________"
							+ "__________________\n\n");
						System.out.print("You took " + this.iDmgTaken + " damage, but you have killed"
							+ " the alien!\nThe alien dropped his " +
							"weapon! You pick it up an examine it. It looks like\nit is a " +
							"Steampunk 4-Barrel Pistol. This might be a better option than " +
							"the\n" + getEquippedWeapon() + ". You equip it.\n\n");
						System.out.print("[A] Continue\n\n");
						System.out.print("HP: " + getHP() + "\nWeapon: " + getEquippedWeapon());
						System.out.print("\n__________________________________________________________"
							+ "________________\n\n");
						System.out.print("Action: ");
						strInput = kbAlpha.nextLine();
						cAttack = strInput.charAt(0);
					}
					break;
				}
				else
				{
					System.out.print("________________________________________________________"
						+ "__________________\n\n");
					System.out.print("You inflict " + this.iDmgDealt + " damage. You take " + 
						this.iDmgTaken + " damage!\n\nAlien HP left: " + this.iAlienHP + "\n\n");
					System.out.print("[A] Attack\n\n");
					System.out.print("HP: " + getHP() + "\nWeapon: " + getEquippedWeapon());
					System.out.print("\n__________________________________________________________"
						+ "________________\n\n");
					System.out.print("Action: ");
					strInput = kbAlpha.nextLine();
					cAttack = strInput.charAt(0);
				
					while (cAttack != 'a' && cAttack != 'A')
					{
						System.out.print("\nInvalid choice.\n");
						System.out.print("________________________________________________________"
							+ "__________________\n\n");
						System.out.print("You inflict " + this.iDmgDealt + " damage. You take " + 
							this.iDmgTaken + " damage!\n\nAlien HP left: " + this.iAlienHP + "\n\n");
						System.out.print("[A] Attack\n\n");
						System.out.print("HP: " + getHP() + "\nWeapon: " + getEquippedWeapon());
						System.out.print("\n__________________________________________________________"
							+ "________________\n\n");
						System.out.print("Action: ");
						strInput = kbAlpha.nextLine();
						cAttack = strInput.charAt(0);
					}
				}
			}
		}
		else if (enemy.equals("alien2"))
		{
			this.iAlienHP = 18;
			this.iAlienMaxDmg = 5;				//exclusive
			this.iAlienMinDmg = 1;				//inclusive
			
			System.out.print("____________________________________________________________"
				+ "______________\n\n");
			System.out.print("You have entered the fight! Attack!\n\n");
			System.out.print("[A] Attack\n\n");
			System.out.print("HP: " + getHP() + "\nWeapon: " + getEquippedWeapon());
			System.out.print("\n____________________________________________________________"
				+ "______________\n\n");
			System.out.print("Action: ");
			strInput = kbAlpha.nextLine();
			cAttack = strInput.charAt(0);
			
			while (cAttack != 'a' && cAttack != 'A')
			{
				System.out.print("\nInvalid choice.\n");
				System.out.print("____________________________________________________________"
					+ "______________\n\n");
				System.out.print("You have entered the fight! Attack!\n\n");
				System.out.print("[A] Attack\n\n");
				System.out.print("HP: " + getHP() + "\nWeapon: " + getEquippedWeapon());
				System.out.print("\n____________________________________________________________"
					+ "______________\n\n");
				System.out.print("Action: ");
				strInput = kbAlpha.nextLine();
				cAttack = strInput.charAt(0);
			}			
			
			while (this.iHP > 0 && this.iAlienHP > 0)
			{
				this.iDmgDealt = random.nextInt(this.iMaxDmg - this.iMinDmg) + 
					this.iMinDmg;
				this.iAlienHP -= this.iDmgDealt;
				
				this.iDmgTaken = random.nextInt(this.iAlienMaxDmg - this.iAlienMinDmg) +
					this.iAlienMinDmg;
				this.iHP -= this.iDmgTaken;
				
				if (this.iHP <= 0)
				{
					setPlayerState(false);
					System.out.print("________________________________________________________"
						+ "__________________\n\n");
					System.out.print("Oh no! You took " + this.iDmgTaken + " damage and died! " +
						"It looks like the aliens got the best\nof you and humanity " + 
						"is\ndoomed... better luck next time!\n\n");
					System.out.print("\n__________________________________________________________"
						+ "________________\n\n");
					break;
				}
				else if(this.iAlienHP <= 0)
				{
					this.iHP += 10;
					this.inventory.add("Manhole Cover Shield");
					System.out.print("________________________________________________________"
						+ "__________________\n\n");
					System.out.print("You took " + this.iDmgTaken + " damge, but you " +
						"killed the alien! Looking around on the floor,\n"
						+ "you find a health pack that increases your health by 10. " +
						"Fantastic!\nSearching the alien's corpse, you find a Manhole Cover"
						+ " Shield! This will\nprotect you from some damage.\n\n");
					System.out.print("[A] Continue\n\n");
					System.out.print("HP: " + getHP() + "\nWeapon: " + getEquippedWeapon());
					System.out.print("\n__________________________________________________________"
						+ "________________\n\n");
					System.out.print("Action: ");
					strInput = kbAlpha.nextLine();
					cAttack = strInput.charAt(0);
					
					while (cAttack != 'a' && cAttack != 'A')
					{
						System.out.print("\nInvalid choice.\n");
						System.out.print("________________________________________________________"
							+ "__________________\n\n");
						System.out.print("You took " + this.iDmgTaken + " damage, but you "
							+ "killed the alien! Looking around on the floor,\n"
							+ "you find a health pack that increases your health by 10. " +
							"Fantastic!\nSearching the alien's corpse, you find a Manhole Cover"
							+ " Shield! This will\nprotect you from some damage.\n\n");
						System.out.print("[A] Continue\n\n");
						System.out.print("HP: " + getHP() + "\nWeapon: " + getEquippedWeapon());
						System.out.print("\n__________________________________________________________"
							+ "________________\n\n");
						System.out.print("Action: ");
						strInput = kbAlpha.nextLine();
						cAttack = strInput.charAt(0);
					}
					break;
				}
				else
				{
					System.out.print("________________________________________________________"
						+ "__________________\n\n");
					System.out.print("You inflict " + this.iDmgDealt + " damage. You take " + 
						this.iDmgTaken + " damage!\n\nAlien HP left: " + this.iAlienHP + "\n\n");
					System.out.print("[A] Attack\n\n");
					System.out.print("HP: " + getHP() + "\nWeapon: " + getEquippedWeapon());
					System.out.print("\n__________________________________________________________"
						+ "________________\n\n");
					System.out.print("Action: ");
					strInput = kbAlpha.nextLine();
					cAttack = strInput.charAt(0);
					
					while (cAttack != 'a' && cAttack != 'A')
					{
						System.out.print("\nInvalid choice.\n");
						System.out.print("________________________________________________________"
							+ "__________________\n\n");
						System.out.print("You inflict " + this.iDmgDealt + " damage. You take " + 
							this.iDmgTaken + " damage!\n\nAlien HP left: " + this.iAlienHP + "\n\n");
						System.out.print("[A] Attack\n\n");
						System.out.print("HP: " + getHP() + "\nWeapon: " + getEquippedWeapon());
						System.out.print("\n__________________________________________________________"
							+ "________________\n\n");
						System.out.print("Action: ");
						strInput = kbAlpha.nextLine();
						cAttack = strInput.charAt(0);
					}
				}
			}
		}
		else if (enemy.equals("alien3"))
		{
			if (evaluateInventory("Manhole Cover Shield"))
			{
				this.iAlienHP = 22;
				this.iAlienMaxDmg = 7;				//exclusive
				this.iAlienMinDmg = 2;				//inclusive
			}
			else
			{
				this.iAlienHP = 22;
				this.iAlienMaxDmg = 9;				//exclusive
				this.iAlienMinDmg = 3;				//inclusive
			}
			
			System.out.print("____________________________________________________________"
				+ "______________\n\n");
			System.out.print("You have entered the fight! Attack!\n\n");
			System.out.print("[A] Attack\n\n");
			System.out.print("HP: " + getHP() + "\nWeapon: " + getEquippedWeapon());
			System.out.print("\n____________________________________________________________"
				+ "______________\n\n");
			System.out.print("Action: ");
			strInput = kbAlpha.nextLine();
			cAttack = strInput.charAt(0);
			
			while (cAttack != 'a' && cAttack != 'A')
			{
				System.out.print("\nInvalid choice.\n");
				System.out.print("____________________________________________________________"
					+ "______________\n\n");
				System.out.print("You have entered the fight! Attack!\n\n");
				System.out.print("[A] Attack\n\n");
				System.out.print("HP: " + getHP() + "\nWeapon: " + getEquippedWeapon());
				System.out.print("\n____________________________________________________________"
					+ "______________\n\n");
				System.out.print("Action: ");
				strInput = kbAlpha.nextLine();
				cAttack = strInput.charAt(0);
			}			
			
			while (this.iHP > 0 && this.iAlienHP > 0)
			{
				this.iDmgDealt = random.nextInt(this.iMaxDmg - this.iMinDmg) + 
					this.iMinDmg;
				this.iAlienHP -= this.iDmgDealt;
				
				this.iDmgTaken = random.nextInt(this.iAlienMaxDmg - this.iAlienMinDmg) +
					this.iAlienMinDmg;
				this.iHP -= this.iDmgTaken;
				
				if (this.iHP <= 0)
				{
					setPlayerState(false);
					System.out.print("________________________________________________________"
						+ "__________________\n\n");
					System.out.print("Oh no! You took " + this.iDmgTaken + " damage and died! " +
						"It looks like the aliens got the best\nof you and humanity " + 
						"is\ndoomed... better luck next time!\n\n");
					System.out.print("\n__________________________________________________________"
						+ "________________\n\n");
					break;
				}
				else if(this.iAlienHP <= 0)
				{
					this.iHP += 15;
					this.inventory.add("Edison Grenade");
					System.out.print("________________________________________________________"
						+ "__________________\n\n");
					System.out.print("You took " + this.iDmgTaken + " damage, but you " +
						"killed the alien! Looking around on the floor,\n"
						+ "you find a health pack that increases your health by 15. The "
						+ "alien also\ndropped an Edison Grenade! It looks like a bulb but "
						+ "probably does more\nthan light up a room!\n\n");
					System.out.print("[A] Continue\n\n");
					System.out.print("HP: " + getHP() + "\nWeapon: " + getEquippedWeapon());
					System.out.print("\n__________________________________________________________"
						+ "________________\n\n");
					System.out.print("Action: ");
					strInput = kbAlpha.nextLine();
					cAttack = strInput.charAt(0);
					
					while (cAttack != 'a' && cAttack != 'A')
					{
						System.out.print("\nInvalid choice.\n");
						System.out.print("________________________________________________________"
							+ "__________________\n\n");
						System.out.print("You took " + this.iDmgTaken + " damage, but you " +
							"killed the alien! Looking around on the floor,\n"
							+ "you find a health pack that increases your health by 15. The "
							+ "alien also\ndropped an Edison Grenade! It looks like a bulb but "
							+ "probably does more\nthan light up a room!\n\n");
						System.out.print("[A] Continue\n\n");
						System.out.print("HP: " + getHP() + "\nWeapon: " + getEquippedWeapon());
						System.out.print("\n__________________________________________________________"
							+ "________________\n\n");
						System.out.print("Action: ");
						strInput = kbAlpha.nextLine();
						cAttack = strInput.charAt(0);
					}
					break;
				}
				else
				{
					System.out.print("________________________________________________________"
						+ "__________________\n\n");
					System.out.print("You inflict " + this.iDmgDealt + " damage. You take " + 
						this.iDmgTaken + " damage!\n\nAlien HP left: " + this.iAlienHP + "\n\n");
					System.out.print("[A] Attack\n\n");
					System.out.print("HP: " + getHP() + "\nWeapon: " + getEquippedWeapon());
					System.out.print("\n__________________________________________________________"
						+ "________________\n\n");
					System.out.print("Action: ");
					strInput = kbAlpha.nextLine();
					cAttack = strInput.charAt(0);
					
					while (cAttack != 'a' && cAttack != 'A')
					{
						System.out.print("\nInvalid choice.\n");
						System.out.print("________________________________________________________"
							+ "__________________\n\n");
						System.out.print("You inflict " + this.iDmgDealt + " damage. You take " + 
							this.iDmgTaken + " damage!\n\nAlien HP left: " + this.iAlienHP + "\n\n");
						System.out.print("[A] Attack\n\n");
						System.out.print("HP: " + getHP() + "\nWeapon: " + getEquippedWeapon());
						System.out.print("\n__________________________________________________________"
							+ "________________\n\n");
						System.out.print("Action: ");
						strInput = kbAlpha.nextLine();
						cAttack = strInput.charAt(0);
					}
				}
			}
		}
		else if (enemy.equals("alien4"))
		{
			if(evaluateInventory("Manhole Cover Shield"))
			{
				this.iAlienHP = 18;
				this.iAlienMaxDmg = 6;				//exclusive
				this.iAlienMinDmg = 1;				//inclusive
			}
			else
			{
				this.iAlienHP = 18;
				this.iAlienMaxDmg = 8;				//exclusive
				this.iAlienMinDmg = 2;				//inclusive
			}
			
			System.out.print("____________________________________________________________"
				+ "______________\n\n");
			System.out.print("You have entered the fight! Attack!\n\n");
			System.out.print("[A] Attack\n\n");
			System.out.print("HP: " + getHP() + "\nWeapon: " + getEquippedWeapon());
			System.out.print("\n____________________________________________________________"
				+ "______________\n\n");
			System.out.print("Action: ");
			strInput = kbAlpha.nextLine();
			cAttack = strInput.charAt(0);
			
			while (cAttack != 'a' && cAttack != 'A')
			{
				System.out.print("\nInvalid choice.\n");
				System.out.print("____________________________________________________________"
					+ "______________\n\n");
				System.out.print("You have entered the fight! Attack!\n\n");
				System.out.print("[A] Attack\n\n");
				System.out.print("HP: " + getHP() + "\nWeapon: " + getEquippedWeapon());
				System.out.print("\n____________________________________________________________"
					+ "______________\n\n");
				System.out.print("Action: ");
				strInput = kbAlpha.nextLine();
				cAttack = strInput.charAt(0);
			}			
			
			while (this.iHP > 0 && this.iAlienHP > 0)
			{
				this.iDmgDealt = random.nextInt(this.iMaxDmg - this.iMinDmg) + 
					this.iMinDmg;
				this.iAlienHP -= this.iDmgDealt;
				
				this.iDmgTaken = random.nextInt(this.iAlienMaxDmg - this.iAlienMinDmg) +
					this.iAlienMinDmg;
				this.iHP -= this.iDmgTaken;
				
				if (this.iHP <= 0)
				{
					setPlayerState(false);
					System.out.print("________________________________________________________"
						+ "__________________\n\n");
					System.out.print("Oh no! You took " + this.iDmgTaken + " damage and died! " +
						"It looks like the aliens got the best\nof you and humanity " + 
						"is\ndoomed... better luck next time!\n\n");
					System.out.print("\n__________________________________________________________"
						+ "________________\n\n");
					break;
				}
				else if(this.iAlienHP <= 0)
				{
					this.iHP += 10;
					this.inventory.add("Steampunk Mach. II Riflesword");
					setEquippedWeapon("Steampunk Mach. II Riflesword");
					System.out.print("________________________________________________________"
						+ "__________________\n\n");
					System.out.print("You took " + this.iDmgTaken + " damage, but you"
						+ " killed the alien! Looking around on the floor,\n"
						+ "you find a health pack that increases your health by 10. The "
						+ "alien also\ndropped a Steampunk Mach. II Riflesword! This weapon"
						+ " looks quite menacing.\n\n");
					System.out.print("[A] Continue\n\n");
					System.out.print("HP: " + getHP() + "\nWeapon: " + getEquippedWeapon());
					System.out.print("\n__________________________________________________________"
						+ "________________\n\n");
					System.out.print("Action: ");
					strInput = kbAlpha.nextLine();
					cAttack = strInput.charAt(0);
					
					while (cAttack != 'a' && cAttack != 'A')
					{
						System.out.print("\nInvalid choice.\n");
						System.out.print("________________________________________________________"
							+ "__________________\n\n");
						System.out.print("You took " + this.iDmgTaken + " damage, but you"
							+ " killed the alien! Looking around on the floor,\n"
							+ "you find a health pack that increases your health by 10. The "
							+ "alien also\ndropped a Steampunk Mach. II Riflesword! This weapon"
							+ " looks quite menacing.\n\n");
						System.out.print("[A] Continue\n\n");
						System.out.print("HP: " + getHP() + "\nWeapon: " + getEquippedWeapon());
						System.out.print("\n__________________________________________________________"
							+ "________________\n\n");
						System.out.print("Action: ");
						strInput = kbAlpha.nextLine();
						cAttack = strInput.charAt(0);
					}
					break;
				}
				else
				{
					System.out.print("________________________________________________________"
						+ "__________________\n\n");
					System.out.print("You inflict " + this.iDmgDealt + " damage. You take " + 
						this.iDmgTaken + " damage!\n\nAlien HP left: " + this.iAlienHP + "\n\n");
					System.out.print("[A] Attack\n\n");
					System.out.print("HP: " + getHP() + "\nWeapon: " + getEquippedWeapon());
					System.out.print("\n__________________________________________________________"
						+ "________________\n\n");
					System.out.print("Action: ");
					strInput = kbAlpha.nextLine();
					cAttack = strInput.charAt(0);
					
					while (cAttack != 'a' && cAttack != 'A')
					{
						System.out.print("\nInvalid choice.\n");
						System.out.print("________________________________________________________"
							+ "__________________\n\n");
						System.out.print("You inflict " + this.iDmgDealt + " damage. You take " + 
							this.iDmgTaken + " damage!\n\nAlien HP left: " + this.iAlienHP + "\n\n");
						System.out.print("[A] Attack\n\n");
						System.out.print("HP: " + getHP() + "\nWeapon: " + getEquippedWeapon());
						System.out.print("\n__________________________________________________________"
							+ "________________\n\n");
						System.out.print("Action: ");
						strInput = kbAlpha.nextLine();
						cAttack = strInput.charAt(0);
					}
				}
			}
		}
		else if (enemy.equals("boss"))
		{
			if(evaluateInventory("Manhole Cover Shield"))
			{
				this.iAlienHP = 50;
				this.iAlienMaxDmg = 10;				//exclusive
				this.iAlienMinDmg = 2;				//inclusive
			}
			else
			{
				this.iAlienHP = 50;
				this.iAlienMaxDmg = 12;				//exclusive
				this.iAlienMinDmg = 4;				//inclusive
			}
			
			System.out.print("____________________________________________________________"
				+ "______________\n\n");
			System.out.print("You have entered the fight! Attack!\n\n");
			System.out.print("[A] Attack\n\n");
			System.out.print("HP: " + getHP() + "\nWeapon: " + getEquippedWeapon());
			System.out.print("\n____________________________________________________________"
				+ "______________\n\n");
			System.out.print("Action: ");
			strInput = kbAlpha.nextLine();
			cAttack = strInput.charAt(0);
			
			while (cAttack != 'a' && cAttack != 'A')
			{
				System.out.print("\nInvalid choice.\n");
				System.out.print("____________________________________________________________"
					+ "______________\n\n");
				System.out.print("You have entered the fight! Attack!\n\n");
				System.out.print("[A] Attack\n\n");
				System.out.print("HP: " + getHP() + "\nWeapon: " + getEquippedWeapon());
				System.out.print("\n____________________________________________________________"
					+ "______________\n\n");
				System.out.print("Action: ");
				strInput = kbAlpha.nextLine();
				cAttack = strInput.charAt(0);
			}
			
			if (evaluateInventory("Edison Grenade"))
			{
				this.inventory.remove("Edison Grenade");
				this.iAlienHP -= 20;
				System.out.print("____________________________________________________________"
					+ "______________\n\n");
				System.out.print("You lob the Edison Grenade to start the battle and hide "
					+ "behind a cluster\nof stalagmite. A few seconds later, the grenade"
					+ " explodes dealing 20\ndamage to the boss alien!\n\nBoss Alien HP " +
					"left: " + this.iAlienHP + "\n\n");
				System.out.print("[A] Attack\n\n");
				System.out.print("HP: " + getHP() + "\nWeapon: " + getEquippedWeapon());
				System.out.print("\n____________________________________________________________"
					+ "______________\n\n");
				System.out.print("Action: ");
				strInput = kbAlpha.nextLine();
				cAttack = strInput.charAt(0);
					
				while (cAttack != 'a' && cAttack != 'A')
				{
					System.out.print("\nInvalid choice.\n");
					System.out.print("____________________________________________________________"
						+ "______________\n\n");
					System.out.print("You lob the Edison Grenade to start the battle and hide "
						+ "behind a cluster\nof stalagmite. A few seconds later, the grenade"
						+ " explodes dealing 20 damage to the boss alien!\n\n");
					System.out.print("[A] Attack\n\n");
					System.out.print("HP: " + getHP() + "\nWeapon: " + getEquippedWeapon());
					System.out.print("\n____________________________________________________________"
						+ "______________\n\n");
					System.out.print("Action: ");
					strInput = kbAlpha.nextLine();
					cAttack = strInput.charAt(0);
				}
			}
			
			while (this.iHP > 0 && this.iAlienHP > 0)
			{
				this.iDmgDealt = random.nextInt(this.iMaxDmg - this.iMinDmg) + 
					this.iMinDmg;
				this.iAlienHP -= this.iDmgDealt;
				
				this.iDmgTaken = random.nextInt(this.iAlienMaxDmg - this.iAlienMinDmg) +
					this.iAlienMinDmg;
				this.iHP -= this.iDmgTaken;
				
				if (this.iHP <= 0)
				{
					setPlayerState(false);
					System.out.print("________________________________________________________"
						+ "__________________\n\n");
					System.out.print("Oh no! You took " + this.iDmgTaken + " damage and died! " +
						"It looks like the aliens got the best\nof you and humanity " + 
						"is\ndoomed... better luck next time!\n\n");
					System.out.print("\n__________________________________________________________"
						+ "________________\n\n");
					break;
				}
				else if(this.iAlienHP <= 0)
				{
					this.inventory.add("Platinum Key");
					System.out.print("________________________________________________________"
						+ "__________________\n\n");
					System.out.print("You took " + this.iDmgTaken + " damage, but you "
						+ "have killed the boss alien! He drops the\n" +
						"Platinum Key!\n\n");
					System.out.print("[A] Pick up Platinum Key\n\n");
					System.out.print("HP: " + getHP() + "\nWeapon: " + getEquippedWeapon());
					System.out.print("\n__________________________________________________________"
						+ "________________\n\n");
					System.out.print("Action: ");
					strInput = kbAlpha.nextLine();
					cAttack = strInput.charAt(0);
					
					while (cAttack != 'a' && cAttack != 'A')
					{
						System.out.print("\nInvalid choice.\n");
						System.out.print("________________________________________________________"
							+ "__________________\n\n");
						System.out.print("You took " + this.iDmgTaken + " damage, but you "
							+ "have killed the boss alien! He drops the\n" +
							"Platinum Key!\n\n");
						System.out.print("[A] Pick up Platinum Key\n\n");
						System.out.print("HP: " + getHP() + "\nWeapon: " + getEquippedWeapon());
						System.out.print("\n__________________________________________________________"
							+ "________________\n\n");
						System.out.print("Action: ");
						strInput = kbAlpha.nextLine();
						cAttack = strInput.charAt(0);
					}
					break;
				}
				else
				{
					System.out.print("________________________________________________________"
						+ "__________________\n\n");
					System.out.print("You inflict " + this.iDmgDealt + " damage. You take " + 
						this.iDmgTaken + " damage!\n\nBoss Alien HP left: " + this.iAlienHP + "\n\n");
					System.out.print("[A] Attack\n\n");
					System.out.print("HP: " + getHP() + "\nWeapon: " + getEquippedWeapon());
					System.out.print("\n__________________________________________________________"
						+ "________________\n\n");
					System.out.print("Action: ");
					strInput = kbAlpha.nextLine();
					cAttack = strInput.charAt(0);
					
					while (cAttack != 'a' && cAttack != 'A')
					{
						System.out.print("\nInvalid choice.\n");
						System.out.print("________________________________________________________"
							+ "__________________\n\n");
						System.out.print("You inflict " + this.iDmgDealt + " damage. You take " + 
							this.iDmgTaken + " damage!\n\nBoss Alien HP left: " + this.iAlienHP + "\n\n");
						System.out.print("[A] Attack\n\n");
						System.out.print("HP: " + getHP() + "\nWeapon: " + getEquippedWeapon());
						System.out.print("\n__________________________________________________________"
							+ "________________\n\n");
						System.out.print("Action: ");
						strInput = kbAlpha.nextLine();
						cAttack = strInput.charAt(0);
					}
				}
			}
		}
		
	}//end fight(String)
	
}//end Player