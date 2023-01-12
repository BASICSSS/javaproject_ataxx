package 프로젝트고고혓;
import java.awt.Color;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;

import javax.swing.*;

import java.awt.Panel;
import java.awt.Canvas;
import java.awt.Label;
import java.awt.Button;

public class G구이 extends JFrame {
	 int x=0; int y=0; //버튼 좌표로 쓸것
	 int _x=0; int _y=0; // 임시좌표
	static int 현재차례 = 0; int A=1;
	int 빨강팀세균수=0; int 파랑팀세균수=0;
	int 빨강카운트=0; int 파랑카운트=0;
	int[][] 게임판 = new int[9][9]; int 전달값=0; //게임판좌표, 전달할 값 <- 많이는 안쓸듯
	//private Image screenImage; 안씀
	//private Graphics screenGraphic; 안씀
	int[] X좌표 = new int[9]; int[][] Y좌표 = new int[9][9]; // 버튼이미지들 좌표 배열
	//int _0번줄Y좌표=45, _1번줄Y좌표=11,_2번줄Y좌표=43,_3번줄Y좌표=9,_4번줄Y좌표=40,_5번줄Y좌표=8, _6번줄Y좌표=40,_7번줄Y좌표=7,_8번줄Y좌표=40; 안씀
	int 빨강못움직이는말=0; int 파랑못움직이는말=0;
	//버튼들 이미지 부여
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//빨강버튼
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
private ImageIcon 빨강차례이미지 = new ImageIcon(main.class.getResource("../images/빨강차례.png"));
private ImageIcon 파랑차례이미지 = new ImageIcon(main.class.getResource("../images/파랑차례이미지.png"));
private ImageIcon 빨강팀승리이미지 = new ImageIcon(main.class.getResource("../images/빨강팀승리이미지.png"));
private ImageIcon 파랑팀승리이미지 = new ImageIcon(main.class.getResource("../images/파랑팀승리이미지.png"));
private ImageIcon 무승부이미지 = new ImageIcon(main.class.getResource("../images/무승부이미지.png"));
public JButton 빨강팀승리버튼 = new JButton(빨강팀승리이미지); public JButton 파랑팀승리버튼 = new JButton(파랑팀승리이미지);
public JButton 무승부버튼 = new JButton(무승부이미지);
private ImageIcon 빨강이미지 = new ImageIcon(main.class.getResource("../images/빨강세균판.png"));
private ImageIcon 약간연한빨강이미지 = new ImageIcon(main.class.getResource("../images/약간진한빨강세균.png"));
private ImageIcon 연한빨강이미지 = new ImageIcon(main.class.getResource("../images/연한빨강세균.png"));
public JButton _0번줄0빨강버튼 = new JButton(빨강이미지); public JButton _0번줄1빨강버튼 = new JButton(빨강이미지); public JButton _0번줄2빨강버튼 = new JButton(빨강이미지); public JButton _0번줄3빨강버튼 = new JButton(빨강이미지);
public JButton _0번줄4빨강버튼 = new JButton(빨강이미지); public JButton _0번줄5빨강버튼 = new JButton(빨강이미지); public JButton _0번줄6빨강버튼 = new JButton(빨강이미지); public JButton _0번줄7빨강버튼 = new JButton(빨강이미지);
public JButton _0번줄8빨강버튼 = new JButton(빨강이미지);
public JButton _1번줄0빨강버튼 = new JButton(빨강이미지); public JButton _1번줄1빨강버튼 = new JButton(빨강이미지); public JButton _1번줄2빨강버튼 = new JButton(빨강이미지); public JButton _1번줄3빨강버튼 = new JButton(빨강이미지);
public JButton _1번줄4빨강버튼 = new JButton(빨강이미지); public JButton _1번줄5빨강버튼 = new JButton(빨강이미지); public JButton _1번줄6빨강버튼 = new JButton(빨강이미지); public JButton _1번줄7빨강버튼 = new JButton(빨강이미지);
public JButton _1번줄8빨강버튼 = new JButton(빨강이미지);
public JButton _2번줄0빨강버튼 = new JButton(빨강이미지); public JButton _2번줄1빨강버튼 = new JButton(빨강이미지); public JButton _2번줄2빨강버튼 = new JButton(빨강이미지); public JButton _2번줄3빨강버튼 = new JButton(빨강이미지);
public JButton _2번줄4빨강버튼 = new JButton(빨강이미지); public JButton _2번줄5빨강버튼 = new JButton(빨강이미지); public JButton _2번줄6빨강버튼 = new JButton(빨강이미지); public JButton _2번줄7빨강버튼 = new JButton(빨강이미지);
public JButton _2번줄8빨강버튼 = new JButton(빨강이미지);
public JButton _3번줄0빨강버튼 = new JButton(빨강이미지); public JButton _3번줄1빨강버튼 = new JButton(빨강이미지); public JButton _3번줄2빨강버튼 = new JButton(빨강이미지); public JButton _3번줄3빨강버튼 = new JButton(빨강이미지);
public JButton _3번줄4빨강버튼 = new JButton(빨강이미지); public JButton _3번줄5빨강버튼 = new JButton(빨강이미지); public JButton _3번줄6빨강버튼 = new JButton(빨강이미지); public JButton _3번줄7빨강버튼 = new JButton(빨강이미지);
public JButton _3번줄8빨강버튼 = new JButton(빨강이미지);
public JButton _4번줄0빨강버튼 = new JButton(빨강이미지); public JButton _4번줄1빨강버튼 = new JButton(빨강이미지); public JButton _4번줄2빨강버튼 = new JButton(빨강이미지); public JButton _4번줄3빨강버튼 = new JButton(빨강이미지);
public JButton _4번줄4빨강버튼 = new JButton(빨강이미지); public JButton _4번줄5빨강버튼 = new JButton(빨강이미지); public JButton _4번줄6빨강버튼 = new JButton(빨강이미지); public JButton _4번줄7빨강버튼 = new JButton(빨강이미지);
public JButton _4번줄8빨강버튼 = new JButton(빨강이미지);
public JButton _5번줄0빨강버튼 = new JButton(빨강이미지); public JButton _5번줄1빨강버튼 = new JButton(빨강이미지); public JButton _5번줄2빨강버튼 = new JButton(빨강이미지); public JButton _5번줄3빨강버튼 = new JButton(빨강이미지);
public JButton _5번줄4빨강버튼 = new JButton(빨강이미지); public JButton _5번줄5빨강버튼 = new JButton(빨강이미지); public JButton _5번줄6빨강버튼 = new JButton(빨강이미지); public JButton _5번줄7빨강버튼 = new JButton(빨강이미지);
public JButton _5번줄8빨강버튼 = new JButton(빨강이미지);
public JButton _6번줄0빨강버튼 = new JButton(빨강이미지); public JButton _6번줄1빨강버튼 = new JButton(빨강이미지); public JButton _6번줄2빨강버튼 = new JButton(빨강이미지); public JButton _6번줄3빨강버튼 = new JButton(빨강이미지);
public JButton _6번줄4빨강버튼 = new JButton(빨강이미지); public JButton _6번줄5빨강버튼 = new JButton(빨강이미지); public JButton _6번줄6빨강버튼 = new JButton(빨강이미지); public JButton _6번줄7빨강버튼 = new JButton(빨강이미지);
public JButton _6번줄8빨강버튼 = new JButton(빨강이미지);
public JButton _7번줄0빨강버튼 = new JButton(빨강이미지); public JButton _7번줄1빨강버튼 = new JButton(빨강이미지); public JButton _7번줄2빨강버튼 = new JButton(빨강이미지); public JButton _7번줄3빨강버튼 = new JButton(빨강이미지);
public JButton _7번줄4빨강버튼 = new JButton(빨강이미지); public JButton _7번줄5빨강버튼 = new JButton(빨강이미지); public JButton _7번줄6빨강버튼 = new JButton(빨강이미지); public JButton _7번줄7빨강버튼 = new JButton(빨강이미지);
public JButton _7번줄8빨강버튼 = new JButton(빨강이미지);
public JButton _8번줄0빨강버튼 = new JButton(빨강이미지); public JButton _8번줄1빨강버튼 = new JButton(빨강이미지); public JButton _8번줄2빨강버튼 = new JButton(빨강이미지); public JButton _8번줄3빨강버튼 = new JButton(빨강이미지);
public JButton _8번줄4빨강버튼 = new JButton(빨강이미지); public JButton _8번줄5빨강버튼 = new JButton(빨강이미지); public JButton _8번줄6빨강버튼 = new JButton(빨강이미지); public JButton _8번줄7빨강버튼 = new JButton(빨강이미지);
public JButton _8번줄8빨강버튼 = new JButton(빨강이미지);
public JButton _0번줄0약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _0번줄1약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _0번줄2약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _0번줄3약간연한빨강버튼 = new JButton(약간연한빨강이미지);
public JButton _0번줄4약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _0번줄5약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _0번줄6약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _0번줄7약간연한빨강버튼 = new JButton(약간연한빨강이미지);
public JButton _0번줄8약간연한빨강버튼 = new JButton(약간연한빨강이미지);
public JButton _1번줄0약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _1번줄1약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _1번줄2약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _1번줄3약간연한빨강버튼 = new JButton(약간연한빨강이미지);
public JButton _1번줄4약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _1번줄5약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _1번줄6약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _1번줄7약간연한빨강버튼 = new JButton(약간연한빨강이미지);
public JButton _1번줄8약간연한빨강버튼 = new JButton(약간연한빨강이미지);
public JButton _2번줄0약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _2번줄1약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _2번줄2약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _2번줄3약간연한빨강버튼 = new JButton(약간연한빨강이미지);
public JButton _2번줄4약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _2번줄5약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _2번줄6약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _2번줄7약간연한빨강버튼 = new JButton(약간연한빨강이미지);
public JButton _2번줄8약간연한빨강버튼 = new JButton(약간연한빨강이미지);
public JButton _3번줄0약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _3번줄1약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _3번줄2약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _3번줄3약간연한빨강버튼 = new JButton(약간연한빨강이미지);
public JButton _3번줄4약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _3번줄5약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _3번줄6약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _3번줄7약간연한빨강버튼 = new JButton(약간연한빨강이미지);
public JButton _3번줄8약간연한빨강버튼 = new JButton(약간연한빨강이미지);
public JButton _4번줄0약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _4번줄1약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _4번줄2약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _4번줄3약간연한빨강버튼 = new JButton(약간연한빨강이미지);
public JButton _4번줄4약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _4번줄5약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _4번줄6약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _4번줄7약간연한빨강버튼 = new JButton(약간연한빨강이미지);
public JButton _4번줄8약간연한빨강버튼 = new JButton(약간연한빨강이미지);
public JButton _5번줄0약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _5번줄1약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _5번줄2약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _5번줄3약간연한빨강버튼 = new JButton(약간연한빨강이미지);
public JButton _5번줄4약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _5번줄5약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _5번줄6약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _5번줄7약간연한빨강버튼 = new JButton(약간연한빨강이미지);
public JButton _5번줄8약간연한빨강버튼 = new JButton(약간연한빨강이미지);
public JButton _6번줄0약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _6번줄1약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _6번줄2약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _6번줄3약간연한빨강버튼 = new JButton(약간연한빨강이미지);
public JButton _6번줄4약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _6번줄5약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _6번줄6약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _6번줄7약간연한빨강버튼 = new JButton(약간연한빨강이미지);
public JButton _6번줄8약간연한빨강버튼 = new JButton(약간연한빨강이미지);
public JButton _7번줄0약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _7번줄1약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _7번줄2약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _7번줄3약간연한빨강버튼 = new JButton(약간연한빨강이미지);
public JButton _7번줄4약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _7번줄5약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _7번줄6약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _7번줄7약간연한빨강버튼 = new JButton(약간연한빨강이미지);
public JButton _7번줄8약간연한빨강버튼 = new JButton(약간연한빨강이미지);
public JButton _8번줄0약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _8번줄1약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _8번줄2약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _8번줄3약간연한빨강버튼 = new JButton(약간연한빨강이미지);
public JButton _8번줄4약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _8번줄5약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _8번줄6약간연한빨강버튼 = new JButton(약간연한빨강이미지); public JButton _8번줄7약간연한빨강버튼 = new JButton(약간연한빨강이미지);
public JButton _8번줄8약간연한빨강버튼 = new JButton(약간연한빨강이미지);
public JButton _0번줄0연한빨강버튼 = new JButton(연한빨강이미지); public JButton _0번줄1연한빨강버튼 = new JButton(연한빨강이미지); public JButton _0번줄2연한빨강버튼 = new JButton(연한빨강이미지); public JButton _0번줄3연한빨강버튼 = new JButton(연한빨강이미지);
public JButton _0번줄4연한빨강버튼 = new JButton(연한빨강이미지); public JButton _0번줄5연한빨강버튼 = new JButton(연한빨강이미지); public JButton _0번줄6연한빨강버튼 = new JButton(연한빨강이미지); public JButton _0번줄7연한빨강버튼 = new JButton(연한빨강이미지);
public JButton _0번줄8연한빨강버튼 = new JButton(연한빨강이미지);
public JButton _1번줄0연한빨강버튼 = new JButton(연한빨강이미지); public JButton _1번줄1연한빨강버튼 = new JButton(연한빨강이미지); public JButton _1번줄2연한빨강버튼 = new JButton(연한빨강이미지); public JButton _1번줄3연한빨강버튼 = new JButton(연한빨강이미지);
public JButton _1번줄4연한빨강버튼 = new JButton(연한빨강이미지); public JButton _1번줄5연한빨강버튼 = new JButton(연한빨강이미지); public JButton _1번줄6연한빨강버튼 = new JButton(연한빨강이미지); public JButton _1번줄7연한빨강버튼 = new JButton(연한빨강이미지);
public JButton _1번줄8연한빨강버튼 = new JButton(연한빨강이미지);
public JButton _2번줄0연한빨강버튼 = new JButton(연한빨강이미지); public JButton _2번줄1연한빨강버튼 = new JButton(연한빨강이미지); public JButton _2번줄2연한빨강버튼 = new JButton(연한빨강이미지); public JButton _2번줄3연한빨강버튼 = new JButton(연한빨강이미지);
public JButton _2번줄4연한빨강버튼 = new JButton(연한빨강이미지); public JButton _2번줄5연한빨강버튼 = new JButton(연한빨강이미지); public JButton _2번줄6연한빨강버튼 = new JButton(연한빨강이미지); public JButton _2번줄7연한빨강버튼 = new JButton(연한빨강이미지);
public JButton _2번줄8연한빨강버튼 = new JButton(연한빨강이미지);
public JButton _3번줄0연한빨강버튼 = new JButton(연한빨강이미지); public JButton _3번줄1연한빨강버튼 = new JButton(연한빨강이미지); public JButton _3번줄2연한빨강버튼 = new JButton(연한빨강이미지); public JButton _3번줄3연한빨강버튼 = new JButton(연한빨강이미지);
public JButton _3번줄4연한빨강버튼 = new JButton(연한빨강이미지); public JButton _3번줄5연한빨강버튼 = new JButton(연한빨강이미지); public JButton _3번줄6연한빨강버튼 = new JButton(연한빨강이미지); public JButton _3번줄7연한빨강버튼 = new JButton(연한빨강이미지);
public JButton _3번줄8연한빨강버튼 = new JButton(연한빨강이미지);
public JButton _4번줄0연한빨강버튼 = new JButton(연한빨강이미지); public JButton _4번줄1연한빨강버튼 = new JButton(연한빨강이미지); public JButton _4번줄2연한빨강버튼 = new JButton(연한빨강이미지); public JButton _4번줄3연한빨강버튼 = new JButton(연한빨강이미지);
public JButton _4번줄4연한빨강버튼 = new JButton(연한빨강이미지); public JButton _4번줄5연한빨강버튼 = new JButton(연한빨강이미지); public JButton _4번줄6연한빨강버튼 = new JButton(연한빨강이미지); public JButton _4번줄7연한빨강버튼 = new JButton(연한빨강이미지);
public JButton _4번줄8연한빨강버튼 = new JButton(연한빨강이미지);
public JButton _5번줄0연한빨강버튼 = new JButton(연한빨강이미지); public JButton _5번줄1연한빨강버튼 = new JButton(연한빨강이미지); public JButton _5번줄2연한빨강버튼 = new JButton(연한빨강이미지); public JButton _5번줄3연한빨강버튼 = new JButton(연한빨강이미지);
public JButton _5번줄4연한빨강버튼 = new JButton(연한빨강이미지); public JButton _5번줄5연한빨강버튼 = new JButton(연한빨강이미지); public JButton _5번줄6연한빨강버튼 = new JButton(연한빨강이미지); public JButton _5번줄7연한빨강버튼 = new JButton(연한빨강이미지);
public JButton _5번줄8연한빨강버튼 = new JButton(연한빨강이미지);
public JButton _6번줄0연한빨강버튼 = new JButton(연한빨강이미지); public JButton _6번줄1연한빨강버튼 = new JButton(연한빨강이미지); public JButton _6번줄2연한빨강버튼 = new JButton(연한빨강이미지); public JButton _6번줄3연한빨강버튼 = new JButton(연한빨강이미지);
public JButton _6번줄4연한빨강버튼 = new JButton(연한빨강이미지); public JButton _6번줄5연한빨강버튼 = new JButton(연한빨강이미지); public JButton _6번줄6연한빨강버튼 = new JButton(연한빨강이미지); public JButton _6번줄7연한빨강버튼 = new JButton(연한빨강이미지);
public JButton _6번줄8연한빨강버튼 = new JButton(연한빨강이미지);
public JButton _7번줄0연한빨강버튼 = new JButton(연한빨강이미지); public JButton _7번줄1연한빨강버튼 = new JButton(연한빨강이미지); public JButton _7번줄2연한빨강버튼 = new JButton(연한빨강이미지); public JButton _7번줄3연한빨강버튼 = new JButton(연한빨강이미지);
public JButton _7번줄4연한빨강버튼 = new JButton(연한빨강이미지); public JButton _7번줄5연한빨강버튼 = new JButton(연한빨강이미지); public JButton _7번줄6연한빨강버튼 = new JButton(연한빨강이미지); public JButton _7번줄7연한빨강버튼 = new JButton(연한빨강이미지);
public JButton _7번줄8연한빨강버튼 = new JButton(연한빨강이미지);
public JButton _8번줄0연한빨강버튼 = new JButton(연한빨강이미지); public JButton _8번줄1연한빨강버튼 = new JButton(연한빨강이미지); public JButton _8번줄2연한빨강버튼 = new JButton(연한빨강이미지); public JButton _8번줄3연한빨강버튼 = new JButton(연한빨강이미지);
public JButton _8번줄4연한빨강버튼 = new JButton(연한빨강이미지); public JButton _8번줄5연한빨강버튼 = new JButton(연한빨강이미지); public JButton _8번줄6연한빨강버튼 = new JButton(연한빨강이미지); public JButton _8번줄7연한빨강버튼 = new JButton(연한빨강이미지);
public JButton _8번줄8연한빨강버튼 = new JButton(연한빨강이미지);
private ImageIcon _빨강0 = new ImageIcon(main.class.getResource("../images/빨강0.png"));	private ImageIcon _빨강1 = new ImageIcon(main.class.getResource("../images/빨강1.png"));
private ImageIcon _빨강2 = new ImageIcon(main.class.getResource("../images/빨강2.png"));	private ImageIcon _빨강3 = new ImageIcon(main.class.getResource("../images/빨강3.png"));
private ImageIcon _빨강4 = new ImageIcon(main.class.getResource("../images/빨강4.png"));	private ImageIcon _빨강5 = new ImageIcon(main.class.getResource("../images/빨강5.png"));
private ImageIcon _빨강6 = new ImageIcon(main.class.getResource("../images/빨강6.png"));	private ImageIcon _빨강7 = new ImageIcon(main.class.getResource("../images/빨강7.png"));
private ImageIcon _빨강8 = new ImageIcon(main.class.getResource("../images/빨강8.png"));	private ImageIcon _빨강9 = new ImageIcon(main.class.getResource("../images/빨강9.png"));
public JButton 빨강0 = new JButton(_빨강0); public JButton 빨강1 = new JButton(_빨강1); public JButton 빨강2 = new JButton(_빨강2); public JButton 빨강3 = new JButton(_빨강3); public JButton 빨강4 = new JButton(_빨강4); 
public JButton 빨강5 = new JButton(_빨강5); public JButton 빨강6 = new JButton(_빨강6); public JButton 빨강7 = new JButton(_빨강7); public JButton 빨강8 = new JButton(_빨강8); public JButton 빨강9 = new JButton(_빨강9);
public JButton 빨강00 = new JButton(_빨강0); public JButton 빨강10 = new JButton(_빨강1); public JButton 빨강20 = new JButton(_빨강2); public JButton 빨강30 = new JButton(_빨강3); public JButton 빨강40 = new JButton(_빨강4); 
public JButton 빨강50 = new JButton(_빨강5); public JButton 빨강60 = new JButton(_빨강6); public JButton 빨강70 = new JButton(_빨강7); public JButton 빨강80 = new JButton(_빨강8); public JButton 빨강90 = new JButton(_빨강9);

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//파랑버튼
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
private ImageIcon 파랑이미지 = new ImageIcon(main.class.getResource("../images/파랑세균판.png"));
private ImageIcon 약간연한파랑이미지 = new ImageIcon(main.class.getResource("../images/약간진한파랑세균.png"));
private ImageIcon 연한파랑이미지 = new ImageIcon(main.class.getResource("../images/연한파랑세균.png"));
public JButton _0번줄0파랑버튼 = new JButton(파랑이미지); public JButton _0번줄1파랑버튼 = new JButton(파랑이미지); public JButton _0번줄2파랑버튼 = new JButton(파랑이미지); public JButton _0번줄3파랑버튼 = new JButton(파랑이미지);
public JButton _0번줄4파랑버튼 = new JButton(파랑이미지); public JButton _0번줄5파랑버튼 = new JButton(파랑이미지); public JButton _0번줄6파랑버튼 = new JButton(파랑이미지); public JButton _0번줄7파랑버튼 = new JButton(파랑이미지);
public JButton _0번줄8파랑버튼 = new JButton(파랑이미지);
public JButton _1번줄0파랑버튼 = new JButton(파랑이미지); public JButton _1번줄1파랑버튼 = new JButton(파랑이미지); public JButton _1번줄2파랑버튼 = new JButton(파랑이미지); public JButton _1번줄3파랑버튼 = new JButton(파랑이미지);
public JButton _1번줄4파랑버튼 = new JButton(파랑이미지); public JButton _1번줄5파랑버튼 = new JButton(파랑이미지); public JButton _1번줄6파랑버튼 = new JButton(파랑이미지); public JButton _1번줄7파랑버튼 = new JButton(파랑이미지);
public JButton _1번줄8파랑버튼 = new JButton(파랑이미지);
public JButton _2번줄0파랑버튼 = new JButton(파랑이미지); public JButton _2번줄1파랑버튼 = new JButton(파랑이미지); public JButton _2번줄2파랑버튼 = new JButton(파랑이미지); public JButton _2번줄3파랑버튼 = new JButton(파랑이미지);
public JButton _2번줄4파랑버튼 = new JButton(파랑이미지); public JButton _2번줄5파랑버튼 = new JButton(파랑이미지); public JButton _2번줄6파랑버튼 = new JButton(파랑이미지); public JButton _2번줄7파랑버튼 = new JButton(파랑이미지);
public JButton _2번줄8파랑버튼 = new JButton(파랑이미지);
public JButton _3번줄0파랑버튼 = new JButton(파랑이미지); public JButton _3번줄1파랑버튼 = new JButton(파랑이미지); public JButton _3번줄2파랑버튼 = new JButton(파랑이미지); public JButton _3번줄3파랑버튼 = new JButton(파랑이미지);
public JButton _3번줄4파랑버튼 = new JButton(파랑이미지); public JButton _3번줄5파랑버튼 = new JButton(파랑이미지); public JButton _3번줄6파랑버튼 = new JButton(파랑이미지); public JButton _3번줄7파랑버튼 = new JButton(파랑이미지);
public JButton _3번줄8파랑버튼 = new JButton(파랑이미지);
public JButton _4번줄0파랑버튼 = new JButton(파랑이미지); public JButton _4번줄1파랑버튼 = new JButton(파랑이미지); public JButton _4번줄2파랑버튼 = new JButton(파랑이미지); public JButton _4번줄3파랑버튼 = new JButton(파랑이미지);
public JButton _4번줄4파랑버튼 = new JButton(파랑이미지); public JButton _4번줄5파랑버튼 = new JButton(파랑이미지); public JButton _4번줄6파랑버튼 = new JButton(파랑이미지); public JButton _4번줄7파랑버튼 = new JButton(파랑이미지);
public JButton _4번줄8파랑버튼 = new JButton(파랑이미지);
public JButton _5번줄0파랑버튼 = new JButton(파랑이미지); public JButton _5번줄1파랑버튼 = new JButton(파랑이미지); public JButton _5번줄2파랑버튼 = new JButton(파랑이미지); public JButton _5번줄3파랑버튼 = new JButton(파랑이미지);
public JButton _5번줄4파랑버튼 = new JButton(파랑이미지); public JButton _5번줄5파랑버튼 = new JButton(파랑이미지); public JButton _5번줄6파랑버튼 = new JButton(파랑이미지); public JButton _5번줄7파랑버튼 = new JButton(파랑이미지);
public JButton _5번줄8파랑버튼 = new JButton(파랑이미지);
public JButton _6번줄0파랑버튼 = new JButton(파랑이미지); public JButton _6번줄1파랑버튼 = new JButton(파랑이미지); public JButton _6번줄2파랑버튼 = new JButton(파랑이미지); public JButton _6번줄3파랑버튼 = new JButton(파랑이미지);
public JButton _6번줄4파랑버튼 = new JButton(파랑이미지); public JButton _6번줄5파랑버튼 = new JButton(파랑이미지); public JButton _6번줄6파랑버튼 = new JButton(파랑이미지); public JButton _6번줄7파랑버튼 = new JButton(파랑이미지);
public JButton _6번줄8파랑버튼 = new JButton(파랑이미지);
public JButton _7번줄0파랑버튼 = new JButton(파랑이미지); public JButton _7번줄1파랑버튼 = new JButton(파랑이미지); public JButton _7번줄2파랑버튼 = new JButton(파랑이미지); public JButton _7번줄3파랑버튼 = new JButton(파랑이미지);
public JButton _7번줄4파랑버튼 = new JButton(파랑이미지); public JButton _7번줄5파랑버튼 = new JButton(파랑이미지); public JButton _7번줄6파랑버튼 = new JButton(파랑이미지); public JButton _7번줄7파랑버튼 = new JButton(파랑이미지);
public JButton _7번줄8파랑버튼 = new JButton(파랑이미지);
public JButton _8번줄0파랑버튼 = new JButton(파랑이미지); public JButton _8번줄1파랑버튼 = new JButton(파랑이미지); public JButton _8번줄2파랑버튼 = new JButton(파랑이미지); public JButton _8번줄3파랑버튼 = new JButton(파랑이미지);
public JButton _8번줄4파랑버튼 = new JButton(파랑이미지); public JButton _8번줄5파랑버튼 = new JButton(파랑이미지); public JButton _8번줄6파랑버튼 = new JButton(파랑이미지); public JButton _8번줄7파랑버튼 = new JButton(파랑이미지);
public JButton _8번줄8파랑버튼 = new JButton(파랑이미지);
public JButton _0번줄0약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _0번줄1약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _0번줄2약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _0번줄3약간연한파랑버튼 = new JButton(약간연한파랑이미지);
public JButton _0번줄4약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _0번줄5약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _0번줄6약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _0번줄7약간연한파랑버튼 = new JButton(약간연한파랑이미지);
public JButton _0번줄8약간연한파랑버튼 = new JButton(약간연한파랑이미지);
public JButton _1번줄0약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _1번줄1약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _1번줄2약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _1번줄3약간연한파랑버튼 = new JButton(약간연한파랑이미지);
public JButton _1번줄4약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _1번줄5약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _1번줄6약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _1번줄7약간연한파랑버튼 = new JButton(약간연한파랑이미지);
public JButton _1번줄8약간연한파랑버튼 = new JButton(약간연한파랑이미지);
public JButton _2번줄0약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _2번줄1약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _2번줄2약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _2번줄3약간연한파랑버튼 = new JButton(약간연한파랑이미지);
public JButton _2번줄4약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _2번줄5약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _2번줄6약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _2번줄7약간연한파랑버튼 = new JButton(약간연한파랑이미지);
public JButton _2번줄8약간연한파랑버튼 = new JButton(약간연한파랑이미지);
public JButton _3번줄0약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _3번줄1약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _3번줄2약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _3번줄3약간연한파랑버튼 = new JButton(약간연한파랑이미지);
public JButton _3번줄4약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _3번줄5약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _3번줄6약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _3번줄7약간연한파랑버튼 = new JButton(약간연한파랑이미지);
public JButton _3번줄8약간연한파랑버튼 = new JButton(약간연한파랑이미지);
public JButton _4번줄0약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _4번줄1약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _4번줄2약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _4번줄3약간연한파랑버튼 = new JButton(약간연한파랑이미지);
public JButton _4번줄4약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _4번줄5약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _4번줄6약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _4번줄7약간연한파랑버튼 = new JButton(약간연한파랑이미지);
public JButton _4번줄8약간연한파랑버튼 = new JButton(약간연한파랑이미지);
public JButton _5번줄0약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _5번줄1약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _5번줄2약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _5번줄3약간연한파랑버튼 = new JButton(약간연한파랑이미지);
public JButton _5번줄4약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _5번줄5약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _5번줄6약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _5번줄7약간연한파랑버튼 = new JButton(약간연한파랑이미지);
public JButton _5번줄8약간연한파랑버튼 = new JButton(약간연한파랑이미지);
public JButton _6번줄0약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _6번줄1약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _6번줄2약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _6번줄3약간연한파랑버튼 = new JButton(약간연한파랑이미지);
public JButton _6번줄4약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _6번줄5약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _6번줄6약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _6번줄7약간연한파랑버튼 = new JButton(약간연한파랑이미지);
public JButton _6번줄8약간연한파랑버튼 = new JButton(약간연한파랑이미지);
public JButton _7번줄0약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _7번줄1약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _7번줄2약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _7번줄3약간연한파랑버튼 = new JButton(약간연한파랑이미지);
public JButton _7번줄4약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _7번줄5약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _7번줄6약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _7번줄7약간연한파랑버튼 = new JButton(약간연한파랑이미지);
public JButton _7번줄8약간연한파랑버튼 = new JButton(약간연한파랑이미지);
public JButton _8번줄0약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _8번줄1약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _8번줄2약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _8번줄3약간연한파랑버튼 = new JButton(약간연한파랑이미지);
public JButton _8번줄4약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _8번줄5약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _8번줄6약간연한파랑버튼 = new JButton(약간연한파랑이미지); public JButton _8번줄7약간연한파랑버튼 = new JButton(약간연한파랑이미지);
public JButton _8번줄8약간연한파랑버튼 = new JButton(약간연한파랑이미지);
public JButton _0번줄0연한파랑버튼 = new JButton(연한파랑이미지); public JButton _0번줄1연한파랑버튼 = new JButton(연한파랑이미지); public JButton _0번줄2연한파랑버튼 = new JButton(연한파랑이미지); public JButton _0번줄3연한파랑버튼 = new JButton(연한파랑이미지);
public JButton _0번줄4연한파랑버튼 = new JButton(연한파랑이미지); public JButton _0번줄5연한파랑버튼 = new JButton(연한파랑이미지); public JButton _0번줄6연한파랑버튼 = new JButton(연한파랑이미지); public JButton _0번줄7연한파랑버튼 = new JButton(연한파랑이미지);
public JButton _0번줄8연한파랑버튼 = new JButton(연한파랑이미지);
public JButton _1번줄0연한파랑버튼 = new JButton(연한파랑이미지); public JButton _1번줄1연한파랑버튼 = new JButton(연한파랑이미지); public JButton _1번줄2연한파랑버튼 = new JButton(연한파랑이미지); public JButton _1번줄3연한파랑버튼 = new JButton(연한파랑이미지);
public JButton _1번줄4연한파랑버튼 = new JButton(연한파랑이미지); public JButton _1번줄5연한파랑버튼 = new JButton(연한파랑이미지); public JButton _1번줄6연한파랑버튼 = new JButton(연한파랑이미지); public JButton _1번줄7연한파랑버튼 = new JButton(연한파랑이미지);
public JButton _1번줄8연한파랑버튼 = new JButton(연한파랑이미지);
public JButton _2번줄0연한파랑버튼 = new JButton(연한파랑이미지); public JButton _2번줄1연한파랑버튼 = new JButton(연한파랑이미지); public JButton _2번줄2연한파랑버튼 = new JButton(연한파랑이미지); public JButton _2번줄3연한파랑버튼 = new JButton(연한파랑이미지);
public JButton _2번줄4연한파랑버튼 = new JButton(연한파랑이미지); public JButton _2번줄5연한파랑버튼 = new JButton(연한파랑이미지); public JButton _2번줄6연한파랑버튼 = new JButton(연한파랑이미지); public JButton _2번줄7연한파랑버튼 = new JButton(연한파랑이미지);
public JButton _2번줄8연한파랑버튼 = new JButton(연한파랑이미지);
public JButton _3번줄0연한파랑버튼 = new JButton(연한파랑이미지); public JButton _3번줄1연한파랑버튼 = new JButton(연한파랑이미지); public JButton _3번줄2연한파랑버튼 = new JButton(연한파랑이미지); public JButton _3번줄3연한파랑버튼 = new JButton(연한파랑이미지);
public JButton _3번줄4연한파랑버튼 = new JButton(연한파랑이미지); public JButton _3번줄5연한파랑버튼 = new JButton(연한파랑이미지); public JButton _3번줄6연한파랑버튼 = new JButton(연한파랑이미지); public JButton _3번줄7연한파랑버튼 = new JButton(연한파랑이미지);
public JButton _3번줄8연한파랑버튼 = new JButton(연한파랑이미지);
public JButton _4번줄0연한파랑버튼 = new JButton(연한파랑이미지); public JButton _4번줄1연한파랑버튼 = new JButton(연한파랑이미지); public JButton _4번줄2연한파랑버튼 = new JButton(연한파랑이미지); public JButton _4번줄3연한파랑버튼 = new JButton(연한파랑이미지);
public JButton _4번줄4연한파랑버튼 = new JButton(연한파랑이미지); public JButton _4번줄5연한파랑버튼 = new JButton(연한파랑이미지); public JButton _4번줄6연한파랑버튼 = new JButton(연한파랑이미지); public JButton _4번줄7연한파랑버튼 = new JButton(연한파랑이미지);
public JButton _4번줄8연한파랑버튼 = new JButton(연한파랑이미지);
public JButton _5번줄0연한파랑버튼 = new JButton(연한파랑이미지); public JButton _5번줄1연한파랑버튼 = new JButton(연한파랑이미지); public JButton _5번줄2연한파랑버튼 = new JButton(연한파랑이미지); public JButton _5번줄3연한파랑버튼 = new JButton(연한파랑이미지);
public JButton _5번줄4연한파랑버튼 = new JButton(연한파랑이미지); public JButton _5번줄5연한파랑버튼 = new JButton(연한파랑이미지); public JButton _5번줄6연한파랑버튼 = new JButton(연한파랑이미지); public JButton _5번줄7연한파랑버튼 = new JButton(연한파랑이미지);
public JButton _5번줄8연한파랑버튼 = new JButton(연한파랑이미지);
public JButton _6번줄0연한파랑버튼 = new JButton(연한파랑이미지); public JButton _6번줄1연한파랑버튼 = new JButton(연한파랑이미지); public JButton _6번줄2연한파랑버튼 = new JButton(연한파랑이미지); public JButton _6번줄3연한파랑버튼 = new JButton(연한파랑이미지);
public JButton _6번줄4연한파랑버튼 = new JButton(연한파랑이미지); public JButton _6번줄5연한파랑버튼 = new JButton(연한파랑이미지); public JButton _6번줄6연한파랑버튼 = new JButton(연한파랑이미지); public JButton _6번줄7연한파랑버튼 = new JButton(연한파랑이미지);
public JButton _6번줄8연한파랑버튼 = new JButton(연한파랑이미지);
public JButton _7번줄0연한파랑버튼 = new JButton(연한파랑이미지); public JButton _7번줄1연한파랑버튼 = new JButton(연한파랑이미지); public JButton _7번줄2연한파랑버튼 = new JButton(연한파랑이미지); public JButton _7번줄3연한파랑버튼 = new JButton(연한파랑이미지);
public JButton _7번줄4연한파랑버튼 = new JButton(연한파랑이미지); public JButton _7번줄5연한파랑버튼 = new JButton(연한파랑이미지); public JButton _7번줄6연한파랑버튼 = new JButton(연한파랑이미지); public JButton _7번줄7연한파랑버튼 = new JButton(연한파랑이미지);
public JButton _7번줄8연한파랑버튼 = new JButton(연한파랑이미지);
public JButton _8번줄0연한파랑버튼 = new JButton(연한파랑이미지); public JButton _8번줄1연한파랑버튼 = new JButton(연한파랑이미지); public JButton _8번줄2연한파랑버튼 = new JButton(연한파랑이미지); public JButton _8번줄3연한파랑버튼 = new JButton(연한파랑이미지);
public JButton _8번줄4연한파랑버튼 = new JButton(연한파랑이미지); public JButton _8번줄5연한파랑버튼 = new JButton(연한파랑이미지); public JButton _8번줄6연한파랑버튼 = new JButton(연한파랑이미지); public JButton _8번줄7연한파랑버튼 = new JButton(연한파랑이미지);
public JButton _8번줄8연한파랑버튼 = new JButton(연한파랑이미지);
private ImageIcon _파랑0 = new ImageIcon(main.class.getResource("../images/파랑0.png"));	private ImageIcon _파랑1 = new ImageIcon(main.class.getResource("../images/파랑1.png"));
private ImageIcon _파랑2 = new ImageIcon(main.class.getResource("../images/파랑2.png"));	private ImageIcon _파랑3 = new ImageIcon(main.class.getResource("../images/파랑3.png"));
private ImageIcon _파랑4 = new ImageIcon(main.class.getResource("../images/파랑4.png"));	private ImageIcon _파랑5 = new ImageIcon(main.class.getResource("../images/파랑5.png"));
private ImageIcon _파랑6 = new ImageIcon(main.class.getResource("../images/파랑6.png"));	private ImageIcon _파랑7 = new ImageIcon(main.class.getResource("../images/파랑7.png"));
private ImageIcon _파랑8 = new ImageIcon(main.class.getResource("../images/파랑8.png"));	private ImageIcon _파랑9 = new ImageIcon(main.class.getResource("../images/파랑9.png"));
public JButton 파랑0 = new JButton(_파랑0); public JButton 파랑1 = new JButton(_파랑1); public JButton 파랑2 = new JButton(_파랑2); public JButton 파랑3 = new JButton(_파랑3); public JButton 파랑4 = new JButton(_파랑4); 
public JButton 파랑5 = new JButton(_파랑5); public JButton 파랑6 = new JButton(_파랑6); public JButton 파랑7 = new JButton(_파랑7); public JButton 파랑8 = new JButton(_파랑8); public JButton 파랑9 = new JButton(_파랑9);
public JButton 파랑00 = new JButton(_파랑0); public JButton 파랑10 = new JButton(_파랑1); public JButton 파랑20 = new JButton(_파랑2); public JButton 파랑30 = new JButton(_파랑3); public JButton 파랑40 = new JButton(_파랑4); 
public JButton 파랑50 = new JButton(_파랑5); public JButton 파랑60 = new JButton(_파랑6); public JButton 파랑70 = new JButton(_파랑7); public JButton 파랑80 = new JButton(_파랑8); public JButton 파랑90 = new JButton(_파랑9);

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
private ImageIcon _기본0 = new ImageIcon(main.class.getResource("../images/기본0.png"));	private ImageIcon _기본1 = new ImageIcon(main.class.getResource("../images/기본1.png"));
private ImageIcon _기본2 = new ImageIcon(main.class.getResource("../images/기본2.png"));	private ImageIcon _기본3 = new ImageIcon(main.class.getResource("../images/기본3.png"));
private ImageIcon _기본4 = new ImageIcon(main.class.getResource("../images/기본4.png"));	private ImageIcon _기본5 = new ImageIcon(main.class.getResource("../images/기본5.png"));
private ImageIcon _기본6 = new ImageIcon(main.class.getResource("../images/기본6.png"));	private ImageIcon _기본7 = new ImageIcon(main.class.getResource("../images/기본7.png"));
private ImageIcon _기본8 = new ImageIcon(main.class.getResource("../images/기본8.png"));	private ImageIcon _기본9 = new ImageIcon(main.class.getResource("../images/기본9.png"));
public JButton 기본0 = new JButton(_기본0); public JButton 기본1 = new JButton(_기본1); public JButton 기본2 = new JButton(_기본2); public JButton 기본3 = new JButton(_기본3); public JButton 기본4 = new JButton(_기본4); 
public JButton 기본5 = new JButton(_기본5); public JButton 기본6 = new JButton(_기본6); public JButton 기본7 = new JButton(_기본7); public JButton 기본8 = new JButton(_기본8); public JButton 기본9 = new JButton(_기본9);
public JButton 빨강순서 = new JButton(빨강차례이미지);
public JButton 파랑순서 = new JButton(파랑차례이미지);
private ImageIcon _다음버튼 = new ImageIcon(main.class.getResource("../images/다음버튼.png"));
public JButton 다음버튼 = new JButton(_다음버튼);
private ImageIcon _뒤로버튼 = new ImageIcon(main.class.getResource("../images/뒤로버튼.png"));
public JButton 뒤로버튼 = new JButton(_뒤로버튼);
	private ImageIcon 종료버튼활성화이미지 = new ImageIcon(main.class.getResource("../images/종료하기활성화.png"));//마우스 올렸을때 이미지
	private ImageIcon 종료버튼이미지 = new ImageIcon(main.class.getResource("../images/종료하기.png"));
	private JButton 종료버튼 = new JButton(종료버튼이미지);
	//
	private ImageIcon 메뉴얼버튼활성화이미지 = new ImageIcon(main.class.getResource("../images/메뉴얼활성화.png"));
	private ImageIcon 메뉴얼버튼이미지 = new ImageIcon(main.class.getResource("../images/메뉴얼.png"));
	private JButton 메뉴얼버튼 = new JButton(메뉴얼버튼이미지);
	//
	private ImageIcon 시작버튼활성화이미지 = new ImageIcon(main.class.getResource("../images/시작하기활성화.png"));
	private ImageIcon 시작버튼이미지 = new ImageIcon(main.class.getResource("../images/시작하기.png"));
	private JButton 시작버튼 = new JButton(시작버튼이미지);
	//
	private ImageIcon 왼쪽맵활성화이미지 = new ImageIcon(main.class.getResource("../images/게임판활성화.png")); //육각맵
	private ImageIcon 왼쪽맵이미지 = new ImageIcon(main.class.getResource("../images/게임판.png"));
	private ImageIcon 오른쪽맵활성화이미지 = new ImageIcon(main.class.getResource("../images/게임판2활성화.png")); //사각맵
	private ImageIcon 오른쪽맵이미지 = new ImageIcon(main.class.getResource("../images/게임판2.png"));
	private JButton 왼쪽맵버튼 = new JButton(왼쪽맵이미지);
	private JButton 오른쪽맵버튼 = new JButton(오른쪽맵이미지);
	//
	private ImageIcon 돌아가기버튼활성화이미지 = new ImageIcon(main.class.getResource("../images/나가기활성화.png"));//돌아가기버튼활성화
	private ImageIcon 돌아가기버튼이미지 = new ImageIcon(main.class.getResource("../images/나가기.png"));
	private JButton 돌아가기버튼 = new JButton(돌아가기버튼이미지);
	private ImageIcon 메뉴로돌아가기버튼활성화이미지 = new ImageIcon(main.class.getResource("../images/돌아가기활성화.png"));//메뉴로돌아가기버튼활성화
	private ImageIcon 메뉴로돌아가기버튼이미지 = new ImageIcon(main.class.getResource("../images/돌아가기.png"));
	private JButton 메뉴로돌아가기버튼 = new JButton(메뉴로돌아가기버튼이미지);
	//
	private JLabel 듀토1 = new JLabel("메뉴얼");private JLabel 듀토2 = new JLabel("메뉴얼");private JLabel 듀토3 = new JLabel("메뉴얼");
	private JLabel 승리1 = new JLabel("메뉴얼");private JLabel 승리2 = new JLabel("메뉴얼");
	private JLabel 버그 = new JLabel("메뉴얼");
	private JLabel 로고 = new JLabel("로고");
	private JLabel 맵선택이미지 = new JLabel("맵선택");
	private JLabel 기본배경 = new JLabel("배경ㅋ");
	private JLabel 배경 = new JLabel("1번맵"); // 배경이미지
	private JLabel 배경1 = new JLabel("2번맵");
	//
	//private int mouseX, mouseY;
	//
	private int 맵번호 = 0;// 1 육각맵 | 2 사각맵
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void G구이() {
		//setUndecorated(true);//테두리 안나오게하는거
		setTitle("세 균 전");
		setSize(main.SCREEN_WIDTH, main.SCREEN_HEIGHT);//main에서 창 크기 조절
		setResizable(false);//모름
		setLocationRelativeTo(null);//모름
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //우측상단의X버튼 비활성화 여부
		setVisible(true);//활성화 여부 | true 보임 / false 안보임
		JLabel 라벨 = new JLabel("세 균 전"); //타이틀 이름
		try {
			기본배경.setVisible(false);
			종료버튼.setVisible(false);
			시작버튼.setVisible(false);
			메뉴얼버튼.setVisible(false);
			로고.setVisible(false);
			Thread.sleep(100);//10ms만큼 대기하고 응답안하면 catch문으로 넘어감
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////			
	종료버튼.setBounds(880, 580, 400, 100);//버튼 좌표 및 이미지크기 (X,Y,길이,높이)
	종료버튼.setBorderPainted(false); //이거랑
	종료버튼.setContentAreaFilled(false); //이거
	종료버튼.setFocusPainted(false); //이거하면 이미지만 출력됨
	종료버튼.addMouseListener(new MouseAdapter() { // 마우스 인식
		@Override
		public void mouseEntered(MouseEvent e) {// 마우스커서가 들어오면
			종료버튼.setIcon(종료버튼활성화이미지);
			종료버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		@Override
		public void mouseExited(MouseEvent e) {// 마우스커서가 나가면
			종료버튼.setIcon(종료버튼이미지);
			종료버튼.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}
		@Override
		public void mousePressed(MouseEvent e) {// 클릭하게되면
			try {
				Thread.sleep(100);//10ms만큼 대기하고 응답안하면 catch문으로 넘어감
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			System.exit(0); // 종료
		}
	}); getContentPane().add(종료버튼);//버튼 쓸수있게해주는거 같은데 뭔지 모름
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	빨강팀승리버튼.setBounds(10, 150, 915, 384);//버튼 좌표 및 이미지크기 (X,Y,길이,높이)
	빨강팀승리버튼.setVisible(false);
	빨강팀승리버튼.setBorderPainted(false); //이거랑
	빨강팀승리버튼.setContentAreaFilled(false); //이거
	빨강팀승리버튼.setFocusPainted(false); //이거하면 이미지만 출력됨
	빨강팀승리버튼.addMouseListener(new MouseAdapter() { // 마우스 인식
		@Override
		public void mouseEntered(MouseEvent e) {// 마우스커서가 들어오면
			빨강팀승리버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		@Override
		public void mousePressed(MouseEvent e) {// 클릭하게되면
			맵선택화면으로();
		}
	}); getContentPane().add(빨강팀승리버튼);
	
	파랑팀승리버튼.setBounds(10, 150, 915, 384);//버튼 좌표 및 이미지크기 (X,Y,길이,높이)
	파랑팀승리버튼.setVisible(false);
	파랑팀승리버튼.setBorderPainted(false); //이거랑
	파랑팀승리버튼.setContentAreaFilled(false); //이거
	파랑팀승리버튼.setFocusPainted(false); //이거하면 이미지만 출력됨
	파랑팀승리버튼.addMouseListener(new MouseAdapter() { // 마우스 인식
		@Override
		public void mouseEntered(MouseEvent e) {// 마우스커서가 들어오면
			파랑팀승리버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		@Override
		public void mousePressed(MouseEvent e) {// 클릭하게되면
			맵선택화면으로();
		}
	}); getContentPane().add(파랑팀승리버튼);
	
	무승부버튼.setBounds(10, 150, 915, 384);//버튼 좌표 및 이미지크기 (X,Y,길이,높이)
	무승부버튼.setVisible(false);
	무승부버튼.setBorderPainted(false); //이거랑
	무승부버튼.setContentAreaFilled(false); //이거
	무승부버튼.setFocusPainted(false); //이거하면 이미지만 출력됨
	무승부버튼.addMouseListener(new MouseAdapter() { // 마우스 인식
		@Override
		public void mouseEntered(MouseEvent e) {// 마우스커서가 들어오면
			무승부버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		@Override
		public void mousePressed(MouseEvent e) {// 클릭하게되면
			맵선택화면으로();
		}
	}); getContentPane().add(무승부버튼);
	메뉴로돌아가기버튼.setBounds(1099, 602, 163, 68);
 	메뉴로돌아가기버튼.setVisible(false);
 	메뉴로돌아가기버튼.setBorderPainted(false);
 	메뉴로돌아가기버튼.setContentAreaFilled(false);
 	메뉴로돌아가기버튼.setFocusPainted(false);
 	메뉴로돌아가기버튼.addMouseListener(new MouseAdapter() {
 		@Override
 		public void mouseEntered(MouseEvent e) {
 			메뉴로돌아가기버튼.setIcon(메뉴로돌아가기버튼활성화이미지);
 			메뉴로돌아가기버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));
 		}
 		@Override
 		public void mouseExited(MouseEvent e) {
 			메뉴로돌아가기버튼.setIcon(메뉴로돌아가기버튼이미지);
 			메뉴로돌아가기버튼.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
 		}
 		@Override
 		public void mousePressed(MouseEvent e) {
 			메인화면으로();
 		}
 	}); getContentPane().add(메뉴로돌아가기버튼);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 	돌아가기버튼.setBounds(1099, 602, 163, 68);
 	돌아가기버튼.setVisible(false);
 	돌아가기버튼.setBorderPainted(false);
 	돌아가기버튼.setContentAreaFilled(false);
 	돌아가기버튼.setFocusPainted(false);
 	돌아가기버튼.addMouseListener(new MouseAdapter() {
 		@Override
 		public void mouseEntered(MouseEvent e) {
 			돌아가기버튼.setIcon(돌아가기버튼활성화이미지);
 			돌아가기버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));
 		}
 		@Override
 		public void mouseExited(MouseEvent e) {
 			돌아가기버튼.setIcon(돌아가기버튼이미지);
 			돌아가기버튼.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
 		}
 		@Override
 		public void mousePressed(MouseEvent e) {
 			맵선택화면으로();
 		}
 	}); getContentPane().add(돌아가기버튼);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	시작버튼.setBounds(880, 320, 400, 100);
	시작버튼.setBorderPainted(false);
	시작버튼.setContentAreaFilled(false);
	시작버튼.setFocusPainted(false);
	시작버튼.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseEntered(MouseEvent e) {
			시작버튼.setIcon(시작버튼활성화이미지);
			시작버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		@Override
		public void mouseExited(MouseEvent e) {
			시작버튼.setIcon(시작버튼이미지);
			시작버튼.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}
		@Override
		public void mousePressed(MouseEvent e) {
			try {
				Thread.sleep(100);//100ms만큼 대기하고 응답안하면 catch문으로 넘어감
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			맵선택화면();
	}
	}); getContentPane().add(시작버튼);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	메뉴얼버튼.setBounds(880, 450, 400, 100);
	메뉴얼버튼.setBorderPainted(false);
	메뉴얼버튼.setContentAreaFilled(false);
	메뉴얼버튼.setFocusPainted(false);
	메뉴얼버튼.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseEntered(MouseEvent e) {
			메뉴얼버튼.setIcon(메뉴얼버튼활성화이미지);
			메뉴얼버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		@Override
		public void mouseExited(MouseEvent e) {
			메뉴얼버튼.setIcon(메뉴얼버튼이미지);
			메뉴얼버튼.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}
		@Override
		public void mousePressed(MouseEvent e) {
			메뉴얼();
	}
	}); getContentPane().add(메뉴얼버튼); 
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	왼쪽맵버튼.setBounds(135, 200, 450, 300);	
	왼쪽맵버튼.setVisible(false);
	왼쪽맵버튼.setBorderPainted(false);
	왼쪽맵버튼.setContentAreaFilled(false);
	왼쪽맵버튼.setFocusPainted(false);
	왼쪽맵버튼.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseEntered(MouseEvent e) {
			왼쪽맵버튼.setIcon(왼쪽맵활성화이미지);
			왼쪽맵버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		@Override
		public void mouseExited(MouseEvent e) {
			왼쪽맵버튼.setIcon(왼쪽맵이미지);
			왼쪽맵버튼.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}
		@Override
		public void mousePressed(MouseEvent e) {
			맵번호 = 1;
			맵시작();
		}
	});	getContentPane().add(왼쪽맵버튼);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	오른쪽맵버튼.setBounds(597, 200, 450, 300);
	오른쪽맵버튼.setVisible(false);
	오른쪽맵버튼.setBorderPainted(false);
	오른쪽맵버튼.setContentAreaFilled(false);
	오른쪽맵버튼.setFocusPainted(false);
	오른쪽맵버튼.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseEntered(MouseEvent e) {
			오른쪽맵버튼.setIcon(오른쪽맵활성화이미지);
			오른쪽맵버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		@Override
		public void mouseExited(MouseEvent e) {
			오른쪽맵버튼.setIcon(오른쪽맵이미지);
			오른쪽맵버튼.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}
		@Override
		public void mousePressed(MouseEvent e) {
			맵번호 = 2;
			맵시작();
		}
	}); getContentPane().add(오른쪽맵버튼);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
	for(int i=0;i<9;i++){
		if(i==0) {X좌표[i]=54;}
		else {X좌표[i]=X좌표[i-1]+85;}//각 줄마다 x좌표는 85씩 차이남
		}
	Y좌표[0][0]=45; Y좌표[1][0]=11; Y좌표[2][0]=43; Y좌표[3][0]=9; Y좌표[4][0]=40; Y좌표[5][0]=8; Y좌표[6][0]=40; Y좌표[7][0]=7; Y좌표[8][0]=40;//각줄 첫번째 버튼들만 y좌표 따로 부여
	for(int i=0;i<9;i++){
		for(int j=1;j<9;j++){Y좌표[i][j] = Y좌표[i][j-1]+67;}//각 버튼들 마다 y좌표는 67씩 차이남
	}
	//모든 버튼들 좌표 및 이미지크기 지정하고 숨겨둠			지금은 빈칸, 빨강, 파랑, 약간연한파랑만 있음
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	빨강순서.setBounds(868,0,400,100); 빨강순서.setVisible(false); 빨강순서.setBorderPainted(false); 빨강순서.setContentAreaFilled(false); 빨강순서.setFocusPainted(false);
	빨강0.setBounds(990,90,50,100); 빨강0.setVisible(false); 빨강0.setBorderPainted(false); 빨강0.setContentAreaFilled(false); 빨강0.setFocusPainted(false);
	빨강1.setBounds(990,90,50,100); 빨강1.setVisible(false); 빨강1.setBorderPainted(false); 빨강1.setContentAreaFilled(false); 빨강1.setFocusPainted(false);
	빨강2.setBounds(990,90,50,100); 빨강2.setVisible(false); 빨강2.setBorderPainted(false); 빨강2.setContentAreaFilled(false); 빨강2.setFocusPainted(false);
	빨강3.setBounds(990,90,50,100); 빨강3.setVisible(false); 빨강3.setBorderPainted(false); 빨강3.setContentAreaFilled(false); 빨강3.setFocusPainted(false);
	빨강4.setBounds(990,90,50,100); 빨강4.setVisible(false); 빨강4.setBorderPainted(false); 빨강4.setContentAreaFilled(false); 빨강4.setFocusPainted(false);
	빨강5.setBounds(990,90,50,100); 빨강5.setVisible(false); 빨강5.setBorderPainted(false); 빨강5.setContentAreaFilled(false); 빨강5.setFocusPainted(false);
	빨강6.setBounds(990,90,50,100); 빨강6.setVisible(false); 빨강6.setBorderPainted(false); 빨강6.setContentAreaFilled(false); 빨강6.setFocusPainted(false);
	빨강7.setBounds(990,90,50,100); 빨강7.setVisible(false); 빨강7.setBorderPainted(false); 빨강7.setContentAreaFilled(false); 빨강7.setFocusPainted(false);
	빨강8.setBounds(990,90,50,100); 빨강8.setVisible(false); 빨강8.setBorderPainted(false); 빨강8.setContentAreaFilled(false); 빨강8.setFocusPainted(false);
	빨강9.setBounds(990,90,50,100); 빨강9.setVisible(false); 빨강9.setBorderPainted(false); 빨강9.setContentAreaFilled(false); 빨강9.setFocusPainted(false);
	 getContentPane().add(빨강0); getContentPane().add(빨강1); getContentPane().add(빨강2); getContentPane().add(빨강3); getContentPane().add(빨강4);
	 getContentPane().add(빨강5); getContentPane().add(빨강6); getContentPane().add(빨강7); getContentPane().add(빨강8); getContentPane().add(빨강9);
		빨강00.setBounds(940,90,50,100); 빨강00.setVisible(false); 빨강00.setBorderPainted(false); 빨강00.setContentAreaFilled(false); 빨강00.setFocusPainted(false);
		빨강10.setBounds(940,90,50,100); 빨강10.setVisible(false); 빨강10.setBorderPainted(false); 빨강10.setContentAreaFilled(false); 빨강10.setFocusPainted(false);
		빨강20.setBounds(940,90,50,100); 빨강20.setVisible(false); 빨강20.setBorderPainted(false); 빨강20.setContentAreaFilled(false); 빨강20.setFocusPainted(false);
		빨강30.setBounds(940,90,50,100); 빨강30.setVisible(false); 빨강30.setBorderPainted(false); 빨강30.setContentAreaFilled(false); 빨강30.setFocusPainted(false);
		빨강40.setBounds(940,90,50,100); 빨강40.setVisible(false); 빨강40.setBorderPainted(false); 빨강40.setContentAreaFilled(false); 빨강40.setFocusPainted(false);
		빨강50.setBounds(940,90,50,100); 빨강50.setVisible(false); 빨강50.setBorderPainted(false); 빨강50.setContentAreaFilled(false); 빨강50.setFocusPainted(false);
		빨강60.setBounds(940,90,50,100); 빨강60.setVisible(false); 빨강60.setBorderPainted(false); 빨강60.setContentAreaFilled(false); 빨강60.setFocusPainted(false);
		빨강70.setBounds(940,90,50,100); 빨강70.setVisible(false); 빨강70.setBorderPainted(false); 빨강70.setContentAreaFilled(false); 빨강70.setFocusPainted(false);
		빨강80.setBounds(940,90,50,100); 빨강80.setVisible(false); 빨강80.setBorderPainted(false); 빨강80.setContentAreaFilled(false); 빨강80.setFocusPainted(false);
		빨강90.setBounds(940,90,50,100); 빨강90.setVisible(false); 빨강90.setBorderPainted(false); 빨강90.setContentAreaFilled(false); 빨강90.setFocusPainted(false);
		 getContentPane().add(빨강00); getContentPane().add(빨강10); getContentPane().add(빨강20); getContentPane().add(빨강30); getContentPane().add(빨강40);
		 getContentPane().add(빨강50); getContentPane().add(빨강60); getContentPane().add(빨강70); getContentPane().add(빨강80); getContentPane().add(빨강90); 
	 _0번줄0빨강버튼.setBounds(X좌표[0], Y좌표[0][0], 120, 60); _0번줄0빨강버튼.setVisible(false); _0번줄0빨강버튼.setBorderPainted(false); _0번줄0빨강버튼.setContentAreaFilled(false); _0번줄0빨강버튼.setFocusPainted(false); _0번줄0빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _0번줄0빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(0,0);}}});
	 getContentPane().add(_0번줄0빨강버튼);
	 _0번줄1빨강버튼.setBounds(X좌표[0], Y좌표[0][1], 120, 60); _0번줄1빨강버튼.setVisible(false); _0번줄1빨강버튼.setBorderPainted(false); _0번줄1빨강버튼.setContentAreaFilled(false); _0번줄1빨강버튼.setFocusPainted(false); _0번줄1빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _0번줄1빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(0,1);}}});
	 getContentPane().add(_0번줄1빨강버튼);
	 _0번줄2빨강버튼.setBounds(X좌표[0], Y좌표[0][2], 120, 60); _0번줄2빨강버튼.setVisible(false); _0번줄2빨강버튼.setBorderPainted(false); _0번줄2빨강버튼.setContentAreaFilled(false); _0번줄2빨강버튼.setFocusPainted(false); _0번줄2빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _0번줄2빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(0,2);}}});
	 getContentPane().add(_0번줄2빨강버튼);
	 _0번줄3빨강버튼.setBounds(X좌표[0], Y좌표[0][3], 120, 60); _0번줄3빨강버튼.setVisible(false); _0번줄3빨강버튼.setBorderPainted(false); _0번줄3빨강버튼.setContentAreaFilled(false); _0번줄3빨강버튼.setFocusPainted(false); _0번줄3빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _0번줄3빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(0,3);}}});
	 getContentPane().add(_0번줄3빨강버튼);
	 _0번줄4빨강버튼.setBounds(X좌표[0], Y좌표[0][4], 120, 60); _0번줄4빨강버튼.setVisible(false); _0번줄4빨강버튼.setBorderPainted(false); _0번줄4빨강버튼.setContentAreaFilled(false); _0번줄4빨강버튼.setFocusPainted(false); _0번줄4빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _0번줄4빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(0,4);}}});
	 getContentPane().add(_0번줄4빨강버튼);
	 _0번줄5빨강버튼.setBounds(X좌표[0], Y좌표[0][5], 120, 60); _0번줄5빨강버튼.setVisible(false); _0번줄5빨강버튼.setBorderPainted(false); _0번줄5빨강버튼.setContentAreaFilled(false); _0번줄5빨강버튼.setFocusPainted(false); _0번줄5빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _0번줄5빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(0,5);}}});
	 getContentPane().add(_0번줄5빨강버튼);
	 _0번줄6빨강버튼.setBounds(X좌표[0], Y좌표[0][6], 120, 60); _0번줄6빨강버튼.setVisible(false); _0번줄6빨강버튼.setBorderPainted(false); _0번줄6빨강버튼.setContentAreaFilled(false); _0번줄6빨강버튼.setFocusPainted(false); _0번줄6빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _0번줄6빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(0,6);}}});
	 getContentPane().add(_0번줄6빨강버튼);
	 _0번줄7빨강버튼.setBounds(X좌표[0], Y좌표[0][7], 120, 60); _0번줄7빨강버튼.setVisible(false); _0번줄7빨강버튼.setBorderPainted(false); _0번줄7빨강버튼.setContentAreaFilled(false); _0번줄7빨강버튼.setFocusPainted(false); _0번줄7빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _0번줄7빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(0,7);}}});
	 getContentPane().add(_0번줄7빨강버튼);
	 _0번줄8빨강버튼.setBounds(X좌표[0], Y좌표[0][8], 120, 60); _0번줄8빨강버튼.setVisible(false); _0번줄8빨강버튼.setBorderPainted(false); _0번줄8빨강버튼.setContentAreaFilled(false); _0번줄8빨강버튼.setFocusPainted(false); _0번줄8빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _0번줄8빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(0,8);}}});
	 getContentPane().add(_0번줄8빨강버튼);
	 _1번줄0빨강버튼.setBounds(X좌표[1], Y좌표[1][0], 120, 60); _1번줄0빨강버튼.setVisible(false); _1번줄0빨강버튼.setBorderPainted(false); _1번줄0빨강버튼.setContentAreaFilled(false); _1번줄0빨강버튼.setFocusPainted(false); _1번줄0빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _1번줄0빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(1,0);}}});
	 getContentPane().add(_1번줄0빨강버튼);  
	 _1번줄1빨강버튼.setBounds(X좌표[1], Y좌표[1][1], 120, 60); _1번줄1빨강버튼.setVisible(false); _1번줄1빨강버튼.setBorderPainted(false); _1번줄1빨강버튼.setContentAreaFilled(false); _1번줄1빨강버튼.setFocusPainted(false); _1번줄1빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _1번줄1빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(1,1);}}});
	 getContentPane().add(_1번줄1빨강버튼);  
	 _1번줄2빨강버튼.setBounds(X좌표[1], Y좌표[1][2], 120, 60); _1번줄2빨강버튼.setVisible(false); _1번줄2빨강버튼.setBorderPainted(false); _1번줄2빨강버튼.setContentAreaFilled(false); _1번줄2빨강버튼.setFocusPainted(false); _1번줄2빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _1번줄2빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(1,2);}}});
	 getContentPane().add(_1번줄2빨강버튼);  
	 _1번줄3빨강버튼.setBounds(X좌표[1], Y좌표[1][3], 120, 60); _1번줄3빨강버튼.setVisible(false); _1번줄3빨강버튼.setBorderPainted(false); _1번줄3빨강버튼.setContentAreaFilled(false); _1번줄3빨강버튼.setFocusPainted(false); _1번줄3빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _1번줄3빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(1,3);}}});
	 getContentPane().add(_1번줄3빨강버튼);  
	 _1번줄4빨강버튼.setBounds(X좌표[1], Y좌표[1][4], 120, 60); _1번줄4빨강버튼.setVisible(false); _1번줄4빨강버튼.setBorderPainted(false); _1번줄4빨강버튼.setContentAreaFilled(false); _1번줄4빨강버튼.setFocusPainted(false); _1번줄4빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _1번줄4빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(1,4);}}});
	 getContentPane().add(_1번줄4빨강버튼);  
	 _1번줄5빨강버튼.setBounds(X좌표[1], Y좌표[1][5], 120, 60); _1번줄5빨강버튼.setVisible(false); _1번줄5빨강버튼.setBorderPainted(false); _1번줄5빨강버튼.setContentAreaFilled(false); _1번줄5빨강버튼.setFocusPainted(false); _1번줄5빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _1번줄5빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(1,5);}}});
	 getContentPane().add(_1번줄5빨강버튼);  
	 _1번줄6빨강버튼.setBounds(X좌표[1], Y좌표[1][6], 120, 60); _1번줄6빨강버튼.setVisible(false); _1번줄6빨강버튼.setBorderPainted(false); _1번줄6빨강버튼.setContentAreaFilled(false); _1번줄6빨강버튼.setFocusPainted(false); _1번줄6빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _1번줄6빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(1,6);}}});
	 getContentPane().add(_1번줄6빨강버튼);  
	 _1번줄7빨강버튼.setBounds(X좌표[1], Y좌표[1][7], 120, 60); _1번줄7빨강버튼.setVisible(false); _1번줄7빨강버튼.setBorderPainted(false); _1번줄7빨강버튼.setContentAreaFilled(false); _1번줄7빨강버튼.setFocusPainted(false); _1번줄7빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _1번줄7빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(1,7);}}});
	 getContentPane().add(_1번줄7빨강버튼);  
	 _1번줄8빨강버튼.setBounds(X좌표[1], Y좌표[1][8], 120, 60); _1번줄8빨강버튼.setVisible(false); _1번줄8빨강버튼.setBorderPainted(false); _1번줄8빨강버튼.setContentAreaFilled(false); _1번줄8빨강버튼.setFocusPainted(false); _1번줄8빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _1번줄8빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(1,8);}}});
	 getContentPane().add(_1번줄8빨강버튼);
	 _2번줄0빨강버튼.setBounds(X좌표[2], Y좌표[2][0], 120, 60); _2번줄0빨강버튼.setVisible(false); _2번줄0빨강버튼.setBorderPainted(false); _2번줄0빨강버튼.setContentAreaFilled(false); _2번줄0빨강버튼.setFocusPainted(false); _2번줄0빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _2번줄0빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(2,0);}}});
	 getContentPane().add(_2번줄0빨강버튼);
	 _2번줄1빨강버튼.setBounds(X좌표[2], Y좌표[2][1], 120, 60); _2번줄1빨강버튼.setVisible(false); _2번줄1빨강버튼.setBorderPainted(false); _2번줄1빨강버튼.setContentAreaFilled(false); _2번줄1빨강버튼.setFocusPainted(false); _2번줄1빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _2번줄1빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(2,1);}}});
	 getContentPane().add(_2번줄1빨강버튼);  
	 _2번줄2빨강버튼.setBounds(X좌표[2], Y좌표[2][2], 120, 60); _2번줄2빨강버튼.setVisible(false); _2번줄2빨강버튼.setBorderPainted(false); _2번줄2빨강버튼.setContentAreaFilled(false); _2번줄2빨강버튼.setFocusPainted(false); _2번줄2빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _2번줄2빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(2,2);}}});
	 getContentPane().add(_2번줄2빨강버튼);  
	 _2번줄3빨강버튼.setBounds(X좌표[2], Y좌표[2][3], 120, 60); _2번줄3빨강버튼.setVisible(false); _2번줄3빨강버튼.setBorderPainted(false); _2번줄3빨강버튼.setContentAreaFilled(false); _2번줄3빨강버튼.setFocusPainted(false); _2번줄3빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _2번줄3빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(2,3);}}});
	 getContentPane().add(_2번줄3빨강버튼);  
	 _2번줄4빨강버튼.setBounds(X좌표[2], Y좌표[2][4], 120, 60); _2번줄4빨강버튼.setVisible(false); _2번줄4빨강버튼.setBorderPainted(false); _2번줄4빨강버튼.setContentAreaFilled(false); _2번줄4빨강버튼.setFocusPainted(false); _2번줄4빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _2번줄4빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(2,4);}}});
	 getContentPane().add(_2번줄4빨강버튼);  
	 _2번줄5빨강버튼.setBounds(X좌표[2], Y좌표[2][5], 120, 60); _2번줄5빨강버튼.setVisible(false); _2번줄5빨강버튼.setBorderPainted(false); _2번줄5빨강버튼.setContentAreaFilled(false); _2번줄5빨강버튼.setFocusPainted(false); _2번줄5빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _2번줄5빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(2,5);}}});
	 getContentPane().add(_2번줄5빨강버튼);  
	 _2번줄6빨강버튼.setBounds(X좌표[2], Y좌표[2][6], 120, 60); _2번줄6빨강버튼.setVisible(false); _2번줄6빨강버튼.setBorderPainted(false); _2번줄6빨강버튼.setContentAreaFilled(false); _2번줄6빨강버튼.setFocusPainted(false); _2번줄6빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _2번줄6빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(2,6);}}});
	 getContentPane().add(_2번줄6빨강버튼);  
	 _2번줄7빨강버튼.setBounds(X좌표[2], Y좌표[2][7], 120, 60); _2번줄7빨강버튼.setVisible(false); _2번줄7빨강버튼.setBorderPainted(false); _2번줄7빨강버튼.setContentAreaFilled(false); _2번줄7빨강버튼.setFocusPainted(false); _2번줄7빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _2번줄7빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(2,7);}}});
	 getContentPane().add(_2번줄7빨강버튼);  
	 _2번줄8빨강버튼.setBounds(X좌표[2], Y좌표[2][8], 120, 60); _2번줄8빨강버튼.setVisible(false); _2번줄8빨강버튼.setBorderPainted(false); _2번줄8빨강버튼.setContentAreaFilled(false); _2번줄8빨강버튼.setFocusPainted(false); _2번줄8빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _2번줄8빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(2,8);}}});
	 getContentPane().add(_2번줄8빨강버튼);
	 _3번줄0빨강버튼.setBounds(X좌표[3], Y좌표[3][0], 120, 60); _3번줄0빨강버튼.setVisible(false); _3번줄0빨강버튼.setBorderPainted(false); _3번줄0빨강버튼.setContentAreaFilled(false); _3번줄0빨강버튼.setFocusPainted(false); _3번줄0빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _3번줄0빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(3,0);}}});
	 getContentPane().add(_3번줄0빨강버튼);  
	 _3번줄1빨강버튼.setBounds(X좌표[3], Y좌표[3][1], 120, 60); _3번줄1빨강버튼.setVisible(false); _3번줄1빨강버튼.setBorderPainted(false); _3번줄1빨강버튼.setContentAreaFilled(false); _3번줄1빨강버튼.setFocusPainted(false); _3번줄1빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _3번줄1빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(3,1);}}});
	 getContentPane().add(_3번줄1빨강버튼);  
	 _3번줄2빨강버튼.setBounds(X좌표[3], Y좌표[3][2], 120, 60); _3번줄2빨강버튼.setVisible(false); _3번줄2빨강버튼.setBorderPainted(false); _3번줄2빨강버튼.setContentAreaFilled(false); _3번줄2빨강버튼.setFocusPainted(false); _3번줄2빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _3번줄2빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(3,2);}}});
	 getContentPane().add(_3번줄2빨강버튼);  
	 _3번줄3빨강버튼.setBounds(X좌표[3], Y좌표[3][3], 120, 60); _3번줄3빨강버튼.setVisible(false); _3번줄3빨강버튼.setBorderPainted(false); _3번줄3빨강버튼.setContentAreaFilled(false); _3번줄3빨강버튼.setFocusPainted(false); _3번줄3빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _3번줄3빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(3,3);}}});
	 getContentPane().add(_3번줄3빨강버튼);  
	 _3번줄4빨강버튼.setBounds(X좌표[3], Y좌표[3][4], 120, 60); _3번줄4빨강버튼.setVisible(false); _3번줄4빨강버튼.setBorderPainted(false); _3번줄4빨강버튼.setContentAreaFilled(false); _3번줄4빨강버튼.setFocusPainted(false); _3번줄4빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _3번줄4빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(3,4);}}});
	 getContentPane().add(_3번줄4빨강버튼);  
	 _3번줄5빨강버튼.setBounds(X좌표[3], Y좌표[3][5], 120, 60); _3번줄5빨강버튼.setVisible(false); _3번줄5빨강버튼.setBorderPainted(false); _3번줄5빨강버튼.setContentAreaFilled(false); _3번줄5빨강버튼.setFocusPainted(false); _3번줄5빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _3번줄5빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(3,5);}}});
	 getContentPane().add(_3번줄5빨강버튼);  
	 _3번줄6빨강버튼.setBounds(X좌표[3], Y좌표[3][6], 120, 60); _3번줄6빨강버튼.setVisible(false); _3번줄6빨강버튼.setBorderPainted(false); _3번줄6빨강버튼.setContentAreaFilled(false); _3번줄6빨강버튼.setFocusPainted(false); _3번줄6빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _3번줄6빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(3,6);}}});
	 getContentPane().add(_3번줄6빨강버튼);  
	 _3번줄7빨강버튼.setBounds(X좌표[3], Y좌표[3][7], 120, 60); _3번줄7빨강버튼.setVisible(false); _3번줄7빨강버튼.setBorderPainted(false); _3번줄7빨강버튼.setContentAreaFilled(false); _3번줄7빨강버튼.setFocusPainted(false); _3번줄7빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _3번줄7빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(3,7);}}});
	 getContentPane().add(_3번줄7빨강버튼);  
	 _3번줄8빨강버튼.setBounds(X좌표[3], Y좌표[3][8], 120, 60); _3번줄8빨강버튼.setVisible(false); _3번줄8빨강버튼.setBorderPainted(false); _3번줄8빨강버튼.setContentAreaFilled(false); _3번줄8빨강버튼.setFocusPainted(false); _3번줄8빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _3번줄8빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(3,8);}}});
	 getContentPane().add(_3번줄8빨강버튼);
	 _4번줄0빨강버튼.setBounds(X좌표[4], Y좌표[4][0], 120, 64); _4번줄0빨강버튼.setVisible(false); _4번줄0빨강버튼.setBorderPainted(false); _4번줄0빨강버튼.setContentAreaFilled(false); _4번줄0빨강버튼.setFocusPainted(false); _4번줄0빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _4번줄0빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(4,0);}}});
	 getContentPane().add(_4번줄0빨강버튼);  
	 _4번줄1빨강버튼.setBounds(X좌표[4], Y좌표[4][1], 120, 64); _4번줄1빨강버튼.setVisible(false); _4번줄1빨강버튼.setBorderPainted(false); _4번줄1빨강버튼.setContentAreaFilled(false); _4번줄1빨강버튼.setFocusPainted(false); _4번줄1빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _4번줄1빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(4,1);}}});
	 getContentPane().add(_4번줄1빨강버튼);  
	 _4번줄2빨강버튼.setBounds(X좌표[4], Y좌표[4][2], 120, 64); _4번줄2빨강버튼.setVisible(false); _4번줄2빨강버튼.setBorderPainted(false); _4번줄2빨강버튼.setContentAreaFilled(false); _4번줄2빨강버튼.setFocusPainted(false); _4번줄2빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _4번줄2빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(4,2);}}});
	 getContentPane().add(_4번줄2빨강버튼);  
	 _4번줄3빨강버튼.setBounds(X좌표[4], Y좌표[4][3], 120, 64); _4번줄3빨강버튼.setVisible(false); _4번줄3빨강버튼.setBorderPainted(false); _4번줄3빨강버튼.setContentAreaFilled(false); _4번줄3빨강버튼.setFocusPainted(false); _4번줄3빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _4번줄3빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(4,3);}}});
	 getContentPane().add(_4번줄3빨강버튼);  
	 _4번줄4빨강버튼.setBounds(X좌표[4], Y좌표[4][4], 120, 64); _4번줄4빨강버튼.setVisible(false); _4번줄4빨강버튼.setBorderPainted(false); _4번줄4빨강버튼.setContentAreaFilled(false); _4번줄4빨강버튼.setFocusPainted(false); _4번줄4빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _4번줄4빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(4,4);}}});
	 getContentPane().add(_4번줄4빨강버튼);  
	 _4번줄5빨강버튼.setBounds(X좌표[4], Y좌표[4][5], 120, 64); _4번줄5빨강버튼.setVisible(false); _4번줄5빨강버튼.setBorderPainted(false); _4번줄5빨강버튼.setContentAreaFilled(false); _4번줄5빨강버튼.setFocusPainted(false); _4번줄5빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _4번줄5빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(4,5);}}});
	 getContentPane().add(_4번줄5빨강버튼);  
	 _4번줄6빨강버튼.setBounds(X좌표[4], Y좌표[4][6], 120, 64); _4번줄6빨강버튼.setVisible(false); _4번줄6빨강버튼.setBorderPainted(false); _4번줄6빨강버튼.setContentAreaFilled(false); _4번줄6빨강버튼.setFocusPainted(false); _4번줄6빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _4번줄6빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(4,6);}}});
	 getContentPane().add(_4번줄6빨강버튼);  
	 _4번줄7빨강버튼.setBounds(X좌표[4], Y좌표[4][7], 120, 64); _4번줄7빨강버튼.setVisible(false); _4번줄7빨강버튼.setBorderPainted(false); _4번줄7빨강버튼.setContentAreaFilled(false); _4번줄7빨강버튼.setFocusPainted(false); _4번줄7빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _4번줄7빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(4,7);}}});
	 getContentPane().add(_4번줄7빨강버튼);  
	 _4번줄8빨강버튼.setBounds(X좌표[4], Y좌표[4][8], 120, 64); _4번줄8빨강버튼.setVisible(false); _4번줄8빨강버튼.setBorderPainted(false); _4번줄8빨강버튼.setContentAreaFilled(false); _4번줄8빨강버튼.setFocusPainted(false); _4번줄8빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _4번줄8빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(4,8);}}});
	 getContentPane().add(_4번줄8빨강버튼);
	 _5번줄0빨강버튼.setBounds(X좌표[5], Y좌표[5][0], 120, 60); _5번줄0빨강버튼.setVisible(false); _5번줄0빨강버튼.setBorderPainted(false); _5번줄0빨강버튼.setContentAreaFilled(false); _5번줄0빨강버튼.setFocusPainted(false); _5번줄0빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _5번줄0빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(5,0);}}});
	 getContentPane().add(_5번줄0빨강버튼);  
	 _5번줄1빨강버튼.setBounds(X좌표[5], Y좌표[5][1], 120, 60); _5번줄1빨강버튼.setVisible(false); _5번줄1빨강버튼.setBorderPainted(false); _5번줄1빨강버튼.setContentAreaFilled(false); _5번줄1빨강버튼.setFocusPainted(false); _5번줄1빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _5번줄1빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(5,1);}}});
	 getContentPane().add(_5번줄1빨강버튼);  
	 _5번줄2빨강버튼.setBounds(X좌표[5], Y좌표[5][2], 120, 60); _5번줄2빨강버튼.setVisible(false); _5번줄2빨강버튼.setBorderPainted(false); _5번줄2빨강버튼.setContentAreaFilled(false); _5번줄2빨강버튼.setFocusPainted(false); _5번줄2빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _5번줄2빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(5,2);}}});
	 getContentPane().add(_5번줄2빨강버튼);  
	 _5번줄3빨강버튼.setBounds(X좌표[5], Y좌표[5][3], 120, 60); _5번줄3빨강버튼.setVisible(false); _5번줄3빨강버튼.setBorderPainted(false); _5번줄3빨강버튼.setContentAreaFilled(false); _5번줄3빨강버튼.setFocusPainted(false); _5번줄3빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _5번줄3빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(5,3);}}});
	 getContentPane().add(_5번줄3빨강버튼);  
	 _5번줄4빨강버튼.setBounds(X좌표[5], Y좌표[5][4], 120, 60); _5번줄4빨강버튼.setVisible(false); _5번줄4빨강버튼.setBorderPainted(false); _5번줄4빨강버튼.setContentAreaFilled(false); _5번줄4빨강버튼.setFocusPainted(false); _5번줄4빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _5번줄4빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(5,4);}}});
	 getContentPane().add(_5번줄4빨강버튼);  
	 _5번줄5빨강버튼.setBounds(X좌표[5], Y좌표[5][5], 120, 60); _5번줄5빨강버튼.setVisible(false); _5번줄5빨강버튼.setBorderPainted(false); _5번줄5빨강버튼.setContentAreaFilled(false); _5번줄5빨강버튼.setFocusPainted(false); _5번줄5빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _5번줄5빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(5,5);}}});
	 getContentPane().add(_5번줄5빨강버튼);  
	 _5번줄6빨강버튼.setBounds(X좌표[5], Y좌표[5][6], 120, 60); _5번줄6빨강버튼.setVisible(false); _5번줄6빨강버튼.setBorderPainted(false); _5번줄6빨강버튼.setContentAreaFilled(false); _5번줄6빨강버튼.setFocusPainted(false); _5번줄6빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _5번줄6빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(5,6);}}});
	 getContentPane().add(_5번줄6빨강버튼);  
	 _5번줄7빨강버튼.setBounds(X좌표[5], Y좌표[5][7], 120, 60); _5번줄7빨강버튼.setVisible(false); _5번줄7빨강버튼.setBorderPainted(false); _5번줄7빨강버튼.setContentAreaFilled(false); _5번줄7빨강버튼.setFocusPainted(false); _5번줄7빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _5번줄7빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(5,7);}}});
	 getContentPane().add(_5번줄7빨강버튼);  
	 _5번줄8빨강버튼.setBounds(X좌표[5], Y좌표[5][8], 120, 60); _5번줄8빨강버튼.setVisible(false); _5번줄8빨강버튼.setBorderPainted(false); _5번줄8빨강버튼.setContentAreaFilled(false); _5번줄8빨강버튼.setFocusPainted(false); _5번줄8빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _5번줄8빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(5,8);}}});
	 getContentPane().add(_5번줄8빨강버튼);
	 _6번줄0빨강버튼.setBounds(X좌표[6], Y좌표[6][0], 120, 60); _6번줄0빨강버튼.setVisible(false); _6번줄0빨강버튼.setBorderPainted(false); _6번줄0빨강버튼.setContentAreaFilled(false); _6번줄0빨강버튼.setFocusPainted(false); _6번줄0빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _6번줄0빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(6,0);}}});
	 getContentPane().add(_6번줄0빨강버튼);  
	 _6번줄1빨강버튼.setBounds(X좌표[6], Y좌표[6][1], 120, 60); _6번줄1빨강버튼.setVisible(false); _6번줄1빨강버튼.setBorderPainted(false); _6번줄1빨강버튼.setContentAreaFilled(false); _6번줄1빨강버튼.setFocusPainted(false); _6번줄1빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _6번줄1빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(6,1);}}});
	 getContentPane().add(_6번줄1빨강버튼);  
	 _6번줄2빨강버튼.setBounds(X좌표[6], Y좌표[6][2], 120, 60); _6번줄2빨강버튼.setVisible(false); _6번줄2빨강버튼.setBorderPainted(false); _6번줄2빨강버튼.setContentAreaFilled(false); _6번줄2빨강버튼.setFocusPainted(false); _6번줄2빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _6번줄2빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(6,2);}}});
	 getContentPane().add(_6번줄2빨강버튼);
	 _6번줄3빨강버튼.setBounds(X좌표[6], Y좌표[6][3], 120, 60); _6번줄3빨강버튼.setVisible(false); _6번줄3빨강버튼.setBorderPainted(false); _6번줄3빨강버튼.setContentAreaFilled(false); _6번줄3빨강버튼.setFocusPainted(false); _6번줄3빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _6번줄3빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(6,3);}}});
	 getContentPane().add(_6번줄3빨강버튼);  
	 _6번줄4빨강버튼.setBounds(X좌표[6], Y좌표[6][4], 120, 60); _6번줄4빨강버튼.setVisible(false); _6번줄4빨강버튼.setBorderPainted(false); _6번줄4빨강버튼.setContentAreaFilled(false); _6번줄4빨강버튼.setFocusPainted(false); _6번줄4빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _6번줄4빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(6,4);}}});
	 getContentPane().add(_6번줄4빨강버튼);  
	 _6번줄5빨강버튼.setBounds(X좌표[6], Y좌표[6][5], 120, 60); _6번줄5빨강버튼.setVisible(false); _6번줄5빨강버튼.setBorderPainted(false); _6번줄5빨강버튼.setContentAreaFilled(false); _6번줄5빨강버튼.setFocusPainted(false); _6번줄5빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _6번줄5빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(6,5);}}});
	 getContentPane().add(_6번줄5빨강버튼); 
	 _6번줄6빨강버튼.setBounds(X좌표[6], Y좌표[6][6], 120, 60); _6번줄6빨강버튼.setVisible(false); _6번줄6빨강버튼.setBorderPainted(false); _6번줄6빨강버튼.setContentAreaFilled(false); _6번줄6빨강버튼.setFocusPainted(false); _6번줄6빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _6번줄6빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(6,6);}}});
	 getContentPane().add(_6번줄6빨강버튼);  
	 _6번줄7빨강버튼.setBounds(X좌표[6], Y좌표[6][7], 120, 60); _6번줄7빨강버튼.setVisible(false); _6번줄7빨강버튼.setBorderPainted(false); _6번줄7빨강버튼.setContentAreaFilled(false); _6번줄7빨강버튼.setFocusPainted(false); _6번줄7빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _6번줄7빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(6,7);}}});
	 getContentPane().add(_6번줄7빨강버튼);  
	 _6번줄8빨강버튼.setBounds(X좌표[6], Y좌표[6][8], 120, 60); _6번줄8빨강버튼.setVisible(false); _6번줄8빨강버튼.setBorderPainted(false); _6번줄8빨강버튼.setContentAreaFilled(false); _6번줄8빨강버튼.setFocusPainted(false); _6번줄8빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _6번줄8빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(6,8);}}});
	 getContentPane().add(_6번줄8빨강버튼);
	 _7번줄0빨강버튼.setBounds(X좌표[7], Y좌표[7][0], 120, 60); _7번줄0빨강버튼.setVisible(false); _7번줄0빨강버튼.setBorderPainted(false); _7번줄0빨강버튼.setContentAreaFilled(false); _7번줄0빨강버튼.setFocusPainted(false); _7번줄0빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _7번줄0빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(7,0);}}});
	 getContentPane().add(_7번줄0빨강버튼);  
	 _7번줄1빨강버튼.setBounds(X좌표[7], Y좌표[7][1], 120, 60); _7번줄1빨강버튼.setVisible(false); _7번줄1빨강버튼.setBorderPainted(false); _7번줄1빨강버튼.setContentAreaFilled(false); _7번줄1빨강버튼.setFocusPainted(false); _7번줄1빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _7번줄1빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(7,1);}}});
	 getContentPane().add(_7번줄1빨강버튼);  
	 _7번줄2빨강버튼.setBounds(X좌표[7], Y좌표[7][2], 120, 60); _7번줄2빨강버튼.setVisible(false); _7번줄2빨강버튼.setBorderPainted(false); _7번줄2빨강버튼.setContentAreaFilled(false); _7번줄2빨강버튼.setFocusPainted(false); _7번줄2빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _7번줄2빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(7,2);}}});
	 getContentPane().add(_7번줄2빨강버튼);  
	 _7번줄3빨강버튼.setBounds(X좌표[7], Y좌표[7][3], 120, 60); _7번줄3빨강버튼.setVisible(false); _7번줄3빨강버튼.setBorderPainted(false); _7번줄3빨강버튼.setContentAreaFilled(false); _7번줄3빨강버튼.setFocusPainted(false); _7번줄3빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _7번줄3빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(7,3);}}});
	 getContentPane().add(_7번줄3빨강버튼);  
	 _7번줄4빨강버튼.setBounds(X좌표[7], Y좌표[7][4], 120, 60); _7번줄4빨강버튼.setVisible(false); _7번줄4빨강버튼.setBorderPainted(false); _7번줄4빨강버튼.setContentAreaFilled(false); _7번줄4빨강버튼.setFocusPainted(false); _7번줄4빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _7번줄4빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(7,4);}}});
	 getContentPane().add(_7번줄4빨강버튼);  
	 _7번줄5빨강버튼.setBounds(X좌표[7], Y좌표[7][5], 120, 60); _7번줄5빨강버튼.setVisible(false); _7번줄5빨강버튼.setBorderPainted(false); _7번줄5빨강버튼.setContentAreaFilled(false); _7번줄5빨강버튼.setFocusPainted(false); _7번줄5빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _7번줄5빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(7,5);}}});
	 getContentPane().add(_7번줄5빨강버튼);  
	 _7번줄6빨강버튼.setBounds(X좌표[7], Y좌표[7][6], 120, 60); _7번줄6빨강버튼.setVisible(false); _7번줄6빨강버튼.setBorderPainted(false); _7번줄6빨강버튼.setContentAreaFilled(false); _7번줄6빨강버튼.setFocusPainted(false); _7번줄6빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _7번줄6빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(7,6);}}});
	 getContentPane().add(_7번줄6빨강버튼);  
	 _7번줄7빨강버튼.setBounds(X좌표[7], Y좌표[7][7], 120, 60); _7번줄7빨강버튼.setVisible(false); _7번줄7빨강버튼.setBorderPainted(false); _7번줄7빨강버튼.setContentAreaFilled(false); _7번줄7빨강버튼.setFocusPainted(false); _7번줄7빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _7번줄7빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(7,7);}}});
	 getContentPane().add(_7번줄7빨강버튼); 
	 _7번줄8빨강버튼.setBounds(X좌표[7], Y좌표[7][8], 120, 60); _7번줄8빨강버튼.setVisible(false); _7번줄8빨강버튼.setBorderPainted(false); _7번줄8빨강버튼.setContentAreaFilled(false); _7번줄8빨강버튼.setFocusPainted(false); _7번줄8빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _7번줄8빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(7,8);}}});
	 getContentPane().add(_7번줄8빨강버튼);
	 _8번줄0빨강버튼.setBounds(X좌표[8], Y좌표[8][0], 120, 60); _8번줄0빨강버튼.setVisible(false); _8번줄0빨강버튼.setBorderPainted(false); _8번줄0빨강버튼.setContentAreaFilled(false); _8번줄0빨강버튼.setFocusPainted(false); _8번줄0빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _8번줄0빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(8,0);}}});
	 getContentPane().add(_8번줄0빨강버튼);  
	 _8번줄1빨강버튼.setBounds(X좌표[8], Y좌표[8][1], 120, 60); _8번줄1빨강버튼.setVisible(false); _8번줄1빨강버튼.setBorderPainted(false); _8번줄1빨강버튼.setContentAreaFilled(false); _8번줄1빨강버튼.setFocusPainted(false); _8번줄1빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _8번줄1빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(8,1);}}});
	 getContentPane().add(_8번줄1빨강버튼);  
	 _8번줄2빨강버튼.setBounds(X좌표[8], Y좌표[8][2], 120, 60); _8번줄2빨강버튼.setVisible(false); _8번줄2빨강버튼.setBorderPainted(false); _8번줄2빨강버튼.setContentAreaFilled(false); _8번줄2빨강버튼.setFocusPainted(false); _8번줄2빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _8번줄2빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(8,2);}}});
	 getContentPane().add(_8번줄2빨강버튼);  
	 _8번줄3빨강버튼.setBounds(X좌표[8], Y좌표[8][3], 120, 60); _8번줄3빨강버튼.setVisible(false); _8번줄3빨강버튼.setBorderPainted(false); _8번줄3빨강버튼.setContentAreaFilled(false); _8번줄3빨강버튼.setFocusPainted(false); _8번줄3빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _8번줄3빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(8,3);}}});
	 getContentPane().add(_8번줄3빨강버튼);  
	 _8번줄4빨강버튼.setBounds(X좌표[8], Y좌표[8][4], 120, 60); _8번줄4빨강버튼.setVisible(false); _8번줄4빨강버튼.setBorderPainted(false); _8번줄4빨강버튼.setContentAreaFilled(false); _8번줄4빨강버튼.setFocusPainted(false); _8번줄4빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _8번줄4빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(8,4);}}});
	 getContentPane().add(_8번줄4빨강버튼);  
	 _8번줄5빨강버튼.setBounds(X좌표[8], Y좌표[8][5], 120, 60); _8번줄5빨강버튼.setVisible(false); _8번줄5빨강버튼.setBorderPainted(false); _8번줄5빨강버튼.setContentAreaFilled(false); _8번줄5빨강버튼.setFocusPainted(false); _8번줄5빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _8번줄5빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(8,5);}}});
	 getContentPane().add(_8번줄5빨강버튼);  
	 _8번줄6빨강버튼.setBounds(X좌표[8], Y좌표[8][6], 120, 60); _8번줄6빨강버튼.setVisible(false); _8번줄6빨강버튼.setBorderPainted(false); _8번줄6빨강버튼.setContentAreaFilled(false); _8번줄6빨강버튼.setFocusPainted(false); _8번줄6빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _8번줄6빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(8,6);}}});
	 getContentPane().add(_8번줄6빨강버튼);  
	 _8번줄7빨강버튼.setBounds(X좌표[8], Y좌표[8][7], 120, 60); _8번줄7빨강버튼.setVisible(false); _8번줄7빨강버튼.setBorderPainted(false); _8번줄7빨강버튼.setContentAreaFilled(false); _8번줄7빨강버튼.setFocusPainted(false); _8번줄7빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _8번줄7빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(8,7);}}});
	 getContentPane().add(_8번줄7빨강버튼);  
	 _8번줄8빨강버튼.setBounds(X좌표[8], Y좌표[8][8], 120, 60); _8번줄8빨강버튼.setVisible(false); _8번줄8빨강버튼.setBorderPainted(false); _8번줄8빨강버튼.setContentAreaFilled(false); _8번줄8빨강버튼.setFocusPainted(false); _8번줄8빨강버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _8번줄8빨강버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례==1){  클릭(8,8);}}});
	 getContentPane().add(_8번줄8빨강버튼);	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 	 _0번줄0약간연한빨강버튼.setBounds(X좌표[0], Y좌표[0][0], 120, 60); _0번줄0약간연한빨강버튼.setVisible(false); _0번줄0약간연한빨강버튼.setBorderPainted(false); _0번줄0약간연한빨강버튼.setContentAreaFilled(false); _0번줄0약간연한빨강버튼.setFocusPainted(false); _0번줄0약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(0,0); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_0번줄0약간연한빨강버튼);
	 _0번줄1약간연한빨강버튼.setBounds(X좌표[0], Y좌표[0][1], 120, 60); _0번줄1약간연한빨강버튼.setVisible(false); _0번줄1약간연한빨강버튼.setBorderPainted(false); _0번줄1약간연한빨강버튼.setContentAreaFilled(false); _0번줄1약간연한빨강버튼.setFocusPainted(false); _0번줄1약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(0,1); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_0번줄1약간연한빨강버튼);
	 _0번줄2약간연한빨강버튼.setBounds(X좌표[0], Y좌표[0][2], 120, 60); _0번줄2약간연한빨강버튼.setVisible(false); _0번줄2약간연한빨강버튼.setBorderPainted(false); _0번줄2약간연한빨강버튼.setContentAreaFilled(false); _0번줄2약간연한빨강버튼.setFocusPainted(false); _0번줄2약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(0,2); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_0번줄2약간연한빨강버튼);
	 _0번줄3약간연한빨강버튼.setBounds(X좌표[0], Y좌표[0][3], 120, 60); _0번줄3약간연한빨강버튼.setVisible(false); _0번줄3약간연한빨강버튼.setBorderPainted(false); _0번줄3약간연한빨강버튼.setContentAreaFilled(false); _0번줄3약간연한빨강버튼.setFocusPainted(false); _0번줄3약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(0,3); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_0번줄3약간연한빨강버튼);
	 _0번줄4약간연한빨강버튼.setBounds(X좌표[0], Y좌표[0][4], 120, 60); _0번줄4약간연한빨강버튼.setVisible(false); _0번줄4약간연한빨강버튼.setBorderPainted(false); _0번줄4약간연한빨강버튼.setContentAreaFilled(false); _0번줄4약간연한빨강버튼.setFocusPainted(false); _0번줄4약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(0,4); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_0번줄4약간연한빨강버튼);
	 _0번줄5약간연한빨강버튼.setBounds(X좌표[0], Y좌표[0][5], 120, 60); _0번줄5약간연한빨강버튼.setVisible(false); _0번줄5약간연한빨강버튼.setBorderPainted(false); _0번줄5약간연한빨강버튼.setContentAreaFilled(false); _0번줄5약간연한빨강버튼.setFocusPainted(false); _0번줄5약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(0,5); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_0번줄5약간연한빨강버튼);
	 _0번줄6약간연한빨강버튼.setBounds(X좌표[0], Y좌표[0][6], 120, 60); _0번줄6약간연한빨강버튼.setVisible(false); _0번줄6약간연한빨강버튼.setBorderPainted(false); _0번줄6약간연한빨강버튼.setContentAreaFilled(false); _0번줄6약간연한빨강버튼.setFocusPainted(false); _0번줄6약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(0,6); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_0번줄6약간연한빨강버튼);
	 _0번줄7약간연한빨강버튼.setBounds(X좌표[0], Y좌표[0][7], 120, 60); _0번줄7약간연한빨강버튼.setVisible(false); _0번줄7약간연한빨강버튼.setBorderPainted(false); _0번줄7약간연한빨강버튼.setContentAreaFilled(false); _0번줄7약간연한빨강버튼.setFocusPainted(false); _0번줄7약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(0,7); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_0번줄7약간연한빨강버튼);
	 _0번줄8약간연한빨강버튼.setBounds(X좌표[0], Y좌표[0][8], 120, 60); _0번줄8약간연한빨강버튼.setVisible(false); _0번줄8약간연한빨강버튼.setBorderPainted(false); _0번줄8약간연한빨강버튼.setContentAreaFilled(false); _0번줄8약간연한빨강버튼.setFocusPainted(false); _0번줄8약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(0,8); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_0번줄8약간연한빨강버튼);
	 _1번줄0약간연한빨강버튼.setBounds(X좌표[1], Y좌표[1][0], 120, 60); _1번줄0약간연한빨강버튼.setVisible(false); _1번줄0약간연한빨강버튼.setBorderPainted(false); _1번줄0약간연한빨강버튼.setContentAreaFilled(false); _1번줄0약간연한빨강버튼.setFocusPainted(false); _1번줄0약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(1,0); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_1번줄0약간연한빨강버튼); 
	 _1번줄1약간연한빨강버튼.setBounds(X좌표[1], Y좌표[1][1], 120, 60); _1번줄1약간연한빨강버튼.setVisible(false); _1번줄1약간연한빨강버튼.setBorderPainted(false); _1번줄1약간연한빨강버튼.setContentAreaFilled(false); _1번줄1약간연한빨강버튼.setFocusPainted(false); _1번줄1약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(1,1); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_1번줄1약간연한빨강버튼); 
	 _1번줄2약간연한빨강버튼.setBounds(X좌표[1], Y좌표[1][2], 120, 60); _1번줄2약간연한빨강버튼.setVisible(false); _1번줄2약간연한빨강버튼.setBorderPainted(false); _1번줄2약간연한빨강버튼.setContentAreaFilled(false); _1번줄2약간연한빨강버튼.setFocusPainted(false); _1번줄2약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(1,2); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_1번줄2약간연한빨강버튼); 
	 _1번줄3약간연한빨강버튼.setBounds(X좌표[1], Y좌표[1][3], 120, 60); _1번줄3약간연한빨강버튼.setVisible(false); _1번줄3약간연한빨강버튼.setBorderPainted(false); _1번줄3약간연한빨강버튼.setContentAreaFilled(false); _1번줄3약간연한빨강버튼.setFocusPainted(false); _1번줄3약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(1,3); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_1번줄3약간연한빨강버튼); 
	 _1번줄4약간연한빨강버튼.setBounds(X좌표[1], Y좌표[1][4], 120, 60); _1번줄4약간연한빨강버튼.setVisible(false); _1번줄4약간연한빨강버튼.setBorderPainted(false); _1번줄4약간연한빨강버튼.setContentAreaFilled(false); _1번줄4약간연한빨강버튼.setFocusPainted(false); _1번줄4약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(1,4); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_1번줄4약간연한빨강버튼); 
	 _1번줄5약간연한빨강버튼.setBounds(X좌표[1], Y좌표[1][5], 120, 60); _1번줄5약간연한빨강버튼.setVisible(false); _1번줄5약간연한빨강버튼.setBorderPainted(false); _1번줄5약간연한빨강버튼.setContentAreaFilled(false); _1번줄5약간연한빨강버튼.setFocusPainted(false); _1번줄5약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(1,5); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_1번줄5약간연한빨강버튼); 
	 _1번줄6약간연한빨강버튼.setBounds(X좌표[1], Y좌표[1][6], 120, 60); _1번줄6약간연한빨강버튼.setVisible(false); _1번줄6약간연한빨강버튼.setBorderPainted(false); _1번줄6약간연한빨강버튼.setContentAreaFilled(false); _1번줄6약간연한빨강버튼.setFocusPainted(false); _1번줄6약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(1,6); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_1번줄6약간연한빨강버튼); 
	 _1번줄7약간연한빨강버튼.setBounds(X좌표[1], Y좌표[1][7], 120, 60); _1번줄7약간연한빨강버튼.setVisible(false); _1번줄7약간연한빨강버튼.setBorderPainted(false); _1번줄7약간연한빨강버튼.setContentAreaFilled(false); _1번줄7약간연한빨강버튼.setFocusPainted(false); _1번줄7약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(1,7); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_1번줄7약간연한빨강버튼); 
	 _1번줄8약간연한빨강버튼.setBounds(X좌표[1], Y좌표[1][8], 120, 60); _1번줄8약간연한빨강버튼.setVisible(false); _1번줄8약간연한빨강버튼.setBorderPainted(false); _1번줄8약간연한빨강버튼.setContentAreaFilled(false); _1번줄8약간연한빨강버튼.setFocusPainted(false); _1번줄8약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(1,8); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_1번줄8약간연한빨강버튼);
	 _2번줄0약간연한빨강버튼.setBounds(X좌표[2], Y좌표[2][0], 120, 60); _2번줄0약간연한빨강버튼.setVisible(false); _2번줄0약간연한빨강버튼.setBorderPainted(false); _2번줄0약간연한빨강버튼.setContentAreaFilled(false); _2번줄0약간연한빨강버튼.setFocusPainted(false); _2번줄0약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(2,0); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_2번줄0약간연한빨강버튼); 
	 _2번줄1약간연한빨강버튼.setBounds(X좌표[2], Y좌표[2][1], 120, 60); _2번줄1약간연한빨강버튼.setVisible(false); _2번줄1약간연한빨강버튼.setBorderPainted(false); _2번줄1약간연한빨강버튼.setContentAreaFilled(false); _2번줄1약간연한빨강버튼.setFocusPainted(false); _2번줄1약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(2,1); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_2번줄1약간연한빨강버튼); 
	 _2번줄2약간연한빨강버튼.setBounds(X좌표[2], Y좌표[2][2], 120, 60); _2번줄2약간연한빨강버튼.setVisible(false); _2번줄2약간연한빨강버튼.setBorderPainted(false); _2번줄2약간연한빨강버튼.setContentAreaFilled(false); _2번줄2약간연한빨강버튼.setFocusPainted(false); _2번줄2약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(2,2); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_2번줄2약간연한빨강버튼); 
	 _2번줄3약간연한빨강버튼.setBounds(X좌표[2], Y좌표[2][3], 120, 60); _2번줄3약간연한빨강버튼.setVisible(false); _2번줄3약간연한빨강버튼.setBorderPainted(false); _2번줄3약간연한빨강버튼.setContentAreaFilled(false); _2번줄3약간연한빨강버튼.setFocusPainted(false); _2번줄3약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(2,3); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_2번줄3약간연한빨강버튼); 
	 _2번줄4약간연한빨강버튼.setBounds(X좌표[2], Y좌표[2][4], 120, 60); _2번줄4약간연한빨강버튼.setVisible(false); _2번줄4약간연한빨강버튼.setBorderPainted(false); _2번줄4약간연한빨강버튼.setContentAreaFilled(false); _2번줄4약간연한빨강버튼.setFocusPainted(false); _2번줄4약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(2,4); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_2번줄4약간연한빨강버튼); 
	 _2번줄5약간연한빨강버튼.setBounds(X좌표[2], Y좌표[2][5], 120, 60); _2번줄5약간연한빨강버튼.setVisible(false); _2번줄5약간연한빨강버튼.setBorderPainted(false); _2번줄5약간연한빨강버튼.setContentAreaFilled(false); _2번줄5약간연한빨강버튼.setFocusPainted(false); _2번줄5약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(2,5); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_2번줄5약간연한빨강버튼); 
	 _2번줄6약간연한빨강버튼.setBounds(X좌표[2], Y좌표[2][6], 120, 60); _2번줄6약간연한빨강버튼.setVisible(false); _2번줄6약간연한빨강버튼.setBorderPainted(false); _2번줄6약간연한빨강버튼.setContentAreaFilled(false); _2번줄6약간연한빨강버튼.setFocusPainted(false); _2번줄6약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(2,6); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_2번줄6약간연한빨강버튼); 
	 _2번줄7약간연한빨강버튼.setBounds(X좌표[2], Y좌표[2][7], 120, 60); _2번줄7약간연한빨강버튼.setVisible(false); _2번줄7약간연한빨강버튼.setBorderPainted(false); _2번줄7약간연한빨강버튼.setContentAreaFilled(false); _2번줄7약간연한빨강버튼.setFocusPainted(false); _2번줄7약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(2,7); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_2번줄7약간연한빨강버튼); 
	 _2번줄8약간연한빨강버튼.setBounds(X좌표[2], Y좌표[2][8], 120, 60); _2번줄8약간연한빨강버튼.setVisible(false); _2번줄8약간연한빨강버튼.setBorderPainted(false); _2번줄8약간연한빨강버튼.setContentAreaFilled(false); _2번줄8약간연한빨강버튼.setFocusPainted(false); _2번줄8약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(2,8); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_2번줄8약간연한빨강버튼);
	 _3번줄0약간연한빨강버튼.setBounds(X좌표[3], Y좌표[3][0], 120, 60); _3번줄0약간연한빨강버튼.setVisible(false); _3번줄0약간연한빨강버튼.setBorderPainted(false); _3번줄0약간연한빨강버튼.setContentAreaFilled(false); _3번줄0약간연한빨강버튼.setFocusPainted(false); _3번줄0약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(3,0); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_3번줄0약간연한빨강버튼); 
	 _3번줄1약간연한빨강버튼.setBounds(X좌표[3], Y좌표[3][1], 120, 60); _3번줄1약간연한빨강버튼.setVisible(false); _3번줄1약간연한빨강버튼.setBorderPainted(false); _3번줄1약간연한빨강버튼.setContentAreaFilled(false); _3번줄1약간연한빨강버튼.setFocusPainted(false); _3번줄1약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(3,1); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_3번줄1약간연한빨강버튼); 
	 _3번줄2약간연한빨강버튼.setBounds(X좌표[3], Y좌표[3][2], 120, 60); _3번줄2약간연한빨강버튼.setVisible(false); _3번줄2약간연한빨강버튼.setBorderPainted(false); _3번줄2약간연한빨강버튼.setContentAreaFilled(false); _3번줄2약간연한빨강버튼.setFocusPainted(false); _3번줄2약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(3,2); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_3번줄2약간연한빨강버튼); 
	 _3번줄3약간연한빨강버튼.setBounds(X좌표[3], Y좌표[3][3], 120, 60); _3번줄3약간연한빨강버튼.setVisible(false); _3번줄3약간연한빨강버튼.setBorderPainted(false); _3번줄3약간연한빨강버튼.setContentAreaFilled(false); _3번줄3약간연한빨강버튼.setFocusPainted(false); _3번줄3약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(3,3); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_3번줄3약간연한빨강버튼); 
	 _3번줄4약간연한빨강버튼.setBounds(X좌표[3], Y좌표[3][4], 120, 60); _3번줄4약간연한빨강버튼.setVisible(false); _3번줄4약간연한빨강버튼.setBorderPainted(false); _3번줄4약간연한빨강버튼.setContentAreaFilled(false); _3번줄4약간연한빨강버튼.setFocusPainted(false); _3번줄4약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(3,4); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_3번줄4약간연한빨강버튼); 
	 _3번줄5약간연한빨강버튼.setBounds(X좌표[3], Y좌표[3][5], 120, 60); _3번줄5약간연한빨강버튼.setVisible(false); _3번줄5약간연한빨강버튼.setBorderPainted(false); _3번줄5약간연한빨강버튼.setContentAreaFilled(false); _3번줄5약간연한빨강버튼.setFocusPainted(false); _3번줄5약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(3,5); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_3번줄5약간연한빨강버튼); 
	 _3번줄6약간연한빨강버튼.setBounds(X좌표[3], Y좌표[3][6], 120, 60); _3번줄6약간연한빨강버튼.setVisible(false); _3번줄6약간연한빨강버튼.setBorderPainted(false); _3번줄6약간연한빨강버튼.setContentAreaFilled(false); _3번줄6약간연한빨강버튼.setFocusPainted(false); _3번줄6약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(3,6); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_3번줄6약간연한빨강버튼); 
	 _3번줄7약간연한빨강버튼.setBounds(X좌표[3], Y좌표[3][7], 120, 60); _3번줄7약간연한빨강버튼.setVisible(false); _3번줄7약간연한빨강버튼.setBorderPainted(false); _3번줄7약간연한빨강버튼.setContentAreaFilled(false); _3번줄7약간연한빨강버튼.setFocusPainted(false); _3번줄7약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(3,7); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_3번줄7약간연한빨강버튼); 
	 _3번줄8약간연한빨강버튼.setBounds(X좌표[3], Y좌표[3][8], 120, 60); _3번줄8약간연한빨강버튼.setVisible(false); _3번줄8약간연한빨강버튼.setBorderPainted(false); _3번줄8약간연한빨강버튼.setContentAreaFilled(false); _3번줄8약간연한빨강버튼.setFocusPainted(false); _3번줄8약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(3,8); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_3번줄8약간연한빨강버튼);
	 _4번줄0약간연한빨강버튼.setBounds(X좌표[4], Y좌표[4][0], 120, 64); _4번줄0약간연한빨강버튼.setVisible(false); _4번줄0약간연한빨강버튼.setBorderPainted(false); _4번줄0약간연한빨강버튼.setContentAreaFilled(false); _4번줄0약간연한빨강버튼.setFocusPainted(false); _4번줄0약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(4,0); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_4번줄0약간연한빨강버튼); 
	 _4번줄1약간연한빨강버튼.setBounds(X좌표[4], Y좌표[4][1], 120, 64); _4번줄1약간연한빨강버튼.setVisible(false); _4번줄1약간연한빨강버튼.setBorderPainted(false); _4번줄1약간연한빨강버튼.setContentAreaFilled(false); _4번줄1약간연한빨강버튼.setFocusPainted(false); _4번줄1약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(4,1); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_4번줄1약간연한빨강버튼); 
	 _4번줄2약간연한빨강버튼.setBounds(X좌표[4], Y좌표[4][2], 120, 64); _4번줄2약간연한빨강버튼.setVisible(false); _4번줄2약간연한빨강버튼.setBorderPainted(false); _4번줄2약간연한빨강버튼.setContentAreaFilled(false); _4번줄2약간연한빨강버튼.setFocusPainted(false); _4번줄2약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(4,2); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_4번줄2약간연한빨강버튼); 
	 _4번줄3약간연한빨강버튼.setBounds(X좌표[4], Y좌표[4][3], 120, 64); _4번줄3약간연한빨강버튼.setVisible(false); _4번줄3약간연한빨강버튼.setBorderPainted(false); _4번줄3약간연한빨강버튼.setContentAreaFilled(false); _4번줄3약간연한빨강버튼.setFocusPainted(false); _4번줄3약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(4,3); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_4번줄3약간연한빨강버튼); 
	 _4번줄4약간연한빨강버튼.setBounds(X좌표[4], Y좌표[4][4], 120, 64); _4번줄4약간연한빨강버튼.setVisible(false); _4번줄4약간연한빨강버튼.setBorderPainted(false); _4번줄4약간연한빨강버튼.setContentAreaFilled(false); _4번줄4약간연한빨강버튼.setFocusPainted(false); _4번줄4약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(4,4); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_4번줄4약간연한빨강버튼); 
	 _4번줄5약간연한빨강버튼.setBounds(X좌표[4], Y좌표[4][5], 120, 64); _4번줄5약간연한빨강버튼.setVisible(false); _4번줄5약간연한빨강버튼.setBorderPainted(false); _4번줄5약간연한빨강버튼.setContentAreaFilled(false); _4번줄5약간연한빨강버튼.setFocusPainted(false); _4번줄5약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(4,5); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_4번줄5약간연한빨강버튼); 
	 _4번줄6약간연한빨강버튼.setBounds(X좌표[4], Y좌표[4][6], 120, 64); _4번줄6약간연한빨강버튼.setVisible(false); _4번줄6약간연한빨강버튼.setBorderPainted(false); _4번줄6약간연한빨강버튼.setContentAreaFilled(false); _4번줄6약간연한빨강버튼.setFocusPainted(false); _4번줄6약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(4,6); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_4번줄6약간연한빨강버튼); 
	 _4번줄7약간연한빨강버튼.setBounds(X좌표[4], Y좌표[4][7], 120, 64); _4번줄7약간연한빨강버튼.setVisible(false); _4번줄7약간연한빨강버튼.setBorderPainted(false); _4번줄7약간연한빨강버튼.setContentAreaFilled(false); _4번줄7약간연한빨강버튼.setFocusPainted(false); _4번줄7약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(4,7); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_4번줄7약간연한빨강버튼); 
	 _4번줄8약간연한빨강버튼.setBounds(X좌표[4], Y좌표[4][8], 120, 64); _4번줄8약간연한빨강버튼.setVisible(false); _4번줄8약간연한빨강버튼.setBorderPainted(false); _4번줄8약간연한빨강버튼.setContentAreaFilled(false); _4번줄8약간연한빨강버튼.setFocusPainted(false); _4번줄8약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(4,8); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_4번줄8약간연한빨강버튼);
	 _5번줄0약간연한빨강버튼.setBounds(X좌표[5], Y좌표[5][0], 120, 60); _5번줄0약간연한빨강버튼.setVisible(false); _5번줄0약간연한빨강버튼.setBorderPainted(false); _5번줄0약간연한빨강버튼.setContentAreaFilled(false); _5번줄0약간연한빨강버튼.setFocusPainted(false); _5번줄0약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(5,0); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_5번줄0약간연한빨강버튼); 
	 _5번줄1약간연한빨강버튼.setBounds(X좌표[5], Y좌표[5][1], 120, 60); _5번줄1약간연한빨강버튼.setVisible(false); _5번줄1약간연한빨강버튼.setBorderPainted(false); _5번줄1약간연한빨강버튼.setContentAreaFilled(false); _5번줄1약간연한빨강버튼.setFocusPainted(false); _5번줄1약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(5,1); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_5번줄1약간연한빨강버튼); 
	 _5번줄2약간연한빨강버튼.setBounds(X좌표[5], Y좌표[5][2], 120, 60); _5번줄2약간연한빨강버튼.setVisible(false); _5번줄2약간연한빨강버튼.setBorderPainted(false); _5번줄2약간연한빨강버튼.setContentAreaFilled(false); _5번줄2약간연한빨강버튼.setFocusPainted(false); _5번줄2약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(5,2); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_5번줄2약간연한빨강버튼); 
	 _5번줄3약간연한빨강버튼.setBounds(X좌표[5], Y좌표[5][3], 120, 60); _5번줄3약간연한빨강버튼.setVisible(false); _5번줄3약간연한빨강버튼.setBorderPainted(false); _5번줄3약간연한빨강버튼.setContentAreaFilled(false); _5번줄3약간연한빨강버튼.setFocusPainted(false); _5번줄3약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(5,3); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_5번줄3약간연한빨강버튼); 
	 _5번줄4약간연한빨강버튼.setBounds(X좌표[5], Y좌표[5][4], 120, 60); _5번줄4약간연한빨강버튼.setVisible(false); _5번줄4약간연한빨강버튼.setBorderPainted(false); _5번줄4약간연한빨강버튼.setContentAreaFilled(false); _5번줄4약간연한빨강버튼.setFocusPainted(false); _5번줄4약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(5,4); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_5번줄4약간연한빨강버튼); 
	 _5번줄5약간연한빨강버튼.setBounds(X좌표[5], Y좌표[5][5], 120, 60); _5번줄5약간연한빨강버튼.setVisible(false); _5번줄5약간연한빨강버튼.setBorderPainted(false); _5번줄5약간연한빨강버튼.setContentAreaFilled(false); _5번줄5약간연한빨강버튼.setFocusPainted(false); _5번줄5약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(5,5); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_5번줄5약간연한빨강버튼); 
	 _5번줄6약간연한빨강버튼.setBounds(X좌표[5], Y좌표[5][6], 120, 60); _5번줄6약간연한빨강버튼.setVisible(false); _5번줄6약간연한빨강버튼.setBorderPainted(false); _5번줄6약간연한빨강버튼.setContentAreaFilled(false); _5번줄6약간연한빨강버튼.setFocusPainted(false); _5번줄6약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(5,6); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_5번줄6약간연한빨강버튼); 
	 _5번줄7약간연한빨강버튼.setBounds(X좌표[5], Y좌표[5][7], 120, 60); _5번줄7약간연한빨강버튼.setVisible(false); _5번줄7약간연한빨강버튼.setBorderPainted(false); _5번줄7약간연한빨강버튼.setContentAreaFilled(false); _5번줄7약간연한빨강버튼.setFocusPainted(false); _5번줄7약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(5,7); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_5번줄7약간연한빨강버튼); 
	 _5번줄8약간연한빨강버튼.setBounds(X좌표[5], Y좌표[5][8], 120, 60); _5번줄8약간연한빨강버튼.setVisible(false); _5번줄8약간연한빨강버튼.setBorderPainted(false); _5번줄8약간연한빨강버튼.setContentAreaFilled(false); _5번줄8약간연한빨강버튼.setFocusPainted(false); _5번줄8약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(5,8); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_5번줄8약간연한빨강버튼);
	 _6번줄0약간연한빨강버튼.setBounds(X좌표[6], Y좌표[6][0], 120, 60); _6번줄0약간연한빨강버튼.setVisible(false); _6번줄0약간연한빨강버튼.setBorderPainted(false); _6번줄0약간연한빨강버튼.setContentAreaFilled(false); _6번줄0약간연한빨강버튼.setFocusPainted(false); _6번줄0약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(6,0); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_6번줄0약간연한빨강버튼); 
	 _6번줄1약간연한빨강버튼.setBounds(X좌표[6], Y좌표[6][1], 120, 60); _6번줄1약간연한빨강버튼.setVisible(false); _6번줄1약간연한빨강버튼.setBorderPainted(false); _6번줄1약간연한빨강버튼.setContentAreaFilled(false); _6번줄1약간연한빨강버튼.setFocusPainted(false); _6번줄1약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(6,1); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_6번줄1약간연한빨강버튼); 
	 _6번줄2약간연한빨강버튼.setBounds(X좌표[6], Y좌표[6][2], 120, 60); _6번줄2약간연한빨강버튼.setVisible(false); _6번줄2약간연한빨강버튼.setBorderPainted(false); _6번줄2약간연한빨강버튼.setContentAreaFilled(false); _6번줄2약간연한빨강버튼.setFocusPainted(false); _6번줄2약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(6,2); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_6번줄2약간연한빨강버튼);
	 _6번줄3약간연한빨강버튼.setBounds(X좌표[6], Y좌표[6][3], 120, 60); _6번줄3약간연한빨강버튼.setVisible(false); _6번줄3약간연한빨강버튼.setBorderPainted(false); _6번줄3약간연한빨강버튼.setContentAreaFilled(false); _6번줄3약간연한빨강버튼.setFocusPainted(false); _6번줄3약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(6,3); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_6번줄3약간연한빨강버튼); 
	 _6번줄4약간연한빨강버튼.setBounds(X좌표[6], Y좌표[6][4], 120, 60); _6번줄4약간연한빨강버튼.setVisible(false); _6번줄4약간연한빨강버튼.setBorderPainted(false); _6번줄4약간연한빨강버튼.setContentAreaFilled(false); _6번줄4약간연한빨강버튼.setFocusPainted(false); _6번줄4약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(6,4); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_6번줄4약간연한빨강버튼); 
	 _6번줄5약간연한빨강버튼.setBounds(X좌표[6], Y좌표[6][5], 120, 60); _6번줄5약간연한빨강버튼.setVisible(false); _6번줄5약간연한빨강버튼.setBorderPainted(false); _6번줄5약간연한빨강버튼.setContentAreaFilled(false); _6번줄5약간연한빨강버튼.setFocusPainted(false); _6번줄5약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(6,5); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_6번줄5약간연한빨강버튼); 
	 _6번줄6약간연한빨강버튼.setBounds(X좌표[6], Y좌표[6][6], 120, 60); _6번줄6약간연한빨강버튼.setVisible(false); _6번줄6약간연한빨강버튼.setBorderPainted(false); _6번줄6약간연한빨강버튼.setContentAreaFilled(false); _6번줄6약간연한빨강버튼.setFocusPainted(false); _6번줄6약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(6,6); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_6번줄6약간연한빨강버튼); 
	 _6번줄7약간연한빨강버튼.setBounds(X좌표[6], Y좌표[6][7], 120, 60); _6번줄7약간연한빨강버튼.setVisible(false); _6번줄7약간연한빨강버튼.setBorderPainted(false); _6번줄7약간연한빨강버튼.setContentAreaFilled(false); _6번줄7약간연한빨강버튼.setFocusPainted(false); _6번줄7약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(6,7); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_6번줄7약간연한빨강버튼); 
	 _6번줄8약간연한빨강버튼.setBounds(X좌표[6], Y좌표[6][8], 120, 60); _6번줄8약간연한빨강버튼.setVisible(false); _6번줄8약간연한빨강버튼.setBorderPainted(false); _6번줄8약간연한빨강버튼.setContentAreaFilled(false); _6번줄8약간연한빨강버튼.setFocusPainted(false); _6번줄8약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(6,8); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_6번줄8약간연한빨강버튼);
	 _7번줄0약간연한빨강버튼.setBounds(X좌표[7], Y좌표[7][0], 120, 60); _7번줄0약간연한빨강버튼.setVisible(false); _7번줄0약간연한빨강버튼.setBorderPainted(false); _7번줄0약간연한빨강버튼.setContentAreaFilled(false); _7번줄0약간연한빨강버튼.setFocusPainted(false); _7번줄0약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(7,0); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_7번줄0약간연한빨강버튼); 
	 _7번줄1약간연한빨강버튼.setBounds(X좌표[7], Y좌표[7][1], 120, 60); _7번줄1약간연한빨강버튼.setVisible(false); _7번줄1약간연한빨강버튼.setBorderPainted(false); _7번줄1약간연한빨강버튼.setContentAreaFilled(false); _7번줄1약간연한빨강버튼.setFocusPainted(false); _7번줄1약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(7,1); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_7번줄1약간연한빨강버튼); 
	 _7번줄2약간연한빨강버튼.setBounds(X좌표[7], Y좌표[7][2], 120, 60); _7번줄2약간연한빨강버튼.setVisible(false); _7번줄2약간연한빨강버튼.setBorderPainted(false); _7번줄2약간연한빨강버튼.setContentAreaFilled(false); _7번줄2약간연한빨강버튼.setFocusPainted(false); _7번줄2약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(7,2); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_7번줄2약간연한빨강버튼); 
	 _7번줄3약간연한빨강버튼.setBounds(X좌표[7], Y좌표[7][3], 120, 60); _7번줄3약간연한빨강버튼.setVisible(false); _7번줄3약간연한빨강버튼.setBorderPainted(false); _7번줄3약간연한빨강버튼.setContentAreaFilled(false); _7번줄3약간연한빨강버튼.setFocusPainted(false); _7번줄3약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(7,3); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_7번줄3약간연한빨강버튼); 
	 _7번줄4약간연한빨강버튼.setBounds(X좌표[7], Y좌표[7][4], 120, 60); _7번줄4약간연한빨강버튼.setVisible(false); _7번줄4약간연한빨강버튼.setBorderPainted(false); _7번줄4약간연한빨강버튼.setContentAreaFilled(false); _7번줄4약간연한빨강버튼.setFocusPainted(false); _7번줄4약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(7,4); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_7번줄4약간연한빨강버튼); 
	 _7번줄5약간연한빨강버튼.setBounds(X좌표[7], Y좌표[7][5], 120, 60); _7번줄5약간연한빨강버튼.setVisible(false); _7번줄5약간연한빨강버튼.setBorderPainted(false); _7번줄5약간연한빨강버튼.setContentAreaFilled(false); _7번줄5약간연한빨강버튼.setFocusPainted(false); _7번줄5약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(7,5); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_7번줄5약간연한빨강버튼); 
	 _7번줄6약간연한빨강버튼.setBounds(X좌표[7], Y좌표[7][6], 120, 60); _7번줄6약간연한빨강버튼.setVisible(false); _7번줄6약간연한빨강버튼.setBorderPainted(false); _7번줄6약간연한빨강버튼.setContentAreaFilled(false); _7번줄6약간연한빨강버튼.setFocusPainted(false); _7번줄6약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(7,6); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_7번줄6약간연한빨강버튼); 
	 _7번줄7약간연한빨강버튼.setBounds(X좌표[7], Y좌표[7][7], 120, 60); _7번줄7약간연한빨강버튼.setVisible(false); _7번줄7약간연한빨강버튼.setBorderPainted(false); _7번줄7약간연한빨강버튼.setContentAreaFilled(false); _7번줄7약간연한빨강버튼.setFocusPainted(false); _7번줄7약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(7,7); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_7번줄7약간연한빨강버튼); 
	 _7번줄8약간연한빨강버튼.setBounds(X좌표[7], Y좌표[7][8], 120, 60); _7번줄8약간연한빨강버튼.setVisible(false); _7번줄8약간연한빨강버튼.setBorderPainted(false); _7번줄8약간연한빨강버튼.setContentAreaFilled(false); _7번줄8약간연한빨강버튼.setFocusPainted(false); _7번줄8약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(7,8); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_7번줄8약간연한빨강버튼);
	 _8번줄0약간연한빨강버튼.setBounds(X좌표[8], Y좌표[8][0], 120, 60); _8번줄0약간연한빨강버튼.setVisible(false); _8번줄0약간연한빨강버튼.setBorderPainted(false); _8번줄0약간연한빨강버튼.setContentAreaFilled(false); _8번줄0약간연한빨강버튼.setFocusPainted(false); _8번줄0약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(8,0); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_8번줄0약간연한빨강버튼); 
	 _8번줄1약간연한빨강버튼.setBounds(X좌표[8], Y좌표[8][1], 120, 60); _8번줄1약간연한빨강버튼.setVisible(false); _8번줄1약간연한빨강버튼.setBorderPainted(false); _8번줄1약간연한빨강버튼.setContentAreaFilled(false); _8번줄1약간연한빨강버튼.setFocusPainted(false); _8번줄1약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(8,1); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_8번줄1약간연한빨강버튼); 
	 _8번줄2약간연한빨강버튼.setBounds(X좌표[8], Y좌표[8][2], 120, 60); _8번줄2약간연한빨강버튼.setVisible(false); _8번줄2약간연한빨강버튼.setBorderPainted(false); _8번줄2약간연한빨강버튼.setContentAreaFilled(false); _8번줄2약간연한빨강버튼.setFocusPainted(false); _8번줄2약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(8,2); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_8번줄2약간연한빨강버튼); 
	 _8번줄3약간연한빨강버튼.setBounds(X좌표[8], Y좌표[8][3], 120, 60); _8번줄3약간연한빨강버튼.setVisible(false); _8번줄3약간연한빨강버튼.setBorderPainted(false); _8번줄3약간연한빨강버튼.setContentAreaFilled(false); _8번줄3약간연한빨강버튼.setFocusPainted(false); _8번줄3약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(8,3); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_8번줄3약간연한빨강버튼); 
	 _8번줄4약간연한빨강버튼.setBounds(X좌표[8], Y좌표[8][4], 120, 60); _8번줄4약간연한빨강버튼.setVisible(false); _8번줄4약간연한빨강버튼.setBorderPainted(false); _8번줄4약간연한빨강버튼.setContentAreaFilled(false); _8번줄4약간연한빨강버튼.setFocusPainted(false); _8번줄4약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(8,4); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_8번줄4약간연한빨강버튼); 
	 _8번줄5약간연한빨강버튼.setBounds(X좌표[8], Y좌표[8][5], 120, 60); _8번줄5약간연한빨강버튼.setVisible(false); _8번줄5약간연한빨강버튼.setBorderPainted(false); _8번줄5약간연한빨강버튼.setContentAreaFilled(false); _8번줄5약간연한빨강버튼.setFocusPainted(false); _8번줄5약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(8,5); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_8번줄5약간연한빨강버튼); 
	 _8번줄6약간연한빨강버튼.setBounds(X좌표[8], Y좌표[8][6], 120, 60); _8번줄6약간연한빨강버튼.setVisible(false); _8번줄6약간연한빨강버튼.setBorderPainted(false); _8번줄6약간연한빨강버튼.setContentAreaFilled(false); _8번줄6약간연한빨강버튼.setFocusPainted(false); _8번줄6약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(8,6); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_8번줄6약간연한빨강버튼); 
	 _8번줄7약간연한빨강버튼.setBounds(X좌표[8], Y좌표[8][7], 120, 60); _8번줄7약간연한빨강버튼.setVisible(false); _8번줄7약간연한빨강버튼.setBorderPainted(false); _8번줄7약간연한빨강버튼.setContentAreaFilled(false); _8번줄7약간연한빨강버튼.setFocusPainted(false); _8번줄7약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(8,7); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_8번줄7약간연한빨강버튼); 
	 _8번줄8약간연한빨강버튼.setBounds(X좌표[8], Y좌표[8][8], 120, 60); _8번줄8약간연한빨강버튼.setVisible(false); _8번줄8약간연한빨강버튼.setBorderPainted(false); _8번줄8약간연한빨강버튼.setContentAreaFilled(false); _8번줄8약간연한빨강버튼.setFocusPainted(false); _8번줄8약간연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(8,8); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_8번줄8약간연한빨강버튼);	

	 _0번줄0연한빨강버튼.setBounds(X좌표[0], Y좌표[0][0], 120, 60); _0번줄0연한빨강버튼.setVisible(false); _0번줄0연한빨강버튼.setBorderPainted(false); _0번줄0연한빨강버튼.setContentAreaFilled(false); _0번줄0연한빨강버튼.setFocusPainted(false); _0번줄0연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(0,0); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_0번줄0연한빨강버튼);
	 _0번줄1연한빨강버튼.setBounds(X좌표[0], Y좌표[0][1], 120, 60); _0번줄1연한빨강버튼.setVisible(false); _0번줄1연한빨강버튼.setBorderPainted(false); _0번줄1연한빨강버튼.setContentAreaFilled(false); _0번줄1연한빨강버튼.setFocusPainted(false); _0번줄1연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(0,1); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_0번줄1연한빨강버튼);
	 _0번줄2연한빨강버튼.setBounds(X좌표[0], Y좌표[0][2], 120, 60); _0번줄2연한빨강버튼.setVisible(false); _0번줄2연한빨강버튼.setBorderPainted(false); _0번줄2연한빨강버튼.setContentAreaFilled(false); _0번줄2연한빨강버튼.setFocusPainted(false); _0번줄2연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(0,2); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_0번줄2연한빨강버튼);
	 _0번줄3연한빨강버튼.setBounds(X좌표[0], Y좌표[0][3], 120, 60); _0번줄3연한빨강버튼.setVisible(false); _0번줄3연한빨강버튼.setBorderPainted(false); _0번줄3연한빨강버튼.setContentAreaFilled(false); _0번줄3연한빨강버튼.setFocusPainted(false); _0번줄3연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(0,3); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_0번줄3연한빨강버튼);
	 _0번줄4연한빨강버튼.setBounds(X좌표[0], Y좌표[0][4], 120, 60); _0번줄4연한빨강버튼.setVisible(false); _0번줄4연한빨강버튼.setBorderPainted(false); _0번줄4연한빨강버튼.setContentAreaFilled(false); _0번줄4연한빨강버튼.setFocusPainted(false); _0번줄4연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(0,4); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_0번줄4연한빨강버튼);
	 _0번줄5연한빨강버튼.setBounds(X좌표[0], Y좌표[0][5], 120, 60); _0번줄5연한빨강버튼.setVisible(false); _0번줄5연한빨강버튼.setBorderPainted(false); _0번줄5연한빨강버튼.setContentAreaFilled(false); _0번줄5연한빨강버튼.setFocusPainted(false); _0번줄5연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(0,5); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_0번줄5연한빨강버튼);
	 _0번줄6연한빨강버튼.setBounds(X좌표[0], Y좌표[0][6], 120, 60); _0번줄6연한빨강버튼.setVisible(false); _0번줄6연한빨강버튼.setBorderPainted(false); _0번줄6연한빨강버튼.setContentAreaFilled(false); _0번줄6연한빨강버튼.setFocusPainted(false); _0번줄6연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(0,6); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_0번줄6연한빨강버튼);
	 _0번줄7연한빨강버튼.setBounds(X좌표[0], Y좌표[0][7], 120, 60); _0번줄7연한빨강버튼.setVisible(false); _0번줄7연한빨강버튼.setBorderPainted(false); _0번줄7연한빨강버튼.setContentAreaFilled(false); _0번줄7연한빨강버튼.setFocusPainted(false); _0번줄7연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(0,7); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_0번줄7연한빨강버튼);
	 _0번줄8연한빨강버튼.setBounds(X좌표[0], Y좌표[0][8], 120, 60); _0번줄8연한빨강버튼.setVisible(false); _0번줄8연한빨강버튼.setBorderPainted(false); _0번줄8연한빨강버튼.setContentAreaFilled(false); _0번줄8연한빨강버튼.setFocusPainted(false); _0번줄8연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(0,8); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_0번줄8연한빨강버튼);
	 _1번줄0연한빨강버튼.setBounds(X좌표[1], Y좌표[1][0], 120, 60); _1번줄0연한빨강버튼.setVisible(false); _1번줄0연한빨강버튼.setBorderPainted(false); _1번줄0연한빨강버튼.setContentAreaFilled(false); _1번줄0연한빨강버튼.setFocusPainted(false); _1번줄0연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(1,0); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_1번줄0연한빨강버튼); 
	 _1번줄1연한빨강버튼.setBounds(X좌표[1], Y좌표[1][1], 120, 60); _1번줄1연한빨강버튼.setVisible(false); _1번줄1연한빨강버튼.setBorderPainted(false); _1번줄1연한빨강버튼.setContentAreaFilled(false); _1번줄1연한빨강버튼.setFocusPainted(false); _1번줄1연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(1,1); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_1번줄1연한빨강버튼); 
	 _1번줄2연한빨강버튼.setBounds(X좌표[1], Y좌표[1][2], 120, 60); _1번줄2연한빨강버튼.setVisible(false); _1번줄2연한빨강버튼.setBorderPainted(false); _1번줄2연한빨강버튼.setContentAreaFilled(false); _1번줄2연한빨강버튼.setFocusPainted(false); _1번줄2연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(1,2); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_1번줄2연한빨강버튼); 
	 _1번줄3연한빨강버튼.setBounds(X좌표[1], Y좌표[1][3], 120, 60); _1번줄3연한빨강버튼.setVisible(false); _1번줄3연한빨강버튼.setBorderPainted(false); _1번줄3연한빨강버튼.setContentAreaFilled(false); _1번줄3연한빨강버튼.setFocusPainted(false); _1번줄3연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(1,3); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_1번줄3연한빨강버튼); 
	 _1번줄4연한빨강버튼.setBounds(X좌표[1], Y좌표[1][4], 120, 60); _1번줄4연한빨강버튼.setVisible(false); _1번줄4연한빨강버튼.setBorderPainted(false); _1번줄4연한빨강버튼.setContentAreaFilled(false); _1번줄4연한빨강버튼.setFocusPainted(false); _1번줄4연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(1,4); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_1번줄4연한빨강버튼); 
	 _1번줄5연한빨강버튼.setBounds(X좌표[1], Y좌표[1][5], 120, 60); _1번줄5연한빨강버튼.setVisible(false); _1번줄5연한빨강버튼.setBorderPainted(false); _1번줄5연한빨강버튼.setContentAreaFilled(false); _1번줄5연한빨강버튼.setFocusPainted(false); _1번줄5연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(1,5); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_1번줄5연한빨강버튼); 
	 _1번줄6연한빨강버튼.setBounds(X좌표[1], Y좌표[1][6], 120, 60); _1번줄6연한빨강버튼.setVisible(false); _1번줄6연한빨강버튼.setBorderPainted(false); _1번줄6연한빨강버튼.setContentAreaFilled(false); _1번줄6연한빨강버튼.setFocusPainted(false); _1번줄6연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(1,6); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_1번줄6연한빨강버튼); 
	 _1번줄7연한빨강버튼.setBounds(X좌표[1], Y좌표[1][7], 120, 60); _1번줄7연한빨강버튼.setVisible(false); _1번줄7연한빨강버튼.setBorderPainted(false); _1번줄7연한빨강버튼.setContentAreaFilled(false); _1번줄7연한빨강버튼.setFocusPainted(false); _1번줄7연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(1,7); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_1번줄7연한빨강버튼); 
	 _1번줄8연한빨강버튼.setBounds(X좌표[1], Y좌표[1][8], 120, 60); _1번줄8연한빨강버튼.setVisible(false); _1번줄8연한빨강버튼.setBorderPainted(false); _1번줄8연한빨강버튼.setContentAreaFilled(false); _1번줄8연한빨강버튼.setFocusPainted(false); _1번줄8연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(1,8); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_1번줄8연한빨강버튼);
	 _2번줄0연한빨강버튼.setBounds(X좌표[2], Y좌표[2][0], 120, 60); _2번줄0연한빨강버튼.setVisible(false); _2번줄0연한빨강버튼.setBorderPainted(false); _2번줄0연한빨강버튼.setContentAreaFilled(false); _2번줄0연한빨강버튼.setFocusPainted(false); _2번줄0연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(2,0); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_2번줄0연한빨강버튼); 
	 _2번줄1연한빨강버튼.setBounds(X좌표[2], Y좌표[2][1], 120, 60); _2번줄1연한빨강버튼.setVisible(false); _2번줄1연한빨강버튼.setBorderPainted(false); _2번줄1연한빨강버튼.setContentAreaFilled(false); _2번줄1연한빨강버튼.setFocusPainted(false); _2번줄1연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(2,1); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_2번줄1연한빨강버튼); 
	 _2번줄2연한빨강버튼.setBounds(X좌표[2], Y좌표[2][2], 120, 60); _2번줄2연한빨강버튼.setVisible(false); _2번줄2연한빨강버튼.setBorderPainted(false); _2번줄2연한빨강버튼.setContentAreaFilled(false); _2번줄2연한빨강버튼.setFocusPainted(false); _2번줄2연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(2,2); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_2번줄2연한빨강버튼); 
	 _2번줄3연한빨강버튼.setBounds(X좌표[2], Y좌표[2][3], 120, 60); _2번줄3연한빨강버튼.setVisible(false); _2번줄3연한빨강버튼.setBorderPainted(false); _2번줄3연한빨강버튼.setContentAreaFilled(false); _2번줄3연한빨강버튼.setFocusPainted(false); _2번줄3연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(2,3); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_2번줄3연한빨강버튼); 
	 _2번줄4연한빨강버튼.setBounds(X좌표[2], Y좌표[2][4], 120, 60); _2번줄4연한빨강버튼.setVisible(false); _2번줄4연한빨강버튼.setBorderPainted(false); _2번줄4연한빨강버튼.setContentAreaFilled(false); _2번줄4연한빨강버튼.setFocusPainted(false); _2번줄4연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(2,4); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_2번줄4연한빨강버튼); 
	 _2번줄5연한빨강버튼.setBounds(X좌표[2], Y좌표[2][5], 120, 60); _2번줄5연한빨강버튼.setVisible(false); _2번줄5연한빨강버튼.setBorderPainted(false); _2번줄5연한빨강버튼.setContentAreaFilled(false); _2번줄5연한빨강버튼.setFocusPainted(false); _2번줄5연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(2,5); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_2번줄5연한빨강버튼); 
	 _2번줄6연한빨강버튼.setBounds(X좌표[2], Y좌표[2][6], 120, 60); _2번줄6연한빨강버튼.setVisible(false); _2번줄6연한빨강버튼.setBorderPainted(false); _2번줄6연한빨강버튼.setContentAreaFilled(false); _2번줄6연한빨강버튼.setFocusPainted(false); _2번줄6연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(2,6); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_2번줄6연한빨강버튼); 
	 _2번줄7연한빨강버튼.setBounds(X좌표[2], Y좌표[2][7], 120, 60); _2번줄7연한빨강버튼.setVisible(false); _2번줄7연한빨강버튼.setBorderPainted(false); _2번줄7연한빨강버튼.setContentAreaFilled(false); _2번줄7연한빨강버튼.setFocusPainted(false); _2번줄7연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(2,7); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_2번줄7연한빨강버튼); 
	 _2번줄8연한빨강버튼.setBounds(X좌표[2], Y좌표[2][8], 120, 60); _2번줄8연한빨강버튼.setVisible(false); _2번줄8연한빨강버튼.setBorderPainted(false); _2번줄8연한빨강버튼.setContentAreaFilled(false); _2번줄8연한빨강버튼.setFocusPainted(false); _2번줄8연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(2,8); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_2번줄8연한빨강버튼);
	 _3번줄0연한빨강버튼.setBounds(X좌표[3], Y좌표[3][0], 120, 60); _3번줄0연한빨강버튼.setVisible(false); _3번줄0연한빨강버튼.setBorderPainted(false); _3번줄0연한빨강버튼.setContentAreaFilled(false); _3번줄0연한빨강버튼.setFocusPainted(false); _3번줄0연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(3,0); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_3번줄0연한빨강버튼); 
	 _3번줄1연한빨강버튼.setBounds(X좌표[3], Y좌표[3][1], 120, 60); _3번줄1연한빨강버튼.setVisible(false); _3번줄1연한빨강버튼.setBorderPainted(false); _3번줄1연한빨강버튼.setContentAreaFilled(false); _3번줄1연한빨강버튼.setFocusPainted(false); _3번줄1연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(3,1); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_3번줄1연한빨강버튼); 
	 _3번줄2연한빨강버튼.setBounds(X좌표[3], Y좌표[3][2], 120, 60); _3번줄2연한빨강버튼.setVisible(false); _3번줄2연한빨강버튼.setBorderPainted(false); _3번줄2연한빨강버튼.setContentAreaFilled(false); _3번줄2연한빨강버튼.setFocusPainted(false); _3번줄2연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(3,2); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_3번줄2연한빨강버튼); 
	 _3번줄3연한빨강버튼.setBounds(X좌표[3], Y좌표[3][3], 120, 60); _3번줄3연한빨강버튼.setVisible(false); _3번줄3연한빨강버튼.setBorderPainted(false); _3번줄3연한빨강버튼.setContentAreaFilled(false); _3번줄3연한빨강버튼.setFocusPainted(false); _3번줄3연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(3,3); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_3번줄3연한빨강버튼); 
	 _3번줄4연한빨강버튼.setBounds(X좌표[3], Y좌표[3][4], 120, 60); _3번줄4연한빨강버튼.setVisible(false); _3번줄4연한빨강버튼.setBorderPainted(false); _3번줄4연한빨강버튼.setContentAreaFilled(false); _3번줄4연한빨강버튼.setFocusPainted(false); _3번줄4연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(3,4); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_3번줄4연한빨강버튼); 
	 _3번줄5연한빨강버튼.setBounds(X좌표[3], Y좌표[3][5], 120, 60); _3번줄5연한빨강버튼.setVisible(false); _3번줄5연한빨강버튼.setBorderPainted(false); _3번줄5연한빨강버튼.setContentAreaFilled(false); _3번줄5연한빨강버튼.setFocusPainted(false); _3번줄5연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(3,5); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_3번줄5연한빨강버튼); 
	 _3번줄6연한빨강버튼.setBounds(X좌표[3], Y좌표[3][6], 120, 60); _3번줄6연한빨강버튼.setVisible(false); _3번줄6연한빨강버튼.setBorderPainted(false); _3번줄6연한빨강버튼.setContentAreaFilled(false); _3번줄6연한빨강버튼.setFocusPainted(false); _3번줄6연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(3,6); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_3번줄6연한빨강버튼); 
	 _3번줄7연한빨강버튼.setBounds(X좌표[3], Y좌표[3][7], 120, 60); _3번줄7연한빨강버튼.setVisible(false); _3번줄7연한빨강버튼.setBorderPainted(false); _3번줄7연한빨강버튼.setContentAreaFilled(false); _3번줄7연한빨강버튼.setFocusPainted(false); _3번줄7연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(3,7); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_3번줄7연한빨강버튼); 
	 _3번줄8연한빨강버튼.setBounds(X좌표[3], Y좌표[3][8], 120, 60); _3번줄8연한빨강버튼.setVisible(false); _3번줄8연한빨강버튼.setBorderPainted(false); _3번줄8연한빨강버튼.setContentAreaFilled(false); _3번줄8연한빨강버튼.setFocusPainted(false); _3번줄8연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(3,8); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_3번줄8연한빨강버튼);
	 _4번줄0연한빨강버튼.setBounds(X좌표[4], Y좌표[4][0], 120, 64); _4번줄0연한빨강버튼.setVisible(false); _4번줄0연한빨강버튼.setBorderPainted(false); _4번줄0연한빨강버튼.setContentAreaFilled(false); _4번줄0연한빨강버튼.setFocusPainted(false); _4번줄0연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(4,0); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_4번줄0연한빨강버튼); 
	 _4번줄1연한빨강버튼.setBounds(X좌표[4], Y좌표[4][1], 120, 64); _4번줄1연한빨강버튼.setVisible(false); _4번줄1연한빨강버튼.setBorderPainted(false); _4번줄1연한빨강버튼.setContentAreaFilled(false); _4번줄1연한빨강버튼.setFocusPainted(false); _4번줄1연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(4,1); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_4번줄1연한빨강버튼); 
	 _4번줄2연한빨강버튼.setBounds(X좌표[4], Y좌표[4][2], 120, 64); _4번줄2연한빨강버튼.setVisible(false); _4번줄2연한빨강버튼.setBorderPainted(false); _4번줄2연한빨강버튼.setContentAreaFilled(false); _4번줄2연한빨강버튼.setFocusPainted(false); _4번줄2연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(4,2); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_4번줄2연한빨강버튼); 
	 _4번줄3연한빨강버튼.setBounds(X좌표[4], Y좌표[4][3], 120, 64); _4번줄3연한빨강버튼.setVisible(false); _4번줄3연한빨강버튼.setBorderPainted(false); _4번줄3연한빨강버튼.setContentAreaFilled(false); _4번줄3연한빨강버튼.setFocusPainted(false); _4번줄3연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(4,3); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_4번줄3연한빨강버튼); 
	 _4번줄4연한빨강버튼.setBounds(X좌표[4], Y좌표[4][4], 120, 64); _4번줄4연한빨강버튼.setVisible(false); _4번줄4연한빨강버튼.setBorderPainted(false); _4번줄4연한빨강버튼.setContentAreaFilled(false); _4번줄4연한빨강버튼.setFocusPainted(false); _4번줄4연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(4,4); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_4번줄4연한빨강버튼); 
	 _4번줄5연한빨강버튼.setBounds(X좌표[4], Y좌표[4][5], 120, 64); _4번줄5연한빨강버튼.setVisible(false); _4번줄5연한빨강버튼.setBorderPainted(false); _4번줄5연한빨강버튼.setContentAreaFilled(false); _4번줄5연한빨강버튼.setFocusPainted(false); _4번줄5연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(4,5); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_4번줄5연한빨강버튼); 
	 _4번줄6연한빨강버튼.setBounds(X좌표[4], Y좌표[4][6], 120, 64); _4번줄6연한빨강버튼.setVisible(false); _4번줄6연한빨강버튼.setBorderPainted(false); _4번줄6연한빨강버튼.setContentAreaFilled(false); _4번줄6연한빨강버튼.setFocusPainted(false); _4번줄6연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(4,6); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_4번줄6연한빨강버튼); 
	 _4번줄7연한빨강버튼.setBounds(X좌표[4], Y좌표[4][7], 120, 64); _4번줄7연한빨강버튼.setVisible(false); _4번줄7연한빨강버튼.setBorderPainted(false); _4번줄7연한빨강버튼.setContentAreaFilled(false); _4번줄7연한빨강버튼.setFocusPainted(false); _4번줄7연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(4,7); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_4번줄7연한빨강버튼); 
	 _4번줄8연한빨강버튼.setBounds(X좌표[4], Y좌표[4][8], 120, 64); _4번줄8연한빨강버튼.setVisible(false); _4번줄8연한빨강버튼.setBorderPainted(false); _4번줄8연한빨강버튼.setContentAreaFilled(false); _4번줄8연한빨강버튼.setFocusPainted(false); _4번줄8연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(4,8); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_4번줄8연한빨강버튼);
	 _5번줄0연한빨강버튼.setBounds(X좌표[5], Y좌표[5][0], 120, 60); _5번줄0연한빨강버튼.setVisible(false); _5번줄0연한빨강버튼.setBorderPainted(false); _5번줄0연한빨강버튼.setContentAreaFilled(false); _5번줄0연한빨강버튼.setFocusPainted(false); _5번줄0연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(5,0); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_5번줄0연한빨강버튼); 
	 _5번줄1연한빨강버튼.setBounds(X좌표[5], Y좌표[5][1], 120, 60); _5번줄1연한빨강버튼.setVisible(false); _5번줄1연한빨강버튼.setBorderPainted(false); _5번줄1연한빨강버튼.setContentAreaFilled(false); _5번줄1연한빨강버튼.setFocusPainted(false); _5번줄1연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(5,1); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_5번줄1연한빨강버튼); 
	 _5번줄2연한빨강버튼.setBounds(X좌표[5], Y좌표[5][2], 120, 60); _5번줄2연한빨강버튼.setVisible(false); _5번줄2연한빨강버튼.setBorderPainted(false); _5번줄2연한빨강버튼.setContentAreaFilled(false); _5번줄2연한빨강버튼.setFocusPainted(false); _5번줄2연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(5,2); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_5번줄2연한빨강버튼); 
	 _5번줄3연한빨강버튼.setBounds(X좌표[5], Y좌표[5][3], 120, 60); _5번줄3연한빨강버튼.setVisible(false); _5번줄3연한빨강버튼.setBorderPainted(false); _5번줄3연한빨강버튼.setContentAreaFilled(false); _5번줄3연한빨강버튼.setFocusPainted(false); _5번줄3연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(5,3); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_5번줄3연한빨강버튼); 
	 _5번줄4연한빨강버튼.setBounds(X좌표[5], Y좌표[5][4], 120, 60); _5번줄4연한빨강버튼.setVisible(false); _5번줄4연한빨강버튼.setBorderPainted(false); _5번줄4연한빨강버튼.setContentAreaFilled(false); _5번줄4연한빨강버튼.setFocusPainted(false); _5번줄4연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(5,4); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_5번줄4연한빨강버튼); 
	 _5번줄5연한빨강버튼.setBounds(X좌표[5], Y좌표[5][5], 120, 60); _5번줄5연한빨강버튼.setVisible(false); _5번줄5연한빨강버튼.setBorderPainted(false); _5번줄5연한빨강버튼.setContentAreaFilled(false); _5번줄5연한빨강버튼.setFocusPainted(false); _5번줄5연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(5,5); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_5번줄5연한빨강버튼); 
	 _5번줄6연한빨강버튼.setBounds(X좌표[5], Y좌표[5][6], 120, 60); _5번줄6연한빨강버튼.setVisible(false); _5번줄6연한빨강버튼.setBorderPainted(false); _5번줄6연한빨강버튼.setContentAreaFilled(false); _5번줄6연한빨강버튼.setFocusPainted(false); _5번줄6연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(5,6); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_5번줄6연한빨강버튼); 
	 _5번줄7연한빨강버튼.setBounds(X좌표[5], Y좌표[5][7], 120, 60); _5번줄7연한빨강버튼.setVisible(false); _5번줄7연한빨강버튼.setBorderPainted(false); _5번줄7연한빨강버튼.setContentAreaFilled(false); _5번줄7연한빨강버튼.setFocusPainted(false); _5번줄7연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(5,7); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_5번줄7연한빨강버튼); 
	 _5번줄8연한빨강버튼.setBounds(X좌표[5], Y좌표[5][8], 120, 60); _5번줄8연한빨강버튼.setVisible(false); _5번줄8연한빨강버튼.setBorderPainted(false); _5번줄8연한빨강버튼.setContentAreaFilled(false); _5번줄8연한빨강버튼.setFocusPainted(false); _5번줄8연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(5,8); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_5번줄8연한빨강버튼);
	 _6번줄0연한빨강버튼.setBounds(X좌표[6], Y좌표[6][0], 120, 60); _6번줄0연한빨강버튼.setVisible(false); _6번줄0연한빨강버튼.setBorderPainted(false); _6번줄0연한빨강버튼.setContentAreaFilled(false); _6번줄0연한빨강버튼.setFocusPainted(false); _6번줄0연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(6,0); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_6번줄0연한빨강버튼); 
	 _6번줄1연한빨강버튼.setBounds(X좌표[6], Y좌표[6][1], 120, 60); _6번줄1연한빨강버튼.setVisible(false); _6번줄1연한빨강버튼.setBorderPainted(false); _6번줄1연한빨강버튼.setContentAreaFilled(false); _6번줄1연한빨강버튼.setFocusPainted(false); _6번줄1연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(6,1); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_6번줄1연한빨강버튼); 
	 _6번줄2연한빨강버튼.setBounds(X좌표[6], Y좌표[6][2], 120, 60); _6번줄2연한빨강버튼.setVisible(false); _6번줄2연한빨강버튼.setBorderPainted(false); _6번줄2연한빨강버튼.setContentAreaFilled(false); _6번줄2연한빨강버튼.setFocusPainted(false); _6번줄2연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(6,2); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_6번줄2연한빨강버튼);
	 _6번줄3연한빨강버튼.setBounds(X좌표[6], Y좌표[6][3], 120, 60); _6번줄3연한빨강버튼.setVisible(false); _6번줄3연한빨강버튼.setBorderPainted(false); _6번줄3연한빨강버튼.setContentAreaFilled(false); _6번줄3연한빨강버튼.setFocusPainted(false); _6번줄3연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(6,3); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_6번줄3연한빨강버튼); 
	 _6번줄4연한빨강버튼.setBounds(X좌표[6], Y좌표[6][4], 120, 60); _6번줄4연한빨강버튼.setVisible(false); _6번줄4연한빨강버튼.setBorderPainted(false); _6번줄4연한빨강버튼.setContentAreaFilled(false); _6번줄4연한빨강버튼.setFocusPainted(false); _6번줄4연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(6,4); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_6번줄4연한빨강버튼); 
	 _6번줄5연한빨강버튼.setBounds(X좌표[6], Y좌표[6][5], 120, 60); _6번줄5연한빨강버튼.setVisible(false); _6번줄5연한빨강버튼.setBorderPainted(false); _6번줄5연한빨강버튼.setContentAreaFilled(false); _6번줄5연한빨강버튼.setFocusPainted(false); _6번줄5연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(6,5); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_6번줄5연한빨강버튼); 
	 _6번줄6연한빨강버튼.setBounds(X좌표[6], Y좌표[6][6], 120, 60); _6번줄6연한빨강버튼.setVisible(false); _6번줄6연한빨강버튼.setBorderPainted(false); _6번줄6연한빨강버튼.setContentAreaFilled(false); _6번줄6연한빨강버튼.setFocusPainted(false); _6번줄6연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(6,6); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_6번줄6연한빨강버튼); 
	 _6번줄7연한빨강버튼.setBounds(X좌표[6], Y좌표[6][7], 120, 60); _6번줄7연한빨강버튼.setVisible(false); _6번줄7연한빨강버튼.setBorderPainted(false); _6번줄7연한빨강버튼.setContentAreaFilled(false); _6번줄7연한빨강버튼.setFocusPainted(false); _6번줄7연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(6,7); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_6번줄7연한빨강버튼); 
	 _6번줄8연한빨강버튼.setBounds(X좌표[6], Y좌표[6][8], 120, 60); _6번줄8연한빨강버튼.setVisible(false); _6번줄8연한빨강버튼.setBorderPainted(false); _6번줄8연한빨강버튼.setContentAreaFilled(false); _6번줄8연한빨강버튼.setFocusPainted(false); _6번줄8연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(6,8); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_6번줄8연한빨강버튼);
	 _7번줄0연한빨강버튼.setBounds(X좌표[7], Y좌표[7][0], 120, 60); _7번줄0연한빨강버튼.setVisible(false); _7번줄0연한빨강버튼.setBorderPainted(false); _7번줄0연한빨강버튼.setContentAreaFilled(false); _7번줄0연한빨강버튼.setFocusPainted(false); _7번줄0연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(7,0); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_7번줄0연한빨강버튼); 
	 _7번줄1연한빨강버튼.setBounds(X좌표[7], Y좌표[7][1], 120, 60); _7번줄1연한빨강버튼.setVisible(false); _7번줄1연한빨강버튼.setBorderPainted(false); _7번줄1연한빨강버튼.setContentAreaFilled(false); _7번줄1연한빨강버튼.setFocusPainted(false); _7번줄1연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(7,1); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_7번줄1연한빨강버튼); 
	 _7번줄2연한빨강버튼.setBounds(X좌표[7], Y좌표[7][2], 120, 60); _7번줄2연한빨강버튼.setVisible(false); _7번줄2연한빨강버튼.setBorderPainted(false); _7번줄2연한빨강버튼.setContentAreaFilled(false); _7번줄2연한빨강버튼.setFocusPainted(false); _7번줄2연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(7,2); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_7번줄2연한빨강버튼); 
	 _7번줄3연한빨강버튼.setBounds(X좌표[7], Y좌표[7][3], 120, 60); _7번줄3연한빨강버튼.setVisible(false); _7번줄3연한빨강버튼.setBorderPainted(false); _7번줄3연한빨강버튼.setContentAreaFilled(false); _7번줄3연한빨강버튼.setFocusPainted(false); _7번줄3연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(7,3); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_7번줄3연한빨강버튼); 
	 _7번줄4연한빨강버튼.setBounds(X좌표[7], Y좌표[7][4], 120, 60); _7번줄4연한빨강버튼.setVisible(false); _7번줄4연한빨강버튼.setBorderPainted(false); _7번줄4연한빨강버튼.setContentAreaFilled(false); _7번줄4연한빨강버튼.setFocusPainted(false); _7번줄4연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(7,4); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_7번줄4연한빨강버튼); 
	 _7번줄5연한빨강버튼.setBounds(X좌표[7], Y좌표[7][5], 120, 60); _7번줄5연한빨강버튼.setVisible(false); _7번줄5연한빨강버튼.setBorderPainted(false); _7번줄5연한빨강버튼.setContentAreaFilled(false); _7번줄5연한빨강버튼.setFocusPainted(false); _7번줄5연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(7,5); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_7번줄5연한빨강버튼); 
	 _7번줄6연한빨강버튼.setBounds(X좌표[7], Y좌표[7][6], 120, 60); _7번줄6연한빨강버튼.setVisible(false); _7번줄6연한빨강버튼.setBorderPainted(false); _7번줄6연한빨강버튼.setContentAreaFilled(false); _7번줄6연한빨강버튼.setFocusPainted(false); _7번줄6연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(7,6); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_7번줄6연한빨강버튼); 
	 _7번줄7연한빨강버튼.setBounds(X좌표[7], Y좌표[7][7], 120, 60); _7번줄7연한빨강버튼.setVisible(false); _7번줄7연한빨강버튼.setBorderPainted(false); _7번줄7연한빨강버튼.setContentAreaFilled(false); _7번줄7연한빨강버튼.setFocusPainted(false); _7번줄7연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(7,7); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_7번줄7연한빨강버튼); 
	 _7번줄8연한빨강버튼.setBounds(X좌표[7], Y좌표[7][8], 120, 60); _7번줄8연한빨강버튼.setVisible(false); _7번줄8연한빨강버튼.setBorderPainted(false); _7번줄8연한빨강버튼.setContentAreaFilled(false); _7번줄8연한빨강버튼.setFocusPainted(false); _7번줄8연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(7,8); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_7번줄8연한빨강버튼);
	 _8번줄0연한빨강버튼.setBounds(X좌표[8], Y좌표[8][0], 120, 60); _8번줄0연한빨강버튼.setVisible(false); _8번줄0연한빨강버튼.setBorderPainted(false); _8번줄0연한빨강버튼.setContentAreaFilled(false); _8번줄0연한빨강버튼.setFocusPainted(false); _8번줄0연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(8,0); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_8번줄0연한빨강버튼); 
	 _8번줄1연한빨강버튼.setBounds(X좌표[8], Y좌표[8][1], 120, 60); _8번줄1연한빨강버튼.setVisible(false); _8번줄1연한빨강버튼.setBorderPainted(false); _8번줄1연한빨강버튼.setContentAreaFilled(false); _8번줄1연한빨강버튼.setFocusPainted(false); _8번줄1연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(8,1); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_8번줄1연한빨강버튼); 
	 _8번줄2연한빨강버튼.setBounds(X좌표[8], Y좌표[8][2], 120, 60); _8번줄2연한빨강버튼.setVisible(false); _8번줄2연한빨강버튼.setBorderPainted(false); _8번줄2연한빨강버튼.setContentAreaFilled(false); _8번줄2연한빨강버튼.setFocusPainted(false); _8번줄2연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(8,2); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_8번줄2연한빨강버튼); 
	 _8번줄3연한빨강버튼.setBounds(X좌표[8], Y좌표[8][3], 120, 60); _8번줄3연한빨강버튼.setVisible(false); _8번줄3연한빨강버튼.setBorderPainted(false); _8번줄3연한빨강버튼.setContentAreaFilled(false); _8번줄3연한빨강버튼.setFocusPainted(false); _8번줄3연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(8,3); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_8번줄3연한빨강버튼); 
	 _8번줄4연한빨강버튼.setBounds(X좌표[8], Y좌표[8][4], 120, 60); _8번줄4연한빨강버튼.setVisible(false); _8번줄4연한빨강버튼.setBorderPainted(false); _8번줄4연한빨강버튼.setContentAreaFilled(false); _8번줄4연한빨강버튼.setFocusPainted(false); _8번줄4연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(8,4); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_8번줄4연한빨강버튼); 
	 _8번줄5연한빨강버튼.setBounds(X좌표[8], Y좌표[8][5], 120, 60); _8번줄5연한빨강버튼.setVisible(false); _8번줄5연한빨강버튼.setBorderPainted(false); _8번줄5연한빨강버튼.setContentAreaFilled(false); _8번줄5연한빨강버튼.setFocusPainted(false); _8번줄5연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(8,5); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_8번줄5연한빨강버튼); 
	 _8번줄6연한빨강버튼.setBounds(X좌표[8], Y좌표[8][6], 120, 60); _8번줄6연한빨강버튼.setVisible(false); _8번줄6연한빨강버튼.setBorderPainted(false); _8번줄6연한빨강버튼.setContentAreaFilled(false); _8번줄6연한빨강버튼.setFocusPainted(false); _8번줄6연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(8,6); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_8번줄6연한빨강버튼); 
	 _8번줄7연한빨강버튼.setBounds(X좌표[8], Y좌표[8][7], 120, 60); _8번줄7연한빨강버튼.setVisible(false); _8번줄7연한빨강버튼.setBorderPainted(false); _8번줄7연한빨강버튼.setContentAreaFilled(false); _8번줄7연한빨강버튼.setFocusPainted(false); _8번줄7연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(8,7); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_8번줄7연한빨강버튼); 
	 _8번줄8연한빨강버튼.setBounds(X좌표[8], Y좌표[8][8], 120, 60); _8번줄8연한빨강버튼.setVisible(false); _8번줄8연한빨강버튼.setBorderPainted(false); _8번줄8연한빨강버튼.setContentAreaFilled(false); _8번줄8연한빨강버튼.setFocusPainted(false); _8번줄8연한빨강버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(8,8); 가이드라인끔(); 현재차례=0;}});
	 getContentPane().add(_8번줄8연한빨강버튼);	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	 	파랑순서.setBounds(868,0,400,100); 파랑순서.setVisible(false); 파랑순서.setBorderPainted(false); 파랑순서.setContentAreaFilled(false); 파랑순서.setFocusPainted(false);
	 	파랑0.setBounds(1180,90,50,100); 파랑0.setVisible(false); 파랑0.setBorderPainted(false); 파랑0.setContentAreaFilled(false); 파랑0.setFocusPainted(false);
		파랑1.setBounds(1180,90,50,100); 파랑1.setVisible(false); 파랑1.setBorderPainted(false); 파랑1.setContentAreaFilled(false); 파랑1.setFocusPainted(false);
		파랑2.setBounds(1180,90,50,100); 파랑2.setVisible(false); 파랑2.setBorderPainted(false); 파랑2.setContentAreaFilled(false); 파랑2.setFocusPainted(false);
		파랑3.setBounds(1180,90,50,100); 파랑3.setVisible(false); 파랑3.setBorderPainted(false); 파랑3.setContentAreaFilled(false); 파랑3.setFocusPainted(false);
		파랑4.setBounds(1180,90,50,100); 파랑4.setVisible(false); 파랑4.setBorderPainted(false); 파랑4.setContentAreaFilled(false); 파랑4.setFocusPainted(false);
		파랑5.setBounds(1180,90,50,100); 파랑5.setVisible(false); 파랑5.setBorderPainted(false); 파랑5.setContentAreaFilled(false); 파랑5.setFocusPainted(false);
		파랑6.setBounds(1180,90,50,100); 파랑6.setVisible(false); 파랑6.setBorderPainted(false); 파랑6.setContentAreaFilled(false); 파랑6.setFocusPainted(false);
		파랑7.setBounds(1180,90,50,100); 파랑7.setVisible(false); 파랑7.setBorderPainted(false); 파랑7.setContentAreaFilled(false); 파랑7.setFocusPainted(false);
		파랑8.setBounds(1180,90,50,100); 파랑8.setVisible(false); 파랑8.setBorderPainted(false); 파랑8.setContentAreaFilled(false); 파랑8.setFocusPainted(false);
		파랑9.setBounds(1180,90,50,100); 파랑9.setVisible(false); 파랑9.setBorderPainted(false); 파랑9.setContentAreaFilled(false); 파랑9.setFocusPainted(false);
		 getContentPane().add(파랑0); getContentPane().add(파랑1); getContentPane().add(파랑2); getContentPane().add(파랑3); getContentPane().add(파랑4);
		 getContentPane().add(파랑5); getContentPane().add(파랑6); getContentPane().add(파랑7); getContentPane().add(파랑8); getContentPane().add(파랑9);
			파랑00.setBounds(1130,90,50,100); 파랑00.setVisible(false); 파랑00.setBorderPainted(false); 파랑00.setContentAreaFilled(false); 파랑00.setFocusPainted(false);
			파랑10.setBounds(1130,90,50,100); 파랑10.setVisible(false); 파랑10.setBorderPainted(false); 파랑10.setContentAreaFilled(false); 파랑10.setFocusPainted(false);
			파랑20.setBounds(1130,90,50,100); 파랑20.setVisible(false); 파랑20.setBorderPainted(false); 파랑20.setContentAreaFilled(false); 파랑20.setFocusPainted(false);
			파랑30.setBounds(1130,90,50,100); 파랑30.setVisible(false); 파랑30.setBorderPainted(false); 파랑30.setContentAreaFilled(false); 파랑30.setFocusPainted(false);
			파랑40.setBounds(1130,90,50,100); 파랑40.setVisible(false); 파랑40.setBorderPainted(false); 파랑40.setContentAreaFilled(false); 파랑40.setFocusPainted(false);
			파랑50.setBounds(1130,90,50,100); 파랑50.setVisible(false); 파랑50.setBorderPainted(false); 파랑50.setContentAreaFilled(false); 파랑50.setFocusPainted(false);
			파랑60.setBounds(1130,90,50,100); 파랑60.setVisible(false); 파랑60.setBorderPainted(false); 파랑60.setContentAreaFilled(false); 파랑60.setFocusPainted(false);
			파랑70.setBounds(1130,90,50,100); 파랑70.setVisible(false); 파랑70.setBorderPainted(false); 파랑70.setContentAreaFilled(false); 파랑70.setFocusPainted(false);
			파랑90.setBounds(1130,90,50,100); 파랑90.setVisible(false); 파랑90.setBorderPainted(false); 파랑90.setContentAreaFilled(false); 파랑90.setFocusPainted(false);
			파랑90.setBounds(1130,90,50,100); 파랑90.setVisible(false); 파랑90.setBorderPainted(false); 파랑90.setContentAreaFilled(false); 파랑90.setFocusPainted(false);
			 getContentPane().add(파랑00); getContentPane().add(파랑10); getContentPane().add(파랑20); getContentPane().add(파랑30); getContentPane().add(파랑40);
			 getContentPane().add(파랑50); getContentPane().add(파랑60); getContentPane().add(파랑70); getContentPane().add(파랑80); getContentPane().add(파랑90);
	 _0번줄0파랑버튼.setBounds(X좌표[0], Y좌표[0][0], 120, 60); _0번줄0파랑버튼.setVisible(false); _0번줄0파랑버튼.setBorderPainted(false); _0번줄0파랑버튼.setContentAreaFilled(false); _0번줄0파랑버튼.setFocusPainted(false); _0번줄0파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _0번줄0파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(0,0);}}});
	 getContentPane().add(_0번줄0파랑버튼);
	 _0번줄1파랑버튼.setBounds(X좌표[0], Y좌표[0][1], 120, 60); _0번줄1파랑버튼.setVisible(false); _0번줄1파랑버튼.setBorderPainted(false); _0번줄1파랑버튼.setContentAreaFilled(false); _0번줄1파랑버튼.setFocusPainted(false); _0번줄1파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _0번줄1파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(0,1);}}});
	 getContentPane().add(_0번줄1파랑버튼);
	 _0번줄2파랑버튼.setBounds(X좌표[0], Y좌표[0][2], 120, 60); _0번줄2파랑버튼.setVisible(false); _0번줄2파랑버튼.setBorderPainted(false); _0번줄2파랑버튼.setContentAreaFilled(false); _0번줄2파랑버튼.setFocusPainted(false); _0번줄2파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _0번줄2파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(0,2);}}});
	 getContentPane().add(_0번줄2파랑버튼);
	 _0번줄3파랑버튼.setBounds(X좌표[0], Y좌표[0][3], 120, 60); _0번줄3파랑버튼.setVisible(false); _0번줄3파랑버튼.setBorderPainted(false); _0번줄3파랑버튼.setContentAreaFilled(false); _0번줄3파랑버튼.setFocusPainted(false); _0번줄3파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _0번줄3파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(0,3);}}});
	 getContentPane().add(_0번줄3파랑버튼);
	 _0번줄4파랑버튼.setBounds(X좌표[0], Y좌표[0][4], 120, 60); _0번줄4파랑버튼.setVisible(false); _0번줄4파랑버튼.setBorderPainted(false); _0번줄4파랑버튼.setContentAreaFilled(false); _0번줄4파랑버튼.setFocusPainted(false); _0번줄4파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _0번줄4파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(0,4);}}});
	 getContentPane().add(_0번줄4파랑버튼);
	 _0번줄5파랑버튼.setBounds(X좌표[0], Y좌표[0][5], 120, 60); _0번줄5파랑버튼.setVisible(false); _0번줄5파랑버튼.setBorderPainted(false); _0번줄5파랑버튼.setContentAreaFilled(false); _0번줄5파랑버튼.setFocusPainted(false); _0번줄5파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _0번줄5파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(0,5);}}});
	 getContentPane().add(_0번줄5파랑버튼);
	 _0번줄6파랑버튼.setBounds(X좌표[0], Y좌표[0][6], 120, 60); _0번줄6파랑버튼.setVisible(false); _0번줄6파랑버튼.setBorderPainted(false); _0번줄6파랑버튼.setContentAreaFilled(false); _0번줄6파랑버튼.setFocusPainted(false); _0번줄6파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _0번줄6파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(0,6);}}});
	 getContentPane().add(_0번줄6파랑버튼);
	 _0번줄7파랑버튼.setBounds(X좌표[0], Y좌표[0][7], 120, 60); _0번줄7파랑버튼.setVisible(false); _0번줄7파랑버튼.setBorderPainted(false); _0번줄7파랑버튼.setContentAreaFilled(false); _0번줄7파랑버튼.setFocusPainted(false); _0번줄7파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _0번줄7파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(0,7);}}});
	 getContentPane().add(_0번줄7파랑버튼);
	 _0번줄8파랑버튼.setBounds(X좌표[0], Y좌표[0][8], 120, 60); _0번줄8파랑버튼.setVisible(false); _0번줄8파랑버튼.setBorderPainted(false); _0번줄8파랑버튼.setContentAreaFilled(false); _0번줄8파랑버튼.setFocusPainted(false); _0번줄8파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _0번줄8파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(0,8);}}});
	 getContentPane().add(_0번줄8파랑버튼);
	 _1번줄0파랑버튼.setBounds(X좌표[1], Y좌표[1][0], 120, 60); _1번줄0파랑버튼.setVisible(false); _1번줄0파랑버튼.setBorderPainted(false); _1번줄0파랑버튼.setContentAreaFilled(false); _1번줄0파랑버튼.setFocusPainted(false); _1번줄0파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _1번줄0파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(1,0);}}});
	 getContentPane().add(_1번줄0파랑버튼);  
	 _1번줄1파랑버튼.setBounds(X좌표[1], Y좌표[1][1], 120, 60); _1번줄1파랑버튼.setVisible(false); _1번줄1파랑버튼.setBorderPainted(false); _1번줄1파랑버튼.setContentAreaFilled(false); _1번줄1파랑버튼.setFocusPainted(false); _1번줄1파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _1번줄1파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(1,1);}}});
	 getContentPane().add(_1번줄1파랑버튼);  
	 _1번줄2파랑버튼.setBounds(X좌표[1], Y좌표[1][2], 120, 60); _1번줄2파랑버튼.setVisible(false); _1번줄2파랑버튼.setBorderPainted(false); _1번줄2파랑버튼.setContentAreaFilled(false); _1번줄2파랑버튼.setFocusPainted(false); _1번줄2파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _1번줄2파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(1,2);}}});
	 getContentPane().add(_1번줄2파랑버튼);  
	 _1번줄3파랑버튼.setBounds(X좌표[1], Y좌표[1][3], 120, 60); _1번줄3파랑버튼.setVisible(false); _1번줄3파랑버튼.setBorderPainted(false); _1번줄3파랑버튼.setContentAreaFilled(false); _1번줄3파랑버튼.setFocusPainted(false); _1번줄3파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _1번줄3파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(1,3);}}});
	 getContentPane().add(_1번줄3파랑버튼);  
	 _1번줄4파랑버튼.setBounds(X좌표[1], Y좌표[1][4], 120, 60); _1번줄4파랑버튼.setVisible(false); _1번줄4파랑버튼.setBorderPainted(false); _1번줄4파랑버튼.setContentAreaFilled(false); _1번줄4파랑버튼.setFocusPainted(false); _1번줄4파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _1번줄4파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(1,4);}}});
	 getContentPane().add(_1번줄4파랑버튼);  
	 _1번줄5파랑버튼.setBounds(X좌표[1], Y좌표[1][5], 120, 60); _1번줄5파랑버튼.setVisible(false); _1번줄5파랑버튼.setBorderPainted(false); _1번줄5파랑버튼.setContentAreaFilled(false); _1번줄5파랑버튼.setFocusPainted(false); _1번줄5파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _1번줄5파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(1,5);}}});
	 getContentPane().add(_1번줄5파랑버튼);  
	 _1번줄6파랑버튼.setBounds(X좌표[1], Y좌표[1][6], 120, 60); _1번줄6파랑버튼.setVisible(false); _1번줄6파랑버튼.setBorderPainted(false); _1번줄6파랑버튼.setContentAreaFilled(false); _1번줄6파랑버튼.setFocusPainted(false); _1번줄6파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _1번줄6파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(1,6);}}});
	 getContentPane().add(_1번줄6파랑버튼);  
	 _1번줄7파랑버튼.setBounds(X좌표[1], Y좌표[1][7], 120, 60); _1번줄7파랑버튼.setVisible(false); _1번줄7파랑버튼.setBorderPainted(false); _1번줄7파랑버튼.setContentAreaFilled(false); _1번줄7파랑버튼.setFocusPainted(false); _1번줄7파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _1번줄7파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(1,7);}}});
	 getContentPane().add(_1번줄7파랑버튼);  
	 _1번줄8파랑버튼.setBounds(X좌표[1], Y좌표[1][8], 120, 60); _1번줄8파랑버튼.setVisible(false); _1번줄8파랑버튼.setBorderPainted(false); _1번줄8파랑버튼.setContentAreaFilled(false); _1번줄8파랑버튼.setFocusPainted(false); _1번줄8파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _1번줄8파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(1,8);}}});
	 getContentPane().add(_1번줄8파랑버튼);
	 _2번줄0파랑버튼.setBounds(X좌표[2], Y좌표[2][0], 120, 60); _2번줄0파랑버튼.setVisible(false); _2번줄0파랑버튼.setBorderPainted(false); _2번줄0파랑버튼.setContentAreaFilled(false); _2번줄0파랑버튼.setFocusPainted(false); _2번줄0파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _2번줄0파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(2,0);}}});
	 getContentPane().add(_2번줄0파랑버튼);  
	 _2번줄1파랑버튼.setBounds(X좌표[2], Y좌표[2][1], 120, 60); _2번줄1파랑버튼.setVisible(false); _2번줄1파랑버튼.setBorderPainted(false); _2번줄1파랑버튼.setContentAreaFilled(false); _2번줄1파랑버튼.setFocusPainted(false); _2번줄1파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _2번줄1파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(2,1);}}});
	 getContentPane().add(_2번줄1파랑버튼);  
	 _2번줄2파랑버튼.setBounds(X좌표[2], Y좌표[2][2], 120, 60); _2번줄2파랑버튼.setVisible(false); _2번줄2파랑버튼.setBorderPainted(false); _2번줄2파랑버튼.setContentAreaFilled(false); _2번줄2파랑버튼.setFocusPainted(false); _2번줄2파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _2번줄2파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(2,2);}}});
	 getContentPane().add(_2번줄2파랑버튼);  
	 _2번줄3파랑버튼.setBounds(X좌표[2], Y좌표[2][3], 120, 60); _2번줄3파랑버튼.setVisible(false); _2번줄3파랑버튼.setBorderPainted(false); _2번줄3파랑버튼.setContentAreaFilled(false); _2번줄3파랑버튼.setFocusPainted(false); _2번줄3파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _2번줄3파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(2,3);}}});
	 getContentPane().add(_2번줄3파랑버튼);  
	 _2번줄4파랑버튼.setBounds(X좌표[2], Y좌표[2][4], 120, 60); _2번줄4파랑버튼.setVisible(false); _2번줄4파랑버튼.setBorderPainted(false); _2번줄4파랑버튼.setContentAreaFilled(false); _2번줄4파랑버튼.setFocusPainted(false); _2번줄4파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _2번줄4파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(2,4);}}});
	 getContentPane().add(_2번줄4파랑버튼);  
	 _2번줄5파랑버튼.setBounds(X좌표[2], Y좌표[2][5], 120, 60); _2번줄5파랑버튼.setVisible(false); _2번줄5파랑버튼.setBorderPainted(false); _2번줄5파랑버튼.setContentAreaFilled(false); _2번줄5파랑버튼.setFocusPainted(false); _2번줄5파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _2번줄5파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(2,5);}}});
	 getContentPane().add(_2번줄5파랑버튼);  
	 _2번줄6파랑버튼.setBounds(X좌표[2], Y좌표[2][6], 120, 60); _2번줄6파랑버튼.setVisible(false); _2번줄6파랑버튼.setBorderPainted(false); _2번줄6파랑버튼.setContentAreaFilled(false); _2번줄6파랑버튼.setFocusPainted(false); _2번줄6파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _2번줄6파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(2,6);}}});
	 getContentPane().add(_2번줄6파랑버튼);  
	 _2번줄7파랑버튼.setBounds(X좌표[2], Y좌표[2][7], 120, 60); _2번줄7파랑버튼.setVisible(false); _2번줄7파랑버튼.setBorderPainted(false); _2번줄7파랑버튼.setContentAreaFilled(false); _2번줄7파랑버튼.setFocusPainted(false); _2번줄7파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _2번줄7파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(2,7);}}});
	 getContentPane().add(_2번줄7파랑버튼);  
	 _2번줄8파랑버튼.setBounds(X좌표[2], Y좌표[2][8], 120, 60); _2번줄8파랑버튼.setVisible(false); _2번줄8파랑버튼.setBorderPainted(false); _2번줄8파랑버튼.setContentAreaFilled(false); _2번줄8파랑버튼.setFocusPainted(false); _2번줄8파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _2번줄8파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(2,8);}}});
	 getContentPane().add(_2번줄8파랑버튼);
	 _3번줄0파랑버튼.setBounds(X좌표[3], Y좌표[3][0], 120, 60); _3번줄0파랑버튼.setVisible(false); _3번줄0파랑버튼.setBorderPainted(false); _3번줄0파랑버튼.setContentAreaFilled(false); _3번줄0파랑버튼.setFocusPainted(false); _3번줄0파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _3번줄0파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(3,0);}}});
	 getContentPane().add(_3번줄0파랑버튼);  
	 _3번줄1파랑버튼.setBounds(X좌표[3], Y좌표[3][1], 120, 60); _3번줄1파랑버튼.setVisible(false); _3번줄1파랑버튼.setBorderPainted(false); _3번줄1파랑버튼.setContentAreaFilled(false); _3번줄1파랑버튼.setFocusPainted(false); _3번줄1파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _3번줄1파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(3,1);}}});
	 getContentPane().add(_3번줄1파랑버튼);  
	 _3번줄2파랑버튼.setBounds(X좌표[3], Y좌표[3][2], 120, 60); _3번줄2파랑버튼.setVisible(false); _3번줄2파랑버튼.setBorderPainted(false); _3번줄2파랑버튼.setContentAreaFilled(false); _3번줄2파랑버튼.setFocusPainted(false); _3번줄2파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _3번줄2파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(3,2);}}});
	 getContentPane().add(_3번줄2파랑버튼);  
	 _3번줄3파랑버튼.setBounds(X좌표[3], Y좌표[3][3], 120, 60); _3번줄3파랑버튼.setVisible(false); _3번줄3파랑버튼.setBorderPainted(false); _3번줄3파랑버튼.setContentAreaFilled(false); _3번줄3파랑버튼.setFocusPainted(false); _3번줄3파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _3번줄3파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(3,3);}}});
	 getContentPane().add(_3번줄3파랑버튼);  
	 _3번줄4파랑버튼.setBounds(X좌표[3], Y좌표[3][4], 120, 60); _3번줄4파랑버튼.setVisible(false); _3번줄4파랑버튼.setBorderPainted(false); _3번줄4파랑버튼.setContentAreaFilled(false); _3번줄4파랑버튼.setFocusPainted(false); _3번줄4파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _3번줄4파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(3,4);}}});
	 getContentPane().add(_3번줄4파랑버튼);  
	 _3번줄5파랑버튼.setBounds(X좌표[3], Y좌표[3][5], 120, 60); _3번줄5파랑버튼.setVisible(false); _3번줄5파랑버튼.setBorderPainted(false); _3번줄5파랑버튼.setContentAreaFilled(false); _3번줄5파랑버튼.setFocusPainted(false); _3번줄5파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _3번줄5파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(3,5);}}});
	 getContentPane().add(_3번줄5파랑버튼);  
	 _3번줄6파랑버튼.setBounds(X좌표[3], Y좌표[3][6], 120, 60); _3번줄6파랑버튼.setVisible(false); _3번줄6파랑버튼.setBorderPainted(false); _3번줄6파랑버튼.setContentAreaFilled(false); _3번줄6파랑버튼.setFocusPainted(false); _3번줄6파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _3번줄6파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(3,6);}}});
	 getContentPane().add(_3번줄6파랑버튼);  
	 _3번줄7파랑버튼.setBounds(X좌표[3], Y좌표[3][7], 120, 60); _3번줄7파랑버튼.setVisible(false); _3번줄7파랑버튼.setBorderPainted(false); _3번줄7파랑버튼.setContentAreaFilled(false); _3번줄7파랑버튼.setFocusPainted(false); _3번줄7파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _3번줄7파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(3,7);}}});
	 getContentPane().add(_3번줄7파랑버튼);  
	 _3번줄8파랑버튼.setBounds(X좌표[3], Y좌표[3][8], 120, 60); _3번줄8파랑버튼.setVisible(false); _3번줄8파랑버튼.setBorderPainted(false); _3번줄8파랑버튼.setContentAreaFilled(false); _3번줄8파랑버튼.setFocusPainted(false); _3번줄8파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _3번줄8파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(3,8);}}});
	 getContentPane().add(_3번줄8파랑버튼);
	 _4번줄0파랑버튼.setBounds(X좌표[4], Y좌표[4][0], 120, 64); _4번줄0파랑버튼.setVisible(false); _4번줄0파랑버튼.setBorderPainted(false); _4번줄0파랑버튼.setContentAreaFilled(false); _4번줄0파랑버튼.setFocusPainted(false); _4번줄0파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _4번줄0파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(4,0);}}});
	 getContentPane().add(_4번줄0파랑버튼);  
	 _4번줄1파랑버튼.setBounds(X좌표[4], Y좌표[4][1], 120, 64); _4번줄1파랑버튼.setVisible(false); _4번줄1파랑버튼.setBorderPainted(false); _4번줄1파랑버튼.setContentAreaFilled(false); _4번줄1파랑버튼.setFocusPainted(false); _4번줄1파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _4번줄1파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(4,1);}}});
	 getContentPane().add(_4번줄1파랑버튼);  
	 _4번줄2파랑버튼.setBounds(X좌표[4], Y좌표[4][2], 120, 64); _4번줄2파랑버튼.setVisible(false); _4번줄2파랑버튼.setBorderPainted(false); _4번줄2파랑버튼.setContentAreaFilled(false); _4번줄2파랑버튼.setFocusPainted(false); _4번줄2파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _4번줄2파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(4,2);}}});
	 getContentPane().add(_4번줄2파랑버튼);  
	 _4번줄3파랑버튼.setBounds(X좌표[4], Y좌표[4][3], 120, 64); _4번줄3파랑버튼.setVisible(false); _4번줄3파랑버튼.setBorderPainted(false); _4번줄3파랑버튼.setContentAreaFilled(false); _4번줄3파랑버튼.setFocusPainted(false); _4번줄3파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _4번줄3파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(4,3);}}});
	 getContentPane().add(_4번줄3파랑버튼);  
	 _4번줄4파랑버튼.setBounds(X좌표[4], Y좌표[4][4], 120, 64); _4번줄4파랑버튼.setVisible(false); _4번줄4파랑버튼.setBorderPainted(false); _4번줄4파랑버튼.setContentAreaFilled(false); _4번줄4파랑버튼.setFocusPainted(false); _4번줄4파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _4번줄4파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(4,4);}}});
	 getContentPane().add(_4번줄4파랑버튼);  
	 _4번줄5파랑버튼.setBounds(X좌표[4], Y좌표[4][5], 120, 64); _4번줄5파랑버튼.setVisible(false); _4번줄5파랑버튼.setBorderPainted(false); _4번줄5파랑버튼.setContentAreaFilled(false); _4번줄5파랑버튼.setFocusPainted(false); _4번줄5파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _4번줄5파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(4,5);}}});
	 getContentPane().add(_4번줄5파랑버튼);  
	 _4번줄6파랑버튼.setBounds(X좌표[4], Y좌표[4][6], 120, 64); _4번줄6파랑버튼.setVisible(false); _4번줄6파랑버튼.setBorderPainted(false); _4번줄6파랑버튼.setContentAreaFilled(false); _4번줄6파랑버튼.setFocusPainted(false); _4번줄6파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _4번줄6파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(4,6);}}});
	 getContentPane().add(_4번줄6파랑버튼);  
	 _4번줄7파랑버튼.setBounds(X좌표[4], Y좌표[4][7], 120, 64); _4번줄7파랑버튼.setVisible(false); _4번줄7파랑버튼.setBorderPainted(false); _4번줄7파랑버튼.setContentAreaFilled(false); _4번줄7파랑버튼.setFocusPainted(false); _4번줄7파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _4번줄7파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(4,7);}}});
	 getContentPane().add(_4번줄7파랑버튼);  
	 _4번줄8파랑버튼.setBounds(X좌표[4], Y좌표[4][8], 120, 64); _4번줄8파랑버튼.setVisible(false); _4번줄8파랑버튼.setBorderPainted(false); _4번줄8파랑버튼.setContentAreaFilled(false); _4번줄8파랑버튼.setFocusPainted(false); _4번줄8파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _4번줄8파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(4,8);}}});
	 getContentPane().add(_4번줄8파랑버튼);
	 _5번줄0파랑버튼.setBounds(X좌표[5], Y좌표[5][0], 120, 60); _5번줄0파랑버튼.setVisible(false); _5번줄0파랑버튼.setBorderPainted(false); _5번줄0파랑버튼.setContentAreaFilled(false); _5번줄0파랑버튼.setFocusPainted(false); _5번줄0파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _5번줄0파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(5,0);}}});
	 getContentPane().add(_5번줄0파랑버튼);  
	 _5번줄1파랑버튼.setBounds(X좌표[5], Y좌표[5][1], 120, 60); _5번줄1파랑버튼.setVisible(false); _5번줄1파랑버튼.setBorderPainted(false); _5번줄1파랑버튼.setContentAreaFilled(false); _5번줄1파랑버튼.setFocusPainted(false); _5번줄1파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _5번줄1파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(5,1);}}});
	 getContentPane().add(_5번줄1파랑버튼);  
	 _5번줄2파랑버튼.setBounds(X좌표[5], Y좌표[5][2], 120, 60); _5번줄2파랑버튼.setVisible(false); _5번줄2파랑버튼.setBorderPainted(false); _5번줄2파랑버튼.setContentAreaFilled(false); _5번줄2파랑버튼.setFocusPainted(false); _5번줄2파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _5번줄2파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(5,2);}}});
	 getContentPane().add(_5번줄2파랑버튼);  
	 _5번줄3파랑버튼.setBounds(X좌표[5], Y좌표[5][3], 120, 60); _5번줄3파랑버튼.setVisible(false); _5번줄3파랑버튼.setBorderPainted(false); _5번줄3파랑버튼.setContentAreaFilled(false); _5번줄3파랑버튼.setFocusPainted(false); _5번줄3파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _5번줄3파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(5,3);}}});
	 getContentPane().add(_5번줄3파랑버튼);  
	 _5번줄4파랑버튼.setBounds(X좌표[5], Y좌표[5][4], 120, 60); _5번줄4파랑버튼.setVisible(false); _5번줄4파랑버튼.setBorderPainted(false); _5번줄4파랑버튼.setContentAreaFilled(false); _5번줄4파랑버튼.setFocusPainted(false); _5번줄4파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _5번줄4파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(5,4);}}});
	 getContentPane().add(_5번줄4파랑버튼);  
	 _5번줄5파랑버튼.setBounds(X좌표[5], Y좌표[5][5], 120, 60); _5번줄5파랑버튼.setVisible(false); _5번줄5파랑버튼.setBorderPainted(false); _5번줄5파랑버튼.setContentAreaFilled(false); _5번줄5파랑버튼.setFocusPainted(false); _5번줄5파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _5번줄5파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(5,5);}}});
	 getContentPane().add(_5번줄5파랑버튼);  
	 _5번줄6파랑버튼.setBounds(X좌표[5], Y좌표[5][6], 120, 60); _5번줄6파랑버튼.setVisible(false); _5번줄6파랑버튼.setBorderPainted(false); _5번줄6파랑버튼.setContentAreaFilled(false); _5번줄6파랑버튼.setFocusPainted(false); _5번줄6파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _5번줄6파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(5,6);}}});
	 getContentPane().add(_5번줄6파랑버튼);  
	 _5번줄7파랑버튼.setBounds(X좌표[5], Y좌표[5][7], 120, 60); _5번줄7파랑버튼.setVisible(false); _5번줄7파랑버튼.setBorderPainted(false); _5번줄7파랑버튼.setContentAreaFilled(false); _5번줄7파랑버튼.setFocusPainted(false); _5번줄7파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _5번줄7파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(5,7);}}});
	 getContentPane().add(_5번줄7파랑버튼);  
	 _5번줄8파랑버튼.setBounds(X좌표[5], Y좌표[5][8], 120, 60); _5번줄8파랑버튼.setVisible(false); _5번줄8파랑버튼.setBorderPainted(false); _5번줄8파랑버튼.setContentAreaFilled(false); _5번줄8파랑버튼.setFocusPainted(false); _5번줄8파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _5번줄8파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(5,8);}}});
	 getContentPane().add(_5번줄8파랑버튼);
	 _6번줄0파랑버튼.setBounds(X좌표[6], Y좌표[6][0], 120, 60); _6번줄0파랑버튼.setVisible(false); _6번줄0파랑버튼.setBorderPainted(false); _6번줄0파랑버튼.setContentAreaFilled(false); _6번줄0파랑버튼.setFocusPainted(false); _6번줄0파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _6번줄0파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(6,0);}}});
	 getContentPane().add(_6번줄0파랑버튼);  
	 _6번줄1파랑버튼.setBounds(X좌표[6], Y좌표[6][1], 120, 60); _6번줄1파랑버튼.setVisible(false); _6번줄1파랑버튼.setBorderPainted(false); _6번줄1파랑버튼.setContentAreaFilled(false); _6번줄1파랑버튼.setFocusPainted(false); _6번줄1파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _6번줄1파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(6,1);}}});
	 getContentPane().add(_6번줄1파랑버튼);  
	 _6번줄2파랑버튼.setBounds(X좌표[6], Y좌표[6][2], 120, 60); _6번줄2파랑버튼.setVisible(false); _6번줄2파랑버튼.setBorderPainted(false); _6번줄2파랑버튼.setContentAreaFilled(false); _6번줄2파랑버튼.setFocusPainted(false); _6번줄2파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _6번줄2파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(6,2);}}});
	 getContentPane().add(_6번줄2파랑버튼);
	 _6번줄3파랑버튼.setBounds(X좌표[6], Y좌표[6][3], 120, 60); _6번줄3파랑버튼.setVisible(false); _6번줄3파랑버튼.setBorderPainted(false); _6번줄3파랑버튼.setContentAreaFilled(false); _6번줄3파랑버튼.setFocusPainted(false); _6번줄3파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _6번줄3파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(6,3);}}});
	 getContentPane().add(_6번줄3파랑버튼);  
	 _6번줄4파랑버튼.setBounds(X좌표[6], Y좌표[6][4], 120, 60); _6번줄4파랑버튼.setVisible(false); _6번줄4파랑버튼.setBorderPainted(false); _6번줄4파랑버튼.setContentAreaFilled(false); _6번줄4파랑버튼.setFocusPainted(false); _6번줄4파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _6번줄4파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(6,4);}}});
	 getContentPane().add(_6번줄4파랑버튼);  
	 _6번줄5파랑버튼.setBounds(X좌표[6], Y좌표[6][5], 120, 60); _6번줄5파랑버튼.setVisible(false); _6번줄5파랑버튼.setBorderPainted(false); _6번줄5파랑버튼.setContentAreaFilled(false); _6번줄5파랑버튼.setFocusPainted(false); _6번줄5파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _6번줄5파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(6,5);}}});
	 getContentPane().add(_6번줄5파랑버튼); 
	 _6번줄6파랑버튼.setBounds(X좌표[6], Y좌표[6][6], 120, 60); _6번줄6파랑버튼.setVisible(false); _6번줄6파랑버튼.setBorderPainted(false); _6번줄6파랑버튼.setContentAreaFilled(false); _6번줄6파랑버튼.setFocusPainted(false); _6번줄6파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _6번줄6파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(6,6);}}});
	 getContentPane().add(_6번줄6파랑버튼);  
	 _6번줄7파랑버튼.setBounds(X좌표[6], Y좌표[6][7], 120, 60); _6번줄7파랑버튼.setVisible(false); _6번줄7파랑버튼.setBorderPainted(false); _6번줄7파랑버튼.setContentAreaFilled(false); _6번줄7파랑버튼.setFocusPainted(false); _6번줄7파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _6번줄7파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(6,7);}}});
	 getContentPane().add(_6번줄7파랑버튼);  
	 _6번줄8파랑버튼.setBounds(X좌표[6], Y좌표[6][8], 120, 60); _6번줄8파랑버튼.setVisible(false); _6번줄8파랑버튼.setBorderPainted(false); _6번줄8파랑버튼.setContentAreaFilled(false); _6번줄8파랑버튼.setFocusPainted(false); _6번줄8파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _6번줄8파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(6,8);}}});
	 getContentPane().add(_6번줄8파랑버튼);
	 _7번줄0파랑버튼.setBounds(X좌표[7], Y좌표[7][0], 120, 60); _7번줄0파랑버튼.setVisible(false); _7번줄0파랑버튼.setBorderPainted(false); _7번줄0파랑버튼.setContentAreaFilled(false); _7번줄0파랑버튼.setFocusPainted(false); _7번줄0파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _7번줄0파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(7,0);}}});
	 getContentPane().add(_7번줄0파랑버튼);  
	 _7번줄1파랑버튼.setBounds(X좌표[7], Y좌표[7][1], 120, 60); _7번줄1파랑버튼.setVisible(false); _7번줄1파랑버튼.setBorderPainted(false); _7번줄1파랑버튼.setContentAreaFilled(false); _7번줄1파랑버튼.setFocusPainted(false); _7번줄1파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _7번줄1파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(7,1);}}});
	 getContentPane().add(_7번줄1파랑버튼);  
	 _7번줄2파랑버튼.setBounds(X좌표[7], Y좌표[7][2], 120, 60); _7번줄2파랑버튼.setVisible(false); _7번줄2파랑버튼.setBorderPainted(false); _7번줄2파랑버튼.setContentAreaFilled(false); _7번줄2파랑버튼.setFocusPainted(false); _7번줄2파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _7번줄2파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(7,2);}}});
	 getContentPane().add(_7번줄2파랑버튼);  
	 _7번줄3파랑버튼.setBounds(X좌표[7], Y좌표[7][3], 120, 60); _7번줄3파랑버튼.setVisible(false); _7번줄3파랑버튼.setBorderPainted(false); _7번줄3파랑버튼.setContentAreaFilled(false); _7번줄3파랑버튼.setFocusPainted(false); _7번줄3파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _7번줄3파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(7,3);}}});
	 getContentPane().add(_7번줄3파랑버튼);  
	 _7번줄4파랑버튼.setBounds(X좌표[7], Y좌표[7][4], 120, 60); _7번줄4파랑버튼.setVisible(false); _7번줄4파랑버튼.setBorderPainted(false); _7번줄4파랑버튼.setContentAreaFilled(false); _7번줄4파랑버튼.setFocusPainted(false); _7번줄4파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _7번줄4파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(7,4);}}});
	 getContentPane().add(_7번줄4파랑버튼);  
	 _7번줄5파랑버튼.setBounds(X좌표[7], Y좌표[7][5], 120, 60); _7번줄5파랑버튼.setVisible(false); _7번줄5파랑버튼.setBorderPainted(false); _7번줄5파랑버튼.setContentAreaFilled(false); _7번줄5파랑버튼.setFocusPainted(false); _7번줄5파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _7번줄5파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(7,5);}}});
	 getContentPane().add(_7번줄5파랑버튼);  
	 _7번줄6파랑버튼.setBounds(X좌표[7], Y좌표[7][6], 120, 60); _7번줄6파랑버튼.setVisible(false); _7번줄6파랑버튼.setBorderPainted(false); _7번줄6파랑버튼.setContentAreaFilled(false); _7번줄6파랑버튼.setFocusPainted(false); _7번줄6파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _7번줄6파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(7,6);}}});
	 getContentPane().add(_7번줄6파랑버튼);  
	 _7번줄7파랑버튼.setBounds(X좌표[7], Y좌표[7][7], 120, 60); _7번줄7파랑버튼.setVisible(false); _7번줄7파랑버튼.setBorderPainted(false); _7번줄7파랑버튼.setContentAreaFilled(false); _7번줄7파랑버튼.setFocusPainted(false); _7번줄7파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _7번줄7파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(7,7);}}});
	 getContentPane().add(_7번줄7파랑버튼); 
	 _7번줄8파랑버튼.setBounds(X좌표[7], Y좌표[7][8], 120, 60); _7번줄8파랑버튼.setVisible(false); _7번줄8파랑버튼.setBorderPainted(false); _7번줄8파랑버튼.setContentAreaFilled(false); _7번줄8파랑버튼.setFocusPainted(false); _7번줄8파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _7번줄8파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(7,8);}}});
	 getContentPane().add(_7번줄8파랑버튼);
	 _8번줄0파랑버튼.setBounds(X좌표[8], Y좌표[8][0], 120, 60); _8번줄0파랑버튼.setVisible(false); _8번줄0파랑버튼.setBorderPainted(false); _8번줄0파랑버튼.setContentAreaFilled(false); _8번줄0파랑버튼.setFocusPainted(false); _8번줄0파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _8번줄0파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(8,0);}}});
	 getContentPane().add(_8번줄0파랑버튼);  
	 _8번줄1파랑버튼.setBounds(X좌표[8], Y좌표[8][1], 120, 60); _8번줄1파랑버튼.setVisible(false); _8번줄1파랑버튼.setBorderPainted(false); _8번줄1파랑버튼.setContentAreaFilled(false); _8번줄1파랑버튼.setFocusPainted(false); _8번줄1파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _8번줄1파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(8,1);}}});
	 getContentPane().add(_8번줄1파랑버튼);  
	 _8번줄2파랑버튼.setBounds(X좌표[8], Y좌표[8][2], 120, 60); _8번줄2파랑버튼.setVisible(false); _8번줄2파랑버튼.setBorderPainted(false); _8번줄2파랑버튼.setContentAreaFilled(false); _8번줄2파랑버튼.setFocusPainted(false); _8번줄2파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _8번줄2파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(8,2);}}});
	 getContentPane().add(_8번줄2파랑버튼);  
	 _8번줄3파랑버튼.setBounds(X좌표[8], Y좌표[8][3], 120, 60); _8번줄3파랑버튼.setVisible(false); _8번줄3파랑버튼.setBorderPainted(false); _8번줄3파랑버튼.setContentAreaFilled(false); _8번줄3파랑버튼.setFocusPainted(false); _8번줄3파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _8번줄3파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(8,3);}}});
	 getContentPane().add(_8번줄3파랑버튼);  
	 _8번줄4파랑버튼.setBounds(X좌표[8], Y좌표[8][4], 120, 60); _8번줄4파랑버튼.setVisible(false); _8번줄4파랑버튼.setBorderPainted(false); _8번줄4파랑버튼.setContentAreaFilled(false); _8번줄4파랑버튼.setFocusPainted(false); _8번줄4파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _8번줄4파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(8,4);}}});
	 getContentPane().add(_8번줄4파랑버튼);  
	 _8번줄5파랑버튼.setBounds(X좌표[8], Y좌표[8][5], 120, 60); _8번줄5파랑버튼.setVisible(false); _8번줄5파랑버튼.setBorderPainted(false); _8번줄5파랑버튼.setContentAreaFilled(false); _8번줄5파랑버튼.setFocusPainted(false); _8번줄5파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _8번줄5파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(8,5);}}});
	 getContentPane().add(_8번줄5파랑버튼);  
	 _8번줄6파랑버튼.setBounds(X좌표[8], Y좌표[8][6], 120, 60); _8번줄6파랑버튼.setVisible(false); _8번줄6파랑버튼.setBorderPainted(false); _8번줄6파랑버튼.setContentAreaFilled(false); _8번줄6파랑버튼.setFocusPainted(false); _8번줄6파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _8번줄6파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(8,6);}}});
	 getContentPane().add(_8번줄6파랑버튼);  
	 _8번줄7파랑버튼.setBounds(X좌표[8], Y좌표[8][7], 120, 60); _8번줄7파랑버튼.setVisible(false); _8번줄7파랑버튼.setBorderPainted(false); _8번줄7파랑버튼.setContentAreaFilled(false); _8번줄7파랑버튼.setFocusPainted(false); _8번줄7파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _8번줄7파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(8,7);}}});
	 getContentPane().add(_8번줄7파랑버튼);  
	 _8번줄8파랑버튼.setBounds(X좌표[8], Y좌표[8][8], 120, 60); _8번줄8파랑버튼.setVisible(false); _8번줄8파랑버튼.setBorderPainted(false); _8번줄8파랑버튼.setContentAreaFilled(false); _8번줄8파랑버튼.setFocusPainted(false); _8번줄8파랑버튼.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _8번줄8파랑버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(현재차례!=1){ 클릭(8,8);}}});
	 getContentPane().add(_8번줄8파랑버튼);	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	 _0번줄0약간연한파랑버튼.setBounds(X좌표[0], Y좌표[0][0], 120, 60); _0번줄0약간연한파랑버튼.setVisible(false); _0번줄0약간연한파랑버튼.setBorderPainted(false); _0번줄0약간연한파랑버튼.setContentAreaFilled(false); _0번줄0약간연한파랑버튼.setFocusPainted(false); _0번줄0약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(0,0); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_0번줄0약간연한파랑버튼);
	 _0번줄1약간연한파랑버튼.setBounds(X좌표[0], Y좌표[0][1], 120, 60); _0번줄1약간연한파랑버튼.setVisible(false); _0번줄1약간연한파랑버튼.setBorderPainted(false); _0번줄1약간연한파랑버튼.setContentAreaFilled(false); _0번줄1약간연한파랑버튼.setFocusPainted(false); _0번줄1약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(0,1); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_0번줄1약간연한파랑버튼);
	 _0번줄2약간연한파랑버튼.setBounds(X좌표[0], Y좌표[0][2], 120, 60); _0번줄2약간연한파랑버튼.setVisible(false); _0번줄2약간연한파랑버튼.setBorderPainted(false); _0번줄2약간연한파랑버튼.setContentAreaFilled(false); _0번줄2약간연한파랑버튼.setFocusPainted(false); _0번줄2약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(0,2); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_0번줄2약간연한파랑버튼);
	 _0번줄3약간연한파랑버튼.setBounds(X좌표[0], Y좌표[0][3], 120, 60); _0번줄3약간연한파랑버튼.setVisible(false); _0번줄3약간연한파랑버튼.setBorderPainted(false); _0번줄3약간연한파랑버튼.setContentAreaFilled(false); _0번줄3약간연한파랑버튼.setFocusPainted(false); _0번줄3약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(0,3); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_0번줄3약간연한파랑버튼);
	 _0번줄4약간연한파랑버튼.setBounds(X좌표[0], Y좌표[0][4], 120, 60); _0번줄4약간연한파랑버튼.setVisible(false); _0번줄4약간연한파랑버튼.setBorderPainted(false); _0번줄4약간연한파랑버튼.setContentAreaFilled(false); _0번줄4약간연한파랑버튼.setFocusPainted(false); _0번줄4약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(0,4); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_0번줄4약간연한파랑버튼);
	 _0번줄5약간연한파랑버튼.setBounds(X좌표[0], Y좌표[0][5], 120, 60); _0번줄5약간연한파랑버튼.setVisible(false); _0번줄5약간연한파랑버튼.setBorderPainted(false); _0번줄5약간연한파랑버튼.setContentAreaFilled(false); _0번줄5약간연한파랑버튼.setFocusPainted(false); _0번줄5약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(0,5); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_0번줄5약간연한파랑버튼);
	 _0번줄6약간연한파랑버튼.setBounds(X좌표[0], Y좌표[0][6], 120, 60); _0번줄6약간연한파랑버튼.setVisible(false); _0번줄6약간연한파랑버튼.setBorderPainted(false); _0번줄6약간연한파랑버튼.setContentAreaFilled(false); _0번줄6약간연한파랑버튼.setFocusPainted(false); _0번줄6약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(0,6); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_0번줄6약간연한파랑버튼);
	 _0번줄7약간연한파랑버튼.setBounds(X좌표[0], Y좌표[0][7], 120, 60); _0번줄7약간연한파랑버튼.setVisible(false); _0번줄7약간연한파랑버튼.setBorderPainted(false); _0번줄7약간연한파랑버튼.setContentAreaFilled(false); _0번줄7약간연한파랑버튼.setFocusPainted(false); _0번줄7약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(0,7); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_0번줄7약간연한파랑버튼);
	 _0번줄8약간연한파랑버튼.setBounds(X좌표[0], Y좌표[0][8], 120, 60); _0번줄8약간연한파랑버튼.setVisible(false); _0번줄8약간연한파랑버튼.setBorderPainted(false); _0번줄8약간연한파랑버튼.setContentAreaFilled(false); _0번줄8약간연한파랑버튼.setFocusPainted(false); _0번줄8약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(0,8); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_0번줄8약간연한파랑버튼);
	 _1번줄0약간연한파랑버튼.setBounds(X좌표[1], Y좌표[1][0], 120, 60); _1번줄0약간연한파랑버튼.setVisible(false); _1번줄0약간연한파랑버튼.setBorderPainted(false); _1번줄0약간연한파랑버튼.setContentAreaFilled(false); _1번줄0약간연한파랑버튼.setFocusPainted(false); _1번줄0약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(1,0); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_1번줄0약간연한파랑버튼); 
	 _1번줄1약간연한파랑버튼.setBounds(X좌표[1], Y좌표[1][1], 120, 60); _1번줄1약간연한파랑버튼.setVisible(false); _1번줄1약간연한파랑버튼.setBorderPainted(false); _1번줄1약간연한파랑버튼.setContentAreaFilled(false); _1번줄1약간연한파랑버튼.setFocusPainted(false); _1번줄1약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(1,1); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_1번줄1약간연한파랑버튼); 
	 _1번줄2약간연한파랑버튼.setBounds(X좌표[1], Y좌표[1][2], 120, 60); _1번줄2약간연한파랑버튼.setVisible(false); _1번줄2약간연한파랑버튼.setBorderPainted(false); _1번줄2약간연한파랑버튼.setContentAreaFilled(false); _1번줄2약간연한파랑버튼.setFocusPainted(false); _1번줄2약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(1,2); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_1번줄2약간연한파랑버튼); 
	 _1번줄3약간연한파랑버튼.setBounds(X좌표[1], Y좌표[1][3], 120, 60); _1번줄3약간연한파랑버튼.setVisible(false); _1번줄3약간연한파랑버튼.setBorderPainted(false); _1번줄3약간연한파랑버튼.setContentAreaFilled(false); _1번줄3약간연한파랑버튼.setFocusPainted(false); _1번줄3약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(1,3); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_1번줄3약간연한파랑버튼); 
	 _1번줄4약간연한파랑버튼.setBounds(X좌표[1], Y좌표[1][4], 120, 60); _1번줄4약간연한파랑버튼.setVisible(false); _1번줄4약간연한파랑버튼.setBorderPainted(false); _1번줄4약간연한파랑버튼.setContentAreaFilled(false); _1번줄4약간연한파랑버튼.setFocusPainted(false); _1번줄4약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(1,4); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_1번줄4약간연한파랑버튼); 
	 _1번줄5약간연한파랑버튼.setBounds(X좌표[1], Y좌표[1][5], 120, 60); _1번줄5약간연한파랑버튼.setVisible(false); _1번줄5약간연한파랑버튼.setBorderPainted(false); _1번줄5약간연한파랑버튼.setContentAreaFilled(false); _1번줄5약간연한파랑버튼.setFocusPainted(false); _1번줄5약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(1,5); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_1번줄5약간연한파랑버튼); 
	 _1번줄6약간연한파랑버튼.setBounds(X좌표[1], Y좌표[1][6], 120, 60); _1번줄6약간연한파랑버튼.setVisible(false); _1번줄6약간연한파랑버튼.setBorderPainted(false); _1번줄6약간연한파랑버튼.setContentAreaFilled(false); _1번줄6약간연한파랑버튼.setFocusPainted(false); _1번줄6약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(1,6); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_1번줄6약간연한파랑버튼); 
	 _1번줄7약간연한파랑버튼.setBounds(X좌표[1], Y좌표[1][7], 120, 60); _1번줄7약간연한파랑버튼.setVisible(false); _1번줄7약간연한파랑버튼.setBorderPainted(false); _1번줄7약간연한파랑버튼.setContentAreaFilled(false); _1번줄7약간연한파랑버튼.setFocusPainted(false); _1번줄7약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(1,7); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_1번줄7약간연한파랑버튼); 
	 _1번줄8약간연한파랑버튼.setBounds(X좌표[1], Y좌표[1][8], 120, 60); _1번줄8약간연한파랑버튼.setVisible(false); _1번줄8약간연한파랑버튼.setBorderPainted(false); _1번줄8약간연한파랑버튼.setContentAreaFilled(false); _1번줄8약간연한파랑버튼.setFocusPainted(false); _1번줄8약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(1,8); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_1번줄8약간연한파랑버튼);
	 _2번줄0약간연한파랑버튼.setBounds(X좌표[2], Y좌표[2][0], 120, 60); _2번줄0약간연한파랑버튼.setVisible(false); _2번줄0약간연한파랑버튼.setBorderPainted(false); _2번줄0약간연한파랑버튼.setContentAreaFilled(false); _2번줄0약간연한파랑버튼.setFocusPainted(false); _2번줄0약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(2,0); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_2번줄0약간연한파랑버튼); 
	 _2번줄1약간연한파랑버튼.setBounds(X좌표[2], Y좌표[2][1], 120, 60); _2번줄1약간연한파랑버튼.setVisible(false); _2번줄1약간연한파랑버튼.setBorderPainted(false); _2번줄1약간연한파랑버튼.setContentAreaFilled(false); _2번줄1약간연한파랑버튼.setFocusPainted(false); _2번줄1약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(2,1); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_2번줄1약간연한파랑버튼); 
	 _2번줄2약간연한파랑버튼.setBounds(X좌표[2], Y좌표[2][2], 120, 60); _2번줄2약간연한파랑버튼.setVisible(false); _2번줄2약간연한파랑버튼.setBorderPainted(false); _2번줄2약간연한파랑버튼.setContentAreaFilled(false); _2번줄2약간연한파랑버튼.setFocusPainted(false); _2번줄2약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(2,2); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_2번줄2약간연한파랑버튼); 
	 _2번줄3약간연한파랑버튼.setBounds(X좌표[2], Y좌표[2][3], 120, 60); _2번줄3약간연한파랑버튼.setVisible(false); _2번줄3약간연한파랑버튼.setBorderPainted(false); _2번줄3약간연한파랑버튼.setContentAreaFilled(false); _2번줄3약간연한파랑버튼.setFocusPainted(false); _2번줄3약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(2,3); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_2번줄3약간연한파랑버튼); 
	 _2번줄4약간연한파랑버튼.setBounds(X좌표[2], Y좌표[2][4], 120, 60); _2번줄4약간연한파랑버튼.setVisible(false); _2번줄4약간연한파랑버튼.setBorderPainted(false); _2번줄4약간연한파랑버튼.setContentAreaFilled(false); _2번줄4약간연한파랑버튼.setFocusPainted(false); _2번줄4약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(2,4); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_2번줄4약간연한파랑버튼); 
	 _2번줄5약간연한파랑버튼.setBounds(X좌표[2], Y좌표[2][5], 120, 60); _2번줄5약간연한파랑버튼.setVisible(false); _2번줄5약간연한파랑버튼.setBorderPainted(false); _2번줄5약간연한파랑버튼.setContentAreaFilled(false); _2번줄5약간연한파랑버튼.setFocusPainted(false); _2번줄5약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(2,5); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_2번줄5약간연한파랑버튼); 
	 _2번줄6약간연한파랑버튼.setBounds(X좌표[2], Y좌표[2][6], 120, 60); _2번줄6약간연한파랑버튼.setVisible(false); _2번줄6약간연한파랑버튼.setBorderPainted(false); _2번줄6약간연한파랑버튼.setContentAreaFilled(false); _2번줄6약간연한파랑버튼.setFocusPainted(false); _2번줄6약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(2,6); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_2번줄6약간연한파랑버튼); 
	 _2번줄7약간연한파랑버튼.setBounds(X좌표[2], Y좌표[2][7], 120, 60); _2번줄7약간연한파랑버튼.setVisible(false); _2번줄7약간연한파랑버튼.setBorderPainted(false); _2번줄7약간연한파랑버튼.setContentAreaFilled(false); _2번줄7약간연한파랑버튼.setFocusPainted(false); _2번줄7약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(2,7); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_2번줄7약간연한파랑버튼); 
	 _2번줄8약간연한파랑버튼.setBounds(X좌표[2], Y좌표[2][8], 120, 60); _2번줄8약간연한파랑버튼.setVisible(false); _2번줄8약간연한파랑버튼.setBorderPainted(false); _2번줄8약간연한파랑버튼.setContentAreaFilled(false); _2번줄8약간연한파랑버튼.setFocusPainted(false); _2번줄8약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(2,8); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_2번줄8약간연한파랑버튼);
	 _3번줄0약간연한파랑버튼.setBounds(X좌표[3], Y좌표[3][0], 120, 60); _3번줄0약간연한파랑버튼.setVisible(false); _3번줄0약간연한파랑버튼.setBorderPainted(false); _3번줄0약간연한파랑버튼.setContentAreaFilled(false); _3번줄0약간연한파랑버튼.setFocusPainted(false); _3번줄0약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(3,0); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_3번줄0약간연한파랑버튼); 
	 _3번줄1약간연한파랑버튼.setBounds(X좌표[3], Y좌표[3][1], 120, 60); _3번줄1약간연한파랑버튼.setVisible(false); _3번줄1약간연한파랑버튼.setBorderPainted(false); _3번줄1약간연한파랑버튼.setContentAreaFilled(false); _3번줄1약간연한파랑버튼.setFocusPainted(false); _3번줄1약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(3,1); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_3번줄1약간연한파랑버튼); 
	 _3번줄2약간연한파랑버튼.setBounds(X좌표[3], Y좌표[3][2], 120, 60); _3번줄2약간연한파랑버튼.setVisible(false); _3번줄2약간연한파랑버튼.setBorderPainted(false); _3번줄2약간연한파랑버튼.setContentAreaFilled(false); _3번줄2약간연한파랑버튼.setFocusPainted(false); _3번줄2약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(3,2); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_3번줄2약간연한파랑버튼); 
	 _3번줄3약간연한파랑버튼.setBounds(X좌표[3], Y좌표[3][3], 120, 60); _3번줄3약간연한파랑버튼.setVisible(false); _3번줄3약간연한파랑버튼.setBorderPainted(false); _3번줄3약간연한파랑버튼.setContentAreaFilled(false); _3번줄3약간연한파랑버튼.setFocusPainted(false); _3번줄3약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(3,3); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_3번줄3약간연한파랑버튼); 
	 _3번줄4약간연한파랑버튼.setBounds(X좌표[3], Y좌표[3][4], 120, 60); _3번줄4약간연한파랑버튼.setVisible(false); _3번줄4약간연한파랑버튼.setBorderPainted(false); _3번줄4약간연한파랑버튼.setContentAreaFilled(false); _3번줄4약간연한파랑버튼.setFocusPainted(false); _3번줄4약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(3,4); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_3번줄4약간연한파랑버튼); 
	 _3번줄5약간연한파랑버튼.setBounds(X좌표[3], Y좌표[3][5], 120, 60); _3번줄5약간연한파랑버튼.setVisible(false); _3번줄5약간연한파랑버튼.setBorderPainted(false); _3번줄5약간연한파랑버튼.setContentAreaFilled(false); _3번줄5약간연한파랑버튼.setFocusPainted(false); _3번줄5약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(3,5); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_3번줄5약간연한파랑버튼); 
	 _3번줄6약간연한파랑버튼.setBounds(X좌표[3], Y좌표[3][6], 120, 60); _3번줄6약간연한파랑버튼.setVisible(false); _3번줄6약간연한파랑버튼.setBorderPainted(false); _3번줄6약간연한파랑버튼.setContentAreaFilled(false); _3번줄6약간연한파랑버튼.setFocusPainted(false); _3번줄6약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(3,6); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_3번줄6약간연한파랑버튼); 
	 _3번줄7약간연한파랑버튼.setBounds(X좌표[3], Y좌표[3][7], 120, 60); _3번줄7약간연한파랑버튼.setVisible(false); _3번줄7약간연한파랑버튼.setBorderPainted(false); _3번줄7약간연한파랑버튼.setContentAreaFilled(false); _3번줄7약간연한파랑버튼.setFocusPainted(false); _3번줄7약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(3,7); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_3번줄7약간연한파랑버튼); 
	 _3번줄8약간연한파랑버튼.setBounds(X좌표[3], Y좌표[3][8], 120, 60); _3번줄8약간연한파랑버튼.setVisible(false); _3번줄8약간연한파랑버튼.setBorderPainted(false); _3번줄8약간연한파랑버튼.setContentAreaFilled(false); _3번줄8약간연한파랑버튼.setFocusPainted(false); _3번줄8약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(3,8); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_3번줄8약간연한파랑버튼);
	 _4번줄0약간연한파랑버튼.setBounds(X좌표[4], Y좌표[4][0], 120, 64); _4번줄0약간연한파랑버튼.setVisible(false); _4번줄0약간연한파랑버튼.setBorderPainted(false); _4번줄0약간연한파랑버튼.setContentAreaFilled(false); _4번줄0약간연한파랑버튼.setFocusPainted(false); _4번줄0약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(4,0); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_4번줄0약간연한파랑버튼); 
	 _4번줄1약간연한파랑버튼.setBounds(X좌표[4], Y좌표[4][1], 120, 64); _4번줄1약간연한파랑버튼.setVisible(false); _4번줄1약간연한파랑버튼.setBorderPainted(false); _4번줄1약간연한파랑버튼.setContentAreaFilled(false); _4번줄1약간연한파랑버튼.setFocusPainted(false); _4번줄1약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(4,1); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_4번줄1약간연한파랑버튼); 
	 _4번줄2약간연한파랑버튼.setBounds(X좌표[4], Y좌표[4][2], 120, 64); _4번줄2약간연한파랑버튼.setVisible(false); _4번줄2약간연한파랑버튼.setBorderPainted(false); _4번줄2약간연한파랑버튼.setContentAreaFilled(false); _4번줄2약간연한파랑버튼.setFocusPainted(false); _4번줄2약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(4,2); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_4번줄2약간연한파랑버튼); 
	 _4번줄3약간연한파랑버튼.setBounds(X좌표[4], Y좌표[4][3], 120, 64); _4번줄3약간연한파랑버튼.setVisible(false); _4번줄3약간연한파랑버튼.setBorderPainted(false); _4번줄3약간연한파랑버튼.setContentAreaFilled(false); _4번줄3약간연한파랑버튼.setFocusPainted(false); _4번줄3약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(4,3); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_4번줄3약간연한파랑버튼); 
	 _4번줄4약간연한파랑버튼.setBounds(X좌표[4], Y좌표[4][4], 120, 64); _4번줄4약간연한파랑버튼.setVisible(false); _4번줄4약간연한파랑버튼.setBorderPainted(false); _4번줄4약간연한파랑버튼.setContentAreaFilled(false); _4번줄4약간연한파랑버튼.setFocusPainted(false); _4번줄4약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(4,4); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_4번줄4약간연한파랑버튼); 
	 _4번줄5약간연한파랑버튼.setBounds(X좌표[4], Y좌표[4][5], 120, 64); _4번줄5약간연한파랑버튼.setVisible(false); _4번줄5약간연한파랑버튼.setBorderPainted(false); _4번줄5약간연한파랑버튼.setContentAreaFilled(false); _4번줄5약간연한파랑버튼.setFocusPainted(false); _4번줄5약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(4,5); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_4번줄5약간연한파랑버튼); 
	 _4번줄6약간연한파랑버튼.setBounds(X좌표[4], Y좌표[4][6], 120, 64); _4번줄6약간연한파랑버튼.setVisible(false); _4번줄6약간연한파랑버튼.setBorderPainted(false); _4번줄6약간연한파랑버튼.setContentAreaFilled(false); _4번줄6약간연한파랑버튼.setFocusPainted(false); _4번줄6약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(4,6); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_4번줄6약간연한파랑버튼); 
	 _4번줄7약간연한파랑버튼.setBounds(X좌표[4], Y좌표[4][7], 120, 64); _4번줄7약간연한파랑버튼.setVisible(false); _4번줄7약간연한파랑버튼.setBorderPainted(false); _4번줄7약간연한파랑버튼.setContentAreaFilled(false); _4번줄7약간연한파랑버튼.setFocusPainted(false); _4번줄7약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(4,7); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_4번줄7약간연한파랑버튼); 
	 _4번줄8약간연한파랑버튼.setBounds(X좌표[4], Y좌표[4][8], 120, 64); _4번줄8약간연한파랑버튼.setVisible(false); _4번줄8약간연한파랑버튼.setBorderPainted(false); _4번줄8약간연한파랑버튼.setContentAreaFilled(false); _4번줄8약간연한파랑버튼.setFocusPainted(false); _4번줄8약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(4,8); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_4번줄8약간연한파랑버튼);
	 _5번줄0약간연한파랑버튼.setBounds(X좌표[5], Y좌표[5][0], 120, 60); _5번줄0약간연한파랑버튼.setVisible(false); _5번줄0약간연한파랑버튼.setBorderPainted(false); _5번줄0약간연한파랑버튼.setContentAreaFilled(false); _5번줄0약간연한파랑버튼.setFocusPainted(false); _5번줄0약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(5,0); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_5번줄0약간연한파랑버튼); 
	 _5번줄1약간연한파랑버튼.setBounds(X좌표[5], Y좌표[5][1], 120, 60); _5번줄1약간연한파랑버튼.setVisible(false); _5번줄1약간연한파랑버튼.setBorderPainted(false); _5번줄1약간연한파랑버튼.setContentAreaFilled(false); _5번줄1약간연한파랑버튼.setFocusPainted(false); _5번줄1약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(5,1); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_5번줄1약간연한파랑버튼); 
	 _5번줄2약간연한파랑버튼.setBounds(X좌표[5], Y좌표[5][2], 120, 60); _5번줄2약간연한파랑버튼.setVisible(false); _5번줄2약간연한파랑버튼.setBorderPainted(false); _5번줄2약간연한파랑버튼.setContentAreaFilled(false); _5번줄2약간연한파랑버튼.setFocusPainted(false); _5번줄2약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(5,2); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_5번줄2약간연한파랑버튼); 
	 _5번줄3약간연한파랑버튼.setBounds(X좌표[5], Y좌표[5][3], 120, 60); _5번줄3약간연한파랑버튼.setVisible(false); _5번줄3약간연한파랑버튼.setBorderPainted(false); _5번줄3약간연한파랑버튼.setContentAreaFilled(false); _5번줄3약간연한파랑버튼.setFocusPainted(false); _5번줄3약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(5,3); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_5번줄3약간연한파랑버튼); 
	 _5번줄4약간연한파랑버튼.setBounds(X좌표[5], Y좌표[5][4], 120, 60); _5번줄4약간연한파랑버튼.setVisible(false); _5번줄4약간연한파랑버튼.setBorderPainted(false); _5번줄4약간연한파랑버튼.setContentAreaFilled(false); _5번줄4약간연한파랑버튼.setFocusPainted(false); _5번줄4약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(5,4); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_5번줄4약간연한파랑버튼); 
	 _5번줄5약간연한파랑버튼.setBounds(X좌표[5], Y좌표[5][5], 120, 60); _5번줄5약간연한파랑버튼.setVisible(false); _5번줄5약간연한파랑버튼.setBorderPainted(false); _5번줄5약간연한파랑버튼.setContentAreaFilled(false); _5번줄5약간연한파랑버튼.setFocusPainted(false); _5번줄5약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(5,5); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_5번줄5약간연한파랑버튼); 
	 _5번줄6약간연한파랑버튼.setBounds(X좌표[5], Y좌표[5][6], 120, 60); _5번줄6약간연한파랑버튼.setVisible(false); _5번줄6약간연한파랑버튼.setBorderPainted(false); _5번줄6약간연한파랑버튼.setContentAreaFilled(false); _5번줄6약간연한파랑버튼.setFocusPainted(false); _5번줄6약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(5,6); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_5번줄6약간연한파랑버튼); 
	 _5번줄7약간연한파랑버튼.setBounds(X좌표[5], Y좌표[5][7], 120, 60); _5번줄7약간연한파랑버튼.setVisible(false); _5번줄7약간연한파랑버튼.setBorderPainted(false); _5번줄7약간연한파랑버튼.setContentAreaFilled(false); _5번줄7약간연한파랑버튼.setFocusPainted(false); _5번줄7약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(5,7); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_5번줄7약간연한파랑버튼); 
	 _5번줄8약간연한파랑버튼.setBounds(X좌표[5], Y좌표[5][8], 120, 60); _5번줄8약간연한파랑버튼.setVisible(false); _5번줄8약간연한파랑버튼.setBorderPainted(false); _5번줄8약간연한파랑버튼.setContentAreaFilled(false); _5번줄8약간연한파랑버튼.setFocusPainted(false); _5번줄8약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(5,8); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_5번줄8약간연한파랑버튼);
	 _6번줄0약간연한파랑버튼.setBounds(X좌표[6], Y좌표[6][0], 120, 60); _6번줄0약간연한파랑버튼.setVisible(false); _6번줄0약간연한파랑버튼.setBorderPainted(false); _6번줄0약간연한파랑버튼.setContentAreaFilled(false); _6번줄0약간연한파랑버튼.setFocusPainted(false); _6번줄0약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(6,0); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_6번줄0약간연한파랑버튼); 
	 _6번줄1약간연한파랑버튼.setBounds(X좌표[6], Y좌표[6][1], 120, 60); _6번줄1약간연한파랑버튼.setVisible(false); _6번줄1약간연한파랑버튼.setBorderPainted(false); _6번줄1약간연한파랑버튼.setContentAreaFilled(false); _6번줄1약간연한파랑버튼.setFocusPainted(false); _6번줄1약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(6,1); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_6번줄1약간연한파랑버튼); 
	 _6번줄2약간연한파랑버튼.setBounds(X좌표[6], Y좌표[6][2], 120, 60); _6번줄2약간연한파랑버튼.setVisible(false); _6번줄2약간연한파랑버튼.setBorderPainted(false); _6번줄2약간연한파랑버튼.setContentAreaFilled(false); _6번줄2약간연한파랑버튼.setFocusPainted(false); _6번줄2약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(6,2); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_6번줄2약간연한파랑버튼);
	 _6번줄3약간연한파랑버튼.setBounds(X좌표[6], Y좌표[6][3], 120, 60); _6번줄3약간연한파랑버튼.setVisible(false); _6번줄3약간연한파랑버튼.setBorderPainted(false); _6번줄3약간연한파랑버튼.setContentAreaFilled(false); _6번줄3약간연한파랑버튼.setFocusPainted(false); _6번줄3약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(6,3); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_6번줄3약간연한파랑버튼); 
	 _6번줄4약간연한파랑버튼.setBounds(X좌표[6], Y좌표[6][4], 120, 60); _6번줄4약간연한파랑버튼.setVisible(false); _6번줄4약간연한파랑버튼.setBorderPainted(false); _6번줄4약간연한파랑버튼.setContentAreaFilled(false); _6번줄4약간연한파랑버튼.setFocusPainted(false); _6번줄4약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(6,4); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_6번줄4약간연한파랑버튼); 
	 _6번줄5약간연한파랑버튼.setBounds(X좌표[6], Y좌표[6][5], 120, 60); _6번줄5약간연한파랑버튼.setVisible(false); _6번줄5약간연한파랑버튼.setBorderPainted(false); _6번줄5약간연한파랑버튼.setContentAreaFilled(false); _6번줄5약간연한파랑버튼.setFocusPainted(false); _6번줄5약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(6,5); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_6번줄5약간연한파랑버튼); 
	 _6번줄6약간연한파랑버튼.setBounds(X좌표[6], Y좌표[6][6], 120, 60); _6번줄6약간연한파랑버튼.setVisible(false); _6번줄6약간연한파랑버튼.setBorderPainted(false); _6번줄6약간연한파랑버튼.setContentAreaFilled(false); _6번줄6약간연한파랑버튼.setFocusPainted(false); _6번줄6약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(6,6); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_6번줄6약간연한파랑버튼); 
	 _6번줄7약간연한파랑버튼.setBounds(X좌표[6], Y좌표[6][7], 120, 60); _6번줄7약간연한파랑버튼.setVisible(false); _6번줄7약간연한파랑버튼.setBorderPainted(false); _6번줄7약간연한파랑버튼.setContentAreaFilled(false); _6번줄7약간연한파랑버튼.setFocusPainted(false); _6번줄7약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(6,7); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_6번줄7약간연한파랑버튼); 
	 _6번줄8약간연한파랑버튼.setBounds(X좌표[6], Y좌표[6][8], 120, 60); _6번줄8약간연한파랑버튼.setVisible(false); _6번줄8약간연한파랑버튼.setBorderPainted(false); _6번줄8약간연한파랑버튼.setContentAreaFilled(false); _6번줄8약간연한파랑버튼.setFocusPainted(false); _6번줄8약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(6,8); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_6번줄8약간연한파랑버튼);
	 _7번줄0약간연한파랑버튼.setBounds(X좌표[7], Y좌표[7][0], 120, 60); _7번줄0약간연한파랑버튼.setVisible(false); _7번줄0약간연한파랑버튼.setBorderPainted(false); _7번줄0약간연한파랑버튼.setContentAreaFilled(false); _7번줄0약간연한파랑버튼.setFocusPainted(false); _7번줄0약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(7,0); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_7번줄0약간연한파랑버튼); 
	 _7번줄1약간연한파랑버튼.setBounds(X좌표[7], Y좌표[7][1], 120, 60); _7번줄1약간연한파랑버튼.setVisible(false); _7번줄1약간연한파랑버튼.setBorderPainted(false); _7번줄1약간연한파랑버튼.setContentAreaFilled(false); _7번줄1약간연한파랑버튼.setFocusPainted(false); _7번줄1약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(7,1); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_7번줄1약간연한파랑버튼); 
	 _7번줄2약간연한파랑버튼.setBounds(X좌표[7], Y좌표[7][2], 120, 60); _7번줄2약간연한파랑버튼.setVisible(false); _7번줄2약간연한파랑버튼.setBorderPainted(false); _7번줄2약간연한파랑버튼.setContentAreaFilled(false); _7번줄2약간연한파랑버튼.setFocusPainted(false); _7번줄2약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(7,2); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_7번줄2약간연한파랑버튼); 
	 _7번줄3약간연한파랑버튼.setBounds(X좌표[7], Y좌표[7][3], 120, 60); _7번줄3약간연한파랑버튼.setVisible(false); _7번줄3약간연한파랑버튼.setBorderPainted(false); _7번줄3약간연한파랑버튼.setContentAreaFilled(false); _7번줄3약간연한파랑버튼.setFocusPainted(false); _7번줄3약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(7,3); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_7번줄3약간연한파랑버튼); 
	 _7번줄4약간연한파랑버튼.setBounds(X좌표[7], Y좌표[7][4], 120, 60); _7번줄4약간연한파랑버튼.setVisible(false); _7번줄4약간연한파랑버튼.setBorderPainted(false); _7번줄4약간연한파랑버튼.setContentAreaFilled(false); _7번줄4약간연한파랑버튼.setFocusPainted(false); _7번줄4약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(7,4); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_7번줄4약간연한파랑버튼); 
	 _7번줄5약간연한파랑버튼.setBounds(X좌표[7], Y좌표[7][5], 120, 60); _7번줄5약간연한파랑버튼.setVisible(false); _7번줄5약간연한파랑버튼.setBorderPainted(false); _7번줄5약간연한파랑버튼.setContentAreaFilled(false); _7번줄5약간연한파랑버튼.setFocusPainted(false); _7번줄5약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(7,5); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_7번줄5약간연한파랑버튼); 
	 _7번줄6약간연한파랑버튼.setBounds(X좌표[7], Y좌표[7][6], 120, 60); _7번줄6약간연한파랑버튼.setVisible(false); _7번줄6약간연한파랑버튼.setBorderPainted(false); _7번줄6약간연한파랑버튼.setContentAreaFilled(false); _7번줄6약간연한파랑버튼.setFocusPainted(false); _7번줄6약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(7,6); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_7번줄6약간연한파랑버튼); 
	 _7번줄7약간연한파랑버튼.setBounds(X좌표[7], Y좌표[7][7], 120, 60); _7번줄7약간연한파랑버튼.setVisible(false); _7번줄7약간연한파랑버튼.setBorderPainted(false); _7번줄7약간연한파랑버튼.setContentAreaFilled(false); _7번줄7약간연한파랑버튼.setFocusPainted(false); _7번줄7약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(7,7); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_7번줄7약간연한파랑버튼); 
	 _7번줄8약간연한파랑버튼.setBounds(X좌표[7], Y좌표[7][8], 120, 60); _7번줄8약간연한파랑버튼.setVisible(false); _7번줄8약간연한파랑버튼.setBorderPainted(false); _7번줄8약간연한파랑버튼.setContentAreaFilled(false); _7번줄8약간연한파랑버튼.setFocusPainted(false); _7번줄8약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(7,8); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_7번줄8약간연한파랑버튼);
	 _8번줄0약간연한파랑버튼.setBounds(X좌표[8], Y좌표[8][0], 120, 60); _8번줄0약간연한파랑버튼.setVisible(false); _8번줄0약간연한파랑버튼.setBorderPainted(false); _8번줄0약간연한파랑버튼.setContentAreaFilled(false); _8번줄0약간연한파랑버튼.setFocusPainted(false); _8번줄0약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(8,0); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_8번줄0약간연한파랑버튼); 
	 _8번줄1약간연한파랑버튼.setBounds(X좌표[8], Y좌표[8][1], 120, 60); _8번줄1약간연한파랑버튼.setVisible(false); _8번줄1약간연한파랑버튼.setBorderPainted(false); _8번줄1약간연한파랑버튼.setContentAreaFilled(false); _8번줄1약간연한파랑버튼.setFocusPainted(false); _8번줄1약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(8,1); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_8번줄1약간연한파랑버튼); 
	 _8번줄2약간연한파랑버튼.setBounds(X좌표[8], Y좌표[8][2], 120, 60); _8번줄2약간연한파랑버튼.setVisible(false); _8번줄2약간연한파랑버튼.setBorderPainted(false); _8번줄2약간연한파랑버튼.setContentAreaFilled(false); _8번줄2약간연한파랑버튼.setFocusPainted(false); _8번줄2약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(8,2); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_8번줄2약간연한파랑버튼); 
	 _8번줄3약간연한파랑버튼.setBounds(X좌표[8], Y좌표[8][3], 120, 60); _8번줄3약간연한파랑버튼.setVisible(false); _8번줄3약간연한파랑버튼.setBorderPainted(false); _8번줄3약간연한파랑버튼.setContentAreaFilled(false); _8번줄3약간연한파랑버튼.setFocusPainted(false); _8번줄3약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(8,3); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_8번줄3약간연한파랑버튼); 
	 _8번줄4약간연한파랑버튼.setBounds(X좌표[8], Y좌표[8][4], 120, 60); _8번줄4약간연한파랑버튼.setVisible(false); _8번줄4약간연한파랑버튼.setBorderPainted(false); _8번줄4약간연한파랑버튼.setContentAreaFilled(false); _8번줄4약간연한파랑버튼.setFocusPainted(false); _8번줄4약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(8,4); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_8번줄4약간연한파랑버튼); 
	 _8번줄5약간연한파랑버튼.setBounds(X좌표[8], Y좌표[8][5], 120, 60); _8번줄5약간연한파랑버튼.setVisible(false); _8번줄5약간연한파랑버튼.setBorderPainted(false); _8번줄5약간연한파랑버튼.setContentAreaFilled(false); _8번줄5약간연한파랑버튼.setFocusPainted(false); _8번줄5약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(8,5); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_8번줄5약간연한파랑버튼); 
	 _8번줄6약간연한파랑버튼.setBounds(X좌표[8], Y좌표[8][6], 120, 60); _8번줄6약간연한파랑버튼.setVisible(false); _8번줄6약간연한파랑버튼.setBorderPainted(false); _8번줄6약간연한파랑버튼.setContentAreaFilled(false); _8번줄6약간연한파랑버튼.setFocusPainted(false); _8번줄6약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(8,6); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_8번줄6약간연한파랑버튼); 
	 _8번줄7약간연한파랑버튼.setBounds(X좌표[8], Y좌표[8][7], 120, 60); _8번줄7약간연한파랑버튼.setVisible(false); _8번줄7약간연한파랑버튼.setBorderPainted(false); _8번줄7약간연한파랑버튼.setContentAreaFilled(false); _8번줄7약간연한파랑버튼.setFocusPainted(false); _8번줄7약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(8,7); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_8번줄7약간연한파랑버튼); 
	 _8번줄8약간연한파랑버튼.setBounds(X좌표[8], Y좌표[8][8], 120, 60); _8번줄8약간연한파랑버튼.setVisible(false); _8번줄8약간연한파랑버튼.setBorderPainted(false); _8번줄8약간연한파랑버튼.setContentAreaFilled(false); _8번줄8약간연한파랑버튼.setFocusPainted(false); _8번줄8약간연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 증식(8,8); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_8번줄8약간연한파랑버튼);	

	 _0번줄0연한파랑버튼.setBounds(X좌표[0], Y좌표[0][0], 120, 60); _0번줄0연한파랑버튼.setVisible(false); _0번줄0연한파랑버튼.setBorderPainted(false); _0번줄0연한파랑버튼.setContentAreaFilled(false); _0번줄0연한파랑버튼.setFocusPainted(false); _0번줄0연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(0,0); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_0번줄0연한파랑버튼);
	 _0번줄1연한파랑버튼.setBounds(X좌표[0], Y좌표[0][1], 120, 60); _0번줄1연한파랑버튼.setVisible(false); _0번줄1연한파랑버튼.setBorderPainted(false); _0번줄1연한파랑버튼.setContentAreaFilled(false); _0번줄1연한파랑버튼.setFocusPainted(false); _0번줄1연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(0,1); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_0번줄1연한파랑버튼);
	 _0번줄2연한파랑버튼.setBounds(X좌표[0], Y좌표[0][2], 120, 60); _0번줄2연한파랑버튼.setVisible(false); _0번줄2연한파랑버튼.setBorderPainted(false); _0번줄2연한파랑버튼.setContentAreaFilled(false); _0번줄2연한파랑버튼.setFocusPainted(false); _0번줄2연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(0,2); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_0번줄2연한파랑버튼);
	 _0번줄3연한파랑버튼.setBounds(X좌표[0], Y좌표[0][3], 120, 60); _0번줄3연한파랑버튼.setVisible(false); _0번줄3연한파랑버튼.setBorderPainted(false); _0번줄3연한파랑버튼.setContentAreaFilled(false); _0번줄3연한파랑버튼.setFocusPainted(false); _0번줄3연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(0,3); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_0번줄3연한파랑버튼);
	 _0번줄4연한파랑버튼.setBounds(X좌표[0], Y좌표[0][4], 120, 60); _0번줄4연한파랑버튼.setVisible(false); _0번줄4연한파랑버튼.setBorderPainted(false); _0번줄4연한파랑버튼.setContentAreaFilled(false); _0번줄4연한파랑버튼.setFocusPainted(false); _0번줄4연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(0,4); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_0번줄4연한파랑버튼);
	 _0번줄5연한파랑버튼.setBounds(X좌표[0], Y좌표[0][5], 120, 60); _0번줄5연한파랑버튼.setVisible(false); _0번줄5연한파랑버튼.setBorderPainted(false); _0번줄5연한파랑버튼.setContentAreaFilled(false); _0번줄5연한파랑버튼.setFocusPainted(false); _0번줄5연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(0,5); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_0번줄5연한파랑버튼);
	 _0번줄6연한파랑버튼.setBounds(X좌표[0], Y좌표[0][6], 120, 60); _0번줄6연한파랑버튼.setVisible(false); _0번줄6연한파랑버튼.setBorderPainted(false); _0번줄6연한파랑버튼.setContentAreaFilled(false); _0번줄6연한파랑버튼.setFocusPainted(false); _0번줄6연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(0,6); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_0번줄6연한파랑버튼);
	 _0번줄7연한파랑버튼.setBounds(X좌표[0], Y좌표[0][7], 120, 60); _0번줄7연한파랑버튼.setVisible(false); _0번줄7연한파랑버튼.setBorderPainted(false); _0번줄7연한파랑버튼.setContentAreaFilled(false); _0번줄7연한파랑버튼.setFocusPainted(false); _0번줄7연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(0,7); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_0번줄7연한파랑버튼);
	 _0번줄8연한파랑버튼.setBounds(X좌표[0], Y좌표[0][8], 120, 60); _0번줄8연한파랑버튼.setVisible(false); _0번줄8연한파랑버튼.setBorderPainted(false); _0번줄8연한파랑버튼.setContentAreaFilled(false); _0번줄8연한파랑버튼.setFocusPainted(false); _0번줄8연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(0,8); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_0번줄8연한파랑버튼);
	 _1번줄0연한파랑버튼.setBounds(X좌표[1], Y좌표[1][0], 120, 60); _1번줄0연한파랑버튼.setVisible(false); _1번줄0연한파랑버튼.setBorderPainted(false); _1번줄0연한파랑버튼.setContentAreaFilled(false); _1번줄0연한파랑버튼.setFocusPainted(false); _1번줄0연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(1,0); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_1번줄0연한파랑버튼); 
	 _1번줄1연한파랑버튼.setBounds(X좌표[1], Y좌표[1][1], 120, 60); _1번줄1연한파랑버튼.setVisible(false); _1번줄1연한파랑버튼.setBorderPainted(false); _1번줄1연한파랑버튼.setContentAreaFilled(false); _1번줄1연한파랑버튼.setFocusPainted(false); _1번줄1연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(1,1); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_1번줄1연한파랑버튼); 
	 _1번줄2연한파랑버튼.setBounds(X좌표[1], Y좌표[1][2], 120, 60); _1번줄2연한파랑버튼.setVisible(false); _1번줄2연한파랑버튼.setBorderPainted(false); _1번줄2연한파랑버튼.setContentAreaFilled(false); _1번줄2연한파랑버튼.setFocusPainted(false); _1번줄2연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(1,2); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_1번줄2연한파랑버튼); 
	 _1번줄3연한파랑버튼.setBounds(X좌표[1], Y좌표[1][3], 120, 60); _1번줄3연한파랑버튼.setVisible(false); _1번줄3연한파랑버튼.setBorderPainted(false); _1번줄3연한파랑버튼.setContentAreaFilled(false); _1번줄3연한파랑버튼.setFocusPainted(false); _1번줄3연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(1,3); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_1번줄3연한파랑버튼); 
	 _1번줄4연한파랑버튼.setBounds(X좌표[1], Y좌표[1][4], 120, 60); _1번줄4연한파랑버튼.setVisible(false); _1번줄4연한파랑버튼.setBorderPainted(false); _1번줄4연한파랑버튼.setContentAreaFilled(false); _1번줄4연한파랑버튼.setFocusPainted(false); _1번줄4연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(1,4); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_1번줄4연한파랑버튼); 
	 _1번줄5연한파랑버튼.setBounds(X좌표[1], Y좌표[1][5], 120, 60); _1번줄5연한파랑버튼.setVisible(false); _1번줄5연한파랑버튼.setBorderPainted(false); _1번줄5연한파랑버튼.setContentAreaFilled(false); _1번줄5연한파랑버튼.setFocusPainted(false); _1번줄5연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(1,5); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_1번줄5연한파랑버튼); 
	 _1번줄6연한파랑버튼.setBounds(X좌표[1], Y좌표[1][6], 120, 60); _1번줄6연한파랑버튼.setVisible(false); _1번줄6연한파랑버튼.setBorderPainted(false); _1번줄6연한파랑버튼.setContentAreaFilled(false); _1번줄6연한파랑버튼.setFocusPainted(false); _1번줄6연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(1,6); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_1번줄6연한파랑버튼); 
	 _1번줄7연한파랑버튼.setBounds(X좌표[1], Y좌표[1][7], 120, 60); _1번줄7연한파랑버튼.setVisible(false); _1번줄7연한파랑버튼.setBorderPainted(false); _1번줄7연한파랑버튼.setContentAreaFilled(false); _1번줄7연한파랑버튼.setFocusPainted(false); _1번줄7연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(1,7); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_1번줄7연한파랑버튼); 
	 _1번줄8연한파랑버튼.setBounds(X좌표[1], Y좌표[1][8], 120, 60); _1번줄8연한파랑버튼.setVisible(false); _1번줄8연한파랑버튼.setBorderPainted(false); _1번줄8연한파랑버튼.setContentAreaFilled(false); _1번줄8연한파랑버튼.setFocusPainted(false); _1번줄8연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(1,8); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_1번줄8연한파랑버튼);
	 _2번줄0연한파랑버튼.setBounds(X좌표[2], Y좌표[2][0], 120, 60); _2번줄0연한파랑버튼.setVisible(false); _2번줄0연한파랑버튼.setBorderPainted(false); _2번줄0연한파랑버튼.setContentAreaFilled(false); _2번줄0연한파랑버튼.setFocusPainted(false); _2번줄0연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(2,0); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_2번줄0연한파랑버튼); 
	 _2번줄1연한파랑버튼.setBounds(X좌표[2], Y좌표[2][1], 120, 60); _2번줄1연한파랑버튼.setVisible(false); _2번줄1연한파랑버튼.setBorderPainted(false); _2번줄1연한파랑버튼.setContentAreaFilled(false); _2번줄1연한파랑버튼.setFocusPainted(false); _2번줄1연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(2,1); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_2번줄1연한파랑버튼); 
	 _2번줄2연한파랑버튼.setBounds(X좌표[2], Y좌표[2][2], 120, 60); _2번줄2연한파랑버튼.setVisible(false); _2번줄2연한파랑버튼.setBorderPainted(false); _2번줄2연한파랑버튼.setContentAreaFilled(false); _2번줄2연한파랑버튼.setFocusPainted(false); _2번줄2연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(2,2); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_2번줄2연한파랑버튼); 
	 _2번줄3연한파랑버튼.setBounds(X좌표[2], Y좌표[2][3], 120, 60); _2번줄3연한파랑버튼.setVisible(false); _2번줄3연한파랑버튼.setBorderPainted(false); _2번줄3연한파랑버튼.setContentAreaFilled(false); _2번줄3연한파랑버튼.setFocusPainted(false); _2번줄3연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(2,3); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_2번줄3연한파랑버튼); 
	 _2번줄4연한파랑버튼.setBounds(X좌표[2], Y좌표[2][4], 120, 60); _2번줄4연한파랑버튼.setVisible(false); _2번줄4연한파랑버튼.setBorderPainted(false); _2번줄4연한파랑버튼.setContentAreaFilled(false); _2번줄4연한파랑버튼.setFocusPainted(false); _2번줄4연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(2,4); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_2번줄4연한파랑버튼); 
	 _2번줄5연한파랑버튼.setBounds(X좌표[2], Y좌표[2][5], 120, 60); _2번줄5연한파랑버튼.setVisible(false); _2번줄5연한파랑버튼.setBorderPainted(false); _2번줄5연한파랑버튼.setContentAreaFilled(false); _2번줄5연한파랑버튼.setFocusPainted(false); _2번줄5연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(2,5); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_2번줄5연한파랑버튼); 
	 _2번줄6연한파랑버튼.setBounds(X좌표[2], Y좌표[2][6], 120, 60); _2번줄6연한파랑버튼.setVisible(false); _2번줄6연한파랑버튼.setBorderPainted(false); _2번줄6연한파랑버튼.setContentAreaFilled(false); _2번줄6연한파랑버튼.setFocusPainted(false); _2번줄6연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(2,6); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_2번줄6연한파랑버튼); 
	 _2번줄7연한파랑버튼.setBounds(X좌표[2], Y좌표[2][7], 120, 60); _2번줄7연한파랑버튼.setVisible(false); _2번줄7연한파랑버튼.setBorderPainted(false); _2번줄7연한파랑버튼.setContentAreaFilled(false); _2번줄7연한파랑버튼.setFocusPainted(false); _2번줄7연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(2,7); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_2번줄7연한파랑버튼); 
	 _2번줄8연한파랑버튼.setBounds(X좌표[2], Y좌표[2][8], 120, 60); _2번줄8연한파랑버튼.setVisible(false); _2번줄8연한파랑버튼.setBorderPainted(false); _2번줄8연한파랑버튼.setContentAreaFilled(false); _2번줄8연한파랑버튼.setFocusPainted(false); _2번줄8연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(2,8); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_2번줄8연한파랑버튼);
	 _3번줄0연한파랑버튼.setBounds(X좌표[3], Y좌표[3][0], 120, 60); _3번줄0연한파랑버튼.setVisible(false); _3번줄0연한파랑버튼.setBorderPainted(false); _3번줄0연한파랑버튼.setContentAreaFilled(false); _3번줄0연한파랑버튼.setFocusPainted(false); _3번줄0연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(3,0); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_3번줄0연한파랑버튼); 
	 _3번줄1연한파랑버튼.setBounds(X좌표[3], Y좌표[3][1], 120, 60); _3번줄1연한파랑버튼.setVisible(false); _3번줄1연한파랑버튼.setBorderPainted(false); _3번줄1연한파랑버튼.setContentAreaFilled(false); _3번줄1연한파랑버튼.setFocusPainted(false); _3번줄1연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(3,1); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_3번줄1연한파랑버튼); 
	 _3번줄2연한파랑버튼.setBounds(X좌표[3], Y좌표[3][2], 120, 60); _3번줄2연한파랑버튼.setVisible(false); _3번줄2연한파랑버튼.setBorderPainted(false); _3번줄2연한파랑버튼.setContentAreaFilled(false); _3번줄2연한파랑버튼.setFocusPainted(false); _3번줄2연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(3,2); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_3번줄2연한파랑버튼); 
	 _3번줄3연한파랑버튼.setBounds(X좌표[3], Y좌표[3][3], 120, 60); _3번줄3연한파랑버튼.setVisible(false); _3번줄3연한파랑버튼.setBorderPainted(false); _3번줄3연한파랑버튼.setContentAreaFilled(false); _3번줄3연한파랑버튼.setFocusPainted(false); _3번줄3연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(3,3); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_3번줄3연한파랑버튼); 
	 _3번줄4연한파랑버튼.setBounds(X좌표[3], Y좌표[3][4], 120, 60); _3번줄4연한파랑버튼.setVisible(false); _3번줄4연한파랑버튼.setBorderPainted(false); _3번줄4연한파랑버튼.setContentAreaFilled(false); _3번줄4연한파랑버튼.setFocusPainted(false); _3번줄4연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(3,4); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_3번줄4연한파랑버튼); 
	 _3번줄5연한파랑버튼.setBounds(X좌표[3], Y좌표[3][5], 120, 60); _3번줄5연한파랑버튼.setVisible(false); _3번줄5연한파랑버튼.setBorderPainted(false); _3번줄5연한파랑버튼.setContentAreaFilled(false); _3번줄5연한파랑버튼.setFocusPainted(false); _3번줄5연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(3,5); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_3번줄5연한파랑버튼); 
	 _3번줄6연한파랑버튼.setBounds(X좌표[3], Y좌표[3][6], 120, 60); _3번줄6연한파랑버튼.setVisible(false); _3번줄6연한파랑버튼.setBorderPainted(false); _3번줄6연한파랑버튼.setContentAreaFilled(false); _3번줄6연한파랑버튼.setFocusPainted(false); _3번줄6연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(3,6); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_3번줄6연한파랑버튼); 
	 _3번줄7연한파랑버튼.setBounds(X좌표[3], Y좌표[3][7], 120, 60); _3번줄7연한파랑버튼.setVisible(false); _3번줄7연한파랑버튼.setBorderPainted(false); _3번줄7연한파랑버튼.setContentAreaFilled(false); _3번줄7연한파랑버튼.setFocusPainted(false); _3번줄7연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(3,7); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_3번줄7연한파랑버튼); 
	 _3번줄8연한파랑버튼.setBounds(X좌표[3], Y좌표[3][8], 120, 60); _3번줄8연한파랑버튼.setVisible(false); _3번줄8연한파랑버튼.setBorderPainted(false); _3번줄8연한파랑버튼.setContentAreaFilled(false); _3번줄8연한파랑버튼.setFocusPainted(false); _3번줄8연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(3,8); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_3번줄8연한파랑버튼);
	 _4번줄0연한파랑버튼.setBounds(X좌표[4], Y좌표[4][0], 120, 64); _4번줄0연한파랑버튼.setVisible(false); _4번줄0연한파랑버튼.setBorderPainted(false); _4번줄0연한파랑버튼.setContentAreaFilled(false); _4번줄0연한파랑버튼.setFocusPainted(false); _4번줄0연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(4,0); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_4번줄0연한파랑버튼); 
	 _4번줄1연한파랑버튼.setBounds(X좌표[4], Y좌표[4][1], 120, 64); _4번줄1연한파랑버튼.setVisible(false); _4번줄1연한파랑버튼.setBorderPainted(false); _4번줄1연한파랑버튼.setContentAreaFilled(false); _4번줄1연한파랑버튼.setFocusPainted(false); _4번줄1연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(4,1); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_4번줄1연한파랑버튼); 
	 _4번줄2연한파랑버튼.setBounds(X좌표[4], Y좌표[4][2], 120, 64); _4번줄2연한파랑버튼.setVisible(false); _4번줄2연한파랑버튼.setBorderPainted(false); _4번줄2연한파랑버튼.setContentAreaFilled(false); _4번줄2연한파랑버튼.setFocusPainted(false); _4번줄2연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(4,2); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_4번줄2연한파랑버튼); 
	 _4번줄3연한파랑버튼.setBounds(X좌표[4], Y좌표[4][3], 120, 64); _4번줄3연한파랑버튼.setVisible(false); _4번줄3연한파랑버튼.setBorderPainted(false); _4번줄3연한파랑버튼.setContentAreaFilled(false); _4번줄3연한파랑버튼.setFocusPainted(false); _4번줄3연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(4,3); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_4번줄3연한파랑버튼); 
	 _4번줄4연한파랑버튼.setBounds(X좌표[4], Y좌표[4][4], 120, 64); _4번줄4연한파랑버튼.setVisible(false); _4번줄4연한파랑버튼.setBorderPainted(false); _4번줄4연한파랑버튼.setContentAreaFilled(false); _4번줄4연한파랑버튼.setFocusPainted(false); _4번줄4연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(4,4); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_4번줄4연한파랑버튼); 
	 _4번줄5연한파랑버튼.setBounds(X좌표[4], Y좌표[4][5], 120, 64); _4번줄5연한파랑버튼.setVisible(false); _4번줄5연한파랑버튼.setBorderPainted(false); _4번줄5연한파랑버튼.setContentAreaFilled(false); _4번줄5연한파랑버튼.setFocusPainted(false); _4번줄5연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(4,5); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_4번줄5연한파랑버튼); 
	 _4번줄6연한파랑버튼.setBounds(X좌표[4], Y좌표[4][6], 120, 64); _4번줄6연한파랑버튼.setVisible(false); _4번줄6연한파랑버튼.setBorderPainted(false); _4번줄6연한파랑버튼.setContentAreaFilled(false); _4번줄6연한파랑버튼.setFocusPainted(false); _4번줄6연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(4,6); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_4번줄6연한파랑버튼); 
	 _4번줄7연한파랑버튼.setBounds(X좌표[4], Y좌표[4][7], 120, 64); _4번줄7연한파랑버튼.setVisible(false); _4번줄7연한파랑버튼.setBorderPainted(false); _4번줄7연한파랑버튼.setContentAreaFilled(false); _4번줄7연한파랑버튼.setFocusPainted(false); _4번줄7연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(4,7); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_4번줄7연한파랑버튼); 
	 _4번줄8연한파랑버튼.setBounds(X좌표[4], Y좌표[4][8], 120, 64); _4번줄8연한파랑버튼.setVisible(false); _4번줄8연한파랑버튼.setBorderPainted(false); _4번줄8연한파랑버튼.setContentAreaFilled(false); _4번줄8연한파랑버튼.setFocusPainted(false); _4번줄8연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(4,8); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_4번줄8연한파랑버튼);
	 _5번줄0연한파랑버튼.setBounds(X좌표[5], Y좌표[5][0], 120, 60); _5번줄0연한파랑버튼.setVisible(false); _5번줄0연한파랑버튼.setBorderPainted(false); _5번줄0연한파랑버튼.setContentAreaFilled(false); _5번줄0연한파랑버튼.setFocusPainted(false); _5번줄0연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(5,0); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_5번줄0연한파랑버튼); 
	 _5번줄1연한파랑버튼.setBounds(X좌표[5], Y좌표[5][1], 120, 60); _5번줄1연한파랑버튼.setVisible(false); _5번줄1연한파랑버튼.setBorderPainted(false); _5번줄1연한파랑버튼.setContentAreaFilled(false); _5번줄1연한파랑버튼.setFocusPainted(false); _5번줄1연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(5,1); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_5번줄1연한파랑버튼); 
	 _5번줄2연한파랑버튼.setBounds(X좌표[5], Y좌표[5][2], 120, 60); _5번줄2연한파랑버튼.setVisible(false); _5번줄2연한파랑버튼.setBorderPainted(false); _5번줄2연한파랑버튼.setContentAreaFilled(false); _5번줄2연한파랑버튼.setFocusPainted(false); _5번줄2연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(5,2); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_5번줄2연한파랑버튼); 
	 _5번줄3연한파랑버튼.setBounds(X좌표[5], Y좌표[5][3], 120, 60); _5번줄3연한파랑버튼.setVisible(false); _5번줄3연한파랑버튼.setBorderPainted(false); _5번줄3연한파랑버튼.setContentAreaFilled(false); _5번줄3연한파랑버튼.setFocusPainted(false); _5번줄3연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(5,3); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_5번줄3연한파랑버튼); 
	 _5번줄4연한파랑버튼.setBounds(X좌표[5], Y좌표[5][4], 120, 60); _5번줄4연한파랑버튼.setVisible(false); _5번줄4연한파랑버튼.setBorderPainted(false); _5번줄4연한파랑버튼.setContentAreaFilled(false); _5번줄4연한파랑버튼.setFocusPainted(false); _5번줄4연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(5,4); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_5번줄4연한파랑버튼); 
	 _5번줄5연한파랑버튼.setBounds(X좌표[5], Y좌표[5][5], 120, 60); _5번줄5연한파랑버튼.setVisible(false); _5번줄5연한파랑버튼.setBorderPainted(false); _5번줄5연한파랑버튼.setContentAreaFilled(false); _5번줄5연한파랑버튼.setFocusPainted(false); _5번줄5연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(5,5); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_5번줄5연한파랑버튼); 
	 _5번줄6연한파랑버튼.setBounds(X좌표[5], Y좌표[5][6], 120, 60); _5번줄6연한파랑버튼.setVisible(false); _5번줄6연한파랑버튼.setBorderPainted(false); _5번줄6연한파랑버튼.setContentAreaFilled(false); _5번줄6연한파랑버튼.setFocusPainted(false); _5번줄6연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(5,6); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_5번줄6연한파랑버튼); 
	 _5번줄7연한파랑버튼.setBounds(X좌표[5], Y좌표[5][7], 120, 60); _5번줄7연한파랑버튼.setVisible(false); _5번줄7연한파랑버튼.setBorderPainted(false); _5번줄7연한파랑버튼.setContentAreaFilled(false); _5번줄7연한파랑버튼.setFocusPainted(false); _5번줄7연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(5,7); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_5번줄7연한파랑버튼); 
	 _5번줄8연한파랑버튼.setBounds(X좌표[5], Y좌표[5][8], 120, 60); _5번줄8연한파랑버튼.setVisible(false); _5번줄8연한파랑버튼.setBorderPainted(false); _5번줄8연한파랑버튼.setContentAreaFilled(false); _5번줄8연한파랑버튼.setFocusPainted(false); _5번줄8연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(5,8); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_5번줄8연한파랑버튼);
	 _6번줄0연한파랑버튼.setBounds(X좌표[6], Y좌표[6][0], 120, 60); _6번줄0연한파랑버튼.setVisible(false); _6번줄0연한파랑버튼.setBorderPainted(false); _6번줄0연한파랑버튼.setContentAreaFilled(false); _6번줄0연한파랑버튼.setFocusPainted(false); _6번줄0연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(6,0); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_6번줄0연한파랑버튼); 
	 _6번줄1연한파랑버튼.setBounds(X좌표[6], Y좌표[6][1], 120, 60); _6번줄1연한파랑버튼.setVisible(false); _6번줄1연한파랑버튼.setBorderPainted(false); _6번줄1연한파랑버튼.setContentAreaFilled(false); _6번줄1연한파랑버튼.setFocusPainted(false); _6번줄1연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(6,1); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_6번줄1연한파랑버튼); 
	 _6번줄2연한파랑버튼.setBounds(X좌표[6], Y좌표[6][2], 120, 60); _6번줄2연한파랑버튼.setVisible(false); _6번줄2연한파랑버튼.setBorderPainted(false); _6번줄2연한파랑버튼.setContentAreaFilled(false); _6번줄2연한파랑버튼.setFocusPainted(false); _6번줄2연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(6,2); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_6번줄2연한파랑버튼);
	 _6번줄3연한파랑버튼.setBounds(X좌표[6], Y좌표[6][3], 120, 60); _6번줄3연한파랑버튼.setVisible(false); _6번줄3연한파랑버튼.setBorderPainted(false); _6번줄3연한파랑버튼.setContentAreaFilled(false); _6번줄3연한파랑버튼.setFocusPainted(false); _6번줄3연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(6,3); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_6번줄3연한파랑버튼); 
	 _6번줄4연한파랑버튼.setBounds(X좌표[6], Y좌표[6][4], 120, 60); _6번줄4연한파랑버튼.setVisible(false); _6번줄4연한파랑버튼.setBorderPainted(false); _6번줄4연한파랑버튼.setContentAreaFilled(false); _6번줄4연한파랑버튼.setFocusPainted(false); _6번줄4연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(6,4); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_6번줄4연한파랑버튼); 
	 _6번줄5연한파랑버튼.setBounds(X좌표[6], Y좌표[6][5], 120, 60); _6번줄5연한파랑버튼.setVisible(false); _6번줄5연한파랑버튼.setBorderPainted(false); _6번줄5연한파랑버튼.setContentAreaFilled(false); _6번줄5연한파랑버튼.setFocusPainted(false); _6번줄5연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(6,5); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_6번줄5연한파랑버튼); 
	 _6번줄6연한파랑버튼.setBounds(X좌표[6], Y좌표[6][6], 120, 60); _6번줄6연한파랑버튼.setVisible(false); _6번줄6연한파랑버튼.setBorderPainted(false); _6번줄6연한파랑버튼.setContentAreaFilled(false); _6번줄6연한파랑버튼.setFocusPainted(false); _6번줄6연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(6,6); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_6번줄6연한파랑버튼); 
	 _6번줄7연한파랑버튼.setBounds(X좌표[6], Y좌표[6][7], 120, 60); _6번줄7연한파랑버튼.setVisible(false); _6번줄7연한파랑버튼.setBorderPainted(false); _6번줄7연한파랑버튼.setContentAreaFilled(false); _6번줄7연한파랑버튼.setFocusPainted(false); _6번줄7연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(6,7); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_6번줄7연한파랑버튼); 
	 _6번줄8연한파랑버튼.setBounds(X좌표[6], Y좌표[6][8], 120, 60); _6번줄8연한파랑버튼.setVisible(false); _6번줄8연한파랑버튼.setBorderPainted(false); _6번줄8연한파랑버튼.setContentAreaFilled(false); _6번줄8연한파랑버튼.setFocusPainted(false); _6번줄8연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(6,8); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_6번줄8연한파랑버튼);
	 _7번줄0연한파랑버튼.setBounds(X좌표[7], Y좌표[7][0], 120, 60); _7번줄0연한파랑버튼.setVisible(false); _7번줄0연한파랑버튼.setBorderPainted(false); _7번줄0연한파랑버튼.setContentAreaFilled(false); _7번줄0연한파랑버튼.setFocusPainted(false); _7번줄0연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(7,0); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_7번줄0연한파랑버튼); 
	 _7번줄1연한파랑버튼.setBounds(X좌표[7], Y좌표[7][1], 120, 60); _7번줄1연한파랑버튼.setVisible(false); _7번줄1연한파랑버튼.setBorderPainted(false); _7번줄1연한파랑버튼.setContentAreaFilled(false); _7번줄1연한파랑버튼.setFocusPainted(false); _7번줄1연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(7,1); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_7번줄1연한파랑버튼); 
	 _7번줄2연한파랑버튼.setBounds(X좌표[7], Y좌표[7][2], 120, 60); _7번줄2연한파랑버튼.setVisible(false); _7번줄2연한파랑버튼.setBorderPainted(false); _7번줄2연한파랑버튼.setContentAreaFilled(false); _7번줄2연한파랑버튼.setFocusPainted(false); _7번줄2연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(7,2); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_7번줄2연한파랑버튼); 
	 _7번줄3연한파랑버튼.setBounds(X좌표[7], Y좌표[7][3], 120, 60); _7번줄3연한파랑버튼.setVisible(false); _7번줄3연한파랑버튼.setBorderPainted(false); _7번줄3연한파랑버튼.setContentAreaFilled(false); _7번줄3연한파랑버튼.setFocusPainted(false); _7번줄3연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(7,3); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_7번줄3연한파랑버튼); 
	 _7번줄4연한파랑버튼.setBounds(X좌표[7], Y좌표[7][4], 120, 60); _7번줄4연한파랑버튼.setVisible(false); _7번줄4연한파랑버튼.setBorderPainted(false); _7번줄4연한파랑버튼.setContentAreaFilled(false); _7번줄4연한파랑버튼.setFocusPainted(false); _7번줄4연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(7,4); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_7번줄4연한파랑버튼); 
	 _7번줄5연한파랑버튼.setBounds(X좌표[7], Y좌표[7][5], 120, 60); _7번줄5연한파랑버튼.setVisible(false); _7번줄5연한파랑버튼.setBorderPainted(false); _7번줄5연한파랑버튼.setContentAreaFilled(false); _7번줄5연한파랑버튼.setFocusPainted(false); _7번줄5연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(7,5); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_7번줄5연한파랑버튼); 
	 _7번줄6연한파랑버튼.setBounds(X좌표[7], Y좌표[7][6], 120, 60); _7번줄6연한파랑버튼.setVisible(false); _7번줄6연한파랑버튼.setBorderPainted(false); _7번줄6연한파랑버튼.setContentAreaFilled(false); _7번줄6연한파랑버튼.setFocusPainted(false); _7번줄6연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(7,6); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_7번줄6연한파랑버튼); 
	 _7번줄7연한파랑버튼.setBounds(X좌표[7], Y좌표[7][7], 120, 60); _7번줄7연한파랑버튼.setVisible(false); _7번줄7연한파랑버튼.setBorderPainted(false); _7번줄7연한파랑버튼.setContentAreaFilled(false); _7번줄7연한파랑버튼.setFocusPainted(false); _7번줄7연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(7,7); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_7번줄7연한파랑버튼); 
	 _7번줄8연한파랑버튼.setBounds(X좌표[7], Y좌표[7][8], 120, 60); _7번줄8연한파랑버튼.setVisible(false); _7번줄8연한파랑버튼.setBorderPainted(false); _7번줄8연한파랑버튼.setContentAreaFilled(false); _7번줄8연한파랑버튼.setFocusPainted(false); _7번줄8연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(7,8); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_7번줄8연한파랑버튼);
	 _8번줄0연한파랑버튼.setBounds(X좌표[8], Y좌표[8][0], 120, 60); _8번줄0연한파랑버튼.setVisible(false); _8번줄0연한파랑버튼.setBorderPainted(false); _8번줄0연한파랑버튼.setContentAreaFilled(false); _8번줄0연한파랑버튼.setFocusPainted(false); _8번줄0연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(8,0); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_8번줄0연한파랑버튼); 
	 _8번줄1연한파랑버튼.setBounds(X좌표[8], Y좌표[8][1], 120, 60); _8번줄1연한파랑버튼.setVisible(false); _8번줄1연한파랑버튼.setBorderPainted(false); _8번줄1연한파랑버튼.setContentAreaFilled(false); _8번줄1연한파랑버튼.setFocusPainted(false); _8번줄1연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(8,1); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_8번줄1연한파랑버튼); 
	 _8번줄2연한파랑버튼.setBounds(X좌표[8], Y좌표[8][2], 120, 60); _8번줄2연한파랑버튼.setVisible(false); _8번줄2연한파랑버튼.setBorderPainted(false); _8번줄2연한파랑버튼.setContentAreaFilled(false); _8번줄2연한파랑버튼.setFocusPainted(false); _8번줄2연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(8,2); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_8번줄2연한파랑버튼); 
	 _8번줄3연한파랑버튼.setBounds(X좌표[8], Y좌표[8][3], 120, 60); _8번줄3연한파랑버튼.setVisible(false); _8번줄3연한파랑버튼.setBorderPainted(false); _8번줄3연한파랑버튼.setContentAreaFilled(false); _8번줄3연한파랑버튼.setFocusPainted(false); _8번줄3연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(8,3); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_8번줄3연한파랑버튼); 
	 _8번줄4연한파랑버튼.setBounds(X좌표[8], Y좌표[8][4], 120, 60); _8번줄4연한파랑버튼.setVisible(false); _8번줄4연한파랑버튼.setBorderPainted(false); _8번줄4연한파랑버튼.setContentAreaFilled(false); _8번줄4연한파랑버튼.setFocusPainted(false); _8번줄4연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(8,4); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_8번줄4연한파랑버튼); 
	 _8번줄5연한파랑버튼.setBounds(X좌표[8], Y좌표[8][5], 120, 60); _8번줄5연한파랑버튼.setVisible(false); _8번줄5연한파랑버튼.setBorderPainted(false); _8번줄5연한파랑버튼.setContentAreaFilled(false); _8번줄5연한파랑버튼.setFocusPainted(false); _8번줄5연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(8,5); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_8번줄5연한파랑버튼); 
	 _8번줄6연한파랑버튼.setBounds(X좌표[8], Y좌표[8][6], 120, 60); _8번줄6연한파랑버튼.setVisible(false); _8번줄6연한파랑버튼.setBorderPainted(false); _8번줄6연한파랑버튼.setContentAreaFilled(false); _8번줄6연한파랑버튼.setFocusPainted(false); _8번줄6연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(8,6); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_8번줄6연한파랑버튼); 
	 _8번줄7연한파랑버튼.setBounds(X좌표[8], Y좌표[8][7], 120, 60); _8번줄7연한파랑버튼.setVisible(false); _8번줄7연한파랑버튼.setBorderPainted(false); _8번줄7연한파랑버튼.setContentAreaFilled(false); _8번줄7연한파랑버튼.setFocusPainted(false); _8번줄7연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(8,7); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_8번줄7연한파랑버튼); 
	 _8번줄8연한파랑버튼.setBounds(X좌표[8], Y좌표[8][8], 120, 60); _8번줄8연한파랑버튼.setVisible(false); _8번줄8연한파랑버튼.setBorderPainted(false); _8번줄8연한파랑버튼.setContentAreaFilled(false); _8번줄8연한파랑버튼.setFocusPainted(false); _8번줄8연한파랑버튼.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { 점프(8,8); 가이드라인끔(); 현재차례=1;}});
	 getContentPane().add(_8번줄8연한파랑버튼);	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		 
	 getContentPane().add(빨강순서);
	 getContentPane().add(파랑순서); 
		다음버튼.setBounds(1099, 602, 100,50);//버튼 좌표 및 이미지크기 (X,Y,길이,높이)
		다음버튼.setBorderPainted(false);
		다음버튼.setContentAreaFilled(false);
		다음버튼.setFocusPainted(false);
		다음버튼.setVisible(false);
		다음버튼.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				다음버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
					++_x;
					if(_x==1){메뉴얼2();}
					else if(_x==2){메뉴얼3();}
					else if(_x==3){메뉴얼4();}
					else if(_x==4){메뉴얼5();}
				 	else if(_x==5){메뉴얼6();}
					else if(_x==6){_x=0; 메뉴얼끝();}
				}
		}); getContentPane().add(다음버튼);
		뒤로버튼.setBounds(999, 602, 100, 50);//버튼 좌표 및 이미지크기 (X,Y,길이,높이)
		뒤로버튼.setBorderPainted(false);
		뒤로버튼.setContentAreaFilled(false);
		뒤로버튼.setFocusPainted(false);
		뒤로버튼.setVisible(false);
		뒤로버튼.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				뒤로버튼.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				 --_x;
				 if(_x==-1){메뉴얼끝(); _x=0;}
				    else if(_x==0){메뉴얼();}
				 	else if(_x==1){메뉴얼2();}
				 	else if(_x==2){메뉴얼3();}
				 	else if(_x==3){메뉴얼4();}
				 	else if(_x==4){메뉴얼5();}
				 	else if(_x==5){메뉴얼6();}
				}
		}); getContentPane().add(뒤로버튼);
	  맵선택이미지.setIcon(new ImageIcon(G구이.class.getResource("/images/게임판 선택.png")));
	  맵선택이미지.setVisible(false);
	  맵선택이미지.setBounds(390, 10, 500, 150);
	  
	  버그.setIcon(new ImageIcon(G구이.class.getResource("/images/현재버그.png")));
	  버그.setBounds(-10, -10, 1280, 720);
	  버그.setVisible(false);   
	  듀토1.setIcon(new ImageIcon(G구이.class.getResource("/images/게임규칙.png")));
	  듀토1.setBounds(0, 0, 1280, 720);
	  듀토1.setVisible(false);   
	  듀토2.setIcon(new ImageIcon(G구이.class.getResource("/images/가이드라인.png")));
	  듀토2.setBounds(0, 0, 1280, 720);
	  듀토2.setVisible(false); 
	  듀토3.setIcon(new ImageIcon(G구이.class.getResource("/images/뺏는다.png")));
	  듀토3.setBounds(0, 0, 1280, 720);
	  듀토3.setVisible(false);   
	  승리1.setIcon(new ImageIcon(G구이.class.getResource("/images/파랑승리.png")));
	  승리1.setBounds(100, 10, 800,600);
	  승리1.setVisible(false); 
	  승리2.setIcon(new ImageIcon(G구이.class.getResource("/images/빨강승리.png")));
	  승리2.setBounds(150, 10, 836, 637);
	  승리2.setVisible(false); 
	 	  로고.setIcon(new ImageIcon(G구이.class.getResource("/images/타이틀로고.png")));
	 	  로고.setBounds(120, 80, 600, 300);
	 	  배경.setIcon(new ImageIcon(G구이.class.getResource("/images/큰게임판.png")));
		  배경.setBounds(-8, 10, 961, 691);//이미지가 안맞아서 좌표조정 건들지 말것
		  배경.setVisible(false);  
		  배경1.setIcon(new ImageIcon(G구이.class.getResource("/images/큰게임판2.png")));
		  배경1.setBounds(0, 0, 961, 691);
		  배경1.setVisible(false);
		  기본배경.setIcon(new ImageIcon(G구이.class.getResource("/images/그냥흰색.png")));
		  기본배경.setBounds(0, 0, 1280, 720);
		  getContentPane().add(버그); 
		  getContentPane().add(듀토1);
		  getContentPane().add(듀토2);
		  getContentPane().add(듀토3);
		  getContentPane().add(승리2);
		  getContentPane().add(승리1);
		  getContentPane().add(맵선택이미지);
		  getContentPane().add(로고);
		  getContentPane().add(배경);
		  getContentPane().add(배경1);
		  getContentPane().add(기본배경);
			try {
				Thread.sleep(100);//10ms만큼 대기하고 응답안하면 catch문으로 넘어감
				기본배경.setVisible(true);
				종료버튼.setVisible(true);
				시작버튼.setVisible(true);
				메뉴얼버튼.setVisible(true);
				로고.setVisible(true);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
//            public class G구이 extends JFrame 끝
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public void 메뉴얼(){
	시작버튼.setVisible(false);
	종료버튼.setVisible(false);
	메뉴얼버튼.setVisible(false);
	로고.setVisible(false);
	듀토2.setVisible(false);
	듀토1.setVisible(true);
	다음버튼.setVisible(true);
	뒤로버튼.setVisible(true);
}
public void 메뉴얼2(){
	듀토1.setVisible(false);
	듀토3.setVisible(false);
	듀토2.setVisible(true);
}
public void 메뉴얼3(){
	듀토2.setVisible(false);
	승리1.setVisible(false);
	승리2.setVisible(false);
	듀토3.setVisible(true);
}
public void 메뉴얼4(){
	듀토3.setVisible(false);
	승리2.setVisible(false);
	승리1.setVisible(true);
}
public void 메뉴얼5(){
	승리2.setVisible(true);
	버그.setVisible(false);
}
public void 메뉴얼6(){
	승리2.setVisible(false);
	승리1.setVisible(false);
	버그.setVisible(true);
}
public void 메뉴얼끝(){
	버그.setVisible(false);
	승리1.setVisible(false);
	승리2.setVisible(false);
	듀토1.setVisible(false);
	뒤로버튼.setVisible(false);
	다음버튼.setVisible(false);	
	종료버튼.setVisible(true);
	시작버튼.setVisible(true);
	메뉴얼버튼.setVisible(true);
	로고.setVisible(true);
}
	public void 메인화면으로() {
		//화면 넘어갈때마다 버튼들 숨기고 출력해야할 버튼들 보이게
		왼쪽맵버튼.setVisible(false); 오른쪽맵버튼.setVisible(false);
		메뉴로돌아가기버튼.setVisible(false);
		맵선택이미지.setVisible(false);
		종료버튼.setVisible(true);
		시작버튼.setVisible(true);
		메뉴얼버튼.setVisible(true);
		로고.setVisible(true);
	}
	public void 맵선택화면으로() {//게임 중 돌아가기 누르면 일로 옴
		맵번호 = 0;
		배경.setVisible(false);	배경1.setVisible(false);
		무승부버튼.setVisible(false); 빨강팀승리버튼.setVisible(false); 파랑팀승리버튼.setVisible(false);
		빨강순서.setVisible(false); 파랑순서.setVisible(false);
		모두비활성화();
		현재차례=0;
		빨강팀세균수=0; 파랑팀세균수=0;
		빨강카운트=0; 파랑카운트=0;
		빨강일숫자끔(); 빨강십숫자끔(); 파랑일숫자끔(); 파랑십숫자끔();
		맵선택이미지.setVisible(true);
		왼쪽맵버튼.setVisible(true); 오른쪽맵버튼.setVisible(true);
		메뉴로돌아가기버튼.setVisible(true);//메인화면으로
		돌아가기버튼.setVisible(false);
	}
	
	public void 맵선택화면() {//시작버튼에서 넘어옴
		시작버튼.setVisible(false);
		종료버튼.setVisible(false);
		메뉴얼버튼.setVisible(false);
		로고.setVisible(false);
		맵선택이미지.setVisible(true);
		왼쪽맵버튼.setVisible(true);
		오른쪽맵버튼.setVisible(true);
		메뉴로돌아가기버튼.setVisible(true);//메인화면으로
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	public void 맵시작() {
	if(맵번호==1) {게임판 = new int[][]{
				{7,7,0,0,0,0,0,7,7},{7,7,0,0,0,0,0,0,7},{7,0,0,0,0,0,0,0,7},{7,0,0,0,0,7,0,0,0}, //0,1,7,3
				{0,0,0,7,0,0,0,0,0},{7,0,0,0,0,7,0,0,0},{7,0,0,0,0,0,0,0,7},{7,7,0,0,0,0,0,0,7}, //4,5,6,7
				{7,7,0,0,0,0,0,7,7}};//8
		 } else {게임판 = new int[][]{
				{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0}, //0,1,2,3
				{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0}, //4,5,6,7
				{0,0,0,0,0,0,0,0,0} }; //8
	}
		게임시작();
	} // 0빈칸 | 1빨강 | 10약간연한빨강 | 11연한빨강 | 2파랑 | 20약간연한파랑 | 22연한파랑 | 7놓을수없는칸
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
	void 모두비활성화(){
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				버튼비활성화(i,j,1); 버튼비활성화(i,j,10); 버튼비활성화(i,j,11);
				버튼비활성화(i,j,2); 버튼비활성화(i,j,20); 버튼비활성화(i,j,22);
			}
		}
	}
	void 스코어숫자(){
		int n=0;
n = 빨강팀세균수/10;
switch(n){
case 0 : 빨강십숫자끔();빨강00.setVisible(true); break;
case 1 : 빨강십숫자끔();빨강10.setVisible(true); break; 
case 2 : 빨강십숫자끔();빨강20.setVisible(true); break;
case 3 : 빨강십숫자끔();빨강30.setVisible(true); break;
case 4 : 빨강십숫자끔();빨강40.setVisible(true); break;
case 5 : 빨강십숫자끔();빨강50.setVisible(true); break;
case 6 : 빨강십숫자끔();빨강60.setVisible(true); break;
case 7 : 빨강십숫자끔();빨강70.setVisible(true); break;
case 8 : 빨강십숫자끔();빨강80.setVisible(true); break;
case 9 : 빨강십숫자끔();빨강90.setVisible(true); break;
} n=0;
n = 빨강팀세균수%10;
switch(n){
case 0 : 빨강일숫자끔();빨강0.setVisible(true); break;
case 1 : 빨강일숫자끔();빨강1.setVisible(true); break;
case 2 : 빨강일숫자끔();빨강2.setVisible(true); break;
case 3 : 빨강일숫자끔();빨강3.setVisible(true); break;
case 4 : 빨강일숫자끔();빨강4.setVisible(true); break;
case 5 : 빨강일숫자끔();빨강5.setVisible(true); break;
case 6 : 빨강일숫자끔();빨강6.setVisible(true); break;
case 7 : 빨강일숫자끔();빨강7.setVisible(true); break;
case 8 : 빨강일숫자끔();빨강8.setVisible(true); break;
case 9 : 빨강일숫자끔();빨강9.setVisible(true); break;
} n=0;
n = 파랑팀세균수/10;
switch(n){
case 0 : 파랑십숫자끔();파랑00.setVisible(true); break;
case 1 : 파랑십숫자끔();파랑10.setVisible(true); break; 
case 2 : 파랑십숫자끔();파랑20.setVisible(true); break;
case 3 : 파랑십숫자끔();파랑30.setVisible(true); break;
case 4 : 파랑십숫자끔();파랑40.setVisible(true); break;
case 5 : 파랑십숫자끔();파랑50.setVisible(true); break;
case 6 : 파랑십숫자끔();파랑60.setVisible(true); break;
case 7 : 파랑십숫자끔();파랑70.setVisible(true); break;
case 8 : 파랑십숫자끔();파랑80.setVisible(true); break;
case 9 : 파랑십숫자끔();파랑90.setVisible(true); break;
} n=0;
n = 파랑팀세균수%10;
switch(n){
case 0 : 파랑일숫자끔();파랑0.setVisible(true); break;
case 1 : 파랑일숫자끔();파랑1.setVisible(true); break;
case 2 : 파랑일숫자끔();파랑2.setVisible(true); break;
case 3 : 파랑일숫자끔();파랑3.setVisible(true); break;
case 4 : 파랑일숫자끔();파랑4.setVisible(true); break;
case 5 : 파랑일숫자끔();파랑5.setVisible(true); break;
case 6 : 파랑일숫자끔();파랑6.setVisible(true); break;
case 7 : 파랑일숫자끔();파랑7.setVisible(true); break;
case 8 : 파랑일숫자끔();파랑8.setVisible(true); break;
case 9 : 파랑일숫자끔();파랑9.setVisible(true); break;
} n=0;
	}
void 빨강십숫자끔(){
빨강00.setVisible(false); 빨강10.setVisible(false); 빨강20.setVisible(false); 빨강30.setVisible(false); 빨강40.setVisible(false);
빨강50.setVisible(false); 빨강60.setVisible(false); 빨강70.setVisible(false); 빨강80.setVisible(false); 빨강90.setVisible(false);
}

void 빨강일숫자끔(){
빨강0.setVisible(false); 빨강1.setVisible(false); 빨강2.setVisible(false); 빨강3.setVisible(false); 빨강4.setVisible(false);
빨강5.setVisible(false); 빨강6.setVisible(false); 빨강7.setVisible(false); 빨강8.setVisible(false); 빨강9.setVisible(false);
}

void 파랑십숫자끔(){
파랑00.setVisible(false); 파랑10.setVisible(false); 파랑20.setVisible(false); 파랑30.setVisible(false); 파랑40.setVisible(false);
파랑50.setVisible(false); 파랑60.setVisible(false); 파랑70.setVisible(false); 파랑80.setVisible(false); 파랑90.setVisible(false);
}

void 파랑일숫자끔(){
파랑0.setVisible(false); 파랑1.setVisible(false); 파랑2.setVisible(false); 파랑3.setVisible(false); 파랑4.setVisible(false);
파랑5.setVisible(false); 파랑6.setVisible(false); 파랑7.setVisible(false); 파랑8.setVisible(false); 파랑9.setVisible(false);
}


	void 가이드라인끔(){//말을 움직였을 경우 가이드라인 전부 끔
		for(int i=0;i<9;i++){
		for(int j=0;j<9;j++){
			     if(게임판[i][j]==10){버튼비활성화(i,j,10); 게임판[i][j]=0;}
			else if(게임판[i][j]==11){버튼비활성화(i,j,11); 게임판[i][j]=0;}
			else if(게임판[i][j]==20){버튼비활성화(i,j,20); 게임판[i][j]=0;}
			else if(게임판[i][j]==22){버튼비활성화(i,j,22); 게임판[i][j]=0;}
		}
	}
}
	void 버튼비활성화(int x,int y,int 넘){
			if(넘==1){
		          if(x==0) {if(y==0){_0번줄0빨강버튼.setVisible(false);}  else if(y==1){_0번줄1빨강버튼.setVisible(false);}  else if(y==2){_0번줄2빨강버튼.setVisible(false);}  else if(y==3){_0번줄3빨강버튼.setVisible(false);}  else if(y==4){_0번줄4빨강버튼.setVisible(false);}  else if(y==5){_0번줄5빨강버튼.setVisible(false);} else if(y==6){_0번줄6빨강버튼.setVisible(false);}  else if(y==7){_0번줄7빨강버튼.setVisible(false);}  else if(y==8){_0번줄8빨강버튼.setVisible(false);}  
		        } if(x==1) {if(y==0){_1번줄0빨강버튼.setVisible(false);}  else if(y==1){_1번줄1빨강버튼.setVisible(false);}  else if(y==2){_1번줄2빨강버튼.setVisible(false);}  else if(y==3){_1번줄3빨강버튼.setVisible(false);}  else if(y==4){_1번줄4빨강버튼.setVisible(false);}  else if(y==5){_1번줄5빨강버튼.setVisible(false);} else if(y==6){_1번줄6빨강버튼.setVisible(false);}  else if(y==7){_1번줄7빨강버튼.setVisible(false);}  else if(y==8){_1번줄8빨강버튼.setVisible(false);} 
		        } if(x==2) {if(y==0){_2번줄0빨강버튼.setVisible(false);}  else if(y==1){_2번줄1빨강버튼.setVisible(false);}  else if(y==2){_2번줄2빨강버튼.setVisible(false);}  else if(y==3){_2번줄3빨강버튼.setVisible(false);}  else if(y==4){_2번줄4빨강버튼.setVisible(false);}  else if(y==5){_2번줄5빨강버튼.setVisible(false);} else if(y==6){_2번줄6빨강버튼.setVisible(false);}  else if(y==7){_2번줄7빨강버튼.setVisible(false);}  else if(y==8){_2번줄8빨강버튼.setVisible(false);} 
		        } if(x==3) {if(y==0){_3번줄0빨강버튼.setVisible(false);}  else if(y==1){_3번줄1빨강버튼.setVisible(false);}  else if(y==2){_3번줄2빨강버튼.setVisible(false);}  else if(y==3){_3번줄3빨강버튼.setVisible(false);}  else if(y==4){_3번줄4빨강버튼.setVisible(false);}  else if(y==5){_3번줄5빨강버튼.setVisible(false);} else if(y==6){_3번줄6빨강버튼.setVisible(false);}  else if(y==7){_3번줄7빨강버튼.setVisible(false);}  else if(y==8){_3번줄8빨강버튼.setVisible(false);} 
		        } if(x==4) {if(y==0){_4번줄0빨강버튼.setVisible(false);}  else if(y==1){_4번줄1빨강버튼.setVisible(false);}  else if(y==2){_4번줄2빨강버튼.setVisible(false);}  else if(y==3){_4번줄3빨강버튼.setVisible(false);}  else if(y==4){_4번줄4빨강버튼.setVisible(false);}  else if(y==5){_4번줄5빨강버튼.setVisible(false);} else if(y==6){_4번줄6빨강버튼.setVisible(false);}  else if(y==7){_4번줄7빨강버튼.setVisible(false);}  else if(y==8){_4번줄8빨강버튼.setVisible(false);} 
		        } if(x==5) {if(y==0){_5번줄0빨강버튼.setVisible(false);}  else if(y==1){_5번줄1빨강버튼.setVisible(false);}  else if(y==2){_5번줄2빨강버튼.setVisible(false);}  else if(y==3){_5번줄3빨강버튼.setVisible(false);}  else if(y==4){_5번줄4빨강버튼.setVisible(false);}  else if(y==5){_5번줄5빨강버튼.setVisible(false);} else if(y==6){_5번줄6빨강버튼.setVisible(false);}  else if(y==7){_5번줄7빨강버튼.setVisible(false);}  else if(y==8){_5번줄8빨강버튼.setVisible(false);} 
		        } if(x==6) {if(y==0){_6번줄0빨강버튼.setVisible(false);}  else if(y==1){_6번줄1빨강버튼.setVisible(false);}  else if(y==2){_6번줄2빨강버튼.setVisible(false);}  else if(y==3){_6번줄3빨강버튼.setVisible(false);}  else if(y==4){_6번줄4빨강버튼.setVisible(false);}  else if(y==5){_6번줄5빨강버튼.setVisible(false);} else if(y==6){_6번줄6빨강버튼.setVisible(false);}  else if(y==7){_6번줄7빨강버튼.setVisible(false);}  else if(y==8){_6번줄8빨강버튼.setVisible(false);} 
		        } if(x==7) {if(y==0){_7번줄0빨강버튼.setVisible(false);}  else if(y==1){_7번줄1빨강버튼.setVisible(false);}  else if(y==2){_7번줄2빨강버튼.setVisible(false);}  else if(y==3){_7번줄3빨강버튼.setVisible(false);}  else if(y==4){_7번줄4빨강버튼.setVisible(false);}  else if(y==5){_7번줄5빨강버튼.setVisible(false);} else if(y==6){_7번줄6빨강버튼.setVisible(false);}  else if(y==7){_7번줄7빨강버튼.setVisible(false);}  else if(y==8){_7번줄8빨강버튼.setVisible(false);} 
		        } if(x==8) {if(y==0){_8번줄0빨강버튼.setVisible(false);}  else if(y==1){_8번줄1빨강버튼.setVisible(false);}  else if(y==2){_8번줄2빨강버튼.setVisible(false);}  else if(y==3){_8번줄3빨강버튼.setVisible(false);}  else if(y==4){_8번줄4빨강버튼.setVisible(false);}  else if(y==5){_8번줄5빨강버튼.setVisible(false);} else if(y==6){_8번줄6빨강버튼.setVisible(false);}  else if(y==7){_8번줄7빨강버튼.setVisible(false);}  else if(y==8){_8번줄8빨강버튼.setVisible(false);} 
		       }}
			if(넘==10){
		      if(x==0) {if(y==0){_0번줄0약간연한빨강버튼.setVisible(false);} else if(y==1){_0번줄1약간연한빨강버튼.setVisible(false);} else if(y==2){_0번줄2약간연한빨강버튼.setVisible(false);} else if(y==3){_0번줄3약간연한빨강버튼.setVisible(false);} else if(y==4){_0번줄4약간연한빨강버튼.setVisible(false);} else if(y==5){_0번줄5약간연한빨강버튼.setVisible(false);}else if(y==6){_0번줄6약간연한빨강버튼.setVisible(false);} else if(y==7){_0번줄7약간연한빨강버튼.setVisible(false);} else if(y==8){_0번줄8약간연한빨강버튼.setVisible(false);}
			} if(x==1) {if(y==0){_1번줄0약간연한빨강버튼.setVisible(false);} else if(y==1){_1번줄1약간연한빨강버튼.setVisible(false);} else if(y==2){_1번줄2약간연한빨강버튼.setVisible(false);} else if(y==3){_1번줄3약간연한빨강버튼.setVisible(false);} else if(y==4){_1번줄4약간연한빨강버튼.setVisible(false);} else if(y==5){_1번줄5약간연한빨강버튼.setVisible(false);}else if(y==6){_1번줄6약간연한빨강버튼.setVisible(false);} else if(y==7){_1번줄7약간연한빨강버튼.setVisible(false);} else if(y==8){_1번줄8약간연한빨강버튼.setVisible(false);}
			} if(x==2) {if(y==0){_2번줄0약간연한빨강버튼.setVisible(false);} else if(y==1){_2번줄1약간연한빨강버튼.setVisible(false);} else if(y==2){_2번줄2약간연한빨강버튼.setVisible(false);} else if(y==3){_2번줄3약간연한빨강버튼.setVisible(false);} else if(y==4){_2번줄4약간연한빨강버튼.setVisible(false);} else if(y==5){_2번줄5약간연한빨강버튼.setVisible(false);}else if(y==6){_2번줄6약간연한빨강버튼.setVisible(false);} else if(y==7){_2번줄7약간연한빨강버튼.setVisible(false);} else if(y==8){_2번줄8약간연한빨강버튼.setVisible(false);}
			} if(x==3) {if(y==0){_3번줄0약간연한빨강버튼.setVisible(false);} else if(y==1){_3번줄1약간연한빨강버튼.setVisible(false);} else if(y==2){_3번줄2약간연한빨강버튼.setVisible(false);} else if(y==3){_3번줄3약간연한빨강버튼.setVisible(false);} else if(y==4){_3번줄4약간연한빨강버튼.setVisible(false);} else if(y==5){_3번줄5약간연한빨강버튼.setVisible(false);}else if(y==6){_3번줄6약간연한빨강버튼.setVisible(false);} else if(y==7){_3번줄7약간연한빨강버튼.setVisible(false);} else if(y==8){_3번줄8약간연한빨강버튼.setVisible(false);}
			} if(x==4) {if(y==0){_4번줄0약간연한빨강버튼.setVisible(false);} else if(y==1){_4번줄1약간연한빨강버튼.setVisible(false);} else if(y==2){_4번줄2약간연한빨강버튼.setVisible(false);} else if(y==3){_4번줄3약간연한빨강버튼.setVisible(false);} else if(y==4){_4번줄4약간연한빨강버튼.setVisible(false);} else if(y==5){_4번줄5약간연한빨강버튼.setVisible(false);}else if(y==6){_4번줄6약간연한빨강버튼.setVisible(false);} else if(y==7){_4번줄7약간연한빨강버튼.setVisible(false);} else if(y==8){_4번줄8약간연한빨강버튼.setVisible(false);}
			} if(x==5) {if(y==0){_5번줄0약간연한빨강버튼.setVisible(false);} else if(y==1){_5번줄1약간연한빨강버튼.setVisible(false);} else if(y==2){_5번줄2약간연한빨강버튼.setVisible(false);} else if(y==3){_5번줄3약간연한빨강버튼.setVisible(false);} else if(y==4){_5번줄4약간연한빨강버튼.setVisible(false);} else if(y==5){_5번줄5약간연한빨강버튼.setVisible(false);}else if(y==6){_5번줄6약간연한빨강버튼.setVisible(false);} else if(y==7){_5번줄7약간연한빨강버튼.setVisible(false);} else if(y==8){_5번줄8약간연한빨강버튼.setVisible(false);}
			} if(x==6) {if(y==0){_6번줄0약간연한빨강버튼.setVisible(false);} else if(y==1){_6번줄1약간연한빨강버튼.setVisible(false);} else if(y==2){_6번줄2약간연한빨강버튼.setVisible(false);} else if(y==3){_6번줄3약간연한빨강버튼.setVisible(false);} else if(y==4){_6번줄4약간연한빨강버튼.setVisible(false);} else if(y==5){_6번줄5약간연한빨강버튼.setVisible(false);}else if(y==6){_6번줄6약간연한빨강버튼.setVisible(false);} else if(y==7){_6번줄7약간연한빨강버튼.setVisible(false);} else if(y==8){_6번줄8약간연한빨강버튼.setVisible(false);}
		  	} if(x==7) {if(y==0){_7번줄0약간연한빨강버튼.setVisible(false);} else if(y==1){_7번줄1약간연한빨강버튼.setVisible(false);} else if(y==2){_7번줄2약간연한빨강버튼.setVisible(false);} else if(y==3){_7번줄3약간연한빨강버튼.setVisible(false);} else if(y==4){_7번줄4약간연한빨강버튼.setVisible(false);} else if(y==5){_7번줄5약간연한빨강버튼.setVisible(false);}else if(y==6){_7번줄6약간연한빨강버튼.setVisible(false);} else if(y==7){_7번줄7약간연한빨강버튼.setVisible(false);} else if(y==8){_7번줄8약간연한빨강버튼.setVisible(false);}
			} if(x==8) {if(y==0){_8번줄0약간연한빨강버튼.setVisible(false);} else if(y==1){_8번줄1약간연한빨강버튼.setVisible(false);} else if(y==2){_8번줄2약간연한빨강버튼.setVisible(false);} else if(y==3){_8번줄3약간연한빨강버튼.setVisible(false);} else if(y==4){_8번줄4약간연한빨강버튼.setVisible(false);} else if(y==5){_8번줄5약간연한빨강버튼.setVisible(false);}else if(y==6){_8번줄6약간연한빨강버튼.setVisible(false);} else if(y==7){_8번줄7약간연한빨강버튼.setVisible(false);} else if(y==8){_8번줄8약간연한빨강버튼.setVisible(false);}
			    }}
			if(넘==11){
			  if(x==0) {if(y==0){_0번줄0연한빨강버튼.setVisible(false);} else if(y==1){_0번줄1연한빨강버튼.setVisible(false);} else if(y==2){_0번줄2연한빨강버튼.setVisible(false);} else if(y==3){_0번줄3연한빨강버튼.setVisible(false);} else if(y==4){_0번줄4연한빨강버튼.setVisible(false);} else if(y==5){_0번줄5연한빨강버튼.setVisible(false);}else if(y==6){_0번줄6연한빨강버튼.setVisible(false);} else if(y==7){_0번줄7연한빨강버튼.setVisible(false);} else if(y==8){_0번줄8연한빨강버튼.setVisible(false);}
			} if(x==1) {if(y==0){_1번줄0연한빨강버튼.setVisible(false);} else if(y==1){_1번줄1연한빨강버튼.setVisible(false);} else if(y==2){_1번줄2연한빨강버튼.setVisible(false);} else if(y==3){_1번줄3연한빨강버튼.setVisible(false);} else if(y==4){_1번줄4연한빨강버튼.setVisible(false);} else if(y==5){_1번줄5연한빨강버튼.setVisible(false);}else if(y==6){_1번줄6연한빨강버튼.setVisible(false);} else if(y==7){_1번줄7연한빨강버튼.setVisible(false);} else if(y==8){_1번줄8연한빨강버튼.setVisible(false);}
			} if(x==2) {if(y==0){_2번줄0연한빨강버튼.setVisible(false);} else if(y==1){_2번줄1연한빨강버튼.setVisible(false);} else if(y==2){_2번줄2연한빨강버튼.setVisible(false);} else if(y==3){_2번줄3연한빨강버튼.setVisible(false);} else if(y==4){_2번줄4연한빨강버튼.setVisible(false);} else if(y==5){_2번줄5연한빨강버튼.setVisible(false);}else if(y==6){_2번줄6연한빨강버튼.setVisible(false);} else if(y==7){_2번줄7연한빨강버튼.setVisible(false);} else if(y==8){_2번줄8연한빨강버튼.setVisible(false);}
			} if(x==3) {if(y==0){_3번줄0연한빨강버튼.setVisible(false);} else if(y==1){_3번줄1연한빨강버튼.setVisible(false);} else if(y==2){_3번줄2연한빨강버튼.setVisible(false);} else if(y==3){_3번줄3연한빨강버튼.setVisible(false);} else if(y==4){_3번줄4연한빨강버튼.setVisible(false);} else if(y==5){_3번줄5연한빨강버튼.setVisible(false);}else if(y==6){_3번줄6연한빨강버튼.setVisible(false);} else if(y==7){_3번줄7연한빨강버튼.setVisible(false);} else if(y==8){_3번줄8연한빨강버튼.setVisible(false);}
			} if(x==4) {if(y==0){_4번줄0연한빨강버튼.setVisible(false);} else if(y==1){_4번줄1연한빨강버튼.setVisible(false);} else if(y==2){_4번줄2연한빨강버튼.setVisible(false);} else if(y==3){_4번줄3연한빨강버튼.setVisible(false);} else if(y==4){_4번줄4연한빨강버튼.setVisible(false);} else if(y==5){_4번줄5연한빨강버튼.setVisible(false);}else if(y==6){_4번줄6연한빨강버튼.setVisible(false);} else if(y==7){_4번줄7연한빨강버튼.setVisible(false);} else if(y==8){_4번줄8연한빨강버튼.setVisible(false);}
			} if(x==5) {if(y==0){_5번줄0연한빨강버튼.setVisible(false);} else if(y==1){_5번줄1연한빨강버튼.setVisible(false);} else if(y==2){_5번줄2연한빨강버튼.setVisible(false);} else if(y==3){_5번줄3연한빨강버튼.setVisible(false);} else if(y==4){_5번줄4연한빨강버튼.setVisible(false);} else if(y==5){_5번줄5연한빨강버튼.setVisible(false);}else if(y==6){_5번줄6연한빨강버튼.setVisible(false);} else if(y==7){_5번줄7연한빨강버튼.setVisible(false);} else if(y==8){_5번줄8연한빨강버튼.setVisible(false);}
			} if(x==6) {if(y==0){_6번줄0연한빨강버튼.setVisible(false);} else if(y==1){_6번줄1연한빨강버튼.setVisible(false);} else if(y==2){_6번줄2연한빨강버튼.setVisible(false);} else if(y==3){_6번줄3연한빨강버튼.setVisible(false);} else if(y==4){_6번줄4연한빨강버튼.setVisible(false);} else if(y==5){_6번줄5연한빨강버튼.setVisible(false);}else if(y==6){_6번줄6연한빨강버튼.setVisible(false);} else if(y==7){_6번줄7연한빨강버튼.setVisible(false);} else if(y==8){_6번줄8연한빨강버튼.setVisible(false);}
			} if(x==7) {if(y==0){_7번줄0연한빨강버튼.setVisible(false);} else if(y==1){_7번줄1연한빨강버튼.setVisible(false);} else if(y==2){_7번줄2연한빨강버튼.setVisible(false);} else if(y==3){_7번줄3연한빨강버튼.setVisible(false);} else if(y==4){_7번줄4연한빨강버튼.setVisible(false);} else if(y==5){_7번줄5연한빨강버튼.setVisible(false);}else if(y==6){_7번줄6연한빨강버튼.setVisible(false);} else if(y==7){_7번줄7연한빨강버튼.setVisible(false);} else if(y==8){_7번줄8연한빨강버튼.setVisible(false);}
			} if(x==8) {if(y==0){_8번줄0연한빨강버튼.setVisible(false);} else if(y==1){_8번줄1연한빨강버튼.setVisible(false);} else if(y==2){_8번줄2연한빨강버튼.setVisible(false);} else if(y==3){_8번줄3연한빨강버튼.setVisible(false);} else if(y==4){_8번줄4연한빨강버튼.setVisible(false);} else if(y==5){_8번줄5연한빨강버튼.setVisible(false);}else if(y==6){_8번줄6연한빨강버튼.setVisible(false);} else if(y==7){_8번줄7연한빨강버튼.setVisible(false);} else if(y==8){_8번줄8연한빨강버튼.setVisible(false);}
			    }}
		//파랑팀
			  if(넘==2){
			    if(x==0) {if(y==0){_0번줄0파랑버튼.setVisible(false);} else if(y==1){_0번줄1파랑버튼.setVisible(false);}  else if(y==2){_0번줄2파랑버튼.setVisible(false);}  else if(y==3){_0번줄3파랑버튼.setVisible(false);}  else if(y==4){_0번줄4파랑버튼.setVisible(false);}  else if(y==5){_0번줄5파랑버튼.setVisible(false);}  else if(y==6){_0번줄6파랑버튼.setVisible(false);}  else if(y==7){_0번줄7파랑버튼.setVisible(false);}  else if(y==8){_0번줄8파랑버튼.setVisible(false);}  
			  } if(x==1) {if(y==0){_1번줄0파랑버튼.setVisible(false);} else if(y==1){_1번줄1파랑버튼.setVisible(false);}  else if(y==2){_1번줄2파랑버튼.setVisible(false);}  else if(y==3){_1번줄3파랑버튼.setVisible(false);}  else if(y==4){_1번줄4파랑버튼.setVisible(false);}  else if(y==5){_1번줄5파랑버튼.setVisible(false);} else if(y==6){_1번줄6파랑버튼.setVisible(false);}  else if(y==7){_1번줄7파랑버튼.setVisible(false);}  else if(y==8){_1번줄8파랑버튼.setVisible(false);} 
		   	  } if(x==2) {if(y==0){_2번줄0파랑버튼.setVisible(false);} else if(y==1){_2번줄1파랑버튼.setVisible(false);}  else if(y==2){_2번줄2파랑버튼.setVisible(false);}  else if(y==3){_2번줄3파랑버튼.setVisible(false);}  else if(y==4){_2번줄4파랑버튼.setVisible(false);}  else if(y==5){_2번줄5파랑버튼.setVisible(false);} else if(y==6){_2번줄6파랑버튼.setVisible(false);}  else if(y==7){_2번줄7파랑버튼.setVisible(false);}  else if(y==8){_2번줄8파랑버튼.setVisible(false);} 
			  } if(x==3) {if(y==0){_3번줄0파랑버튼.setVisible(false);} else if(y==1){_3번줄1파랑버튼.setVisible(false);}  else if(y==2){_3번줄2파랑버튼.setVisible(false);}  else if(y==3){_3번줄3파랑버튼.setVisible(false);}  else if(y==4){_3번줄4파랑버튼.setVisible(false);}  else if(y==5){_3번줄5파랑버튼.setVisible(false);} else if(y==6){_3번줄6파랑버튼.setVisible(false);}  else if(y==7){_3번줄7파랑버튼.setVisible(false);}  else if(y==8){_3번줄8파랑버튼.setVisible(false);} 
			  } if(x==4) {if(y==0){_4번줄0파랑버튼.setVisible(false);} else if(y==1){_4번줄1파랑버튼.setVisible(false);}  else if(y==2){_4번줄2파랑버튼.setVisible(false);}  else if(y==3){_4번줄3파랑버튼.setVisible(false);}  else if(y==4){_4번줄4파랑버튼.setVisible(false);}  else if(y==5){_4번줄5파랑버튼.setVisible(false);} else if(y==6){_4번줄6파랑버튼.setVisible(false);}  else if(y==7){_4번줄7파랑버튼.setVisible(false);}  else if(y==8){_4번줄8파랑버튼.setVisible(false);} 
			  } if(x==5) {if(y==0){_5번줄0파랑버튼.setVisible(false);} else if(y==1){_5번줄1파랑버튼.setVisible(false);}  else if(y==2){_5번줄2파랑버튼.setVisible(false);}  else if(y==3){_5번줄3파랑버튼.setVisible(false);}  else if(y==4){_5번줄4파랑버튼.setVisible(false);}  else if(y==5){_5번줄5파랑버튼.setVisible(false);} else if(y==6){_5번줄6파랑버튼.setVisible(false);}  else if(y==7){_5번줄7파랑버튼.setVisible(false);}  else if(y==8){_5번줄8파랑버튼.setVisible(false);} 
			  } if(x==6) {if(y==0){_6번줄0파랑버튼.setVisible(false);} else if(y==1){_6번줄1파랑버튼.setVisible(false);}  else if(y==2){_6번줄2파랑버튼.setVisible(false);}  else if(y==3){_6번줄3파랑버튼.setVisible(false);}  else if(y==4){_6번줄4파랑버튼.setVisible(false);}  else if(y==5){_6번줄5파랑버튼.setVisible(false);} else if(y==6){_6번줄6파랑버튼.setVisible(false);}  else if(y==7){_6번줄7파랑버튼.setVisible(false);}  else if(y==8){_6번줄8파랑버튼.setVisible(false);} 
			  } if(x==7) {if(y==0){_7번줄0파랑버튼.setVisible(false);} else if(y==1){_7번줄1파랑버튼.setVisible(false);}  else if(y==2){_7번줄2파랑버튼.setVisible(false);}  else if(y==3){_7번줄3파랑버튼.setVisible(false);}  else if(y==4){_7번줄4파랑버튼.setVisible(false);}  else if(y==5){_7번줄5파랑버튼.setVisible(false);} else if(y==6){_7번줄6파랑버튼.setVisible(false);}  else if(y==7){_7번줄7파랑버튼.setVisible(false);}  else if(y==8){_7번줄8파랑버튼.setVisible(false);} 
			  } if(x==8) {if(y==0){_8번줄0파랑버튼.setVisible(false);} else if(y==1){_8번줄1파랑버튼.setVisible(false);}  else if(y==2){_8번줄2파랑버튼.setVisible(false);}  else if(y==3){_8번줄3파랑버튼.setVisible(false);}  else if(y==4){_8번줄4파랑버튼.setVisible(false);}  else if(y==5){_8번줄5파랑버튼.setVisible(false);} else if(y==6){_8번줄6파랑버튼.setVisible(false);}  else if(y==7){_8번줄7파랑버튼.setVisible(false);}  else if(y==8){_8번줄8파랑버튼.setVisible(false);} 
			     }}
			if(넘==20){
			  if(x==0) {if(y==0){_0번줄0약간연한파랑버튼.setVisible(false);} else if(y==1){_0번줄1약간연한파랑버튼.setVisible(false);} else if(y==2){_0번줄2약간연한파랑버튼.setVisible(false);} else if(y==3){_0번줄3약간연한파랑버튼.setVisible(false);} else if(y==4){_0번줄4약간연한파랑버튼.setVisible(false);} else if(y==5){_0번줄5약간연한파랑버튼.setVisible(false);}else if(y==6){_0번줄6약간연한파랑버튼.setVisible(false);} else if(y==7){_0번줄7약간연한파랑버튼.setVisible(false);} else if(y==8){_0번줄8약간연한파랑버튼.setVisible(false);}
			} if(x==1) {if(y==0){_1번줄0약간연한파랑버튼.setVisible(false);} else if(y==1){_1번줄1약간연한파랑버튼.setVisible(false);} else if(y==2){_1번줄2약간연한파랑버튼.setVisible(false);} else if(y==3){_1번줄3약간연한파랑버튼.setVisible(false);} else if(y==4){_1번줄4약간연한파랑버튼.setVisible(false);} else if(y==5){_1번줄5약간연한파랑버튼.setVisible(false);}else if(y==6){_1번줄6약간연한파랑버튼.setVisible(false);} else if(y==7){_1번줄7약간연한파랑버튼.setVisible(false);} else if(y==8){_1번줄8약간연한파랑버튼.setVisible(false);}
			} if(x==2) {if(y==0){_2번줄0약간연한파랑버튼.setVisible(false);} else if(y==1){_2번줄1약간연한파랑버튼.setVisible(false);} else if(y==2){_2번줄2약간연한파랑버튼.setVisible(false);} else if(y==3){_2번줄3약간연한파랑버튼.setVisible(false);} else if(y==4){_2번줄4약간연한파랑버튼.setVisible(false);} else if(y==5){_2번줄5약간연한파랑버튼.setVisible(false);}else if(y==6){_2번줄6약간연한파랑버튼.setVisible(false);} else if(y==7){_2번줄7약간연한파랑버튼.setVisible(false);} else if(y==8){_2번줄8약간연한파랑버튼.setVisible(false);}
			} if(x==3) {if(y==0){_3번줄0약간연한파랑버튼.setVisible(false);} else if(y==1){_3번줄1약간연한파랑버튼.setVisible(false);} else if(y==2){_3번줄2약간연한파랑버튼.setVisible(false);} else if(y==3){_3번줄3약간연한파랑버튼.setVisible(false);} else if(y==4){_3번줄4약간연한파랑버튼.setVisible(false);} else if(y==5){_3번줄5약간연한파랑버튼.setVisible(false);}else if(y==6){_3번줄6약간연한파랑버튼.setVisible(false);} else if(y==7){_3번줄7약간연한파랑버튼.setVisible(false);} else if(y==8){_3번줄8약간연한파랑버튼.setVisible(false);}
			} if(x==4) {if(y==0){_4번줄0약간연한파랑버튼.setVisible(false);} else if(y==1){_4번줄1약간연한파랑버튼.setVisible(false);} else if(y==2){_4번줄2약간연한파랑버튼.setVisible(false);} else if(y==3){_4번줄3약간연한파랑버튼.setVisible(false);} else if(y==4){_4번줄4약간연한파랑버튼.setVisible(false);} else if(y==5){_4번줄5약간연한파랑버튼.setVisible(false);}else if(y==6){_4번줄6약간연한파랑버튼.setVisible(false);} else if(y==7){_4번줄7약간연한파랑버튼.setVisible(false);} else if(y==8){_4번줄8약간연한파랑버튼.setVisible(false);}
			} if(x==5) {if(y==0){_5번줄0약간연한파랑버튼.setVisible(false);} else if(y==1){_5번줄1약간연한파랑버튼.setVisible(false);} else if(y==2){_5번줄2약간연한파랑버튼.setVisible(false);} else if(y==3){_5번줄3약간연한파랑버튼.setVisible(false);} else if(y==4){_5번줄4약간연한파랑버튼.setVisible(false);} else if(y==5){_5번줄5약간연한파랑버튼.setVisible(false);}else if(y==6){_5번줄6약간연한파랑버튼.setVisible(false);} else if(y==7){_5번줄7약간연한파랑버튼.setVisible(false);} else if(y==8){_5번줄8약간연한파랑버튼.setVisible(false);}
			} if(x==6) {if(y==0){_6번줄0약간연한파랑버튼.setVisible(false);} else if(y==1){_6번줄1약간연한파랑버튼.setVisible(false);} else if(y==2){_6번줄2약간연한파랑버튼.setVisible(false);} else if(y==3){_6번줄3약간연한파랑버튼.setVisible(false);} else if(y==4){_6번줄4약간연한파랑버튼.setVisible(false);} else if(y==5){_6번줄5약간연한파랑버튼.setVisible(false);}else if(y==6){_6번줄6약간연한파랑버튼.setVisible(false);} else if(y==7){_6번줄7약간연한파랑버튼.setVisible(false);} else if(y==8){_6번줄8약간연한파랑버튼.setVisible(false);}
			} if(x==7) {if(y==0){_7번줄0약간연한파랑버튼.setVisible(false);} else if(y==1){_7번줄1약간연한파랑버튼.setVisible(false);} else if(y==2){_7번줄2약간연한파랑버튼.setVisible(false);} else if(y==3){_7번줄3약간연한파랑버튼.setVisible(false);} else if(y==4){_7번줄4약간연한파랑버튼.setVisible(false);} else if(y==5){_7번줄5약간연한파랑버튼.setVisible(false);}else if(y==6){_7번줄6약간연한파랑버튼.setVisible(false);} else if(y==7){_7번줄7약간연한파랑버튼.setVisible(false);} else if(y==8){_7번줄8약간연한파랑버튼.setVisible(false);}
			} if(x==8) {if(y==0){_8번줄0약간연한파랑버튼.setVisible(false);} else if(y==1){_8번줄1약간연한파랑버튼.setVisible(false);} else if(y==2){_8번줄2약간연한파랑버튼.setVisible(false);} else if(y==3){_8번줄3약간연한파랑버튼.setVisible(false);} else if(y==4){_8번줄4약간연한파랑버튼.setVisible(false);} else if(y==5){_8번줄5약간연한파랑버튼.setVisible(false);}else if(y==6){_8번줄6약간연한파랑버튼.setVisible(false);} else if(y==7){_8번줄7약간연한파랑버튼.setVisible(false);} else if(y==8){_8번줄8약간연한파랑버튼.setVisible(false);}
			}}
			if(넘==22){
			  if(x==0) {if(y==0){_0번줄0연한파랑버튼.setVisible(false);} else if(y==1){_0번줄1연한파랑버튼.setVisible(false);} else if(y==2){_0번줄2연한파랑버튼.setVisible(false);} else if(y==3){_0번줄3연한파랑버튼.setVisible(false);} else if(y==4){_0번줄4연한파랑버튼.setVisible(false);} else if(y==5){_0번줄5연한파랑버튼.setVisible(false);}else if(y==6){_0번줄6연한파랑버튼.setVisible(false);} else if(y==7){_0번줄7연한파랑버튼.setVisible(false);} else if(y==8){_0번줄8연한파랑버튼.setVisible(false);}
			} if(x==1) {if(y==0){_1번줄0연한파랑버튼.setVisible(false);} else if(y==1){_1번줄1연한파랑버튼.setVisible(false);} else if(y==2){_1번줄2연한파랑버튼.setVisible(false);} else if(y==3){_1번줄3연한파랑버튼.setVisible(false);} else if(y==4){_1번줄4연한파랑버튼.setVisible(false);} else if(y==5){_1번줄5연한파랑버튼.setVisible(false);}else if(y==6){_1번줄6연한파랑버튼.setVisible(false);} else if(y==7){_1번줄7연한파랑버튼.setVisible(false);} else if(y==8){_1번줄8연한파랑버튼.setVisible(false);}
			} if(x==2) {if(y==0){_2번줄0연한파랑버튼.setVisible(false);} else if(y==1){_2번줄1연한파랑버튼.setVisible(false);} else if(y==2){_2번줄2연한파랑버튼.setVisible(false);} else if(y==3){_2번줄3연한파랑버튼.setVisible(false);} else if(y==4){_2번줄4연한파랑버튼.setVisible(false);} else if(y==5){_2번줄5연한파랑버튼.setVisible(false);}else if(y==6){_2번줄6연한파랑버튼.setVisible(false);} else if(y==7){_2번줄7연한파랑버튼.setVisible(false);} else if(y==8){_2번줄8연한파랑버튼.setVisible(false);}
			} if(x==3) {if(y==0){_3번줄0연한파랑버튼.setVisible(false);} else if(y==1){_3번줄1연한파랑버튼.setVisible(false);} else if(y==2){_3번줄2연한파랑버튼.setVisible(false);} else if(y==3){_3번줄3연한파랑버튼.setVisible(false);} else if(y==4){_3번줄4연한파랑버튼.setVisible(false);} else if(y==5){_3번줄5연한파랑버튼.setVisible(false);}else if(y==6){_3번줄6연한파랑버튼.setVisible(false);} else if(y==7){_3번줄7연한파랑버튼.setVisible(false);} else if(y==8){_3번줄8연한파랑버튼.setVisible(false);}
			} if(x==4) {if(y==0){_4번줄0연한파랑버튼.setVisible(false);} else if(y==1){_4번줄1연한파랑버튼.setVisible(false);} else if(y==2){_4번줄2연한파랑버튼.setVisible(false);} else if(y==3){_4번줄3연한파랑버튼.setVisible(false);} else if(y==4){_4번줄4연한파랑버튼.setVisible(false);} else if(y==5){_4번줄5연한파랑버튼.setVisible(false);}else if(y==6){_4번줄6연한파랑버튼.setVisible(false);} else if(y==7){_4번줄7연한파랑버튼.setVisible(false);} else if(y==8){_4번줄8연한파랑버튼.setVisible(false);}
			} if(x==5) {if(y==0){_5번줄0연한파랑버튼.setVisible(false);} else if(y==1){_5번줄1연한파랑버튼.setVisible(false);} else if(y==2){_5번줄2연한파랑버튼.setVisible(false);} else if(y==3){_5번줄3연한파랑버튼.setVisible(false);} else if(y==4){_5번줄4연한파랑버튼.setVisible(false);} else if(y==5){_5번줄5연한파랑버튼.setVisible(false);}else if(y==6){_5번줄6연한파랑버튼.setVisible(false);} else if(y==7){_5번줄7연한파랑버튼.setVisible(false);} else if(y==8){_5번줄8연한파랑버튼.setVisible(false);}
			} if(x==6) {if(y==0){_6번줄0연한파랑버튼.setVisible(false);} else if(y==1){_6번줄1연한파랑버튼.setVisible(false);} else if(y==2){_6번줄2연한파랑버튼.setVisible(false);} else if(y==3){_6번줄3연한파랑버튼.setVisible(false);} else if(y==4){_6번줄4연한파랑버튼.setVisible(false);} else if(y==5){_6번줄5연한파랑버튼.setVisible(false);}else if(y==6){_6번줄6연한파랑버튼.setVisible(false);} else if(y==7){_6번줄7연한파랑버튼.setVisible(false);} else if(y==8){_6번줄8연한파랑버튼.setVisible(false);}
			} if(x==7) {if(y==0){_7번줄0연한파랑버튼.setVisible(false);} else if(y==1){_7번줄1연한파랑버튼.setVisible(false);} else if(y==2){_7번줄2연한파랑버튼.setVisible(false);} else if(y==3){_7번줄3연한파랑버튼.setVisible(false);} else if(y==4){_7번줄4연한파랑버튼.setVisible(false);} else if(y==5){_7번줄5연한파랑버튼.setVisible(false);}else if(y==6){_7번줄6연한파랑버튼.setVisible(false);} else if(y==7){_7번줄7연한파랑버튼.setVisible(false);} else if(y==8){_7번줄8연한파랑버튼.setVisible(false);}
			} if(x==8) {if(y==0){_8번줄0연한파랑버튼.setVisible(false);} else if(y==1){_8번줄1연한파랑버튼.setVisible(false);} else if(y==2){_8번줄2연한파랑버튼.setVisible(false);} else if(y==3){_8번줄3연한파랑버튼.setVisible(false);} else if(y==4){_8번줄4연한파랑버튼.setVisible(false);} else if(y==5){_8번줄5연한파랑버튼.setVisible(false);}else if(y==6){_8번줄6연한파랑버튼.setVisible(false);} else if(y==7){_8번줄7연한파랑버튼.setVisible(false);} else if(y==8){_8번줄8연한파랑버튼.setVisible(false);}
			}}
		}
	void 버튼활성화(int x, int y,int 넘){//모든 말들에 게임판과 대응시킴
		//빨강팀
		if(넘==1){
	          if(x==0) {if(y==0){_0번줄0빨강버튼.setVisible(true);}  else if(y==1){_0번줄1빨강버튼.setVisible(true);}  else if(y==2){_0번줄2빨강버튼.setVisible(true);}  else if(y==3){_0번줄3빨강버튼.setVisible(true);}  else if(y==4){_0번줄4빨강버튼.setVisible(true);}  else if(y==5){_0번줄5빨강버튼.setVisible(true);} else if(y==6){_0번줄6빨강버튼.setVisible(true);}  else if(y==7){_0번줄7빨강버튼.setVisible(true);}  else if(y==8){_0번줄8빨강버튼.setVisible(true);}  
	        } if(x==1) {if(y==0){_1번줄0빨강버튼.setVisible(true);}  else if(y==1){_1번줄1빨강버튼.setVisible(true);}  else if(y==2){_1번줄2빨강버튼.setVisible(true);}  else if(y==3){_1번줄3빨강버튼.setVisible(true);}  else if(y==4){_1번줄4빨강버튼.setVisible(true);}  else if(y==5){_1번줄5빨강버튼.setVisible(true);} else if(y==6){_1번줄6빨강버튼.setVisible(true);}  else if(y==7){_1번줄7빨강버튼.setVisible(true);}  else if(y==8){_1번줄8빨강버튼.setVisible(true);} 
	        } if(x==2) {if(y==0){_2번줄0빨강버튼.setVisible(true);}  else if(y==1){_2번줄1빨강버튼.setVisible(true);}  else if(y==2){_2번줄2빨강버튼.setVisible(true);}  else if(y==3){_2번줄3빨강버튼.setVisible(true);}  else if(y==4){_2번줄4빨강버튼.setVisible(true);}  else if(y==5){_2번줄5빨강버튼.setVisible(true);} else if(y==6){_2번줄6빨강버튼.setVisible(true);}  else if(y==7){_2번줄7빨강버튼.setVisible(true);}  else if(y==8){_2번줄8빨강버튼.setVisible(true);} 
	        } if(x==3) {if(y==0){_3번줄0빨강버튼.setVisible(true);}  else if(y==1){_3번줄1빨강버튼.setVisible(true);}  else if(y==2){_3번줄2빨강버튼.setVisible(true);}  else if(y==3){_3번줄3빨강버튼.setVisible(true);}  else if(y==4){_3번줄4빨강버튼.setVisible(true);}  else if(y==5){_3번줄5빨강버튼.setVisible(true);} else if(y==6){_3번줄6빨강버튼.setVisible(true);}  else if(y==7){_3번줄7빨강버튼.setVisible(true);}  else if(y==8){_3번줄8빨강버튼.setVisible(true);} 
	        } if(x==4) {if(y==0){_4번줄0빨강버튼.setVisible(true);}  else if(y==1){_4번줄1빨강버튼.setVisible(true);}  else if(y==2){_4번줄2빨강버튼.setVisible(true);}  else if(y==3){_4번줄3빨강버튼.setVisible(true);}  else if(y==4){_4번줄4빨강버튼.setVisible(true);}  else if(y==5){_4번줄5빨강버튼.setVisible(true);} else if(y==6){_4번줄6빨강버튼.setVisible(true);}  else if(y==7){_4번줄7빨강버튼.setVisible(true);}  else if(y==8){_4번줄8빨강버튼.setVisible(true);} 
	        } if(x==5) {if(y==0){_5번줄0빨강버튼.setVisible(true);}  else if(y==1){_5번줄1빨강버튼.setVisible(true);}  else if(y==2){_5번줄2빨강버튼.setVisible(true);}  else if(y==3){_5번줄3빨강버튼.setVisible(true);}  else if(y==4){_5번줄4빨강버튼.setVisible(true);}  else if(y==5){_5번줄5빨강버튼.setVisible(true);} else if(y==6){_5번줄6빨강버튼.setVisible(true);}  else if(y==7){_5번줄7빨강버튼.setVisible(true);}  else if(y==8){_5번줄8빨강버튼.setVisible(true);} 
	        } if(x==6) {if(y==0){_6번줄0빨강버튼.setVisible(true);}  else if(y==1){_6번줄1빨강버튼.setVisible(true);}  else if(y==2){_6번줄2빨강버튼.setVisible(true);}  else if(y==3){_6번줄3빨강버튼.setVisible(true);}  else if(y==4){_6번줄4빨강버튼.setVisible(true);}  else if(y==5){_6번줄5빨강버튼.setVisible(true);} else if(y==6){_6번줄6빨강버튼.setVisible(true);}  else if(y==7){_6번줄7빨강버튼.setVisible(true);}  else if(y==8){_6번줄8빨강버튼.setVisible(true);} 
	        } if(x==7) {if(y==0){_7번줄0빨강버튼.setVisible(true);}  else if(y==1){_7번줄1빨강버튼.setVisible(true);}  else if(y==2){_7번줄2빨강버튼.setVisible(true);}  else if(y==3){_7번줄3빨강버튼.setVisible(true);}  else if(y==4){_7번줄4빨강버튼.setVisible(true);}  else if(y==5){_7번줄5빨강버튼.setVisible(true);} else if(y==6){_7번줄6빨강버튼.setVisible(true);}  else if(y==7){_7번줄7빨강버튼.setVisible(true);}  else if(y==8){_7번줄8빨강버튼.setVisible(true);} 
	        } if(x==8) {if(y==0){_8번줄0빨강버튼.setVisible(true);}  else if(y==1){_8번줄1빨강버튼.setVisible(true);}  else if(y==2){_8번줄2빨강버튼.setVisible(true);}  else if(y==3){_8번줄3빨강버튼.setVisible(true);}  else if(y==4){_8번줄4빨강버튼.setVisible(true);}  else if(y==5){_8번줄5빨강버튼.setVisible(true);} else if(y==6){_8번줄6빨강버튼.setVisible(true);}  else if(y==7){_8번줄7빨강버튼.setVisible(true);}  else if(y==8){_8번줄8빨강버튼.setVisible(true);} 
	       }}
		if(넘==10){
	      if(x==0) {if(y==0){_0번줄0약간연한빨강버튼.setVisible(true);} else if(y==1){_0번줄1약간연한빨강버튼.setVisible(true);} else if(y==2){_0번줄2약간연한빨강버튼.setVisible(true);} else if(y==3){_0번줄3약간연한빨강버튼.setVisible(true);} else if(y==4){_0번줄4약간연한빨강버튼.setVisible(true);} else if(y==5){_0번줄5약간연한빨강버튼.setVisible(true);}else if(y==6){_0번줄6약간연한빨강버튼.setVisible(true);} else if(y==7){_0번줄7약간연한빨강버튼.setVisible(true);} else if(y==8){_0번줄8약간연한빨강버튼.setVisible(true);}
		} if(x==1) {if(y==0){_1번줄0약간연한빨강버튼.setVisible(true);} else if(y==1){_1번줄1약간연한빨강버튼.setVisible(true);} else if(y==2){_1번줄2약간연한빨강버튼.setVisible(true);} else if(y==3){_1번줄3약간연한빨강버튼.setVisible(true);} else if(y==4){_1번줄4약간연한빨강버튼.setVisible(true);} else if(y==5){_1번줄5약간연한빨강버튼.setVisible(true);}else if(y==6){_1번줄6약간연한빨강버튼.setVisible(true);} else if(y==7){_1번줄7약간연한빨강버튼.setVisible(true);} else if(y==8){_1번줄8약간연한빨강버튼.setVisible(true);}
		} if(x==2) {if(y==0){_2번줄0약간연한빨강버튼.setVisible(true);
		} else if(y==1){_2번줄1약간연한빨강버튼.setVisible(true);} else if(y==2){_2번줄2약간연한빨강버튼.setVisible(true);} else if(y==3){_2번줄3약간연한빨강버튼.setVisible(true);} else if(y==4){_2번줄4약간연한빨강버튼.setVisible(true);} else if(y==5){_2번줄5약간연한빨강버튼.setVisible(true);}else if(y==6){_2번줄6약간연한빨강버튼.setVisible(true);} else if(y==7){_2번줄7약간연한빨강버튼.setVisible(true);} else if(y==8){_2번줄8약간연한빨강버튼.setVisible(true);}
		} if(x==3) {if(y==0){_3번줄0약간연한빨강버튼.setVisible(true);} else if(y==1){_3번줄1약간연한빨강버튼.setVisible(true);} else if(y==2){_3번줄2약간연한빨강버튼.setVisible(true);} else if(y==3){_3번줄3약간연한빨강버튼.setVisible(true);} else if(y==4){_3번줄4약간연한빨강버튼.setVisible(true);} else if(y==5){_3번줄5약간연한빨강버튼.setVisible(true);}else if(y==6){_3번줄6약간연한빨강버튼.setVisible(true);} else if(y==7){_3번줄7약간연한빨강버튼.setVisible(true);} else if(y==8){_3번줄8약간연한빨강버튼.setVisible(true);}
		} if(x==4) {if(y==0){_4번줄0약간연한빨강버튼.setVisible(true);} else if(y==1){_4번줄1약간연한빨강버튼.setVisible(true);} else if(y==2){_4번줄2약간연한빨강버튼.setVisible(true);} else if(y==3){_4번줄3약간연한빨강버튼.setVisible(true);} else if(y==4){_4번줄4약간연한빨강버튼.setVisible(true);} else if(y==5){_4번줄5약간연한빨강버튼.setVisible(true);}else if(y==6){_4번줄6약간연한빨강버튼.setVisible(true);} else if(y==7){_4번줄7약간연한빨강버튼.setVisible(true);} else if(y==8){_4번줄8약간연한빨강버튼.setVisible(true);}
		} if(x==5) {if(y==0){_5번줄0약간연한빨강버튼.setVisible(true);} else if(y==1){_5번줄1약간연한빨강버튼.setVisible(true);} else if(y==2){_5번줄2약간연한빨강버튼.setVisible(true);} else if(y==3){_5번줄3약간연한빨강버튼.setVisible(true);} else if(y==4){_5번줄4약간연한빨강버튼.setVisible(true);} else if(y==5){_5번줄5약간연한빨강버튼.setVisible(true);}else if(y==6){_5번줄6약간연한빨강버튼.setVisible(true);} else if(y==7){_5번줄7약간연한빨강버튼.setVisible(true);} else if(y==8){_5번줄8약간연한빨강버튼.setVisible(true);}
		} if(x==6) {if(y==0){_6번줄0약간연한빨강버튼.setVisible(true);} else if(y==1){_6번줄1약간연한빨강버튼.setVisible(true);} else if(y==2){_6번줄2약간연한빨강버튼.setVisible(true);} else if(y==3){_6번줄3약간연한빨강버튼.setVisible(true);} else if(y==4){_6번줄4약간연한빨강버튼.setVisible(true);} else if(y==5){_6번줄5약간연한빨강버튼.setVisible(true);}else if(y==6){_6번줄6약간연한빨강버튼.setVisible(true);} else if(y==7){_6번줄7약간연한빨강버튼.setVisible(true);} else if(y==8){_6번줄8약간연한빨강버튼.setVisible(true);}
	  	} if(x==7) {if(y==0){_7번줄0약간연한빨강버튼.setVisible(true);} else if(y==1){_7번줄1약간연한빨강버튼.setVisible(true);} else if(y==2){_7번줄2약간연한빨강버튼.setVisible(true);} else if(y==3){_7번줄3약간연한빨강버튼.setVisible(true);} else if(y==4){_7번줄4약간연한빨강버튼.setVisible(true);} else if(y==5){_7번줄5약간연한빨강버튼.setVisible(true);}else if(y==6){_7번줄6약간연한빨강버튼.setVisible(true);} else if(y==7){_7번줄7약간연한빨강버튼.setVisible(true);} else if(y==8){_7번줄8약간연한빨강버튼.setVisible(true);}
		} if(x==8) {if(y==0){_8번줄0약간연한빨강버튼.setVisible(true);} else if(y==1){_8번줄1약간연한빨강버튼.setVisible(true);} else if(y==2){_8번줄2약간연한빨강버튼.setVisible(true);} else if(y==3){_8번줄3약간연한빨강버튼.setVisible(true);} else if(y==4){_8번줄4약간연한빨강버튼.setVisible(true);} else if(y==5){_8번줄5약간연한빨강버튼.setVisible(true);}else if(y==6){_8번줄6약간연한빨강버튼.setVisible(true);} else if(y==7){_8번줄7약간연한빨강버튼.setVisible(true);} else if(y==8){_8번줄8약간연한빨강버튼.setVisible(true);}
		    }}
		if(넘==11){
		  if(x==0) {if(y==0){_0번줄0연한빨강버튼.setVisible(true);} else if(y==1){_0번줄1연한빨강버튼.setVisible(true);} else if(y==2){_0번줄2연한빨강버튼.setVisible(true);} else if(y==3){_0번줄3연한빨강버튼.setVisible(true);} else if(y==4){_0번줄4연한빨강버튼.setVisible(true);} else if(y==5){_0번줄5연한빨강버튼.setVisible(true);}else if(y==6){_0번줄6연한빨강버튼.setVisible(true);} else if(y==7){_0번줄7연한빨강버튼.setVisible(true);} else if(y==8){_0번줄8연한빨강버튼.setVisible(true);}
		} if(x==1) {if(y==0){_1번줄0연한빨강버튼.setVisible(true);} else if(y==1){_1번줄1연한빨강버튼.setVisible(true);} else if(y==2){_1번줄2연한빨강버튼.setVisible(true);} else if(y==3){_1번줄3연한빨강버튼.setVisible(true);} else if(y==4){_1번줄4연한빨강버튼.setVisible(true);} else if(y==5){_1번줄5연한빨강버튼.setVisible(true);}else if(y==6){_1번줄6연한빨강버튼.setVisible(true);} else if(y==7){_1번줄7연한빨강버튼.setVisible(true);} else if(y==8){_1번줄8연한빨강버튼.setVisible(true);}
		} if(x==2) {if(y==0){_2번줄0연한빨강버튼.setVisible(true);} else if(y==1){_2번줄1연한빨강버튼.setVisible(true);} else if(y==2){_2번줄2연한빨강버튼.setVisible(true);} else if(y==3){_2번줄3연한빨강버튼.setVisible(true);} else if(y==4){_2번줄4연한빨강버튼.setVisible(true);} else if(y==5){_2번줄5연한빨강버튼.setVisible(true);}else if(y==6){_2번줄6연한빨강버튼.setVisible(true);} else if(y==7){_2번줄7연한빨강버튼.setVisible(true);} else if(y==8){_2번줄8연한빨강버튼.setVisible(true);}
		} if(x==3) {if(y==0){_3번줄0연한빨강버튼.setVisible(true);} else if(y==1){_3번줄1연한빨강버튼.setVisible(true);} else if(y==2){_3번줄2연한빨강버튼.setVisible(true);} else if(y==3){_3번줄3연한빨강버튼.setVisible(true);} else if(y==4){_3번줄4연한빨강버튼.setVisible(true);} else if(y==5){_3번줄5연한빨강버튼.setVisible(true);}else if(y==6){_3번줄6연한빨강버튼.setVisible(true);} else if(y==7){_3번줄7연한빨강버튼.setVisible(true);} else if(y==8){_3번줄8연한빨강버튼.setVisible(true);}
		} if(x==4) {if(y==0){_4번줄0연한빨강버튼.setVisible(true);} else if(y==1){_4번줄1연한빨강버튼.setVisible(true);} else if(y==2){_4번줄2연한빨강버튼.setVisible(true);} else if(y==3){_4번줄3연한빨강버튼.setVisible(true);} else if(y==4){_4번줄4연한빨강버튼.setVisible(true);} else if(y==5){_4번줄5연한빨강버튼.setVisible(true);}else if(y==6){_4번줄6연한빨강버튼.setVisible(true);} else if(y==7){_4번줄7연한빨강버튼.setVisible(true);} else if(y==8){_4번줄8연한빨강버튼.setVisible(true);}
		} if(x==5) {if(y==0){_5번줄0연한빨강버튼.setVisible(true);} else if(y==1){_5번줄1연한빨강버튼.setVisible(true);} else if(y==2){_5번줄2연한빨강버튼.setVisible(true);} else if(y==3){_5번줄3연한빨강버튼.setVisible(true);} else if(y==4){_5번줄4연한빨강버튼.setVisible(true);} else if(y==5){_5번줄5연한빨강버튼.setVisible(true);}else if(y==6){_5번줄6연한빨강버튼.setVisible(true);} else if(y==7){_5번줄7연한빨강버튼.setVisible(true);} else if(y==8){_5번줄8연한빨강버튼.setVisible(true);}
		} if(x==6) {if(y==0){_6번줄0연한빨강버튼.setVisible(true);} else if(y==1){_6번줄1연한빨강버튼.setVisible(true);} else if(y==2){_6번줄2연한빨강버튼.setVisible(true);} else if(y==3){_6번줄3연한빨강버튼.setVisible(true);} else if(y==4){_6번줄4연한빨강버튼.setVisible(true);} else if(y==5){_6번줄5연한빨강버튼.setVisible(true);}else if(y==6){_6번줄6연한빨강버튼.setVisible(true);} else if(y==7){_6번줄7연한빨강버튼.setVisible(true);} else if(y==8){_6번줄8연한빨강버튼.setVisible(true);}
		} if(x==7) {if(y==0){_7번줄0연한빨강버튼.setVisible(true);} else if(y==1){_7번줄1연한빨강버튼.setVisible(true);} else if(y==2){_7번줄2연한빨강버튼.setVisible(true);} else if(y==3){_7번줄3연한빨강버튼.setVisible(true);} else if(y==4){_7번줄4연한빨강버튼.setVisible(true);} else if(y==5){_7번줄5연한빨강버튼.setVisible(true);}else if(y==6){_7번줄6연한빨강버튼.setVisible(true);} else if(y==7){_7번줄7연한빨강버튼.setVisible(true);} else if(y==8){_7번줄8연한빨강버튼.setVisible(true);}
		} if(x==8) {if(y==0){_8번줄0연한빨강버튼.setVisible(true);} else if(y==1){_8번줄1연한빨강버튼.setVisible(true);} else if(y==2){_8번줄2연한빨강버튼.setVisible(true);} else if(y==3){_8번줄3연한빨강버튼.setVisible(true);} else if(y==4){_8번줄4연한빨강버튼.setVisible(true);} else if(y==5){_8번줄5연한빨강버튼.setVisible(true);}else if(y==6){_8번줄6연한빨강버튼.setVisible(true);} else if(y==7){_8번줄7연한빨강버튼.setVisible(true);} else if(y==8){_8번줄8연한빨강버튼.setVisible(true);}
		    }}
	//파랑팀
		  if(넘==2){
		    if(x==0) {if(y==0){_0번줄0파랑버튼.setVisible(true);} else if(y==1){_0번줄1파랑버튼.setVisible(true);}  else if(y==2){_0번줄2파랑버튼.setVisible(true);}  else if(y==3){_0번줄3파랑버튼.setVisible(true);}  else if(y==4){_0번줄4파랑버튼.setVisible(true);}  else if(y==5){_0번줄5파랑버튼.setVisible(true);}  else if(y==6){_0번줄6파랑버튼.setVisible(true);}  else if(y==7){_0번줄7파랑버튼.setVisible(true);}  else if(y==8){_0번줄8파랑버튼.setVisible(true);}  
		  } if(x==1) {if(y==0){_1번줄0파랑버튼.setVisible(true);} else if(y==1){_1번줄1파랑버튼.setVisible(true);}  else if(y==2){_1번줄2파랑버튼.setVisible(true);}  else if(y==3){_1번줄3파랑버튼.setVisible(true);}  else if(y==4){_1번줄4파랑버튼.setVisible(true);}  else if(y==5){_1번줄5파랑버튼.setVisible(true);} else if(y==6){_1번줄6파랑버튼.setVisible(true);}  else if(y==7){_1번줄7파랑버튼.setVisible(true);}  else if(y==8){_1번줄8파랑버튼.setVisible(true);} 
	   	  } if(x==2) {if(y==0){_2번줄0파랑버튼.setVisible(true);} else if(y==1){_2번줄1파랑버튼.setVisible(true);}  else if(y==2){_2번줄2파랑버튼.setVisible(true);}  else if(y==3){_2번줄3파랑버튼.setVisible(true);}  else if(y==4){_2번줄4파랑버튼.setVisible(true);}  else if(y==5){_2번줄5파랑버튼.setVisible(true);} else if(y==6){_2번줄6파랑버튼.setVisible(true);}  else if(y==7){_2번줄7파랑버튼.setVisible(true);}  else if(y==8){_2번줄8파랑버튼.setVisible(true);} 
		  } if(x==3) {if(y==0){_3번줄0파랑버튼.setVisible(true);} else if(y==1){_3번줄1파랑버튼.setVisible(true);}  else if(y==2){_3번줄2파랑버튼.setVisible(true);}  else if(y==3){_3번줄3파랑버튼.setVisible(true);}  else if(y==4){_3번줄4파랑버튼.setVisible(true);}  else if(y==5){_3번줄5파랑버튼.setVisible(true);} else if(y==6){_3번줄6파랑버튼.setVisible(true);}  else if(y==7){_3번줄7파랑버튼.setVisible(true);}  else if(y==8){_3번줄8파랑버튼.setVisible(true);} 
		  } if(x==4) {if(y==0){_4번줄0파랑버튼.setVisible(true);} else if(y==1){_4번줄1파랑버튼.setVisible(true);}  else if(y==2){_4번줄2파랑버튼.setVisible(true);}  else if(y==3){_4번줄3파랑버튼.setVisible(true);}  else if(y==4){_4번줄4파랑버튼.setVisible(true);}  else if(y==5){_4번줄5파랑버튼.setVisible(true);} else if(y==6){_4번줄6파랑버튼.setVisible(true);}  else if(y==7){_4번줄7파랑버튼.setVisible(true);}  else if(y==8){_4번줄8파랑버튼.setVisible(true);} 
		  } if(x==5) {if(y==0){_5번줄0파랑버튼.setVisible(true);} else if(y==1){_5번줄1파랑버튼.setVisible(true);}  else if(y==2){_5번줄2파랑버튼.setVisible(true);}  else if(y==3){_5번줄3파랑버튼.setVisible(true);}  else if(y==4){_5번줄4파랑버튼.setVisible(true);}  else if(y==5){_5번줄5파랑버튼.setVisible(true);} else if(y==6){_5번줄6파랑버튼.setVisible(true);}  else if(y==7){_5번줄7파랑버튼.setVisible(true);}  else if(y==8){_5번줄8파랑버튼.setVisible(true);} 
		  } if(x==6) {if(y==0){_6번줄0파랑버튼.setVisible(true);} else if(y==1){_6번줄1파랑버튼.setVisible(true);}  else if(y==2){_6번줄2파랑버튼.setVisible(true);}  else if(y==3){_6번줄3파랑버튼.setVisible(true);}  else if(y==4){_6번줄4파랑버튼.setVisible(true);}  else if(y==5){_6번줄5파랑버튼.setVisible(true);} else if(y==6){_6번줄6파랑버튼.setVisible(true);}  else if(y==7){_6번줄7파랑버튼.setVisible(true);}  else if(y==8){_6번줄8파랑버튼.setVisible(true);} 
		  } if(x==7) {if(y==0){_7번줄0파랑버튼.setVisible(true);} else if(y==1){_7번줄1파랑버튼.setVisible(true);}  else if(y==2){_7번줄2파랑버튼.setVisible(true);}  else if(y==3){_7번줄3파랑버튼.setVisible(true);}  else if(y==4){_7번줄4파랑버튼.setVisible(true);}  else if(y==5){_7번줄5파랑버튼.setVisible(true);} else if(y==6){_7번줄6파랑버튼.setVisible(true);}  else if(y==7){_7번줄7파랑버튼.setVisible(true);}  else if(y==8){_7번줄8파랑버튼.setVisible(true);} 
		  } if(x==8) {if(y==0){_8번줄0파랑버튼.setVisible(true);} else if(y==1){_8번줄1파랑버튼.setVisible(true);}  else if(y==2){_8번줄2파랑버튼.setVisible(true);}  else if(y==3){_8번줄3파랑버튼.setVisible(true);}  else if(y==4){_8번줄4파랑버튼.setVisible(true);}  else if(y==5){_8번줄5파랑버튼.setVisible(true);} else if(y==6){_8번줄6파랑버튼.setVisible(true);}  else if(y==7){_8번줄7파랑버튼.setVisible(true);}  else if(y==8){_8번줄8파랑버튼.setVisible(true);} 
		     }}
		if(넘==20){
		  if(x==0) {if(y==0){_0번줄0약간연한파랑버튼.setVisible(true);} else if(y==1){_0번줄1약간연한파랑버튼.setVisible(true);} else if(y==2){_0번줄2약간연한파랑버튼.setVisible(true);} else if(y==3){_0번줄3약간연한파랑버튼.setVisible(true);} else if(y==4){_0번줄4약간연한파랑버튼.setVisible(true);} else if(y==5){_0번줄5약간연한파랑버튼.setVisible(true);}else if(y==6){_0번줄6약간연한파랑버튼.setVisible(true);} else if(y==7){_0번줄7약간연한파랑버튼.setVisible(true);} else if(y==8){_0번줄8약간연한파랑버튼.setVisible(true);}
		} if(x==1) {if(y==0){_1번줄0약간연한파랑버튼.setVisible(true);} else if(y==1){_1번줄1약간연한파랑버튼.setVisible(true);} else if(y==2){_1번줄2약간연한파랑버튼.setVisible(true);} else if(y==3){_1번줄3약간연한파랑버튼.setVisible(true);} else if(y==4){_1번줄4약간연한파랑버튼.setVisible(true);} else if(y==5){_1번줄5약간연한파랑버튼.setVisible(true);}else if(y==6){_1번줄6약간연한파랑버튼.setVisible(true);} else if(y==7){_1번줄7약간연한파랑버튼.setVisible(true);} else if(y==8){_1번줄8약간연한파랑버튼.setVisible(true);}
		} if(x==2) {if(y==0){_2번줄0약간연한파랑버튼.setVisible(true);} else if(y==1){_2번줄1약간연한파랑버튼.setVisible(true);} else if(y==2){_2번줄2약간연한파랑버튼.setVisible(true);} else if(y==3){_2번줄3약간연한파랑버튼.setVisible(true);} else if(y==4){_2번줄4약간연한파랑버튼.setVisible(true);} else if(y==5){_2번줄5약간연한파랑버튼.setVisible(true);}else if(y==6){_2번줄6약간연한파랑버튼.setVisible(true);} else if(y==7){_2번줄7약간연한파랑버튼.setVisible(true);} else if(y==8){_2번줄8약간연한파랑버튼.setVisible(true);}
		} if(x==3) {if(y==0){_3번줄0약간연한파랑버튼.setVisible(true);} else if(y==1){_3번줄1약간연한파랑버튼.setVisible(true);} else if(y==2){_3번줄2약간연한파랑버튼.setVisible(true);} else if(y==3){_3번줄3약간연한파랑버튼.setVisible(true);} else if(y==4){_3번줄4약간연한파랑버튼.setVisible(true);} else if(y==5){_3번줄5약간연한파랑버튼.setVisible(true);}else if(y==6){_3번줄6약간연한파랑버튼.setVisible(true);} else if(y==7){_3번줄7약간연한파랑버튼.setVisible(true);} else if(y==8){_3번줄8약간연한파랑버튼.setVisible(true);}
		} if(x==4) {if(y==0){_4번줄0약간연한파랑버튼.setVisible(true);} else if(y==1){_4번줄1약간연한파랑버튼.setVisible(true);} else if(y==2){_4번줄2약간연한파랑버튼.setVisible(true);} else if(y==3){_4번줄3약간연한파랑버튼.setVisible(true);} else if(y==4){_4번줄4약간연한파랑버튼.setVisible(true);} else if(y==5){_4번줄5약간연한파랑버튼.setVisible(true);}else if(y==6){_4번줄6약간연한파랑버튼.setVisible(true);} else if(y==7){_4번줄7약간연한파랑버튼.setVisible(true);} else if(y==8){_4번줄8약간연한파랑버튼.setVisible(true);}
		} if(x==5) {if(y==0){_5번줄0약간연한파랑버튼.setVisible(true);} else if(y==1){_5번줄1약간연한파랑버튼.setVisible(true);} else if(y==2){_5번줄2약간연한파랑버튼.setVisible(true);} else if(y==3){_5번줄3약간연한파랑버튼.setVisible(true);} else if(y==4){_5번줄4약간연한파랑버튼.setVisible(true);} else if(y==5){_5번줄5약간연한파랑버튼.setVisible(true);}else if(y==6){_5번줄6약간연한파랑버튼.setVisible(true);} else if(y==7){_5번줄7약간연한파랑버튼.setVisible(true);} else if(y==8){_5번줄8약간연한파랑버튼.setVisible(true);}
		} if(x==6) {if(y==0){_6번줄0약간연한파랑버튼.setVisible(true);} else if(y==1){_6번줄1약간연한파랑버튼.setVisible(true);} else if(y==2){_6번줄2약간연한파랑버튼.setVisible(true);} else if(y==3){_6번줄3약간연한파랑버튼.setVisible(true);} else if(y==4){_6번줄4약간연한파랑버튼.setVisible(true);} else if(y==5){_6번줄5약간연한파랑버튼.setVisible(true);}else if(y==6){_6번줄6약간연한파랑버튼.setVisible(true);} else if(y==7){_6번줄7약간연한파랑버튼.setVisible(true);} else if(y==8){_6번줄8약간연한파랑버튼.setVisible(true);}
		} if(x==7) {if(y==0){_7번줄0약간연한파랑버튼.setVisible(true);} else if(y==1){_7번줄1약간연한파랑버튼.setVisible(true);} else if(y==2){_7번줄2약간연한파랑버튼.setVisible(true);} else if(y==3){_7번줄3약간연한파랑버튼.setVisible(true);} else if(y==4){_7번줄4약간연한파랑버튼.setVisible(true);} else if(y==5){_7번줄5약간연한파랑버튼.setVisible(true);}else if(y==6){_7번줄6약간연한파랑버튼.setVisible(true);} else if(y==7){_7번줄7약간연한파랑버튼.setVisible(true);} else if(y==8){_7번줄8약간연한파랑버튼.setVisible(true);}
		} if(x==8) {if(y==0){_8번줄0약간연한파랑버튼.setVisible(true);} else if(y==1){_8번줄1약간연한파랑버튼.setVisible(true);} else if(y==2){_8번줄2약간연한파랑버튼.setVisible(true);} else if(y==3){_8번줄3약간연한파랑버튼.setVisible(true);} else if(y==4){_8번줄4약간연한파랑버튼.setVisible(true);} else if(y==5){_8번줄5약간연한파랑버튼.setVisible(true);}else if(y==6){_8번줄6약간연한파랑버튼.setVisible(true);} else if(y==7){_8번줄7약간연한파랑버튼.setVisible(true);} else if(y==8){_8번줄8약간연한파랑버튼.setVisible(true);}
		}}
		if(넘==22){
		  if(x==0) {if(y==0){_0번줄0연한파랑버튼.setVisible(true);} else if(y==1){_0번줄1연한파랑버튼.setVisible(true);} else if(y==2){_0번줄2연한파랑버튼.setVisible(true);} else if(y==3){_0번줄3연한파랑버튼.setVisible(true);} else if(y==4){_0번줄4연한파랑버튼.setVisible(true);} else if(y==5){_0번줄5연한파랑버튼.setVisible(true);}else if(y==6){_0번줄6연한파랑버튼.setVisible(true);} else if(y==7){_0번줄7연한파랑버튼.setVisible(true);} else if(y==8){_0번줄8연한파랑버튼.setVisible(true);}
		} if(x==1) {if(y==0){_1번줄0연한파랑버튼.setVisible(true);} else if(y==1){_1번줄1연한파랑버튼.setVisible(true);} else if(y==2){_1번줄2연한파랑버튼.setVisible(true);} else if(y==3){_1번줄3연한파랑버튼.setVisible(true);} else if(y==4){_1번줄4연한파랑버튼.setVisible(true);} else if(y==5){_1번줄5연한파랑버튼.setVisible(true);}else if(y==6){_1번줄6연한파랑버튼.setVisible(true);} else if(y==7){_1번줄7연한파랑버튼.setVisible(true);} else if(y==8){_1번줄8연한파랑버튼.setVisible(true);}
		} if(x==2) {if(y==0){_2번줄0연한파랑버튼.setVisible(true);} else if(y==1){_2번줄1연한파랑버튼.setVisible(true);} else if(y==2){_2번줄2연한파랑버튼.setVisible(true);} else if(y==3){_2번줄3연한파랑버튼.setVisible(true);} else if(y==4){_2번줄4연한파랑버튼.setVisible(true);} else if(y==5){_2번줄5연한파랑버튼.setVisible(true);}else if(y==6){_2번줄6연한파랑버튼.setVisible(true);} else if(y==7){_2번줄7연한파랑버튼.setVisible(true);} else if(y==8){_2번줄8연한파랑버튼.setVisible(true);}
		} if(x==3) {if(y==0){_3번줄0연한파랑버튼.setVisible(true);} else if(y==1){_3번줄1연한파랑버튼.setVisible(true);} else if(y==2){_3번줄2연한파랑버튼.setVisible(true);} else if(y==3){_3번줄3연한파랑버튼.setVisible(true);} else if(y==4){_3번줄4연한파랑버튼.setVisible(true);} else if(y==5){_3번줄5연한파랑버튼.setVisible(true);}else if(y==6){_3번줄6연한파랑버튼.setVisible(true);} else if(y==7){_3번줄7연한파랑버튼.setVisible(true);} else if(y==8){_3번줄8연한파랑버튼.setVisible(true);}
		} if(x==4) {if(y==0){_4번줄0연한파랑버튼.setVisible(true);} else if(y==1){_4번줄1연한파랑버튼.setVisible(true);} else if(y==2){_4번줄2연한파랑버튼.setVisible(true);} else if(y==3){_4번줄3연한파랑버튼.setVisible(true);} else if(y==4){_4번줄4연한파랑버튼.setVisible(true);} else if(y==5){_4번줄5연한파랑버튼.setVisible(true);}else if(y==6){_4번줄6연한파랑버튼.setVisible(true);} else if(y==7){_4번줄7연한파랑버튼.setVisible(true);} else if(y==8){_4번줄8연한파랑버튼.setVisible(true);}
		} if(x==5) {if(y==0){_5번줄0연한파랑버튼.setVisible(true);} else if(y==1){_5번줄1연한파랑버튼.setVisible(true);} else if(y==2){_5번줄2연한파랑버튼.setVisible(true);} else if(y==3){_5번줄3연한파랑버튼.setVisible(true);} else if(y==4){_5번줄4연한파랑버튼.setVisible(true);} else if(y==5){_5번줄5연한파랑버튼.setVisible(true);}else if(y==6){_5번줄6연한파랑버튼.setVisible(true);} else if(y==7){_5번줄7연한파랑버튼.setVisible(true);} else if(y==8){_5번줄8연한파랑버튼.setVisible(true);}
		} if(x==6) {if(y==0){_6번줄0연한파랑버튼.setVisible(true);} else if(y==1){_6번줄1연한파랑버튼.setVisible(true);} else if(y==2){_6번줄2연한파랑버튼.setVisible(true);} else if(y==3){_6번줄3연한파랑버튼.setVisible(true);} else if(y==4){_6번줄4연한파랑버튼.setVisible(true);} else if(y==5){_6번줄5연한파랑버튼.setVisible(true);}else if(y==6){_6번줄6연한파랑버튼.setVisible(true);} else if(y==7){_6번줄7연한파랑버튼.setVisible(true);} else if(y==8){_6번줄8연한파랑버튼.setVisible(true);}
		} if(x==7) {if(y==0){_7번줄0연한파랑버튼.setVisible(true);} else if(y==1){_7번줄1연한파랑버튼.setVisible(true);} else if(y==2){_7번줄2연한파랑버튼.setVisible(true);} else if(y==3){_7번줄3연한파랑버튼.setVisible(true);} else if(y==4){_7번줄4연한파랑버튼.setVisible(true);} else if(y==5){_7번줄5연한파랑버튼.setVisible(true);}else if(y==6){_7번줄6연한파랑버튼.setVisible(true);} else if(y==7){_7번줄7연한파랑버튼.setVisible(true);} else if(y==8){_7번줄8연한파랑버튼.setVisible(true);}
		} if(x==8) {if(y==0){_8번줄0연한파랑버튼.setVisible(true);} else if(y==1){_8번줄1연한파랑버튼.setVisible(true);} else if(y==2){_8번줄2연한파랑버튼.setVisible(true);} else if(y==3){_8번줄3연한파랑버튼.setVisible(true);} else if(y==4){_8번줄4연한파랑버튼.setVisible(true);} else if(y==5){_8번줄5연한파랑버튼.setVisible(true);}else if(y==6){_8번줄6연한파랑버튼.setVisible(true);} else if(y==7){_8번줄7연한파랑버튼.setVisible(true);} else if(y==8){_8번줄8연한파랑버튼.setVisible(true);}
		}}
		}
	void 스코어갱신(){
		빨강팀세균수=0;
		파랑팀세균수=0;
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				if(게임판[i][j]==1) ++빨강팀세균수;
				else if(게임판[i][j]==2) ++파랑팀세균수;
			}
		}
		
		if(현재차례==1){파랑순서.setVisible(true);빨강순서.setVisible(false);}
		else if(현재차례!=1){파랑순서.setVisible(false);빨강순서.setVisible(true); }
	System.out.println("빨강팀 : "+빨강팀세균수);
	System.out.println("파랑팀 : "+파랑팀세균수);
	}
	void 게임종료(){
		if(빨강팀세균수==파랑팀세균수){무승부버튼.setVisible(true);}//무승부
		else if(빨강팀세균수<파랑팀세균수){파랑팀승리버튼.setVisible(true);}//파랑승리
		else if(빨강팀세균수>파랑팀세균수){빨강팀승리버튼.setVisible(true);}//빨강승리
	}
	void 강탈처리기(int x,int y,int i, int j,int 차례){
		if(차례==1){
			if(x%2==0){//위를 공격
				if(!(x-1<0)){if(!(y+1>8)){if(x-1==i&& y ==j) 게임판[i][j]=1; if(x-1==i&&y+1==j) 게임판[i][j]=1;} else {if(x-1==i&& y ==j) 게임판[i][j]=1;}}
				if(!(y-1<0)){if(!(y+1>8)){if( x ==i&&y-1==j) 게임판[i][j]=1; if( x ==i&&y+1==j) 게임판[i][j]=1;} else {if( x ==i&&y-1==j) 게임판[i][j]=1;}} else {if( x ==i&&y+1==j) 게임판[i][j]=1;}
				if(!(x+1>8)){if(!(y+1>8)){if(x+1==i&& y ==j) 게임판[i][j]=1; if(x+1==i&&y+1==j) 게임판[i][j]=1;} else {if(x+1==i&& y ==j) 게임판[i][j]=1;}}}
	   else if(x%2!=0){//아래를 공격
				if(!(x-1<0)){if(!(y-1<0)){if(x-1==i&&y-1==j) 게임판[i][j]=1; if(x-1==i&& y ==j) 게임판[i][j]=1;} else {if(x-1==i&& y ==j) 게임판[i][j]=1;}}
				if(!(y-1<0)){if(!(y+1>8)){if( x ==i&&y-1==j) 게임판[i][j]=1; if( x ==i&&y+1==j) 게임판[i][j]=1;} else {if( x ==i&&y-1==j) 게임판[i][j]=1;}} else {if( x ==i&&y+1==j) 게임판[i][j]=1;}
				if(!(x+1>8)){if(!(y-1<0)){if(x+1==i&&y-1==j) 게임판[i][j]=1; if(x+1==i&& y ==j) 게임판[i][j]=1;} else {if(x+1==i&& y ==j) 게임판[i][j]=1;}}}
		}
		if(차례!=1){
			if(x%2==0){
				if(!(x-1<0)){if(!(y+1>8)){if(x-1==i&& y ==j) 게임판[i][j]=2; if(x-1==i&&y+1==j) 게임판[i][j]=2;} else {if(x-1==i&& y ==j) 게임판[i][j]=2;}}
				if(!(y-1<0)){if(!(y+1>8)){if( x ==i&&y-1==j) 게임판[i][j]=2; if( x ==i&&y+1==j) 게임판[i][j]=2;} else {if( x ==i&&y-1==j) 게임판[i][j]=2;}} else {if( x ==i&&y+1==j) 게임판[i][j]=2;}
				if(!(x+1>8)){if(!(y+1>8)){if(x+1==i&& y ==j) 게임판[i][j]=2; if(x+1==i&&y+1==j) 게임판[i][j]=2;} else {if(x+1==i&& y ==j) 게임판[i][j]=2;}}}
	    else if(x%2!=0){ //-1 0
				if(!(x-1<0)){if(!(y-1<0)){if(x-1==i&&y-1==j) 게임판[i][j]=2; if(x-1==i&& y ==j) 게임판[i][j]=2;} else {if(x-1==i&& y ==j) 게임판[i][j]=2;}}
				if(!(y-1<0)){if(!(y+1>8)){if( x ==i&&y-1==j) 게임판[i][j]=2; if( x ==i&&y+1==j) 게임판[i][j]=2;} else {if( x ==i&&y-1==j) 게임판[i][j]=2;}} else {if( x ==i&&y+1==j) 게임판[i][j]=2;}
				if(!(x+1>8)){if(!(y-1<0)){if(x+1==i&&y-1==j) 게임판[i][j]=2; if(x+1==i&& y ==j) 게임판[i][j]=2;} else {if(x+1==i&& y ==j) 게임판[i][j]=2;}}}
		}
	}
	void 강탈(int x,int y){
		for(int i=x-1;i<x+2;i++){
		if(i<0) {i=0;} else if(i>8) {break;}
		for(int j=y-1;j<y+2;j++){
		if(j<0) {j=0;} else if(j>8) {break;}
		if(게임판[i][j]==1||게임판[i][j]==2){
			강탈처리기(x,y,i,j,현재차례);
			if(현재차례==1){if(게임판[i][j]==1){버튼비활성화(i,j,2); 버튼활성화(i,j,1);}}
			if(현재차례!=1){if(게임판[i][j]==2){버튼비활성화(i,j,1); 버튼활성화(i,j,2);}}
				}
			}
		}
	}
	void 검사처리기(int x,int y,int i,int j,int 차례){ //xy는 누른좌표, ij는 탐색
		//증식-------------------------------------------------------------------------------------------------------------------------------
		if(차례==1){
	if(x%2==0){
			if(!(x-1<0)){if(!(y+1>8)){if(x-1==i&& y ==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;} if(x-1==i&&y+1==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}} else {if(x-1==i&& y ==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}}}
			if(!(y-1<0)){if(!(y+1>8)){if( x ==i&&y-1==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;} if( x ==i&&y+1==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}} else {if( x ==i&&y-1==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}}} else {if( x ==i&&y+1==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}}
			if(!(x+1>8)){if(!(y+1>8)){if(x+1==i&& y ==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;} if(x+1==i&&y+1==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}} else {if(x+1==i&& y ==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}}}}
		if(x%2!=0){ //-1 0
			if(!(x-1<0)){if(!(y-1<0)){if(x-1==i&&y-1==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;} if(x-1==i&& y ==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}} else {if(x-1==i&& y ==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}}}
			if(!(y-1<0)){if(!(y+1>8)){if( x ==i&&y-1==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;} if( x ==i&&y+1==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}} else {if( x ==i&&y-1==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}}} else {if( x ==i&&y+1==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}}
			if(!(x+1>8)){if(!(y-1<0)){if(x+1==i&&y-1==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;} if(x+1==i&& y ==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}} else {if(x+1==i&& y ==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}}}	
		}
		if(x%2==0){
		if(!(x-2<0)){if(!(y-1<0)){if(!(y+1>8)){if(x-2==i&&y-1==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}if(x-2==i&& y ==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}if(x-2==i&&y+1==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}} else {if(x-2==i&&y-1==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}if(x-2==i&& y ==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}} } else {if(x-2==i&& y ==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;} if(x-2==i&&y+1==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}}}
		if(!(x-1<0)){if(!(y-1<0)){if(!(y+2>8)){if(x-1==i&&y-1==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}if(x-1==i&&y+2==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}} else {if(x-1==i&&y-1==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}}} else {if(x-1==i&&y+2==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}}}
		if(!(y-2<0)){if(!(y+2>8)){if( x ==i&&y-2==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}if( x ==i&&y+2==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}}else{if( x ==i&&y-2==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}}} else {if( x ==i&&y+2==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}}
		if(!(x+1>8)){if(!(y-1<0)){if(!(y+2>8)){if(x+1==i&&y-1==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}if(x+1==i&&y+2==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}} else {if(x+1==i&&y-1==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}}} else {if(x+1==i&&y+2==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}}}
		if(!(x+2>8)){if(!(y-1<0)){if(!(y+1>8)){if(x+2==i&&y-1==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}if(x+2==i&& y ==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}if(x+2==i&&y+1==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}} else {if(x+2==i&&y-1==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}if(x+2==i&& y ==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}} } else {if(x+2==i&& y ==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;} if(x+2==i&&y+1==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}}}
	}
	if(x%2!=0){
		if(!(x-2<0)){if(!(y-1<0)){if(!(y+1>8)){if(x-2==i&&y-1==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}if(x-2==i&& y ==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}if(x-2==i&&y+1==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}} else {if(x-2==i&&y-1==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}if(x-2==i&& y ==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}} } else {if(x-2==i&& y ==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;} if(x-2==i&&y+1==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}}}
		if(!(x-1<0)){if(!(y-2<0)){if(!(y+1>8)){if(x-1==i&&y+1==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}if(x-1==i&&y-2==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}} else {if(x-1==i&&y+1==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}}} else {if(x-1==i&&y-2==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}}}
		if(!(y-2<0)){if(!(y+2>8)){if( x ==i&&y-2==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}if( x ==i&&y+2==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}}else{if( x ==i&&y-2==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}}} else {if( x ==i&&y+2==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}}
		if(!(x+1>8)){if(!(y-2<0)){if(!(y+1>8)){if(x+1==i&&y+1==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}if(x+1==i&&y-2==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}} else {if(x+1==i&&y+1==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}}} else {if(x+1==i&&y-2==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}}}
		if(!(x+2>8)){if(!(y-1<0)){if(!(y+1>8)){if(x+2==i&&y-1==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}if(x+2==i&& y ==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}if(x+2==i&&y+1==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}} else {if(x+2==i&&y-1==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}if(x+2==i&& y ==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}} } else {if(x+2==i&& y ==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;} if(x+2==i&&y+1==j) if(!(빨강카운트==18)){++빨강카운트;}else{++빨강못움직이는말;}}}
		}}
		else if(!(차례==1)){
	if(x%2==0){
			if(!(x-1<0)){if(!(y+1>8)){if(x-1==i&& y ==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;} if(x-1==i&&y+1==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}} else {if(x-1==i&& y ==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}}}
			if(!(y-1<0)){if(!(y+1>8)){if( x ==i&&y-1==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;} if( x ==i&&y+1==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}} else {if( x ==i&&y-1==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}}} else {if( x ==i&&y+1==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}}
			if(!(x+1>8)){if(!(y+1>8)){if(x+1==i&& y ==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;} if(x+1==i&&y+1==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}} else {if(x+1==i&& y ==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}}}}
		if(x%2!=0){ //-1 0
			if(!(x-1<0)){if(!(y-1<0)){if(x-1==i&&y-1==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;} if(x-1==i&& y ==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}} else {if(x-1==i&& y ==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}}}
			if(!(y-1<0)){if(!(y+1>8)){if( x ==i&&y-1==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;} if( x ==i&&y+1==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}} else {if( x ==i&&y-1==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}}} else {if( x ==i&&y+1==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}}
			if(!(x+1>8)){if(!(y-1<0)){if(x+1==i&&y-1==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;} if(x+1==i&& y ==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}} else {if(x+1==i&& y ==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}}}	
		}
		if(x%2==0){
		if(!(x-2<0)){if(!(y-1<0)){if(!(y+1>8)){if(x-2==i&&y-1==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}if(x-2==i&& y ==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}if(x-2==i&&y+1==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}} else {if(x-2==i&&y-1==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}if(x-2==i&& y ==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}} } else {if(x-2==i&& y ==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;} if(x-2==i&&y+1==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}}}
		if(!(x-1<0)){if(!(y-1<0)){if(!(y+2>8)){if(x-1==i&&y-1==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}if(x-1==i&&y+2==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}} else {if(x-1==i&&y-1==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}}} else {if(x-1==i&&y+2==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}}}
		if(!(y-2<0)){if(!(y+2>8)){if( x ==i&&y-2==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}if( x ==i&&y+2==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}}else{if( x ==i&&y-2==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}}} else {if( x ==i&&y+2==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}}
		if(!(x+1>8)){if(!(y-1<0)){if(!(y+2>8)){if(x+1==i&&y-1==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}if(x+1==i&&y+2==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}} else {if(x+1==i&&y-1==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}}} else {if(x+1==i&&y+2==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}}}
		if(!(x+2>8)){if(!(y-1<0)){if(!(y+1>8)){if(x+2==i&&y-1==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}if(x+2==i&& y ==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}if(x+2==i&&y+1==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}} else {if(x+2==i&&y-1==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}if(x+2==i&& y ==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}} } else {if(x+2==i&& y ==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;} if(x+2==i&&y+1==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}}}
	}
	if(x%2!=0){
		if(!(x-2<0)){if(!(y-1<0)){if(!(y+1>8)){if(x-2==i&&y-1==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}if(x-2==i&& y ==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}if(x-2==i&&y+1==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}} else {if(x-2==i&&y-1==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}if(x-2==i&& y ==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}} } else {if(x-2==i&& y ==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;} if(x-2==i&&y+1==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}}}
		if(!(x-1<0)){if(!(y-2<0)){if(!(y+1>8)){if(x-1==i&&y+1==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}if(x-1==i&&y-2==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}} else {if(x-1==i&&y+1==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}}} else {if(x-1==i&&y-2==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}}}
		if(!(y-2<0)){if(!(y+2>8)){if( x ==i&&y-2==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}if( x ==i&&y+2==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}}else{if( x ==i&&y-2==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}}} else {if( x ==i&&y+2==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}}
		if(!(x+1>8)){if(!(y-2<0)){if(!(y+1>8)){if(x+1==i&&y+1==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}if(x+1==i&&y-2==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}} else {if(x+1==i&&y+1==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}}} else {if(x+1==i&&y-2==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}}}
		if(!(x+2>8)){if(!(y-1<0)){if(!(y+1>8)){if(x+2==i&&y-1==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}if(x+2==i&& y ==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}if(x+2==i&&y+1==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}} else {if(x+2==i&&y-1==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}if(x+2==i&& y ==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}} } else {if(x+2==i&& y ==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;} if(x+2==i&&y+1==j) if(!(파랑카운트==18)){++파랑카운트;}else{++파랑못움직이는말;}}}
		}}
		  //  (차례==1)  if(!(카운트==18)){++카운트;}else{++못움직이는말;} (차례==2)  if(!(카운트==18)){++카운트;}else{++못움직이는말;}
		}
	void 모든말검사(){
		빨강카운트=0;
	for(int x=0;x<9;x++){
	for(int y=0;y<9;y++){
	if(게임판[x][y]==0){break;}
	else {++빨강카운트; if(빨강카운트==81){게임종료();}}
		}}
	빨강카운트=0;
	for(int x=0;x<9;x++){
	for(int y=0;y<9;y++){
	if(게임판[x][y]==1){break;}
	else {++빨강카운트; if(빨강카운트==81){게임종료();}}
		}}
	빨강카운트=0;
	for(int x=0;x<9;x++){
	for(int y=0;y<9;y++){
	if(게임판[x][y]==2){break;}
	else {++빨강카운트; if(빨강카운트==81){게임종료();}}
		}}
	System.out.println(빨강카운트);
	}
	void 점프(int i,int j){
		if(현재차례==1) {버튼비활성화(i,j,11); 게임판[i][j]=1; 버튼비활성화(_x,_y,1); 게임판[_x][_y]=0; 버튼활성화(i,j,1); 가이드라인끔(); 강탈(i,j); 스코어갱신();_x=0; _y=0;	스코어숫자();모든말검사();}
		if(현재차례!=1) {버튼비활성화(i,j,22); 게임판[i][j]=2; 버튼비활성화(_x,_y,2); 게임판[_x][_y]=0; 버튼활성화(i,j,2); 가이드라인끔(); 강탈(i,j); 스코어갱신();_x=0; _y=0;	스코어숫자();모든말검사();}
	}
	void 증식(int i, int j){
		if(현재차례==1){버튼비활성화(i,j,10);게임판[i][j]=1; 버튼활성화(i,j,1); 강탈(i,j); 가이드라인끔(); 스코어갱신();_x=0; _y=0;	스코어숫자();모든말검사();}
		if(현재차례!=1){버튼비활성화(i,j,20);게임판[i][j]=2; 버튼활성화(i,j,2); 강탈(i,j); 가이드라인끔(); 스코어갱신();_x=0; _y=0;	스코어숫자();모든말검사();}
	}
	void 말배치(){// 처음에 말 배치시킴
	if(맵번호==1){
		//빨강팀 0번줄3, 4번줄8, 8번줄3
		_0번줄2빨강버튼.setVisible(true);게임판[0][2]=1; _4번줄8빨강버튼.setVisible(true);게임판[4][8]=1; _8번줄2빨강버튼.setVisible(true);게임판[8][2]=1;
		//파랑팀 0번줄7, 4번줄0, 8번줄7
		_0번줄6파랑버튼.setVisible(true);게임판[0][6]=2; _4번줄0파랑버튼.setVisible(true);게임판[4][0]=2; _8번줄6파랑버튼.setVisible(true);게임판[8][6]=2;}
	else {
		_0번줄0빨강버튼.setVisible(true); 게임판[0][0]=1; _8번줄8빨강버튼.setVisible(true); 게임판[8][8]=1;
		_0번줄8파랑버튼.setVisible(true); 게임판[0][8]=2; _8번줄0파랑버튼.setVisible(true); 게임판[8][0]=2;
	}
	스코어갱신();
	스코어숫자();
	}
	public void 게임시작() {
		if(맵번호==1){ // 왼쪽맵
			배경.setIcon(new ImageIcon(G구이.class.getResource("/images/큰게임판.png"))); // 왼쪽맵
			배경.setVisible(true);
			말배치();
			현재차례=1;
		} else {
			배경1.setIcon(new ImageIcon(G구이.class.getResource("/images/큰게임판2.png"))); // 오른쪽맵
			배경1.setVisible(true);
			말배치();
			현재차례=1;
		}
		맵선택이미지.setVisible(false);
		왼쪽맵버튼.setVisible(false);
		오른쪽맵버튼.setVisible(false);
		메뉴로돌아가기버튼.setVisible(false);
		돌아가기버튼.setVisible(true);
		setFocusable(true);
	}
	
	void 처리기(int x,int y,int i,int j,int 차례){ //xy는 누른좌표, ij는 탐색
		//증식-------------------------------------------------------------------------------------------------------------------------------
		if(차례==1){
			if(x%2==0){
				if(!(x-1<0)){if(!(y+1>8)){if(x-1==i&& y ==j) 게임판[i][j]=10; if(x-1==i&&y+1==j) 게임판[i][j]=10;} else {if(x-1==i&& y ==j) 게임판[i][j]=10;}}
				if(!(y-1<0)){if(!(y+1>8)){if( x ==i&&y-1==j) 게임판[i][j]=10; if( x ==i&&y+1==j) 게임판[i][j]=10;} else {if( x ==i&&y-1==j) 게임판[i][j]=10;}} else {if( x ==i&&y+1==j) 게임판[i][j]=10;}
				if(!(x+1>8)){if(!(y+1>8)){if(x+1==i&& y ==j) 게임판[i][j]=10; if(x+1==i&&y+1==j) 게임판[i][j]=10;} else {if(x+1==i&& y ==j) 게임판[i][j]=10;}}}
			if(x%2!=0){ //-1 0
				if(!(x-1<0)){if(!(y-1<0)){if(x-1==i&&y-1==j) 게임판[i][j]=10; if(x-1==i&& y ==j) 게임판[i][j]=10;} else {if(x-1==i&& y ==j) 게임판[i][j]=10;}}
				if(!(y-1<0)){if(!(y+1>8)){if( x ==i&&y-1==j) 게임판[i][j]=10; if( x ==i&&y+1==j) 게임판[i][j]=10;} else {if( x ==i&&y-1==j) 게임판[i][j]=10;}} else {if( x ==i&&y+1==j) 게임판[i][j]=10;}
				if(!(x+1>8)){if(!(y-1<0)){if(x+1==i&&y-1==j) 게임판[i][j]=10; if(x+1==i&& y ==j) 게임판[i][j]=10;} else {if(x+1==i&& y ==j) 게임판[i][j]=10;}}	
			}
			}
		if(차례!=1){
			if(x%2==0){
				if(!(x-1<0)){if(!(y+1>8)){if(x-1==i&& y ==j) 게임판[i][j]=20; if(x-1==i&&y+1==j) 게임판[i][j]=20;} else {if(x-1==i&& y ==j) 게임판[i][j]=20;}}
				if(!(y-1<0)){if(!(y+1>8)){if( x ==i&&y-1==j) 게임판[i][j]=20; if( x ==i&&y+1==j) 게임판[i][j]=20;} else {if( x ==i&&y-1==j) 게임판[i][j]=20;}} else {if( x ==i&&y+1==j) 게임판[i][j]=20;}
				if(!(x+1>8)){if(!(y+1>8)){if(x+1==i&& y ==j) 게임판[i][j]=20; if(x+1==i&&y+1==j) 게임판[i][j]=20;} else {if(x+1==i&& y ==j) 게임판[i][j]=20;}}}
			if(x%2!=0){ //-1 0
				if(!(x-1<0)){if(!(y-1<0)){if(x-1==i&&y-1==j) 게임판[i][j]=20; if(x-1==i&& y ==j) 게임판[i][j]=20;} else {if(x-1==i&& y ==j) 게임판[i][j]=20;}}
				if(!(y-1<0)){if(!(y+1>8)){if( x ==i&&y-1==j) 게임판[i][j]=20; if( x ==i&&y+1==j) 게임판[i][j]=20;} else {if( x ==i&&y-1==j) 게임판[i][j]=20;}} else {if( x ==i&&y+1==j) 게임판[i][j]=20;}
				if(!(x+1>8)){if(!(y-1<0)){if(x+1==i&&y-1==j) 게임판[i][j]=20; if(x+1==i&& y ==j) 게임판[i][j]=20;} else {if(x+1==i&& y ==j) 게임판[i][j]=20;}}	
			}
			}
		  //  (차례==1)  게임판[i][j]=10; (차례==2)  게임판[i][j]=20;
		//점프-------------------------------------------------------------------------------------------------------------------------------
		if(차례==1){
			if(x%2==0){
			if(!(x-2<0)){if(!(y-1<0)){if(!(y+1>8)){if(x-2==i&&y-1==j) 게임판[i][j]=11;if(x-2==i&& y ==j) 게임판[i][j]=11;if(x-2==i&&y+1==j) 게임판[i][j]=11;} else {if(x-2==i&&y-1==j) 게임판[i][j]=11;if(x-2==i&& y ==j) 게임판[i][j]=11;} } else {if(x-2==i&& y ==j) 게임판[i][j]=11; if(x-2==i&&y+1==j) 게임판[i][j]=11;}}
			if(!(x-1<0)){if(!(y-1<0)){if(!(y+2>8)){if(x-1==i&&y-1==j) 게임판[i][j]=11;if(x-1==i&&y+2==j) 게임판[i][j]=11;} else {if(x-1==i&&y-1==j) 게임판[i][j]=11;}} else {if(x-1==i&&y+2==j) 게임판[i][j]=11;}}
			if(!(y-2<0)){if(!(y+2>8)){if( x ==i&&y-2==j) 게임판[i][j]=11;if( x ==i&&y+2==j) 게임판[i][j]=11;}else{if( x ==i&&y-2==j) 게임판[i][j]=11;}} else {if( x ==i&&y+2==j) 게임판[i][j]=11;}
			if(!(x+1>8)){if(!(y-1<0)){if(!(y+2>8)){if(x+1==i&&y-1==j) 게임판[i][j]=11;if(x+1==i&&y+2==j) 게임판[i][j]=11;} else {if(x+1==i&&y-1==j) 게임판[i][j]=11;}} else {if(x+1==i&&y+2==j) 게임판[i][j]=11;}}
			if(!(x+2>8)){if(!(y-1<0)){if(!(y+1>8)){if(x+2==i&&y-1==j) 게임판[i][j]=11;if(x+2==i&& y ==j) 게임판[i][j]=11;if(x+2==i&&y+1==j) 게임판[i][j]=11;} else {if(x+2==i&&y-1==j) 게임판[i][j]=11;if(x+2==i&& y ==j) 게임판[i][j]=11;} } else {if(x+2==i&& y ==j) 게임판[i][j]=11; if(x+2==i&&y+1==j) 게임판[i][j]=11;}}
		}
		if(x%2!=0){
			if(!(x-2<0)){if(!(y-1<0)){if(!(y+1>8)){if(x-2==i&&y-1==j) 게임판[i][j]=11;if(x-2==i&& y ==j) 게임판[i][j]=11;if(x-2==i&&y+1==j) 게임판[i][j]=11;} else {if(x-2==i&&y-1==j) 게임판[i][j]=11;if(x-2==i&& y ==j) 게임판[i][j]=11;} } else {if(x-2==i&& y ==j) 게임판[i][j]=11; if(x-2==i&&y+1==j) 게임판[i][j]=11;}}
			if(!(x-1<0)){if(!(y-2<0)){if(!(y+1>8)){if(x-1==i&&y+1==j) 게임판[i][j]=11;if(x-1==i&&y-2==j) 게임판[i][j]=11;} else {if(x-1==i&&y+1==j) 게임판[i][j]=11;}} else {if(x-1==i&&y-2==j) 게임판[i][j]=11;}}
			if(!(y-2<0)){if(!(y+2>8)){if( x ==i&&y-2==j) 게임판[i][j]=11;if( x ==i&&y+2==j) 게임판[i][j]=11;}else{if( x ==i&&y-2==j) 게임판[i][j]=11;}} else {if( x ==i&&y+2==j) 게임판[i][j]=11;}
			if(!(x+1>8)){if(!(y-2<0)){if(!(y+1>8)){if(x+1==i&&y+1==j) 게임판[i][j]=11;if(x+1==i&&y-2==j) 게임판[i][j]=11;} else {if(x+1==i&&y+1==j) 게임판[i][j]=11;}} else {if(x+1==i&&y-2==j) 게임판[i][j]=11;}}
			if(!(x+2>8)){if(!(y-1<0)){if(!(y+1>8)){if(x+2==i&&y-1==j) 게임판[i][j]=11;if(x+2==i&& y ==j) 게임판[i][j]=11;if(x+2==i&&y+1==j) 게임판[i][j]=11;} else {if(x+2==i&&y-1==j) 게임판[i][j]=11;if(x+2==i&& y ==j) 게임판[i][j]=11;} } else {if(x+2==i&& y ==j) 게임판[i][j]=11; if(x+2==i&&y+1==j) 게임판[i][j]=11;}}
			}
		}
		if(차례!=1){
			if(x%2==0){
			if(!(x-2<0)){if(!(y-1<0)){if(!(y+1>8)){if(x-2==i&&y-1==j) 게임판[i][j]=22;if(x-2==i&& y ==j) 게임판[i][j]=22;if(x-2==i&&y+1==j) 게임판[i][j]=22;} else {if(x-2==i&&y-1==j) 게임판[i][j]=22;if(x-2==i&& y ==j) 게임판[i][j]=22;} } else {if(x-2==i&& y ==j) 게임판[i][j]=22; if(x-2==i&&y+1==j) 게임판[i][j]=22;}}
			if(!(x-1<0)){if(!(y-1<0)){if(!(y+2>8)){if(x-1==i&&y-1==j) 게임판[i][j]=22;if(x-1==i&&y+2==j) 게임판[i][j]=22;} else {if(x-1==i&&y-1==j) 게임판[i][j]=22;}} else {if(x-1==i&&y+2==j) 게임판[i][j]=22;}}
			if(!(y-2<0)){if(!(y+2>8)){if( x ==i&&y-2==j) 게임판[i][j]=22;if( x ==i&&y+2==j) 게임판[i][j]=22;}else{if( x ==i&&y-2==j) 게임판[i][j]=22;}} else {if( x ==i&&y+2==j) 게임판[i][j]=22;}
			if(!(x+1>8)){if(!(y-1<0)){if(!(y+2>8)){if(x+1==i&&y-1==j) 게임판[i][j]=22;if(x+1==i&&y+2==j) 게임판[i][j]=22;} else {if(x+1==i&&y-1==j) 게임판[i][j]=22;}} else {if(x+1==i&&y+2==j) 게임판[i][j]=22;}}
			if(!(x+2>8)){if(!(y-1<0)){if(!(y+1>8)){if(x+2==i&&y-1==j) 게임판[i][j]=22;if(x+2==i&& y ==j) 게임판[i][j]=22;if(x+2==i&&y+1==j) 게임판[i][j]=22;} else {if(x+2==i&&y-1==j) 게임판[i][j]=22;if(x+2==i&& y ==j) 게임판[i][j]=22;} } else {if(x+2==i&& y ==j) 게임판[i][j]=22; if(x+2==i&&y+1==j) 게임판[i][j]=22;}}
		}
		if(x%2!=0){
			if(!(x-2<0)){if(!(y-1<0)){if(!(y+1>8)){if(x-2==i&&y-1==j) 게임판[i][j]=22;if(x-2==i&& y ==j) 게임판[i][j]=22;if(x-2==i&&y+1==j) 게임판[i][j]=22;} else {if(x-2==i&&y-1==j) 게임판[i][j]=22;if(x-2==i&& y ==j) 게임판[i][j]=22;} } else {if(x-2==i&& y ==j) 게임판[i][j]=22; if(x-2==i&&y+1==j) 게임판[i][j]=22;}}
			if(!(x-1<0)){if(!(y-2<0)){if(!(y+1>8)){if(x-1==i&&y+1==j) 게임판[i][j]=22;if(x-1==i&&y-2==j) 게임판[i][j]=22;} else {if(x-1==i&&y+1==j) 게임판[i][j]=22;}} else {if(x-1==i&&y-2==j) 게임판[i][j]=22;}}
			if(!(y-2<0)){if(!(y+2>8)){if( x ==i&&y-2==j) 게임판[i][j]=22;if( x ==i&&y+2==j) 게임판[i][j]=22;}else{if( x ==i&&y-2==j) 게임판[i][j]=22;}} else {if( x ==i&&y+2==j) 게임판[i][j]=22;}
			if(!(x+1>8)){if(!(y-2<0)){if(!(y+1>8)){if(x+1==i&&y+1==j) 게임판[i][j]=22;if(x+1==i&&y-2==j) 게임판[i][j]=22;} else {if(x+1==i&&y+1==j) 게임판[i][j]=22;}} else {if(x+1==i&&y-2==j) 게임판[i][j]=22;}}
			if(!(x+2>8)){if(!(y-1<0)){if(!(y+1>8)){if(x+2==i&&y-1==j) 게임판[i][j]=22;if(x+2==i&& y ==j) 게임판[i][j]=22;if(x+2==i&&y+1==j) 게임판[i][j]=22;} else {if(x+2==i&&y-1==j) 게임판[i][j]=22;if(x+2==i&& y ==j) 게임판[i][j]=22;} } else {if(x+2==i&& y ==j) 게임판[i][j]=22; if(x+2==i&&y+1==j) 게임판[i][j]=22;}}
			}}
		  //  (차례==1)  게임판[i][j]=11; (차례==2)  게임판[i][j]=22;
		}
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		void 클릭(int x,int y){//클릭한 좌표가 G구이에서 들어옴
		              가이드라인끔();
				_x = x; _y = y;
				for(int i=x-2;i<x+3;i++){
				if(i<0) {i=0;} else if(i>8) {break;}
				for(int j=y-2;j<y+3;j++){
				if(j<0) {j=0;} else if(j>8) {break;}
				if(게임판[i][j]==0&&!(게임판[i][j]==7)){
					처리기(x,y,i,j,현재차례);  버튼활성화(i,j,게임판[i][j]);
				}
				}}}
}
