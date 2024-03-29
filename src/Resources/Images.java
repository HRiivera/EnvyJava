package Resources;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Scanner;


/**
 * Created by AlexVR on 7/1/2018.
 */
public class Images {

	// true if you wish to use PrintCropList()
	private boolean processPixelSheet = false;

	public static BufferedImage[] butstart;
	public static BufferedImage title;
	public static BufferedImage title2;
	public static BufferedImage title3;
	public static BufferedImage title4;
	public static BufferedImage[] titleChoose;
	public static BufferedImage titleImage;
	public static BufferedImage Pause;
	public static BufferedImage Stats;
	public static BufferedImage[] StatBut;
	public static BufferedImage[] Resume;
	public static BufferedImage[] Quit;
	public static BufferedImage[] BTitle;
	public static BufferedImage[] Options;
	public static ImageIcon icon;

	public static BufferedImage map[];
	
	public static Image Scaledmap[];

	public static BufferedImage projectTitle;
	public static BufferedImage envyTitle;
	public static BufferedImage ghost;
	
	
	
	public static BufferedImage cobblestone;
	public static BufferedImage textbox;
	public static BufferedImage professorhead;

	public static BufferedImage E;
	public static BufferedImage TownEntity;
	public static BufferedImage TownEntityGUI;
	public static BufferedImage[] Town;
	public static BufferedImage Lab;
	public static BufferedImage Room1;
	public static BufferedImage Room2;
	public static BufferedImage Room3;
	public static BufferedImage Room4;
	
	
	
	public static SpriteSheet pikaSheet;
	public static BufferedImage[] pika_front;
	public static BufferedImage[] pika_left;
	public static BufferedImage[] pika_right;
	public static BufferedImage[] pika_back;
	public static BufferedImage[] pika_frontright;
	public static BufferedImage[] pika_frontleft;
	public static BufferedImage[] pika_backleft;
	public static BufferedImage[] pika_backright;
	public static BufferedImage[] pika_idle;
	
	public static SpriteSheet raySheet;
	public static BufferedImage[] ray_idle;
	public static SpriteSheet grouSheet;
	public static BufferedImage[] grou_idle;

	public static SpriteSheet playerSheet;
	public static BufferedImage[] player_front;
	public static BufferedImage[] player_left;
	public static BufferedImage[] player_right;
	public static BufferedImage[] player_back;
	public static BufferedImage player_attack;

	public static BufferedImage[] PEnemyIdle;
	public static BufferedImage[] WEnemyIdle;
	public static BufferedImage[] REnemyIdle;
	public static BufferedImage[] GEnemyIdle;

	public static SpriteSheet PEnemySheet;
	public static SpriteSheet WEnemySheet;
	public static SpriteSheet REnemySheet;
	public static SpriteSheet GEnemySheet;

	public static BufferedImage QST;


	public static BufferedImage[] battleBackground;
	public static BufferedImage[] Attack;
	public static BufferedImage[] Defend;
	public static BufferedImage[] Skill;

	public static BufferedImage[] IceSkill;
	public static BufferedImage[] FireSkill;
	public static BufferedImage[] DefenceMode;
	public static BufferedImage[] AttackMode;

	public static BufferedImage[] Enemy;
	public static BufferedImage[] SEnemy;
	public static BufferedImage[] EnemyS;
	public static BufferedImage[] SSkill;
	public static BufferedImage[] aura;

	public static SpriteSheet iceSkillSheet;
	public static SpriteSheet fireSkillSheet;
	public static SpriteSheet defenceModeSheet;
	public static SpriteSheet attackModeSheet;

	public static SpriteSheet smokeHouseSheet;
	public static SpriteSheet statueSheet;

	public static BufferedImage[] smokeHouse;

	public static BufferedImage[] lightStatue;

	public static BufferedImage[] SItem;

	public static BufferedImage CaveMap;
	public static BufferedImage Loading;
	
	
	public static Image ScaledCave;
	public static Image ScaledArea;
	public static Image ScaledTown[];
	public static Image ScaledLab;
	public static Image ScaledRoom1;
	public static Image ScaledRoom2;
	public static Image ScaledRoom3;
	public static Image ScaledRoom4;
	
	public static BufferedImage tree;

	public Images() {

		butstart = new BufferedImage[3];
		BTitle = new BufferedImage[3];
		titleChoose = new BufferedImage[2];
		StatBut = new BufferedImage[2];
		Options = new BufferedImage[3];
		Resume = new BufferedImage[2];
		Quit = new BufferedImage[2];
		
		map = new BufferedImage[4];
		Scaledmap = new Image[3];
		Town = new BufferedImage[4];
		ScaledTown = new Image[3];

		battleBackground = new BufferedImage[4];

		Attack = new BufferedImage[1];
		Defend = new BufferedImage[1];
		Skill = new BufferedImage[1];

		IceSkill = new BufferedImage[100];
		FireSkill = new BufferedImage[70];
		DefenceMode = new BufferedImage[100];
		AttackMode = new BufferedImage[100];


		player_front = new BufferedImage[4];
		player_right = new BufferedImage[4];
		player_left = new BufferedImage[4];
		player_back = new BufferedImage[4];
		
		
		pika_front = new BufferedImage[2];
		pika_left = new BufferedImage[2];
		pika_right = new BufferedImage[2];
		pika_back = new BufferedImage[2];
		pika_frontright = new BufferedImage[2];
		pika_frontleft = new BufferedImage[2];
		pika_backleft = new BufferedImage[2];
		pika_backright = new BufferedImage[2];
		pika_idle = new BufferedImage[8];
		
		ray_idle = new BufferedImage[3];
		grou_idle = new BufferedImage[2];
		
		

		PEnemyIdle = new BufferedImage[7];
		WEnemyIdle = new BufferedImage[3];
		REnemyIdle = new BufferedImage[48];
		GEnemyIdle = new BufferedImage[50];

		Enemy = new BufferedImage[8];
		SEnemy = new BufferedImage[8];
		EnemyS = new BufferedImage[16];
		SSkill = new BufferedImage[23];
		aura = new BufferedImage[4];
		SItem = new BufferedImage[16];

		smokeHouse = new BufferedImage[7];
		lightStatue = new BufferedImage[10];

		try {
			
			map[0] = ImageIO.read(getClass().getResourceAsStream("/Worlds/map.png"));
			map[1] = ImageIO.read(getClass().getResourceAsStream("/Worlds/map2.png"));
			map[2] = ImageIO.read(getClass().getResourceAsStream("/Worlds/map3.png"));
			
			
			Town[0] = ImageIO.read(getClass().getResourceAsStream("/Worlds/LittleRootcrop.png"));
			Town[1] = ImageIO.read(getClass().getResourceAsStream("/Worlds/LittleRootcrop2.png"));
			Town[2] = ImageIO.read(getClass().getResourceAsStream("/Worlds/LittleRootcrop3.png"));
			
			Lab =  ImageIO.read(getClass().getResourceAsStream("/Worlds/LittleRootLab.png"));
			Room1 = ImageIO.read(getClass().getResourceAsStream("/Worlds/LittleRootRoom1.png"));
			Room2 = ImageIO.read(getClass().getResourceAsStream("/Worlds/LittleRootRoom2.png"));
			Room3 = ImageIO.read(getClass().getResourceAsStream("/Worlds/LittleRootRoom3.png"));
			Room4 = ImageIO.read(getClass().getResourceAsStream("/Worlds/LittleRootRoom4.png"));
			
			
			smokeHouseSheet = new SpriteSheet(ImageIO.read(getClass().getResourceAsStream("/Sheets/House.png")));
			statueSheet = new SpriteSheet(ImageIO.read(getClass().getResourceAsStream("/Sheets/statueSheet.png")));

			iceSkillSheet = new SpriteSheet(ImageIO.read(getClass().getResourceAsStream("/Sheets/iceSkill.png")));
			fireSkillSheet = new SpriteSheet(ImageIO.read(getClass().getResourceAsStream("/Sheets/fireSkill.png")));
			defenceModeSheet=  new SpriteSheet(ImageIO.read(getClass().getResourceAsStream("/Sheets/defenceMode.png")));
			attackModeSheet=  new SpriteSheet(ImageIO.read(getClass().getResourceAsStream("/Sheets/attackMode.png")));

			PEnemySheet = new SpriteSheet(ImageIO.read(getClass().getResourceAsStream("/Sheets/P-enemy.png")));
			WEnemySheet = new SpriteSheet(ImageIO.read(getClass().getResourceAsStream("/Sheets/W-enemy.png")));
			REnemySheet = new SpriteSheet(ImageIO.read(getClass().getResourceAsStream("/Sheets/RayquazaSheetT.png")));
			GEnemySheet = new SpriteSheet(ImageIO.read(getClass().getResourceAsStream("/Sheets/GroudonSheet.png")));

			projectTitle = ImageIO.read(getClass().getResourceAsStream("/Buttons/ProjectWord.png"));
			ghost = ImageIO.read(getClass().getResourceAsStream("/Sheets/ghost.png"));


			
			textbox = ImageIO.read(getClass().getResourceAsStream("/Sheets/textbox.png"));
			cobblestone = ImageIO.read(getClass().getResourceAsStream("/Sheets/cobblestone.png"));
			professorhead = ImageIO.read(getClass().getResourceAsStream("/Sheets/professorhead.png"));

			E = ImageIO.read(getClass().getResourceAsStream("/Buttons/E.png"));
			TownEntity = ImageIO.read(getClass().getResourceAsStream("/Sheets/TownEntity.png"));
			TownEntityGUI = ImageIO.read(getClass().getResourceAsStream("/Sheets/TownEntity.png"));

			

			
			
			CaveMap = ImageIO.read(getClass().getResourceAsStream("/Worlds/CaveMap.png"));
			tree = ImageIO.read(getClass().getResourceAsStream("/Sheets/Tree.png"));
			title = ImageIO.read(getClass().getResourceAsStream("/Sheets/menuImage.png"));
			title2 = ImageIO.read(getClass().getResourceAsStream("/Sheets/Title.png"));
			title3 = ImageIO.read(getClass().getResourceAsStream("/Sheets/static.jpg"));
			title4 = ImageIO.read(getClass().getResourceAsStream("/Sheets/static1.jpg"));
			Loading = ImageIO.read(getClass().getResourceAsStream("/Sheets/loading.jpg"));
			titleImage = ImageIO.read(getClass().getResourceAsStream("/Sheets/Main3.png"));
			Stats = ImageIO.read(getClass().getResourceAsStream("/Sheets/Cartel Nota.png"));
			QST = ImageIO.read(getClass().getResourceAsStream("/Sheets/QST.png")); //Things sometimes just dont fit

			Pause = ImageIO.read(getClass().getResourceAsStream("/Buttons/Pause.png"));
			Resume[0] = ImageIO.read(getClass().getResourceAsStream("/Buttons/ResumeButton3.png"));
			Resume[1] = ImageIO.read(getClass().getResourceAsStream("/Buttons/ResumeButton1.png"));
			BTitle[0] = ImageIO.read(getClass().getResourceAsStream("/Buttons/BTitle.png"));
			BTitle[1] = ImageIO.read(getClass().getResourceAsStream("/Buttons/BTitleP.png"));
			BTitle[2] = ImageIO.read(getClass().getResourceAsStream("/Buttons/BTitleP.png"));
			Options[0] = ImageIO.read(getClass().getResourceAsStream("/Buttons/Options.png"));
			Options[1] = ImageIO.read(getClass().getResourceAsStream("/Buttons/OptionsP.png"));
			Options[2] = ImageIO.read(getClass().getResourceAsStream("/Buttons/OptionsP.png"));
			butstart[0] = ImageIO.read(getClass().getResourceAsStream("/Buttons/Start1.png"));
			butstart[1] = ImageIO.read(getClass().getResourceAsStream("/Buttons/Start2.png"));
			Quit[0] = ImageIO.read(getClass().getResourceAsStream("/Buttons/Quit1.png"));
			Quit[1] = ImageIO.read(getClass().getResourceAsStream("/Buttons/Quit2.png"));
			titleChoose[0] = ImageIO.read(getClass().getResourceAsStream("/Buttons/Title1.png"));
			titleChoose[1] = ImageIO.read(getClass().getResourceAsStream("/Buttons/Title2.png"));
			StatBut[0] = ImageIO.read(getClass().getResourceAsStream("/Buttons/Stats.png"));
			StatBut[1] = ImageIO.read(getClass().getResourceAsStream("/Buttons/Stats2.png"));

			battleBackground[0] = ImageIO.read(getClass().getResourceAsStream("/Sheets/mountain river.jpg"));
			battleBackground[1] = ImageIO.read(getClass().getResourceAsStream("/Sheets/forest.jpg"));
			battleBackground[2] = ImageIO.read(getClass().getResourceAsStream("/PixelEffects/README/SArea.png"));
			battleBackground[3] = ImageIO.read(getClass().getResourceAsStream("/Sheets/caveBackground.png"));

			Attack[0] = ImageIO.read(getClass().getResourceAsStream("/Buttons/Attack.png"));
			Defend[0] = ImageIO.read(getClass().getResourceAsStream("/Buttons/Defend.png"));
			Skill[0] = ImageIO.read(getClass().getResourceAsStream("/Buttons/Skill.png"));

			smokeHouse[0] = smokeHouseSheet.crop(20, 7, 19, 20);
			smokeHouse[1] = smokeHouseSheet.crop(68, 7, 19, 20);
			smokeHouse[2] = smokeHouseSheet.crop(116, 7, 19, 20);
			smokeHouse[3] = smokeHouseSheet.crop(164, 7, 19, 20);
			smokeHouse[4] = smokeHouseSheet.crop(212, 7, 19, 20);
			smokeHouse[5] = smokeHouseSheet.crop(260, 7, 19, 20);
			smokeHouse[6] = smokeHouseSheet.crop(308, 7, 19, 20);

			lightStatue[0] = statueSheet.crop(0, 0, 16, 48);
			lightStatue[1] = statueSheet.crop(16, 0, 16, 48);
			lightStatue[2] = statueSheet.crop(32, 0, 16, 48);
			lightStatue[3] = statueSheet.crop(48, 0, 16, 48);
			lightStatue[4] = statueSheet.crop(0, 48, 16, 48);
			lightStatue[5] = statueSheet.crop(16, 48, 16, 48);
			lightStatue[6] = statueSheet.crop(32, 48, 16, 48);
			lightStatue[7] = statueSheet.crop(48, 48, 16, 48);
			lightStatue[8] = statueSheet.crop(0, 96, 16, 48);
			lightStatue[9] = statueSheet.crop(0, 96, 16, 48);


			PEnemyIdle[0] = PEnemySheet.crop(0, 0, 38, 40);
			PEnemyIdle[1] = PEnemySheet.crop(39, 0, 39, 40);
			PEnemyIdle[2] = PEnemySheet.crop(78, 0, 39, 40);
			PEnemyIdle[3] = PEnemySheet.crop(118, 0, 36, 40);
			PEnemyIdle[4] = PEnemySheet.crop(155, 0, 36, 40);
			PEnemyIdle[5] = PEnemySheet.crop(192, 0, 37, 40);
			PEnemyIdle[6] = PEnemySheet.crop(233, 0, 37, 40);
			
			for(int i=0;i<6;i++) {
				REnemyIdle[i] = REnemySheet.crop(i*139, 4, 139, 100);
			}
			for(int i=0;i<4;i++) {
				REnemyIdle[i+6] = REnemySheet.crop(i*139, 112, 139, 100);
			}
			for(int i=0;i<6;i++) {
				REnemyIdle[i+10] = REnemySheet.crop(i*139, 4, 139, 100);
			}
			for(int i=0;i<5;i++) {
				REnemyIdle[i+16] = REnemySheet.crop(i*139, 112, 139, 100);
			}
			REnemyIdle[21] = REnemySheet.crop(5*139, 112, 139, 100);
			for(int i=0;i<6;i++) {
				REnemyIdle[i+22] = REnemySheet.crop(i*139, 223, 139, 100);
			}
			for(int i=0;i<6;i++) {
				REnemyIdle[i+28] = REnemySheet.crop(i*139, 331, 139, 100);
			}
			for(int i=0;i<6;i++) {
				REnemyIdle[i+34] = REnemySheet.crop(i*139, 440, 139, 100);
			}
			for(int i=0;i<6;i++) {
				REnemyIdle[i+40] = REnemySheet.crop(i*139, 545, 139, 100);
			}
			for(int i=0;i<2;i++) {
				REnemyIdle[i+46] = REnemySheet.crop(i*139, 652, 139, 100);
			}
			
			
			
			
			for(int j=0;j<5;j++) {
			for(int i=0;i<10;i++) {
				GEnemyIdle[i+10*j] = GEnemySheet.crop(i*106, 50+90*j, 106, 79);
			}
			}
			
			
			

			playerSheet =  new SpriteSheet(ImageIO.read(getClass().getResourceAsStream("/Sheets/player.png")));

			player_front[0] = playerSheet.crop(1, 6, 15, 27);
			player_front[1] = playerSheet.crop(17, 7, 15, 27);
			player_front[2] = playerSheet.crop(33, 6, 15, 27);
			player_front[3] = playerSheet.crop(49, 7, 15, 27);

			player_left[0] = playerSheet.crop(1, 102, 13, 22);
			player_left[1] = playerSheet.crop(17, 102, 13, 22);
			player_left[2] = playerSheet.crop(33, 102, 13, 22);
			player_left[3] = playerSheet.crop(49, 102, 13, 22);

			player_right[0] = playerSheet.crop(2, 38, 13, 22);
			player_right[1] = playerSheet.crop(18, 38, 13, 22);
			player_right[2] = playerSheet.crop(34, 38, 13, 22);
			player_right[3] = playerSheet.crop(50, 38, 13, 22);

			player_back[0] = playerSheet.crop(0, 69, 15, 23);
			player_back[1] = playerSheet.crop(16, 69, 15, 23);
			player_back[2] = playerSheet.crop(32, 69, 15, 23);
			player_back[3] = playerSheet.crop(48, 69, 15, 23);

			player_attack = ImageIO.read(getClass().getResourceAsStream("/Sheets/playerAttack.png"));
			
			
			pikaSheet = new SpriteSheet(ImageIO.read(getClass().getResourceAsStream("/Sheets/PikaSpriteSheet.png")));
			
			pika_front[0] = pikaSheet.crop(26, 0, 20, 26);
			pika_front[1] = pikaSheet.crop(48, 0, 20, 26);
		
			pika_frontleft[0] = pikaSheet.crop(95, 0, 22, 26);
			pika_frontleft[1] = pikaSheet.crop(118, 0, 22, 26);
			
			pika_left[0] = pikaSheet.crop(166, 0, 22, 26);
			pika_left[1] = pikaSheet.crop(189, 0, 22, 26);
			
			pika_backleft[0] = pikaSheet.crop(238, 0, 25, 26);
			pika_backleft[1] = pikaSheet.crop(263, 0, 25, 26);
			
			pika_back[0] = pikaSheet.crop(316, 0, 22, 26);
			pika_back[1] = pikaSheet.crop(340, 0, 22, 26);
			
			pika_backright[0] = pikaSheet.crop(392, 74, 25, 26);
			pika_backright[1] = pikaSheet.crop(417, 74, 25, 26);
			
			pika_right[0] = pikaSheet.crop(469, 74, 22 ,26);
			pika_right[1] = pikaSheet.crop(492, 74, 22, 26);
			
			pika_frontright[0] = pikaSheet.crop(540, 74, 22 ,26);
			pika_frontright[1] = pikaSheet.crop(563, 74, 22 ,26);
			
			pika_idle[0] = pikaSheet.crop(3, 0, 20, 26);			//front
			pika_idle[1] = pikaSheet.crop(71, 0, 22, 26);			//frontleft
			pika_idle[2] = pikaSheet.crop(142, 0, 22, 26);			//left
			pika_idle[3] = pikaSheet.crop(213, 0, 25, 26);			//backleft
			pika_idle[4] = pikaSheet.crop(291, 0, 22, 26);			//back
			pika_idle[5] = pikaSheet.crop(442, 74, 22, 26);			//backright
			pika_idle[6] = pikaSheet.crop(516, 74, 22, 26);			//right
			pika_idle[7] = pikaSheet.crop(587, 74, 22, 26);			//frontright
			
			
			raySheet = new SpriteSheet(ImageIO.read(getClass().getResourceAsStream("/Sheets/RaquazaTiny.png")));
			
			ray_idle[0] = raySheet.crop(0, 39, 64, 68);
			ray_idle[1] = raySheet.crop(67, 39, 64, 68);
			ray_idle[2] = raySheet.crop(134, 39, 64, 68);

			
			grouSheet = new SpriteSheet(ImageIO.read(getClass().getResourceAsStream("/Sheets/GroudonTiny.png")));
			grou_idle[0] = grouSheet.crop(120, 18, 40, 40);
			grou_idle[1] = grouSheet.crop(120, 18, 40, 40);


			Enemy[0] = ImageIO.read(getClass().getResourceAsStream("/Sheets/E1.png"));
			Enemy[1] = ImageIO.read(getClass().getResourceAsStream("/Sheets/E2.png"));
			Enemy[2] = ImageIO.read(getClass().getResourceAsStream("/Sheets/E3.png"));
			Enemy[3] = ImageIO.read(getClass().getResourceAsStream("/Sheets/E4.png"));
			Enemy[4] = ImageIO.read(getClass().getResourceAsStream("/Sheets/E4.png"));
			Enemy[5] = ImageIO.read(getClass().getResourceAsStream("/Sheets/E3.png"));
			Enemy[6] = ImageIO.read(getClass().getResourceAsStream("/Sheets/E2.png"));
			Enemy[7] = ImageIO.read(getClass().getResourceAsStream("/Sheets/E1.png"));

			aura[0] = ImageIO.read(getClass().getResourceAsStream("/PixelEffects/README/Saura1.png"));
			aura[1] = ImageIO.read(getClass().getResourceAsStream("/PixelEffects/README/Saura2.png"));
			aura[2] = ImageIO.read(getClass().getResourceAsStream("/PixelEffects/README/Saura3.png"));
			aura[3] = ImageIO.read(getClass().getResourceAsStream("/PixelEffects/README/Saura4.png"));

			EnemyS[0] = ImageIO.read(getClass().getResourceAsStream("/PixelEffects/README/S1.1.png"));
			EnemyS[1] = ImageIO.read(getClass().getResourceAsStream("/PixelEffects/README/S1.2.png"));
			EnemyS[2] = ImageIO.read(getClass().getResourceAsStream("/PixelEffects/README/S1.3.png"));
			EnemyS[3] = ImageIO.read(getClass().getResourceAsStream("/PixelEffects/README/S1.4.png"));
			EnemyS[4] = ImageIO.read(getClass().getResourceAsStream("/PixelEffects/README/S1.5.png"));
			EnemyS[5] = ImageIO.read(getClass().getResourceAsStream("/PixelEffects/README/S1.6.png"));
			EnemyS[6] = ImageIO.read(getClass().getResourceAsStream("/PixelEffects/README/S1.7.png"));
			EnemyS[7] = ImageIO.read(getClass().getResourceAsStream("/PixelEffects/README/S1.8.png"));
			EnemyS[8] = ImageIO.read(getClass().getResourceAsStream("/PixelEffects/README/S1.8.png"));
			EnemyS[9] = ImageIO.read(getClass().getResourceAsStream("/PixelEffects/README/S1.7.png"));
			EnemyS[10] = ImageIO.read(getClass().getResourceAsStream("/PixelEffects/README/S1.6.png"));
			EnemyS[11] = ImageIO.read(getClass().getResourceAsStream("/PixelEffects/README/S1.5.png"));
			EnemyS[12] = ImageIO.read(getClass().getResourceAsStream("/PixelEffects/README/S1.4.png"));
			EnemyS[13] = ImageIO.read(getClass().getResourceAsStream("/PixelEffects/README/S1.3.png"));
			EnemyS[14] = ImageIO.read(getClass().getResourceAsStream("/PixelEffects/README/S1.2.png"));
			EnemyS[15] = ImageIO.read(getClass().getResourceAsStream("/PixelEffects/README/S1.1.png"));

			SSkill[0] =  ImageIO.read(getClass().getResourceAsStream("/PixelEffects/README/SAttack0.png"));
			SSkill[1] =  ImageIO.read(getClass().getResourceAsStream("/PixelEffects/README/SAttack1.png"));
			SSkill[2] =  ImageIO.read(getClass().getResourceAsStream("/PixelEffects/README/SAttack2.png"));
			SSkill[3] =  ImageIO.read(getClass().getResourceAsStream("/PixelEffects/README/SAttack3.png"));
			SSkill[4] =  ImageIO.read(getClass().getResourceAsStream("/PixelEffects/README/SAttack4.png"));
			SSkill[5] =  ImageIO.read(getClass().getResourceAsStream("/PixelEffects/README/SAttack5.png"));
			SSkill[6] = SSkill[5];
			SSkill[7] = SSkill[4];
			SSkill[8] = SSkill[3];
			SSkill[9] = SSkill[2];
			SSkill[10] = SSkill[1];
			SSkill[11] = SSkill[0];
			SSkill[12] = SSkill[0];
			SSkill[13] = SSkill[1];
			SSkill[14] = SSkill[3];
			SSkill[15] = SSkill[4];
			SSkill[16] = SSkill[5];
			SSkill[17] = SSkill[5];
			SSkill[18] = SSkill[4];
			SSkill[19] = SSkill[3];
			SSkill[20] = SSkill[2];
			SSkill[21] = SSkill[1];
			SSkill[22] = SSkill[0];

			SItem[0] = ImageIO.read(getClass().getResourceAsStream("/PixelEffects/README/SS1.png"));
			SItem[1] = ImageIO.read(getClass().getResourceAsStream("/PixelEffects/README/SS2.png"));
			SItem[2] = ImageIO.read(getClass().getResourceAsStream("/PixelEffects/README/SS3.png"));
			SItem[3] = ImageIO.read(getClass().getResourceAsStream("/PixelEffects/README/SS4.png"));
			SItem[4] = ImageIO.read(getClass().getResourceAsStream("/PixelEffects/README/SS5.png"));
			SItem[5] = ImageIO.read(getClass().getResourceAsStream("/PixelEffects/README/SS6.png"));
			SItem[6] = ImageIO.read(getClass().getResourceAsStream("/PixelEffects/README/SS7.png"));
			SItem[7] = ImageIO.read(getClass().getResourceAsStream("/PixelEffects/README/SS8.png"));
			SItem[8] = SItem[7];
			SItem[9] = SItem[6];
			SItem[10] = SItem[5];
			SItem[11] = SItem[4];
			SItem[12] = SItem[3];
			SItem[13] = SItem[2];
			SItem[14] = SItem[1];
			SItem[15] = SItem[1];

			IceSkill[0] = iceSkillSheet.crop( 0, 0, 50, 50);
			IceSkill[1] = iceSkillSheet.crop( 0, 0, 50, 50);
			IceSkill[2] = iceSkillSheet.crop( 52, 0, 50, 50);
			IceSkill[3] = iceSkillSheet.crop( 0, 52 , 50, 50);
			IceSkill[4] = iceSkillSheet.crop( 52, 52 , 50, 50);
			IceSkill[5] = iceSkillSheet.crop( 104, 0, 50, 50);
			IceSkill[6] = iceSkillSheet.crop( 0, 104, 50, 50);
			IceSkill[7] = iceSkillSheet.crop( 52, 104, 50, 50);
			IceSkill[8] = iceSkillSheet.crop( 104, 52, 50, 50);
			IceSkill[9] = iceSkillSheet.crop( 104, 104, 50, 50);
			IceSkill[10] = iceSkillSheet.crop( 156, 0, 50, 50);
			IceSkill[11] = iceSkillSheet.crop( 0, 156, 50, 50);
			IceSkill[12] = iceSkillSheet.crop( 52, 156, 50, 50);
			IceSkill[13] = iceSkillSheet.crop( 156, 52, 50, 50);
			IceSkill[14] = iceSkillSheet.crop( 104, 156, 50, 50);
			IceSkill[15] = iceSkillSheet.crop( 156, 104, 50, 50);
			IceSkill[16] = iceSkillSheet.crop( 208, 0, 50, 50);
			IceSkill[17] = iceSkillSheet.crop( 0, 208, 50, 50);
			IceSkill[18] = iceSkillSheet.crop( 52, 208, 50, 50);
			IceSkill[19] = iceSkillSheet.crop( 208, 52, 50, 50);
			IceSkill[20] = iceSkillSheet.crop( 156, 156, 50, 50);
			IceSkill[21] = iceSkillSheet.crop( 104, 208, 50, 50);
			IceSkill[22] = iceSkillSheet.crop( 208, 104, 50, 50);
			IceSkill[23] = iceSkillSheet.crop( 156, 208, 50, 50);
			IceSkill[24] = iceSkillSheet.crop( 208, 156, 50, 50);
			IceSkill[25] = iceSkillSheet.crop( 260, 0, 50, 50);
			IceSkill[26] = iceSkillSheet.crop( 0, 260, 50, 50);
			IceSkill[27] = iceSkillSheet.crop( 52, 260, 50, 50);
			IceSkill[28] = iceSkillSheet.crop( 260, 52, 50, 50);
			IceSkill[29] = iceSkillSheet.crop( 104, 260, 50, 50);
			IceSkill[30] = iceSkillSheet.crop( 260, 104, 50, 50);
			IceSkill[31] = iceSkillSheet.crop( 208, 208, 50, 50);
			IceSkill[32] = iceSkillSheet.crop( 156, 260, 50, 50);
			IceSkill[33] = iceSkillSheet.crop( 260, 156, 50, 50);
			IceSkill[34] = iceSkillSheet.crop( 312, 0, 50, 50);
			IceSkill[35] = iceSkillSheet.crop( 0, 312, 50, 50);
			IceSkill[36] = iceSkillSheet.crop( 52, 312, 50, 50);
			IceSkill[37] = iceSkillSheet.crop( 312, 52, 50, 50);
			IceSkill[38] = iceSkillSheet.crop( 104, 312, 50, 50);
			IceSkill[39] = iceSkillSheet.crop( 312, 104, 50, 50);
			IceSkill[40] = iceSkillSheet.crop( 208, 260, 50, 50);
			IceSkill[41] = iceSkillSheet.crop( 260, 208, 50, 50);
			IceSkill[42] = iceSkillSheet.crop( 156, 312, 50, 50);
			IceSkill[43] = iceSkillSheet.crop( 312, 156, 50, 50);
			IceSkill[44] = iceSkillSheet.crop( 364, 0, 50, 50);
			IceSkill[45] = iceSkillSheet.crop( 0, 364, 50, 50);
			IceSkill[46] = iceSkillSheet.crop( 52, 364, 50, 50);
			IceSkill[47] = iceSkillSheet.crop( 260, 260, 50, 50);
			IceSkill[48] = iceSkillSheet.crop( 364, 52, 50, 50);
			IceSkill[49] = iceSkillSheet.crop( 208, 312, 50, 50);
			IceSkill[50] = iceSkillSheet.crop( 312, 208, 50, 50);
			IceSkill[51] = iceSkillSheet.crop( 104, 364, 50, 50);
			IceSkill[52] = iceSkillSheet.crop( 364, 104, 50, 50);
			IceSkill[53] = iceSkillSheet.crop( 156, 364, 50, 50);
			IceSkill[54] = iceSkillSheet.crop( 364, 156, 50, 50);
			IceSkill[55] = iceSkillSheet.crop( 260, 312, 50, 50);
			IceSkill[56] = iceSkillSheet.crop( 312, 260, 50, 50);
			IceSkill[57] = iceSkillSheet.crop( 416, 0, 50, 50);
			IceSkill[58] = iceSkillSheet.crop( 0, 416, 50, 50);
			IceSkill[59] = iceSkillSheet.crop( 52, 416, 50, 50);
			IceSkill[60] = iceSkillSheet.crop( 208, 364, 50, 50);
			IceSkill[61] = iceSkillSheet.crop( 364, 208, 50, 50);
			IceSkill[62] = iceSkillSheet.crop( 416, 52, 50, 50);
			IceSkill[63] = iceSkillSheet.crop( 104, 416, 50, 50);
			IceSkill[64] = iceSkillSheet.crop( 416, 104, 50, 50);
			IceSkill[65] = iceSkillSheet.crop( 312, 312, 50, 50);
			IceSkill[66] = iceSkillSheet.crop( 156, 416, 50, 50);
			IceSkill[67] = iceSkillSheet.crop( 416, 156, 50, 50);
			IceSkill[68] = iceSkillSheet.crop( 260, 364, 50, 50);
			IceSkill[69] = iceSkillSheet.crop( 364, 260, 50, 50);
			IceSkill[70] = iceSkillSheet.crop( 208, 416, 50, 50);
			IceSkill[71] = iceSkillSheet.crop( 416, 208, 50, 50);
			IceSkill[72] = iceSkillSheet.crop( 468, 0, 50, 50);
			IceSkill[73] = iceSkillSheet.crop( 468, 52, 50, 50);
			IceSkill[74] = iceSkillSheet.crop( 312, 364, 50, 50);
			IceSkill[75] = iceSkillSheet.crop( 364, 312, 50, 50);
			IceSkill[76] = iceSkillSheet.crop( 468, 104, 50, 50);
			IceSkill[77] = iceSkillSheet.crop( 260, 416, 50, 50);
			IceSkill[78] = iceSkillSheet.crop( 416, 260, 50, 50);
			IceSkill[79] = iceSkillSheet.crop( 468, 156, 50, 50);
			IceSkill[80] = iceSkillSheet.crop( 468, 208, 50, 50);
			IceSkill[81] = iceSkillSheet.crop( 364, 364, 50, 50);
			IceSkill[82] = iceSkillSheet.crop( 312, 416, 50, 50);
			IceSkill[83] = iceSkillSheet.crop( 416, 312, 50, 50);
			IceSkill[84] = iceSkillSheet.crop( 468, 260, 50, 50);
			IceSkill[85] = iceSkillSheet.crop( 364, 416, 50, 50);
			IceSkill[86] = iceSkillSheet.crop( 416, 364, 50, 50);
			IceSkill[87] = iceSkillSheet.crop( 468, 312, 50, 50);
			IceSkill[88] = iceSkillSheet.crop( 0, 0, 50, 50);
			IceSkill[89] = iceSkillSheet.crop( 0, 0, 50, 50);
			IceSkill[90] = iceSkillSheet.crop( 0, 0, 50, 50);
			IceSkill[91] = iceSkillSheet.crop( 0, 0, 50, 50);
			IceSkill[92] = iceSkillSheet.crop( 0, 0, 50, 50);
			IceSkill[93] = iceSkillSheet.crop( 0, 0, 50, 50);
			IceSkill[94] = iceSkillSheet.crop( 0, 0, 50, 50);
			IceSkill[95] = iceSkillSheet.crop( 0, 0, 50, 50);
			IceSkill[96] = iceSkillSheet.crop( 0, 0, 50, 50);
			IceSkill[97] = iceSkillSheet.crop( 0, 0, 50, 50);
			IceSkill[98] = iceSkillSheet.crop( 0, 0, 50, 50);
			IceSkill[99] = iceSkillSheet.crop( 0, 0, 50, 50);


			DefenceMode[0] = defenceModeSheet.crop( 0, 0, 50, 50);
			DefenceMode[1] = defenceModeSheet.crop( 0, 0, 50, 50);
			DefenceMode[2] = defenceModeSheet.crop( 0, 0, 50, 50);
			DefenceMode[3] = defenceModeSheet.crop( 0, 0, 50, 50);
			DefenceMode[4] = defenceModeSheet.crop( 0, 0, 50, 50);
			DefenceMode[5] = defenceModeSheet.crop( 0, 0, 50, 50);
			DefenceMode[6] = defenceModeSheet.crop( 0, 0, 50, 50);
			DefenceMode[7] = defenceModeSheet.crop( 0, 0, 50, 50);
			DefenceMode[8] = defenceModeSheet.crop( 0, 0, 50, 50);
			DefenceMode[9] = defenceModeSheet.crop( 52, 0, 50, 50);
			DefenceMode[10] = defenceModeSheet.crop( 0, 52 , 50, 50);
			DefenceMode[11] = defenceModeSheet.crop( 52, 52 , 50, 50);
			DefenceMode[12] = defenceModeSheet.crop( 104, 0, 50, 50);
			DefenceMode[13] = defenceModeSheet.crop( 0, 104, 50, 50);
			DefenceMode[14] = defenceModeSheet.crop( 52, 104, 50, 50);
			DefenceMode[15] = defenceModeSheet.crop( 104, 52, 50, 50);
			DefenceMode[16] = defenceModeSheet.crop( 104, 104, 50, 50);
			DefenceMode[17] = defenceModeSheet.crop( 156, 0, 50, 50);
			DefenceMode[18] = defenceModeSheet.crop( 0, 156, 50, 50);
			DefenceMode[19] = defenceModeSheet.crop( 52, 156, 50, 50);
			DefenceMode[20] = defenceModeSheet.crop( 156, 52, 50, 50);
			DefenceMode[21] = defenceModeSheet.crop( 104, 156, 50, 50);
			DefenceMode[22] = defenceModeSheet.crop( 156, 104, 50, 50);
			DefenceMode[23] = defenceModeSheet.crop( 208, 0, 50, 50);
			DefenceMode[24] = defenceModeSheet.crop( 0, 208, 50, 50);
			DefenceMode[25] = defenceModeSheet.crop( 52, 208, 50, 50);
			DefenceMode[26] = defenceModeSheet.crop( 208, 52, 50, 50);
			DefenceMode[27] = defenceModeSheet.crop( 156, 156, 50, 50);
			DefenceMode[28] = defenceModeSheet.crop( 104, 208, 50, 50);
			DefenceMode[29] = defenceModeSheet.crop( 208, 104, 50, 50);
			DefenceMode[30] = defenceModeSheet.crop( 156, 208, 50, 50);
			DefenceMode[31] = defenceModeSheet.crop( 208, 156, 50, 50);
			DefenceMode[32] = defenceModeSheet.crop( 260, 0, 50, 50);
			DefenceMode[33] = defenceModeSheet.crop( 0, 260, 50, 50);
			DefenceMode[34] = defenceModeSheet.crop( 52, 260, 50, 50);
			DefenceMode[35] = defenceModeSheet.crop( 260, 52, 50, 50);
			DefenceMode[36] = defenceModeSheet.crop( 104, 260, 50, 50);
			DefenceMode[37] = defenceModeSheet.crop( 260, 104, 50, 50);
			DefenceMode[38] = defenceModeSheet.crop( 208, 208, 50, 50);
			DefenceMode[39] = defenceModeSheet.crop( 156, 260, 50, 50);
			DefenceMode[40] = defenceModeSheet.crop( 260, 156, 50, 50);
			DefenceMode[41] = defenceModeSheet.crop( 312, 0, 50, 50);
			DefenceMode[42] = defenceModeSheet.crop( 0, 312, 50, 50);
			DefenceMode[43] = defenceModeSheet.crop( 52, 312, 50, 50);
			DefenceMode[44] = defenceModeSheet.crop( 312, 52, 50, 50);
			DefenceMode[45] = defenceModeSheet.crop( 104, 312, 50, 50);
			DefenceMode[46] = defenceModeSheet.crop( 312, 104, 50, 50);
			DefenceMode[47] = defenceModeSheet.crop( 208, 260, 50, 50);
			DefenceMode[48] = defenceModeSheet.crop( 260, 208, 50, 50);
			DefenceMode[49] = defenceModeSheet.crop( 156, 312, 50, 50);
			DefenceMode[50] = defenceModeSheet.crop( 312, 156, 50, 50);
			DefenceMode[51] = defenceModeSheet.crop( 364, 0, 50, 50);
			DefenceMode[52] = defenceModeSheet.crop( 0, 364, 50, 50);
			DefenceMode[53] = defenceModeSheet.crop( 52, 364, 50, 50);
			DefenceMode[54] = defenceModeSheet.crop( 260, 260, 50, 50);
			DefenceMode[55] = defenceModeSheet.crop( 364, 52, 50, 50);
			DefenceMode[56] = defenceModeSheet.crop( 208, 312, 50, 50);
			DefenceMode[57] = defenceModeSheet.crop( 312, 208, 50, 50);
			DefenceMode[58] = defenceModeSheet.crop( 104, 364, 50, 50);
			DefenceMode[59] = defenceModeSheet.crop( 364, 104, 50, 50);
			DefenceMode[60] = defenceModeSheet.crop( 156, 364, 50, 50);
			DefenceMode[61] = defenceModeSheet.crop( 364, 156, 50, 50);
			DefenceMode[62] = defenceModeSheet.crop( 260, 312, 50, 50);
			DefenceMode[63] = defenceModeSheet.crop( 312, 260, 50, 50);
			DefenceMode[64] = defenceModeSheet.crop( 416, 0, 50, 50);
			DefenceMode[65] = defenceModeSheet.crop( 0, 416, 50, 50);
			DefenceMode[66] = defenceModeSheet.crop( 52, 416, 50, 50);
			DefenceMode[67] = defenceModeSheet.crop( 208, 364, 50, 50);
			DefenceMode[68] = defenceModeSheet.crop( 364, 208, 50, 50);
			DefenceMode[69] = defenceModeSheet.crop( 416, 52, 50, 50);
			DefenceMode[70] = defenceModeSheet.crop( 104, 416, 50, 50);
			DefenceMode[71] = defenceModeSheet.crop( 416, 104, 50, 50);
			DefenceMode[72] = defenceModeSheet.crop( 312, 312, 50, 50);
			DefenceMode[73] = defenceModeSheet.crop( 156, 416, 50, 50);
			DefenceMode[74] = defenceModeSheet.crop( 416, 156, 50, 50);
			DefenceMode[75] = defenceModeSheet.crop( 260, 364, 50, 50);
			DefenceMode[76] = defenceModeSheet.crop( 364, 260, 50, 50);
			DefenceMode[77] = defenceModeSheet.crop( 208, 416, 50, 50);
			DefenceMode[78] = defenceModeSheet.crop( 416, 208, 50, 50);
			DefenceMode[79] = defenceModeSheet.crop( 312, 364, 50, 50);
			DefenceMode[80] = defenceModeSheet.crop( 364, 312, 50, 50);
			DefenceMode[81] = defenceModeSheet.crop( 260, 416, 50, 50);
			DefenceMode[82] = defenceModeSheet.crop( 416, 260, 50, 50);
			DefenceMode[83] = defenceModeSheet.crop( 0, 0, 50, 50);
			DefenceMode[84] = defenceModeSheet.crop( 364, 364, 50, 50);
			DefenceMode[85] = defenceModeSheet.crop( 0, 0, 50, 50);
			DefenceMode[86] = defenceModeSheet.crop( 0, 0, 50, 50);
			DefenceMode[87] = defenceModeSheet.crop( 0, 0, 50, 50);
			DefenceMode[88] = defenceModeSheet.crop( 0, 0, 50, 50);
			DefenceMode[89] = defenceModeSheet.crop( 0, 0, 50, 50);
			DefenceMode[90] = defenceModeSheet.crop( 0, 0, 50, 50);
			DefenceMode[91] = defenceModeSheet.crop( 0, 0, 50, 50);
			DefenceMode[92] = defenceModeSheet.crop( 0, 0, 50, 50);
			DefenceMode[93] = defenceModeSheet.crop( 0, 0, 50, 50);
			DefenceMode[94] = defenceModeSheet.crop( 0, 0, 50, 50);
			DefenceMode[95] = defenceModeSheet.crop( 0, 0, 50, 50);
			DefenceMode[96] = defenceModeSheet.crop( 0, 0, 50, 50);
			DefenceMode[97] = defenceModeSheet.crop( 0, 0, 50, 50);
			DefenceMode[98] = defenceModeSheet.crop( 0, 0, 50, 50);
			DefenceMode[99] = defenceModeSheet.crop( 0, 0, 50, 50);


			AttackMode[0] = attackModeSheet.crop( 0, 0, 50, 50);
			AttackMode[1] = attackModeSheet.crop( 0, 0, 50, 50);
			AttackMode[2] = attackModeSheet.crop( 0, 0, 50, 50);
			AttackMode[3] = attackModeSheet.crop( 0, 0, 50, 50);
			AttackMode[4] = attackModeSheet.crop( 0, 0, 50, 50);
			AttackMode[5] = attackModeSheet.crop( 0, 0, 50, 50);
			AttackMode[6] = attackModeSheet.crop( 0, 0, 50, 50);
			AttackMode[7] = attackModeSheet.crop( 0, 0, 50, 50);
			AttackMode[8] = attackModeSheet.crop( 52, 0, 50, 50);
			AttackMode[9] = attackModeSheet.crop( 0, 52 , 50, 50);
			AttackMode[10] = attackModeSheet.crop( 52, 52 , 50, 50);
			AttackMode[11] = attackModeSheet.crop( 104, 0, 50, 50);
			AttackMode[12] = attackModeSheet.crop( 0, 104, 50, 50);
			AttackMode[13] = attackModeSheet.crop( 52, 104, 50, 50);
			AttackMode[14] = attackModeSheet.crop( 104, 52, 50, 50);
			AttackMode[15] = attackModeSheet.crop( 104, 104, 50, 50);
			AttackMode[16] = attackModeSheet.crop( 156, 0, 50, 50);
			AttackMode[17] = attackModeSheet.crop( 0, 156, 50, 50);
			AttackMode[18] = attackModeSheet.crop( 52, 156, 50, 50);
			AttackMode[19] = attackModeSheet.crop( 156, 52, 50, 50);
			AttackMode[20] = attackModeSheet.crop( 104, 156, 50, 50);
			AttackMode[21] = attackModeSheet.crop( 156, 104, 50, 50);
			AttackMode[22] = attackModeSheet.crop( 208, 0, 50, 50);
			AttackMode[23] = attackModeSheet.crop( 0, 208, 50, 50);
			AttackMode[24] = attackModeSheet.crop( 52, 208, 50, 50);
			AttackMode[25] = attackModeSheet.crop( 208, 52, 50, 50);
			AttackMode[26] = attackModeSheet.crop( 156, 156, 50, 50);
			AttackMode[27] = attackModeSheet.crop( 104, 208, 50, 50);
			AttackMode[28] = attackModeSheet.crop( 208, 104, 50, 50);
			AttackMode[29] = attackModeSheet.crop( 156, 208, 50, 50);
			AttackMode[30] = attackModeSheet.crop( 208, 156, 50, 50);
			AttackMode[31] = attackModeSheet.crop( 260, 0, 50, 50);
			AttackMode[32] = attackModeSheet.crop( 0, 260, 50, 50);
			AttackMode[33] = attackModeSheet.crop( 52, 260, 50, 50);
			AttackMode[34] = attackModeSheet.crop( 260, 52, 50, 50);
			AttackMode[35] = attackModeSheet.crop( 104, 260, 50, 50);
			AttackMode[36] = attackModeSheet.crop( 260, 104, 50, 50);
			AttackMode[37] = attackModeSheet.crop( 208, 208, 50, 50);
			AttackMode[38] = attackModeSheet.crop( 156, 260, 50, 50);
			AttackMode[39] = attackModeSheet.crop( 260, 156, 50, 50);
			AttackMode[40] = attackModeSheet.crop( 312, 0, 50, 50);
			AttackMode[41] = attackModeSheet.crop( 0, 312, 50, 50);
			AttackMode[42] = attackModeSheet.crop( 52, 312, 50, 50);
			AttackMode[43] = attackModeSheet.crop( 312, 52, 50, 50);
			AttackMode[44] = attackModeSheet.crop( 104, 312, 50, 50);
			AttackMode[45] = attackModeSheet.crop( 312, 104, 50, 50);
			AttackMode[46] = attackModeSheet.crop( 208, 260, 50, 50);
			AttackMode[47] = attackModeSheet.crop( 260, 208, 50, 50);
			AttackMode[48] = attackModeSheet.crop( 156, 312, 50, 50);
			AttackMode[49] = attackModeSheet.crop( 312, 156, 50, 50);
			AttackMode[50] = attackModeSheet.crop( 364, 0, 50, 50);
			AttackMode[51] = attackModeSheet.crop( 0, 364, 50, 50);
			AttackMode[52] = attackModeSheet.crop( 52, 364, 50, 50);
			AttackMode[53] = attackModeSheet.crop( 260, 260, 50, 50);
			AttackMode[54] = attackModeSheet.crop( 364, 52, 50, 50);
			AttackMode[55] = attackModeSheet.crop( 208, 312, 50, 50);
			AttackMode[56] = attackModeSheet.crop( 312, 208, 50, 50);
			AttackMode[57] = attackModeSheet.crop( 104, 364, 50, 50);
			AttackMode[58] = attackModeSheet.crop( 364, 104, 50, 50);
			AttackMode[59] = attackModeSheet.crop( 156, 364, 50, 50);
			AttackMode[60] = attackModeSheet.crop( 364, 156, 50, 50);
			AttackMode[61] = attackModeSheet.crop( 260, 312, 50, 50);
			AttackMode[62] = attackModeSheet.crop( 312, 260, 50, 50);
			AttackMode[63] = attackModeSheet.crop( 416, 0, 50, 50);
			AttackMode[64] = attackModeSheet.crop( 0, 416, 50, 50);
			AttackMode[65] = attackModeSheet.crop( 52, 416, 50, 50);
			AttackMode[66] = attackModeSheet.crop( 208, 364, 50, 50);
			AttackMode[67] = attackModeSheet.crop( 364, 208, 50, 50);
			AttackMode[68] = attackModeSheet.crop( 416, 52, 50, 50);
			AttackMode[69] = attackModeSheet.crop( 104, 416, 50, 50);
			AttackMode[70] = attackModeSheet.crop( 416, 104, 50, 50);
			AttackMode[71] = attackModeSheet.crop( 312, 312, 50, 50);
			AttackMode[72] = attackModeSheet.crop( 156, 416, 50, 50);
			AttackMode[73] = attackModeSheet.crop( 416, 156, 50, 50);
			AttackMode[74] = attackModeSheet.crop( 260, 364, 50, 50);
			AttackMode[75] = attackModeSheet.crop( 364, 260, 50, 50);
			AttackMode[76] = attackModeSheet.crop( 208, 416, 50, 50);
			AttackMode[77] = attackModeSheet.crop( 416, 208, 50, 50);
			AttackMode[78] = attackModeSheet.crop( 312, 364, 50, 50);
			AttackMode[79] = attackModeSheet.crop( 364, 312, 50, 50);
			AttackMode[80] = attackModeSheet.crop( 260, 416, 50, 50);
			AttackMode[81] = attackModeSheet.crop( 416, 260, 50, 50);
			AttackMode[82] = attackModeSheet.crop( 364, 364, 50, 50);
			AttackMode[83] = attackModeSheet.crop( 312, 416, 50, 50);
			AttackMode[84] = attackModeSheet.crop( 0, 0, 50, 50);
			AttackMode[85] = attackModeSheet.crop( 0, 0, 50, 50);
			AttackMode[86] = attackModeSheet.crop( 0, 0, 50, 50);
			AttackMode[87] = attackModeSheet.crop( 0, 0, 50, 50);
			AttackMode[88] = attackModeSheet.crop( 0, 0, 50, 50);
			AttackMode[89] = attackModeSheet.crop( 0, 0, 50, 50);
			AttackMode[90] = attackModeSheet.crop( 0, 0, 50, 50);
			AttackMode[91] = attackModeSheet.crop( 0, 0, 50, 50);
			AttackMode[92] = attackModeSheet.crop( 0, 0, 50, 50);
			AttackMode[93] = attackModeSheet.crop( 0, 0, 50, 50);
			AttackMode[94] = attackModeSheet.crop( 0, 0, 50, 50);
			AttackMode[95] = attackModeSheet.crop( 0, 0, 50, 50);
			AttackMode[96] = attackModeSheet.crop( 0, 0, 50, 50);
			AttackMode[97] = attackModeSheet.crop( 0, 0, 50, 50);
			AttackMode[98] = attackModeSheet.crop( 0, 0, 50, 50);
			AttackMode[99] = attackModeSheet.crop( 0, 0, 50, 50);

			FireSkill[0] = fireSkillSheet.crop( 0, 0, 50, 50);
			FireSkill[1] = fireSkillSheet.crop( 52, 0, 50, 50);
			FireSkill[2] = fireSkillSheet.crop( 0, 52 , 50, 50);
			FireSkill[3] = fireSkillSheet.crop( 52, 52 , 50, 50);
			FireSkill[4] = fireSkillSheet.crop( 104, 0, 50, 50);
			FireSkill[5] = fireSkillSheet.crop( 0, 104, 50, 50);
			FireSkill[6] = fireSkillSheet.crop( 52, 104, 50, 50);
			FireSkill[7] = fireSkillSheet.crop( 104, 52, 50, 50);
			FireSkill[8] = fireSkillSheet.crop( 104, 104, 50, 50);
			FireSkill[9] = fireSkillSheet.crop( 156, 0, 50, 50);
			FireSkill[10] = fireSkillSheet.crop( 0, 156, 50, 50);
			FireSkill[11] = fireSkillSheet.crop( 52, 156, 50, 50);
			FireSkill[12] = fireSkillSheet.crop( 156, 52, 50, 50);
			FireSkill[13] = fireSkillSheet.crop( 104, 156, 50, 50);
			FireSkill[14] = fireSkillSheet.crop( 156, 104, 50, 50);
			FireSkill[15] = fireSkillSheet.crop( 208, 0, 50, 50);
			FireSkill[16] = fireSkillSheet.crop( 0, 208, 50, 50);
			FireSkill[17] = fireSkillSheet.crop( 52, 208, 50, 50);
			FireSkill[18] = fireSkillSheet.crop( 208, 52, 50, 50);
			FireSkill[19] = fireSkillSheet.crop( 156, 156, 50, 50);
			FireSkill[20] = fireSkillSheet.crop( 104, 208, 50, 50);
			FireSkill[21] = fireSkillSheet.crop( 208, 104, 50, 50);
			FireSkill[22] = fireSkillSheet.crop( 156, 208, 50, 50);
			FireSkill[23] = fireSkillSheet.crop( 208, 156, 50, 50);
			FireSkill[24] = fireSkillSheet.crop( 260, 0, 50, 50);
			FireSkill[25] = fireSkillSheet.crop( 0, 260, 50, 50);
			FireSkill[26] = fireSkillSheet.crop( 52, 260, 50, 50);
			FireSkill[27] = fireSkillSheet.crop( 260, 52, 50, 50);
			FireSkill[28] = fireSkillSheet.crop( 104, 260, 50, 50);
			FireSkill[29] = fireSkillSheet.crop( 260, 104, 50, 50);
			FireSkill[30] = fireSkillSheet.crop( 208, 208, 50, 50);
			FireSkill[31] = fireSkillSheet.crop( 156, 260, 50, 50);
			FireSkill[32] = fireSkillSheet.crop( 260, 156, 50, 50);
			FireSkill[33] = fireSkillSheet.crop( 312, 0, 50, 50);
			FireSkill[34] = fireSkillSheet.crop( 0, 312, 50, 50);
			FireSkill[35] = fireSkillSheet.crop( 52, 312, 50, 50);
			FireSkill[36] = fireSkillSheet.crop( 312, 52, 50, 50);
			FireSkill[37] = fireSkillSheet.crop( 104, 312, 50, 50);
			FireSkill[38] = fireSkillSheet.crop( 312, 104, 50, 50);
			FireSkill[39] = fireSkillSheet.crop( 208, 260, 50, 50);
			FireSkill[40] = fireSkillSheet.crop( 260, 208, 50, 50);
			FireSkill[41] = fireSkillSheet.crop( 156, 312, 50, 50);
			FireSkill[42] = fireSkillSheet.crop( 312, 156, 50, 50);
			FireSkill[43] = fireSkillSheet.crop( 260, 260, 50, 50);
			FireSkill[44] = fireSkillSheet.crop( 208, 312, 50, 50);
			FireSkill[45] = fireSkillSheet.crop( 312, 208, 50, 50);
			FireSkill[46] = fireSkillSheet.crop( 260, 312, 50, 50);
			FireSkill[47] = fireSkillSheet.crop( 0, 0, 50, 50);
			FireSkill[48] = fireSkillSheet.crop( 0, 0, 50, 50);
			FireSkill[49] = fireSkillSheet.crop( 0, 0, 50, 50);
			FireSkill[50] = fireSkillSheet.crop( 0, 0, 50, 50);
			FireSkill[51] = fireSkillSheet.crop( 0, 0, 50, 50);
			FireSkill[52] = fireSkillSheet.crop( 0, 0, 50, 50);
			FireSkill[53] = fireSkillSheet.crop( 0, 0, 50, 50);
			FireSkill[54] = fireSkillSheet.crop( 0, 0, 50, 50);
			FireSkill[55] = fireSkillSheet.crop( 0, 0, 50, 50);
			FireSkill[56] = fireSkillSheet.crop( 0, 0, 50, 50);
			FireSkill[57] = fireSkillSheet.crop( 0, 0, 50, 50);
			FireSkill[58] = fireSkillSheet.crop( 0, 0, 50, 50);
			FireSkill[59] = fireSkillSheet.crop( 0, 0, 50, 50);
			FireSkill[60] = fireSkillSheet.crop( 0, 0, 50, 50);
			FireSkill[61] = fireSkillSheet.crop( 0, 0, 50, 50);
			FireSkill[62] = fireSkillSheet.crop( 0, 0, 50, 50);
			FireSkill[63] = fireSkillSheet.crop( 0, 0, 50, 50);
			FireSkill[64] = fireSkillSheet.crop( 0, 0, 50, 50);
			FireSkill[65] = fireSkillSheet.crop( 0, 0, 50, 50);
			FireSkill[66] = fireSkillSheet.crop( 0, 0, 50, 50);
			FireSkill[67] = fireSkillSheet.crop( 0, 0, 50, 50);
			FireSkill[68] = fireSkillSheet.crop( 0, 0, 50, 50);
			FireSkill[69] = fireSkillSheet.crop( 0, 0, 50, 50);


			icon = new ImageIcon(ImageIO.read(getClass().getResourceAsStream("/Sheets/icon.png")));

			if (processPixelSheet) {
				PrintCropList("FireSkill", "fireSkillSheet", "/EffectCrops/fireSkillCropCoords.txt", 50, 50);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Scaledmap[0] = Images.map[0].getScaledInstance(8000, 6000, Image.SCALE_FAST);
		Scaledmap[1] = Images.map[1].getScaledInstance(8000, 6000, Image.SCALE_FAST);
		Scaledmap[2] = Images.map[2].getScaledInstance(8000, 6000, Image.SCALE_FAST);
				
		map[0] = toBufferedImage(Scaledmap[0]); 
		map[1] = toBufferedImage(Scaledmap[1]);
		map[2] = toBufferedImage(Scaledmap[2]);
		map[3] = toBufferedImage(Scaledmap[1]);
		
		ScaledTown[0] = Images.Town[0].getScaledInstance(4960, 4800, Image.SCALE_FAST); // 992x960 pixel image  x5
		ScaledTown[1] = Images.Town[1].getScaledInstance(4960, 4800, Image.SCALE_FAST); // 992x960 pixel image  x5
		ScaledTown[2] = Images.Town[2].getScaledInstance(4960, 4800, Image.SCALE_FAST); // 992x960 pixel image  x5
		
		Town[0] = toBufferedImage(ScaledTown[1]);
		Town[1] = toBufferedImage(ScaledTown[0]);
		Town[2] = toBufferedImage(ScaledTown[2]);
		Town[3] = toBufferedImage(ScaledTown[0]);
		
		ScaledLab = Images.Lab.getScaledInstance(1040, 1040, Image.SCALE_FAST);
		ScaledRoom1 = Images.Room1.getScaledInstance(880, 720,  Image.SCALE_FAST);
		ScaledRoom2 = Images.Room2.getScaledInstance(720, 640,  Image.SCALE_FAST);
		ScaledRoom3 = Images.Room3.getScaledInstance(880, 720,  Image.SCALE_FAST);
		ScaledRoom4 = Images.Room4.getScaledInstance(720, 640,  Image.SCALE_FAST);
		
		ScaledCave = Images.CaveMap.getScaledInstance(3680, 4000, Image.SCALE_FAST); // 368x400 pixel image
	}

	
	public static BufferedImage toBufferedImage(Image image) {
		
        if (image instanceof BufferedImage)
        return (BufferedImage)image;

        // Create a buffered image with a format that's compatible with the screen
        BufferedImage bimage = null;

        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();

        try {
            // Determine the type of transparency of the new buffered image
            int transparency = Transparency.OPAQUE;

            // Create the buffered image
            GraphicsDevice gs = ge.getDefaultScreenDevice();
            GraphicsConfiguration gc = gs.getDefaultConfiguration();

            bimage = gc.createCompatibleImage(image.getWidth(null), image.getHeight(null), transparency);
        } catch (HeadlessException e) { } //No screen

        if (bimage == null) {
            // Create a buffered image using the default color model
            int type = BufferedImage.TYPE_INT_RGB;

        }

        // Copy image to buffered image
        Graphics g = bimage.createGraphics();

        // Paint the image onto the buffered image
        g.drawImage(image, 0, 0, null);
        g.dispose();

        return bimage;
    }

	
	/*
	 * Given a File containing a list of crop coordinate systems, this will output in console
	 * all the crop coordinates in an orderly fashion to copy/paste.
	 *
	 * @param String skill is the name of the array that will hold the frames of a
	 * skill
	 *
	 * @param String sheet is the sheet to which the frames are located
	 *
	 * Compatible only with
	 * https://untiedgames.itch.io/wills-magic-pixel-particle-effects
	 */
	public void PrintCropList(String skill, String sheet, String path, int width, int height) throws IOException {

		icon =  new ImageIcon(ImageIO.read(getClass().getResourceAsStream("/Sheets/icon.png")));

		Scanner in = new Scanner(getClass().getResourceAsStream(path));
		String line;

		String xPos;
		String yPos;

		int indexCounter = 0;

		while (in.hasNextLine()) {							//			     11111111112222222   <---LINE INDEX REFERENCE
			//     012345678901234567890123456	 <---
			line = in.nextLine();							// EX: frame0005 = 104 156 100 100

			////////FOR X////////
			xPos = line.substring(12, 15);
			if (xPos.startsWith("0")) { 					// EX: 0 156 100 100
				xPos = "0";
			} else if (xPos.endsWith(" ")) { 				// EX: 52 0 50 50
				xPos = xPos.substring(0, 2);
			}
			////////FOR Y////////

			if (xPos.length() == 1) {						// EX: 0 0 50 50		EX: 0 208 50 50
				if (line.charAt(14) == '0') {
					yPos = "0";
				} else {
					yPos = line.substring(14, 17);
				}
			}
			else if (xPos.length() == 2) {					// EX: 52 0 50 50		EX: 52 104 100 100
				yPos = line.substring(15, 18);				// Then y = 0 5			Then y = 104
				if (yPos.startsWith("0")) {
					yPos = "0";								// Now y = 0
				}
			} else {     // xPos.length() == 3			 	EX: 104 0 100 100    EX: 156 52 50 50     EX: 104 156 100 100

				if (line.charAt(16) == '0'){			// Then y = 0			Then y = 52 		 Then y = 156
					yPos = line.charAt(16) + "";
				}
				else if (line.charAt(18) == ' ') {
					yPos = line.substring(16, 18);
				}
				else {
					yPos = line.substring(16, 19);
				}
			}

			System.out.println(skill + "[" + indexCounter + "]" + " = " + sheet + ".crop( " + xPos + ", " + yPos + ", " + width + ", " + height + ");");
			indexCounter++;
		}

	}

	public static BufferedImage tint(BufferedImage src, float r, float g, float b) {

		// Copy image ( who made that so complicated :< )
		BufferedImage newImage = new BufferedImage(src.getWidth(), src.getHeight(), BufferedImage.TRANSLUCENT);
		Graphics2D graphics = newImage.createGraphics();
		graphics.drawImage(src, 0, 0, null);
		graphics.dispose();

		// Color image
		for (int i = 0; i < newImage.getWidth(); i++) {
			for (int j = 0; j < newImage.getHeight(); j++) {
				int ax = newImage.getColorModel().getAlpha(newImage.getRaster().getDataElements(i, j, null));
				int rx = newImage.getColorModel().getRed(newImage.getRaster().getDataElements(i, j, null));
				int gx = newImage.getColorModel().getGreen(newImage.getRaster().getDataElements(i, j, null));
				int bx = newImage.getColorModel().getBlue(newImage.getRaster().getDataElements(i, j, null));
				rx *= r;
				gx *= g;
				bx *= b;
				newImage.setRGB(i, j, (ax << 24) | (rx << 16) | (gx << 8) | (bx << 0));
			}
		}
		return newImage;
	}

	public static BufferedImage loadImage(String path) {
		try {
			return ImageIO.read(Images.class.getResourceAsStream(path));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
		return null;	
	}
	

}
