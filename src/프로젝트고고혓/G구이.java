package ������Ʈ�����;
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

public class G���� extends JFrame {
	 int x=0; int y=0; //��ư ��ǥ�� ����
	 int _x=0; int _y=0; // �ӽ���ǥ
	static int �������� = 0; int A=1;
	int ���������ռ�=0; int �Ķ������ռ�=0;
	int ����ī��Ʈ=0; int �Ķ�ī��Ʈ=0;
	int[][] ������ = new int[9][9]; int ���ް�=0; //��������ǥ, ������ �� <- ���̴� �Ⱦ���
	//private Image screenImage; �Ⱦ�
	//private Graphics screenGraphic; �Ⱦ�
	int[] X��ǥ = new int[9]; int[][] Y��ǥ = new int[9][9]; // ��ư�̹����� ��ǥ �迭
	//int _0����Y��ǥ=45, _1����Y��ǥ=11,_2����Y��ǥ=43,_3����Y��ǥ=9,_4����Y��ǥ=40,_5����Y��ǥ=8, _6����Y��ǥ=40,_7����Y��ǥ=7,_8����Y��ǥ=40; �Ⱦ�
	int �����������̴¸�=0; int �Ķ��������̴¸�=0;
	//��ư�� �̹��� �ο�
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//������ư
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
private ImageIcon ���������̹��� = new ImageIcon(main.class.getResource("../images/��������.png"));
private ImageIcon �Ķ������̹��� = new ImageIcon(main.class.getResource("../images/�Ķ������̹���.png"));
private ImageIcon �������¸��̹��� = new ImageIcon(main.class.getResource("../images/�������¸��̹���.png"));
private ImageIcon �Ķ����¸��̹��� = new ImageIcon(main.class.getResource("../images/�Ķ����¸��̹���.png"));
private ImageIcon ���º��̹��� = new ImageIcon(main.class.getResource("../images/���º��̹���.png"));
public JButton �������¸���ư = new JButton(�������¸��̹���); public JButton �Ķ����¸���ư = new JButton(�Ķ����¸��̹���);
public JButton ���ºι�ư = new JButton(���º��̹���);
private ImageIcon �����̹��� = new ImageIcon(main.class.getResource("../images/����������.png"));
private ImageIcon �ణ���ѻ����̹��� = new ImageIcon(main.class.getResource("../images/�ణ���ѻ�������.png"));
private ImageIcon ���ѻ����̹��� = new ImageIcon(main.class.getResource("../images/���ѻ�������.png"));
public JButton _0����0������ư = new JButton(�����̹���); public JButton _0����1������ư = new JButton(�����̹���); public JButton _0����2������ư = new JButton(�����̹���); public JButton _0����3������ư = new JButton(�����̹���);
public JButton _0����4������ư = new JButton(�����̹���); public JButton _0����5������ư = new JButton(�����̹���); public JButton _0����6������ư = new JButton(�����̹���); public JButton _0����7������ư = new JButton(�����̹���);
public JButton _0����8������ư = new JButton(�����̹���);
public JButton _1����0������ư = new JButton(�����̹���); public JButton _1����1������ư = new JButton(�����̹���); public JButton _1����2������ư = new JButton(�����̹���); public JButton _1����3������ư = new JButton(�����̹���);
public JButton _1����4������ư = new JButton(�����̹���); public JButton _1����5������ư = new JButton(�����̹���); public JButton _1����6������ư = new JButton(�����̹���); public JButton _1����7������ư = new JButton(�����̹���);
public JButton _1����8������ư = new JButton(�����̹���);
public JButton _2����0������ư = new JButton(�����̹���); public JButton _2����1������ư = new JButton(�����̹���); public JButton _2����2������ư = new JButton(�����̹���); public JButton _2����3������ư = new JButton(�����̹���);
public JButton _2����4������ư = new JButton(�����̹���); public JButton _2����5������ư = new JButton(�����̹���); public JButton _2����6������ư = new JButton(�����̹���); public JButton _2����7������ư = new JButton(�����̹���);
public JButton _2����8������ư = new JButton(�����̹���);
public JButton _3����0������ư = new JButton(�����̹���); public JButton _3����1������ư = new JButton(�����̹���); public JButton _3����2������ư = new JButton(�����̹���); public JButton _3����3������ư = new JButton(�����̹���);
public JButton _3����4������ư = new JButton(�����̹���); public JButton _3����5������ư = new JButton(�����̹���); public JButton _3����6������ư = new JButton(�����̹���); public JButton _3����7������ư = new JButton(�����̹���);
public JButton _3����8������ư = new JButton(�����̹���);
public JButton _4����0������ư = new JButton(�����̹���); public JButton _4����1������ư = new JButton(�����̹���); public JButton _4����2������ư = new JButton(�����̹���); public JButton _4����3������ư = new JButton(�����̹���);
public JButton _4����4������ư = new JButton(�����̹���); public JButton _4����5������ư = new JButton(�����̹���); public JButton _4����6������ư = new JButton(�����̹���); public JButton _4����7������ư = new JButton(�����̹���);
public JButton _4����8������ư = new JButton(�����̹���);
public JButton _5����0������ư = new JButton(�����̹���); public JButton _5����1������ư = new JButton(�����̹���); public JButton _5����2������ư = new JButton(�����̹���); public JButton _5����3������ư = new JButton(�����̹���);
public JButton _5����4������ư = new JButton(�����̹���); public JButton _5����5������ư = new JButton(�����̹���); public JButton _5����6������ư = new JButton(�����̹���); public JButton _5����7������ư = new JButton(�����̹���);
public JButton _5����8������ư = new JButton(�����̹���);
public JButton _6����0������ư = new JButton(�����̹���); public JButton _6����1������ư = new JButton(�����̹���); public JButton _6����2������ư = new JButton(�����̹���); public JButton _6����3������ư = new JButton(�����̹���);
public JButton _6����4������ư = new JButton(�����̹���); public JButton _6����5������ư = new JButton(�����̹���); public JButton _6����6������ư = new JButton(�����̹���); public JButton _6����7������ư = new JButton(�����̹���);
public JButton _6����8������ư = new JButton(�����̹���);
public JButton _7����0������ư = new JButton(�����̹���); public JButton _7����1������ư = new JButton(�����̹���); public JButton _7����2������ư = new JButton(�����̹���); public JButton _7����3������ư = new JButton(�����̹���);
public JButton _7����4������ư = new JButton(�����̹���); public JButton _7����5������ư = new JButton(�����̹���); public JButton _7����6������ư = new JButton(�����̹���); public JButton _7����7������ư = new JButton(�����̹���);
public JButton _7����8������ư = new JButton(�����̹���);
public JButton _8����0������ư = new JButton(�����̹���); public JButton _8����1������ư = new JButton(�����̹���); public JButton _8����2������ư = new JButton(�����̹���); public JButton _8����3������ư = new JButton(�����̹���);
public JButton _8����4������ư = new JButton(�����̹���); public JButton _8����5������ư = new JButton(�����̹���); public JButton _8����6������ư = new JButton(�����̹���); public JButton _8����7������ư = new JButton(�����̹���);
public JButton _8����8������ư = new JButton(�����̹���);
public JButton _0����0�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _0����1�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _0����2�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _0����3�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���);
public JButton _0����4�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _0����5�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _0����6�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _0����7�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���);
public JButton _0����8�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���);
public JButton _1����0�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _1����1�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _1����2�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _1����3�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���);
public JButton _1����4�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _1����5�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _1����6�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _1����7�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���);
public JButton _1����8�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���);
public JButton _2����0�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _2����1�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _2����2�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _2����3�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���);
public JButton _2����4�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _2����5�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _2����6�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _2����7�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���);
public JButton _2����8�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���);
public JButton _3����0�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _3����1�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _3����2�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _3����3�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���);
public JButton _3����4�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _3����5�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _3����6�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _3����7�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���);
public JButton _3����8�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���);
public JButton _4����0�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _4����1�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _4����2�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _4����3�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���);
public JButton _4����4�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _4����5�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _4����6�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _4����7�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���);
public JButton _4����8�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���);
public JButton _5����0�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _5����1�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _5����2�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _5����3�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���);
public JButton _5����4�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _5����5�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _5����6�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _5����7�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���);
public JButton _5����8�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���);
public JButton _6����0�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _6����1�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _6����2�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _6����3�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���);
public JButton _6����4�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _6����5�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _6����6�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _6����7�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���);
public JButton _6����8�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���);
public JButton _7����0�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _7����1�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _7����2�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _7����3�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���);
public JButton _7����4�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _7����5�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _7����6�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _7����7�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���);
public JButton _7����8�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���);
public JButton _8����0�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _8����1�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _8����2�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _8����3�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���);
public JButton _8����4�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _8����5�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _8����6�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���); public JButton _8����7�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���);
public JButton _8����8�ణ���ѻ�����ư = new JButton(�ణ���ѻ����̹���);
public JButton _0����0���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _0����1���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _0����2���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _0����3���ѻ�����ư = new JButton(���ѻ����̹���);
public JButton _0����4���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _0����5���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _0����6���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _0����7���ѻ�����ư = new JButton(���ѻ����̹���);
public JButton _0����8���ѻ�����ư = new JButton(���ѻ����̹���);
public JButton _1����0���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _1����1���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _1����2���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _1����3���ѻ�����ư = new JButton(���ѻ����̹���);
public JButton _1����4���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _1����5���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _1����6���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _1����7���ѻ�����ư = new JButton(���ѻ����̹���);
public JButton _1����8���ѻ�����ư = new JButton(���ѻ����̹���);
public JButton _2����0���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _2����1���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _2����2���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _2����3���ѻ�����ư = new JButton(���ѻ����̹���);
public JButton _2����4���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _2����5���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _2����6���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _2����7���ѻ�����ư = new JButton(���ѻ����̹���);
public JButton _2����8���ѻ�����ư = new JButton(���ѻ����̹���);
public JButton _3����0���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _3����1���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _3����2���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _3����3���ѻ�����ư = new JButton(���ѻ����̹���);
public JButton _3����4���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _3����5���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _3����6���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _3����7���ѻ�����ư = new JButton(���ѻ����̹���);
public JButton _3����8���ѻ�����ư = new JButton(���ѻ����̹���);
public JButton _4����0���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _4����1���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _4����2���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _4����3���ѻ�����ư = new JButton(���ѻ����̹���);
public JButton _4����4���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _4����5���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _4����6���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _4����7���ѻ�����ư = new JButton(���ѻ����̹���);
public JButton _4����8���ѻ�����ư = new JButton(���ѻ����̹���);
public JButton _5����0���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _5����1���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _5����2���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _5����3���ѻ�����ư = new JButton(���ѻ����̹���);
public JButton _5����4���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _5����5���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _5����6���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _5����7���ѻ�����ư = new JButton(���ѻ����̹���);
public JButton _5����8���ѻ�����ư = new JButton(���ѻ����̹���);
public JButton _6����0���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _6����1���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _6����2���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _6����3���ѻ�����ư = new JButton(���ѻ����̹���);
public JButton _6����4���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _6����5���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _6����6���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _6����7���ѻ�����ư = new JButton(���ѻ����̹���);
public JButton _6����8���ѻ�����ư = new JButton(���ѻ����̹���);
public JButton _7����0���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _7����1���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _7����2���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _7����3���ѻ�����ư = new JButton(���ѻ����̹���);
public JButton _7����4���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _7����5���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _7����6���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _7����7���ѻ�����ư = new JButton(���ѻ����̹���);
public JButton _7����8���ѻ�����ư = new JButton(���ѻ����̹���);
public JButton _8����0���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _8����1���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _8����2���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _8����3���ѻ�����ư = new JButton(���ѻ����̹���);
public JButton _8����4���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _8����5���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _8����6���ѻ�����ư = new JButton(���ѻ����̹���); public JButton _8����7���ѻ�����ư = new JButton(���ѻ����̹���);
public JButton _8����8���ѻ�����ư = new JButton(���ѻ����̹���);
private ImageIcon _����0 = new ImageIcon(main.class.getResource("../images/����0.png"));	private ImageIcon _����1 = new ImageIcon(main.class.getResource("../images/����1.png"));
private ImageIcon _����2 = new ImageIcon(main.class.getResource("../images/����2.png"));	private ImageIcon _����3 = new ImageIcon(main.class.getResource("../images/����3.png"));
private ImageIcon _����4 = new ImageIcon(main.class.getResource("../images/����4.png"));	private ImageIcon _����5 = new ImageIcon(main.class.getResource("../images/����5.png"));
private ImageIcon _����6 = new ImageIcon(main.class.getResource("../images/����6.png"));	private ImageIcon _����7 = new ImageIcon(main.class.getResource("../images/����7.png"));
private ImageIcon _����8 = new ImageIcon(main.class.getResource("../images/����8.png"));	private ImageIcon _����9 = new ImageIcon(main.class.getResource("../images/����9.png"));
public JButton ����0 = new JButton(_����0); public JButton ����1 = new JButton(_����1); public JButton ����2 = new JButton(_����2); public JButton ����3 = new JButton(_����3); public JButton ����4 = new JButton(_����4); 
public JButton ����5 = new JButton(_����5); public JButton ����6 = new JButton(_����6); public JButton ����7 = new JButton(_����7); public JButton ����8 = new JButton(_����8); public JButton ����9 = new JButton(_����9);
public JButton ����00 = new JButton(_����0); public JButton ����10 = new JButton(_����1); public JButton ����20 = new JButton(_����2); public JButton ����30 = new JButton(_����3); public JButton ����40 = new JButton(_����4); 
public JButton ����50 = new JButton(_����5); public JButton ����60 = new JButton(_����6); public JButton ����70 = new JButton(_����7); public JButton ����80 = new JButton(_����8); public JButton ����90 = new JButton(_����9);

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//�Ķ���ư
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
private ImageIcon �Ķ��̹��� = new ImageIcon(main.class.getResource("../images/�Ķ�������.png"));
private ImageIcon �ణ�����Ķ��̹��� = new ImageIcon(main.class.getResource("../images/�ణ�����Ķ�����.png"));
private ImageIcon �����Ķ��̹��� = new ImageIcon(main.class.getResource("../images/�����Ķ�����.png"));
public JButton _0����0�Ķ���ư = new JButton(�Ķ��̹���); public JButton _0����1�Ķ���ư = new JButton(�Ķ��̹���); public JButton _0����2�Ķ���ư = new JButton(�Ķ��̹���); public JButton _0����3�Ķ���ư = new JButton(�Ķ��̹���);
public JButton _0����4�Ķ���ư = new JButton(�Ķ��̹���); public JButton _0����5�Ķ���ư = new JButton(�Ķ��̹���); public JButton _0����6�Ķ���ư = new JButton(�Ķ��̹���); public JButton _0����7�Ķ���ư = new JButton(�Ķ��̹���);
public JButton _0����8�Ķ���ư = new JButton(�Ķ��̹���);
public JButton _1����0�Ķ���ư = new JButton(�Ķ��̹���); public JButton _1����1�Ķ���ư = new JButton(�Ķ��̹���); public JButton _1����2�Ķ���ư = new JButton(�Ķ��̹���); public JButton _1����3�Ķ���ư = new JButton(�Ķ��̹���);
public JButton _1����4�Ķ���ư = new JButton(�Ķ��̹���); public JButton _1����5�Ķ���ư = new JButton(�Ķ��̹���); public JButton _1����6�Ķ���ư = new JButton(�Ķ��̹���); public JButton _1����7�Ķ���ư = new JButton(�Ķ��̹���);
public JButton _1����8�Ķ���ư = new JButton(�Ķ��̹���);
public JButton _2����0�Ķ���ư = new JButton(�Ķ��̹���); public JButton _2����1�Ķ���ư = new JButton(�Ķ��̹���); public JButton _2����2�Ķ���ư = new JButton(�Ķ��̹���); public JButton _2����3�Ķ���ư = new JButton(�Ķ��̹���);
public JButton _2����4�Ķ���ư = new JButton(�Ķ��̹���); public JButton _2����5�Ķ���ư = new JButton(�Ķ��̹���); public JButton _2����6�Ķ���ư = new JButton(�Ķ��̹���); public JButton _2����7�Ķ���ư = new JButton(�Ķ��̹���);
public JButton _2����8�Ķ���ư = new JButton(�Ķ��̹���);
public JButton _3����0�Ķ���ư = new JButton(�Ķ��̹���); public JButton _3����1�Ķ���ư = new JButton(�Ķ��̹���); public JButton _3����2�Ķ���ư = new JButton(�Ķ��̹���); public JButton _3����3�Ķ���ư = new JButton(�Ķ��̹���);
public JButton _3����4�Ķ���ư = new JButton(�Ķ��̹���); public JButton _3����5�Ķ���ư = new JButton(�Ķ��̹���); public JButton _3����6�Ķ���ư = new JButton(�Ķ��̹���); public JButton _3����7�Ķ���ư = new JButton(�Ķ��̹���);
public JButton _3����8�Ķ���ư = new JButton(�Ķ��̹���);
public JButton _4����0�Ķ���ư = new JButton(�Ķ��̹���); public JButton _4����1�Ķ���ư = new JButton(�Ķ��̹���); public JButton _4����2�Ķ���ư = new JButton(�Ķ��̹���); public JButton _4����3�Ķ���ư = new JButton(�Ķ��̹���);
public JButton _4����4�Ķ���ư = new JButton(�Ķ��̹���); public JButton _4����5�Ķ���ư = new JButton(�Ķ��̹���); public JButton _4����6�Ķ���ư = new JButton(�Ķ��̹���); public JButton _4����7�Ķ���ư = new JButton(�Ķ��̹���);
public JButton _4����8�Ķ���ư = new JButton(�Ķ��̹���);
public JButton _5����0�Ķ���ư = new JButton(�Ķ��̹���); public JButton _5����1�Ķ���ư = new JButton(�Ķ��̹���); public JButton _5����2�Ķ���ư = new JButton(�Ķ��̹���); public JButton _5����3�Ķ���ư = new JButton(�Ķ��̹���);
public JButton _5����4�Ķ���ư = new JButton(�Ķ��̹���); public JButton _5����5�Ķ���ư = new JButton(�Ķ��̹���); public JButton _5����6�Ķ���ư = new JButton(�Ķ��̹���); public JButton _5����7�Ķ���ư = new JButton(�Ķ��̹���);
public JButton _5����8�Ķ���ư = new JButton(�Ķ��̹���);
public JButton _6����0�Ķ���ư = new JButton(�Ķ��̹���); public JButton _6����1�Ķ���ư = new JButton(�Ķ��̹���); public JButton _6����2�Ķ���ư = new JButton(�Ķ��̹���); public JButton _6����3�Ķ���ư = new JButton(�Ķ��̹���);
public JButton _6����4�Ķ���ư = new JButton(�Ķ��̹���); public JButton _6����5�Ķ���ư = new JButton(�Ķ��̹���); public JButton _6����6�Ķ���ư = new JButton(�Ķ��̹���); public JButton _6����7�Ķ���ư = new JButton(�Ķ��̹���);
public JButton _6����8�Ķ���ư = new JButton(�Ķ��̹���);
public JButton _7����0�Ķ���ư = new JButton(�Ķ��̹���); public JButton _7����1�Ķ���ư = new JButton(�Ķ��̹���); public JButton _7����2�Ķ���ư = new JButton(�Ķ��̹���); public JButton _7����3�Ķ���ư = new JButton(�Ķ��̹���);
public JButton _7����4�Ķ���ư = new JButton(�Ķ��̹���); public JButton _7����5�Ķ���ư = new JButton(�Ķ��̹���); public JButton _7����6�Ķ���ư = new JButton(�Ķ��̹���); public JButton _7����7�Ķ���ư = new JButton(�Ķ��̹���);
public JButton _7����8�Ķ���ư = new JButton(�Ķ��̹���);
public JButton _8����0�Ķ���ư = new JButton(�Ķ��̹���); public JButton _8����1�Ķ���ư = new JButton(�Ķ��̹���); public JButton _8����2�Ķ���ư = new JButton(�Ķ��̹���); public JButton _8����3�Ķ���ư = new JButton(�Ķ��̹���);
public JButton _8����4�Ķ���ư = new JButton(�Ķ��̹���); public JButton _8����5�Ķ���ư = new JButton(�Ķ��̹���); public JButton _8����6�Ķ���ư = new JButton(�Ķ��̹���); public JButton _8����7�Ķ���ư = new JButton(�Ķ��̹���);
public JButton _8����8�Ķ���ư = new JButton(�Ķ��̹���);
public JButton _0����0�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _0����1�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _0����2�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _0����3�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���);
public JButton _0����4�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _0����5�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _0����6�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _0����7�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���);
public JButton _0����8�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���);
public JButton _1����0�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _1����1�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _1����2�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _1����3�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���);
public JButton _1����4�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _1����5�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _1����6�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _1����7�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���);
public JButton _1����8�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���);
public JButton _2����0�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _2����1�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _2����2�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _2����3�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���);
public JButton _2����4�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _2����5�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _2����6�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _2����7�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���);
public JButton _2����8�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���);
public JButton _3����0�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _3����1�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _3����2�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _3����3�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���);
public JButton _3����4�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _3����5�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _3����6�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _3����7�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���);
public JButton _3����8�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���);
public JButton _4����0�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _4����1�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _4����2�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _4����3�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���);
public JButton _4����4�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _4����5�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _4����6�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _4����7�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���);
public JButton _4����8�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���);
public JButton _5����0�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _5����1�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _5����2�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _5����3�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���);
public JButton _5����4�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _5����5�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _5����6�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _5����7�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���);
public JButton _5����8�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���);
public JButton _6����0�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _6����1�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _6����2�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _6����3�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���);
public JButton _6����4�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _6����5�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _6����6�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _6����7�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���);
public JButton _6����8�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���);
public JButton _7����0�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _7����1�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _7����2�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _7����3�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���);
public JButton _7����4�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _7����5�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _7����6�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _7����7�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���);
public JButton _7����8�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���);
public JButton _8����0�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _8����1�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _8����2�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _8����3�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���);
public JButton _8����4�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _8����5�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _8����6�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���); public JButton _8����7�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���);
public JButton _8����8�ణ�����Ķ���ư = new JButton(�ణ�����Ķ��̹���);
public JButton _0����0�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _0����1�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _0����2�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _0����3�����Ķ���ư = new JButton(�����Ķ��̹���);
public JButton _0����4�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _0����5�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _0����6�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _0����7�����Ķ���ư = new JButton(�����Ķ��̹���);
public JButton _0����8�����Ķ���ư = new JButton(�����Ķ��̹���);
public JButton _1����0�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _1����1�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _1����2�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _1����3�����Ķ���ư = new JButton(�����Ķ��̹���);
public JButton _1����4�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _1����5�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _1����6�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _1����7�����Ķ���ư = new JButton(�����Ķ��̹���);
public JButton _1����8�����Ķ���ư = new JButton(�����Ķ��̹���);
public JButton _2����0�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _2����1�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _2����2�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _2����3�����Ķ���ư = new JButton(�����Ķ��̹���);
public JButton _2����4�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _2����5�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _2����6�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _2����7�����Ķ���ư = new JButton(�����Ķ��̹���);
public JButton _2����8�����Ķ���ư = new JButton(�����Ķ��̹���);
public JButton _3����0�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _3����1�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _3����2�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _3����3�����Ķ���ư = new JButton(�����Ķ��̹���);
public JButton _3����4�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _3����5�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _3����6�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _3����7�����Ķ���ư = new JButton(�����Ķ��̹���);
public JButton _3����8�����Ķ���ư = new JButton(�����Ķ��̹���);
public JButton _4����0�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _4����1�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _4����2�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _4����3�����Ķ���ư = new JButton(�����Ķ��̹���);
public JButton _4����4�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _4����5�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _4����6�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _4����7�����Ķ���ư = new JButton(�����Ķ��̹���);
public JButton _4����8�����Ķ���ư = new JButton(�����Ķ��̹���);
public JButton _5����0�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _5����1�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _5����2�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _5����3�����Ķ���ư = new JButton(�����Ķ��̹���);
public JButton _5����4�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _5����5�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _5����6�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _5����7�����Ķ���ư = new JButton(�����Ķ��̹���);
public JButton _5����8�����Ķ���ư = new JButton(�����Ķ��̹���);
public JButton _6����0�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _6����1�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _6����2�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _6����3�����Ķ���ư = new JButton(�����Ķ��̹���);
public JButton _6����4�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _6����5�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _6����6�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _6����7�����Ķ���ư = new JButton(�����Ķ��̹���);
public JButton _6����8�����Ķ���ư = new JButton(�����Ķ��̹���);
public JButton _7����0�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _7����1�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _7����2�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _7����3�����Ķ���ư = new JButton(�����Ķ��̹���);
public JButton _7����4�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _7����5�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _7����6�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _7����7�����Ķ���ư = new JButton(�����Ķ��̹���);
public JButton _7����8�����Ķ���ư = new JButton(�����Ķ��̹���);
public JButton _8����0�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _8����1�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _8����2�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _8����3�����Ķ���ư = new JButton(�����Ķ��̹���);
public JButton _8����4�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _8����5�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _8����6�����Ķ���ư = new JButton(�����Ķ��̹���); public JButton _8����7�����Ķ���ư = new JButton(�����Ķ��̹���);
public JButton _8����8�����Ķ���ư = new JButton(�����Ķ��̹���);
private ImageIcon _�Ķ�0 = new ImageIcon(main.class.getResource("../images/�Ķ�0.png"));	private ImageIcon _�Ķ�1 = new ImageIcon(main.class.getResource("../images/�Ķ�1.png"));
private ImageIcon _�Ķ�2 = new ImageIcon(main.class.getResource("../images/�Ķ�2.png"));	private ImageIcon _�Ķ�3 = new ImageIcon(main.class.getResource("../images/�Ķ�3.png"));
private ImageIcon _�Ķ�4 = new ImageIcon(main.class.getResource("../images/�Ķ�4.png"));	private ImageIcon _�Ķ�5 = new ImageIcon(main.class.getResource("../images/�Ķ�5.png"));
private ImageIcon _�Ķ�6 = new ImageIcon(main.class.getResource("../images/�Ķ�6.png"));	private ImageIcon _�Ķ�7 = new ImageIcon(main.class.getResource("../images/�Ķ�7.png"));
private ImageIcon _�Ķ�8 = new ImageIcon(main.class.getResource("../images/�Ķ�8.png"));	private ImageIcon _�Ķ�9 = new ImageIcon(main.class.getResource("../images/�Ķ�9.png"));
public JButton �Ķ�0 = new JButton(_�Ķ�0); public JButton �Ķ�1 = new JButton(_�Ķ�1); public JButton �Ķ�2 = new JButton(_�Ķ�2); public JButton �Ķ�3 = new JButton(_�Ķ�3); public JButton �Ķ�4 = new JButton(_�Ķ�4); 
public JButton �Ķ�5 = new JButton(_�Ķ�5); public JButton �Ķ�6 = new JButton(_�Ķ�6); public JButton �Ķ�7 = new JButton(_�Ķ�7); public JButton �Ķ�8 = new JButton(_�Ķ�8); public JButton �Ķ�9 = new JButton(_�Ķ�9);
public JButton �Ķ�00 = new JButton(_�Ķ�0); public JButton �Ķ�10 = new JButton(_�Ķ�1); public JButton �Ķ�20 = new JButton(_�Ķ�2); public JButton �Ķ�30 = new JButton(_�Ķ�3); public JButton �Ķ�40 = new JButton(_�Ķ�4); 
public JButton �Ķ�50 = new JButton(_�Ķ�5); public JButton �Ķ�60 = new JButton(_�Ķ�6); public JButton �Ķ�70 = new JButton(_�Ķ�7); public JButton �Ķ�80 = new JButton(_�Ķ�8); public JButton �Ķ�90 = new JButton(_�Ķ�9);

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
private ImageIcon _�⺻0 = new ImageIcon(main.class.getResource("../images/�⺻0.png"));	private ImageIcon _�⺻1 = new ImageIcon(main.class.getResource("../images/�⺻1.png"));
private ImageIcon _�⺻2 = new ImageIcon(main.class.getResource("../images/�⺻2.png"));	private ImageIcon _�⺻3 = new ImageIcon(main.class.getResource("../images/�⺻3.png"));
private ImageIcon _�⺻4 = new ImageIcon(main.class.getResource("../images/�⺻4.png"));	private ImageIcon _�⺻5 = new ImageIcon(main.class.getResource("../images/�⺻5.png"));
private ImageIcon _�⺻6 = new ImageIcon(main.class.getResource("../images/�⺻6.png"));	private ImageIcon _�⺻7 = new ImageIcon(main.class.getResource("../images/�⺻7.png"));
private ImageIcon _�⺻8 = new ImageIcon(main.class.getResource("../images/�⺻8.png"));	private ImageIcon _�⺻9 = new ImageIcon(main.class.getResource("../images/�⺻9.png"));
public JButton �⺻0 = new JButton(_�⺻0); public JButton �⺻1 = new JButton(_�⺻1); public JButton �⺻2 = new JButton(_�⺻2); public JButton �⺻3 = new JButton(_�⺻3); public JButton �⺻4 = new JButton(_�⺻4); 
public JButton �⺻5 = new JButton(_�⺻5); public JButton �⺻6 = new JButton(_�⺻6); public JButton �⺻7 = new JButton(_�⺻7); public JButton �⺻8 = new JButton(_�⺻8); public JButton �⺻9 = new JButton(_�⺻9);
public JButton �������� = new JButton(���������̹���);
public JButton �Ķ����� = new JButton(�Ķ������̹���);
private ImageIcon _������ư = new ImageIcon(main.class.getResource("../images/������ư.png"));
public JButton ������ư = new JButton(_������ư);
private ImageIcon _�ڷι�ư = new ImageIcon(main.class.getResource("../images/�ڷι�ư.png"));
public JButton �ڷι�ư = new JButton(_�ڷι�ư);
	private ImageIcon �����ưȰ��ȭ�̹��� = new ImageIcon(main.class.getResource("../images/�����ϱ�Ȱ��ȭ.png"));//���콺 �÷����� �̹���
	private ImageIcon �����ư�̹��� = new ImageIcon(main.class.getResource("../images/�����ϱ�.png"));
	private JButton �����ư = new JButton(�����ư�̹���);
	//
	private ImageIcon �޴����ưȰ��ȭ�̹��� = new ImageIcon(main.class.getResource("../images/�޴���Ȱ��ȭ.png"));
	private ImageIcon �޴����ư�̹��� = new ImageIcon(main.class.getResource("../images/�޴���.png"));
	private JButton �޴����ư = new JButton(�޴����ư�̹���);
	//
	private ImageIcon ���۹�ưȰ��ȭ�̹��� = new ImageIcon(main.class.getResource("../images/�����ϱ�Ȱ��ȭ.png"));
	private ImageIcon ���۹�ư�̹��� = new ImageIcon(main.class.getResource("../images/�����ϱ�.png"));
	private JButton ���۹�ư = new JButton(���۹�ư�̹���);
	//
	private ImageIcon ���ʸ�Ȱ��ȭ�̹��� = new ImageIcon(main.class.getResource("../images/������Ȱ��ȭ.png")); //������
	private ImageIcon ���ʸ��̹��� = new ImageIcon(main.class.getResource("../images/������.png"));
	private ImageIcon �����ʸ�Ȱ��ȭ�̹��� = new ImageIcon(main.class.getResource("../images/������2Ȱ��ȭ.png")); //�簢��
	private ImageIcon �����ʸ��̹��� = new ImageIcon(main.class.getResource("../images/������2.png"));
	private JButton ���ʸʹ�ư = new JButton(���ʸ��̹���);
	private JButton �����ʸʹ�ư = new JButton(�����ʸ��̹���);
	//
	private ImageIcon ���ư����ưȰ��ȭ�̹��� = new ImageIcon(main.class.getResource("../images/������Ȱ��ȭ.png"));//���ư����ưȰ��ȭ
	private ImageIcon ���ư����ư�̹��� = new ImageIcon(main.class.getResource("../images/������.png"));
	private JButton ���ư����ư = new JButton(���ư����ư�̹���);
	private ImageIcon �޴��ε��ư����ưȰ��ȭ�̹��� = new ImageIcon(main.class.getResource("../images/���ư���Ȱ��ȭ.png"));//�޴��ε��ư����ưȰ��ȭ
	private ImageIcon �޴��ε��ư����ư�̹��� = new ImageIcon(main.class.getResource("../images/���ư���.png"));
	private JButton �޴��ε��ư����ư = new JButton(�޴��ε��ư����ư�̹���);
	//
	private JLabel ����1 = new JLabel("�޴���");private JLabel ����2 = new JLabel("�޴���");private JLabel ����3 = new JLabel("�޴���");
	private JLabel �¸�1 = new JLabel("�޴���");private JLabel �¸�2 = new JLabel("�޴���");
	private JLabel ���� = new JLabel("�޴���");
	private JLabel �ΰ� = new JLabel("�ΰ�");
	private JLabel �ʼ����̹��� = new JLabel("�ʼ���");
	private JLabel �⺻��� = new JLabel("��椻");
	private JLabel ��� = new JLabel("1����"); // ����̹���
	private JLabel ���1 = new JLabel("2����");
	//
	//private int mouseX, mouseY;
	//
	private int �ʹ�ȣ = 0;// 1 ������ | 2 �簢��
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void G����() {
		//setUndecorated(true);//�׵θ� �ȳ������ϴ°�
		setTitle("�� �� ��");
		setSize(main.SCREEN_WIDTH, main.SCREEN_HEIGHT);//main���� â ũ�� ����
		setResizable(false);//��
		setLocationRelativeTo(null);//��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //���������X��ư ��Ȱ��ȭ ����
		setVisible(true);//Ȱ��ȭ ���� | true ���� / false �Ⱥ���
		JLabel �� = new JLabel("�� �� ��"); //Ÿ��Ʋ �̸�
		try {
			�⺻���.setVisible(false);
			�����ư.setVisible(false);
			���۹�ư.setVisible(false);
			�޴����ư.setVisible(false);
			�ΰ�.setVisible(false);
			Thread.sleep(100);//10ms��ŭ ����ϰ� ������ϸ� catch������ �Ѿ
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////			
	�����ư.setBounds(880, 580, 400, 100);//��ư ��ǥ �� �̹���ũ�� (X,Y,����,����)
	�����ư.setBorderPainted(false); //�̰Ŷ�
	�����ư.setContentAreaFilled(false); //�̰�
	�����ư.setFocusPainted(false); //�̰��ϸ� �̹����� ��µ�
	�����ư.addMouseListener(new MouseAdapter() { // ���콺 �ν�
		@Override
		public void mouseEntered(MouseEvent e) {// ���콺Ŀ���� ������
			�����ư.setIcon(�����ưȰ��ȭ�̹���);
			�����ư.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		@Override
		public void mouseExited(MouseEvent e) {// ���콺Ŀ���� ������
			�����ư.setIcon(�����ư�̹���);
			�����ư.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}
		@Override
		public void mousePressed(MouseEvent e) {// Ŭ���ϰԵǸ�
			try {
				Thread.sleep(100);//10ms��ŭ ����ϰ� ������ϸ� catch������ �Ѿ
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			System.exit(0); // ����
		}
	}); getContentPane().add(�����ư);//��ư �����ְ����ִ°� ������ ���� ��
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	�������¸���ư.setBounds(10, 150, 915, 384);//��ư ��ǥ �� �̹���ũ�� (X,Y,����,����)
	�������¸���ư.setVisible(false);
	�������¸���ư.setBorderPainted(false); //�̰Ŷ�
	�������¸���ư.setContentAreaFilled(false); //�̰�
	�������¸���ư.setFocusPainted(false); //�̰��ϸ� �̹����� ��µ�
	�������¸���ư.addMouseListener(new MouseAdapter() { // ���콺 �ν�
		@Override
		public void mouseEntered(MouseEvent e) {// ���콺Ŀ���� ������
			�������¸���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		@Override
		public void mousePressed(MouseEvent e) {// Ŭ���ϰԵǸ�
			�ʼ���ȭ������();
		}
	}); getContentPane().add(�������¸���ư);
	
	�Ķ����¸���ư.setBounds(10, 150, 915, 384);//��ư ��ǥ �� �̹���ũ�� (X,Y,����,����)
	�Ķ����¸���ư.setVisible(false);
	�Ķ����¸���ư.setBorderPainted(false); //�̰Ŷ�
	�Ķ����¸���ư.setContentAreaFilled(false); //�̰�
	�Ķ����¸���ư.setFocusPainted(false); //�̰��ϸ� �̹����� ��µ�
	�Ķ����¸���ư.addMouseListener(new MouseAdapter() { // ���콺 �ν�
		@Override
		public void mouseEntered(MouseEvent e) {// ���콺Ŀ���� ������
			�Ķ����¸���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		@Override
		public void mousePressed(MouseEvent e) {// Ŭ���ϰԵǸ�
			�ʼ���ȭ������();
		}
	}); getContentPane().add(�Ķ����¸���ư);
	
	���ºι�ư.setBounds(10, 150, 915, 384);//��ư ��ǥ �� �̹���ũ�� (X,Y,����,����)
	���ºι�ư.setVisible(false);
	���ºι�ư.setBorderPainted(false); //�̰Ŷ�
	���ºι�ư.setContentAreaFilled(false); //�̰�
	���ºι�ư.setFocusPainted(false); //�̰��ϸ� �̹����� ��µ�
	���ºι�ư.addMouseListener(new MouseAdapter() { // ���콺 �ν�
		@Override
		public void mouseEntered(MouseEvent e) {// ���콺Ŀ���� ������
			���ºι�ư.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		@Override
		public void mousePressed(MouseEvent e) {// Ŭ���ϰԵǸ�
			�ʼ���ȭ������();
		}
	}); getContentPane().add(���ºι�ư);
	�޴��ε��ư����ư.setBounds(1099, 602, 163, 68);
 	�޴��ε��ư����ư.setVisible(false);
 	�޴��ε��ư����ư.setBorderPainted(false);
 	�޴��ε��ư����ư.setContentAreaFilled(false);
 	�޴��ε��ư����ư.setFocusPainted(false);
 	�޴��ε��ư����ư.addMouseListener(new MouseAdapter() {
 		@Override
 		public void mouseEntered(MouseEvent e) {
 			�޴��ε��ư����ư.setIcon(�޴��ε��ư����ưȰ��ȭ�̹���);
 			�޴��ε��ư����ư.setCursor(new Cursor(Cursor.HAND_CURSOR));
 		}
 		@Override
 		public void mouseExited(MouseEvent e) {
 			�޴��ε��ư����ư.setIcon(�޴��ε��ư����ư�̹���);
 			�޴��ε��ư����ư.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
 		}
 		@Override
 		public void mousePressed(MouseEvent e) {
 			����ȭ������();
 		}
 	}); getContentPane().add(�޴��ε��ư����ư);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 	���ư����ư.setBounds(1099, 602, 163, 68);
 	���ư����ư.setVisible(false);
 	���ư����ư.setBorderPainted(false);
 	���ư����ư.setContentAreaFilled(false);
 	���ư����ư.setFocusPainted(false);
 	���ư����ư.addMouseListener(new MouseAdapter() {
 		@Override
 		public void mouseEntered(MouseEvent e) {
 			���ư����ư.setIcon(���ư����ưȰ��ȭ�̹���);
 			���ư����ư.setCursor(new Cursor(Cursor.HAND_CURSOR));
 		}
 		@Override
 		public void mouseExited(MouseEvent e) {
 			���ư����ư.setIcon(���ư����ư�̹���);
 			���ư����ư.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
 		}
 		@Override
 		public void mousePressed(MouseEvent e) {
 			�ʼ���ȭ������();
 		}
 	}); getContentPane().add(���ư����ư);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	���۹�ư.setBounds(880, 320, 400, 100);
	���۹�ư.setBorderPainted(false);
	���۹�ư.setContentAreaFilled(false);
	���۹�ư.setFocusPainted(false);
	���۹�ư.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseEntered(MouseEvent e) {
			���۹�ư.setIcon(���۹�ưȰ��ȭ�̹���);
			���۹�ư.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		@Override
		public void mouseExited(MouseEvent e) {
			���۹�ư.setIcon(���۹�ư�̹���);
			���۹�ư.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}
		@Override
		public void mousePressed(MouseEvent e) {
			try {
				Thread.sleep(100);//100ms��ŭ ����ϰ� ������ϸ� catch������ �Ѿ
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			�ʼ���ȭ��();
	}
	}); getContentPane().add(���۹�ư);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	�޴����ư.setBounds(880, 450, 400, 100);
	�޴����ư.setBorderPainted(false);
	�޴����ư.setContentAreaFilled(false);
	�޴����ư.setFocusPainted(false);
	�޴����ư.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseEntered(MouseEvent e) {
			�޴����ư.setIcon(�޴����ưȰ��ȭ�̹���);
			�޴����ư.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		@Override
		public void mouseExited(MouseEvent e) {
			�޴����ư.setIcon(�޴����ư�̹���);
			�޴����ư.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}
		@Override
		public void mousePressed(MouseEvent e) {
			�޴���();
	}
	}); getContentPane().add(�޴����ư); 
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	���ʸʹ�ư.setBounds(135, 200, 450, 300);	
	���ʸʹ�ư.setVisible(false);
	���ʸʹ�ư.setBorderPainted(false);
	���ʸʹ�ư.setContentAreaFilled(false);
	���ʸʹ�ư.setFocusPainted(false);
	���ʸʹ�ư.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseEntered(MouseEvent e) {
			���ʸʹ�ư.setIcon(���ʸ�Ȱ��ȭ�̹���);
			���ʸʹ�ư.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		@Override
		public void mouseExited(MouseEvent e) {
			���ʸʹ�ư.setIcon(���ʸ��̹���);
			���ʸʹ�ư.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}
		@Override
		public void mousePressed(MouseEvent e) {
			�ʹ�ȣ = 1;
			�ʽ���();
		}
	});	getContentPane().add(���ʸʹ�ư);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	�����ʸʹ�ư.setBounds(597, 200, 450, 300);
	�����ʸʹ�ư.setVisible(false);
	�����ʸʹ�ư.setBorderPainted(false);
	�����ʸʹ�ư.setContentAreaFilled(false);
	�����ʸʹ�ư.setFocusPainted(false);
	�����ʸʹ�ư.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseEntered(MouseEvent e) {
			�����ʸʹ�ư.setIcon(�����ʸ�Ȱ��ȭ�̹���);
			�����ʸʹ�ư.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		@Override
		public void mouseExited(MouseEvent e) {
			�����ʸʹ�ư.setIcon(�����ʸ��̹���);
			�����ʸʹ�ư.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}
		@Override
		public void mousePressed(MouseEvent e) {
			�ʹ�ȣ = 2;
			�ʽ���();
		}
	}); getContentPane().add(�����ʸʹ�ư);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
	for(int i=0;i<9;i++){
		if(i==0) {X��ǥ[i]=54;}
		else {X��ǥ[i]=X��ǥ[i-1]+85;}//�� �ٸ��� x��ǥ�� 85�� ���̳�
		}
	Y��ǥ[0][0]=45; Y��ǥ[1][0]=11; Y��ǥ[2][0]=43; Y��ǥ[3][0]=9; Y��ǥ[4][0]=40; Y��ǥ[5][0]=8; Y��ǥ[6][0]=40; Y��ǥ[7][0]=7; Y��ǥ[8][0]=40;//���� ù��° ��ư�鸸 y��ǥ ���� �ο�
	for(int i=0;i<9;i++){
		for(int j=1;j<9;j++){Y��ǥ[i][j] = Y��ǥ[i][j-1]+67;}//�� ��ư�� ���� y��ǥ�� 67�� ���̳�
	}
	//��� ��ư�� ��ǥ �� �̹���ũ�� �����ϰ� ���ܵ�			������ ��ĭ, ����, �Ķ�, �ణ�����Ķ��� ����
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	��������.setBounds(868,0,400,100); ��������.setVisible(false); ��������.setBorderPainted(false); ��������.setContentAreaFilled(false); ��������.setFocusPainted(false);
	����0.setBounds(990,90,50,100); ����0.setVisible(false); ����0.setBorderPainted(false); ����0.setContentAreaFilled(false); ����0.setFocusPainted(false);
	����1.setBounds(990,90,50,100); ����1.setVisible(false); ����1.setBorderPainted(false); ����1.setContentAreaFilled(false); ����1.setFocusPainted(false);
	����2.setBounds(990,90,50,100); ����2.setVisible(false); ����2.setBorderPainted(false); ����2.setContentAreaFilled(false); ����2.setFocusPainted(false);
	����3.setBounds(990,90,50,100); ����3.setVisible(false); ����3.setBorderPainted(false); ����3.setContentAreaFilled(false); ����3.setFocusPainted(false);
	����4.setBounds(990,90,50,100); ����4.setVisible(false); ����4.setBorderPainted(false); ����4.setContentAreaFilled(false); ����4.setFocusPainted(false);
	����5.setBounds(990,90,50,100); ����5.setVisible(false); ����5.setBorderPainted(false); ����5.setContentAreaFilled(false); ����5.setFocusPainted(false);
	����6.setBounds(990,90,50,100); ����6.setVisible(false); ����6.setBorderPainted(false); ����6.setContentAreaFilled(false); ����6.setFocusPainted(false);
	����7.setBounds(990,90,50,100); ����7.setVisible(false); ����7.setBorderPainted(false); ����7.setContentAreaFilled(false); ����7.setFocusPainted(false);
	����8.setBounds(990,90,50,100); ����8.setVisible(false); ����8.setBorderPainted(false); ����8.setContentAreaFilled(false); ����8.setFocusPainted(false);
	����9.setBounds(990,90,50,100); ����9.setVisible(false); ����9.setBorderPainted(false); ����9.setContentAreaFilled(false); ����9.setFocusPainted(false);
	 getContentPane().add(����0); getContentPane().add(����1); getContentPane().add(����2); getContentPane().add(����3); getContentPane().add(����4);
	 getContentPane().add(����5); getContentPane().add(����6); getContentPane().add(����7); getContentPane().add(����8); getContentPane().add(����9);
		����00.setBounds(940,90,50,100); ����00.setVisible(false); ����00.setBorderPainted(false); ����00.setContentAreaFilled(false); ����00.setFocusPainted(false);
		����10.setBounds(940,90,50,100); ����10.setVisible(false); ����10.setBorderPainted(false); ����10.setContentAreaFilled(false); ����10.setFocusPainted(false);
		����20.setBounds(940,90,50,100); ����20.setVisible(false); ����20.setBorderPainted(false); ����20.setContentAreaFilled(false); ����20.setFocusPainted(false);
		����30.setBounds(940,90,50,100); ����30.setVisible(false); ����30.setBorderPainted(false); ����30.setContentAreaFilled(false); ����30.setFocusPainted(false);
		����40.setBounds(940,90,50,100); ����40.setVisible(false); ����40.setBorderPainted(false); ����40.setContentAreaFilled(false); ����40.setFocusPainted(false);
		����50.setBounds(940,90,50,100); ����50.setVisible(false); ����50.setBorderPainted(false); ����50.setContentAreaFilled(false); ����50.setFocusPainted(false);
		����60.setBounds(940,90,50,100); ����60.setVisible(false); ����60.setBorderPainted(false); ����60.setContentAreaFilled(false); ����60.setFocusPainted(false);
		����70.setBounds(940,90,50,100); ����70.setVisible(false); ����70.setBorderPainted(false); ����70.setContentAreaFilled(false); ����70.setFocusPainted(false);
		����80.setBounds(940,90,50,100); ����80.setVisible(false); ����80.setBorderPainted(false); ����80.setContentAreaFilled(false); ����80.setFocusPainted(false);
		����90.setBounds(940,90,50,100); ����90.setVisible(false); ����90.setBorderPainted(false); ����90.setContentAreaFilled(false); ����90.setFocusPainted(false);
		 getContentPane().add(����00); getContentPane().add(����10); getContentPane().add(����20); getContentPane().add(����30); getContentPane().add(����40);
		 getContentPane().add(����50); getContentPane().add(����60); getContentPane().add(����70); getContentPane().add(����80); getContentPane().add(����90); 
	 _0����0������ư.setBounds(X��ǥ[0], Y��ǥ[0][0], 120, 60); _0����0������ư.setVisible(false); _0����0������ư.setBorderPainted(false); _0����0������ư.setContentAreaFilled(false); _0����0������ư.setFocusPainted(false); _0����0������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _0����0������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(0,0);}}});
	 getContentPane().add(_0����0������ư);
	 _0����1������ư.setBounds(X��ǥ[0], Y��ǥ[0][1], 120, 60); _0����1������ư.setVisible(false); _0����1������ư.setBorderPainted(false); _0����1������ư.setContentAreaFilled(false); _0����1������ư.setFocusPainted(false); _0����1������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _0����1������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(0,1);}}});
	 getContentPane().add(_0����1������ư);
	 _0����2������ư.setBounds(X��ǥ[0], Y��ǥ[0][2], 120, 60); _0����2������ư.setVisible(false); _0����2������ư.setBorderPainted(false); _0����2������ư.setContentAreaFilled(false); _0����2������ư.setFocusPainted(false); _0����2������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _0����2������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(0,2);}}});
	 getContentPane().add(_0����2������ư);
	 _0����3������ư.setBounds(X��ǥ[0], Y��ǥ[0][3], 120, 60); _0����3������ư.setVisible(false); _0����3������ư.setBorderPainted(false); _0����3������ư.setContentAreaFilled(false); _0����3������ư.setFocusPainted(false); _0����3������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _0����3������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(0,3);}}});
	 getContentPane().add(_0����3������ư);
	 _0����4������ư.setBounds(X��ǥ[0], Y��ǥ[0][4], 120, 60); _0����4������ư.setVisible(false); _0����4������ư.setBorderPainted(false); _0����4������ư.setContentAreaFilled(false); _0����4������ư.setFocusPainted(false); _0����4������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _0����4������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(0,4);}}});
	 getContentPane().add(_0����4������ư);
	 _0����5������ư.setBounds(X��ǥ[0], Y��ǥ[0][5], 120, 60); _0����5������ư.setVisible(false); _0����5������ư.setBorderPainted(false); _0����5������ư.setContentAreaFilled(false); _0����5������ư.setFocusPainted(false); _0����5������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _0����5������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(0,5);}}});
	 getContentPane().add(_0����5������ư);
	 _0����6������ư.setBounds(X��ǥ[0], Y��ǥ[0][6], 120, 60); _0����6������ư.setVisible(false); _0����6������ư.setBorderPainted(false); _0����6������ư.setContentAreaFilled(false); _0����6������ư.setFocusPainted(false); _0����6������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _0����6������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(0,6);}}});
	 getContentPane().add(_0����6������ư);
	 _0����7������ư.setBounds(X��ǥ[0], Y��ǥ[0][7], 120, 60); _0����7������ư.setVisible(false); _0����7������ư.setBorderPainted(false); _0����7������ư.setContentAreaFilled(false); _0����7������ư.setFocusPainted(false); _0����7������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _0����7������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(0,7);}}});
	 getContentPane().add(_0����7������ư);
	 _0����8������ư.setBounds(X��ǥ[0], Y��ǥ[0][8], 120, 60); _0����8������ư.setVisible(false); _0����8������ư.setBorderPainted(false); _0����8������ư.setContentAreaFilled(false); _0����8������ư.setFocusPainted(false); _0����8������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _0����8������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(0,8);}}});
	 getContentPane().add(_0����8������ư);
	 _1����0������ư.setBounds(X��ǥ[1], Y��ǥ[1][0], 120, 60); _1����0������ư.setVisible(false); _1����0������ư.setBorderPainted(false); _1����0������ư.setContentAreaFilled(false); _1����0������ư.setFocusPainted(false); _1����0������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _1����0������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(1,0);}}});
	 getContentPane().add(_1����0������ư);  
	 _1����1������ư.setBounds(X��ǥ[1], Y��ǥ[1][1], 120, 60); _1����1������ư.setVisible(false); _1����1������ư.setBorderPainted(false); _1����1������ư.setContentAreaFilled(false); _1����1������ư.setFocusPainted(false); _1����1������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _1����1������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(1,1);}}});
	 getContentPane().add(_1����1������ư);  
	 _1����2������ư.setBounds(X��ǥ[1], Y��ǥ[1][2], 120, 60); _1����2������ư.setVisible(false); _1����2������ư.setBorderPainted(false); _1����2������ư.setContentAreaFilled(false); _1����2������ư.setFocusPainted(false); _1����2������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _1����2������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(1,2);}}});
	 getContentPane().add(_1����2������ư);  
	 _1����3������ư.setBounds(X��ǥ[1], Y��ǥ[1][3], 120, 60); _1����3������ư.setVisible(false); _1����3������ư.setBorderPainted(false); _1����3������ư.setContentAreaFilled(false); _1����3������ư.setFocusPainted(false); _1����3������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _1����3������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(1,3);}}});
	 getContentPane().add(_1����3������ư);  
	 _1����4������ư.setBounds(X��ǥ[1], Y��ǥ[1][4], 120, 60); _1����4������ư.setVisible(false); _1����4������ư.setBorderPainted(false); _1����4������ư.setContentAreaFilled(false); _1����4������ư.setFocusPainted(false); _1����4������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _1����4������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(1,4);}}});
	 getContentPane().add(_1����4������ư);  
	 _1����5������ư.setBounds(X��ǥ[1], Y��ǥ[1][5], 120, 60); _1����5������ư.setVisible(false); _1����5������ư.setBorderPainted(false); _1����5������ư.setContentAreaFilled(false); _1����5������ư.setFocusPainted(false); _1����5������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _1����5������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(1,5);}}});
	 getContentPane().add(_1����5������ư);  
	 _1����6������ư.setBounds(X��ǥ[1], Y��ǥ[1][6], 120, 60); _1����6������ư.setVisible(false); _1����6������ư.setBorderPainted(false); _1����6������ư.setContentAreaFilled(false); _1����6������ư.setFocusPainted(false); _1����6������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _1����6������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(1,6);}}});
	 getContentPane().add(_1����6������ư);  
	 _1����7������ư.setBounds(X��ǥ[1], Y��ǥ[1][7], 120, 60); _1����7������ư.setVisible(false); _1����7������ư.setBorderPainted(false); _1����7������ư.setContentAreaFilled(false); _1����7������ư.setFocusPainted(false); _1����7������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _1����7������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(1,7);}}});
	 getContentPane().add(_1����7������ư);  
	 _1����8������ư.setBounds(X��ǥ[1], Y��ǥ[1][8], 120, 60); _1����8������ư.setVisible(false); _1����8������ư.setBorderPainted(false); _1����8������ư.setContentAreaFilled(false); _1����8������ư.setFocusPainted(false); _1����8������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _1����8������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(1,8);}}});
	 getContentPane().add(_1����8������ư);
	 _2����0������ư.setBounds(X��ǥ[2], Y��ǥ[2][0], 120, 60); _2����0������ư.setVisible(false); _2����0������ư.setBorderPainted(false); _2����0������ư.setContentAreaFilled(false); _2����0������ư.setFocusPainted(false); _2����0������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _2����0������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(2,0);}}});
	 getContentPane().add(_2����0������ư);
	 _2����1������ư.setBounds(X��ǥ[2], Y��ǥ[2][1], 120, 60); _2����1������ư.setVisible(false); _2����1������ư.setBorderPainted(false); _2����1������ư.setContentAreaFilled(false); _2����1������ư.setFocusPainted(false); _2����1������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _2����1������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(2,1);}}});
	 getContentPane().add(_2����1������ư);  
	 _2����2������ư.setBounds(X��ǥ[2], Y��ǥ[2][2], 120, 60); _2����2������ư.setVisible(false); _2����2������ư.setBorderPainted(false); _2����2������ư.setContentAreaFilled(false); _2����2������ư.setFocusPainted(false); _2����2������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _2����2������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(2,2);}}});
	 getContentPane().add(_2����2������ư);  
	 _2����3������ư.setBounds(X��ǥ[2], Y��ǥ[2][3], 120, 60); _2����3������ư.setVisible(false); _2����3������ư.setBorderPainted(false); _2����3������ư.setContentAreaFilled(false); _2����3������ư.setFocusPainted(false); _2����3������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _2����3������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(2,3);}}});
	 getContentPane().add(_2����3������ư);  
	 _2����4������ư.setBounds(X��ǥ[2], Y��ǥ[2][4], 120, 60); _2����4������ư.setVisible(false); _2����4������ư.setBorderPainted(false); _2����4������ư.setContentAreaFilled(false); _2����4������ư.setFocusPainted(false); _2����4������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _2����4������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(2,4);}}});
	 getContentPane().add(_2����4������ư);  
	 _2����5������ư.setBounds(X��ǥ[2], Y��ǥ[2][5], 120, 60); _2����5������ư.setVisible(false); _2����5������ư.setBorderPainted(false); _2����5������ư.setContentAreaFilled(false); _2����5������ư.setFocusPainted(false); _2����5������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _2����5������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(2,5);}}});
	 getContentPane().add(_2����5������ư);  
	 _2����6������ư.setBounds(X��ǥ[2], Y��ǥ[2][6], 120, 60); _2����6������ư.setVisible(false); _2����6������ư.setBorderPainted(false); _2����6������ư.setContentAreaFilled(false); _2����6������ư.setFocusPainted(false); _2����6������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _2����6������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(2,6);}}});
	 getContentPane().add(_2����6������ư);  
	 _2����7������ư.setBounds(X��ǥ[2], Y��ǥ[2][7], 120, 60); _2����7������ư.setVisible(false); _2����7������ư.setBorderPainted(false); _2����7������ư.setContentAreaFilled(false); _2����7������ư.setFocusPainted(false); _2����7������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _2����7������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(2,7);}}});
	 getContentPane().add(_2����7������ư);  
	 _2����8������ư.setBounds(X��ǥ[2], Y��ǥ[2][8], 120, 60); _2����8������ư.setVisible(false); _2����8������ư.setBorderPainted(false); _2����8������ư.setContentAreaFilled(false); _2����8������ư.setFocusPainted(false); _2����8������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _2����8������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(2,8);}}});
	 getContentPane().add(_2����8������ư);
	 _3����0������ư.setBounds(X��ǥ[3], Y��ǥ[3][0], 120, 60); _3����0������ư.setVisible(false); _3����0������ư.setBorderPainted(false); _3����0������ư.setContentAreaFilled(false); _3����0������ư.setFocusPainted(false); _3����0������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _3����0������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(3,0);}}});
	 getContentPane().add(_3����0������ư);  
	 _3����1������ư.setBounds(X��ǥ[3], Y��ǥ[3][1], 120, 60); _3����1������ư.setVisible(false); _3����1������ư.setBorderPainted(false); _3����1������ư.setContentAreaFilled(false); _3����1������ư.setFocusPainted(false); _3����1������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _3����1������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(3,1);}}});
	 getContentPane().add(_3����1������ư);  
	 _3����2������ư.setBounds(X��ǥ[3], Y��ǥ[3][2], 120, 60); _3����2������ư.setVisible(false); _3����2������ư.setBorderPainted(false); _3����2������ư.setContentAreaFilled(false); _3����2������ư.setFocusPainted(false); _3����2������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _3����2������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(3,2);}}});
	 getContentPane().add(_3����2������ư);  
	 _3����3������ư.setBounds(X��ǥ[3], Y��ǥ[3][3], 120, 60); _3����3������ư.setVisible(false); _3����3������ư.setBorderPainted(false); _3����3������ư.setContentAreaFilled(false); _3����3������ư.setFocusPainted(false); _3����3������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _3����3������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(3,3);}}});
	 getContentPane().add(_3����3������ư);  
	 _3����4������ư.setBounds(X��ǥ[3], Y��ǥ[3][4], 120, 60); _3����4������ư.setVisible(false); _3����4������ư.setBorderPainted(false); _3����4������ư.setContentAreaFilled(false); _3����4������ư.setFocusPainted(false); _3����4������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _3����4������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(3,4);}}});
	 getContentPane().add(_3����4������ư);  
	 _3����5������ư.setBounds(X��ǥ[3], Y��ǥ[3][5], 120, 60); _3����5������ư.setVisible(false); _3����5������ư.setBorderPainted(false); _3����5������ư.setContentAreaFilled(false); _3����5������ư.setFocusPainted(false); _3����5������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _3����5������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(3,5);}}});
	 getContentPane().add(_3����5������ư);  
	 _3����6������ư.setBounds(X��ǥ[3], Y��ǥ[3][6], 120, 60); _3����6������ư.setVisible(false); _3����6������ư.setBorderPainted(false); _3����6������ư.setContentAreaFilled(false); _3����6������ư.setFocusPainted(false); _3����6������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _3����6������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(3,6);}}});
	 getContentPane().add(_3����6������ư);  
	 _3����7������ư.setBounds(X��ǥ[3], Y��ǥ[3][7], 120, 60); _3����7������ư.setVisible(false); _3����7������ư.setBorderPainted(false); _3����7������ư.setContentAreaFilled(false); _3����7������ư.setFocusPainted(false); _3����7������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _3����7������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(3,7);}}});
	 getContentPane().add(_3����7������ư);  
	 _3����8������ư.setBounds(X��ǥ[3], Y��ǥ[3][8], 120, 60); _3����8������ư.setVisible(false); _3����8������ư.setBorderPainted(false); _3����8������ư.setContentAreaFilled(false); _3����8������ư.setFocusPainted(false); _3����8������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _3����8������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(3,8);}}});
	 getContentPane().add(_3����8������ư);
	 _4����0������ư.setBounds(X��ǥ[4], Y��ǥ[4][0], 120, 64); _4����0������ư.setVisible(false); _4����0������ư.setBorderPainted(false); _4����0������ư.setContentAreaFilled(false); _4����0������ư.setFocusPainted(false); _4����0������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _4����0������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(4,0);}}});
	 getContentPane().add(_4����0������ư);  
	 _4����1������ư.setBounds(X��ǥ[4], Y��ǥ[4][1], 120, 64); _4����1������ư.setVisible(false); _4����1������ư.setBorderPainted(false); _4����1������ư.setContentAreaFilled(false); _4����1������ư.setFocusPainted(false); _4����1������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _4����1������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(4,1);}}});
	 getContentPane().add(_4����1������ư);  
	 _4����2������ư.setBounds(X��ǥ[4], Y��ǥ[4][2], 120, 64); _4����2������ư.setVisible(false); _4����2������ư.setBorderPainted(false); _4����2������ư.setContentAreaFilled(false); _4����2������ư.setFocusPainted(false); _4����2������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _4����2������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(4,2);}}});
	 getContentPane().add(_4����2������ư);  
	 _4����3������ư.setBounds(X��ǥ[4], Y��ǥ[4][3], 120, 64); _4����3������ư.setVisible(false); _4����3������ư.setBorderPainted(false); _4����3������ư.setContentAreaFilled(false); _4����3������ư.setFocusPainted(false); _4����3������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _4����3������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(4,3);}}});
	 getContentPane().add(_4����3������ư);  
	 _4����4������ư.setBounds(X��ǥ[4], Y��ǥ[4][4], 120, 64); _4����4������ư.setVisible(false); _4����4������ư.setBorderPainted(false); _4����4������ư.setContentAreaFilled(false); _4����4������ư.setFocusPainted(false); _4����4������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _4����4������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(4,4);}}});
	 getContentPane().add(_4����4������ư);  
	 _4����5������ư.setBounds(X��ǥ[4], Y��ǥ[4][5], 120, 64); _4����5������ư.setVisible(false); _4����5������ư.setBorderPainted(false); _4����5������ư.setContentAreaFilled(false); _4����5������ư.setFocusPainted(false); _4����5������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _4����5������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(4,5);}}});
	 getContentPane().add(_4����5������ư);  
	 _4����6������ư.setBounds(X��ǥ[4], Y��ǥ[4][6], 120, 64); _4����6������ư.setVisible(false); _4����6������ư.setBorderPainted(false); _4����6������ư.setContentAreaFilled(false); _4����6������ư.setFocusPainted(false); _4����6������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _4����6������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(4,6);}}});
	 getContentPane().add(_4����6������ư);  
	 _4����7������ư.setBounds(X��ǥ[4], Y��ǥ[4][7], 120, 64); _4����7������ư.setVisible(false); _4����7������ư.setBorderPainted(false); _4����7������ư.setContentAreaFilled(false); _4����7������ư.setFocusPainted(false); _4����7������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _4����7������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(4,7);}}});
	 getContentPane().add(_4����7������ư);  
	 _4����8������ư.setBounds(X��ǥ[4], Y��ǥ[4][8], 120, 64); _4����8������ư.setVisible(false); _4����8������ư.setBorderPainted(false); _4����8������ư.setContentAreaFilled(false); _4����8������ư.setFocusPainted(false); _4����8������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _4����8������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(4,8);}}});
	 getContentPane().add(_4����8������ư);
	 _5����0������ư.setBounds(X��ǥ[5], Y��ǥ[5][0], 120, 60); _5����0������ư.setVisible(false); _5����0������ư.setBorderPainted(false); _5����0������ư.setContentAreaFilled(false); _5����0������ư.setFocusPainted(false); _5����0������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _5����0������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(5,0);}}});
	 getContentPane().add(_5����0������ư);  
	 _5����1������ư.setBounds(X��ǥ[5], Y��ǥ[5][1], 120, 60); _5����1������ư.setVisible(false); _5����1������ư.setBorderPainted(false); _5����1������ư.setContentAreaFilled(false); _5����1������ư.setFocusPainted(false); _5����1������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _5����1������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(5,1);}}});
	 getContentPane().add(_5����1������ư);  
	 _5����2������ư.setBounds(X��ǥ[5], Y��ǥ[5][2], 120, 60); _5����2������ư.setVisible(false); _5����2������ư.setBorderPainted(false); _5����2������ư.setContentAreaFilled(false); _5����2������ư.setFocusPainted(false); _5����2������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _5����2������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(5,2);}}});
	 getContentPane().add(_5����2������ư);  
	 _5����3������ư.setBounds(X��ǥ[5], Y��ǥ[5][3], 120, 60); _5����3������ư.setVisible(false); _5����3������ư.setBorderPainted(false); _5����3������ư.setContentAreaFilled(false); _5����3������ư.setFocusPainted(false); _5����3������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _5����3������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(5,3);}}});
	 getContentPane().add(_5����3������ư);  
	 _5����4������ư.setBounds(X��ǥ[5], Y��ǥ[5][4], 120, 60); _5����4������ư.setVisible(false); _5����4������ư.setBorderPainted(false); _5����4������ư.setContentAreaFilled(false); _5����4������ư.setFocusPainted(false); _5����4������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _5����4������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(5,4);}}});
	 getContentPane().add(_5����4������ư);  
	 _5����5������ư.setBounds(X��ǥ[5], Y��ǥ[5][5], 120, 60); _5����5������ư.setVisible(false); _5����5������ư.setBorderPainted(false); _5����5������ư.setContentAreaFilled(false); _5����5������ư.setFocusPainted(false); _5����5������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _5����5������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(5,5);}}});
	 getContentPane().add(_5����5������ư);  
	 _5����6������ư.setBounds(X��ǥ[5], Y��ǥ[5][6], 120, 60); _5����6������ư.setVisible(false); _5����6������ư.setBorderPainted(false); _5����6������ư.setContentAreaFilled(false); _5����6������ư.setFocusPainted(false); _5����6������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _5����6������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(5,6);}}});
	 getContentPane().add(_5����6������ư);  
	 _5����7������ư.setBounds(X��ǥ[5], Y��ǥ[5][7], 120, 60); _5����7������ư.setVisible(false); _5����7������ư.setBorderPainted(false); _5����7������ư.setContentAreaFilled(false); _5����7������ư.setFocusPainted(false); _5����7������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _5����7������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(5,7);}}});
	 getContentPane().add(_5����7������ư);  
	 _5����8������ư.setBounds(X��ǥ[5], Y��ǥ[5][8], 120, 60); _5����8������ư.setVisible(false); _5����8������ư.setBorderPainted(false); _5����8������ư.setContentAreaFilled(false); _5����8������ư.setFocusPainted(false); _5����8������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _5����8������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(5,8);}}});
	 getContentPane().add(_5����8������ư);
	 _6����0������ư.setBounds(X��ǥ[6], Y��ǥ[6][0], 120, 60); _6����0������ư.setVisible(false); _6����0������ư.setBorderPainted(false); _6����0������ư.setContentAreaFilled(false); _6����0������ư.setFocusPainted(false); _6����0������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _6����0������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(6,0);}}});
	 getContentPane().add(_6����0������ư);  
	 _6����1������ư.setBounds(X��ǥ[6], Y��ǥ[6][1], 120, 60); _6����1������ư.setVisible(false); _6����1������ư.setBorderPainted(false); _6����1������ư.setContentAreaFilled(false); _6����1������ư.setFocusPainted(false); _6����1������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _6����1������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(6,1);}}});
	 getContentPane().add(_6����1������ư);  
	 _6����2������ư.setBounds(X��ǥ[6], Y��ǥ[6][2], 120, 60); _6����2������ư.setVisible(false); _6����2������ư.setBorderPainted(false); _6����2������ư.setContentAreaFilled(false); _6����2������ư.setFocusPainted(false); _6����2������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _6����2������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(6,2);}}});
	 getContentPane().add(_6����2������ư);
	 _6����3������ư.setBounds(X��ǥ[6], Y��ǥ[6][3], 120, 60); _6����3������ư.setVisible(false); _6����3������ư.setBorderPainted(false); _6����3������ư.setContentAreaFilled(false); _6����3������ư.setFocusPainted(false); _6����3������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _6����3������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(6,3);}}});
	 getContentPane().add(_6����3������ư);  
	 _6����4������ư.setBounds(X��ǥ[6], Y��ǥ[6][4], 120, 60); _6����4������ư.setVisible(false); _6����4������ư.setBorderPainted(false); _6����4������ư.setContentAreaFilled(false); _6����4������ư.setFocusPainted(false); _6����4������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _6����4������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(6,4);}}});
	 getContentPane().add(_6����4������ư);  
	 _6����5������ư.setBounds(X��ǥ[6], Y��ǥ[6][5], 120, 60); _6����5������ư.setVisible(false); _6����5������ư.setBorderPainted(false); _6����5������ư.setContentAreaFilled(false); _6����5������ư.setFocusPainted(false); _6����5������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _6����5������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(6,5);}}});
	 getContentPane().add(_6����5������ư); 
	 _6����6������ư.setBounds(X��ǥ[6], Y��ǥ[6][6], 120, 60); _6����6������ư.setVisible(false); _6����6������ư.setBorderPainted(false); _6����6������ư.setContentAreaFilled(false); _6����6������ư.setFocusPainted(false); _6����6������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _6����6������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(6,6);}}});
	 getContentPane().add(_6����6������ư);  
	 _6����7������ư.setBounds(X��ǥ[6], Y��ǥ[6][7], 120, 60); _6����7������ư.setVisible(false); _6����7������ư.setBorderPainted(false); _6����7������ư.setContentAreaFilled(false); _6����7������ư.setFocusPainted(false); _6����7������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _6����7������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(6,7);}}});
	 getContentPane().add(_6����7������ư);  
	 _6����8������ư.setBounds(X��ǥ[6], Y��ǥ[6][8], 120, 60); _6����8������ư.setVisible(false); _6����8������ư.setBorderPainted(false); _6����8������ư.setContentAreaFilled(false); _6����8������ư.setFocusPainted(false); _6����8������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _6����8������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(6,8);}}});
	 getContentPane().add(_6����8������ư);
	 _7����0������ư.setBounds(X��ǥ[7], Y��ǥ[7][0], 120, 60); _7����0������ư.setVisible(false); _7����0������ư.setBorderPainted(false); _7����0������ư.setContentAreaFilled(false); _7����0������ư.setFocusPainted(false); _7����0������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _7����0������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(7,0);}}});
	 getContentPane().add(_7����0������ư);  
	 _7����1������ư.setBounds(X��ǥ[7], Y��ǥ[7][1], 120, 60); _7����1������ư.setVisible(false); _7����1������ư.setBorderPainted(false); _7����1������ư.setContentAreaFilled(false); _7����1������ư.setFocusPainted(false); _7����1������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _7����1������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(7,1);}}});
	 getContentPane().add(_7����1������ư);  
	 _7����2������ư.setBounds(X��ǥ[7], Y��ǥ[7][2], 120, 60); _7����2������ư.setVisible(false); _7����2������ư.setBorderPainted(false); _7����2������ư.setContentAreaFilled(false); _7����2������ư.setFocusPainted(false); _7����2������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _7����2������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(7,2);}}});
	 getContentPane().add(_7����2������ư);  
	 _7����3������ư.setBounds(X��ǥ[7], Y��ǥ[7][3], 120, 60); _7����3������ư.setVisible(false); _7����3������ư.setBorderPainted(false); _7����3������ư.setContentAreaFilled(false); _7����3������ư.setFocusPainted(false); _7����3������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _7����3������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(7,3);}}});
	 getContentPane().add(_7����3������ư);  
	 _7����4������ư.setBounds(X��ǥ[7], Y��ǥ[7][4], 120, 60); _7����4������ư.setVisible(false); _7����4������ư.setBorderPainted(false); _7����4������ư.setContentAreaFilled(false); _7����4������ư.setFocusPainted(false); _7����4������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _7����4������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(7,4);}}});
	 getContentPane().add(_7����4������ư);  
	 _7����5������ư.setBounds(X��ǥ[7], Y��ǥ[7][5], 120, 60); _7����5������ư.setVisible(false); _7����5������ư.setBorderPainted(false); _7����5������ư.setContentAreaFilled(false); _7����5������ư.setFocusPainted(false); _7����5������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _7����5������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(7,5);}}});
	 getContentPane().add(_7����5������ư);  
	 _7����6������ư.setBounds(X��ǥ[7], Y��ǥ[7][6], 120, 60); _7����6������ư.setVisible(false); _7����6������ư.setBorderPainted(false); _7����6������ư.setContentAreaFilled(false); _7����6������ư.setFocusPainted(false); _7����6������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _7����6������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(7,6);}}});
	 getContentPane().add(_7����6������ư);  
	 _7����7������ư.setBounds(X��ǥ[7], Y��ǥ[7][7], 120, 60); _7����7������ư.setVisible(false); _7����7������ư.setBorderPainted(false); _7����7������ư.setContentAreaFilled(false); _7����7������ư.setFocusPainted(false); _7����7������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _7����7������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(7,7);}}});
	 getContentPane().add(_7����7������ư); 
	 _7����8������ư.setBounds(X��ǥ[7], Y��ǥ[7][8], 120, 60); _7����8������ư.setVisible(false); _7����8������ư.setBorderPainted(false); _7����8������ư.setContentAreaFilled(false); _7����8������ư.setFocusPainted(false); _7����8������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _7����8������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(7,8);}}});
	 getContentPane().add(_7����8������ư);
	 _8����0������ư.setBounds(X��ǥ[8], Y��ǥ[8][0], 120, 60); _8����0������ư.setVisible(false); _8����0������ư.setBorderPainted(false); _8����0������ư.setContentAreaFilled(false); _8����0������ư.setFocusPainted(false); _8����0������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _8����0������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(8,0);}}});
	 getContentPane().add(_8����0������ư);  
	 _8����1������ư.setBounds(X��ǥ[8], Y��ǥ[8][1], 120, 60); _8����1������ư.setVisible(false); _8����1������ư.setBorderPainted(false); _8����1������ư.setContentAreaFilled(false); _8����1������ư.setFocusPainted(false); _8����1������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _8����1������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(8,1);}}});
	 getContentPane().add(_8����1������ư);  
	 _8����2������ư.setBounds(X��ǥ[8], Y��ǥ[8][2], 120, 60); _8����2������ư.setVisible(false); _8����2������ư.setBorderPainted(false); _8����2������ư.setContentAreaFilled(false); _8����2������ư.setFocusPainted(false); _8����2������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _8����2������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(8,2);}}});
	 getContentPane().add(_8����2������ư);  
	 _8����3������ư.setBounds(X��ǥ[8], Y��ǥ[8][3], 120, 60); _8����3������ư.setVisible(false); _8����3������ư.setBorderPainted(false); _8����3������ư.setContentAreaFilled(false); _8����3������ư.setFocusPainted(false); _8����3������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _8����3������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(8,3);}}});
	 getContentPane().add(_8����3������ư);  
	 _8����4������ư.setBounds(X��ǥ[8], Y��ǥ[8][4], 120, 60); _8����4������ư.setVisible(false); _8����4������ư.setBorderPainted(false); _8����4������ư.setContentAreaFilled(false); _8����4������ư.setFocusPainted(false); _8����4������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _8����4������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(8,4);}}});
	 getContentPane().add(_8����4������ư);  
	 _8����5������ư.setBounds(X��ǥ[8], Y��ǥ[8][5], 120, 60); _8����5������ư.setVisible(false); _8����5������ư.setBorderPainted(false); _8����5������ư.setContentAreaFilled(false); _8����5������ư.setFocusPainted(false); _8����5������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _8����5������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(8,5);}}});
	 getContentPane().add(_8����5������ư);  
	 _8����6������ư.setBounds(X��ǥ[8], Y��ǥ[8][6], 120, 60); _8����6������ư.setVisible(false); _8����6������ư.setBorderPainted(false); _8����6������ư.setContentAreaFilled(false); _8����6������ư.setFocusPainted(false); _8����6������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _8����6������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(8,6);}}});
	 getContentPane().add(_8����6������ư);  
	 _8����7������ư.setBounds(X��ǥ[8], Y��ǥ[8][7], 120, 60); _8����7������ư.setVisible(false); _8����7������ư.setBorderPainted(false); _8����7������ư.setContentAreaFilled(false); _8����7������ư.setFocusPainted(false); _8����7������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _8����7������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(8,7);}}});
	 getContentPane().add(_8����7������ư);  
	 _8����8������ư.setBounds(X��ǥ[8], Y��ǥ[8][8], 120, 60); _8����8������ư.setVisible(false); _8����8������ư.setBorderPainted(false); _8����8������ư.setContentAreaFilled(false); _8����8������ư.setFocusPainted(false); _8����8������ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _8����8������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������==1){  Ŭ��(8,8);}}});
	 getContentPane().add(_8����8������ư);	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 	 _0����0�ణ���ѻ�����ư.setBounds(X��ǥ[0], Y��ǥ[0][0], 120, 60); _0����0�ణ���ѻ�����ư.setVisible(false); _0����0�ణ���ѻ�����ư.setBorderPainted(false); _0����0�ణ���ѻ�����ư.setContentAreaFilled(false); _0����0�ణ���ѻ�����ư.setFocusPainted(false); _0����0�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(0,0); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_0����0�ణ���ѻ�����ư);
	 _0����1�ణ���ѻ�����ư.setBounds(X��ǥ[0], Y��ǥ[0][1], 120, 60); _0����1�ణ���ѻ�����ư.setVisible(false); _0����1�ణ���ѻ�����ư.setBorderPainted(false); _0����1�ణ���ѻ�����ư.setContentAreaFilled(false); _0����1�ణ���ѻ�����ư.setFocusPainted(false); _0����1�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(0,1); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_0����1�ణ���ѻ�����ư);
	 _0����2�ణ���ѻ�����ư.setBounds(X��ǥ[0], Y��ǥ[0][2], 120, 60); _0����2�ణ���ѻ�����ư.setVisible(false); _0����2�ణ���ѻ�����ư.setBorderPainted(false); _0����2�ణ���ѻ�����ư.setContentAreaFilled(false); _0����2�ణ���ѻ�����ư.setFocusPainted(false); _0����2�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(0,2); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_0����2�ణ���ѻ�����ư);
	 _0����3�ణ���ѻ�����ư.setBounds(X��ǥ[0], Y��ǥ[0][3], 120, 60); _0����3�ణ���ѻ�����ư.setVisible(false); _0����3�ణ���ѻ�����ư.setBorderPainted(false); _0����3�ణ���ѻ�����ư.setContentAreaFilled(false); _0����3�ణ���ѻ�����ư.setFocusPainted(false); _0����3�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(0,3); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_0����3�ణ���ѻ�����ư);
	 _0����4�ణ���ѻ�����ư.setBounds(X��ǥ[0], Y��ǥ[0][4], 120, 60); _0����4�ణ���ѻ�����ư.setVisible(false); _0����4�ణ���ѻ�����ư.setBorderPainted(false); _0����4�ణ���ѻ�����ư.setContentAreaFilled(false); _0����4�ణ���ѻ�����ư.setFocusPainted(false); _0����4�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(0,4); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_0����4�ణ���ѻ�����ư);
	 _0����5�ణ���ѻ�����ư.setBounds(X��ǥ[0], Y��ǥ[0][5], 120, 60); _0����5�ణ���ѻ�����ư.setVisible(false); _0����5�ణ���ѻ�����ư.setBorderPainted(false); _0����5�ణ���ѻ�����ư.setContentAreaFilled(false); _0����5�ణ���ѻ�����ư.setFocusPainted(false); _0����5�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(0,5); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_0����5�ణ���ѻ�����ư);
	 _0����6�ణ���ѻ�����ư.setBounds(X��ǥ[0], Y��ǥ[0][6], 120, 60); _0����6�ణ���ѻ�����ư.setVisible(false); _0����6�ణ���ѻ�����ư.setBorderPainted(false); _0����6�ణ���ѻ�����ư.setContentAreaFilled(false); _0����6�ణ���ѻ�����ư.setFocusPainted(false); _0����6�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(0,6); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_0����6�ణ���ѻ�����ư);
	 _0����7�ణ���ѻ�����ư.setBounds(X��ǥ[0], Y��ǥ[0][7], 120, 60); _0����7�ణ���ѻ�����ư.setVisible(false); _0����7�ణ���ѻ�����ư.setBorderPainted(false); _0����7�ణ���ѻ�����ư.setContentAreaFilled(false); _0����7�ణ���ѻ�����ư.setFocusPainted(false); _0����7�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(0,7); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_0����7�ణ���ѻ�����ư);
	 _0����8�ణ���ѻ�����ư.setBounds(X��ǥ[0], Y��ǥ[0][8], 120, 60); _0����8�ణ���ѻ�����ư.setVisible(false); _0����8�ణ���ѻ�����ư.setBorderPainted(false); _0����8�ణ���ѻ�����ư.setContentAreaFilled(false); _0����8�ణ���ѻ�����ư.setFocusPainted(false); _0����8�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(0,8); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_0����8�ణ���ѻ�����ư);
	 _1����0�ణ���ѻ�����ư.setBounds(X��ǥ[1], Y��ǥ[1][0], 120, 60); _1����0�ణ���ѻ�����ư.setVisible(false); _1����0�ణ���ѻ�����ư.setBorderPainted(false); _1����0�ణ���ѻ�����ư.setContentAreaFilled(false); _1����0�ణ���ѻ�����ư.setFocusPainted(false); _1����0�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(1,0); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_1����0�ణ���ѻ�����ư); 
	 _1����1�ణ���ѻ�����ư.setBounds(X��ǥ[1], Y��ǥ[1][1], 120, 60); _1����1�ణ���ѻ�����ư.setVisible(false); _1����1�ణ���ѻ�����ư.setBorderPainted(false); _1����1�ణ���ѻ�����ư.setContentAreaFilled(false); _1����1�ణ���ѻ�����ư.setFocusPainted(false); _1����1�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(1,1); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_1����1�ణ���ѻ�����ư); 
	 _1����2�ణ���ѻ�����ư.setBounds(X��ǥ[1], Y��ǥ[1][2], 120, 60); _1����2�ణ���ѻ�����ư.setVisible(false); _1����2�ణ���ѻ�����ư.setBorderPainted(false); _1����2�ణ���ѻ�����ư.setContentAreaFilled(false); _1����2�ణ���ѻ�����ư.setFocusPainted(false); _1����2�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(1,2); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_1����2�ణ���ѻ�����ư); 
	 _1����3�ణ���ѻ�����ư.setBounds(X��ǥ[1], Y��ǥ[1][3], 120, 60); _1����3�ణ���ѻ�����ư.setVisible(false); _1����3�ణ���ѻ�����ư.setBorderPainted(false); _1����3�ణ���ѻ�����ư.setContentAreaFilled(false); _1����3�ణ���ѻ�����ư.setFocusPainted(false); _1����3�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(1,3); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_1����3�ణ���ѻ�����ư); 
	 _1����4�ణ���ѻ�����ư.setBounds(X��ǥ[1], Y��ǥ[1][4], 120, 60); _1����4�ణ���ѻ�����ư.setVisible(false); _1����4�ణ���ѻ�����ư.setBorderPainted(false); _1����4�ణ���ѻ�����ư.setContentAreaFilled(false); _1����4�ణ���ѻ�����ư.setFocusPainted(false); _1����4�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(1,4); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_1����4�ణ���ѻ�����ư); 
	 _1����5�ణ���ѻ�����ư.setBounds(X��ǥ[1], Y��ǥ[1][5], 120, 60); _1����5�ణ���ѻ�����ư.setVisible(false); _1����5�ణ���ѻ�����ư.setBorderPainted(false); _1����5�ణ���ѻ�����ư.setContentAreaFilled(false); _1����5�ణ���ѻ�����ư.setFocusPainted(false); _1����5�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(1,5); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_1����5�ణ���ѻ�����ư); 
	 _1����6�ణ���ѻ�����ư.setBounds(X��ǥ[1], Y��ǥ[1][6], 120, 60); _1����6�ణ���ѻ�����ư.setVisible(false); _1����6�ణ���ѻ�����ư.setBorderPainted(false); _1����6�ణ���ѻ�����ư.setContentAreaFilled(false); _1����6�ణ���ѻ�����ư.setFocusPainted(false); _1����6�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(1,6); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_1����6�ణ���ѻ�����ư); 
	 _1����7�ణ���ѻ�����ư.setBounds(X��ǥ[1], Y��ǥ[1][7], 120, 60); _1����7�ణ���ѻ�����ư.setVisible(false); _1����7�ణ���ѻ�����ư.setBorderPainted(false); _1����7�ణ���ѻ�����ư.setContentAreaFilled(false); _1����7�ణ���ѻ�����ư.setFocusPainted(false); _1����7�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(1,7); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_1����7�ణ���ѻ�����ư); 
	 _1����8�ణ���ѻ�����ư.setBounds(X��ǥ[1], Y��ǥ[1][8], 120, 60); _1����8�ణ���ѻ�����ư.setVisible(false); _1����8�ణ���ѻ�����ư.setBorderPainted(false); _1����8�ణ���ѻ�����ư.setContentAreaFilled(false); _1����8�ణ���ѻ�����ư.setFocusPainted(false); _1����8�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(1,8); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_1����8�ణ���ѻ�����ư);
	 _2����0�ణ���ѻ�����ư.setBounds(X��ǥ[2], Y��ǥ[2][0], 120, 60); _2����0�ణ���ѻ�����ư.setVisible(false); _2����0�ణ���ѻ�����ư.setBorderPainted(false); _2����0�ణ���ѻ�����ư.setContentAreaFilled(false); _2����0�ణ���ѻ�����ư.setFocusPainted(false); _2����0�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(2,0); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_2����0�ణ���ѻ�����ư); 
	 _2����1�ణ���ѻ�����ư.setBounds(X��ǥ[2], Y��ǥ[2][1], 120, 60); _2����1�ణ���ѻ�����ư.setVisible(false); _2����1�ణ���ѻ�����ư.setBorderPainted(false); _2����1�ణ���ѻ�����ư.setContentAreaFilled(false); _2����1�ణ���ѻ�����ư.setFocusPainted(false); _2����1�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(2,1); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_2����1�ణ���ѻ�����ư); 
	 _2����2�ణ���ѻ�����ư.setBounds(X��ǥ[2], Y��ǥ[2][2], 120, 60); _2����2�ణ���ѻ�����ư.setVisible(false); _2����2�ణ���ѻ�����ư.setBorderPainted(false); _2����2�ణ���ѻ�����ư.setContentAreaFilled(false); _2����2�ణ���ѻ�����ư.setFocusPainted(false); _2����2�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(2,2); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_2����2�ణ���ѻ�����ư); 
	 _2����3�ణ���ѻ�����ư.setBounds(X��ǥ[2], Y��ǥ[2][3], 120, 60); _2����3�ణ���ѻ�����ư.setVisible(false); _2����3�ణ���ѻ�����ư.setBorderPainted(false); _2����3�ణ���ѻ�����ư.setContentAreaFilled(false); _2����3�ణ���ѻ�����ư.setFocusPainted(false); _2����3�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(2,3); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_2����3�ణ���ѻ�����ư); 
	 _2����4�ణ���ѻ�����ư.setBounds(X��ǥ[2], Y��ǥ[2][4], 120, 60); _2����4�ణ���ѻ�����ư.setVisible(false); _2����4�ణ���ѻ�����ư.setBorderPainted(false); _2����4�ణ���ѻ�����ư.setContentAreaFilled(false); _2����4�ణ���ѻ�����ư.setFocusPainted(false); _2����4�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(2,4); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_2����4�ణ���ѻ�����ư); 
	 _2����5�ణ���ѻ�����ư.setBounds(X��ǥ[2], Y��ǥ[2][5], 120, 60); _2����5�ణ���ѻ�����ư.setVisible(false); _2����5�ణ���ѻ�����ư.setBorderPainted(false); _2����5�ణ���ѻ�����ư.setContentAreaFilled(false); _2����5�ణ���ѻ�����ư.setFocusPainted(false); _2����5�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(2,5); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_2����5�ణ���ѻ�����ư); 
	 _2����6�ణ���ѻ�����ư.setBounds(X��ǥ[2], Y��ǥ[2][6], 120, 60); _2����6�ణ���ѻ�����ư.setVisible(false); _2����6�ణ���ѻ�����ư.setBorderPainted(false); _2����6�ణ���ѻ�����ư.setContentAreaFilled(false); _2����6�ణ���ѻ�����ư.setFocusPainted(false); _2����6�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(2,6); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_2����6�ణ���ѻ�����ư); 
	 _2����7�ణ���ѻ�����ư.setBounds(X��ǥ[2], Y��ǥ[2][7], 120, 60); _2����7�ణ���ѻ�����ư.setVisible(false); _2����7�ణ���ѻ�����ư.setBorderPainted(false); _2����7�ణ���ѻ�����ư.setContentAreaFilled(false); _2����7�ణ���ѻ�����ư.setFocusPainted(false); _2����7�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(2,7); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_2����7�ణ���ѻ�����ư); 
	 _2����8�ణ���ѻ�����ư.setBounds(X��ǥ[2], Y��ǥ[2][8], 120, 60); _2����8�ణ���ѻ�����ư.setVisible(false); _2����8�ణ���ѻ�����ư.setBorderPainted(false); _2����8�ణ���ѻ�����ư.setContentAreaFilled(false); _2����8�ణ���ѻ�����ư.setFocusPainted(false); _2����8�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(2,8); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_2����8�ణ���ѻ�����ư);
	 _3����0�ణ���ѻ�����ư.setBounds(X��ǥ[3], Y��ǥ[3][0], 120, 60); _3����0�ణ���ѻ�����ư.setVisible(false); _3����0�ణ���ѻ�����ư.setBorderPainted(false); _3����0�ణ���ѻ�����ư.setContentAreaFilled(false); _3����0�ణ���ѻ�����ư.setFocusPainted(false); _3����0�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(3,0); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_3����0�ణ���ѻ�����ư); 
	 _3����1�ణ���ѻ�����ư.setBounds(X��ǥ[3], Y��ǥ[3][1], 120, 60); _3����1�ణ���ѻ�����ư.setVisible(false); _3����1�ణ���ѻ�����ư.setBorderPainted(false); _3����1�ణ���ѻ�����ư.setContentAreaFilled(false); _3����1�ణ���ѻ�����ư.setFocusPainted(false); _3����1�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(3,1); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_3����1�ణ���ѻ�����ư); 
	 _3����2�ణ���ѻ�����ư.setBounds(X��ǥ[3], Y��ǥ[3][2], 120, 60); _3����2�ణ���ѻ�����ư.setVisible(false); _3����2�ణ���ѻ�����ư.setBorderPainted(false); _3����2�ణ���ѻ�����ư.setContentAreaFilled(false); _3����2�ణ���ѻ�����ư.setFocusPainted(false); _3����2�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(3,2); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_3����2�ణ���ѻ�����ư); 
	 _3����3�ణ���ѻ�����ư.setBounds(X��ǥ[3], Y��ǥ[3][3], 120, 60); _3����3�ణ���ѻ�����ư.setVisible(false); _3����3�ణ���ѻ�����ư.setBorderPainted(false); _3����3�ణ���ѻ�����ư.setContentAreaFilled(false); _3����3�ణ���ѻ�����ư.setFocusPainted(false); _3����3�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(3,3); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_3����3�ణ���ѻ�����ư); 
	 _3����4�ణ���ѻ�����ư.setBounds(X��ǥ[3], Y��ǥ[3][4], 120, 60); _3����4�ణ���ѻ�����ư.setVisible(false); _3����4�ణ���ѻ�����ư.setBorderPainted(false); _3����4�ణ���ѻ�����ư.setContentAreaFilled(false); _3����4�ణ���ѻ�����ư.setFocusPainted(false); _3����4�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(3,4); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_3����4�ణ���ѻ�����ư); 
	 _3����5�ణ���ѻ�����ư.setBounds(X��ǥ[3], Y��ǥ[3][5], 120, 60); _3����5�ణ���ѻ�����ư.setVisible(false); _3����5�ణ���ѻ�����ư.setBorderPainted(false); _3����5�ణ���ѻ�����ư.setContentAreaFilled(false); _3����5�ణ���ѻ�����ư.setFocusPainted(false); _3����5�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(3,5); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_3����5�ణ���ѻ�����ư); 
	 _3����6�ణ���ѻ�����ư.setBounds(X��ǥ[3], Y��ǥ[3][6], 120, 60); _3����6�ణ���ѻ�����ư.setVisible(false); _3����6�ణ���ѻ�����ư.setBorderPainted(false); _3����6�ణ���ѻ�����ư.setContentAreaFilled(false); _3����6�ణ���ѻ�����ư.setFocusPainted(false); _3����6�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(3,6); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_3����6�ణ���ѻ�����ư); 
	 _3����7�ణ���ѻ�����ư.setBounds(X��ǥ[3], Y��ǥ[3][7], 120, 60); _3����7�ణ���ѻ�����ư.setVisible(false); _3����7�ణ���ѻ�����ư.setBorderPainted(false); _3����7�ణ���ѻ�����ư.setContentAreaFilled(false); _3����7�ణ���ѻ�����ư.setFocusPainted(false); _3����7�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(3,7); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_3����7�ణ���ѻ�����ư); 
	 _3����8�ణ���ѻ�����ư.setBounds(X��ǥ[3], Y��ǥ[3][8], 120, 60); _3����8�ణ���ѻ�����ư.setVisible(false); _3����8�ణ���ѻ�����ư.setBorderPainted(false); _3����8�ణ���ѻ�����ư.setContentAreaFilled(false); _3����8�ణ���ѻ�����ư.setFocusPainted(false); _3����8�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(3,8); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_3����8�ణ���ѻ�����ư);
	 _4����0�ణ���ѻ�����ư.setBounds(X��ǥ[4], Y��ǥ[4][0], 120, 64); _4����0�ణ���ѻ�����ư.setVisible(false); _4����0�ణ���ѻ�����ư.setBorderPainted(false); _4����0�ణ���ѻ�����ư.setContentAreaFilled(false); _4����0�ణ���ѻ�����ư.setFocusPainted(false); _4����0�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(4,0); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_4����0�ణ���ѻ�����ư); 
	 _4����1�ణ���ѻ�����ư.setBounds(X��ǥ[4], Y��ǥ[4][1], 120, 64); _4����1�ణ���ѻ�����ư.setVisible(false); _4����1�ణ���ѻ�����ư.setBorderPainted(false); _4����1�ణ���ѻ�����ư.setContentAreaFilled(false); _4����1�ణ���ѻ�����ư.setFocusPainted(false); _4����1�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(4,1); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_4����1�ణ���ѻ�����ư); 
	 _4����2�ణ���ѻ�����ư.setBounds(X��ǥ[4], Y��ǥ[4][2], 120, 64); _4����2�ణ���ѻ�����ư.setVisible(false); _4����2�ణ���ѻ�����ư.setBorderPainted(false); _4����2�ణ���ѻ�����ư.setContentAreaFilled(false); _4����2�ణ���ѻ�����ư.setFocusPainted(false); _4����2�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(4,2); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_4����2�ణ���ѻ�����ư); 
	 _4����3�ణ���ѻ�����ư.setBounds(X��ǥ[4], Y��ǥ[4][3], 120, 64); _4����3�ణ���ѻ�����ư.setVisible(false); _4����3�ణ���ѻ�����ư.setBorderPainted(false); _4����3�ణ���ѻ�����ư.setContentAreaFilled(false); _4����3�ణ���ѻ�����ư.setFocusPainted(false); _4����3�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(4,3); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_4����3�ణ���ѻ�����ư); 
	 _4����4�ణ���ѻ�����ư.setBounds(X��ǥ[4], Y��ǥ[4][4], 120, 64); _4����4�ణ���ѻ�����ư.setVisible(false); _4����4�ణ���ѻ�����ư.setBorderPainted(false); _4����4�ణ���ѻ�����ư.setContentAreaFilled(false); _4����4�ణ���ѻ�����ư.setFocusPainted(false); _4����4�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(4,4); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_4����4�ణ���ѻ�����ư); 
	 _4����5�ణ���ѻ�����ư.setBounds(X��ǥ[4], Y��ǥ[4][5], 120, 64); _4����5�ణ���ѻ�����ư.setVisible(false); _4����5�ణ���ѻ�����ư.setBorderPainted(false); _4����5�ణ���ѻ�����ư.setContentAreaFilled(false); _4����5�ణ���ѻ�����ư.setFocusPainted(false); _4����5�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(4,5); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_4����5�ణ���ѻ�����ư); 
	 _4����6�ణ���ѻ�����ư.setBounds(X��ǥ[4], Y��ǥ[4][6], 120, 64); _4����6�ణ���ѻ�����ư.setVisible(false); _4����6�ణ���ѻ�����ư.setBorderPainted(false); _4����6�ణ���ѻ�����ư.setContentAreaFilled(false); _4����6�ణ���ѻ�����ư.setFocusPainted(false); _4����6�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(4,6); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_4����6�ణ���ѻ�����ư); 
	 _4����7�ణ���ѻ�����ư.setBounds(X��ǥ[4], Y��ǥ[4][7], 120, 64); _4����7�ణ���ѻ�����ư.setVisible(false); _4����7�ణ���ѻ�����ư.setBorderPainted(false); _4����7�ణ���ѻ�����ư.setContentAreaFilled(false); _4����7�ణ���ѻ�����ư.setFocusPainted(false); _4����7�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(4,7); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_4����7�ణ���ѻ�����ư); 
	 _4����8�ణ���ѻ�����ư.setBounds(X��ǥ[4], Y��ǥ[4][8], 120, 64); _4����8�ణ���ѻ�����ư.setVisible(false); _4����8�ణ���ѻ�����ư.setBorderPainted(false); _4����8�ణ���ѻ�����ư.setContentAreaFilled(false); _4����8�ణ���ѻ�����ư.setFocusPainted(false); _4����8�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(4,8); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_4����8�ణ���ѻ�����ư);
	 _5����0�ణ���ѻ�����ư.setBounds(X��ǥ[5], Y��ǥ[5][0], 120, 60); _5����0�ణ���ѻ�����ư.setVisible(false); _5����0�ణ���ѻ�����ư.setBorderPainted(false); _5����0�ణ���ѻ�����ư.setContentAreaFilled(false); _5����0�ణ���ѻ�����ư.setFocusPainted(false); _5����0�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(5,0); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_5����0�ణ���ѻ�����ư); 
	 _5����1�ణ���ѻ�����ư.setBounds(X��ǥ[5], Y��ǥ[5][1], 120, 60); _5����1�ణ���ѻ�����ư.setVisible(false); _5����1�ణ���ѻ�����ư.setBorderPainted(false); _5����1�ణ���ѻ�����ư.setContentAreaFilled(false); _5����1�ణ���ѻ�����ư.setFocusPainted(false); _5����1�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(5,1); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_5����1�ణ���ѻ�����ư); 
	 _5����2�ణ���ѻ�����ư.setBounds(X��ǥ[5], Y��ǥ[5][2], 120, 60); _5����2�ణ���ѻ�����ư.setVisible(false); _5����2�ణ���ѻ�����ư.setBorderPainted(false); _5����2�ణ���ѻ�����ư.setContentAreaFilled(false); _5����2�ణ���ѻ�����ư.setFocusPainted(false); _5����2�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(5,2); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_5����2�ణ���ѻ�����ư); 
	 _5����3�ణ���ѻ�����ư.setBounds(X��ǥ[5], Y��ǥ[5][3], 120, 60); _5����3�ణ���ѻ�����ư.setVisible(false); _5����3�ణ���ѻ�����ư.setBorderPainted(false); _5����3�ణ���ѻ�����ư.setContentAreaFilled(false); _5����3�ణ���ѻ�����ư.setFocusPainted(false); _5����3�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(5,3); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_5����3�ణ���ѻ�����ư); 
	 _5����4�ణ���ѻ�����ư.setBounds(X��ǥ[5], Y��ǥ[5][4], 120, 60); _5����4�ణ���ѻ�����ư.setVisible(false); _5����4�ణ���ѻ�����ư.setBorderPainted(false); _5����4�ణ���ѻ�����ư.setContentAreaFilled(false); _5����4�ణ���ѻ�����ư.setFocusPainted(false); _5����4�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(5,4); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_5����4�ణ���ѻ�����ư); 
	 _5����5�ణ���ѻ�����ư.setBounds(X��ǥ[5], Y��ǥ[5][5], 120, 60); _5����5�ణ���ѻ�����ư.setVisible(false); _5����5�ణ���ѻ�����ư.setBorderPainted(false); _5����5�ణ���ѻ�����ư.setContentAreaFilled(false); _5����5�ణ���ѻ�����ư.setFocusPainted(false); _5����5�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(5,5); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_5����5�ణ���ѻ�����ư); 
	 _5����6�ణ���ѻ�����ư.setBounds(X��ǥ[5], Y��ǥ[5][6], 120, 60); _5����6�ణ���ѻ�����ư.setVisible(false); _5����6�ణ���ѻ�����ư.setBorderPainted(false); _5����6�ణ���ѻ�����ư.setContentAreaFilled(false); _5����6�ణ���ѻ�����ư.setFocusPainted(false); _5����6�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(5,6); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_5����6�ణ���ѻ�����ư); 
	 _5����7�ణ���ѻ�����ư.setBounds(X��ǥ[5], Y��ǥ[5][7], 120, 60); _5����7�ణ���ѻ�����ư.setVisible(false); _5����7�ణ���ѻ�����ư.setBorderPainted(false); _5����7�ణ���ѻ�����ư.setContentAreaFilled(false); _5����7�ణ���ѻ�����ư.setFocusPainted(false); _5����7�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(5,7); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_5����7�ణ���ѻ�����ư); 
	 _5����8�ణ���ѻ�����ư.setBounds(X��ǥ[5], Y��ǥ[5][8], 120, 60); _5����8�ణ���ѻ�����ư.setVisible(false); _5����8�ణ���ѻ�����ư.setBorderPainted(false); _5����8�ణ���ѻ�����ư.setContentAreaFilled(false); _5����8�ణ���ѻ�����ư.setFocusPainted(false); _5����8�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(5,8); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_5����8�ణ���ѻ�����ư);
	 _6����0�ణ���ѻ�����ư.setBounds(X��ǥ[6], Y��ǥ[6][0], 120, 60); _6����0�ణ���ѻ�����ư.setVisible(false); _6����0�ణ���ѻ�����ư.setBorderPainted(false); _6����0�ణ���ѻ�����ư.setContentAreaFilled(false); _6����0�ణ���ѻ�����ư.setFocusPainted(false); _6����0�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(6,0); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_6����0�ణ���ѻ�����ư); 
	 _6����1�ణ���ѻ�����ư.setBounds(X��ǥ[6], Y��ǥ[6][1], 120, 60); _6����1�ణ���ѻ�����ư.setVisible(false); _6����1�ణ���ѻ�����ư.setBorderPainted(false); _6����1�ణ���ѻ�����ư.setContentAreaFilled(false); _6����1�ణ���ѻ�����ư.setFocusPainted(false); _6����1�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(6,1); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_6����1�ణ���ѻ�����ư); 
	 _6����2�ణ���ѻ�����ư.setBounds(X��ǥ[6], Y��ǥ[6][2], 120, 60); _6����2�ణ���ѻ�����ư.setVisible(false); _6����2�ణ���ѻ�����ư.setBorderPainted(false); _6����2�ణ���ѻ�����ư.setContentAreaFilled(false); _6����2�ణ���ѻ�����ư.setFocusPainted(false); _6����2�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(6,2); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_6����2�ణ���ѻ�����ư);
	 _6����3�ణ���ѻ�����ư.setBounds(X��ǥ[6], Y��ǥ[6][3], 120, 60); _6����3�ణ���ѻ�����ư.setVisible(false); _6����3�ణ���ѻ�����ư.setBorderPainted(false); _6����3�ణ���ѻ�����ư.setContentAreaFilled(false); _6����3�ణ���ѻ�����ư.setFocusPainted(false); _6����3�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(6,3); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_6����3�ణ���ѻ�����ư); 
	 _6����4�ణ���ѻ�����ư.setBounds(X��ǥ[6], Y��ǥ[6][4], 120, 60); _6����4�ణ���ѻ�����ư.setVisible(false); _6����4�ణ���ѻ�����ư.setBorderPainted(false); _6����4�ణ���ѻ�����ư.setContentAreaFilled(false); _6����4�ణ���ѻ�����ư.setFocusPainted(false); _6����4�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(6,4); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_6����4�ణ���ѻ�����ư); 
	 _6����5�ణ���ѻ�����ư.setBounds(X��ǥ[6], Y��ǥ[6][5], 120, 60); _6����5�ణ���ѻ�����ư.setVisible(false); _6����5�ణ���ѻ�����ư.setBorderPainted(false); _6����5�ణ���ѻ�����ư.setContentAreaFilled(false); _6����5�ణ���ѻ�����ư.setFocusPainted(false); _6����5�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(6,5); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_6����5�ణ���ѻ�����ư); 
	 _6����6�ణ���ѻ�����ư.setBounds(X��ǥ[6], Y��ǥ[6][6], 120, 60); _6����6�ణ���ѻ�����ư.setVisible(false); _6����6�ణ���ѻ�����ư.setBorderPainted(false); _6����6�ణ���ѻ�����ư.setContentAreaFilled(false); _6����6�ణ���ѻ�����ư.setFocusPainted(false); _6����6�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(6,6); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_6����6�ణ���ѻ�����ư); 
	 _6����7�ణ���ѻ�����ư.setBounds(X��ǥ[6], Y��ǥ[6][7], 120, 60); _6����7�ణ���ѻ�����ư.setVisible(false); _6����7�ణ���ѻ�����ư.setBorderPainted(false); _6����7�ణ���ѻ�����ư.setContentAreaFilled(false); _6����7�ణ���ѻ�����ư.setFocusPainted(false); _6����7�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(6,7); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_6����7�ణ���ѻ�����ư); 
	 _6����8�ణ���ѻ�����ư.setBounds(X��ǥ[6], Y��ǥ[6][8], 120, 60); _6����8�ణ���ѻ�����ư.setVisible(false); _6����8�ణ���ѻ�����ư.setBorderPainted(false); _6����8�ణ���ѻ�����ư.setContentAreaFilled(false); _6����8�ణ���ѻ�����ư.setFocusPainted(false); _6����8�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(6,8); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_6����8�ణ���ѻ�����ư);
	 _7����0�ణ���ѻ�����ư.setBounds(X��ǥ[7], Y��ǥ[7][0], 120, 60); _7����0�ణ���ѻ�����ư.setVisible(false); _7����0�ణ���ѻ�����ư.setBorderPainted(false); _7����0�ణ���ѻ�����ư.setContentAreaFilled(false); _7����0�ణ���ѻ�����ư.setFocusPainted(false); _7����0�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(7,0); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_7����0�ణ���ѻ�����ư); 
	 _7����1�ణ���ѻ�����ư.setBounds(X��ǥ[7], Y��ǥ[7][1], 120, 60); _7����1�ణ���ѻ�����ư.setVisible(false); _7����1�ణ���ѻ�����ư.setBorderPainted(false); _7����1�ణ���ѻ�����ư.setContentAreaFilled(false); _7����1�ణ���ѻ�����ư.setFocusPainted(false); _7����1�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(7,1); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_7����1�ణ���ѻ�����ư); 
	 _7����2�ణ���ѻ�����ư.setBounds(X��ǥ[7], Y��ǥ[7][2], 120, 60); _7����2�ణ���ѻ�����ư.setVisible(false); _7����2�ణ���ѻ�����ư.setBorderPainted(false); _7����2�ణ���ѻ�����ư.setContentAreaFilled(false); _7����2�ణ���ѻ�����ư.setFocusPainted(false); _7����2�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(7,2); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_7����2�ణ���ѻ�����ư); 
	 _7����3�ణ���ѻ�����ư.setBounds(X��ǥ[7], Y��ǥ[7][3], 120, 60); _7����3�ణ���ѻ�����ư.setVisible(false); _7����3�ణ���ѻ�����ư.setBorderPainted(false); _7����3�ణ���ѻ�����ư.setContentAreaFilled(false); _7����3�ణ���ѻ�����ư.setFocusPainted(false); _7����3�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(7,3); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_7����3�ణ���ѻ�����ư); 
	 _7����4�ణ���ѻ�����ư.setBounds(X��ǥ[7], Y��ǥ[7][4], 120, 60); _7����4�ణ���ѻ�����ư.setVisible(false); _7����4�ణ���ѻ�����ư.setBorderPainted(false); _7����4�ణ���ѻ�����ư.setContentAreaFilled(false); _7����4�ణ���ѻ�����ư.setFocusPainted(false); _7����4�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(7,4); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_7����4�ణ���ѻ�����ư); 
	 _7����5�ణ���ѻ�����ư.setBounds(X��ǥ[7], Y��ǥ[7][5], 120, 60); _7����5�ణ���ѻ�����ư.setVisible(false); _7����5�ణ���ѻ�����ư.setBorderPainted(false); _7����5�ణ���ѻ�����ư.setContentAreaFilled(false); _7����5�ణ���ѻ�����ư.setFocusPainted(false); _7����5�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(7,5); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_7����5�ణ���ѻ�����ư); 
	 _7����6�ణ���ѻ�����ư.setBounds(X��ǥ[7], Y��ǥ[7][6], 120, 60); _7����6�ణ���ѻ�����ư.setVisible(false); _7����6�ణ���ѻ�����ư.setBorderPainted(false); _7����6�ణ���ѻ�����ư.setContentAreaFilled(false); _7����6�ణ���ѻ�����ư.setFocusPainted(false); _7����6�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(7,6); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_7����6�ణ���ѻ�����ư); 
	 _7����7�ణ���ѻ�����ư.setBounds(X��ǥ[7], Y��ǥ[7][7], 120, 60); _7����7�ణ���ѻ�����ư.setVisible(false); _7����7�ణ���ѻ�����ư.setBorderPainted(false); _7����7�ణ���ѻ�����ư.setContentAreaFilled(false); _7����7�ణ���ѻ�����ư.setFocusPainted(false); _7����7�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(7,7); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_7����7�ణ���ѻ�����ư); 
	 _7����8�ణ���ѻ�����ư.setBounds(X��ǥ[7], Y��ǥ[7][8], 120, 60); _7����8�ణ���ѻ�����ư.setVisible(false); _7����8�ణ���ѻ�����ư.setBorderPainted(false); _7����8�ణ���ѻ�����ư.setContentAreaFilled(false); _7����8�ణ���ѻ�����ư.setFocusPainted(false); _7����8�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(7,8); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_7����8�ణ���ѻ�����ư);
	 _8����0�ణ���ѻ�����ư.setBounds(X��ǥ[8], Y��ǥ[8][0], 120, 60); _8����0�ణ���ѻ�����ư.setVisible(false); _8����0�ణ���ѻ�����ư.setBorderPainted(false); _8����0�ణ���ѻ�����ư.setContentAreaFilled(false); _8����0�ణ���ѻ�����ư.setFocusPainted(false); _8����0�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(8,0); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_8����0�ణ���ѻ�����ư); 
	 _8����1�ణ���ѻ�����ư.setBounds(X��ǥ[8], Y��ǥ[8][1], 120, 60); _8����1�ణ���ѻ�����ư.setVisible(false); _8����1�ణ���ѻ�����ư.setBorderPainted(false); _8����1�ణ���ѻ�����ư.setContentAreaFilled(false); _8����1�ణ���ѻ�����ư.setFocusPainted(false); _8����1�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(8,1); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_8����1�ణ���ѻ�����ư); 
	 _8����2�ణ���ѻ�����ư.setBounds(X��ǥ[8], Y��ǥ[8][2], 120, 60); _8����2�ణ���ѻ�����ư.setVisible(false); _8����2�ణ���ѻ�����ư.setBorderPainted(false); _8����2�ణ���ѻ�����ư.setContentAreaFilled(false); _8����2�ణ���ѻ�����ư.setFocusPainted(false); _8����2�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(8,2); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_8����2�ణ���ѻ�����ư); 
	 _8����3�ణ���ѻ�����ư.setBounds(X��ǥ[8], Y��ǥ[8][3], 120, 60); _8����3�ణ���ѻ�����ư.setVisible(false); _8����3�ణ���ѻ�����ư.setBorderPainted(false); _8����3�ణ���ѻ�����ư.setContentAreaFilled(false); _8����3�ణ���ѻ�����ư.setFocusPainted(false); _8����3�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(8,3); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_8����3�ణ���ѻ�����ư); 
	 _8����4�ణ���ѻ�����ư.setBounds(X��ǥ[8], Y��ǥ[8][4], 120, 60); _8����4�ణ���ѻ�����ư.setVisible(false); _8����4�ణ���ѻ�����ư.setBorderPainted(false); _8����4�ణ���ѻ�����ư.setContentAreaFilled(false); _8����4�ణ���ѻ�����ư.setFocusPainted(false); _8����4�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(8,4); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_8����4�ణ���ѻ�����ư); 
	 _8����5�ణ���ѻ�����ư.setBounds(X��ǥ[8], Y��ǥ[8][5], 120, 60); _8����5�ణ���ѻ�����ư.setVisible(false); _8����5�ణ���ѻ�����ư.setBorderPainted(false); _8����5�ణ���ѻ�����ư.setContentAreaFilled(false); _8����5�ణ���ѻ�����ư.setFocusPainted(false); _8����5�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(8,5); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_8����5�ణ���ѻ�����ư); 
	 _8����6�ణ���ѻ�����ư.setBounds(X��ǥ[8], Y��ǥ[8][6], 120, 60); _8����6�ణ���ѻ�����ư.setVisible(false); _8����6�ణ���ѻ�����ư.setBorderPainted(false); _8����6�ణ���ѻ�����ư.setContentAreaFilled(false); _8����6�ణ���ѻ�����ư.setFocusPainted(false); _8����6�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(8,6); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_8����6�ణ���ѻ�����ư); 
	 _8����7�ణ���ѻ�����ư.setBounds(X��ǥ[8], Y��ǥ[8][7], 120, 60); _8����7�ణ���ѻ�����ư.setVisible(false); _8����7�ణ���ѻ�����ư.setBorderPainted(false); _8����7�ణ���ѻ�����ư.setContentAreaFilled(false); _8����7�ణ���ѻ�����ư.setFocusPainted(false); _8����7�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(8,7); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_8����7�ణ���ѻ�����ư); 
	 _8����8�ణ���ѻ�����ư.setBounds(X��ǥ[8], Y��ǥ[8][8], 120, 60); _8����8�ణ���ѻ�����ư.setVisible(false); _8����8�ణ���ѻ�����ư.setBorderPainted(false); _8����8�ణ���ѻ�����ư.setContentAreaFilled(false); _8����8�ణ���ѻ�����ư.setFocusPainted(false); _8����8�ణ���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(8,8); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_8����8�ణ���ѻ�����ư);	

	 _0����0���ѻ�����ư.setBounds(X��ǥ[0], Y��ǥ[0][0], 120, 60); _0����0���ѻ�����ư.setVisible(false); _0����0���ѻ�����ư.setBorderPainted(false); _0����0���ѻ�����ư.setContentAreaFilled(false); _0����0���ѻ�����ư.setFocusPainted(false); _0����0���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(0,0); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_0����0���ѻ�����ư);
	 _0����1���ѻ�����ư.setBounds(X��ǥ[0], Y��ǥ[0][1], 120, 60); _0����1���ѻ�����ư.setVisible(false); _0����1���ѻ�����ư.setBorderPainted(false); _0����1���ѻ�����ư.setContentAreaFilled(false); _0����1���ѻ�����ư.setFocusPainted(false); _0����1���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(0,1); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_0����1���ѻ�����ư);
	 _0����2���ѻ�����ư.setBounds(X��ǥ[0], Y��ǥ[0][2], 120, 60); _0����2���ѻ�����ư.setVisible(false); _0����2���ѻ�����ư.setBorderPainted(false); _0����2���ѻ�����ư.setContentAreaFilled(false); _0����2���ѻ�����ư.setFocusPainted(false); _0����2���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(0,2); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_0����2���ѻ�����ư);
	 _0����3���ѻ�����ư.setBounds(X��ǥ[0], Y��ǥ[0][3], 120, 60); _0����3���ѻ�����ư.setVisible(false); _0����3���ѻ�����ư.setBorderPainted(false); _0����3���ѻ�����ư.setContentAreaFilled(false); _0����3���ѻ�����ư.setFocusPainted(false); _0����3���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(0,3); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_0����3���ѻ�����ư);
	 _0����4���ѻ�����ư.setBounds(X��ǥ[0], Y��ǥ[0][4], 120, 60); _0����4���ѻ�����ư.setVisible(false); _0����4���ѻ�����ư.setBorderPainted(false); _0����4���ѻ�����ư.setContentAreaFilled(false); _0����4���ѻ�����ư.setFocusPainted(false); _0����4���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(0,4); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_0����4���ѻ�����ư);
	 _0����5���ѻ�����ư.setBounds(X��ǥ[0], Y��ǥ[0][5], 120, 60); _0����5���ѻ�����ư.setVisible(false); _0����5���ѻ�����ư.setBorderPainted(false); _0����5���ѻ�����ư.setContentAreaFilled(false); _0����5���ѻ�����ư.setFocusPainted(false); _0����5���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(0,5); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_0����5���ѻ�����ư);
	 _0����6���ѻ�����ư.setBounds(X��ǥ[0], Y��ǥ[0][6], 120, 60); _0����6���ѻ�����ư.setVisible(false); _0����6���ѻ�����ư.setBorderPainted(false); _0����6���ѻ�����ư.setContentAreaFilled(false); _0����6���ѻ�����ư.setFocusPainted(false); _0����6���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(0,6); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_0����6���ѻ�����ư);
	 _0����7���ѻ�����ư.setBounds(X��ǥ[0], Y��ǥ[0][7], 120, 60); _0����7���ѻ�����ư.setVisible(false); _0����7���ѻ�����ư.setBorderPainted(false); _0����7���ѻ�����ư.setContentAreaFilled(false); _0����7���ѻ�����ư.setFocusPainted(false); _0����7���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(0,7); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_0����7���ѻ�����ư);
	 _0����8���ѻ�����ư.setBounds(X��ǥ[0], Y��ǥ[0][8], 120, 60); _0����8���ѻ�����ư.setVisible(false); _0����8���ѻ�����ư.setBorderPainted(false); _0����8���ѻ�����ư.setContentAreaFilled(false); _0����8���ѻ�����ư.setFocusPainted(false); _0����8���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(0,8); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_0����8���ѻ�����ư);
	 _1����0���ѻ�����ư.setBounds(X��ǥ[1], Y��ǥ[1][0], 120, 60); _1����0���ѻ�����ư.setVisible(false); _1����0���ѻ�����ư.setBorderPainted(false); _1����0���ѻ�����ư.setContentAreaFilled(false); _1����0���ѻ�����ư.setFocusPainted(false); _1����0���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(1,0); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_1����0���ѻ�����ư); 
	 _1����1���ѻ�����ư.setBounds(X��ǥ[1], Y��ǥ[1][1], 120, 60); _1����1���ѻ�����ư.setVisible(false); _1����1���ѻ�����ư.setBorderPainted(false); _1����1���ѻ�����ư.setContentAreaFilled(false); _1����1���ѻ�����ư.setFocusPainted(false); _1����1���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(1,1); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_1����1���ѻ�����ư); 
	 _1����2���ѻ�����ư.setBounds(X��ǥ[1], Y��ǥ[1][2], 120, 60); _1����2���ѻ�����ư.setVisible(false); _1����2���ѻ�����ư.setBorderPainted(false); _1����2���ѻ�����ư.setContentAreaFilled(false); _1����2���ѻ�����ư.setFocusPainted(false); _1����2���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(1,2); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_1����2���ѻ�����ư); 
	 _1����3���ѻ�����ư.setBounds(X��ǥ[1], Y��ǥ[1][3], 120, 60); _1����3���ѻ�����ư.setVisible(false); _1����3���ѻ�����ư.setBorderPainted(false); _1����3���ѻ�����ư.setContentAreaFilled(false); _1����3���ѻ�����ư.setFocusPainted(false); _1����3���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(1,3); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_1����3���ѻ�����ư); 
	 _1����4���ѻ�����ư.setBounds(X��ǥ[1], Y��ǥ[1][4], 120, 60); _1����4���ѻ�����ư.setVisible(false); _1����4���ѻ�����ư.setBorderPainted(false); _1����4���ѻ�����ư.setContentAreaFilled(false); _1����4���ѻ�����ư.setFocusPainted(false); _1����4���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(1,4); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_1����4���ѻ�����ư); 
	 _1����5���ѻ�����ư.setBounds(X��ǥ[1], Y��ǥ[1][5], 120, 60); _1����5���ѻ�����ư.setVisible(false); _1����5���ѻ�����ư.setBorderPainted(false); _1����5���ѻ�����ư.setContentAreaFilled(false); _1����5���ѻ�����ư.setFocusPainted(false); _1����5���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(1,5); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_1����5���ѻ�����ư); 
	 _1����6���ѻ�����ư.setBounds(X��ǥ[1], Y��ǥ[1][6], 120, 60); _1����6���ѻ�����ư.setVisible(false); _1����6���ѻ�����ư.setBorderPainted(false); _1����6���ѻ�����ư.setContentAreaFilled(false); _1����6���ѻ�����ư.setFocusPainted(false); _1����6���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(1,6); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_1����6���ѻ�����ư); 
	 _1����7���ѻ�����ư.setBounds(X��ǥ[1], Y��ǥ[1][7], 120, 60); _1����7���ѻ�����ư.setVisible(false); _1����7���ѻ�����ư.setBorderPainted(false); _1����7���ѻ�����ư.setContentAreaFilled(false); _1����7���ѻ�����ư.setFocusPainted(false); _1����7���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(1,7); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_1����7���ѻ�����ư); 
	 _1����8���ѻ�����ư.setBounds(X��ǥ[1], Y��ǥ[1][8], 120, 60); _1����8���ѻ�����ư.setVisible(false); _1����8���ѻ�����ư.setBorderPainted(false); _1����8���ѻ�����ư.setContentAreaFilled(false); _1����8���ѻ�����ư.setFocusPainted(false); _1����8���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(1,8); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_1����8���ѻ�����ư);
	 _2����0���ѻ�����ư.setBounds(X��ǥ[2], Y��ǥ[2][0], 120, 60); _2����0���ѻ�����ư.setVisible(false); _2����0���ѻ�����ư.setBorderPainted(false); _2����0���ѻ�����ư.setContentAreaFilled(false); _2����0���ѻ�����ư.setFocusPainted(false); _2����0���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(2,0); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_2����0���ѻ�����ư); 
	 _2����1���ѻ�����ư.setBounds(X��ǥ[2], Y��ǥ[2][1], 120, 60); _2����1���ѻ�����ư.setVisible(false); _2����1���ѻ�����ư.setBorderPainted(false); _2����1���ѻ�����ư.setContentAreaFilled(false); _2����1���ѻ�����ư.setFocusPainted(false); _2����1���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(2,1); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_2����1���ѻ�����ư); 
	 _2����2���ѻ�����ư.setBounds(X��ǥ[2], Y��ǥ[2][2], 120, 60); _2����2���ѻ�����ư.setVisible(false); _2����2���ѻ�����ư.setBorderPainted(false); _2����2���ѻ�����ư.setContentAreaFilled(false); _2����2���ѻ�����ư.setFocusPainted(false); _2����2���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(2,2); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_2����2���ѻ�����ư); 
	 _2����3���ѻ�����ư.setBounds(X��ǥ[2], Y��ǥ[2][3], 120, 60); _2����3���ѻ�����ư.setVisible(false); _2����3���ѻ�����ư.setBorderPainted(false); _2����3���ѻ�����ư.setContentAreaFilled(false); _2����3���ѻ�����ư.setFocusPainted(false); _2����3���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(2,3); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_2����3���ѻ�����ư); 
	 _2����4���ѻ�����ư.setBounds(X��ǥ[2], Y��ǥ[2][4], 120, 60); _2����4���ѻ�����ư.setVisible(false); _2����4���ѻ�����ư.setBorderPainted(false); _2����4���ѻ�����ư.setContentAreaFilled(false); _2����4���ѻ�����ư.setFocusPainted(false); _2����4���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(2,4); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_2����4���ѻ�����ư); 
	 _2����5���ѻ�����ư.setBounds(X��ǥ[2], Y��ǥ[2][5], 120, 60); _2����5���ѻ�����ư.setVisible(false); _2����5���ѻ�����ư.setBorderPainted(false); _2����5���ѻ�����ư.setContentAreaFilled(false); _2����5���ѻ�����ư.setFocusPainted(false); _2����5���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(2,5); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_2����5���ѻ�����ư); 
	 _2����6���ѻ�����ư.setBounds(X��ǥ[2], Y��ǥ[2][6], 120, 60); _2����6���ѻ�����ư.setVisible(false); _2����6���ѻ�����ư.setBorderPainted(false); _2����6���ѻ�����ư.setContentAreaFilled(false); _2����6���ѻ�����ư.setFocusPainted(false); _2����6���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(2,6); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_2����6���ѻ�����ư); 
	 _2����7���ѻ�����ư.setBounds(X��ǥ[2], Y��ǥ[2][7], 120, 60); _2����7���ѻ�����ư.setVisible(false); _2����7���ѻ�����ư.setBorderPainted(false); _2����7���ѻ�����ư.setContentAreaFilled(false); _2����7���ѻ�����ư.setFocusPainted(false); _2����7���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(2,7); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_2����7���ѻ�����ư); 
	 _2����8���ѻ�����ư.setBounds(X��ǥ[2], Y��ǥ[2][8], 120, 60); _2����8���ѻ�����ư.setVisible(false); _2����8���ѻ�����ư.setBorderPainted(false); _2����8���ѻ�����ư.setContentAreaFilled(false); _2����8���ѻ�����ư.setFocusPainted(false); _2����8���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(2,8); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_2����8���ѻ�����ư);
	 _3����0���ѻ�����ư.setBounds(X��ǥ[3], Y��ǥ[3][0], 120, 60); _3����0���ѻ�����ư.setVisible(false); _3����0���ѻ�����ư.setBorderPainted(false); _3����0���ѻ�����ư.setContentAreaFilled(false); _3����0���ѻ�����ư.setFocusPainted(false); _3����0���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(3,0); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_3����0���ѻ�����ư); 
	 _3����1���ѻ�����ư.setBounds(X��ǥ[3], Y��ǥ[3][1], 120, 60); _3����1���ѻ�����ư.setVisible(false); _3����1���ѻ�����ư.setBorderPainted(false); _3����1���ѻ�����ư.setContentAreaFilled(false); _3����1���ѻ�����ư.setFocusPainted(false); _3����1���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(3,1); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_3����1���ѻ�����ư); 
	 _3����2���ѻ�����ư.setBounds(X��ǥ[3], Y��ǥ[3][2], 120, 60); _3����2���ѻ�����ư.setVisible(false); _3����2���ѻ�����ư.setBorderPainted(false); _3����2���ѻ�����ư.setContentAreaFilled(false); _3����2���ѻ�����ư.setFocusPainted(false); _3����2���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(3,2); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_3����2���ѻ�����ư); 
	 _3����3���ѻ�����ư.setBounds(X��ǥ[3], Y��ǥ[3][3], 120, 60); _3����3���ѻ�����ư.setVisible(false); _3����3���ѻ�����ư.setBorderPainted(false); _3����3���ѻ�����ư.setContentAreaFilled(false); _3����3���ѻ�����ư.setFocusPainted(false); _3����3���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(3,3); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_3����3���ѻ�����ư); 
	 _3����4���ѻ�����ư.setBounds(X��ǥ[3], Y��ǥ[3][4], 120, 60); _3����4���ѻ�����ư.setVisible(false); _3����4���ѻ�����ư.setBorderPainted(false); _3����4���ѻ�����ư.setContentAreaFilled(false); _3����4���ѻ�����ư.setFocusPainted(false); _3����4���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(3,4); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_3����4���ѻ�����ư); 
	 _3����5���ѻ�����ư.setBounds(X��ǥ[3], Y��ǥ[3][5], 120, 60); _3����5���ѻ�����ư.setVisible(false); _3����5���ѻ�����ư.setBorderPainted(false); _3����5���ѻ�����ư.setContentAreaFilled(false); _3����5���ѻ�����ư.setFocusPainted(false); _3����5���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(3,5); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_3����5���ѻ�����ư); 
	 _3����6���ѻ�����ư.setBounds(X��ǥ[3], Y��ǥ[3][6], 120, 60); _3����6���ѻ�����ư.setVisible(false); _3����6���ѻ�����ư.setBorderPainted(false); _3����6���ѻ�����ư.setContentAreaFilled(false); _3����6���ѻ�����ư.setFocusPainted(false); _3����6���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(3,6); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_3����6���ѻ�����ư); 
	 _3����7���ѻ�����ư.setBounds(X��ǥ[3], Y��ǥ[3][7], 120, 60); _3����7���ѻ�����ư.setVisible(false); _3����7���ѻ�����ư.setBorderPainted(false); _3����7���ѻ�����ư.setContentAreaFilled(false); _3����7���ѻ�����ư.setFocusPainted(false); _3����7���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(3,7); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_3����7���ѻ�����ư); 
	 _3����8���ѻ�����ư.setBounds(X��ǥ[3], Y��ǥ[3][8], 120, 60); _3����8���ѻ�����ư.setVisible(false); _3����8���ѻ�����ư.setBorderPainted(false); _3����8���ѻ�����ư.setContentAreaFilled(false); _3����8���ѻ�����ư.setFocusPainted(false); _3����8���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(3,8); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_3����8���ѻ�����ư);
	 _4����0���ѻ�����ư.setBounds(X��ǥ[4], Y��ǥ[4][0], 120, 64); _4����0���ѻ�����ư.setVisible(false); _4����0���ѻ�����ư.setBorderPainted(false); _4����0���ѻ�����ư.setContentAreaFilled(false); _4����0���ѻ�����ư.setFocusPainted(false); _4����0���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(4,0); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_4����0���ѻ�����ư); 
	 _4����1���ѻ�����ư.setBounds(X��ǥ[4], Y��ǥ[4][1], 120, 64); _4����1���ѻ�����ư.setVisible(false); _4����1���ѻ�����ư.setBorderPainted(false); _4����1���ѻ�����ư.setContentAreaFilled(false); _4����1���ѻ�����ư.setFocusPainted(false); _4����1���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(4,1); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_4����1���ѻ�����ư); 
	 _4����2���ѻ�����ư.setBounds(X��ǥ[4], Y��ǥ[4][2], 120, 64); _4����2���ѻ�����ư.setVisible(false); _4����2���ѻ�����ư.setBorderPainted(false); _4����2���ѻ�����ư.setContentAreaFilled(false); _4����2���ѻ�����ư.setFocusPainted(false); _4����2���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(4,2); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_4����2���ѻ�����ư); 
	 _4����3���ѻ�����ư.setBounds(X��ǥ[4], Y��ǥ[4][3], 120, 64); _4����3���ѻ�����ư.setVisible(false); _4����3���ѻ�����ư.setBorderPainted(false); _4����3���ѻ�����ư.setContentAreaFilled(false); _4����3���ѻ�����ư.setFocusPainted(false); _4����3���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(4,3); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_4����3���ѻ�����ư); 
	 _4����4���ѻ�����ư.setBounds(X��ǥ[4], Y��ǥ[4][4], 120, 64); _4����4���ѻ�����ư.setVisible(false); _4����4���ѻ�����ư.setBorderPainted(false); _4����4���ѻ�����ư.setContentAreaFilled(false); _4����4���ѻ�����ư.setFocusPainted(false); _4����4���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(4,4); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_4����4���ѻ�����ư); 
	 _4����5���ѻ�����ư.setBounds(X��ǥ[4], Y��ǥ[4][5], 120, 64); _4����5���ѻ�����ư.setVisible(false); _4����5���ѻ�����ư.setBorderPainted(false); _4����5���ѻ�����ư.setContentAreaFilled(false); _4����5���ѻ�����ư.setFocusPainted(false); _4����5���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(4,5); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_4����5���ѻ�����ư); 
	 _4����6���ѻ�����ư.setBounds(X��ǥ[4], Y��ǥ[4][6], 120, 64); _4����6���ѻ�����ư.setVisible(false); _4����6���ѻ�����ư.setBorderPainted(false); _4����6���ѻ�����ư.setContentAreaFilled(false); _4����6���ѻ�����ư.setFocusPainted(false); _4����6���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(4,6); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_4����6���ѻ�����ư); 
	 _4����7���ѻ�����ư.setBounds(X��ǥ[4], Y��ǥ[4][7], 120, 64); _4����7���ѻ�����ư.setVisible(false); _4����7���ѻ�����ư.setBorderPainted(false); _4����7���ѻ�����ư.setContentAreaFilled(false); _4����7���ѻ�����ư.setFocusPainted(false); _4����7���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(4,7); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_4����7���ѻ�����ư); 
	 _4����8���ѻ�����ư.setBounds(X��ǥ[4], Y��ǥ[4][8], 120, 64); _4����8���ѻ�����ư.setVisible(false); _4����8���ѻ�����ư.setBorderPainted(false); _4����8���ѻ�����ư.setContentAreaFilled(false); _4����8���ѻ�����ư.setFocusPainted(false); _4����8���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(4,8); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_4����8���ѻ�����ư);
	 _5����0���ѻ�����ư.setBounds(X��ǥ[5], Y��ǥ[5][0], 120, 60); _5����0���ѻ�����ư.setVisible(false); _5����0���ѻ�����ư.setBorderPainted(false); _5����0���ѻ�����ư.setContentAreaFilled(false); _5����0���ѻ�����ư.setFocusPainted(false); _5����0���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(5,0); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_5����0���ѻ�����ư); 
	 _5����1���ѻ�����ư.setBounds(X��ǥ[5], Y��ǥ[5][1], 120, 60); _5����1���ѻ�����ư.setVisible(false); _5����1���ѻ�����ư.setBorderPainted(false); _5����1���ѻ�����ư.setContentAreaFilled(false); _5����1���ѻ�����ư.setFocusPainted(false); _5����1���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(5,1); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_5����1���ѻ�����ư); 
	 _5����2���ѻ�����ư.setBounds(X��ǥ[5], Y��ǥ[5][2], 120, 60); _5����2���ѻ�����ư.setVisible(false); _5����2���ѻ�����ư.setBorderPainted(false); _5����2���ѻ�����ư.setContentAreaFilled(false); _5����2���ѻ�����ư.setFocusPainted(false); _5����2���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(5,2); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_5����2���ѻ�����ư); 
	 _5����3���ѻ�����ư.setBounds(X��ǥ[5], Y��ǥ[5][3], 120, 60); _5����3���ѻ�����ư.setVisible(false); _5����3���ѻ�����ư.setBorderPainted(false); _5����3���ѻ�����ư.setContentAreaFilled(false); _5����3���ѻ�����ư.setFocusPainted(false); _5����3���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(5,3); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_5����3���ѻ�����ư); 
	 _5����4���ѻ�����ư.setBounds(X��ǥ[5], Y��ǥ[5][4], 120, 60); _5����4���ѻ�����ư.setVisible(false); _5����4���ѻ�����ư.setBorderPainted(false); _5����4���ѻ�����ư.setContentAreaFilled(false); _5����4���ѻ�����ư.setFocusPainted(false); _5����4���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(5,4); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_5����4���ѻ�����ư); 
	 _5����5���ѻ�����ư.setBounds(X��ǥ[5], Y��ǥ[5][5], 120, 60); _5����5���ѻ�����ư.setVisible(false); _5����5���ѻ�����ư.setBorderPainted(false); _5����5���ѻ�����ư.setContentAreaFilled(false); _5����5���ѻ�����ư.setFocusPainted(false); _5����5���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(5,5); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_5����5���ѻ�����ư); 
	 _5����6���ѻ�����ư.setBounds(X��ǥ[5], Y��ǥ[5][6], 120, 60); _5����6���ѻ�����ư.setVisible(false); _5����6���ѻ�����ư.setBorderPainted(false); _5����6���ѻ�����ư.setContentAreaFilled(false); _5����6���ѻ�����ư.setFocusPainted(false); _5����6���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(5,6); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_5����6���ѻ�����ư); 
	 _5����7���ѻ�����ư.setBounds(X��ǥ[5], Y��ǥ[5][7], 120, 60); _5����7���ѻ�����ư.setVisible(false); _5����7���ѻ�����ư.setBorderPainted(false); _5����7���ѻ�����ư.setContentAreaFilled(false); _5����7���ѻ�����ư.setFocusPainted(false); _5����7���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(5,7); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_5����7���ѻ�����ư); 
	 _5����8���ѻ�����ư.setBounds(X��ǥ[5], Y��ǥ[5][8], 120, 60); _5����8���ѻ�����ư.setVisible(false); _5����8���ѻ�����ư.setBorderPainted(false); _5����8���ѻ�����ư.setContentAreaFilled(false); _5����8���ѻ�����ư.setFocusPainted(false); _5����8���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(5,8); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_5����8���ѻ�����ư);
	 _6����0���ѻ�����ư.setBounds(X��ǥ[6], Y��ǥ[6][0], 120, 60); _6����0���ѻ�����ư.setVisible(false); _6����0���ѻ�����ư.setBorderPainted(false); _6����0���ѻ�����ư.setContentAreaFilled(false); _6����0���ѻ�����ư.setFocusPainted(false); _6����0���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(6,0); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_6����0���ѻ�����ư); 
	 _6����1���ѻ�����ư.setBounds(X��ǥ[6], Y��ǥ[6][1], 120, 60); _6����1���ѻ�����ư.setVisible(false); _6����1���ѻ�����ư.setBorderPainted(false); _6����1���ѻ�����ư.setContentAreaFilled(false); _6����1���ѻ�����ư.setFocusPainted(false); _6����1���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(6,1); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_6����1���ѻ�����ư); 
	 _6����2���ѻ�����ư.setBounds(X��ǥ[6], Y��ǥ[6][2], 120, 60); _6����2���ѻ�����ư.setVisible(false); _6����2���ѻ�����ư.setBorderPainted(false); _6����2���ѻ�����ư.setContentAreaFilled(false); _6����2���ѻ�����ư.setFocusPainted(false); _6����2���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(6,2); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_6����2���ѻ�����ư);
	 _6����3���ѻ�����ư.setBounds(X��ǥ[6], Y��ǥ[6][3], 120, 60); _6����3���ѻ�����ư.setVisible(false); _6����3���ѻ�����ư.setBorderPainted(false); _6����3���ѻ�����ư.setContentAreaFilled(false); _6����3���ѻ�����ư.setFocusPainted(false); _6����3���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(6,3); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_6����3���ѻ�����ư); 
	 _6����4���ѻ�����ư.setBounds(X��ǥ[6], Y��ǥ[6][4], 120, 60); _6����4���ѻ�����ư.setVisible(false); _6����4���ѻ�����ư.setBorderPainted(false); _6����4���ѻ�����ư.setContentAreaFilled(false); _6����4���ѻ�����ư.setFocusPainted(false); _6����4���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(6,4); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_6����4���ѻ�����ư); 
	 _6����5���ѻ�����ư.setBounds(X��ǥ[6], Y��ǥ[6][5], 120, 60); _6����5���ѻ�����ư.setVisible(false); _6����5���ѻ�����ư.setBorderPainted(false); _6����5���ѻ�����ư.setContentAreaFilled(false); _6����5���ѻ�����ư.setFocusPainted(false); _6����5���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(6,5); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_6����5���ѻ�����ư); 
	 _6����6���ѻ�����ư.setBounds(X��ǥ[6], Y��ǥ[6][6], 120, 60); _6����6���ѻ�����ư.setVisible(false); _6����6���ѻ�����ư.setBorderPainted(false); _6����6���ѻ�����ư.setContentAreaFilled(false); _6����6���ѻ�����ư.setFocusPainted(false); _6����6���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(6,6); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_6����6���ѻ�����ư); 
	 _6����7���ѻ�����ư.setBounds(X��ǥ[6], Y��ǥ[6][7], 120, 60); _6����7���ѻ�����ư.setVisible(false); _6����7���ѻ�����ư.setBorderPainted(false); _6����7���ѻ�����ư.setContentAreaFilled(false); _6����7���ѻ�����ư.setFocusPainted(false); _6����7���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(6,7); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_6����7���ѻ�����ư); 
	 _6����8���ѻ�����ư.setBounds(X��ǥ[6], Y��ǥ[6][8], 120, 60); _6����8���ѻ�����ư.setVisible(false); _6����8���ѻ�����ư.setBorderPainted(false); _6����8���ѻ�����ư.setContentAreaFilled(false); _6����8���ѻ�����ư.setFocusPainted(false); _6����8���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(6,8); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_6����8���ѻ�����ư);
	 _7����0���ѻ�����ư.setBounds(X��ǥ[7], Y��ǥ[7][0], 120, 60); _7����0���ѻ�����ư.setVisible(false); _7����0���ѻ�����ư.setBorderPainted(false); _7����0���ѻ�����ư.setContentAreaFilled(false); _7����0���ѻ�����ư.setFocusPainted(false); _7����0���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(7,0); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_7����0���ѻ�����ư); 
	 _7����1���ѻ�����ư.setBounds(X��ǥ[7], Y��ǥ[7][1], 120, 60); _7����1���ѻ�����ư.setVisible(false); _7����1���ѻ�����ư.setBorderPainted(false); _7����1���ѻ�����ư.setContentAreaFilled(false); _7����1���ѻ�����ư.setFocusPainted(false); _7����1���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(7,1); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_7����1���ѻ�����ư); 
	 _7����2���ѻ�����ư.setBounds(X��ǥ[7], Y��ǥ[7][2], 120, 60); _7����2���ѻ�����ư.setVisible(false); _7����2���ѻ�����ư.setBorderPainted(false); _7����2���ѻ�����ư.setContentAreaFilled(false); _7����2���ѻ�����ư.setFocusPainted(false); _7����2���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(7,2); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_7����2���ѻ�����ư); 
	 _7����3���ѻ�����ư.setBounds(X��ǥ[7], Y��ǥ[7][3], 120, 60); _7����3���ѻ�����ư.setVisible(false); _7����3���ѻ�����ư.setBorderPainted(false); _7����3���ѻ�����ư.setContentAreaFilled(false); _7����3���ѻ�����ư.setFocusPainted(false); _7����3���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(7,3); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_7����3���ѻ�����ư); 
	 _7����4���ѻ�����ư.setBounds(X��ǥ[7], Y��ǥ[7][4], 120, 60); _7����4���ѻ�����ư.setVisible(false); _7����4���ѻ�����ư.setBorderPainted(false); _7����4���ѻ�����ư.setContentAreaFilled(false); _7����4���ѻ�����ư.setFocusPainted(false); _7����4���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(7,4); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_7����4���ѻ�����ư); 
	 _7����5���ѻ�����ư.setBounds(X��ǥ[7], Y��ǥ[7][5], 120, 60); _7����5���ѻ�����ư.setVisible(false); _7����5���ѻ�����ư.setBorderPainted(false); _7����5���ѻ�����ư.setContentAreaFilled(false); _7����5���ѻ�����ư.setFocusPainted(false); _7����5���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(7,5); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_7����5���ѻ�����ư); 
	 _7����6���ѻ�����ư.setBounds(X��ǥ[7], Y��ǥ[7][6], 120, 60); _7����6���ѻ�����ư.setVisible(false); _7����6���ѻ�����ư.setBorderPainted(false); _7����6���ѻ�����ư.setContentAreaFilled(false); _7����6���ѻ�����ư.setFocusPainted(false); _7����6���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(7,6); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_7����6���ѻ�����ư); 
	 _7����7���ѻ�����ư.setBounds(X��ǥ[7], Y��ǥ[7][7], 120, 60); _7����7���ѻ�����ư.setVisible(false); _7����7���ѻ�����ư.setBorderPainted(false); _7����7���ѻ�����ư.setContentAreaFilled(false); _7����7���ѻ�����ư.setFocusPainted(false); _7����7���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(7,7); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_7����7���ѻ�����ư); 
	 _7����8���ѻ�����ư.setBounds(X��ǥ[7], Y��ǥ[7][8], 120, 60); _7����8���ѻ�����ư.setVisible(false); _7����8���ѻ�����ư.setBorderPainted(false); _7����8���ѻ�����ư.setContentAreaFilled(false); _7����8���ѻ�����ư.setFocusPainted(false); _7����8���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(7,8); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_7����8���ѻ�����ư);
	 _8����0���ѻ�����ư.setBounds(X��ǥ[8], Y��ǥ[8][0], 120, 60); _8����0���ѻ�����ư.setVisible(false); _8����0���ѻ�����ư.setBorderPainted(false); _8����0���ѻ�����ư.setContentAreaFilled(false); _8����0���ѻ�����ư.setFocusPainted(false); _8����0���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(8,0); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_8����0���ѻ�����ư); 
	 _8����1���ѻ�����ư.setBounds(X��ǥ[8], Y��ǥ[8][1], 120, 60); _8����1���ѻ�����ư.setVisible(false); _8����1���ѻ�����ư.setBorderPainted(false); _8����1���ѻ�����ư.setContentAreaFilled(false); _8����1���ѻ�����ư.setFocusPainted(false); _8����1���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(8,1); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_8����1���ѻ�����ư); 
	 _8����2���ѻ�����ư.setBounds(X��ǥ[8], Y��ǥ[8][2], 120, 60); _8����2���ѻ�����ư.setVisible(false); _8����2���ѻ�����ư.setBorderPainted(false); _8����2���ѻ�����ư.setContentAreaFilled(false); _8����2���ѻ�����ư.setFocusPainted(false); _8����2���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(8,2); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_8����2���ѻ�����ư); 
	 _8����3���ѻ�����ư.setBounds(X��ǥ[8], Y��ǥ[8][3], 120, 60); _8����3���ѻ�����ư.setVisible(false); _8����3���ѻ�����ư.setBorderPainted(false); _8����3���ѻ�����ư.setContentAreaFilled(false); _8����3���ѻ�����ư.setFocusPainted(false); _8����3���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(8,3); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_8����3���ѻ�����ư); 
	 _8����4���ѻ�����ư.setBounds(X��ǥ[8], Y��ǥ[8][4], 120, 60); _8����4���ѻ�����ư.setVisible(false); _8����4���ѻ�����ư.setBorderPainted(false); _8����4���ѻ�����ư.setContentAreaFilled(false); _8����4���ѻ�����ư.setFocusPainted(false); _8����4���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(8,4); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_8����4���ѻ�����ư); 
	 _8����5���ѻ�����ư.setBounds(X��ǥ[8], Y��ǥ[8][5], 120, 60); _8����5���ѻ�����ư.setVisible(false); _8����5���ѻ�����ư.setBorderPainted(false); _8����5���ѻ�����ư.setContentAreaFilled(false); _8����5���ѻ�����ư.setFocusPainted(false); _8����5���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(8,5); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_8����5���ѻ�����ư); 
	 _8����6���ѻ�����ư.setBounds(X��ǥ[8], Y��ǥ[8][6], 120, 60); _8����6���ѻ�����ư.setVisible(false); _8����6���ѻ�����ư.setBorderPainted(false); _8����6���ѻ�����ư.setContentAreaFilled(false); _8����6���ѻ�����ư.setFocusPainted(false); _8����6���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(8,6); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_8����6���ѻ�����ư); 
	 _8����7���ѻ�����ư.setBounds(X��ǥ[8], Y��ǥ[8][7], 120, 60); _8����7���ѻ�����ư.setVisible(false); _8����7���ѻ�����ư.setBorderPainted(false); _8����7���ѻ�����ư.setContentAreaFilled(false); _8����7���ѻ�����ư.setFocusPainted(false); _8����7���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(8,7); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_8����7���ѻ�����ư); 
	 _8����8���ѻ�����ư.setBounds(X��ǥ[8], Y��ǥ[8][8], 120, 60); _8����8���ѻ�����ư.setVisible(false); _8����8���ѻ�����ư.setBorderPainted(false); _8����8���ѻ�����ư.setContentAreaFilled(false); _8����8���ѻ�����ư.setFocusPainted(false); _8����8���ѻ�����ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(8,8); ���̵���β�(); ��������=0;}});
	 getContentPane().add(_8����8���ѻ�����ư);	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	 	�Ķ�����.setBounds(868,0,400,100); �Ķ�����.setVisible(false); �Ķ�����.setBorderPainted(false); �Ķ�����.setContentAreaFilled(false); �Ķ�����.setFocusPainted(false);
	 	�Ķ�0.setBounds(1180,90,50,100); �Ķ�0.setVisible(false); �Ķ�0.setBorderPainted(false); �Ķ�0.setContentAreaFilled(false); �Ķ�0.setFocusPainted(false);
		�Ķ�1.setBounds(1180,90,50,100); �Ķ�1.setVisible(false); �Ķ�1.setBorderPainted(false); �Ķ�1.setContentAreaFilled(false); �Ķ�1.setFocusPainted(false);
		�Ķ�2.setBounds(1180,90,50,100); �Ķ�2.setVisible(false); �Ķ�2.setBorderPainted(false); �Ķ�2.setContentAreaFilled(false); �Ķ�2.setFocusPainted(false);
		�Ķ�3.setBounds(1180,90,50,100); �Ķ�3.setVisible(false); �Ķ�3.setBorderPainted(false); �Ķ�3.setContentAreaFilled(false); �Ķ�3.setFocusPainted(false);
		�Ķ�4.setBounds(1180,90,50,100); �Ķ�4.setVisible(false); �Ķ�4.setBorderPainted(false); �Ķ�4.setContentAreaFilled(false); �Ķ�4.setFocusPainted(false);
		�Ķ�5.setBounds(1180,90,50,100); �Ķ�5.setVisible(false); �Ķ�5.setBorderPainted(false); �Ķ�5.setContentAreaFilled(false); �Ķ�5.setFocusPainted(false);
		�Ķ�6.setBounds(1180,90,50,100); �Ķ�6.setVisible(false); �Ķ�6.setBorderPainted(false); �Ķ�6.setContentAreaFilled(false); �Ķ�6.setFocusPainted(false);
		�Ķ�7.setBounds(1180,90,50,100); �Ķ�7.setVisible(false); �Ķ�7.setBorderPainted(false); �Ķ�7.setContentAreaFilled(false); �Ķ�7.setFocusPainted(false);
		�Ķ�8.setBounds(1180,90,50,100); �Ķ�8.setVisible(false); �Ķ�8.setBorderPainted(false); �Ķ�8.setContentAreaFilled(false); �Ķ�8.setFocusPainted(false);
		�Ķ�9.setBounds(1180,90,50,100); �Ķ�9.setVisible(false); �Ķ�9.setBorderPainted(false); �Ķ�9.setContentAreaFilled(false); �Ķ�9.setFocusPainted(false);
		 getContentPane().add(�Ķ�0); getContentPane().add(�Ķ�1); getContentPane().add(�Ķ�2); getContentPane().add(�Ķ�3); getContentPane().add(�Ķ�4);
		 getContentPane().add(�Ķ�5); getContentPane().add(�Ķ�6); getContentPane().add(�Ķ�7); getContentPane().add(�Ķ�8); getContentPane().add(�Ķ�9);
			�Ķ�00.setBounds(1130,90,50,100); �Ķ�00.setVisible(false); �Ķ�00.setBorderPainted(false); �Ķ�00.setContentAreaFilled(false); �Ķ�00.setFocusPainted(false);
			�Ķ�10.setBounds(1130,90,50,100); �Ķ�10.setVisible(false); �Ķ�10.setBorderPainted(false); �Ķ�10.setContentAreaFilled(false); �Ķ�10.setFocusPainted(false);
			�Ķ�20.setBounds(1130,90,50,100); �Ķ�20.setVisible(false); �Ķ�20.setBorderPainted(false); �Ķ�20.setContentAreaFilled(false); �Ķ�20.setFocusPainted(false);
			�Ķ�30.setBounds(1130,90,50,100); �Ķ�30.setVisible(false); �Ķ�30.setBorderPainted(false); �Ķ�30.setContentAreaFilled(false); �Ķ�30.setFocusPainted(false);
			�Ķ�40.setBounds(1130,90,50,100); �Ķ�40.setVisible(false); �Ķ�40.setBorderPainted(false); �Ķ�40.setContentAreaFilled(false); �Ķ�40.setFocusPainted(false);
			�Ķ�50.setBounds(1130,90,50,100); �Ķ�50.setVisible(false); �Ķ�50.setBorderPainted(false); �Ķ�50.setContentAreaFilled(false); �Ķ�50.setFocusPainted(false);
			�Ķ�60.setBounds(1130,90,50,100); �Ķ�60.setVisible(false); �Ķ�60.setBorderPainted(false); �Ķ�60.setContentAreaFilled(false); �Ķ�60.setFocusPainted(false);
			�Ķ�70.setBounds(1130,90,50,100); �Ķ�70.setVisible(false); �Ķ�70.setBorderPainted(false); �Ķ�70.setContentAreaFilled(false); �Ķ�70.setFocusPainted(false);
			�Ķ�90.setBounds(1130,90,50,100); �Ķ�90.setVisible(false); �Ķ�90.setBorderPainted(false); �Ķ�90.setContentAreaFilled(false); �Ķ�90.setFocusPainted(false);
			�Ķ�90.setBounds(1130,90,50,100); �Ķ�90.setVisible(false); �Ķ�90.setBorderPainted(false); �Ķ�90.setContentAreaFilled(false); �Ķ�90.setFocusPainted(false);
			 getContentPane().add(�Ķ�00); getContentPane().add(�Ķ�10); getContentPane().add(�Ķ�20); getContentPane().add(�Ķ�30); getContentPane().add(�Ķ�40);
			 getContentPane().add(�Ķ�50); getContentPane().add(�Ķ�60); getContentPane().add(�Ķ�70); getContentPane().add(�Ķ�80); getContentPane().add(�Ķ�90);
	 _0����0�Ķ���ư.setBounds(X��ǥ[0], Y��ǥ[0][0], 120, 60); _0����0�Ķ���ư.setVisible(false); _0����0�Ķ���ư.setBorderPainted(false); _0����0�Ķ���ư.setContentAreaFilled(false); _0����0�Ķ���ư.setFocusPainted(false); _0����0�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _0����0�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(0,0);}}});
	 getContentPane().add(_0����0�Ķ���ư);
	 _0����1�Ķ���ư.setBounds(X��ǥ[0], Y��ǥ[0][1], 120, 60); _0����1�Ķ���ư.setVisible(false); _0����1�Ķ���ư.setBorderPainted(false); _0����1�Ķ���ư.setContentAreaFilled(false); _0����1�Ķ���ư.setFocusPainted(false); _0����1�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _0����1�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(0,1);}}});
	 getContentPane().add(_0����1�Ķ���ư);
	 _0����2�Ķ���ư.setBounds(X��ǥ[0], Y��ǥ[0][2], 120, 60); _0����2�Ķ���ư.setVisible(false); _0����2�Ķ���ư.setBorderPainted(false); _0����2�Ķ���ư.setContentAreaFilled(false); _0����2�Ķ���ư.setFocusPainted(false); _0����2�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _0����2�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(0,2);}}});
	 getContentPane().add(_0����2�Ķ���ư);
	 _0����3�Ķ���ư.setBounds(X��ǥ[0], Y��ǥ[0][3], 120, 60); _0����3�Ķ���ư.setVisible(false); _0����3�Ķ���ư.setBorderPainted(false); _0����3�Ķ���ư.setContentAreaFilled(false); _0����3�Ķ���ư.setFocusPainted(false); _0����3�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _0����3�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(0,3);}}});
	 getContentPane().add(_0����3�Ķ���ư);
	 _0����4�Ķ���ư.setBounds(X��ǥ[0], Y��ǥ[0][4], 120, 60); _0����4�Ķ���ư.setVisible(false); _0����4�Ķ���ư.setBorderPainted(false); _0����4�Ķ���ư.setContentAreaFilled(false); _0����4�Ķ���ư.setFocusPainted(false); _0����4�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _0����4�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(0,4);}}});
	 getContentPane().add(_0����4�Ķ���ư);
	 _0����5�Ķ���ư.setBounds(X��ǥ[0], Y��ǥ[0][5], 120, 60); _0����5�Ķ���ư.setVisible(false); _0����5�Ķ���ư.setBorderPainted(false); _0����5�Ķ���ư.setContentAreaFilled(false); _0����5�Ķ���ư.setFocusPainted(false); _0����5�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _0����5�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(0,5);}}});
	 getContentPane().add(_0����5�Ķ���ư);
	 _0����6�Ķ���ư.setBounds(X��ǥ[0], Y��ǥ[0][6], 120, 60); _0����6�Ķ���ư.setVisible(false); _0����6�Ķ���ư.setBorderPainted(false); _0����6�Ķ���ư.setContentAreaFilled(false); _0����6�Ķ���ư.setFocusPainted(false); _0����6�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _0����6�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(0,6);}}});
	 getContentPane().add(_0����6�Ķ���ư);
	 _0����7�Ķ���ư.setBounds(X��ǥ[0], Y��ǥ[0][7], 120, 60); _0����7�Ķ���ư.setVisible(false); _0����7�Ķ���ư.setBorderPainted(false); _0����7�Ķ���ư.setContentAreaFilled(false); _0����7�Ķ���ư.setFocusPainted(false); _0����7�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _0����7�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(0,7);}}});
	 getContentPane().add(_0����7�Ķ���ư);
	 _0����8�Ķ���ư.setBounds(X��ǥ[0], Y��ǥ[0][8], 120, 60); _0����8�Ķ���ư.setVisible(false); _0����8�Ķ���ư.setBorderPainted(false); _0����8�Ķ���ư.setContentAreaFilled(false); _0����8�Ķ���ư.setFocusPainted(false); _0����8�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _0����8�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(0,8);}}});
	 getContentPane().add(_0����8�Ķ���ư);
	 _1����0�Ķ���ư.setBounds(X��ǥ[1], Y��ǥ[1][0], 120, 60); _1����0�Ķ���ư.setVisible(false); _1����0�Ķ���ư.setBorderPainted(false); _1����0�Ķ���ư.setContentAreaFilled(false); _1����0�Ķ���ư.setFocusPainted(false); _1����0�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _1����0�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(1,0);}}});
	 getContentPane().add(_1����0�Ķ���ư);  
	 _1����1�Ķ���ư.setBounds(X��ǥ[1], Y��ǥ[1][1], 120, 60); _1����1�Ķ���ư.setVisible(false); _1����1�Ķ���ư.setBorderPainted(false); _1����1�Ķ���ư.setContentAreaFilled(false); _1����1�Ķ���ư.setFocusPainted(false); _1����1�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _1����1�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(1,1);}}});
	 getContentPane().add(_1����1�Ķ���ư);  
	 _1����2�Ķ���ư.setBounds(X��ǥ[1], Y��ǥ[1][2], 120, 60); _1����2�Ķ���ư.setVisible(false); _1����2�Ķ���ư.setBorderPainted(false); _1����2�Ķ���ư.setContentAreaFilled(false); _1����2�Ķ���ư.setFocusPainted(false); _1����2�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _1����2�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(1,2);}}});
	 getContentPane().add(_1����2�Ķ���ư);  
	 _1����3�Ķ���ư.setBounds(X��ǥ[1], Y��ǥ[1][3], 120, 60); _1����3�Ķ���ư.setVisible(false); _1����3�Ķ���ư.setBorderPainted(false); _1����3�Ķ���ư.setContentAreaFilled(false); _1����3�Ķ���ư.setFocusPainted(false); _1����3�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _1����3�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(1,3);}}});
	 getContentPane().add(_1����3�Ķ���ư);  
	 _1����4�Ķ���ư.setBounds(X��ǥ[1], Y��ǥ[1][4], 120, 60); _1����4�Ķ���ư.setVisible(false); _1����4�Ķ���ư.setBorderPainted(false); _1����4�Ķ���ư.setContentAreaFilled(false); _1����4�Ķ���ư.setFocusPainted(false); _1����4�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _1����4�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(1,4);}}});
	 getContentPane().add(_1����4�Ķ���ư);  
	 _1����5�Ķ���ư.setBounds(X��ǥ[1], Y��ǥ[1][5], 120, 60); _1����5�Ķ���ư.setVisible(false); _1����5�Ķ���ư.setBorderPainted(false); _1����5�Ķ���ư.setContentAreaFilled(false); _1����5�Ķ���ư.setFocusPainted(false); _1����5�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _1����5�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(1,5);}}});
	 getContentPane().add(_1����5�Ķ���ư);  
	 _1����6�Ķ���ư.setBounds(X��ǥ[1], Y��ǥ[1][6], 120, 60); _1����6�Ķ���ư.setVisible(false); _1����6�Ķ���ư.setBorderPainted(false); _1����6�Ķ���ư.setContentAreaFilled(false); _1����6�Ķ���ư.setFocusPainted(false); _1����6�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _1����6�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(1,6);}}});
	 getContentPane().add(_1����6�Ķ���ư);  
	 _1����7�Ķ���ư.setBounds(X��ǥ[1], Y��ǥ[1][7], 120, 60); _1����7�Ķ���ư.setVisible(false); _1����7�Ķ���ư.setBorderPainted(false); _1����7�Ķ���ư.setContentAreaFilled(false); _1����7�Ķ���ư.setFocusPainted(false); _1����7�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _1����7�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(1,7);}}});
	 getContentPane().add(_1����7�Ķ���ư);  
	 _1����8�Ķ���ư.setBounds(X��ǥ[1], Y��ǥ[1][8], 120, 60); _1����8�Ķ���ư.setVisible(false); _1����8�Ķ���ư.setBorderPainted(false); _1����8�Ķ���ư.setContentAreaFilled(false); _1����8�Ķ���ư.setFocusPainted(false); _1����8�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _1����8�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(1,8);}}});
	 getContentPane().add(_1����8�Ķ���ư);
	 _2����0�Ķ���ư.setBounds(X��ǥ[2], Y��ǥ[2][0], 120, 60); _2����0�Ķ���ư.setVisible(false); _2����0�Ķ���ư.setBorderPainted(false); _2����0�Ķ���ư.setContentAreaFilled(false); _2����0�Ķ���ư.setFocusPainted(false); _2����0�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _2����0�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(2,0);}}});
	 getContentPane().add(_2����0�Ķ���ư);  
	 _2����1�Ķ���ư.setBounds(X��ǥ[2], Y��ǥ[2][1], 120, 60); _2����1�Ķ���ư.setVisible(false); _2����1�Ķ���ư.setBorderPainted(false); _2����1�Ķ���ư.setContentAreaFilled(false); _2����1�Ķ���ư.setFocusPainted(false); _2����1�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _2����1�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(2,1);}}});
	 getContentPane().add(_2����1�Ķ���ư);  
	 _2����2�Ķ���ư.setBounds(X��ǥ[2], Y��ǥ[2][2], 120, 60); _2����2�Ķ���ư.setVisible(false); _2����2�Ķ���ư.setBorderPainted(false); _2����2�Ķ���ư.setContentAreaFilled(false); _2����2�Ķ���ư.setFocusPainted(false); _2����2�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _2����2�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(2,2);}}});
	 getContentPane().add(_2����2�Ķ���ư);  
	 _2����3�Ķ���ư.setBounds(X��ǥ[2], Y��ǥ[2][3], 120, 60); _2����3�Ķ���ư.setVisible(false); _2����3�Ķ���ư.setBorderPainted(false); _2����3�Ķ���ư.setContentAreaFilled(false); _2����3�Ķ���ư.setFocusPainted(false); _2����3�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _2����3�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(2,3);}}});
	 getContentPane().add(_2����3�Ķ���ư);  
	 _2����4�Ķ���ư.setBounds(X��ǥ[2], Y��ǥ[2][4], 120, 60); _2����4�Ķ���ư.setVisible(false); _2����4�Ķ���ư.setBorderPainted(false); _2����4�Ķ���ư.setContentAreaFilled(false); _2����4�Ķ���ư.setFocusPainted(false); _2����4�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _2����4�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(2,4);}}});
	 getContentPane().add(_2����4�Ķ���ư);  
	 _2����5�Ķ���ư.setBounds(X��ǥ[2], Y��ǥ[2][5], 120, 60); _2����5�Ķ���ư.setVisible(false); _2����5�Ķ���ư.setBorderPainted(false); _2����5�Ķ���ư.setContentAreaFilled(false); _2����5�Ķ���ư.setFocusPainted(false); _2����5�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _2����5�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(2,5);}}});
	 getContentPane().add(_2����5�Ķ���ư);  
	 _2����6�Ķ���ư.setBounds(X��ǥ[2], Y��ǥ[2][6], 120, 60); _2����6�Ķ���ư.setVisible(false); _2����6�Ķ���ư.setBorderPainted(false); _2����6�Ķ���ư.setContentAreaFilled(false); _2����6�Ķ���ư.setFocusPainted(false); _2����6�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _2����6�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(2,6);}}});
	 getContentPane().add(_2����6�Ķ���ư);  
	 _2����7�Ķ���ư.setBounds(X��ǥ[2], Y��ǥ[2][7], 120, 60); _2����7�Ķ���ư.setVisible(false); _2����7�Ķ���ư.setBorderPainted(false); _2����7�Ķ���ư.setContentAreaFilled(false); _2����7�Ķ���ư.setFocusPainted(false); _2����7�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _2����7�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(2,7);}}});
	 getContentPane().add(_2����7�Ķ���ư);  
	 _2����8�Ķ���ư.setBounds(X��ǥ[2], Y��ǥ[2][8], 120, 60); _2����8�Ķ���ư.setVisible(false); _2����8�Ķ���ư.setBorderPainted(false); _2����8�Ķ���ư.setContentAreaFilled(false); _2����8�Ķ���ư.setFocusPainted(false); _2����8�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _2����8�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(2,8);}}});
	 getContentPane().add(_2����8�Ķ���ư);
	 _3����0�Ķ���ư.setBounds(X��ǥ[3], Y��ǥ[3][0], 120, 60); _3����0�Ķ���ư.setVisible(false); _3����0�Ķ���ư.setBorderPainted(false); _3����0�Ķ���ư.setContentAreaFilled(false); _3����0�Ķ���ư.setFocusPainted(false); _3����0�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _3����0�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(3,0);}}});
	 getContentPane().add(_3����0�Ķ���ư);  
	 _3����1�Ķ���ư.setBounds(X��ǥ[3], Y��ǥ[3][1], 120, 60); _3����1�Ķ���ư.setVisible(false); _3����1�Ķ���ư.setBorderPainted(false); _3����1�Ķ���ư.setContentAreaFilled(false); _3����1�Ķ���ư.setFocusPainted(false); _3����1�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _3����1�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(3,1);}}});
	 getContentPane().add(_3����1�Ķ���ư);  
	 _3����2�Ķ���ư.setBounds(X��ǥ[3], Y��ǥ[3][2], 120, 60); _3����2�Ķ���ư.setVisible(false); _3����2�Ķ���ư.setBorderPainted(false); _3����2�Ķ���ư.setContentAreaFilled(false); _3����2�Ķ���ư.setFocusPainted(false); _3����2�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _3����2�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(3,2);}}});
	 getContentPane().add(_3����2�Ķ���ư);  
	 _3����3�Ķ���ư.setBounds(X��ǥ[3], Y��ǥ[3][3], 120, 60); _3����3�Ķ���ư.setVisible(false); _3����3�Ķ���ư.setBorderPainted(false); _3����3�Ķ���ư.setContentAreaFilled(false); _3����3�Ķ���ư.setFocusPainted(false); _3����3�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _3����3�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(3,3);}}});
	 getContentPane().add(_3����3�Ķ���ư);  
	 _3����4�Ķ���ư.setBounds(X��ǥ[3], Y��ǥ[3][4], 120, 60); _3����4�Ķ���ư.setVisible(false); _3����4�Ķ���ư.setBorderPainted(false); _3����4�Ķ���ư.setContentAreaFilled(false); _3����4�Ķ���ư.setFocusPainted(false); _3����4�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _3����4�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(3,4);}}});
	 getContentPane().add(_3����4�Ķ���ư);  
	 _3����5�Ķ���ư.setBounds(X��ǥ[3], Y��ǥ[3][5], 120, 60); _3����5�Ķ���ư.setVisible(false); _3����5�Ķ���ư.setBorderPainted(false); _3����5�Ķ���ư.setContentAreaFilled(false); _3����5�Ķ���ư.setFocusPainted(false); _3����5�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _3����5�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(3,5);}}});
	 getContentPane().add(_3����5�Ķ���ư);  
	 _3����6�Ķ���ư.setBounds(X��ǥ[3], Y��ǥ[3][6], 120, 60); _3����6�Ķ���ư.setVisible(false); _3����6�Ķ���ư.setBorderPainted(false); _3����6�Ķ���ư.setContentAreaFilled(false); _3����6�Ķ���ư.setFocusPainted(false); _3����6�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _3����6�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(3,6);}}});
	 getContentPane().add(_3����6�Ķ���ư);  
	 _3����7�Ķ���ư.setBounds(X��ǥ[3], Y��ǥ[3][7], 120, 60); _3����7�Ķ���ư.setVisible(false); _3����7�Ķ���ư.setBorderPainted(false); _3����7�Ķ���ư.setContentAreaFilled(false); _3����7�Ķ���ư.setFocusPainted(false); _3����7�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _3����7�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(3,7);}}});
	 getContentPane().add(_3����7�Ķ���ư);  
	 _3����8�Ķ���ư.setBounds(X��ǥ[3], Y��ǥ[3][8], 120, 60); _3����8�Ķ���ư.setVisible(false); _3����8�Ķ���ư.setBorderPainted(false); _3����8�Ķ���ư.setContentAreaFilled(false); _3����8�Ķ���ư.setFocusPainted(false); _3����8�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _3����8�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(3,8);}}});
	 getContentPane().add(_3����8�Ķ���ư);
	 _4����0�Ķ���ư.setBounds(X��ǥ[4], Y��ǥ[4][0], 120, 64); _4����0�Ķ���ư.setVisible(false); _4����0�Ķ���ư.setBorderPainted(false); _4����0�Ķ���ư.setContentAreaFilled(false); _4����0�Ķ���ư.setFocusPainted(false); _4����0�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _4����0�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(4,0);}}});
	 getContentPane().add(_4����0�Ķ���ư);  
	 _4����1�Ķ���ư.setBounds(X��ǥ[4], Y��ǥ[4][1], 120, 64); _4����1�Ķ���ư.setVisible(false); _4����1�Ķ���ư.setBorderPainted(false); _4����1�Ķ���ư.setContentAreaFilled(false); _4����1�Ķ���ư.setFocusPainted(false); _4����1�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _4����1�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(4,1);}}});
	 getContentPane().add(_4����1�Ķ���ư);  
	 _4����2�Ķ���ư.setBounds(X��ǥ[4], Y��ǥ[4][2], 120, 64); _4����2�Ķ���ư.setVisible(false); _4����2�Ķ���ư.setBorderPainted(false); _4����2�Ķ���ư.setContentAreaFilled(false); _4����2�Ķ���ư.setFocusPainted(false); _4����2�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _4����2�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(4,2);}}});
	 getContentPane().add(_4����2�Ķ���ư);  
	 _4����3�Ķ���ư.setBounds(X��ǥ[4], Y��ǥ[4][3], 120, 64); _4����3�Ķ���ư.setVisible(false); _4����3�Ķ���ư.setBorderPainted(false); _4����3�Ķ���ư.setContentAreaFilled(false); _4����3�Ķ���ư.setFocusPainted(false); _4����3�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _4����3�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(4,3);}}});
	 getContentPane().add(_4����3�Ķ���ư);  
	 _4����4�Ķ���ư.setBounds(X��ǥ[4], Y��ǥ[4][4], 120, 64); _4����4�Ķ���ư.setVisible(false); _4����4�Ķ���ư.setBorderPainted(false); _4����4�Ķ���ư.setContentAreaFilled(false); _4����4�Ķ���ư.setFocusPainted(false); _4����4�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _4����4�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(4,4);}}});
	 getContentPane().add(_4����4�Ķ���ư);  
	 _4����5�Ķ���ư.setBounds(X��ǥ[4], Y��ǥ[4][5], 120, 64); _4����5�Ķ���ư.setVisible(false); _4����5�Ķ���ư.setBorderPainted(false); _4����5�Ķ���ư.setContentAreaFilled(false); _4����5�Ķ���ư.setFocusPainted(false); _4����5�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _4����5�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(4,5);}}});
	 getContentPane().add(_4����5�Ķ���ư);  
	 _4����6�Ķ���ư.setBounds(X��ǥ[4], Y��ǥ[4][6], 120, 64); _4����6�Ķ���ư.setVisible(false); _4����6�Ķ���ư.setBorderPainted(false); _4����6�Ķ���ư.setContentAreaFilled(false); _4����6�Ķ���ư.setFocusPainted(false); _4����6�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _4����6�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(4,6);}}});
	 getContentPane().add(_4����6�Ķ���ư);  
	 _4����7�Ķ���ư.setBounds(X��ǥ[4], Y��ǥ[4][7], 120, 64); _4����7�Ķ���ư.setVisible(false); _4����7�Ķ���ư.setBorderPainted(false); _4����7�Ķ���ư.setContentAreaFilled(false); _4����7�Ķ���ư.setFocusPainted(false); _4����7�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _4����7�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(4,7);}}});
	 getContentPane().add(_4����7�Ķ���ư);  
	 _4����8�Ķ���ư.setBounds(X��ǥ[4], Y��ǥ[4][8], 120, 64); _4����8�Ķ���ư.setVisible(false); _4����8�Ķ���ư.setBorderPainted(false); _4����8�Ķ���ư.setContentAreaFilled(false); _4����8�Ķ���ư.setFocusPainted(false); _4����8�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _4����8�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(4,8);}}});
	 getContentPane().add(_4����8�Ķ���ư);
	 _5����0�Ķ���ư.setBounds(X��ǥ[5], Y��ǥ[5][0], 120, 60); _5����0�Ķ���ư.setVisible(false); _5����0�Ķ���ư.setBorderPainted(false); _5����0�Ķ���ư.setContentAreaFilled(false); _5����0�Ķ���ư.setFocusPainted(false); _5����0�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _5����0�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(5,0);}}});
	 getContentPane().add(_5����0�Ķ���ư);  
	 _5����1�Ķ���ư.setBounds(X��ǥ[5], Y��ǥ[5][1], 120, 60); _5����1�Ķ���ư.setVisible(false); _5����1�Ķ���ư.setBorderPainted(false); _5����1�Ķ���ư.setContentAreaFilled(false); _5����1�Ķ���ư.setFocusPainted(false); _5����1�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _5����1�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(5,1);}}});
	 getContentPane().add(_5����1�Ķ���ư);  
	 _5����2�Ķ���ư.setBounds(X��ǥ[5], Y��ǥ[5][2], 120, 60); _5����2�Ķ���ư.setVisible(false); _5����2�Ķ���ư.setBorderPainted(false); _5����2�Ķ���ư.setContentAreaFilled(false); _5����2�Ķ���ư.setFocusPainted(false); _5����2�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _5����2�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(5,2);}}});
	 getContentPane().add(_5����2�Ķ���ư);  
	 _5����3�Ķ���ư.setBounds(X��ǥ[5], Y��ǥ[5][3], 120, 60); _5����3�Ķ���ư.setVisible(false); _5����3�Ķ���ư.setBorderPainted(false); _5����3�Ķ���ư.setContentAreaFilled(false); _5����3�Ķ���ư.setFocusPainted(false); _5����3�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _5����3�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(5,3);}}});
	 getContentPane().add(_5����3�Ķ���ư);  
	 _5����4�Ķ���ư.setBounds(X��ǥ[5], Y��ǥ[5][4], 120, 60); _5����4�Ķ���ư.setVisible(false); _5����4�Ķ���ư.setBorderPainted(false); _5����4�Ķ���ư.setContentAreaFilled(false); _5����4�Ķ���ư.setFocusPainted(false); _5����4�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _5����4�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(5,4);}}});
	 getContentPane().add(_5����4�Ķ���ư);  
	 _5����5�Ķ���ư.setBounds(X��ǥ[5], Y��ǥ[5][5], 120, 60); _5����5�Ķ���ư.setVisible(false); _5����5�Ķ���ư.setBorderPainted(false); _5����5�Ķ���ư.setContentAreaFilled(false); _5����5�Ķ���ư.setFocusPainted(false); _5����5�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _5����5�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(5,5);}}});
	 getContentPane().add(_5����5�Ķ���ư);  
	 _5����6�Ķ���ư.setBounds(X��ǥ[5], Y��ǥ[5][6], 120, 60); _5����6�Ķ���ư.setVisible(false); _5����6�Ķ���ư.setBorderPainted(false); _5����6�Ķ���ư.setContentAreaFilled(false); _5����6�Ķ���ư.setFocusPainted(false); _5����6�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _5����6�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(5,6);}}});
	 getContentPane().add(_5����6�Ķ���ư);  
	 _5����7�Ķ���ư.setBounds(X��ǥ[5], Y��ǥ[5][7], 120, 60); _5����7�Ķ���ư.setVisible(false); _5����7�Ķ���ư.setBorderPainted(false); _5����7�Ķ���ư.setContentAreaFilled(false); _5����7�Ķ���ư.setFocusPainted(false); _5����7�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _5����7�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(5,7);}}});
	 getContentPane().add(_5����7�Ķ���ư);  
	 _5����8�Ķ���ư.setBounds(X��ǥ[5], Y��ǥ[5][8], 120, 60); _5����8�Ķ���ư.setVisible(false); _5����8�Ķ���ư.setBorderPainted(false); _5����8�Ķ���ư.setContentAreaFilled(false); _5����8�Ķ���ư.setFocusPainted(false); _5����8�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _5����8�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(5,8);}}});
	 getContentPane().add(_5����8�Ķ���ư);
	 _6����0�Ķ���ư.setBounds(X��ǥ[6], Y��ǥ[6][0], 120, 60); _6����0�Ķ���ư.setVisible(false); _6����0�Ķ���ư.setBorderPainted(false); _6����0�Ķ���ư.setContentAreaFilled(false); _6����0�Ķ���ư.setFocusPainted(false); _6����0�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _6����0�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(6,0);}}});
	 getContentPane().add(_6����0�Ķ���ư);  
	 _6����1�Ķ���ư.setBounds(X��ǥ[6], Y��ǥ[6][1], 120, 60); _6����1�Ķ���ư.setVisible(false); _6����1�Ķ���ư.setBorderPainted(false); _6����1�Ķ���ư.setContentAreaFilled(false); _6����1�Ķ���ư.setFocusPainted(false); _6����1�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _6����1�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(6,1);}}});
	 getContentPane().add(_6����1�Ķ���ư);  
	 _6����2�Ķ���ư.setBounds(X��ǥ[6], Y��ǥ[6][2], 120, 60); _6����2�Ķ���ư.setVisible(false); _6����2�Ķ���ư.setBorderPainted(false); _6����2�Ķ���ư.setContentAreaFilled(false); _6����2�Ķ���ư.setFocusPainted(false); _6����2�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _6����2�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(6,2);}}});
	 getContentPane().add(_6����2�Ķ���ư);
	 _6����3�Ķ���ư.setBounds(X��ǥ[6], Y��ǥ[6][3], 120, 60); _6����3�Ķ���ư.setVisible(false); _6����3�Ķ���ư.setBorderPainted(false); _6����3�Ķ���ư.setContentAreaFilled(false); _6����3�Ķ���ư.setFocusPainted(false); _6����3�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _6����3�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(6,3);}}});
	 getContentPane().add(_6����3�Ķ���ư);  
	 _6����4�Ķ���ư.setBounds(X��ǥ[6], Y��ǥ[6][4], 120, 60); _6����4�Ķ���ư.setVisible(false); _6����4�Ķ���ư.setBorderPainted(false); _6����4�Ķ���ư.setContentAreaFilled(false); _6����4�Ķ���ư.setFocusPainted(false); _6����4�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _6����4�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(6,4);}}});
	 getContentPane().add(_6����4�Ķ���ư);  
	 _6����5�Ķ���ư.setBounds(X��ǥ[6], Y��ǥ[6][5], 120, 60); _6����5�Ķ���ư.setVisible(false); _6����5�Ķ���ư.setBorderPainted(false); _6����5�Ķ���ư.setContentAreaFilled(false); _6����5�Ķ���ư.setFocusPainted(false); _6����5�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _6����5�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(6,5);}}});
	 getContentPane().add(_6����5�Ķ���ư); 
	 _6����6�Ķ���ư.setBounds(X��ǥ[6], Y��ǥ[6][6], 120, 60); _6����6�Ķ���ư.setVisible(false); _6����6�Ķ���ư.setBorderPainted(false); _6����6�Ķ���ư.setContentAreaFilled(false); _6����6�Ķ���ư.setFocusPainted(false); _6����6�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _6����6�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(6,6);}}});
	 getContentPane().add(_6����6�Ķ���ư);  
	 _6����7�Ķ���ư.setBounds(X��ǥ[6], Y��ǥ[6][7], 120, 60); _6����7�Ķ���ư.setVisible(false); _6����7�Ķ���ư.setBorderPainted(false); _6����7�Ķ���ư.setContentAreaFilled(false); _6����7�Ķ���ư.setFocusPainted(false); _6����7�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _6����7�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(6,7);}}});
	 getContentPane().add(_6����7�Ķ���ư);  
	 _6����8�Ķ���ư.setBounds(X��ǥ[6], Y��ǥ[6][8], 120, 60); _6����8�Ķ���ư.setVisible(false); _6����8�Ķ���ư.setBorderPainted(false); _6����8�Ķ���ư.setContentAreaFilled(false); _6����8�Ķ���ư.setFocusPainted(false); _6����8�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _6����8�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(6,8);}}});
	 getContentPane().add(_6����8�Ķ���ư);
	 _7����0�Ķ���ư.setBounds(X��ǥ[7], Y��ǥ[7][0], 120, 60); _7����0�Ķ���ư.setVisible(false); _7����0�Ķ���ư.setBorderPainted(false); _7����0�Ķ���ư.setContentAreaFilled(false); _7����0�Ķ���ư.setFocusPainted(false); _7����0�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _7����0�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(7,0);}}});
	 getContentPane().add(_7����0�Ķ���ư);  
	 _7����1�Ķ���ư.setBounds(X��ǥ[7], Y��ǥ[7][1], 120, 60); _7����1�Ķ���ư.setVisible(false); _7����1�Ķ���ư.setBorderPainted(false); _7����1�Ķ���ư.setContentAreaFilled(false); _7����1�Ķ���ư.setFocusPainted(false); _7����1�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _7����1�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(7,1);}}});
	 getContentPane().add(_7����1�Ķ���ư);  
	 _7����2�Ķ���ư.setBounds(X��ǥ[7], Y��ǥ[7][2], 120, 60); _7����2�Ķ���ư.setVisible(false); _7����2�Ķ���ư.setBorderPainted(false); _7����2�Ķ���ư.setContentAreaFilled(false); _7����2�Ķ���ư.setFocusPainted(false); _7����2�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _7����2�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(7,2);}}});
	 getContentPane().add(_7����2�Ķ���ư);  
	 _7����3�Ķ���ư.setBounds(X��ǥ[7], Y��ǥ[7][3], 120, 60); _7����3�Ķ���ư.setVisible(false); _7����3�Ķ���ư.setBorderPainted(false); _7����3�Ķ���ư.setContentAreaFilled(false); _7����3�Ķ���ư.setFocusPainted(false); _7����3�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _7����3�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(7,3);}}});
	 getContentPane().add(_7����3�Ķ���ư);  
	 _7����4�Ķ���ư.setBounds(X��ǥ[7], Y��ǥ[7][4], 120, 60); _7����4�Ķ���ư.setVisible(false); _7����4�Ķ���ư.setBorderPainted(false); _7����4�Ķ���ư.setContentAreaFilled(false); _7����4�Ķ���ư.setFocusPainted(false); _7����4�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _7����4�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(7,4);}}});
	 getContentPane().add(_7����4�Ķ���ư);  
	 _7����5�Ķ���ư.setBounds(X��ǥ[7], Y��ǥ[7][5], 120, 60); _7����5�Ķ���ư.setVisible(false); _7����5�Ķ���ư.setBorderPainted(false); _7����5�Ķ���ư.setContentAreaFilled(false); _7����5�Ķ���ư.setFocusPainted(false); _7����5�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _7����5�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(7,5);}}});
	 getContentPane().add(_7����5�Ķ���ư);  
	 _7����6�Ķ���ư.setBounds(X��ǥ[7], Y��ǥ[7][6], 120, 60); _7����6�Ķ���ư.setVisible(false); _7����6�Ķ���ư.setBorderPainted(false); _7����6�Ķ���ư.setContentAreaFilled(false); _7����6�Ķ���ư.setFocusPainted(false); _7����6�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _7����6�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(7,6);}}});
	 getContentPane().add(_7����6�Ķ���ư);  
	 _7����7�Ķ���ư.setBounds(X��ǥ[7], Y��ǥ[7][7], 120, 60); _7����7�Ķ���ư.setVisible(false); _7����7�Ķ���ư.setBorderPainted(false); _7����7�Ķ���ư.setContentAreaFilled(false); _7����7�Ķ���ư.setFocusPainted(false); _7����7�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _7����7�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(7,7);}}});
	 getContentPane().add(_7����7�Ķ���ư); 
	 _7����8�Ķ���ư.setBounds(X��ǥ[7], Y��ǥ[7][8], 120, 60); _7����8�Ķ���ư.setVisible(false); _7����8�Ķ���ư.setBorderPainted(false); _7����8�Ķ���ư.setContentAreaFilled(false); _7����8�Ķ���ư.setFocusPainted(false); _7����8�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _7����8�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(7,8);}}});
	 getContentPane().add(_7����8�Ķ���ư);
	 _8����0�Ķ���ư.setBounds(X��ǥ[8], Y��ǥ[8][0], 120, 60); _8����0�Ķ���ư.setVisible(false); _8����0�Ķ���ư.setBorderPainted(false); _8����0�Ķ���ư.setContentAreaFilled(false); _8����0�Ķ���ư.setFocusPainted(false); _8����0�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _8����0�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(8,0);}}});
	 getContentPane().add(_8����0�Ķ���ư);  
	 _8����1�Ķ���ư.setBounds(X��ǥ[8], Y��ǥ[8][1], 120, 60); _8����1�Ķ���ư.setVisible(false); _8����1�Ķ���ư.setBorderPainted(false); _8����1�Ķ���ư.setContentAreaFilled(false); _8����1�Ķ���ư.setFocusPainted(false); _8����1�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _8����1�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(8,1);}}});
	 getContentPane().add(_8����1�Ķ���ư);  
	 _8����2�Ķ���ư.setBounds(X��ǥ[8], Y��ǥ[8][2], 120, 60); _8����2�Ķ���ư.setVisible(false); _8����2�Ķ���ư.setBorderPainted(false); _8����2�Ķ���ư.setContentAreaFilled(false); _8����2�Ķ���ư.setFocusPainted(false); _8����2�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _8����2�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(8,2);}}});
	 getContentPane().add(_8����2�Ķ���ư);  
	 _8����3�Ķ���ư.setBounds(X��ǥ[8], Y��ǥ[8][3], 120, 60); _8����3�Ķ���ư.setVisible(false); _8����3�Ķ���ư.setBorderPainted(false); _8����3�Ķ���ư.setContentAreaFilled(false); _8����3�Ķ���ư.setFocusPainted(false); _8����3�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _8����3�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(8,3);}}});
	 getContentPane().add(_8����3�Ķ���ư);  
	 _8����4�Ķ���ư.setBounds(X��ǥ[8], Y��ǥ[8][4], 120, 60); _8����4�Ķ���ư.setVisible(false); _8����4�Ķ���ư.setBorderPainted(false); _8����4�Ķ���ư.setContentAreaFilled(false); _8����4�Ķ���ư.setFocusPainted(false); _8����4�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _8����4�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(8,4);}}});
	 getContentPane().add(_8����4�Ķ���ư);  
	 _8����5�Ķ���ư.setBounds(X��ǥ[8], Y��ǥ[8][5], 120, 60); _8����5�Ķ���ư.setVisible(false); _8����5�Ķ���ư.setBorderPainted(false); _8����5�Ķ���ư.setContentAreaFilled(false); _8����5�Ķ���ư.setFocusPainted(false); _8����5�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _8����5�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(8,5);}}});
	 getContentPane().add(_8����5�Ķ���ư);  
	 _8����6�Ķ���ư.setBounds(X��ǥ[8], Y��ǥ[8][6], 120, 60); _8����6�Ķ���ư.setVisible(false); _8����6�Ķ���ư.setBorderPainted(false); _8����6�Ķ���ư.setContentAreaFilled(false); _8����6�Ķ���ư.setFocusPainted(false); _8����6�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _8����6�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(8,6);}}});
	 getContentPane().add(_8����6�Ķ���ư);  
	 _8����7�Ķ���ư.setBounds(X��ǥ[8], Y��ǥ[8][7], 120, 60); _8����7�Ķ���ư.setVisible(false); _8����7�Ķ���ư.setBorderPainted(false); _8����7�Ķ���ư.setContentAreaFilled(false); _8����7�Ķ���ư.setFocusPainted(false); _8����7�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _8����7�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(8,7);}}});
	 getContentPane().add(_8����7�Ķ���ư);  
	 _8����8�Ķ���ư.setBounds(X��ǥ[8], Y��ǥ[8][8], 120, 60); _8����8�Ķ���ư.setVisible(false); _8����8�Ķ���ư.setBorderPainted(false); _8����8�Ķ���ư.setContentAreaFilled(false); _8����8�Ķ���ư.setFocusPainted(false); _8����8�Ķ���ư.addMouseListener(new MouseAdapter() {public void mouseEntered(MouseEvent e) { _8����8�Ķ���ư.setCursor(new Cursor(Cursor.HAND_CURSOR));} public void mousePressed(MouseEvent e) {if(��������!=1){ Ŭ��(8,8);}}});
	 getContentPane().add(_8����8�Ķ���ư);	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	 _0����0�ణ�����Ķ���ư.setBounds(X��ǥ[0], Y��ǥ[0][0], 120, 60); _0����0�ణ�����Ķ���ư.setVisible(false); _0����0�ణ�����Ķ���ư.setBorderPainted(false); _0����0�ణ�����Ķ���ư.setContentAreaFilled(false); _0����0�ణ�����Ķ���ư.setFocusPainted(false); _0����0�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(0,0); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_0����0�ణ�����Ķ���ư);
	 _0����1�ణ�����Ķ���ư.setBounds(X��ǥ[0], Y��ǥ[0][1], 120, 60); _0����1�ణ�����Ķ���ư.setVisible(false); _0����1�ణ�����Ķ���ư.setBorderPainted(false); _0����1�ణ�����Ķ���ư.setContentAreaFilled(false); _0����1�ణ�����Ķ���ư.setFocusPainted(false); _0����1�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(0,1); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_0����1�ణ�����Ķ���ư);
	 _0����2�ణ�����Ķ���ư.setBounds(X��ǥ[0], Y��ǥ[0][2], 120, 60); _0����2�ణ�����Ķ���ư.setVisible(false); _0����2�ణ�����Ķ���ư.setBorderPainted(false); _0����2�ణ�����Ķ���ư.setContentAreaFilled(false); _0����2�ణ�����Ķ���ư.setFocusPainted(false); _0����2�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(0,2); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_0����2�ణ�����Ķ���ư);
	 _0����3�ణ�����Ķ���ư.setBounds(X��ǥ[0], Y��ǥ[0][3], 120, 60); _0����3�ణ�����Ķ���ư.setVisible(false); _0����3�ణ�����Ķ���ư.setBorderPainted(false); _0����3�ణ�����Ķ���ư.setContentAreaFilled(false); _0����3�ణ�����Ķ���ư.setFocusPainted(false); _0����3�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(0,3); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_0����3�ణ�����Ķ���ư);
	 _0����4�ణ�����Ķ���ư.setBounds(X��ǥ[0], Y��ǥ[0][4], 120, 60); _0����4�ణ�����Ķ���ư.setVisible(false); _0����4�ణ�����Ķ���ư.setBorderPainted(false); _0����4�ణ�����Ķ���ư.setContentAreaFilled(false); _0����4�ణ�����Ķ���ư.setFocusPainted(false); _0����4�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(0,4); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_0����4�ణ�����Ķ���ư);
	 _0����5�ణ�����Ķ���ư.setBounds(X��ǥ[0], Y��ǥ[0][5], 120, 60); _0����5�ణ�����Ķ���ư.setVisible(false); _0����5�ణ�����Ķ���ư.setBorderPainted(false); _0����5�ణ�����Ķ���ư.setContentAreaFilled(false); _0����5�ణ�����Ķ���ư.setFocusPainted(false); _0����5�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(0,5); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_0����5�ణ�����Ķ���ư);
	 _0����6�ణ�����Ķ���ư.setBounds(X��ǥ[0], Y��ǥ[0][6], 120, 60); _0����6�ణ�����Ķ���ư.setVisible(false); _0����6�ణ�����Ķ���ư.setBorderPainted(false); _0����6�ణ�����Ķ���ư.setContentAreaFilled(false); _0����6�ణ�����Ķ���ư.setFocusPainted(false); _0����6�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(0,6); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_0����6�ణ�����Ķ���ư);
	 _0����7�ణ�����Ķ���ư.setBounds(X��ǥ[0], Y��ǥ[0][7], 120, 60); _0����7�ణ�����Ķ���ư.setVisible(false); _0����7�ణ�����Ķ���ư.setBorderPainted(false); _0����7�ణ�����Ķ���ư.setContentAreaFilled(false); _0����7�ణ�����Ķ���ư.setFocusPainted(false); _0����7�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(0,7); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_0����7�ణ�����Ķ���ư);
	 _0����8�ణ�����Ķ���ư.setBounds(X��ǥ[0], Y��ǥ[0][8], 120, 60); _0����8�ణ�����Ķ���ư.setVisible(false); _0����8�ణ�����Ķ���ư.setBorderPainted(false); _0����8�ణ�����Ķ���ư.setContentAreaFilled(false); _0����8�ణ�����Ķ���ư.setFocusPainted(false); _0����8�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(0,8); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_0����8�ణ�����Ķ���ư);
	 _1����0�ణ�����Ķ���ư.setBounds(X��ǥ[1], Y��ǥ[1][0], 120, 60); _1����0�ణ�����Ķ���ư.setVisible(false); _1����0�ణ�����Ķ���ư.setBorderPainted(false); _1����0�ణ�����Ķ���ư.setContentAreaFilled(false); _1����0�ణ�����Ķ���ư.setFocusPainted(false); _1����0�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(1,0); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_1����0�ణ�����Ķ���ư); 
	 _1����1�ణ�����Ķ���ư.setBounds(X��ǥ[1], Y��ǥ[1][1], 120, 60); _1����1�ణ�����Ķ���ư.setVisible(false); _1����1�ణ�����Ķ���ư.setBorderPainted(false); _1����1�ణ�����Ķ���ư.setContentAreaFilled(false); _1����1�ణ�����Ķ���ư.setFocusPainted(false); _1����1�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(1,1); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_1����1�ణ�����Ķ���ư); 
	 _1����2�ణ�����Ķ���ư.setBounds(X��ǥ[1], Y��ǥ[1][2], 120, 60); _1����2�ణ�����Ķ���ư.setVisible(false); _1����2�ణ�����Ķ���ư.setBorderPainted(false); _1����2�ణ�����Ķ���ư.setContentAreaFilled(false); _1����2�ణ�����Ķ���ư.setFocusPainted(false); _1����2�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(1,2); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_1����2�ణ�����Ķ���ư); 
	 _1����3�ణ�����Ķ���ư.setBounds(X��ǥ[1], Y��ǥ[1][3], 120, 60); _1����3�ణ�����Ķ���ư.setVisible(false); _1����3�ణ�����Ķ���ư.setBorderPainted(false); _1����3�ణ�����Ķ���ư.setContentAreaFilled(false); _1����3�ణ�����Ķ���ư.setFocusPainted(false); _1����3�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(1,3); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_1����3�ణ�����Ķ���ư); 
	 _1����4�ణ�����Ķ���ư.setBounds(X��ǥ[1], Y��ǥ[1][4], 120, 60); _1����4�ణ�����Ķ���ư.setVisible(false); _1����4�ణ�����Ķ���ư.setBorderPainted(false); _1����4�ణ�����Ķ���ư.setContentAreaFilled(false); _1����4�ణ�����Ķ���ư.setFocusPainted(false); _1����4�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(1,4); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_1����4�ణ�����Ķ���ư); 
	 _1����5�ణ�����Ķ���ư.setBounds(X��ǥ[1], Y��ǥ[1][5], 120, 60); _1����5�ణ�����Ķ���ư.setVisible(false); _1����5�ణ�����Ķ���ư.setBorderPainted(false); _1����5�ణ�����Ķ���ư.setContentAreaFilled(false); _1����5�ణ�����Ķ���ư.setFocusPainted(false); _1����5�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(1,5); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_1����5�ణ�����Ķ���ư); 
	 _1����6�ణ�����Ķ���ư.setBounds(X��ǥ[1], Y��ǥ[1][6], 120, 60); _1����6�ణ�����Ķ���ư.setVisible(false); _1����6�ణ�����Ķ���ư.setBorderPainted(false); _1����6�ణ�����Ķ���ư.setContentAreaFilled(false); _1����6�ణ�����Ķ���ư.setFocusPainted(false); _1����6�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(1,6); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_1����6�ణ�����Ķ���ư); 
	 _1����7�ణ�����Ķ���ư.setBounds(X��ǥ[1], Y��ǥ[1][7], 120, 60); _1����7�ణ�����Ķ���ư.setVisible(false); _1����7�ణ�����Ķ���ư.setBorderPainted(false); _1����7�ణ�����Ķ���ư.setContentAreaFilled(false); _1����7�ణ�����Ķ���ư.setFocusPainted(false); _1����7�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(1,7); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_1����7�ణ�����Ķ���ư); 
	 _1����8�ణ�����Ķ���ư.setBounds(X��ǥ[1], Y��ǥ[1][8], 120, 60); _1����8�ణ�����Ķ���ư.setVisible(false); _1����8�ణ�����Ķ���ư.setBorderPainted(false); _1����8�ణ�����Ķ���ư.setContentAreaFilled(false); _1����8�ణ�����Ķ���ư.setFocusPainted(false); _1����8�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(1,8); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_1����8�ణ�����Ķ���ư);
	 _2����0�ణ�����Ķ���ư.setBounds(X��ǥ[2], Y��ǥ[2][0], 120, 60); _2����0�ణ�����Ķ���ư.setVisible(false); _2����0�ణ�����Ķ���ư.setBorderPainted(false); _2����0�ణ�����Ķ���ư.setContentAreaFilled(false); _2����0�ణ�����Ķ���ư.setFocusPainted(false); _2����0�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(2,0); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_2����0�ణ�����Ķ���ư); 
	 _2����1�ణ�����Ķ���ư.setBounds(X��ǥ[2], Y��ǥ[2][1], 120, 60); _2����1�ణ�����Ķ���ư.setVisible(false); _2����1�ణ�����Ķ���ư.setBorderPainted(false); _2����1�ణ�����Ķ���ư.setContentAreaFilled(false); _2����1�ణ�����Ķ���ư.setFocusPainted(false); _2����1�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(2,1); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_2����1�ణ�����Ķ���ư); 
	 _2����2�ణ�����Ķ���ư.setBounds(X��ǥ[2], Y��ǥ[2][2], 120, 60); _2����2�ణ�����Ķ���ư.setVisible(false); _2����2�ణ�����Ķ���ư.setBorderPainted(false); _2����2�ణ�����Ķ���ư.setContentAreaFilled(false); _2����2�ణ�����Ķ���ư.setFocusPainted(false); _2����2�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(2,2); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_2����2�ణ�����Ķ���ư); 
	 _2����3�ణ�����Ķ���ư.setBounds(X��ǥ[2], Y��ǥ[2][3], 120, 60); _2����3�ణ�����Ķ���ư.setVisible(false); _2����3�ణ�����Ķ���ư.setBorderPainted(false); _2����3�ణ�����Ķ���ư.setContentAreaFilled(false); _2����3�ణ�����Ķ���ư.setFocusPainted(false); _2����3�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(2,3); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_2����3�ణ�����Ķ���ư); 
	 _2����4�ణ�����Ķ���ư.setBounds(X��ǥ[2], Y��ǥ[2][4], 120, 60); _2����4�ణ�����Ķ���ư.setVisible(false); _2����4�ణ�����Ķ���ư.setBorderPainted(false); _2����4�ణ�����Ķ���ư.setContentAreaFilled(false); _2����4�ణ�����Ķ���ư.setFocusPainted(false); _2����4�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(2,4); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_2����4�ణ�����Ķ���ư); 
	 _2����5�ణ�����Ķ���ư.setBounds(X��ǥ[2], Y��ǥ[2][5], 120, 60); _2����5�ణ�����Ķ���ư.setVisible(false); _2����5�ణ�����Ķ���ư.setBorderPainted(false); _2����5�ణ�����Ķ���ư.setContentAreaFilled(false); _2����5�ణ�����Ķ���ư.setFocusPainted(false); _2����5�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(2,5); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_2����5�ణ�����Ķ���ư); 
	 _2����6�ణ�����Ķ���ư.setBounds(X��ǥ[2], Y��ǥ[2][6], 120, 60); _2����6�ణ�����Ķ���ư.setVisible(false); _2����6�ణ�����Ķ���ư.setBorderPainted(false); _2����6�ణ�����Ķ���ư.setContentAreaFilled(false); _2����6�ణ�����Ķ���ư.setFocusPainted(false); _2����6�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(2,6); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_2����6�ణ�����Ķ���ư); 
	 _2����7�ణ�����Ķ���ư.setBounds(X��ǥ[2], Y��ǥ[2][7], 120, 60); _2����7�ణ�����Ķ���ư.setVisible(false); _2����7�ణ�����Ķ���ư.setBorderPainted(false); _2����7�ణ�����Ķ���ư.setContentAreaFilled(false); _2����7�ణ�����Ķ���ư.setFocusPainted(false); _2����7�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(2,7); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_2����7�ణ�����Ķ���ư); 
	 _2����8�ణ�����Ķ���ư.setBounds(X��ǥ[2], Y��ǥ[2][8], 120, 60); _2����8�ణ�����Ķ���ư.setVisible(false); _2����8�ణ�����Ķ���ư.setBorderPainted(false); _2����8�ణ�����Ķ���ư.setContentAreaFilled(false); _2����8�ణ�����Ķ���ư.setFocusPainted(false); _2����8�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(2,8); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_2����8�ణ�����Ķ���ư);
	 _3����0�ణ�����Ķ���ư.setBounds(X��ǥ[3], Y��ǥ[3][0], 120, 60); _3����0�ణ�����Ķ���ư.setVisible(false); _3����0�ణ�����Ķ���ư.setBorderPainted(false); _3����0�ణ�����Ķ���ư.setContentAreaFilled(false); _3����0�ణ�����Ķ���ư.setFocusPainted(false); _3����0�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(3,0); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_3����0�ణ�����Ķ���ư); 
	 _3����1�ణ�����Ķ���ư.setBounds(X��ǥ[3], Y��ǥ[3][1], 120, 60); _3����1�ణ�����Ķ���ư.setVisible(false); _3����1�ణ�����Ķ���ư.setBorderPainted(false); _3����1�ణ�����Ķ���ư.setContentAreaFilled(false); _3����1�ణ�����Ķ���ư.setFocusPainted(false); _3����1�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(3,1); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_3����1�ణ�����Ķ���ư); 
	 _3����2�ణ�����Ķ���ư.setBounds(X��ǥ[3], Y��ǥ[3][2], 120, 60); _3����2�ణ�����Ķ���ư.setVisible(false); _3����2�ణ�����Ķ���ư.setBorderPainted(false); _3����2�ణ�����Ķ���ư.setContentAreaFilled(false); _3����2�ణ�����Ķ���ư.setFocusPainted(false); _3����2�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(3,2); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_3����2�ణ�����Ķ���ư); 
	 _3����3�ణ�����Ķ���ư.setBounds(X��ǥ[3], Y��ǥ[3][3], 120, 60); _3����3�ణ�����Ķ���ư.setVisible(false); _3����3�ణ�����Ķ���ư.setBorderPainted(false); _3����3�ణ�����Ķ���ư.setContentAreaFilled(false); _3����3�ణ�����Ķ���ư.setFocusPainted(false); _3����3�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(3,3); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_3����3�ణ�����Ķ���ư); 
	 _3����4�ణ�����Ķ���ư.setBounds(X��ǥ[3], Y��ǥ[3][4], 120, 60); _3����4�ణ�����Ķ���ư.setVisible(false); _3����4�ణ�����Ķ���ư.setBorderPainted(false); _3����4�ణ�����Ķ���ư.setContentAreaFilled(false); _3����4�ణ�����Ķ���ư.setFocusPainted(false); _3����4�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(3,4); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_3����4�ణ�����Ķ���ư); 
	 _3����5�ణ�����Ķ���ư.setBounds(X��ǥ[3], Y��ǥ[3][5], 120, 60); _3����5�ణ�����Ķ���ư.setVisible(false); _3����5�ణ�����Ķ���ư.setBorderPainted(false); _3����5�ణ�����Ķ���ư.setContentAreaFilled(false); _3����5�ణ�����Ķ���ư.setFocusPainted(false); _3����5�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(3,5); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_3����5�ణ�����Ķ���ư); 
	 _3����6�ణ�����Ķ���ư.setBounds(X��ǥ[3], Y��ǥ[3][6], 120, 60); _3����6�ణ�����Ķ���ư.setVisible(false); _3����6�ణ�����Ķ���ư.setBorderPainted(false); _3����6�ణ�����Ķ���ư.setContentAreaFilled(false); _3����6�ణ�����Ķ���ư.setFocusPainted(false); _3����6�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(3,6); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_3����6�ణ�����Ķ���ư); 
	 _3����7�ణ�����Ķ���ư.setBounds(X��ǥ[3], Y��ǥ[3][7], 120, 60); _3����7�ణ�����Ķ���ư.setVisible(false); _3����7�ణ�����Ķ���ư.setBorderPainted(false); _3����7�ణ�����Ķ���ư.setContentAreaFilled(false); _3����7�ణ�����Ķ���ư.setFocusPainted(false); _3����7�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(3,7); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_3����7�ణ�����Ķ���ư); 
	 _3����8�ణ�����Ķ���ư.setBounds(X��ǥ[3], Y��ǥ[3][8], 120, 60); _3����8�ణ�����Ķ���ư.setVisible(false); _3����8�ణ�����Ķ���ư.setBorderPainted(false); _3����8�ణ�����Ķ���ư.setContentAreaFilled(false); _3����8�ణ�����Ķ���ư.setFocusPainted(false); _3����8�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(3,8); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_3����8�ణ�����Ķ���ư);
	 _4����0�ణ�����Ķ���ư.setBounds(X��ǥ[4], Y��ǥ[4][0], 120, 64); _4����0�ణ�����Ķ���ư.setVisible(false); _4����0�ణ�����Ķ���ư.setBorderPainted(false); _4����0�ణ�����Ķ���ư.setContentAreaFilled(false); _4����0�ణ�����Ķ���ư.setFocusPainted(false); _4����0�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(4,0); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_4����0�ణ�����Ķ���ư); 
	 _4����1�ణ�����Ķ���ư.setBounds(X��ǥ[4], Y��ǥ[4][1], 120, 64); _4����1�ణ�����Ķ���ư.setVisible(false); _4����1�ణ�����Ķ���ư.setBorderPainted(false); _4����1�ణ�����Ķ���ư.setContentAreaFilled(false); _4����1�ణ�����Ķ���ư.setFocusPainted(false); _4����1�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(4,1); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_4����1�ణ�����Ķ���ư); 
	 _4����2�ణ�����Ķ���ư.setBounds(X��ǥ[4], Y��ǥ[4][2], 120, 64); _4����2�ణ�����Ķ���ư.setVisible(false); _4����2�ణ�����Ķ���ư.setBorderPainted(false); _4����2�ణ�����Ķ���ư.setContentAreaFilled(false); _4����2�ణ�����Ķ���ư.setFocusPainted(false); _4����2�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(4,2); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_4����2�ణ�����Ķ���ư); 
	 _4����3�ణ�����Ķ���ư.setBounds(X��ǥ[4], Y��ǥ[4][3], 120, 64); _4����3�ణ�����Ķ���ư.setVisible(false); _4����3�ణ�����Ķ���ư.setBorderPainted(false); _4����3�ణ�����Ķ���ư.setContentAreaFilled(false); _4����3�ణ�����Ķ���ư.setFocusPainted(false); _4����3�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(4,3); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_4����3�ణ�����Ķ���ư); 
	 _4����4�ణ�����Ķ���ư.setBounds(X��ǥ[4], Y��ǥ[4][4], 120, 64); _4����4�ణ�����Ķ���ư.setVisible(false); _4����4�ణ�����Ķ���ư.setBorderPainted(false); _4����4�ణ�����Ķ���ư.setContentAreaFilled(false); _4����4�ణ�����Ķ���ư.setFocusPainted(false); _4����4�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(4,4); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_4����4�ణ�����Ķ���ư); 
	 _4����5�ణ�����Ķ���ư.setBounds(X��ǥ[4], Y��ǥ[4][5], 120, 64); _4����5�ణ�����Ķ���ư.setVisible(false); _4����5�ణ�����Ķ���ư.setBorderPainted(false); _4����5�ణ�����Ķ���ư.setContentAreaFilled(false); _4����5�ణ�����Ķ���ư.setFocusPainted(false); _4����5�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(4,5); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_4����5�ణ�����Ķ���ư); 
	 _4����6�ణ�����Ķ���ư.setBounds(X��ǥ[4], Y��ǥ[4][6], 120, 64); _4����6�ణ�����Ķ���ư.setVisible(false); _4����6�ణ�����Ķ���ư.setBorderPainted(false); _4����6�ణ�����Ķ���ư.setContentAreaFilled(false); _4����6�ణ�����Ķ���ư.setFocusPainted(false); _4����6�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(4,6); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_4����6�ణ�����Ķ���ư); 
	 _4����7�ణ�����Ķ���ư.setBounds(X��ǥ[4], Y��ǥ[4][7], 120, 64); _4����7�ణ�����Ķ���ư.setVisible(false); _4����7�ణ�����Ķ���ư.setBorderPainted(false); _4����7�ణ�����Ķ���ư.setContentAreaFilled(false); _4����7�ణ�����Ķ���ư.setFocusPainted(false); _4����7�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(4,7); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_4����7�ణ�����Ķ���ư); 
	 _4����8�ణ�����Ķ���ư.setBounds(X��ǥ[4], Y��ǥ[4][8], 120, 64); _4����8�ణ�����Ķ���ư.setVisible(false); _4����8�ణ�����Ķ���ư.setBorderPainted(false); _4����8�ణ�����Ķ���ư.setContentAreaFilled(false); _4����8�ణ�����Ķ���ư.setFocusPainted(false); _4����8�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(4,8); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_4����8�ణ�����Ķ���ư);
	 _5����0�ణ�����Ķ���ư.setBounds(X��ǥ[5], Y��ǥ[5][0], 120, 60); _5����0�ణ�����Ķ���ư.setVisible(false); _5����0�ణ�����Ķ���ư.setBorderPainted(false); _5����0�ణ�����Ķ���ư.setContentAreaFilled(false); _5����0�ణ�����Ķ���ư.setFocusPainted(false); _5����0�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(5,0); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_5����0�ణ�����Ķ���ư); 
	 _5����1�ణ�����Ķ���ư.setBounds(X��ǥ[5], Y��ǥ[5][1], 120, 60); _5����1�ణ�����Ķ���ư.setVisible(false); _5����1�ణ�����Ķ���ư.setBorderPainted(false); _5����1�ణ�����Ķ���ư.setContentAreaFilled(false); _5����1�ణ�����Ķ���ư.setFocusPainted(false); _5����1�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(5,1); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_5����1�ణ�����Ķ���ư); 
	 _5����2�ణ�����Ķ���ư.setBounds(X��ǥ[5], Y��ǥ[5][2], 120, 60); _5����2�ణ�����Ķ���ư.setVisible(false); _5����2�ణ�����Ķ���ư.setBorderPainted(false); _5����2�ణ�����Ķ���ư.setContentAreaFilled(false); _5����2�ణ�����Ķ���ư.setFocusPainted(false); _5����2�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(5,2); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_5����2�ణ�����Ķ���ư); 
	 _5����3�ణ�����Ķ���ư.setBounds(X��ǥ[5], Y��ǥ[5][3], 120, 60); _5����3�ణ�����Ķ���ư.setVisible(false); _5����3�ణ�����Ķ���ư.setBorderPainted(false); _5����3�ణ�����Ķ���ư.setContentAreaFilled(false); _5����3�ణ�����Ķ���ư.setFocusPainted(false); _5����3�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(5,3); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_5����3�ణ�����Ķ���ư); 
	 _5����4�ణ�����Ķ���ư.setBounds(X��ǥ[5], Y��ǥ[5][4], 120, 60); _5����4�ణ�����Ķ���ư.setVisible(false); _5����4�ణ�����Ķ���ư.setBorderPainted(false); _5����4�ణ�����Ķ���ư.setContentAreaFilled(false); _5����4�ణ�����Ķ���ư.setFocusPainted(false); _5����4�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(5,4); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_5����4�ణ�����Ķ���ư); 
	 _5����5�ణ�����Ķ���ư.setBounds(X��ǥ[5], Y��ǥ[5][5], 120, 60); _5����5�ణ�����Ķ���ư.setVisible(false); _5����5�ణ�����Ķ���ư.setBorderPainted(false); _5����5�ణ�����Ķ���ư.setContentAreaFilled(false); _5����5�ణ�����Ķ���ư.setFocusPainted(false); _5����5�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(5,5); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_5����5�ణ�����Ķ���ư); 
	 _5����6�ణ�����Ķ���ư.setBounds(X��ǥ[5], Y��ǥ[5][6], 120, 60); _5����6�ణ�����Ķ���ư.setVisible(false); _5����6�ణ�����Ķ���ư.setBorderPainted(false); _5����6�ణ�����Ķ���ư.setContentAreaFilled(false); _5����6�ణ�����Ķ���ư.setFocusPainted(false); _5����6�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(5,6); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_5����6�ణ�����Ķ���ư); 
	 _5����7�ణ�����Ķ���ư.setBounds(X��ǥ[5], Y��ǥ[5][7], 120, 60); _5����7�ణ�����Ķ���ư.setVisible(false); _5����7�ణ�����Ķ���ư.setBorderPainted(false); _5����7�ణ�����Ķ���ư.setContentAreaFilled(false); _5����7�ణ�����Ķ���ư.setFocusPainted(false); _5����7�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(5,7); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_5����7�ణ�����Ķ���ư); 
	 _5����8�ణ�����Ķ���ư.setBounds(X��ǥ[5], Y��ǥ[5][8], 120, 60); _5����8�ణ�����Ķ���ư.setVisible(false); _5����8�ణ�����Ķ���ư.setBorderPainted(false); _5����8�ణ�����Ķ���ư.setContentAreaFilled(false); _5����8�ణ�����Ķ���ư.setFocusPainted(false); _5����8�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(5,8); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_5����8�ణ�����Ķ���ư);
	 _6����0�ణ�����Ķ���ư.setBounds(X��ǥ[6], Y��ǥ[6][0], 120, 60); _6����0�ణ�����Ķ���ư.setVisible(false); _6����0�ణ�����Ķ���ư.setBorderPainted(false); _6����0�ణ�����Ķ���ư.setContentAreaFilled(false); _6����0�ణ�����Ķ���ư.setFocusPainted(false); _6����0�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(6,0); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_6����0�ణ�����Ķ���ư); 
	 _6����1�ణ�����Ķ���ư.setBounds(X��ǥ[6], Y��ǥ[6][1], 120, 60); _6����1�ణ�����Ķ���ư.setVisible(false); _6����1�ణ�����Ķ���ư.setBorderPainted(false); _6����1�ణ�����Ķ���ư.setContentAreaFilled(false); _6����1�ణ�����Ķ���ư.setFocusPainted(false); _6����1�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(6,1); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_6����1�ణ�����Ķ���ư); 
	 _6����2�ణ�����Ķ���ư.setBounds(X��ǥ[6], Y��ǥ[6][2], 120, 60); _6����2�ణ�����Ķ���ư.setVisible(false); _6����2�ణ�����Ķ���ư.setBorderPainted(false); _6����2�ణ�����Ķ���ư.setContentAreaFilled(false); _6����2�ణ�����Ķ���ư.setFocusPainted(false); _6����2�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(6,2); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_6����2�ణ�����Ķ���ư);
	 _6����3�ణ�����Ķ���ư.setBounds(X��ǥ[6], Y��ǥ[6][3], 120, 60); _6����3�ణ�����Ķ���ư.setVisible(false); _6����3�ణ�����Ķ���ư.setBorderPainted(false); _6����3�ణ�����Ķ���ư.setContentAreaFilled(false); _6����3�ణ�����Ķ���ư.setFocusPainted(false); _6����3�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(6,3); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_6����3�ణ�����Ķ���ư); 
	 _6����4�ణ�����Ķ���ư.setBounds(X��ǥ[6], Y��ǥ[6][4], 120, 60); _6����4�ణ�����Ķ���ư.setVisible(false); _6����4�ణ�����Ķ���ư.setBorderPainted(false); _6����4�ణ�����Ķ���ư.setContentAreaFilled(false); _6����4�ణ�����Ķ���ư.setFocusPainted(false); _6����4�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(6,4); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_6����4�ణ�����Ķ���ư); 
	 _6����5�ణ�����Ķ���ư.setBounds(X��ǥ[6], Y��ǥ[6][5], 120, 60); _6����5�ణ�����Ķ���ư.setVisible(false); _6����5�ణ�����Ķ���ư.setBorderPainted(false); _6����5�ణ�����Ķ���ư.setContentAreaFilled(false); _6����5�ణ�����Ķ���ư.setFocusPainted(false); _6����5�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(6,5); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_6����5�ణ�����Ķ���ư); 
	 _6����6�ణ�����Ķ���ư.setBounds(X��ǥ[6], Y��ǥ[6][6], 120, 60); _6����6�ణ�����Ķ���ư.setVisible(false); _6����6�ణ�����Ķ���ư.setBorderPainted(false); _6����6�ణ�����Ķ���ư.setContentAreaFilled(false); _6����6�ణ�����Ķ���ư.setFocusPainted(false); _6����6�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(6,6); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_6����6�ణ�����Ķ���ư); 
	 _6����7�ణ�����Ķ���ư.setBounds(X��ǥ[6], Y��ǥ[6][7], 120, 60); _6����7�ణ�����Ķ���ư.setVisible(false); _6����7�ణ�����Ķ���ư.setBorderPainted(false); _6����7�ణ�����Ķ���ư.setContentAreaFilled(false); _6����7�ణ�����Ķ���ư.setFocusPainted(false); _6����7�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(6,7); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_6����7�ణ�����Ķ���ư); 
	 _6����8�ణ�����Ķ���ư.setBounds(X��ǥ[6], Y��ǥ[6][8], 120, 60); _6����8�ణ�����Ķ���ư.setVisible(false); _6����8�ణ�����Ķ���ư.setBorderPainted(false); _6����8�ణ�����Ķ���ư.setContentAreaFilled(false); _6����8�ణ�����Ķ���ư.setFocusPainted(false); _6����8�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(6,8); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_6����8�ణ�����Ķ���ư);
	 _7����0�ణ�����Ķ���ư.setBounds(X��ǥ[7], Y��ǥ[7][0], 120, 60); _7����0�ణ�����Ķ���ư.setVisible(false); _7����0�ణ�����Ķ���ư.setBorderPainted(false); _7����0�ణ�����Ķ���ư.setContentAreaFilled(false); _7����0�ణ�����Ķ���ư.setFocusPainted(false); _7����0�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(7,0); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_7����0�ణ�����Ķ���ư); 
	 _7����1�ణ�����Ķ���ư.setBounds(X��ǥ[7], Y��ǥ[7][1], 120, 60); _7����1�ణ�����Ķ���ư.setVisible(false); _7����1�ణ�����Ķ���ư.setBorderPainted(false); _7����1�ణ�����Ķ���ư.setContentAreaFilled(false); _7����1�ణ�����Ķ���ư.setFocusPainted(false); _7����1�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(7,1); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_7����1�ణ�����Ķ���ư); 
	 _7����2�ణ�����Ķ���ư.setBounds(X��ǥ[7], Y��ǥ[7][2], 120, 60); _7����2�ణ�����Ķ���ư.setVisible(false); _7����2�ణ�����Ķ���ư.setBorderPainted(false); _7����2�ణ�����Ķ���ư.setContentAreaFilled(false); _7����2�ణ�����Ķ���ư.setFocusPainted(false); _7����2�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(7,2); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_7����2�ణ�����Ķ���ư); 
	 _7����3�ణ�����Ķ���ư.setBounds(X��ǥ[7], Y��ǥ[7][3], 120, 60); _7����3�ణ�����Ķ���ư.setVisible(false); _7����3�ణ�����Ķ���ư.setBorderPainted(false); _7����3�ణ�����Ķ���ư.setContentAreaFilled(false); _7����3�ణ�����Ķ���ư.setFocusPainted(false); _7����3�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(7,3); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_7����3�ణ�����Ķ���ư); 
	 _7����4�ణ�����Ķ���ư.setBounds(X��ǥ[7], Y��ǥ[7][4], 120, 60); _7����4�ణ�����Ķ���ư.setVisible(false); _7����4�ణ�����Ķ���ư.setBorderPainted(false); _7����4�ణ�����Ķ���ư.setContentAreaFilled(false); _7����4�ణ�����Ķ���ư.setFocusPainted(false); _7����4�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(7,4); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_7����4�ణ�����Ķ���ư); 
	 _7����5�ణ�����Ķ���ư.setBounds(X��ǥ[7], Y��ǥ[7][5], 120, 60); _7����5�ణ�����Ķ���ư.setVisible(false); _7����5�ణ�����Ķ���ư.setBorderPainted(false); _7����5�ణ�����Ķ���ư.setContentAreaFilled(false); _7����5�ణ�����Ķ���ư.setFocusPainted(false); _7����5�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(7,5); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_7����5�ణ�����Ķ���ư); 
	 _7����6�ణ�����Ķ���ư.setBounds(X��ǥ[7], Y��ǥ[7][6], 120, 60); _7����6�ణ�����Ķ���ư.setVisible(false); _7����6�ణ�����Ķ���ư.setBorderPainted(false); _7����6�ణ�����Ķ���ư.setContentAreaFilled(false); _7����6�ణ�����Ķ���ư.setFocusPainted(false); _7����6�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(7,6); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_7����6�ణ�����Ķ���ư); 
	 _7����7�ణ�����Ķ���ư.setBounds(X��ǥ[7], Y��ǥ[7][7], 120, 60); _7����7�ణ�����Ķ���ư.setVisible(false); _7����7�ణ�����Ķ���ư.setBorderPainted(false); _7����7�ణ�����Ķ���ư.setContentAreaFilled(false); _7����7�ణ�����Ķ���ư.setFocusPainted(false); _7����7�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(7,7); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_7����7�ణ�����Ķ���ư); 
	 _7����8�ణ�����Ķ���ư.setBounds(X��ǥ[7], Y��ǥ[7][8], 120, 60); _7����8�ణ�����Ķ���ư.setVisible(false); _7����8�ణ�����Ķ���ư.setBorderPainted(false); _7����8�ణ�����Ķ���ư.setContentAreaFilled(false); _7����8�ణ�����Ķ���ư.setFocusPainted(false); _7����8�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(7,8); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_7����8�ణ�����Ķ���ư);
	 _8����0�ణ�����Ķ���ư.setBounds(X��ǥ[8], Y��ǥ[8][0], 120, 60); _8����0�ణ�����Ķ���ư.setVisible(false); _8����0�ణ�����Ķ���ư.setBorderPainted(false); _8����0�ణ�����Ķ���ư.setContentAreaFilled(false); _8����0�ణ�����Ķ���ư.setFocusPainted(false); _8����0�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(8,0); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_8����0�ణ�����Ķ���ư); 
	 _8����1�ణ�����Ķ���ư.setBounds(X��ǥ[8], Y��ǥ[8][1], 120, 60); _8����1�ణ�����Ķ���ư.setVisible(false); _8����1�ణ�����Ķ���ư.setBorderPainted(false); _8����1�ణ�����Ķ���ư.setContentAreaFilled(false); _8����1�ణ�����Ķ���ư.setFocusPainted(false); _8����1�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(8,1); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_8����1�ణ�����Ķ���ư); 
	 _8����2�ణ�����Ķ���ư.setBounds(X��ǥ[8], Y��ǥ[8][2], 120, 60); _8����2�ణ�����Ķ���ư.setVisible(false); _8����2�ణ�����Ķ���ư.setBorderPainted(false); _8����2�ణ�����Ķ���ư.setContentAreaFilled(false); _8����2�ణ�����Ķ���ư.setFocusPainted(false); _8����2�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(8,2); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_8����2�ణ�����Ķ���ư); 
	 _8����3�ణ�����Ķ���ư.setBounds(X��ǥ[8], Y��ǥ[8][3], 120, 60); _8����3�ణ�����Ķ���ư.setVisible(false); _8����3�ణ�����Ķ���ư.setBorderPainted(false); _8����3�ణ�����Ķ���ư.setContentAreaFilled(false); _8����3�ణ�����Ķ���ư.setFocusPainted(false); _8����3�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(8,3); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_8����3�ణ�����Ķ���ư); 
	 _8����4�ణ�����Ķ���ư.setBounds(X��ǥ[8], Y��ǥ[8][4], 120, 60); _8����4�ణ�����Ķ���ư.setVisible(false); _8����4�ణ�����Ķ���ư.setBorderPainted(false); _8����4�ణ�����Ķ���ư.setContentAreaFilled(false); _8����4�ణ�����Ķ���ư.setFocusPainted(false); _8����4�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(8,4); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_8����4�ణ�����Ķ���ư); 
	 _8����5�ణ�����Ķ���ư.setBounds(X��ǥ[8], Y��ǥ[8][5], 120, 60); _8����5�ణ�����Ķ���ư.setVisible(false); _8����5�ణ�����Ķ���ư.setBorderPainted(false); _8����5�ణ�����Ķ���ư.setContentAreaFilled(false); _8����5�ణ�����Ķ���ư.setFocusPainted(false); _8����5�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(8,5); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_8����5�ణ�����Ķ���ư); 
	 _8����6�ణ�����Ķ���ư.setBounds(X��ǥ[8], Y��ǥ[8][6], 120, 60); _8����6�ణ�����Ķ���ư.setVisible(false); _8����6�ణ�����Ķ���ư.setBorderPainted(false); _8����6�ణ�����Ķ���ư.setContentAreaFilled(false); _8����6�ణ�����Ķ���ư.setFocusPainted(false); _8����6�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(8,6); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_8����6�ణ�����Ķ���ư); 
	 _8����7�ణ�����Ķ���ư.setBounds(X��ǥ[8], Y��ǥ[8][7], 120, 60); _8����7�ణ�����Ķ���ư.setVisible(false); _8����7�ణ�����Ķ���ư.setBorderPainted(false); _8����7�ణ�����Ķ���ư.setContentAreaFilled(false); _8����7�ణ�����Ķ���ư.setFocusPainted(false); _8����7�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(8,7); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_8����7�ణ�����Ķ���ư); 
	 _8����8�ణ�����Ķ���ư.setBounds(X��ǥ[8], Y��ǥ[8][8], 120, 60); _8����8�ణ�����Ķ���ư.setVisible(false); _8����8�ణ�����Ķ���ư.setBorderPainted(false); _8����8�ణ�����Ķ���ư.setContentAreaFilled(false); _8����8�ణ�����Ķ���ư.setFocusPainted(false); _8����8�ణ�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(8,8); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_8����8�ణ�����Ķ���ư);	

	 _0����0�����Ķ���ư.setBounds(X��ǥ[0], Y��ǥ[0][0], 120, 60); _0����0�����Ķ���ư.setVisible(false); _0����0�����Ķ���ư.setBorderPainted(false); _0����0�����Ķ���ư.setContentAreaFilled(false); _0����0�����Ķ���ư.setFocusPainted(false); _0����0�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(0,0); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_0����0�����Ķ���ư);
	 _0����1�����Ķ���ư.setBounds(X��ǥ[0], Y��ǥ[0][1], 120, 60); _0����1�����Ķ���ư.setVisible(false); _0����1�����Ķ���ư.setBorderPainted(false); _0����1�����Ķ���ư.setContentAreaFilled(false); _0����1�����Ķ���ư.setFocusPainted(false); _0����1�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(0,1); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_0����1�����Ķ���ư);
	 _0����2�����Ķ���ư.setBounds(X��ǥ[0], Y��ǥ[0][2], 120, 60); _0����2�����Ķ���ư.setVisible(false); _0����2�����Ķ���ư.setBorderPainted(false); _0����2�����Ķ���ư.setContentAreaFilled(false); _0����2�����Ķ���ư.setFocusPainted(false); _0����2�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(0,2); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_0����2�����Ķ���ư);
	 _0����3�����Ķ���ư.setBounds(X��ǥ[0], Y��ǥ[0][3], 120, 60); _0����3�����Ķ���ư.setVisible(false); _0����3�����Ķ���ư.setBorderPainted(false); _0����3�����Ķ���ư.setContentAreaFilled(false); _0����3�����Ķ���ư.setFocusPainted(false); _0����3�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(0,3); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_0����3�����Ķ���ư);
	 _0����4�����Ķ���ư.setBounds(X��ǥ[0], Y��ǥ[0][4], 120, 60); _0����4�����Ķ���ư.setVisible(false); _0����4�����Ķ���ư.setBorderPainted(false); _0����4�����Ķ���ư.setContentAreaFilled(false); _0����4�����Ķ���ư.setFocusPainted(false); _0����4�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(0,4); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_0����4�����Ķ���ư);
	 _0����5�����Ķ���ư.setBounds(X��ǥ[0], Y��ǥ[0][5], 120, 60); _0����5�����Ķ���ư.setVisible(false); _0����5�����Ķ���ư.setBorderPainted(false); _0����5�����Ķ���ư.setContentAreaFilled(false); _0����5�����Ķ���ư.setFocusPainted(false); _0����5�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(0,5); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_0����5�����Ķ���ư);
	 _0����6�����Ķ���ư.setBounds(X��ǥ[0], Y��ǥ[0][6], 120, 60); _0����6�����Ķ���ư.setVisible(false); _0����6�����Ķ���ư.setBorderPainted(false); _0����6�����Ķ���ư.setContentAreaFilled(false); _0����6�����Ķ���ư.setFocusPainted(false); _0����6�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(0,6); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_0����6�����Ķ���ư);
	 _0����7�����Ķ���ư.setBounds(X��ǥ[0], Y��ǥ[0][7], 120, 60); _0����7�����Ķ���ư.setVisible(false); _0����7�����Ķ���ư.setBorderPainted(false); _0����7�����Ķ���ư.setContentAreaFilled(false); _0����7�����Ķ���ư.setFocusPainted(false); _0����7�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(0,7); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_0����7�����Ķ���ư);
	 _0����8�����Ķ���ư.setBounds(X��ǥ[0], Y��ǥ[0][8], 120, 60); _0����8�����Ķ���ư.setVisible(false); _0����8�����Ķ���ư.setBorderPainted(false); _0����8�����Ķ���ư.setContentAreaFilled(false); _0����8�����Ķ���ư.setFocusPainted(false); _0����8�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(0,8); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_0����8�����Ķ���ư);
	 _1����0�����Ķ���ư.setBounds(X��ǥ[1], Y��ǥ[1][0], 120, 60); _1����0�����Ķ���ư.setVisible(false); _1����0�����Ķ���ư.setBorderPainted(false); _1����0�����Ķ���ư.setContentAreaFilled(false); _1����0�����Ķ���ư.setFocusPainted(false); _1����0�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(1,0); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_1����0�����Ķ���ư); 
	 _1����1�����Ķ���ư.setBounds(X��ǥ[1], Y��ǥ[1][1], 120, 60); _1����1�����Ķ���ư.setVisible(false); _1����1�����Ķ���ư.setBorderPainted(false); _1����1�����Ķ���ư.setContentAreaFilled(false); _1����1�����Ķ���ư.setFocusPainted(false); _1����1�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(1,1); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_1����1�����Ķ���ư); 
	 _1����2�����Ķ���ư.setBounds(X��ǥ[1], Y��ǥ[1][2], 120, 60); _1����2�����Ķ���ư.setVisible(false); _1����2�����Ķ���ư.setBorderPainted(false); _1����2�����Ķ���ư.setContentAreaFilled(false); _1����2�����Ķ���ư.setFocusPainted(false); _1����2�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(1,2); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_1����2�����Ķ���ư); 
	 _1����3�����Ķ���ư.setBounds(X��ǥ[1], Y��ǥ[1][3], 120, 60); _1����3�����Ķ���ư.setVisible(false); _1����3�����Ķ���ư.setBorderPainted(false); _1����3�����Ķ���ư.setContentAreaFilled(false); _1����3�����Ķ���ư.setFocusPainted(false); _1����3�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(1,3); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_1����3�����Ķ���ư); 
	 _1����4�����Ķ���ư.setBounds(X��ǥ[1], Y��ǥ[1][4], 120, 60); _1����4�����Ķ���ư.setVisible(false); _1����4�����Ķ���ư.setBorderPainted(false); _1����4�����Ķ���ư.setContentAreaFilled(false); _1����4�����Ķ���ư.setFocusPainted(false); _1����4�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(1,4); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_1����4�����Ķ���ư); 
	 _1����5�����Ķ���ư.setBounds(X��ǥ[1], Y��ǥ[1][5], 120, 60); _1����5�����Ķ���ư.setVisible(false); _1����5�����Ķ���ư.setBorderPainted(false); _1����5�����Ķ���ư.setContentAreaFilled(false); _1����5�����Ķ���ư.setFocusPainted(false); _1����5�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(1,5); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_1����5�����Ķ���ư); 
	 _1����6�����Ķ���ư.setBounds(X��ǥ[1], Y��ǥ[1][6], 120, 60); _1����6�����Ķ���ư.setVisible(false); _1����6�����Ķ���ư.setBorderPainted(false); _1����6�����Ķ���ư.setContentAreaFilled(false); _1����6�����Ķ���ư.setFocusPainted(false); _1����6�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(1,6); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_1����6�����Ķ���ư); 
	 _1����7�����Ķ���ư.setBounds(X��ǥ[1], Y��ǥ[1][7], 120, 60); _1����7�����Ķ���ư.setVisible(false); _1����7�����Ķ���ư.setBorderPainted(false); _1����7�����Ķ���ư.setContentAreaFilled(false); _1����7�����Ķ���ư.setFocusPainted(false); _1����7�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(1,7); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_1����7�����Ķ���ư); 
	 _1����8�����Ķ���ư.setBounds(X��ǥ[1], Y��ǥ[1][8], 120, 60); _1����8�����Ķ���ư.setVisible(false); _1����8�����Ķ���ư.setBorderPainted(false); _1����8�����Ķ���ư.setContentAreaFilled(false); _1����8�����Ķ���ư.setFocusPainted(false); _1����8�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(1,8); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_1����8�����Ķ���ư);
	 _2����0�����Ķ���ư.setBounds(X��ǥ[2], Y��ǥ[2][0], 120, 60); _2����0�����Ķ���ư.setVisible(false); _2����0�����Ķ���ư.setBorderPainted(false); _2����0�����Ķ���ư.setContentAreaFilled(false); _2����0�����Ķ���ư.setFocusPainted(false); _2����0�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(2,0); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_2����0�����Ķ���ư); 
	 _2����1�����Ķ���ư.setBounds(X��ǥ[2], Y��ǥ[2][1], 120, 60); _2����1�����Ķ���ư.setVisible(false); _2����1�����Ķ���ư.setBorderPainted(false); _2����1�����Ķ���ư.setContentAreaFilled(false); _2����1�����Ķ���ư.setFocusPainted(false); _2����1�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(2,1); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_2����1�����Ķ���ư); 
	 _2����2�����Ķ���ư.setBounds(X��ǥ[2], Y��ǥ[2][2], 120, 60); _2����2�����Ķ���ư.setVisible(false); _2����2�����Ķ���ư.setBorderPainted(false); _2����2�����Ķ���ư.setContentAreaFilled(false); _2����2�����Ķ���ư.setFocusPainted(false); _2����2�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(2,2); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_2����2�����Ķ���ư); 
	 _2����3�����Ķ���ư.setBounds(X��ǥ[2], Y��ǥ[2][3], 120, 60); _2����3�����Ķ���ư.setVisible(false); _2����3�����Ķ���ư.setBorderPainted(false); _2����3�����Ķ���ư.setContentAreaFilled(false); _2����3�����Ķ���ư.setFocusPainted(false); _2����3�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(2,3); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_2����3�����Ķ���ư); 
	 _2����4�����Ķ���ư.setBounds(X��ǥ[2], Y��ǥ[2][4], 120, 60); _2����4�����Ķ���ư.setVisible(false); _2����4�����Ķ���ư.setBorderPainted(false); _2����4�����Ķ���ư.setContentAreaFilled(false); _2����4�����Ķ���ư.setFocusPainted(false); _2����4�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(2,4); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_2����4�����Ķ���ư); 
	 _2����5�����Ķ���ư.setBounds(X��ǥ[2], Y��ǥ[2][5], 120, 60); _2����5�����Ķ���ư.setVisible(false); _2����5�����Ķ���ư.setBorderPainted(false); _2����5�����Ķ���ư.setContentAreaFilled(false); _2����5�����Ķ���ư.setFocusPainted(false); _2����5�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(2,5); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_2����5�����Ķ���ư); 
	 _2����6�����Ķ���ư.setBounds(X��ǥ[2], Y��ǥ[2][6], 120, 60); _2����6�����Ķ���ư.setVisible(false); _2����6�����Ķ���ư.setBorderPainted(false); _2����6�����Ķ���ư.setContentAreaFilled(false); _2����6�����Ķ���ư.setFocusPainted(false); _2����6�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(2,6); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_2����6�����Ķ���ư); 
	 _2����7�����Ķ���ư.setBounds(X��ǥ[2], Y��ǥ[2][7], 120, 60); _2����7�����Ķ���ư.setVisible(false); _2����7�����Ķ���ư.setBorderPainted(false); _2����7�����Ķ���ư.setContentAreaFilled(false); _2����7�����Ķ���ư.setFocusPainted(false); _2����7�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(2,7); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_2����7�����Ķ���ư); 
	 _2����8�����Ķ���ư.setBounds(X��ǥ[2], Y��ǥ[2][8], 120, 60); _2����8�����Ķ���ư.setVisible(false); _2����8�����Ķ���ư.setBorderPainted(false); _2����8�����Ķ���ư.setContentAreaFilled(false); _2����8�����Ķ���ư.setFocusPainted(false); _2����8�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(2,8); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_2����8�����Ķ���ư);
	 _3����0�����Ķ���ư.setBounds(X��ǥ[3], Y��ǥ[3][0], 120, 60); _3����0�����Ķ���ư.setVisible(false); _3����0�����Ķ���ư.setBorderPainted(false); _3����0�����Ķ���ư.setContentAreaFilled(false); _3����0�����Ķ���ư.setFocusPainted(false); _3����0�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(3,0); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_3����0�����Ķ���ư); 
	 _3����1�����Ķ���ư.setBounds(X��ǥ[3], Y��ǥ[3][1], 120, 60); _3����1�����Ķ���ư.setVisible(false); _3����1�����Ķ���ư.setBorderPainted(false); _3����1�����Ķ���ư.setContentAreaFilled(false); _3����1�����Ķ���ư.setFocusPainted(false); _3����1�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(3,1); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_3����1�����Ķ���ư); 
	 _3����2�����Ķ���ư.setBounds(X��ǥ[3], Y��ǥ[3][2], 120, 60); _3����2�����Ķ���ư.setVisible(false); _3����2�����Ķ���ư.setBorderPainted(false); _3����2�����Ķ���ư.setContentAreaFilled(false); _3����2�����Ķ���ư.setFocusPainted(false); _3����2�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(3,2); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_3����2�����Ķ���ư); 
	 _3����3�����Ķ���ư.setBounds(X��ǥ[3], Y��ǥ[3][3], 120, 60); _3����3�����Ķ���ư.setVisible(false); _3����3�����Ķ���ư.setBorderPainted(false); _3����3�����Ķ���ư.setContentAreaFilled(false); _3����3�����Ķ���ư.setFocusPainted(false); _3����3�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(3,3); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_3����3�����Ķ���ư); 
	 _3����4�����Ķ���ư.setBounds(X��ǥ[3], Y��ǥ[3][4], 120, 60); _3����4�����Ķ���ư.setVisible(false); _3����4�����Ķ���ư.setBorderPainted(false); _3����4�����Ķ���ư.setContentAreaFilled(false); _3����4�����Ķ���ư.setFocusPainted(false); _3����4�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(3,4); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_3����4�����Ķ���ư); 
	 _3����5�����Ķ���ư.setBounds(X��ǥ[3], Y��ǥ[3][5], 120, 60); _3����5�����Ķ���ư.setVisible(false); _3����5�����Ķ���ư.setBorderPainted(false); _3����5�����Ķ���ư.setContentAreaFilled(false); _3����5�����Ķ���ư.setFocusPainted(false); _3����5�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(3,5); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_3����5�����Ķ���ư); 
	 _3����6�����Ķ���ư.setBounds(X��ǥ[3], Y��ǥ[3][6], 120, 60); _3����6�����Ķ���ư.setVisible(false); _3����6�����Ķ���ư.setBorderPainted(false); _3����6�����Ķ���ư.setContentAreaFilled(false); _3����6�����Ķ���ư.setFocusPainted(false); _3����6�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(3,6); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_3����6�����Ķ���ư); 
	 _3����7�����Ķ���ư.setBounds(X��ǥ[3], Y��ǥ[3][7], 120, 60); _3����7�����Ķ���ư.setVisible(false); _3����7�����Ķ���ư.setBorderPainted(false); _3����7�����Ķ���ư.setContentAreaFilled(false); _3����7�����Ķ���ư.setFocusPainted(false); _3����7�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(3,7); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_3����7�����Ķ���ư); 
	 _3����8�����Ķ���ư.setBounds(X��ǥ[3], Y��ǥ[3][8], 120, 60); _3����8�����Ķ���ư.setVisible(false); _3����8�����Ķ���ư.setBorderPainted(false); _3����8�����Ķ���ư.setContentAreaFilled(false); _3����8�����Ķ���ư.setFocusPainted(false); _3����8�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(3,8); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_3����8�����Ķ���ư);
	 _4����0�����Ķ���ư.setBounds(X��ǥ[4], Y��ǥ[4][0], 120, 64); _4����0�����Ķ���ư.setVisible(false); _4����0�����Ķ���ư.setBorderPainted(false); _4����0�����Ķ���ư.setContentAreaFilled(false); _4����0�����Ķ���ư.setFocusPainted(false); _4����0�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(4,0); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_4����0�����Ķ���ư); 
	 _4����1�����Ķ���ư.setBounds(X��ǥ[4], Y��ǥ[4][1], 120, 64); _4����1�����Ķ���ư.setVisible(false); _4����1�����Ķ���ư.setBorderPainted(false); _4����1�����Ķ���ư.setContentAreaFilled(false); _4����1�����Ķ���ư.setFocusPainted(false); _4����1�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(4,1); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_4����1�����Ķ���ư); 
	 _4����2�����Ķ���ư.setBounds(X��ǥ[4], Y��ǥ[4][2], 120, 64); _4����2�����Ķ���ư.setVisible(false); _4����2�����Ķ���ư.setBorderPainted(false); _4����2�����Ķ���ư.setContentAreaFilled(false); _4����2�����Ķ���ư.setFocusPainted(false); _4����2�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(4,2); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_4����2�����Ķ���ư); 
	 _4����3�����Ķ���ư.setBounds(X��ǥ[4], Y��ǥ[4][3], 120, 64); _4����3�����Ķ���ư.setVisible(false); _4����3�����Ķ���ư.setBorderPainted(false); _4����3�����Ķ���ư.setContentAreaFilled(false); _4����3�����Ķ���ư.setFocusPainted(false); _4����3�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(4,3); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_4����3�����Ķ���ư); 
	 _4����4�����Ķ���ư.setBounds(X��ǥ[4], Y��ǥ[4][4], 120, 64); _4����4�����Ķ���ư.setVisible(false); _4����4�����Ķ���ư.setBorderPainted(false); _4����4�����Ķ���ư.setContentAreaFilled(false); _4����4�����Ķ���ư.setFocusPainted(false); _4����4�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(4,4); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_4����4�����Ķ���ư); 
	 _4����5�����Ķ���ư.setBounds(X��ǥ[4], Y��ǥ[4][5], 120, 64); _4����5�����Ķ���ư.setVisible(false); _4����5�����Ķ���ư.setBorderPainted(false); _4����5�����Ķ���ư.setContentAreaFilled(false); _4����5�����Ķ���ư.setFocusPainted(false); _4����5�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(4,5); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_4����5�����Ķ���ư); 
	 _4����6�����Ķ���ư.setBounds(X��ǥ[4], Y��ǥ[4][6], 120, 64); _4����6�����Ķ���ư.setVisible(false); _4����6�����Ķ���ư.setBorderPainted(false); _4����6�����Ķ���ư.setContentAreaFilled(false); _4����6�����Ķ���ư.setFocusPainted(false); _4����6�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(4,6); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_4����6�����Ķ���ư); 
	 _4����7�����Ķ���ư.setBounds(X��ǥ[4], Y��ǥ[4][7], 120, 64); _4����7�����Ķ���ư.setVisible(false); _4����7�����Ķ���ư.setBorderPainted(false); _4����7�����Ķ���ư.setContentAreaFilled(false); _4����7�����Ķ���ư.setFocusPainted(false); _4����7�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(4,7); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_4����7�����Ķ���ư); 
	 _4����8�����Ķ���ư.setBounds(X��ǥ[4], Y��ǥ[4][8], 120, 64); _4����8�����Ķ���ư.setVisible(false); _4����8�����Ķ���ư.setBorderPainted(false); _4����8�����Ķ���ư.setContentAreaFilled(false); _4����8�����Ķ���ư.setFocusPainted(false); _4����8�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(4,8); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_4����8�����Ķ���ư);
	 _5����0�����Ķ���ư.setBounds(X��ǥ[5], Y��ǥ[5][0], 120, 60); _5����0�����Ķ���ư.setVisible(false); _5����0�����Ķ���ư.setBorderPainted(false); _5����0�����Ķ���ư.setContentAreaFilled(false); _5����0�����Ķ���ư.setFocusPainted(false); _5����0�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(5,0); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_5����0�����Ķ���ư); 
	 _5����1�����Ķ���ư.setBounds(X��ǥ[5], Y��ǥ[5][1], 120, 60); _5����1�����Ķ���ư.setVisible(false); _5����1�����Ķ���ư.setBorderPainted(false); _5����1�����Ķ���ư.setContentAreaFilled(false); _5����1�����Ķ���ư.setFocusPainted(false); _5����1�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(5,1); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_5����1�����Ķ���ư); 
	 _5����2�����Ķ���ư.setBounds(X��ǥ[5], Y��ǥ[5][2], 120, 60); _5����2�����Ķ���ư.setVisible(false); _5����2�����Ķ���ư.setBorderPainted(false); _5����2�����Ķ���ư.setContentAreaFilled(false); _5����2�����Ķ���ư.setFocusPainted(false); _5����2�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(5,2); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_5����2�����Ķ���ư); 
	 _5����3�����Ķ���ư.setBounds(X��ǥ[5], Y��ǥ[5][3], 120, 60); _5����3�����Ķ���ư.setVisible(false); _5����3�����Ķ���ư.setBorderPainted(false); _5����3�����Ķ���ư.setContentAreaFilled(false); _5����3�����Ķ���ư.setFocusPainted(false); _5����3�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(5,3); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_5����3�����Ķ���ư); 
	 _5����4�����Ķ���ư.setBounds(X��ǥ[5], Y��ǥ[5][4], 120, 60); _5����4�����Ķ���ư.setVisible(false); _5����4�����Ķ���ư.setBorderPainted(false); _5����4�����Ķ���ư.setContentAreaFilled(false); _5����4�����Ķ���ư.setFocusPainted(false); _5����4�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(5,4); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_5����4�����Ķ���ư); 
	 _5����5�����Ķ���ư.setBounds(X��ǥ[5], Y��ǥ[5][5], 120, 60); _5����5�����Ķ���ư.setVisible(false); _5����5�����Ķ���ư.setBorderPainted(false); _5����5�����Ķ���ư.setContentAreaFilled(false); _5����5�����Ķ���ư.setFocusPainted(false); _5����5�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(5,5); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_5����5�����Ķ���ư); 
	 _5����6�����Ķ���ư.setBounds(X��ǥ[5], Y��ǥ[5][6], 120, 60); _5����6�����Ķ���ư.setVisible(false); _5����6�����Ķ���ư.setBorderPainted(false); _5����6�����Ķ���ư.setContentAreaFilled(false); _5����6�����Ķ���ư.setFocusPainted(false); _5����6�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(5,6); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_5����6�����Ķ���ư); 
	 _5����7�����Ķ���ư.setBounds(X��ǥ[5], Y��ǥ[5][7], 120, 60); _5����7�����Ķ���ư.setVisible(false); _5����7�����Ķ���ư.setBorderPainted(false); _5����7�����Ķ���ư.setContentAreaFilled(false); _5����7�����Ķ���ư.setFocusPainted(false); _5����7�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(5,7); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_5����7�����Ķ���ư); 
	 _5����8�����Ķ���ư.setBounds(X��ǥ[5], Y��ǥ[5][8], 120, 60); _5����8�����Ķ���ư.setVisible(false); _5����8�����Ķ���ư.setBorderPainted(false); _5����8�����Ķ���ư.setContentAreaFilled(false); _5����8�����Ķ���ư.setFocusPainted(false); _5����8�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(5,8); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_5����8�����Ķ���ư);
	 _6����0�����Ķ���ư.setBounds(X��ǥ[6], Y��ǥ[6][0], 120, 60); _6����0�����Ķ���ư.setVisible(false); _6����0�����Ķ���ư.setBorderPainted(false); _6����0�����Ķ���ư.setContentAreaFilled(false); _6����0�����Ķ���ư.setFocusPainted(false); _6����0�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(6,0); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_6����0�����Ķ���ư); 
	 _6����1�����Ķ���ư.setBounds(X��ǥ[6], Y��ǥ[6][1], 120, 60); _6����1�����Ķ���ư.setVisible(false); _6����1�����Ķ���ư.setBorderPainted(false); _6����1�����Ķ���ư.setContentAreaFilled(false); _6����1�����Ķ���ư.setFocusPainted(false); _6����1�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(6,1); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_6����1�����Ķ���ư); 
	 _6����2�����Ķ���ư.setBounds(X��ǥ[6], Y��ǥ[6][2], 120, 60); _6����2�����Ķ���ư.setVisible(false); _6����2�����Ķ���ư.setBorderPainted(false); _6����2�����Ķ���ư.setContentAreaFilled(false); _6����2�����Ķ���ư.setFocusPainted(false); _6����2�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(6,2); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_6����2�����Ķ���ư);
	 _6����3�����Ķ���ư.setBounds(X��ǥ[6], Y��ǥ[6][3], 120, 60); _6����3�����Ķ���ư.setVisible(false); _6����3�����Ķ���ư.setBorderPainted(false); _6����3�����Ķ���ư.setContentAreaFilled(false); _6����3�����Ķ���ư.setFocusPainted(false); _6����3�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(6,3); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_6����3�����Ķ���ư); 
	 _6����4�����Ķ���ư.setBounds(X��ǥ[6], Y��ǥ[6][4], 120, 60); _6����4�����Ķ���ư.setVisible(false); _6����4�����Ķ���ư.setBorderPainted(false); _6����4�����Ķ���ư.setContentAreaFilled(false); _6����4�����Ķ���ư.setFocusPainted(false); _6����4�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(6,4); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_6����4�����Ķ���ư); 
	 _6����5�����Ķ���ư.setBounds(X��ǥ[6], Y��ǥ[6][5], 120, 60); _6����5�����Ķ���ư.setVisible(false); _6����5�����Ķ���ư.setBorderPainted(false); _6����5�����Ķ���ư.setContentAreaFilled(false); _6����5�����Ķ���ư.setFocusPainted(false); _6����5�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(6,5); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_6����5�����Ķ���ư); 
	 _6����6�����Ķ���ư.setBounds(X��ǥ[6], Y��ǥ[6][6], 120, 60); _6����6�����Ķ���ư.setVisible(false); _6����6�����Ķ���ư.setBorderPainted(false); _6����6�����Ķ���ư.setContentAreaFilled(false); _6����6�����Ķ���ư.setFocusPainted(false); _6����6�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(6,6); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_6����6�����Ķ���ư); 
	 _6����7�����Ķ���ư.setBounds(X��ǥ[6], Y��ǥ[6][7], 120, 60); _6����7�����Ķ���ư.setVisible(false); _6����7�����Ķ���ư.setBorderPainted(false); _6����7�����Ķ���ư.setContentAreaFilled(false); _6����7�����Ķ���ư.setFocusPainted(false); _6����7�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(6,7); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_6����7�����Ķ���ư); 
	 _6����8�����Ķ���ư.setBounds(X��ǥ[6], Y��ǥ[6][8], 120, 60); _6����8�����Ķ���ư.setVisible(false); _6����8�����Ķ���ư.setBorderPainted(false); _6����8�����Ķ���ư.setContentAreaFilled(false); _6����8�����Ķ���ư.setFocusPainted(false); _6����8�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(6,8); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_6����8�����Ķ���ư);
	 _7����0�����Ķ���ư.setBounds(X��ǥ[7], Y��ǥ[7][0], 120, 60); _7����0�����Ķ���ư.setVisible(false); _7����0�����Ķ���ư.setBorderPainted(false); _7����0�����Ķ���ư.setContentAreaFilled(false); _7����0�����Ķ���ư.setFocusPainted(false); _7����0�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(7,0); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_7����0�����Ķ���ư); 
	 _7����1�����Ķ���ư.setBounds(X��ǥ[7], Y��ǥ[7][1], 120, 60); _7����1�����Ķ���ư.setVisible(false); _7����1�����Ķ���ư.setBorderPainted(false); _7����1�����Ķ���ư.setContentAreaFilled(false); _7����1�����Ķ���ư.setFocusPainted(false); _7����1�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(7,1); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_7����1�����Ķ���ư); 
	 _7����2�����Ķ���ư.setBounds(X��ǥ[7], Y��ǥ[7][2], 120, 60); _7����2�����Ķ���ư.setVisible(false); _7����2�����Ķ���ư.setBorderPainted(false); _7����2�����Ķ���ư.setContentAreaFilled(false); _7����2�����Ķ���ư.setFocusPainted(false); _7����2�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(7,2); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_7����2�����Ķ���ư); 
	 _7����3�����Ķ���ư.setBounds(X��ǥ[7], Y��ǥ[7][3], 120, 60); _7����3�����Ķ���ư.setVisible(false); _7����3�����Ķ���ư.setBorderPainted(false); _7����3�����Ķ���ư.setContentAreaFilled(false); _7����3�����Ķ���ư.setFocusPainted(false); _7����3�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(7,3); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_7����3�����Ķ���ư); 
	 _7����4�����Ķ���ư.setBounds(X��ǥ[7], Y��ǥ[7][4], 120, 60); _7����4�����Ķ���ư.setVisible(false); _7����4�����Ķ���ư.setBorderPainted(false); _7����4�����Ķ���ư.setContentAreaFilled(false); _7����4�����Ķ���ư.setFocusPainted(false); _7����4�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(7,4); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_7����4�����Ķ���ư); 
	 _7����5�����Ķ���ư.setBounds(X��ǥ[7], Y��ǥ[7][5], 120, 60); _7����5�����Ķ���ư.setVisible(false); _7����5�����Ķ���ư.setBorderPainted(false); _7����5�����Ķ���ư.setContentAreaFilled(false); _7����5�����Ķ���ư.setFocusPainted(false); _7����5�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(7,5); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_7����5�����Ķ���ư); 
	 _7����6�����Ķ���ư.setBounds(X��ǥ[7], Y��ǥ[7][6], 120, 60); _7����6�����Ķ���ư.setVisible(false); _7����6�����Ķ���ư.setBorderPainted(false); _7����6�����Ķ���ư.setContentAreaFilled(false); _7����6�����Ķ���ư.setFocusPainted(false); _7����6�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(7,6); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_7����6�����Ķ���ư); 
	 _7����7�����Ķ���ư.setBounds(X��ǥ[7], Y��ǥ[7][7], 120, 60); _7����7�����Ķ���ư.setVisible(false); _7����7�����Ķ���ư.setBorderPainted(false); _7����7�����Ķ���ư.setContentAreaFilled(false); _7����7�����Ķ���ư.setFocusPainted(false); _7����7�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(7,7); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_7����7�����Ķ���ư); 
	 _7����8�����Ķ���ư.setBounds(X��ǥ[7], Y��ǥ[7][8], 120, 60); _7����8�����Ķ���ư.setVisible(false); _7����8�����Ķ���ư.setBorderPainted(false); _7����8�����Ķ���ư.setContentAreaFilled(false); _7����8�����Ķ���ư.setFocusPainted(false); _7����8�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(7,8); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_7����8�����Ķ���ư);
	 _8����0�����Ķ���ư.setBounds(X��ǥ[8], Y��ǥ[8][0], 120, 60); _8����0�����Ķ���ư.setVisible(false); _8����0�����Ķ���ư.setBorderPainted(false); _8����0�����Ķ���ư.setContentAreaFilled(false); _8����0�����Ķ���ư.setFocusPainted(false); _8����0�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(8,0); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_8����0�����Ķ���ư); 
	 _8����1�����Ķ���ư.setBounds(X��ǥ[8], Y��ǥ[8][1], 120, 60); _8����1�����Ķ���ư.setVisible(false); _8����1�����Ķ���ư.setBorderPainted(false); _8����1�����Ķ���ư.setContentAreaFilled(false); _8����1�����Ķ���ư.setFocusPainted(false); _8����1�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(8,1); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_8����1�����Ķ���ư); 
	 _8����2�����Ķ���ư.setBounds(X��ǥ[8], Y��ǥ[8][2], 120, 60); _8����2�����Ķ���ư.setVisible(false); _8����2�����Ķ���ư.setBorderPainted(false); _8����2�����Ķ���ư.setContentAreaFilled(false); _8����2�����Ķ���ư.setFocusPainted(false); _8����2�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(8,2); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_8����2�����Ķ���ư); 
	 _8����3�����Ķ���ư.setBounds(X��ǥ[8], Y��ǥ[8][3], 120, 60); _8����3�����Ķ���ư.setVisible(false); _8����3�����Ķ���ư.setBorderPainted(false); _8����3�����Ķ���ư.setContentAreaFilled(false); _8����3�����Ķ���ư.setFocusPainted(false); _8����3�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(8,3); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_8����3�����Ķ���ư); 
	 _8����4�����Ķ���ư.setBounds(X��ǥ[8], Y��ǥ[8][4], 120, 60); _8����4�����Ķ���ư.setVisible(false); _8����4�����Ķ���ư.setBorderPainted(false); _8����4�����Ķ���ư.setContentAreaFilled(false); _8����4�����Ķ���ư.setFocusPainted(false); _8����4�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(8,4); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_8����4�����Ķ���ư); 
	 _8����5�����Ķ���ư.setBounds(X��ǥ[8], Y��ǥ[8][5], 120, 60); _8����5�����Ķ���ư.setVisible(false); _8����5�����Ķ���ư.setBorderPainted(false); _8����5�����Ķ���ư.setContentAreaFilled(false); _8����5�����Ķ���ư.setFocusPainted(false); _8����5�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(8,5); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_8����5�����Ķ���ư); 
	 _8����6�����Ķ���ư.setBounds(X��ǥ[8], Y��ǥ[8][6], 120, 60); _8����6�����Ķ���ư.setVisible(false); _8����6�����Ķ���ư.setBorderPainted(false); _8����6�����Ķ���ư.setContentAreaFilled(false); _8����6�����Ķ���ư.setFocusPainted(false); _8����6�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(8,6); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_8����6�����Ķ���ư); 
	 _8����7�����Ķ���ư.setBounds(X��ǥ[8], Y��ǥ[8][7], 120, 60); _8����7�����Ķ���ư.setVisible(false); _8����7�����Ķ���ư.setBorderPainted(false); _8����7�����Ķ���ư.setContentAreaFilled(false); _8����7�����Ķ���ư.setFocusPainted(false); _8����7�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(8,7); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_8����7�����Ķ���ư); 
	 _8����8�����Ķ���ư.setBounds(X��ǥ[8], Y��ǥ[8][8], 120, 60); _8����8�����Ķ���ư.setVisible(false); _8����8�����Ķ���ư.setBorderPainted(false); _8����8�����Ķ���ư.setContentAreaFilled(false); _8����8�����Ķ���ư.setFocusPainted(false); _8����8�����Ķ���ư.addMouseListener(new MouseAdapter() {public void mousePressed(MouseEvent e) { ����(8,8); ���̵���β�(); ��������=1;}});
	 getContentPane().add(_8����8�����Ķ���ư);	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		 
	 getContentPane().add(��������);
	 getContentPane().add(�Ķ�����); 
		������ư.setBounds(1099, 602, 100,50);//��ư ��ǥ �� �̹���ũ�� (X,Y,����,����)
		������ư.setBorderPainted(false);
		������ư.setContentAreaFilled(false);
		������ư.setFocusPainted(false);
		������ư.setVisible(false);
		������ư.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				������ư.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
					++_x;
					if(_x==1){�޴���2();}
					else if(_x==2){�޴���3();}
					else if(_x==3){�޴���4();}
					else if(_x==4){�޴���5();}
				 	else if(_x==5){�޴���6();}
					else if(_x==6){_x=0; �޴���();}
				}
		}); getContentPane().add(������ư);
		�ڷι�ư.setBounds(999, 602, 100, 50);//��ư ��ǥ �� �̹���ũ�� (X,Y,����,����)
		�ڷι�ư.setBorderPainted(false);
		�ڷι�ư.setContentAreaFilled(false);
		�ڷι�ư.setFocusPainted(false);
		�ڷι�ư.setVisible(false);
		�ڷι�ư.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				�ڷι�ư.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				 --_x;
				 if(_x==-1){�޴���(); _x=0;}
				    else if(_x==0){�޴���();}
				 	else if(_x==1){�޴���2();}
				 	else if(_x==2){�޴���3();}
				 	else if(_x==3){�޴���4();}
				 	else if(_x==4){�޴���5();}
				 	else if(_x==5){�޴���6();}
				}
		}); getContentPane().add(�ڷι�ư);
	  �ʼ����̹���.setIcon(new ImageIcon(G����.class.getResource("/images/������ ����.png")));
	  �ʼ����̹���.setVisible(false);
	  �ʼ����̹���.setBounds(390, 10, 500, 150);
	  
	  ����.setIcon(new ImageIcon(G����.class.getResource("/images/�������.png")));
	  ����.setBounds(-10, -10, 1280, 720);
	  ����.setVisible(false);   
	  ����1.setIcon(new ImageIcon(G����.class.getResource("/images/���ӱ�Ģ.png")));
	  ����1.setBounds(0, 0, 1280, 720);
	  ����1.setVisible(false);   
	  ����2.setIcon(new ImageIcon(G����.class.getResource("/images/���̵����.png")));
	  ����2.setBounds(0, 0, 1280, 720);
	  ����2.setVisible(false); 
	  ����3.setIcon(new ImageIcon(G����.class.getResource("/images/���´�.png")));
	  ����3.setBounds(0, 0, 1280, 720);
	  ����3.setVisible(false);   
	  �¸�1.setIcon(new ImageIcon(G����.class.getResource("/images/�Ķ��¸�.png")));
	  �¸�1.setBounds(100, 10, 800,600);
	  �¸�1.setVisible(false); 
	  �¸�2.setIcon(new ImageIcon(G����.class.getResource("/images/�����¸�.png")));
	  �¸�2.setBounds(150, 10, 836, 637);
	  �¸�2.setVisible(false); 
	 	  �ΰ�.setIcon(new ImageIcon(G����.class.getResource("/images/Ÿ��Ʋ�ΰ�.png")));
	 	  �ΰ�.setBounds(120, 80, 600, 300);
	 	  ���.setIcon(new ImageIcon(G����.class.getResource("/images/ū������.png")));
		  ���.setBounds(-8, 10, 961, 691);//�̹����� �ȸ¾Ƽ� ��ǥ���� �ǵ��� ����
		  ���.setVisible(false);  
		  ���1.setIcon(new ImageIcon(G����.class.getResource("/images/ū������2.png")));
		  ���1.setBounds(0, 0, 961, 691);
		  ���1.setVisible(false);
		  �⺻���.setIcon(new ImageIcon(G����.class.getResource("/images/�׳����.png")));
		  �⺻���.setBounds(0, 0, 1280, 720);
		  getContentPane().add(����); 
		  getContentPane().add(����1);
		  getContentPane().add(����2);
		  getContentPane().add(����3);
		  getContentPane().add(�¸�2);
		  getContentPane().add(�¸�1);
		  getContentPane().add(�ʼ����̹���);
		  getContentPane().add(�ΰ�);
		  getContentPane().add(���);
		  getContentPane().add(���1);
		  getContentPane().add(�⺻���);
			try {
				Thread.sleep(100);//10ms��ŭ ����ϰ� ������ϸ� catch������ �Ѿ
				�⺻���.setVisible(true);
				�����ư.setVisible(true);
				���۹�ư.setVisible(true);
				�޴����ư.setVisible(true);
				�ΰ�.setVisible(true);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
//            public class G���� extends JFrame ��
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public void �޴���(){
	���۹�ư.setVisible(false);
	�����ư.setVisible(false);
	�޴����ư.setVisible(false);
	�ΰ�.setVisible(false);
	����2.setVisible(false);
	����1.setVisible(true);
	������ư.setVisible(true);
	�ڷι�ư.setVisible(true);
}
public void �޴���2(){
	����1.setVisible(false);
	����3.setVisible(false);
	����2.setVisible(true);
}
public void �޴���3(){
	����2.setVisible(false);
	�¸�1.setVisible(false);
	�¸�2.setVisible(false);
	����3.setVisible(true);
}
public void �޴���4(){
	����3.setVisible(false);
	�¸�2.setVisible(false);
	�¸�1.setVisible(true);
}
public void �޴���5(){
	�¸�2.setVisible(true);
	����.setVisible(false);
}
public void �޴���6(){
	�¸�2.setVisible(false);
	�¸�1.setVisible(false);
	����.setVisible(true);
}
public void �޴���(){
	����.setVisible(false);
	�¸�1.setVisible(false);
	�¸�2.setVisible(false);
	����1.setVisible(false);
	�ڷι�ư.setVisible(false);
	������ư.setVisible(false);	
	�����ư.setVisible(true);
	���۹�ư.setVisible(true);
	�޴����ư.setVisible(true);
	�ΰ�.setVisible(true);
}
	public void ����ȭ������() {
		//ȭ�� �Ѿ������ ��ư�� ����� ����ؾ��� ��ư�� ���̰�
		���ʸʹ�ư.setVisible(false); �����ʸʹ�ư.setVisible(false);
		�޴��ε��ư����ư.setVisible(false);
		�ʼ����̹���.setVisible(false);
		�����ư.setVisible(true);
		���۹�ư.setVisible(true);
		�޴����ư.setVisible(true);
		�ΰ�.setVisible(true);
	}
	public void �ʼ���ȭ������() {//���� �� ���ư��� ������ �Ϸ� ��
		�ʹ�ȣ = 0;
		���.setVisible(false);	���1.setVisible(false);
		���ºι�ư.setVisible(false); �������¸���ư.setVisible(false); �Ķ����¸���ư.setVisible(false);
		��������.setVisible(false); �Ķ�����.setVisible(false);
		��κ�Ȱ��ȭ();
		��������=0;
		���������ռ�=0; �Ķ������ռ�=0;
		����ī��Ʈ=0; �Ķ�ī��Ʈ=0;
		�����ϼ��ڲ�(); �����ʼ��ڲ�(); �Ķ��ϼ��ڲ�(); �Ķ��ʼ��ڲ�();
		�ʼ����̹���.setVisible(true);
		���ʸʹ�ư.setVisible(true); �����ʸʹ�ư.setVisible(true);
		�޴��ε��ư����ư.setVisible(true);//����ȭ������
		���ư����ư.setVisible(false);
	}
	
	public void �ʼ���ȭ��() {//���۹�ư���� �Ѿ��
		���۹�ư.setVisible(false);
		�����ư.setVisible(false);
		�޴����ư.setVisible(false);
		�ΰ�.setVisible(false);
		�ʼ����̹���.setVisible(true);
		���ʸʹ�ư.setVisible(true);
		�����ʸʹ�ư.setVisible(true);
		�޴��ε��ư����ư.setVisible(true);//����ȭ������
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	public void �ʽ���() {
	if(�ʹ�ȣ==1) {������ = new int[][]{
				{7,7,0,0,0,0,0,7,7},{7,7,0,0,0,0,0,0,7},{7,0,0,0,0,0,0,0,7},{7,0,0,0,0,7,0,0,0}, //0,1,7,3
				{0,0,0,7,0,0,0,0,0},{7,0,0,0,0,7,0,0,0},{7,0,0,0,0,0,0,0,7},{7,7,0,0,0,0,0,0,7}, //4,5,6,7
				{7,7,0,0,0,0,0,7,7}};//8
		 } else {������ = new int[][]{
				{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0}, //0,1,2,3
				{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0}, //4,5,6,7
				{0,0,0,0,0,0,0,0,0} }; //8
	}
		���ӽ���();
	} // 0��ĭ | 1���� | 10�ణ���ѻ��� | 11���ѻ��� | 2�Ķ� | 20�ణ�����Ķ� | 22�����Ķ� | 7����������ĭ
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
	void ��κ�Ȱ��ȭ(){
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				��ư��Ȱ��ȭ(i,j,1); ��ư��Ȱ��ȭ(i,j,10); ��ư��Ȱ��ȭ(i,j,11);
				��ư��Ȱ��ȭ(i,j,2); ��ư��Ȱ��ȭ(i,j,20); ��ư��Ȱ��ȭ(i,j,22);
			}
		}
	}
	void ���ھ����(){
		int n=0;
n = ���������ռ�/10;
switch(n){
case 0 : �����ʼ��ڲ�();����00.setVisible(true); break;
case 1 : �����ʼ��ڲ�();����10.setVisible(true); break; 
case 2 : �����ʼ��ڲ�();����20.setVisible(true); break;
case 3 : �����ʼ��ڲ�();����30.setVisible(true); break;
case 4 : �����ʼ��ڲ�();����40.setVisible(true); break;
case 5 : �����ʼ��ڲ�();����50.setVisible(true); break;
case 6 : �����ʼ��ڲ�();����60.setVisible(true); break;
case 7 : �����ʼ��ڲ�();����70.setVisible(true); break;
case 8 : �����ʼ��ڲ�();����80.setVisible(true); break;
case 9 : �����ʼ��ڲ�();����90.setVisible(true); break;
} n=0;
n = ���������ռ�%10;
switch(n){
case 0 : �����ϼ��ڲ�();����0.setVisible(true); break;
case 1 : �����ϼ��ڲ�();����1.setVisible(true); break;
case 2 : �����ϼ��ڲ�();����2.setVisible(true); break;
case 3 : �����ϼ��ڲ�();����3.setVisible(true); break;
case 4 : �����ϼ��ڲ�();����4.setVisible(true); break;
case 5 : �����ϼ��ڲ�();����5.setVisible(true); break;
case 6 : �����ϼ��ڲ�();����6.setVisible(true); break;
case 7 : �����ϼ��ڲ�();����7.setVisible(true); break;
case 8 : �����ϼ��ڲ�();����8.setVisible(true); break;
case 9 : �����ϼ��ڲ�();����9.setVisible(true); break;
} n=0;
n = �Ķ������ռ�/10;
switch(n){
case 0 : �Ķ��ʼ��ڲ�();�Ķ�00.setVisible(true); break;
case 1 : �Ķ��ʼ��ڲ�();�Ķ�10.setVisible(true); break; 
case 2 : �Ķ��ʼ��ڲ�();�Ķ�20.setVisible(true); break;
case 3 : �Ķ��ʼ��ڲ�();�Ķ�30.setVisible(true); break;
case 4 : �Ķ��ʼ��ڲ�();�Ķ�40.setVisible(true); break;
case 5 : �Ķ��ʼ��ڲ�();�Ķ�50.setVisible(true); break;
case 6 : �Ķ��ʼ��ڲ�();�Ķ�60.setVisible(true); break;
case 7 : �Ķ��ʼ��ڲ�();�Ķ�70.setVisible(true); break;
case 8 : �Ķ��ʼ��ڲ�();�Ķ�80.setVisible(true); break;
case 9 : �Ķ��ʼ��ڲ�();�Ķ�90.setVisible(true); break;
} n=0;
n = �Ķ������ռ�%10;
switch(n){
case 0 : �Ķ��ϼ��ڲ�();�Ķ�0.setVisible(true); break;
case 1 : �Ķ��ϼ��ڲ�();�Ķ�1.setVisible(true); break;
case 2 : �Ķ��ϼ��ڲ�();�Ķ�2.setVisible(true); break;
case 3 : �Ķ��ϼ��ڲ�();�Ķ�3.setVisible(true); break;
case 4 : �Ķ��ϼ��ڲ�();�Ķ�4.setVisible(true); break;
case 5 : �Ķ��ϼ��ڲ�();�Ķ�5.setVisible(true); break;
case 6 : �Ķ��ϼ��ڲ�();�Ķ�6.setVisible(true); break;
case 7 : �Ķ��ϼ��ڲ�();�Ķ�7.setVisible(true); break;
case 8 : �Ķ��ϼ��ڲ�();�Ķ�8.setVisible(true); break;
case 9 : �Ķ��ϼ��ڲ�();�Ķ�9.setVisible(true); break;
} n=0;
	}
void �����ʼ��ڲ�(){
����00.setVisible(false); ����10.setVisible(false); ����20.setVisible(false); ����30.setVisible(false); ����40.setVisible(false);
����50.setVisible(false); ����60.setVisible(false); ����70.setVisible(false); ����80.setVisible(false); ����90.setVisible(false);
}

void �����ϼ��ڲ�(){
����0.setVisible(false); ����1.setVisible(false); ����2.setVisible(false); ����3.setVisible(false); ����4.setVisible(false);
����5.setVisible(false); ����6.setVisible(false); ����7.setVisible(false); ����8.setVisible(false); ����9.setVisible(false);
}

void �Ķ��ʼ��ڲ�(){
�Ķ�00.setVisible(false); �Ķ�10.setVisible(false); �Ķ�20.setVisible(false); �Ķ�30.setVisible(false); �Ķ�40.setVisible(false);
�Ķ�50.setVisible(false); �Ķ�60.setVisible(false); �Ķ�70.setVisible(false); �Ķ�80.setVisible(false); �Ķ�90.setVisible(false);
}

void �Ķ��ϼ��ڲ�(){
�Ķ�0.setVisible(false); �Ķ�1.setVisible(false); �Ķ�2.setVisible(false); �Ķ�3.setVisible(false); �Ķ�4.setVisible(false);
�Ķ�5.setVisible(false); �Ķ�6.setVisible(false); �Ķ�7.setVisible(false); �Ķ�8.setVisible(false); �Ķ�9.setVisible(false);
}


	void ���̵���β�(){//���� �������� ��� ���̵���� ���� ��
		for(int i=0;i<9;i++){
		for(int j=0;j<9;j++){
			     if(������[i][j]==10){��ư��Ȱ��ȭ(i,j,10); ������[i][j]=0;}
			else if(������[i][j]==11){��ư��Ȱ��ȭ(i,j,11); ������[i][j]=0;}
			else if(������[i][j]==20){��ư��Ȱ��ȭ(i,j,20); ������[i][j]=0;}
			else if(������[i][j]==22){��ư��Ȱ��ȭ(i,j,22); ������[i][j]=0;}
		}
	}
}
	void ��ư��Ȱ��ȭ(int x,int y,int ��){
			if(��==1){
		          if(x==0) {if(y==0){_0����0������ư.setVisible(false);}  else if(y==1){_0����1������ư.setVisible(false);}  else if(y==2){_0����2������ư.setVisible(false);}  else if(y==3){_0����3������ư.setVisible(false);}  else if(y==4){_0����4������ư.setVisible(false);}  else if(y==5){_0����5������ư.setVisible(false);} else if(y==6){_0����6������ư.setVisible(false);}  else if(y==7){_0����7������ư.setVisible(false);}  else if(y==8){_0����8������ư.setVisible(false);}  
		        } if(x==1) {if(y==0){_1����0������ư.setVisible(false);}  else if(y==1){_1����1������ư.setVisible(false);}  else if(y==2){_1����2������ư.setVisible(false);}  else if(y==3){_1����3������ư.setVisible(false);}  else if(y==4){_1����4������ư.setVisible(false);}  else if(y==5){_1����5������ư.setVisible(false);} else if(y==6){_1����6������ư.setVisible(false);}  else if(y==7){_1����7������ư.setVisible(false);}  else if(y==8){_1����8������ư.setVisible(false);} 
		        } if(x==2) {if(y==0){_2����0������ư.setVisible(false);}  else if(y==1){_2����1������ư.setVisible(false);}  else if(y==2){_2����2������ư.setVisible(false);}  else if(y==3){_2����3������ư.setVisible(false);}  else if(y==4){_2����4������ư.setVisible(false);}  else if(y==5){_2����5������ư.setVisible(false);} else if(y==6){_2����6������ư.setVisible(false);}  else if(y==7){_2����7������ư.setVisible(false);}  else if(y==8){_2����8������ư.setVisible(false);} 
		        } if(x==3) {if(y==0){_3����0������ư.setVisible(false);}  else if(y==1){_3����1������ư.setVisible(false);}  else if(y==2){_3����2������ư.setVisible(false);}  else if(y==3){_3����3������ư.setVisible(false);}  else if(y==4){_3����4������ư.setVisible(false);}  else if(y==5){_3����5������ư.setVisible(false);} else if(y==6){_3����6������ư.setVisible(false);}  else if(y==7){_3����7������ư.setVisible(false);}  else if(y==8){_3����8������ư.setVisible(false);} 
		        } if(x==4) {if(y==0){_4����0������ư.setVisible(false);}  else if(y==1){_4����1������ư.setVisible(false);}  else if(y==2){_4����2������ư.setVisible(false);}  else if(y==3){_4����3������ư.setVisible(false);}  else if(y==4){_4����4������ư.setVisible(false);}  else if(y==5){_4����5������ư.setVisible(false);} else if(y==6){_4����6������ư.setVisible(false);}  else if(y==7){_4����7������ư.setVisible(false);}  else if(y==8){_4����8������ư.setVisible(false);} 
		        } if(x==5) {if(y==0){_5����0������ư.setVisible(false);}  else if(y==1){_5����1������ư.setVisible(false);}  else if(y==2){_5����2������ư.setVisible(false);}  else if(y==3){_5����3������ư.setVisible(false);}  else if(y==4){_5����4������ư.setVisible(false);}  else if(y==5){_5����5������ư.setVisible(false);} else if(y==6){_5����6������ư.setVisible(false);}  else if(y==7){_5����7������ư.setVisible(false);}  else if(y==8){_5����8������ư.setVisible(false);} 
		        } if(x==6) {if(y==0){_6����0������ư.setVisible(false);}  else if(y==1){_6����1������ư.setVisible(false);}  else if(y==2){_6����2������ư.setVisible(false);}  else if(y==3){_6����3������ư.setVisible(false);}  else if(y==4){_6����4������ư.setVisible(false);}  else if(y==5){_6����5������ư.setVisible(false);} else if(y==6){_6����6������ư.setVisible(false);}  else if(y==7){_6����7������ư.setVisible(false);}  else if(y==8){_6����8������ư.setVisible(false);} 
		        } if(x==7) {if(y==0){_7����0������ư.setVisible(false);}  else if(y==1){_7����1������ư.setVisible(false);}  else if(y==2){_7����2������ư.setVisible(false);}  else if(y==3){_7����3������ư.setVisible(false);}  else if(y==4){_7����4������ư.setVisible(false);}  else if(y==5){_7����5������ư.setVisible(false);} else if(y==6){_7����6������ư.setVisible(false);}  else if(y==7){_7����7������ư.setVisible(false);}  else if(y==8){_7����8������ư.setVisible(false);} 
		        } if(x==8) {if(y==0){_8����0������ư.setVisible(false);}  else if(y==1){_8����1������ư.setVisible(false);}  else if(y==2){_8����2������ư.setVisible(false);}  else if(y==3){_8����3������ư.setVisible(false);}  else if(y==4){_8����4������ư.setVisible(false);}  else if(y==5){_8����5������ư.setVisible(false);} else if(y==6){_8����6������ư.setVisible(false);}  else if(y==7){_8����7������ư.setVisible(false);}  else if(y==8){_8����8������ư.setVisible(false);} 
		       }}
			if(��==10){
		      if(x==0) {if(y==0){_0����0�ణ���ѻ�����ư.setVisible(false);} else if(y==1){_0����1�ణ���ѻ�����ư.setVisible(false);} else if(y==2){_0����2�ణ���ѻ�����ư.setVisible(false);} else if(y==3){_0����3�ణ���ѻ�����ư.setVisible(false);} else if(y==4){_0����4�ణ���ѻ�����ư.setVisible(false);} else if(y==5){_0����5�ణ���ѻ�����ư.setVisible(false);}else if(y==6){_0����6�ణ���ѻ�����ư.setVisible(false);} else if(y==7){_0����7�ణ���ѻ�����ư.setVisible(false);} else if(y==8){_0����8�ణ���ѻ�����ư.setVisible(false);}
			} if(x==1) {if(y==0){_1����0�ణ���ѻ�����ư.setVisible(false);} else if(y==1){_1����1�ణ���ѻ�����ư.setVisible(false);} else if(y==2){_1����2�ణ���ѻ�����ư.setVisible(false);} else if(y==3){_1����3�ణ���ѻ�����ư.setVisible(false);} else if(y==4){_1����4�ణ���ѻ�����ư.setVisible(false);} else if(y==5){_1����5�ణ���ѻ�����ư.setVisible(false);}else if(y==6){_1����6�ణ���ѻ�����ư.setVisible(false);} else if(y==7){_1����7�ణ���ѻ�����ư.setVisible(false);} else if(y==8){_1����8�ణ���ѻ�����ư.setVisible(false);}
			} if(x==2) {if(y==0){_2����0�ణ���ѻ�����ư.setVisible(false);} else if(y==1){_2����1�ణ���ѻ�����ư.setVisible(false);} else if(y==2){_2����2�ణ���ѻ�����ư.setVisible(false);} else if(y==3){_2����3�ణ���ѻ�����ư.setVisible(false);} else if(y==4){_2����4�ణ���ѻ�����ư.setVisible(false);} else if(y==5){_2����5�ణ���ѻ�����ư.setVisible(false);}else if(y==6){_2����6�ణ���ѻ�����ư.setVisible(false);} else if(y==7){_2����7�ణ���ѻ�����ư.setVisible(false);} else if(y==8){_2����8�ణ���ѻ�����ư.setVisible(false);}
			} if(x==3) {if(y==0){_3����0�ణ���ѻ�����ư.setVisible(false);} else if(y==1){_3����1�ణ���ѻ�����ư.setVisible(false);} else if(y==2){_3����2�ణ���ѻ�����ư.setVisible(false);} else if(y==3){_3����3�ణ���ѻ�����ư.setVisible(false);} else if(y==4){_3����4�ణ���ѻ�����ư.setVisible(false);} else if(y==5){_3����5�ణ���ѻ�����ư.setVisible(false);}else if(y==6){_3����6�ణ���ѻ�����ư.setVisible(false);} else if(y==7){_3����7�ణ���ѻ�����ư.setVisible(false);} else if(y==8){_3����8�ణ���ѻ�����ư.setVisible(false);}
			} if(x==4) {if(y==0){_4����0�ణ���ѻ�����ư.setVisible(false);} else if(y==1){_4����1�ణ���ѻ�����ư.setVisible(false);} else if(y==2){_4����2�ణ���ѻ�����ư.setVisible(false);} else if(y==3){_4����3�ణ���ѻ�����ư.setVisible(false);} else if(y==4){_4����4�ణ���ѻ�����ư.setVisible(false);} else if(y==5){_4����5�ణ���ѻ�����ư.setVisible(false);}else if(y==6){_4����6�ణ���ѻ�����ư.setVisible(false);} else if(y==7){_4����7�ణ���ѻ�����ư.setVisible(false);} else if(y==8){_4����8�ణ���ѻ�����ư.setVisible(false);}
			} if(x==5) {if(y==0){_5����0�ణ���ѻ�����ư.setVisible(false);} else if(y==1){_5����1�ణ���ѻ�����ư.setVisible(false);} else if(y==2){_5����2�ణ���ѻ�����ư.setVisible(false);} else if(y==3){_5����3�ణ���ѻ�����ư.setVisible(false);} else if(y==4){_5����4�ణ���ѻ�����ư.setVisible(false);} else if(y==5){_5����5�ణ���ѻ�����ư.setVisible(false);}else if(y==6){_5����6�ణ���ѻ�����ư.setVisible(false);} else if(y==7){_5����7�ణ���ѻ�����ư.setVisible(false);} else if(y==8){_5����8�ణ���ѻ�����ư.setVisible(false);}
			} if(x==6) {if(y==0){_6����0�ణ���ѻ�����ư.setVisible(false);} else if(y==1){_6����1�ణ���ѻ�����ư.setVisible(false);} else if(y==2){_6����2�ణ���ѻ�����ư.setVisible(false);} else if(y==3){_6����3�ణ���ѻ�����ư.setVisible(false);} else if(y==4){_6����4�ణ���ѻ�����ư.setVisible(false);} else if(y==5){_6����5�ణ���ѻ�����ư.setVisible(false);}else if(y==6){_6����6�ణ���ѻ�����ư.setVisible(false);} else if(y==7){_6����7�ణ���ѻ�����ư.setVisible(false);} else if(y==8){_6����8�ణ���ѻ�����ư.setVisible(false);}
		  	} if(x==7) {if(y==0){_7����0�ణ���ѻ�����ư.setVisible(false);} else if(y==1){_7����1�ణ���ѻ�����ư.setVisible(false);} else if(y==2){_7����2�ణ���ѻ�����ư.setVisible(false);} else if(y==3){_7����3�ణ���ѻ�����ư.setVisible(false);} else if(y==4){_7����4�ణ���ѻ�����ư.setVisible(false);} else if(y==5){_7����5�ణ���ѻ�����ư.setVisible(false);}else if(y==6){_7����6�ణ���ѻ�����ư.setVisible(false);} else if(y==7){_7����7�ణ���ѻ�����ư.setVisible(false);} else if(y==8){_7����8�ణ���ѻ�����ư.setVisible(false);}
			} if(x==8) {if(y==0){_8����0�ణ���ѻ�����ư.setVisible(false);} else if(y==1){_8����1�ణ���ѻ�����ư.setVisible(false);} else if(y==2){_8����2�ణ���ѻ�����ư.setVisible(false);} else if(y==3){_8����3�ణ���ѻ�����ư.setVisible(false);} else if(y==4){_8����4�ణ���ѻ�����ư.setVisible(false);} else if(y==5){_8����5�ణ���ѻ�����ư.setVisible(false);}else if(y==6){_8����6�ణ���ѻ�����ư.setVisible(false);} else if(y==7){_8����7�ణ���ѻ�����ư.setVisible(false);} else if(y==8){_8����8�ణ���ѻ�����ư.setVisible(false);}
			    }}
			if(��==11){
			  if(x==0) {if(y==0){_0����0���ѻ�����ư.setVisible(false);} else if(y==1){_0����1���ѻ�����ư.setVisible(false);} else if(y==2){_0����2���ѻ�����ư.setVisible(false);} else if(y==3){_0����3���ѻ�����ư.setVisible(false);} else if(y==4){_0����4���ѻ�����ư.setVisible(false);} else if(y==5){_0����5���ѻ�����ư.setVisible(false);}else if(y==6){_0����6���ѻ�����ư.setVisible(false);} else if(y==7){_0����7���ѻ�����ư.setVisible(false);} else if(y==8){_0����8���ѻ�����ư.setVisible(false);}
			} if(x==1) {if(y==0){_1����0���ѻ�����ư.setVisible(false);} else if(y==1){_1����1���ѻ�����ư.setVisible(false);} else if(y==2){_1����2���ѻ�����ư.setVisible(false);} else if(y==3){_1����3���ѻ�����ư.setVisible(false);} else if(y==4){_1����4���ѻ�����ư.setVisible(false);} else if(y==5){_1����5���ѻ�����ư.setVisible(false);}else if(y==6){_1����6���ѻ�����ư.setVisible(false);} else if(y==7){_1����7���ѻ�����ư.setVisible(false);} else if(y==8){_1����8���ѻ�����ư.setVisible(false);}
			} if(x==2) {if(y==0){_2����0���ѻ�����ư.setVisible(false);} else if(y==1){_2����1���ѻ�����ư.setVisible(false);} else if(y==2){_2����2���ѻ�����ư.setVisible(false);} else if(y==3){_2����3���ѻ�����ư.setVisible(false);} else if(y==4){_2����4���ѻ�����ư.setVisible(false);} else if(y==5){_2����5���ѻ�����ư.setVisible(false);}else if(y==6){_2����6���ѻ�����ư.setVisible(false);} else if(y==7){_2����7���ѻ�����ư.setVisible(false);} else if(y==8){_2����8���ѻ�����ư.setVisible(false);}
			} if(x==3) {if(y==0){_3����0���ѻ�����ư.setVisible(false);} else if(y==1){_3����1���ѻ�����ư.setVisible(false);} else if(y==2){_3����2���ѻ�����ư.setVisible(false);} else if(y==3){_3����3���ѻ�����ư.setVisible(false);} else if(y==4){_3����4���ѻ�����ư.setVisible(false);} else if(y==5){_3����5���ѻ�����ư.setVisible(false);}else if(y==6){_3����6���ѻ�����ư.setVisible(false);} else if(y==7){_3����7���ѻ�����ư.setVisible(false);} else if(y==8){_3����8���ѻ�����ư.setVisible(false);}
			} if(x==4) {if(y==0){_4����0���ѻ�����ư.setVisible(false);} else if(y==1){_4����1���ѻ�����ư.setVisible(false);} else if(y==2){_4����2���ѻ�����ư.setVisible(false);} else if(y==3){_4����3���ѻ�����ư.setVisible(false);} else if(y==4){_4����4���ѻ�����ư.setVisible(false);} else if(y==5){_4����5���ѻ�����ư.setVisible(false);}else if(y==6){_4����6���ѻ�����ư.setVisible(false);} else if(y==7){_4����7���ѻ�����ư.setVisible(false);} else if(y==8){_4����8���ѻ�����ư.setVisible(false);}
			} if(x==5) {if(y==0){_5����0���ѻ�����ư.setVisible(false);} else if(y==1){_5����1���ѻ�����ư.setVisible(false);} else if(y==2){_5����2���ѻ�����ư.setVisible(false);} else if(y==3){_5����3���ѻ�����ư.setVisible(false);} else if(y==4){_5����4���ѻ�����ư.setVisible(false);} else if(y==5){_5����5���ѻ�����ư.setVisible(false);}else if(y==6){_5����6���ѻ�����ư.setVisible(false);} else if(y==7){_5����7���ѻ�����ư.setVisible(false);} else if(y==8){_5����8���ѻ�����ư.setVisible(false);}
			} if(x==6) {if(y==0){_6����0���ѻ�����ư.setVisible(false);} else if(y==1){_6����1���ѻ�����ư.setVisible(false);} else if(y==2){_6����2���ѻ�����ư.setVisible(false);} else if(y==3){_6����3���ѻ�����ư.setVisible(false);} else if(y==4){_6����4���ѻ�����ư.setVisible(false);} else if(y==5){_6����5���ѻ�����ư.setVisible(false);}else if(y==6){_6����6���ѻ�����ư.setVisible(false);} else if(y==7){_6����7���ѻ�����ư.setVisible(false);} else if(y==8){_6����8���ѻ�����ư.setVisible(false);}
			} if(x==7) {if(y==0){_7����0���ѻ�����ư.setVisible(false);} else if(y==1){_7����1���ѻ�����ư.setVisible(false);} else if(y==2){_7����2���ѻ�����ư.setVisible(false);} else if(y==3){_7����3���ѻ�����ư.setVisible(false);} else if(y==4){_7����4���ѻ�����ư.setVisible(false);} else if(y==5){_7����5���ѻ�����ư.setVisible(false);}else if(y==6){_7����6���ѻ�����ư.setVisible(false);} else if(y==7){_7����7���ѻ�����ư.setVisible(false);} else if(y==8){_7����8���ѻ�����ư.setVisible(false);}
			} if(x==8) {if(y==0){_8����0���ѻ�����ư.setVisible(false);} else if(y==1){_8����1���ѻ�����ư.setVisible(false);} else if(y==2){_8����2���ѻ�����ư.setVisible(false);} else if(y==3){_8����3���ѻ�����ư.setVisible(false);} else if(y==4){_8����4���ѻ�����ư.setVisible(false);} else if(y==5){_8����5���ѻ�����ư.setVisible(false);}else if(y==6){_8����6���ѻ�����ư.setVisible(false);} else if(y==7){_8����7���ѻ�����ư.setVisible(false);} else if(y==8){_8����8���ѻ�����ư.setVisible(false);}
			    }}
		//�Ķ���
			  if(��==2){
			    if(x==0) {if(y==0){_0����0�Ķ���ư.setVisible(false);} else if(y==1){_0����1�Ķ���ư.setVisible(false);}  else if(y==2){_0����2�Ķ���ư.setVisible(false);}  else if(y==3){_0����3�Ķ���ư.setVisible(false);}  else if(y==4){_0����4�Ķ���ư.setVisible(false);}  else if(y==5){_0����5�Ķ���ư.setVisible(false);}  else if(y==6){_0����6�Ķ���ư.setVisible(false);}  else if(y==7){_0����7�Ķ���ư.setVisible(false);}  else if(y==8){_0����8�Ķ���ư.setVisible(false);}  
			  } if(x==1) {if(y==0){_1����0�Ķ���ư.setVisible(false);} else if(y==1){_1����1�Ķ���ư.setVisible(false);}  else if(y==2){_1����2�Ķ���ư.setVisible(false);}  else if(y==3){_1����3�Ķ���ư.setVisible(false);}  else if(y==4){_1����4�Ķ���ư.setVisible(false);}  else if(y==5){_1����5�Ķ���ư.setVisible(false);} else if(y==6){_1����6�Ķ���ư.setVisible(false);}  else if(y==7){_1����7�Ķ���ư.setVisible(false);}  else if(y==8){_1����8�Ķ���ư.setVisible(false);} 
		   	  } if(x==2) {if(y==0){_2����0�Ķ���ư.setVisible(false);} else if(y==1){_2����1�Ķ���ư.setVisible(false);}  else if(y==2){_2����2�Ķ���ư.setVisible(false);}  else if(y==3){_2����3�Ķ���ư.setVisible(false);}  else if(y==4){_2����4�Ķ���ư.setVisible(false);}  else if(y==5){_2����5�Ķ���ư.setVisible(false);} else if(y==6){_2����6�Ķ���ư.setVisible(false);}  else if(y==7){_2����7�Ķ���ư.setVisible(false);}  else if(y==8){_2����8�Ķ���ư.setVisible(false);} 
			  } if(x==3) {if(y==0){_3����0�Ķ���ư.setVisible(false);} else if(y==1){_3����1�Ķ���ư.setVisible(false);}  else if(y==2){_3����2�Ķ���ư.setVisible(false);}  else if(y==3){_3����3�Ķ���ư.setVisible(false);}  else if(y==4){_3����4�Ķ���ư.setVisible(false);}  else if(y==5){_3����5�Ķ���ư.setVisible(false);} else if(y==6){_3����6�Ķ���ư.setVisible(false);}  else if(y==7){_3����7�Ķ���ư.setVisible(false);}  else if(y==8){_3����8�Ķ���ư.setVisible(false);} 
			  } if(x==4) {if(y==0){_4����0�Ķ���ư.setVisible(false);} else if(y==1){_4����1�Ķ���ư.setVisible(false);}  else if(y==2){_4����2�Ķ���ư.setVisible(false);}  else if(y==3){_4����3�Ķ���ư.setVisible(false);}  else if(y==4){_4����4�Ķ���ư.setVisible(false);}  else if(y==5){_4����5�Ķ���ư.setVisible(false);} else if(y==6){_4����6�Ķ���ư.setVisible(false);}  else if(y==7){_4����7�Ķ���ư.setVisible(false);}  else if(y==8){_4����8�Ķ���ư.setVisible(false);} 
			  } if(x==5) {if(y==0){_5����0�Ķ���ư.setVisible(false);} else if(y==1){_5����1�Ķ���ư.setVisible(false);}  else if(y==2){_5����2�Ķ���ư.setVisible(false);}  else if(y==3){_5����3�Ķ���ư.setVisible(false);}  else if(y==4){_5����4�Ķ���ư.setVisible(false);}  else if(y==5){_5����5�Ķ���ư.setVisible(false);} else if(y==6){_5����6�Ķ���ư.setVisible(false);}  else if(y==7){_5����7�Ķ���ư.setVisible(false);}  else if(y==8){_5����8�Ķ���ư.setVisible(false);} 
			  } if(x==6) {if(y==0){_6����0�Ķ���ư.setVisible(false);} else if(y==1){_6����1�Ķ���ư.setVisible(false);}  else if(y==2){_6����2�Ķ���ư.setVisible(false);}  else if(y==3){_6����3�Ķ���ư.setVisible(false);}  else if(y==4){_6����4�Ķ���ư.setVisible(false);}  else if(y==5){_6����5�Ķ���ư.setVisible(false);} else if(y==6){_6����6�Ķ���ư.setVisible(false);}  else if(y==7){_6����7�Ķ���ư.setVisible(false);}  else if(y==8){_6����8�Ķ���ư.setVisible(false);} 
			  } if(x==7) {if(y==0){_7����0�Ķ���ư.setVisible(false);} else if(y==1){_7����1�Ķ���ư.setVisible(false);}  else if(y==2){_7����2�Ķ���ư.setVisible(false);}  else if(y==3){_7����3�Ķ���ư.setVisible(false);}  else if(y==4){_7����4�Ķ���ư.setVisible(false);}  else if(y==5){_7����5�Ķ���ư.setVisible(false);} else if(y==6){_7����6�Ķ���ư.setVisible(false);}  else if(y==7){_7����7�Ķ���ư.setVisible(false);}  else if(y==8){_7����8�Ķ���ư.setVisible(false);} 
			  } if(x==8) {if(y==0){_8����0�Ķ���ư.setVisible(false);} else if(y==1){_8����1�Ķ���ư.setVisible(false);}  else if(y==2){_8����2�Ķ���ư.setVisible(false);}  else if(y==3){_8����3�Ķ���ư.setVisible(false);}  else if(y==4){_8����4�Ķ���ư.setVisible(false);}  else if(y==5){_8����5�Ķ���ư.setVisible(false);} else if(y==6){_8����6�Ķ���ư.setVisible(false);}  else if(y==7){_8����7�Ķ���ư.setVisible(false);}  else if(y==8){_8����8�Ķ���ư.setVisible(false);} 
			     }}
			if(��==20){
			  if(x==0) {if(y==0){_0����0�ణ�����Ķ���ư.setVisible(false);} else if(y==1){_0����1�ణ�����Ķ���ư.setVisible(false);} else if(y==2){_0����2�ణ�����Ķ���ư.setVisible(false);} else if(y==3){_0����3�ణ�����Ķ���ư.setVisible(false);} else if(y==4){_0����4�ణ�����Ķ���ư.setVisible(false);} else if(y==5){_0����5�ణ�����Ķ���ư.setVisible(false);}else if(y==6){_0����6�ణ�����Ķ���ư.setVisible(false);} else if(y==7){_0����7�ణ�����Ķ���ư.setVisible(false);} else if(y==8){_0����8�ణ�����Ķ���ư.setVisible(false);}
			} if(x==1) {if(y==0){_1����0�ణ�����Ķ���ư.setVisible(false);} else if(y==1){_1����1�ణ�����Ķ���ư.setVisible(false);} else if(y==2){_1����2�ణ�����Ķ���ư.setVisible(false);} else if(y==3){_1����3�ణ�����Ķ���ư.setVisible(false);} else if(y==4){_1����4�ణ�����Ķ���ư.setVisible(false);} else if(y==5){_1����5�ణ�����Ķ���ư.setVisible(false);}else if(y==6){_1����6�ణ�����Ķ���ư.setVisible(false);} else if(y==7){_1����7�ణ�����Ķ���ư.setVisible(false);} else if(y==8){_1����8�ణ�����Ķ���ư.setVisible(false);}
			} if(x==2) {if(y==0){_2����0�ణ�����Ķ���ư.setVisible(false);} else if(y==1){_2����1�ణ�����Ķ���ư.setVisible(false);} else if(y==2){_2����2�ణ�����Ķ���ư.setVisible(false);} else if(y==3){_2����3�ణ�����Ķ���ư.setVisible(false);} else if(y==4){_2����4�ణ�����Ķ���ư.setVisible(false);} else if(y==5){_2����5�ణ�����Ķ���ư.setVisible(false);}else if(y==6){_2����6�ణ�����Ķ���ư.setVisible(false);} else if(y==7){_2����7�ణ�����Ķ���ư.setVisible(false);} else if(y==8){_2����8�ణ�����Ķ���ư.setVisible(false);}
			} if(x==3) {if(y==0){_3����0�ణ�����Ķ���ư.setVisible(false);} else if(y==1){_3����1�ణ�����Ķ���ư.setVisible(false);} else if(y==2){_3����2�ణ�����Ķ���ư.setVisible(false);} else if(y==3){_3����3�ణ�����Ķ���ư.setVisible(false);} else if(y==4){_3����4�ణ�����Ķ���ư.setVisible(false);} else if(y==5){_3����5�ణ�����Ķ���ư.setVisible(false);}else if(y==6){_3����6�ణ�����Ķ���ư.setVisible(false);} else if(y==7){_3����7�ణ�����Ķ���ư.setVisible(false);} else if(y==8){_3����8�ణ�����Ķ���ư.setVisible(false);}
			} if(x==4) {if(y==0){_4����0�ణ�����Ķ���ư.setVisible(false);} else if(y==1){_4����1�ణ�����Ķ���ư.setVisible(false);} else if(y==2){_4����2�ణ�����Ķ���ư.setVisible(false);} else if(y==3){_4����3�ణ�����Ķ���ư.setVisible(false);} else if(y==4){_4����4�ణ�����Ķ���ư.setVisible(false);} else if(y==5){_4����5�ణ�����Ķ���ư.setVisible(false);}else if(y==6){_4����6�ణ�����Ķ���ư.setVisible(false);} else if(y==7){_4����7�ణ�����Ķ���ư.setVisible(false);} else if(y==8){_4����8�ణ�����Ķ���ư.setVisible(false);}
			} if(x==5) {if(y==0){_5����0�ణ�����Ķ���ư.setVisible(false);} else if(y==1){_5����1�ణ�����Ķ���ư.setVisible(false);} else if(y==2){_5����2�ణ�����Ķ���ư.setVisible(false);} else if(y==3){_5����3�ణ�����Ķ���ư.setVisible(false);} else if(y==4){_5����4�ణ�����Ķ���ư.setVisible(false);} else if(y==5){_5����5�ణ�����Ķ���ư.setVisible(false);}else if(y==6){_5����6�ణ�����Ķ���ư.setVisible(false);} else if(y==7){_5����7�ణ�����Ķ���ư.setVisible(false);} else if(y==8){_5����8�ణ�����Ķ���ư.setVisible(false);}
			} if(x==6) {if(y==0){_6����0�ణ�����Ķ���ư.setVisible(false);} else if(y==1){_6����1�ణ�����Ķ���ư.setVisible(false);} else if(y==2){_6����2�ణ�����Ķ���ư.setVisible(false);} else if(y==3){_6����3�ణ�����Ķ���ư.setVisible(false);} else if(y==4){_6����4�ణ�����Ķ���ư.setVisible(false);} else if(y==5){_6����5�ణ�����Ķ���ư.setVisible(false);}else if(y==6){_6����6�ణ�����Ķ���ư.setVisible(false);} else if(y==7){_6����7�ణ�����Ķ���ư.setVisible(false);} else if(y==8){_6����8�ణ�����Ķ���ư.setVisible(false);}
			} if(x==7) {if(y==0){_7����0�ణ�����Ķ���ư.setVisible(false);} else if(y==1){_7����1�ణ�����Ķ���ư.setVisible(false);} else if(y==2){_7����2�ణ�����Ķ���ư.setVisible(false);} else if(y==3){_7����3�ణ�����Ķ���ư.setVisible(false);} else if(y==4){_7����4�ణ�����Ķ���ư.setVisible(false);} else if(y==5){_7����5�ణ�����Ķ���ư.setVisible(false);}else if(y==6){_7����6�ణ�����Ķ���ư.setVisible(false);} else if(y==7){_7����7�ణ�����Ķ���ư.setVisible(false);} else if(y==8){_7����8�ణ�����Ķ���ư.setVisible(false);}
			} if(x==8) {if(y==0){_8����0�ణ�����Ķ���ư.setVisible(false);} else if(y==1){_8����1�ణ�����Ķ���ư.setVisible(false);} else if(y==2){_8����2�ణ�����Ķ���ư.setVisible(false);} else if(y==3){_8����3�ణ�����Ķ���ư.setVisible(false);} else if(y==4){_8����4�ణ�����Ķ���ư.setVisible(false);} else if(y==5){_8����5�ణ�����Ķ���ư.setVisible(false);}else if(y==6){_8����6�ణ�����Ķ���ư.setVisible(false);} else if(y==7){_8����7�ణ�����Ķ���ư.setVisible(false);} else if(y==8){_8����8�ణ�����Ķ���ư.setVisible(false);}
			}}
			if(��==22){
			  if(x==0) {if(y==0){_0����0�����Ķ���ư.setVisible(false);} else if(y==1){_0����1�����Ķ���ư.setVisible(false);} else if(y==2){_0����2�����Ķ���ư.setVisible(false);} else if(y==3){_0����3�����Ķ���ư.setVisible(false);} else if(y==4){_0����4�����Ķ���ư.setVisible(false);} else if(y==5){_0����5�����Ķ���ư.setVisible(false);}else if(y==6){_0����6�����Ķ���ư.setVisible(false);} else if(y==7){_0����7�����Ķ���ư.setVisible(false);} else if(y==8){_0����8�����Ķ���ư.setVisible(false);}
			} if(x==1) {if(y==0){_1����0�����Ķ���ư.setVisible(false);} else if(y==1){_1����1�����Ķ���ư.setVisible(false);} else if(y==2){_1����2�����Ķ���ư.setVisible(false);} else if(y==3){_1����3�����Ķ���ư.setVisible(false);} else if(y==4){_1����4�����Ķ���ư.setVisible(false);} else if(y==5){_1����5�����Ķ���ư.setVisible(false);}else if(y==6){_1����6�����Ķ���ư.setVisible(false);} else if(y==7){_1����7�����Ķ���ư.setVisible(false);} else if(y==8){_1����8�����Ķ���ư.setVisible(false);}
			} if(x==2) {if(y==0){_2����0�����Ķ���ư.setVisible(false);} else if(y==1){_2����1�����Ķ���ư.setVisible(false);} else if(y==2){_2����2�����Ķ���ư.setVisible(false);} else if(y==3){_2����3�����Ķ���ư.setVisible(false);} else if(y==4){_2����4�����Ķ���ư.setVisible(false);} else if(y==5){_2����5�����Ķ���ư.setVisible(false);}else if(y==6){_2����6�����Ķ���ư.setVisible(false);} else if(y==7){_2����7�����Ķ���ư.setVisible(false);} else if(y==8){_2����8�����Ķ���ư.setVisible(false);}
			} if(x==3) {if(y==0){_3����0�����Ķ���ư.setVisible(false);} else if(y==1){_3����1�����Ķ���ư.setVisible(false);} else if(y==2){_3����2�����Ķ���ư.setVisible(false);} else if(y==3){_3����3�����Ķ���ư.setVisible(false);} else if(y==4){_3����4�����Ķ���ư.setVisible(false);} else if(y==5){_3����5�����Ķ���ư.setVisible(false);}else if(y==6){_3����6�����Ķ���ư.setVisible(false);} else if(y==7){_3����7�����Ķ���ư.setVisible(false);} else if(y==8){_3����8�����Ķ���ư.setVisible(false);}
			} if(x==4) {if(y==0){_4����0�����Ķ���ư.setVisible(false);} else if(y==1){_4����1�����Ķ���ư.setVisible(false);} else if(y==2){_4����2�����Ķ���ư.setVisible(false);} else if(y==3){_4����3�����Ķ���ư.setVisible(false);} else if(y==4){_4����4�����Ķ���ư.setVisible(false);} else if(y==5){_4����5�����Ķ���ư.setVisible(false);}else if(y==6){_4����6�����Ķ���ư.setVisible(false);} else if(y==7){_4����7�����Ķ���ư.setVisible(false);} else if(y==8){_4����8�����Ķ���ư.setVisible(false);}
			} if(x==5) {if(y==0){_5����0�����Ķ���ư.setVisible(false);} else if(y==1){_5����1�����Ķ���ư.setVisible(false);} else if(y==2){_5����2�����Ķ���ư.setVisible(false);} else if(y==3){_5����3�����Ķ���ư.setVisible(false);} else if(y==4){_5����4�����Ķ���ư.setVisible(false);} else if(y==5){_5����5�����Ķ���ư.setVisible(false);}else if(y==6){_5����6�����Ķ���ư.setVisible(false);} else if(y==7){_5����7�����Ķ���ư.setVisible(false);} else if(y==8){_5����8�����Ķ���ư.setVisible(false);}
			} if(x==6) {if(y==0){_6����0�����Ķ���ư.setVisible(false);} else if(y==1){_6����1�����Ķ���ư.setVisible(false);} else if(y==2){_6����2�����Ķ���ư.setVisible(false);} else if(y==3){_6����3�����Ķ���ư.setVisible(false);} else if(y==4){_6����4�����Ķ���ư.setVisible(false);} else if(y==5){_6����5�����Ķ���ư.setVisible(false);}else if(y==6){_6����6�����Ķ���ư.setVisible(false);} else if(y==7){_6����7�����Ķ���ư.setVisible(false);} else if(y==8){_6����8�����Ķ���ư.setVisible(false);}
			} if(x==7) {if(y==0){_7����0�����Ķ���ư.setVisible(false);} else if(y==1){_7����1�����Ķ���ư.setVisible(false);} else if(y==2){_7����2�����Ķ���ư.setVisible(false);} else if(y==3){_7����3�����Ķ���ư.setVisible(false);} else if(y==4){_7����4�����Ķ���ư.setVisible(false);} else if(y==5){_7����5�����Ķ���ư.setVisible(false);}else if(y==6){_7����6�����Ķ���ư.setVisible(false);} else if(y==7){_7����7�����Ķ���ư.setVisible(false);} else if(y==8){_7����8�����Ķ���ư.setVisible(false);}
			} if(x==8) {if(y==0){_8����0�����Ķ���ư.setVisible(false);} else if(y==1){_8����1�����Ķ���ư.setVisible(false);} else if(y==2){_8����2�����Ķ���ư.setVisible(false);} else if(y==3){_8����3�����Ķ���ư.setVisible(false);} else if(y==4){_8����4�����Ķ���ư.setVisible(false);} else if(y==5){_8����5�����Ķ���ư.setVisible(false);}else if(y==6){_8����6�����Ķ���ư.setVisible(false);} else if(y==7){_8����7�����Ķ���ư.setVisible(false);} else if(y==8){_8����8�����Ķ���ư.setVisible(false);}
			}}
		}
	void ��ưȰ��ȭ(int x, int y,int ��){//��� ���鿡 �����ǰ� ������Ŵ
		//������
		if(��==1){
	          if(x==0) {if(y==0){_0����0������ư.setVisible(true);}  else if(y==1){_0����1������ư.setVisible(true);}  else if(y==2){_0����2������ư.setVisible(true);}  else if(y==3){_0����3������ư.setVisible(true);}  else if(y==4){_0����4������ư.setVisible(true);}  else if(y==5){_0����5������ư.setVisible(true);} else if(y==6){_0����6������ư.setVisible(true);}  else if(y==7){_0����7������ư.setVisible(true);}  else if(y==8){_0����8������ư.setVisible(true);}  
	        } if(x==1) {if(y==0){_1����0������ư.setVisible(true);}  else if(y==1){_1����1������ư.setVisible(true);}  else if(y==2){_1����2������ư.setVisible(true);}  else if(y==3){_1����3������ư.setVisible(true);}  else if(y==4){_1����4������ư.setVisible(true);}  else if(y==5){_1����5������ư.setVisible(true);} else if(y==6){_1����6������ư.setVisible(true);}  else if(y==7){_1����7������ư.setVisible(true);}  else if(y==8){_1����8������ư.setVisible(true);} 
	        } if(x==2) {if(y==0){_2����0������ư.setVisible(true);}  else if(y==1){_2����1������ư.setVisible(true);}  else if(y==2){_2����2������ư.setVisible(true);}  else if(y==3){_2����3������ư.setVisible(true);}  else if(y==4){_2����4������ư.setVisible(true);}  else if(y==5){_2����5������ư.setVisible(true);} else if(y==6){_2����6������ư.setVisible(true);}  else if(y==7){_2����7������ư.setVisible(true);}  else if(y==8){_2����8������ư.setVisible(true);} 
	        } if(x==3) {if(y==0){_3����0������ư.setVisible(true);}  else if(y==1){_3����1������ư.setVisible(true);}  else if(y==2){_3����2������ư.setVisible(true);}  else if(y==3){_3����3������ư.setVisible(true);}  else if(y==4){_3����4������ư.setVisible(true);}  else if(y==5){_3����5������ư.setVisible(true);} else if(y==6){_3����6������ư.setVisible(true);}  else if(y==7){_3����7������ư.setVisible(true);}  else if(y==8){_3����8������ư.setVisible(true);} 
	        } if(x==4) {if(y==0){_4����0������ư.setVisible(true);}  else if(y==1){_4����1������ư.setVisible(true);}  else if(y==2){_4����2������ư.setVisible(true);}  else if(y==3){_4����3������ư.setVisible(true);}  else if(y==4){_4����4������ư.setVisible(true);}  else if(y==5){_4����5������ư.setVisible(true);} else if(y==6){_4����6������ư.setVisible(true);}  else if(y==7){_4����7������ư.setVisible(true);}  else if(y==8){_4����8������ư.setVisible(true);} 
	        } if(x==5) {if(y==0){_5����0������ư.setVisible(true);}  else if(y==1){_5����1������ư.setVisible(true);}  else if(y==2){_5����2������ư.setVisible(true);}  else if(y==3){_5����3������ư.setVisible(true);}  else if(y==4){_5����4������ư.setVisible(true);}  else if(y==5){_5����5������ư.setVisible(true);} else if(y==6){_5����6������ư.setVisible(true);}  else if(y==7){_5����7������ư.setVisible(true);}  else if(y==8){_5����8������ư.setVisible(true);} 
	        } if(x==6) {if(y==0){_6����0������ư.setVisible(true);}  else if(y==1){_6����1������ư.setVisible(true);}  else if(y==2){_6����2������ư.setVisible(true);}  else if(y==3){_6����3������ư.setVisible(true);}  else if(y==4){_6����4������ư.setVisible(true);}  else if(y==5){_6����5������ư.setVisible(true);} else if(y==6){_6����6������ư.setVisible(true);}  else if(y==7){_6����7������ư.setVisible(true);}  else if(y==8){_6����8������ư.setVisible(true);} 
	        } if(x==7) {if(y==0){_7����0������ư.setVisible(true);}  else if(y==1){_7����1������ư.setVisible(true);}  else if(y==2){_7����2������ư.setVisible(true);}  else if(y==3){_7����3������ư.setVisible(true);}  else if(y==4){_7����4������ư.setVisible(true);}  else if(y==5){_7����5������ư.setVisible(true);} else if(y==6){_7����6������ư.setVisible(true);}  else if(y==7){_7����7������ư.setVisible(true);}  else if(y==8){_7����8������ư.setVisible(true);} 
	        } if(x==8) {if(y==0){_8����0������ư.setVisible(true);}  else if(y==1){_8����1������ư.setVisible(true);}  else if(y==2){_8����2������ư.setVisible(true);}  else if(y==3){_8����3������ư.setVisible(true);}  else if(y==4){_8����4������ư.setVisible(true);}  else if(y==5){_8����5������ư.setVisible(true);} else if(y==6){_8����6������ư.setVisible(true);}  else if(y==7){_8����7������ư.setVisible(true);}  else if(y==8){_8����8������ư.setVisible(true);} 
	       }}
		if(��==10){
	      if(x==0) {if(y==0){_0����0�ణ���ѻ�����ư.setVisible(true);} else if(y==1){_0����1�ణ���ѻ�����ư.setVisible(true);} else if(y==2){_0����2�ణ���ѻ�����ư.setVisible(true);} else if(y==3){_0����3�ణ���ѻ�����ư.setVisible(true);} else if(y==4){_0����4�ణ���ѻ�����ư.setVisible(true);} else if(y==5){_0����5�ణ���ѻ�����ư.setVisible(true);}else if(y==6){_0����6�ణ���ѻ�����ư.setVisible(true);} else if(y==7){_0����7�ణ���ѻ�����ư.setVisible(true);} else if(y==8){_0����8�ణ���ѻ�����ư.setVisible(true);}
		} if(x==1) {if(y==0){_1����0�ణ���ѻ�����ư.setVisible(true);} else if(y==1){_1����1�ణ���ѻ�����ư.setVisible(true);} else if(y==2){_1����2�ణ���ѻ�����ư.setVisible(true);} else if(y==3){_1����3�ణ���ѻ�����ư.setVisible(true);} else if(y==4){_1����4�ణ���ѻ�����ư.setVisible(true);} else if(y==5){_1����5�ణ���ѻ�����ư.setVisible(true);}else if(y==6){_1����6�ణ���ѻ�����ư.setVisible(true);} else if(y==7){_1����7�ణ���ѻ�����ư.setVisible(true);} else if(y==8){_1����8�ణ���ѻ�����ư.setVisible(true);}
		} if(x==2) {if(y==0){_2����0�ణ���ѻ�����ư.setVisible(true);
		} else if(y==1){_2����1�ణ���ѻ�����ư.setVisible(true);} else if(y==2){_2����2�ణ���ѻ�����ư.setVisible(true);} else if(y==3){_2����3�ణ���ѻ�����ư.setVisible(true);} else if(y==4){_2����4�ణ���ѻ�����ư.setVisible(true);} else if(y==5){_2����5�ణ���ѻ�����ư.setVisible(true);}else if(y==6){_2����6�ణ���ѻ�����ư.setVisible(true);} else if(y==7){_2����7�ణ���ѻ�����ư.setVisible(true);} else if(y==8){_2����8�ణ���ѻ�����ư.setVisible(true);}
		} if(x==3) {if(y==0){_3����0�ణ���ѻ�����ư.setVisible(true);} else if(y==1){_3����1�ణ���ѻ�����ư.setVisible(true);} else if(y==2){_3����2�ణ���ѻ�����ư.setVisible(true);} else if(y==3){_3����3�ణ���ѻ�����ư.setVisible(true);} else if(y==4){_3����4�ణ���ѻ�����ư.setVisible(true);} else if(y==5){_3����5�ణ���ѻ�����ư.setVisible(true);}else if(y==6){_3����6�ణ���ѻ�����ư.setVisible(true);} else if(y==7){_3����7�ణ���ѻ�����ư.setVisible(true);} else if(y==8){_3����8�ణ���ѻ�����ư.setVisible(true);}
		} if(x==4) {if(y==0){_4����0�ణ���ѻ�����ư.setVisible(true);} else if(y==1){_4����1�ణ���ѻ�����ư.setVisible(true);} else if(y==2){_4����2�ణ���ѻ�����ư.setVisible(true);} else if(y==3){_4����3�ణ���ѻ�����ư.setVisible(true);} else if(y==4){_4����4�ణ���ѻ�����ư.setVisible(true);} else if(y==5){_4����5�ణ���ѻ�����ư.setVisible(true);}else if(y==6){_4����6�ణ���ѻ�����ư.setVisible(true);} else if(y==7){_4����7�ణ���ѻ�����ư.setVisible(true);} else if(y==8){_4����8�ణ���ѻ�����ư.setVisible(true);}
		} if(x==5) {if(y==0){_5����0�ణ���ѻ�����ư.setVisible(true);} else if(y==1){_5����1�ణ���ѻ�����ư.setVisible(true);} else if(y==2){_5����2�ణ���ѻ�����ư.setVisible(true);} else if(y==3){_5����3�ణ���ѻ�����ư.setVisible(true);} else if(y==4){_5����4�ణ���ѻ�����ư.setVisible(true);} else if(y==5){_5����5�ణ���ѻ�����ư.setVisible(true);}else if(y==6){_5����6�ణ���ѻ�����ư.setVisible(true);} else if(y==7){_5����7�ణ���ѻ�����ư.setVisible(true);} else if(y==8){_5����8�ణ���ѻ�����ư.setVisible(true);}
		} if(x==6) {if(y==0){_6����0�ణ���ѻ�����ư.setVisible(true);} else if(y==1){_6����1�ణ���ѻ�����ư.setVisible(true);} else if(y==2){_6����2�ణ���ѻ�����ư.setVisible(true);} else if(y==3){_6����3�ణ���ѻ�����ư.setVisible(true);} else if(y==4){_6����4�ణ���ѻ�����ư.setVisible(true);} else if(y==5){_6����5�ణ���ѻ�����ư.setVisible(true);}else if(y==6){_6����6�ణ���ѻ�����ư.setVisible(true);} else if(y==7){_6����7�ణ���ѻ�����ư.setVisible(true);} else if(y==8){_6����8�ణ���ѻ�����ư.setVisible(true);}
	  	} if(x==7) {if(y==0){_7����0�ణ���ѻ�����ư.setVisible(true);} else if(y==1){_7����1�ణ���ѻ�����ư.setVisible(true);} else if(y==2){_7����2�ణ���ѻ�����ư.setVisible(true);} else if(y==3){_7����3�ణ���ѻ�����ư.setVisible(true);} else if(y==4){_7����4�ణ���ѻ�����ư.setVisible(true);} else if(y==5){_7����5�ణ���ѻ�����ư.setVisible(true);}else if(y==6){_7����6�ణ���ѻ�����ư.setVisible(true);} else if(y==7){_7����7�ణ���ѻ�����ư.setVisible(true);} else if(y==8){_7����8�ణ���ѻ�����ư.setVisible(true);}
		} if(x==8) {if(y==0){_8����0�ణ���ѻ�����ư.setVisible(true);} else if(y==1){_8����1�ణ���ѻ�����ư.setVisible(true);} else if(y==2){_8����2�ణ���ѻ�����ư.setVisible(true);} else if(y==3){_8����3�ణ���ѻ�����ư.setVisible(true);} else if(y==4){_8����4�ణ���ѻ�����ư.setVisible(true);} else if(y==5){_8����5�ణ���ѻ�����ư.setVisible(true);}else if(y==6){_8����6�ణ���ѻ�����ư.setVisible(true);} else if(y==7){_8����7�ణ���ѻ�����ư.setVisible(true);} else if(y==8){_8����8�ణ���ѻ�����ư.setVisible(true);}
		    }}
		if(��==11){
		  if(x==0) {if(y==0){_0����0���ѻ�����ư.setVisible(true);} else if(y==1){_0����1���ѻ�����ư.setVisible(true);} else if(y==2){_0����2���ѻ�����ư.setVisible(true);} else if(y==3){_0����3���ѻ�����ư.setVisible(true);} else if(y==4){_0����4���ѻ�����ư.setVisible(true);} else if(y==5){_0����5���ѻ�����ư.setVisible(true);}else if(y==6){_0����6���ѻ�����ư.setVisible(true);} else if(y==7){_0����7���ѻ�����ư.setVisible(true);} else if(y==8){_0����8���ѻ�����ư.setVisible(true);}
		} if(x==1) {if(y==0){_1����0���ѻ�����ư.setVisible(true);} else if(y==1){_1����1���ѻ�����ư.setVisible(true);} else if(y==2){_1����2���ѻ�����ư.setVisible(true);} else if(y==3){_1����3���ѻ�����ư.setVisible(true);} else if(y==4){_1����4���ѻ�����ư.setVisible(true);} else if(y==5){_1����5���ѻ�����ư.setVisible(true);}else if(y==6){_1����6���ѻ�����ư.setVisible(true);} else if(y==7){_1����7���ѻ�����ư.setVisible(true);} else if(y==8){_1����8���ѻ�����ư.setVisible(true);}
		} if(x==2) {if(y==0){_2����0���ѻ�����ư.setVisible(true);} else if(y==1){_2����1���ѻ�����ư.setVisible(true);} else if(y==2){_2����2���ѻ�����ư.setVisible(true);} else if(y==3){_2����3���ѻ�����ư.setVisible(true);} else if(y==4){_2����4���ѻ�����ư.setVisible(true);} else if(y==5){_2����5���ѻ�����ư.setVisible(true);}else if(y==6){_2����6���ѻ�����ư.setVisible(true);} else if(y==7){_2����7���ѻ�����ư.setVisible(true);} else if(y==8){_2����8���ѻ�����ư.setVisible(true);}
		} if(x==3) {if(y==0){_3����0���ѻ�����ư.setVisible(true);} else if(y==1){_3����1���ѻ�����ư.setVisible(true);} else if(y==2){_3����2���ѻ�����ư.setVisible(true);} else if(y==3){_3����3���ѻ�����ư.setVisible(true);} else if(y==4){_3����4���ѻ�����ư.setVisible(true);} else if(y==5){_3����5���ѻ�����ư.setVisible(true);}else if(y==6){_3����6���ѻ�����ư.setVisible(true);} else if(y==7){_3����7���ѻ�����ư.setVisible(true);} else if(y==8){_3����8���ѻ�����ư.setVisible(true);}
		} if(x==4) {if(y==0){_4����0���ѻ�����ư.setVisible(true);} else if(y==1){_4����1���ѻ�����ư.setVisible(true);} else if(y==2){_4����2���ѻ�����ư.setVisible(true);} else if(y==3){_4����3���ѻ�����ư.setVisible(true);} else if(y==4){_4����4���ѻ�����ư.setVisible(true);} else if(y==5){_4����5���ѻ�����ư.setVisible(true);}else if(y==6){_4����6���ѻ�����ư.setVisible(true);} else if(y==7){_4����7���ѻ�����ư.setVisible(true);} else if(y==8){_4����8���ѻ�����ư.setVisible(true);}
		} if(x==5) {if(y==0){_5����0���ѻ�����ư.setVisible(true);} else if(y==1){_5����1���ѻ�����ư.setVisible(true);} else if(y==2){_5����2���ѻ�����ư.setVisible(true);} else if(y==3){_5����3���ѻ�����ư.setVisible(true);} else if(y==4){_5����4���ѻ�����ư.setVisible(true);} else if(y==5){_5����5���ѻ�����ư.setVisible(true);}else if(y==6){_5����6���ѻ�����ư.setVisible(true);} else if(y==7){_5����7���ѻ�����ư.setVisible(true);} else if(y==8){_5����8���ѻ�����ư.setVisible(true);}
		} if(x==6) {if(y==0){_6����0���ѻ�����ư.setVisible(true);} else if(y==1){_6����1���ѻ�����ư.setVisible(true);} else if(y==2){_6����2���ѻ�����ư.setVisible(true);} else if(y==3){_6����3���ѻ�����ư.setVisible(true);} else if(y==4){_6����4���ѻ�����ư.setVisible(true);} else if(y==5){_6����5���ѻ�����ư.setVisible(true);}else if(y==6){_6����6���ѻ�����ư.setVisible(true);} else if(y==7){_6����7���ѻ�����ư.setVisible(true);} else if(y==8){_6����8���ѻ�����ư.setVisible(true);}
		} if(x==7) {if(y==0){_7����0���ѻ�����ư.setVisible(true);} else if(y==1){_7����1���ѻ�����ư.setVisible(true);} else if(y==2){_7����2���ѻ�����ư.setVisible(true);} else if(y==3){_7����3���ѻ�����ư.setVisible(true);} else if(y==4){_7����4���ѻ�����ư.setVisible(true);} else if(y==5){_7����5���ѻ�����ư.setVisible(true);}else if(y==6){_7����6���ѻ�����ư.setVisible(true);} else if(y==7){_7����7���ѻ�����ư.setVisible(true);} else if(y==8){_7����8���ѻ�����ư.setVisible(true);}
		} if(x==8) {if(y==0){_8����0���ѻ�����ư.setVisible(true);} else if(y==1){_8����1���ѻ�����ư.setVisible(true);} else if(y==2){_8����2���ѻ�����ư.setVisible(true);} else if(y==3){_8����3���ѻ�����ư.setVisible(true);} else if(y==4){_8����4���ѻ�����ư.setVisible(true);} else if(y==5){_8����5���ѻ�����ư.setVisible(true);}else if(y==6){_8����6���ѻ�����ư.setVisible(true);} else if(y==7){_8����7���ѻ�����ư.setVisible(true);} else if(y==8){_8����8���ѻ�����ư.setVisible(true);}
		    }}
	//�Ķ���
		  if(��==2){
		    if(x==0) {if(y==0){_0����0�Ķ���ư.setVisible(true);} else if(y==1){_0����1�Ķ���ư.setVisible(true);}  else if(y==2){_0����2�Ķ���ư.setVisible(true);}  else if(y==3){_0����3�Ķ���ư.setVisible(true);}  else if(y==4){_0����4�Ķ���ư.setVisible(true);}  else if(y==5){_0����5�Ķ���ư.setVisible(true);}  else if(y==6){_0����6�Ķ���ư.setVisible(true);}  else if(y==7){_0����7�Ķ���ư.setVisible(true);}  else if(y==8){_0����8�Ķ���ư.setVisible(true);}  
		  } if(x==1) {if(y==0){_1����0�Ķ���ư.setVisible(true);} else if(y==1){_1����1�Ķ���ư.setVisible(true);}  else if(y==2){_1����2�Ķ���ư.setVisible(true);}  else if(y==3){_1����3�Ķ���ư.setVisible(true);}  else if(y==4){_1����4�Ķ���ư.setVisible(true);}  else if(y==5){_1����5�Ķ���ư.setVisible(true);} else if(y==6){_1����6�Ķ���ư.setVisible(true);}  else if(y==7){_1����7�Ķ���ư.setVisible(true);}  else if(y==8){_1����8�Ķ���ư.setVisible(true);} 
	   	  } if(x==2) {if(y==0){_2����0�Ķ���ư.setVisible(true);} else if(y==1){_2����1�Ķ���ư.setVisible(true);}  else if(y==2){_2����2�Ķ���ư.setVisible(true);}  else if(y==3){_2����3�Ķ���ư.setVisible(true);}  else if(y==4){_2����4�Ķ���ư.setVisible(true);}  else if(y==5){_2����5�Ķ���ư.setVisible(true);} else if(y==6){_2����6�Ķ���ư.setVisible(true);}  else if(y==7){_2����7�Ķ���ư.setVisible(true);}  else if(y==8){_2����8�Ķ���ư.setVisible(true);} 
		  } if(x==3) {if(y==0){_3����0�Ķ���ư.setVisible(true);} else if(y==1){_3����1�Ķ���ư.setVisible(true);}  else if(y==2){_3����2�Ķ���ư.setVisible(true);}  else if(y==3){_3����3�Ķ���ư.setVisible(true);}  else if(y==4){_3����4�Ķ���ư.setVisible(true);}  else if(y==5){_3����5�Ķ���ư.setVisible(true);} else if(y==6){_3����6�Ķ���ư.setVisible(true);}  else if(y==7){_3����7�Ķ���ư.setVisible(true);}  else if(y==8){_3����8�Ķ���ư.setVisible(true);} 
		  } if(x==4) {if(y==0){_4����0�Ķ���ư.setVisible(true);} else if(y==1){_4����1�Ķ���ư.setVisible(true);}  else if(y==2){_4����2�Ķ���ư.setVisible(true);}  else if(y==3){_4����3�Ķ���ư.setVisible(true);}  else if(y==4){_4����4�Ķ���ư.setVisible(true);}  else if(y==5){_4����5�Ķ���ư.setVisible(true);} else if(y==6){_4����6�Ķ���ư.setVisible(true);}  else if(y==7){_4����7�Ķ���ư.setVisible(true);}  else if(y==8){_4����8�Ķ���ư.setVisible(true);} 
		  } if(x==5) {if(y==0){_5����0�Ķ���ư.setVisible(true);} else if(y==1){_5����1�Ķ���ư.setVisible(true);}  else if(y==2){_5����2�Ķ���ư.setVisible(true);}  else if(y==3){_5����3�Ķ���ư.setVisible(true);}  else if(y==4){_5����4�Ķ���ư.setVisible(true);}  else if(y==5){_5����5�Ķ���ư.setVisible(true);} else if(y==6){_5����6�Ķ���ư.setVisible(true);}  else if(y==7){_5����7�Ķ���ư.setVisible(true);}  else if(y==8){_5����8�Ķ���ư.setVisible(true);} 
		  } if(x==6) {if(y==0){_6����0�Ķ���ư.setVisible(true);} else if(y==1){_6����1�Ķ���ư.setVisible(true);}  else if(y==2){_6����2�Ķ���ư.setVisible(true);}  else if(y==3){_6����3�Ķ���ư.setVisible(true);}  else if(y==4){_6����4�Ķ���ư.setVisible(true);}  else if(y==5){_6����5�Ķ���ư.setVisible(true);} else if(y==6){_6����6�Ķ���ư.setVisible(true);}  else if(y==7){_6����7�Ķ���ư.setVisible(true);}  else if(y==8){_6����8�Ķ���ư.setVisible(true);} 
		  } if(x==7) {if(y==0){_7����0�Ķ���ư.setVisible(true);} else if(y==1){_7����1�Ķ���ư.setVisible(true);}  else if(y==2){_7����2�Ķ���ư.setVisible(true);}  else if(y==3){_7����3�Ķ���ư.setVisible(true);}  else if(y==4){_7����4�Ķ���ư.setVisible(true);}  else if(y==5){_7����5�Ķ���ư.setVisible(true);} else if(y==6){_7����6�Ķ���ư.setVisible(true);}  else if(y==7){_7����7�Ķ���ư.setVisible(true);}  else if(y==8){_7����8�Ķ���ư.setVisible(true);} 
		  } if(x==8) {if(y==0){_8����0�Ķ���ư.setVisible(true);} else if(y==1){_8����1�Ķ���ư.setVisible(true);}  else if(y==2){_8����2�Ķ���ư.setVisible(true);}  else if(y==3){_8����3�Ķ���ư.setVisible(true);}  else if(y==4){_8����4�Ķ���ư.setVisible(true);}  else if(y==5){_8����5�Ķ���ư.setVisible(true);} else if(y==6){_8����6�Ķ���ư.setVisible(true);}  else if(y==7){_8����7�Ķ���ư.setVisible(true);}  else if(y==8){_8����8�Ķ���ư.setVisible(true);} 
		     }}
		if(��==20){
		  if(x==0) {if(y==0){_0����0�ణ�����Ķ���ư.setVisible(true);} else if(y==1){_0����1�ణ�����Ķ���ư.setVisible(true);} else if(y==2){_0����2�ణ�����Ķ���ư.setVisible(true);} else if(y==3){_0����3�ణ�����Ķ���ư.setVisible(true);} else if(y==4){_0����4�ణ�����Ķ���ư.setVisible(true);} else if(y==5){_0����5�ణ�����Ķ���ư.setVisible(true);}else if(y==6){_0����6�ణ�����Ķ���ư.setVisible(true);} else if(y==7){_0����7�ణ�����Ķ���ư.setVisible(true);} else if(y==8){_0����8�ణ�����Ķ���ư.setVisible(true);}
		} if(x==1) {if(y==0){_1����0�ణ�����Ķ���ư.setVisible(true);} else if(y==1){_1����1�ణ�����Ķ���ư.setVisible(true);} else if(y==2){_1����2�ణ�����Ķ���ư.setVisible(true);} else if(y==3){_1����3�ణ�����Ķ���ư.setVisible(true);} else if(y==4){_1����4�ణ�����Ķ���ư.setVisible(true);} else if(y==5){_1����5�ణ�����Ķ���ư.setVisible(true);}else if(y==6){_1����6�ణ�����Ķ���ư.setVisible(true);} else if(y==7){_1����7�ణ�����Ķ���ư.setVisible(true);} else if(y==8){_1����8�ణ�����Ķ���ư.setVisible(true);}
		} if(x==2) {if(y==0){_2����0�ణ�����Ķ���ư.setVisible(true);} else if(y==1){_2����1�ణ�����Ķ���ư.setVisible(true);} else if(y==2){_2����2�ణ�����Ķ���ư.setVisible(true);} else if(y==3){_2����3�ణ�����Ķ���ư.setVisible(true);} else if(y==4){_2����4�ణ�����Ķ���ư.setVisible(true);} else if(y==5){_2����5�ణ�����Ķ���ư.setVisible(true);}else if(y==6){_2����6�ణ�����Ķ���ư.setVisible(true);} else if(y==7){_2����7�ణ�����Ķ���ư.setVisible(true);} else if(y==8){_2����8�ణ�����Ķ���ư.setVisible(true);}
		} if(x==3) {if(y==0){_3����0�ణ�����Ķ���ư.setVisible(true);} else if(y==1){_3����1�ణ�����Ķ���ư.setVisible(true);} else if(y==2){_3����2�ణ�����Ķ���ư.setVisible(true);} else if(y==3){_3����3�ణ�����Ķ���ư.setVisible(true);} else if(y==4){_3����4�ణ�����Ķ���ư.setVisible(true);} else if(y==5){_3����5�ణ�����Ķ���ư.setVisible(true);}else if(y==6){_3����6�ణ�����Ķ���ư.setVisible(true);} else if(y==7){_3����7�ణ�����Ķ���ư.setVisible(true);} else if(y==8){_3����8�ణ�����Ķ���ư.setVisible(true);}
		} if(x==4) {if(y==0){_4����0�ణ�����Ķ���ư.setVisible(true);} else if(y==1){_4����1�ణ�����Ķ���ư.setVisible(true);} else if(y==2){_4����2�ణ�����Ķ���ư.setVisible(true);} else if(y==3){_4����3�ణ�����Ķ���ư.setVisible(true);} else if(y==4){_4����4�ణ�����Ķ���ư.setVisible(true);} else if(y==5){_4����5�ణ�����Ķ���ư.setVisible(true);}else if(y==6){_4����6�ణ�����Ķ���ư.setVisible(true);} else if(y==7){_4����7�ణ�����Ķ���ư.setVisible(true);} else if(y==8){_4����8�ణ�����Ķ���ư.setVisible(true);}
		} if(x==5) {if(y==0){_5����0�ణ�����Ķ���ư.setVisible(true);} else if(y==1){_5����1�ణ�����Ķ���ư.setVisible(true);} else if(y==2){_5����2�ణ�����Ķ���ư.setVisible(true);} else if(y==3){_5����3�ణ�����Ķ���ư.setVisible(true);} else if(y==4){_5����4�ణ�����Ķ���ư.setVisible(true);} else if(y==5){_5����5�ణ�����Ķ���ư.setVisible(true);}else if(y==6){_5����6�ణ�����Ķ���ư.setVisible(true);} else if(y==7){_5����7�ణ�����Ķ���ư.setVisible(true);} else if(y==8){_5����8�ణ�����Ķ���ư.setVisible(true);}
		} if(x==6) {if(y==0){_6����0�ణ�����Ķ���ư.setVisible(true);} else if(y==1){_6����1�ణ�����Ķ���ư.setVisible(true);} else if(y==2){_6����2�ణ�����Ķ���ư.setVisible(true);} else if(y==3){_6����3�ణ�����Ķ���ư.setVisible(true);} else if(y==4){_6����4�ణ�����Ķ���ư.setVisible(true);} else if(y==5){_6����5�ణ�����Ķ���ư.setVisible(true);}else if(y==6){_6����6�ణ�����Ķ���ư.setVisible(true);} else if(y==7){_6����7�ణ�����Ķ���ư.setVisible(true);} else if(y==8){_6����8�ణ�����Ķ���ư.setVisible(true);}
		} if(x==7) {if(y==0){_7����0�ణ�����Ķ���ư.setVisible(true);} else if(y==1){_7����1�ణ�����Ķ���ư.setVisible(true);} else if(y==2){_7����2�ణ�����Ķ���ư.setVisible(true);} else if(y==3){_7����3�ణ�����Ķ���ư.setVisible(true);} else if(y==4){_7����4�ణ�����Ķ���ư.setVisible(true);} else if(y==5){_7����5�ణ�����Ķ���ư.setVisible(true);}else if(y==6){_7����6�ణ�����Ķ���ư.setVisible(true);} else if(y==7){_7����7�ణ�����Ķ���ư.setVisible(true);} else if(y==8){_7����8�ణ�����Ķ���ư.setVisible(true);}
		} if(x==8) {if(y==0){_8����0�ణ�����Ķ���ư.setVisible(true);} else if(y==1){_8����1�ణ�����Ķ���ư.setVisible(true);} else if(y==2){_8����2�ణ�����Ķ���ư.setVisible(true);} else if(y==3){_8����3�ణ�����Ķ���ư.setVisible(true);} else if(y==4){_8����4�ణ�����Ķ���ư.setVisible(true);} else if(y==5){_8����5�ణ�����Ķ���ư.setVisible(true);}else if(y==6){_8����6�ణ�����Ķ���ư.setVisible(true);} else if(y==7){_8����7�ణ�����Ķ���ư.setVisible(true);} else if(y==8){_8����8�ణ�����Ķ���ư.setVisible(true);}
		}}
		if(��==22){
		  if(x==0) {if(y==0){_0����0�����Ķ���ư.setVisible(true);} else if(y==1){_0����1�����Ķ���ư.setVisible(true);} else if(y==2){_0����2�����Ķ���ư.setVisible(true);} else if(y==3){_0����3�����Ķ���ư.setVisible(true);} else if(y==4){_0����4�����Ķ���ư.setVisible(true);} else if(y==5){_0����5�����Ķ���ư.setVisible(true);}else if(y==6){_0����6�����Ķ���ư.setVisible(true);} else if(y==7){_0����7�����Ķ���ư.setVisible(true);} else if(y==8){_0����8�����Ķ���ư.setVisible(true);}
		} if(x==1) {if(y==0){_1����0�����Ķ���ư.setVisible(true);} else if(y==1){_1����1�����Ķ���ư.setVisible(true);} else if(y==2){_1����2�����Ķ���ư.setVisible(true);} else if(y==3){_1����3�����Ķ���ư.setVisible(true);} else if(y==4){_1����4�����Ķ���ư.setVisible(true);} else if(y==5){_1����5�����Ķ���ư.setVisible(true);}else if(y==6){_1����6�����Ķ���ư.setVisible(true);} else if(y==7){_1����7�����Ķ���ư.setVisible(true);} else if(y==8){_1����8�����Ķ���ư.setVisible(true);}
		} if(x==2) {if(y==0){_2����0�����Ķ���ư.setVisible(true);} else if(y==1){_2����1�����Ķ���ư.setVisible(true);} else if(y==2){_2����2�����Ķ���ư.setVisible(true);} else if(y==3){_2����3�����Ķ���ư.setVisible(true);} else if(y==4){_2����4�����Ķ���ư.setVisible(true);} else if(y==5){_2����5�����Ķ���ư.setVisible(true);}else if(y==6){_2����6�����Ķ���ư.setVisible(true);} else if(y==7){_2����7�����Ķ���ư.setVisible(true);} else if(y==8){_2����8�����Ķ���ư.setVisible(true);}
		} if(x==3) {if(y==0){_3����0�����Ķ���ư.setVisible(true);} else if(y==1){_3����1�����Ķ���ư.setVisible(true);} else if(y==2){_3����2�����Ķ���ư.setVisible(true);} else if(y==3){_3����3�����Ķ���ư.setVisible(true);} else if(y==4){_3����4�����Ķ���ư.setVisible(true);} else if(y==5){_3����5�����Ķ���ư.setVisible(true);}else if(y==6){_3����6�����Ķ���ư.setVisible(true);} else if(y==7){_3����7�����Ķ���ư.setVisible(true);} else if(y==8){_3����8�����Ķ���ư.setVisible(true);}
		} if(x==4) {if(y==0){_4����0�����Ķ���ư.setVisible(true);} else if(y==1){_4����1�����Ķ���ư.setVisible(true);} else if(y==2){_4����2�����Ķ���ư.setVisible(true);} else if(y==3){_4����3�����Ķ���ư.setVisible(true);} else if(y==4){_4����4�����Ķ���ư.setVisible(true);} else if(y==5){_4����5�����Ķ���ư.setVisible(true);}else if(y==6){_4����6�����Ķ���ư.setVisible(true);} else if(y==7){_4����7�����Ķ���ư.setVisible(true);} else if(y==8){_4����8�����Ķ���ư.setVisible(true);}
		} if(x==5) {if(y==0){_5����0�����Ķ���ư.setVisible(true);} else if(y==1){_5����1�����Ķ���ư.setVisible(true);} else if(y==2){_5����2�����Ķ���ư.setVisible(true);} else if(y==3){_5����3�����Ķ���ư.setVisible(true);} else if(y==4){_5����4�����Ķ���ư.setVisible(true);} else if(y==5){_5����5�����Ķ���ư.setVisible(true);}else if(y==6){_5����6�����Ķ���ư.setVisible(true);} else if(y==7){_5����7�����Ķ���ư.setVisible(true);} else if(y==8){_5����8�����Ķ���ư.setVisible(true);}
		} if(x==6) {if(y==0){_6����0�����Ķ���ư.setVisible(true);} else if(y==1){_6����1�����Ķ���ư.setVisible(true);} else if(y==2){_6����2�����Ķ���ư.setVisible(true);} else if(y==3){_6����3�����Ķ���ư.setVisible(true);} else if(y==4){_6����4�����Ķ���ư.setVisible(true);} else if(y==5){_6����5�����Ķ���ư.setVisible(true);}else if(y==6){_6����6�����Ķ���ư.setVisible(true);} else if(y==7){_6����7�����Ķ���ư.setVisible(true);} else if(y==8){_6����8�����Ķ���ư.setVisible(true);}
		} if(x==7) {if(y==0){_7����0�����Ķ���ư.setVisible(true);} else if(y==1){_7����1�����Ķ���ư.setVisible(true);} else if(y==2){_7����2�����Ķ���ư.setVisible(true);} else if(y==3){_7����3�����Ķ���ư.setVisible(true);} else if(y==4){_7����4�����Ķ���ư.setVisible(true);} else if(y==5){_7����5�����Ķ���ư.setVisible(true);}else if(y==6){_7����6�����Ķ���ư.setVisible(true);} else if(y==7){_7����7�����Ķ���ư.setVisible(true);} else if(y==8){_7����8�����Ķ���ư.setVisible(true);}
		} if(x==8) {if(y==0){_8����0�����Ķ���ư.setVisible(true);} else if(y==1){_8����1�����Ķ���ư.setVisible(true);} else if(y==2){_8����2�����Ķ���ư.setVisible(true);} else if(y==3){_8����3�����Ķ���ư.setVisible(true);} else if(y==4){_8����4�����Ķ���ư.setVisible(true);} else if(y==5){_8����5�����Ķ���ư.setVisible(true);}else if(y==6){_8����6�����Ķ���ư.setVisible(true);} else if(y==7){_8����7�����Ķ���ư.setVisible(true);} else if(y==8){_8����8�����Ķ���ư.setVisible(true);}
		}}
		}
	void ���ھ��(){
		���������ռ�=0;
		�Ķ������ռ�=0;
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				if(������[i][j]==1) ++���������ռ�;
				else if(������[i][j]==2) ++�Ķ������ռ�;
			}
		}
		
		if(��������==1){�Ķ�����.setVisible(true);��������.setVisible(false);}
		else if(��������!=1){�Ķ�����.setVisible(false);��������.setVisible(true); }
	System.out.println("������ : "+���������ռ�);
	System.out.println("�Ķ��� : "+�Ķ������ռ�);
	}
	void ��������(){
		if(���������ռ�==�Ķ������ռ�){���ºι�ư.setVisible(true);}//���º�
		else if(���������ռ�<�Ķ������ռ�){�Ķ����¸���ư.setVisible(true);}//�Ķ��¸�
		else if(���������ռ�>�Ķ������ռ�){�������¸���ư.setVisible(true);}//�����¸�
	}
	void ��Żó����(int x,int y,int i, int j,int ����){
		if(����==1){
			if(x%2==0){//���� ����
				if(!(x-1<0)){if(!(y+1>8)){if(x-1==i&& y ==j) ������[i][j]=1; if(x-1==i&&y+1==j) ������[i][j]=1;} else {if(x-1==i&& y ==j) ������[i][j]=1;}}
				if(!(y-1<0)){if(!(y+1>8)){if( x ==i&&y-1==j) ������[i][j]=1; if( x ==i&&y+1==j) ������[i][j]=1;} else {if( x ==i&&y-1==j) ������[i][j]=1;}} else {if( x ==i&&y+1==j) ������[i][j]=1;}
				if(!(x+1>8)){if(!(y+1>8)){if(x+1==i&& y ==j) ������[i][j]=1; if(x+1==i&&y+1==j) ������[i][j]=1;} else {if(x+1==i&& y ==j) ������[i][j]=1;}}}
	   else if(x%2!=0){//�Ʒ��� ����
				if(!(x-1<0)){if(!(y-1<0)){if(x-1==i&&y-1==j) ������[i][j]=1; if(x-1==i&& y ==j) ������[i][j]=1;} else {if(x-1==i&& y ==j) ������[i][j]=1;}}
				if(!(y-1<0)){if(!(y+1>8)){if( x ==i&&y-1==j) ������[i][j]=1; if( x ==i&&y+1==j) ������[i][j]=1;} else {if( x ==i&&y-1==j) ������[i][j]=1;}} else {if( x ==i&&y+1==j) ������[i][j]=1;}
				if(!(x+1>8)){if(!(y-1<0)){if(x+1==i&&y-1==j) ������[i][j]=1; if(x+1==i&& y ==j) ������[i][j]=1;} else {if(x+1==i&& y ==j) ������[i][j]=1;}}}
		}
		if(����!=1){
			if(x%2==0){
				if(!(x-1<0)){if(!(y+1>8)){if(x-1==i&& y ==j) ������[i][j]=2; if(x-1==i&&y+1==j) ������[i][j]=2;} else {if(x-1==i&& y ==j) ������[i][j]=2;}}
				if(!(y-1<0)){if(!(y+1>8)){if( x ==i&&y-1==j) ������[i][j]=2; if( x ==i&&y+1==j) ������[i][j]=2;} else {if( x ==i&&y-1==j) ������[i][j]=2;}} else {if( x ==i&&y+1==j) ������[i][j]=2;}
				if(!(x+1>8)){if(!(y+1>8)){if(x+1==i&& y ==j) ������[i][j]=2; if(x+1==i&&y+1==j) ������[i][j]=2;} else {if(x+1==i&& y ==j) ������[i][j]=2;}}}
	    else if(x%2!=0){ //-1 0
				if(!(x-1<0)){if(!(y-1<0)){if(x-1==i&&y-1==j) ������[i][j]=2; if(x-1==i&& y ==j) ������[i][j]=2;} else {if(x-1==i&& y ==j) ������[i][j]=2;}}
				if(!(y-1<0)){if(!(y+1>8)){if( x ==i&&y-1==j) ������[i][j]=2; if( x ==i&&y+1==j) ������[i][j]=2;} else {if( x ==i&&y-1==j) ������[i][j]=2;}} else {if( x ==i&&y+1==j) ������[i][j]=2;}
				if(!(x+1>8)){if(!(y-1<0)){if(x+1==i&&y-1==j) ������[i][j]=2; if(x+1==i&& y ==j) ������[i][j]=2;} else {if(x+1==i&& y ==j) ������[i][j]=2;}}}
		}
	}
	void ��Ż(int x,int y){
		for(int i=x-1;i<x+2;i++){
		if(i<0) {i=0;} else if(i>8) {break;}
		for(int j=y-1;j<y+2;j++){
		if(j<0) {j=0;} else if(j>8) {break;}
		if(������[i][j]==1||������[i][j]==2){
			��Żó����(x,y,i,j,��������);
			if(��������==1){if(������[i][j]==1){��ư��Ȱ��ȭ(i,j,2); ��ưȰ��ȭ(i,j,1);}}
			if(��������!=1){if(������[i][j]==2){��ư��Ȱ��ȭ(i,j,1); ��ưȰ��ȭ(i,j,2);}}
				}
			}
		}
	}
	void �˻�ó����(int x,int y,int i,int j,int ����){ //xy�� ������ǥ, ij�� Ž��
		//����-------------------------------------------------------------------------------------------------------------------------------
		if(����==1){
	if(x%2==0){
			if(!(x-1<0)){if(!(y+1>8)){if(x-1==i&& y ==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;} if(x-1==i&&y+1==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}} else {if(x-1==i&& y ==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}}}
			if(!(y-1<0)){if(!(y+1>8)){if( x ==i&&y-1==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;} if( x ==i&&y+1==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}} else {if( x ==i&&y-1==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}}} else {if( x ==i&&y+1==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}}
			if(!(x+1>8)){if(!(y+1>8)){if(x+1==i&& y ==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;} if(x+1==i&&y+1==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}} else {if(x+1==i&& y ==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}}}}
		if(x%2!=0){ //-1 0
			if(!(x-1<0)){if(!(y-1<0)){if(x-1==i&&y-1==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;} if(x-1==i&& y ==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}} else {if(x-1==i&& y ==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}}}
			if(!(y-1<0)){if(!(y+1>8)){if( x ==i&&y-1==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;} if( x ==i&&y+1==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}} else {if( x ==i&&y-1==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}}} else {if( x ==i&&y+1==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}}
			if(!(x+1>8)){if(!(y-1<0)){if(x+1==i&&y-1==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;} if(x+1==i&& y ==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}} else {if(x+1==i&& y ==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}}}	
		}
		if(x%2==0){
		if(!(x-2<0)){if(!(y-1<0)){if(!(y+1>8)){if(x-2==i&&y-1==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}if(x-2==i&& y ==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}if(x-2==i&&y+1==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}} else {if(x-2==i&&y-1==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}if(x-2==i&& y ==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}} } else {if(x-2==i&& y ==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;} if(x-2==i&&y+1==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}}}
		if(!(x-1<0)){if(!(y-1<0)){if(!(y+2>8)){if(x-1==i&&y-1==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}if(x-1==i&&y+2==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}} else {if(x-1==i&&y-1==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}}} else {if(x-1==i&&y+2==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}}}
		if(!(y-2<0)){if(!(y+2>8)){if( x ==i&&y-2==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}if( x ==i&&y+2==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}}else{if( x ==i&&y-2==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}}} else {if( x ==i&&y+2==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}}
		if(!(x+1>8)){if(!(y-1<0)){if(!(y+2>8)){if(x+1==i&&y-1==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}if(x+1==i&&y+2==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}} else {if(x+1==i&&y-1==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}}} else {if(x+1==i&&y+2==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}}}
		if(!(x+2>8)){if(!(y-1<0)){if(!(y+1>8)){if(x+2==i&&y-1==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}if(x+2==i&& y ==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}if(x+2==i&&y+1==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}} else {if(x+2==i&&y-1==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}if(x+2==i&& y ==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}} } else {if(x+2==i&& y ==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;} if(x+2==i&&y+1==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}}}
	}
	if(x%2!=0){
		if(!(x-2<0)){if(!(y-1<0)){if(!(y+1>8)){if(x-2==i&&y-1==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}if(x-2==i&& y ==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}if(x-2==i&&y+1==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}} else {if(x-2==i&&y-1==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}if(x-2==i&& y ==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}} } else {if(x-2==i&& y ==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;} if(x-2==i&&y+1==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}}}
		if(!(x-1<0)){if(!(y-2<0)){if(!(y+1>8)){if(x-1==i&&y+1==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}if(x-1==i&&y-2==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}} else {if(x-1==i&&y+1==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}}} else {if(x-1==i&&y-2==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}}}
		if(!(y-2<0)){if(!(y+2>8)){if( x ==i&&y-2==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}if( x ==i&&y+2==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}}else{if( x ==i&&y-2==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}}} else {if( x ==i&&y+2==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}}
		if(!(x+1>8)){if(!(y-2<0)){if(!(y+1>8)){if(x+1==i&&y+1==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}if(x+1==i&&y-2==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}} else {if(x+1==i&&y+1==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}}} else {if(x+1==i&&y-2==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}}}
		if(!(x+2>8)){if(!(y-1<0)){if(!(y+1>8)){if(x+2==i&&y-1==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}if(x+2==i&& y ==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}if(x+2==i&&y+1==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}} else {if(x+2==i&&y-1==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}if(x+2==i&& y ==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}} } else {if(x+2==i&& y ==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;} if(x+2==i&&y+1==j) if(!(����ī��Ʈ==18)){++����ī��Ʈ;}else{++�����������̴¸�;}}}
		}}
		else if(!(����==1)){
	if(x%2==0){
			if(!(x-1<0)){if(!(y+1>8)){if(x-1==i&& y ==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;} if(x-1==i&&y+1==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}} else {if(x-1==i&& y ==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}}}
			if(!(y-1<0)){if(!(y+1>8)){if( x ==i&&y-1==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;} if( x ==i&&y+1==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}} else {if( x ==i&&y-1==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}}} else {if( x ==i&&y+1==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}}
			if(!(x+1>8)){if(!(y+1>8)){if(x+1==i&& y ==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;} if(x+1==i&&y+1==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}} else {if(x+1==i&& y ==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}}}}
		if(x%2!=0){ //-1 0
			if(!(x-1<0)){if(!(y-1<0)){if(x-1==i&&y-1==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;} if(x-1==i&& y ==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}} else {if(x-1==i&& y ==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}}}
			if(!(y-1<0)){if(!(y+1>8)){if( x ==i&&y-1==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;} if( x ==i&&y+1==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}} else {if( x ==i&&y-1==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}}} else {if( x ==i&&y+1==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}}
			if(!(x+1>8)){if(!(y-1<0)){if(x+1==i&&y-1==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;} if(x+1==i&& y ==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}} else {if(x+1==i&& y ==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}}}	
		}
		if(x%2==0){
		if(!(x-2<0)){if(!(y-1<0)){if(!(y+1>8)){if(x-2==i&&y-1==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}if(x-2==i&& y ==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}if(x-2==i&&y+1==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}} else {if(x-2==i&&y-1==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}if(x-2==i&& y ==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}} } else {if(x-2==i&& y ==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;} if(x-2==i&&y+1==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}}}
		if(!(x-1<0)){if(!(y-1<0)){if(!(y+2>8)){if(x-1==i&&y-1==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}if(x-1==i&&y+2==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}} else {if(x-1==i&&y-1==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}}} else {if(x-1==i&&y+2==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}}}
		if(!(y-2<0)){if(!(y+2>8)){if( x ==i&&y-2==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}if( x ==i&&y+2==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}}else{if( x ==i&&y-2==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}}} else {if( x ==i&&y+2==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}}
		if(!(x+1>8)){if(!(y-1<0)){if(!(y+2>8)){if(x+1==i&&y-1==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}if(x+1==i&&y+2==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}} else {if(x+1==i&&y-1==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}}} else {if(x+1==i&&y+2==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}}}
		if(!(x+2>8)){if(!(y-1<0)){if(!(y+1>8)){if(x+2==i&&y-1==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}if(x+2==i&& y ==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}if(x+2==i&&y+1==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}} else {if(x+2==i&&y-1==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}if(x+2==i&& y ==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}} } else {if(x+2==i&& y ==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;} if(x+2==i&&y+1==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}}}
	}
	if(x%2!=0){
		if(!(x-2<0)){if(!(y-1<0)){if(!(y+1>8)){if(x-2==i&&y-1==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}if(x-2==i&& y ==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}if(x-2==i&&y+1==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}} else {if(x-2==i&&y-1==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}if(x-2==i&& y ==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}} } else {if(x-2==i&& y ==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;} if(x-2==i&&y+1==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}}}
		if(!(x-1<0)){if(!(y-2<0)){if(!(y+1>8)){if(x-1==i&&y+1==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}if(x-1==i&&y-2==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}} else {if(x-1==i&&y+1==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}}} else {if(x-1==i&&y-2==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}}}
		if(!(y-2<0)){if(!(y+2>8)){if( x ==i&&y-2==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}if( x ==i&&y+2==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}}else{if( x ==i&&y-2==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}}} else {if( x ==i&&y+2==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}}
		if(!(x+1>8)){if(!(y-2<0)){if(!(y+1>8)){if(x+1==i&&y+1==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}if(x+1==i&&y-2==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}} else {if(x+1==i&&y+1==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}}} else {if(x+1==i&&y-2==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}}}
		if(!(x+2>8)){if(!(y-1<0)){if(!(y+1>8)){if(x+2==i&&y-1==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}if(x+2==i&& y ==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}if(x+2==i&&y+1==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}} else {if(x+2==i&&y-1==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}if(x+2==i&& y ==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}} } else {if(x+2==i&& y ==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;} if(x+2==i&&y+1==j) if(!(�Ķ�ī��Ʈ==18)){++�Ķ�ī��Ʈ;}else{++�Ķ��������̴¸�;}}}
		}}
		  //  (����==1)  if(!(ī��Ʈ==18)){++ī��Ʈ;}else{++�������̴¸�;} (����==2)  if(!(ī��Ʈ==18)){++ī��Ʈ;}else{++�������̴¸�;}
		}
	void ��縻�˻�(){
		����ī��Ʈ=0;
	for(int x=0;x<9;x++){
	for(int y=0;y<9;y++){
	if(������[x][y]==0){break;}
	else {++����ī��Ʈ; if(����ī��Ʈ==81){��������();}}
		}}
	����ī��Ʈ=0;
	for(int x=0;x<9;x++){
	for(int y=0;y<9;y++){
	if(������[x][y]==1){break;}
	else {++����ī��Ʈ; if(����ī��Ʈ==81){��������();}}
		}}
	����ī��Ʈ=0;
	for(int x=0;x<9;x++){
	for(int y=0;y<9;y++){
	if(������[x][y]==2){break;}
	else {++����ī��Ʈ; if(����ī��Ʈ==81){��������();}}
		}}
	System.out.println(����ī��Ʈ);
	}
	void ����(int i,int j){
		if(��������==1) {��ư��Ȱ��ȭ(i,j,11); ������[i][j]=1; ��ư��Ȱ��ȭ(_x,_y,1); ������[_x][_y]=0; ��ưȰ��ȭ(i,j,1); ���̵���β�(); ��Ż(i,j); ���ھ��();_x=0; _y=0;	���ھ����();��縻�˻�();}
		if(��������!=1) {��ư��Ȱ��ȭ(i,j,22); ������[i][j]=2; ��ư��Ȱ��ȭ(_x,_y,2); ������[_x][_y]=0; ��ưȰ��ȭ(i,j,2); ���̵���β�(); ��Ż(i,j); ���ھ��();_x=0; _y=0;	���ھ����();��縻�˻�();}
	}
	void ����(int i, int j){
		if(��������==1){��ư��Ȱ��ȭ(i,j,10);������[i][j]=1; ��ưȰ��ȭ(i,j,1); ��Ż(i,j); ���̵���β�(); ���ھ��();_x=0; _y=0;	���ھ����();��縻�˻�();}
		if(��������!=1){��ư��Ȱ��ȭ(i,j,20);������[i][j]=2; ��ưȰ��ȭ(i,j,2); ��Ż(i,j); ���̵���β�(); ���ھ��();_x=0; _y=0;	���ھ����();��縻�˻�();}
	}
	void ����ġ(){// ó���� �� ��ġ��Ŵ
	if(�ʹ�ȣ==1){
		//������ 0����3, 4����8, 8����3
		_0����2������ư.setVisible(true);������[0][2]=1; _4����8������ư.setVisible(true);������[4][8]=1; _8����2������ư.setVisible(true);������[8][2]=1;
		//�Ķ��� 0����7, 4����0, 8����7
		_0����6�Ķ���ư.setVisible(true);������[0][6]=2; _4����0�Ķ���ư.setVisible(true);������[4][0]=2; _8����6�Ķ���ư.setVisible(true);������[8][6]=2;}
	else {
		_0����0������ư.setVisible(true); ������[0][0]=1; _8����8������ư.setVisible(true); ������[8][8]=1;
		_0����8�Ķ���ư.setVisible(true); ������[0][8]=2; _8����0�Ķ���ư.setVisible(true); ������[8][0]=2;
	}
	���ھ��();
	���ھ����();
	}
	public void ���ӽ���() {
		if(�ʹ�ȣ==1){ // ���ʸ�
			���.setIcon(new ImageIcon(G����.class.getResource("/images/ū������.png"))); // ���ʸ�
			���.setVisible(true);
			����ġ();
			��������=1;
		} else {
			���1.setIcon(new ImageIcon(G����.class.getResource("/images/ū������2.png"))); // �����ʸ�
			���1.setVisible(true);
			����ġ();
			��������=1;
		}
		�ʼ����̹���.setVisible(false);
		���ʸʹ�ư.setVisible(false);
		�����ʸʹ�ư.setVisible(false);
		�޴��ε��ư����ư.setVisible(false);
		���ư����ư.setVisible(true);
		setFocusable(true);
	}
	
	void ó����(int x,int y,int i,int j,int ����){ //xy�� ������ǥ, ij�� Ž��
		//����-------------------------------------------------------------------------------------------------------------------------------
		if(����==1){
			if(x%2==0){
				if(!(x-1<0)){if(!(y+1>8)){if(x-1==i&& y ==j) ������[i][j]=10; if(x-1==i&&y+1==j) ������[i][j]=10;} else {if(x-1==i&& y ==j) ������[i][j]=10;}}
				if(!(y-1<0)){if(!(y+1>8)){if( x ==i&&y-1==j) ������[i][j]=10; if( x ==i&&y+1==j) ������[i][j]=10;} else {if( x ==i&&y-1==j) ������[i][j]=10;}} else {if( x ==i&&y+1==j) ������[i][j]=10;}
				if(!(x+1>8)){if(!(y+1>8)){if(x+1==i&& y ==j) ������[i][j]=10; if(x+1==i&&y+1==j) ������[i][j]=10;} else {if(x+1==i&& y ==j) ������[i][j]=10;}}}
			if(x%2!=0){ //-1 0
				if(!(x-1<0)){if(!(y-1<0)){if(x-1==i&&y-1==j) ������[i][j]=10; if(x-1==i&& y ==j) ������[i][j]=10;} else {if(x-1==i&& y ==j) ������[i][j]=10;}}
				if(!(y-1<0)){if(!(y+1>8)){if( x ==i&&y-1==j) ������[i][j]=10; if( x ==i&&y+1==j) ������[i][j]=10;} else {if( x ==i&&y-1==j) ������[i][j]=10;}} else {if( x ==i&&y+1==j) ������[i][j]=10;}
				if(!(x+1>8)){if(!(y-1<0)){if(x+1==i&&y-1==j) ������[i][j]=10; if(x+1==i&& y ==j) ������[i][j]=10;} else {if(x+1==i&& y ==j) ������[i][j]=10;}}	
			}
			}
		if(����!=1){
			if(x%2==0){
				if(!(x-1<0)){if(!(y+1>8)){if(x-1==i&& y ==j) ������[i][j]=20; if(x-1==i&&y+1==j) ������[i][j]=20;} else {if(x-1==i&& y ==j) ������[i][j]=20;}}
				if(!(y-1<0)){if(!(y+1>8)){if( x ==i&&y-1==j) ������[i][j]=20; if( x ==i&&y+1==j) ������[i][j]=20;} else {if( x ==i&&y-1==j) ������[i][j]=20;}} else {if( x ==i&&y+1==j) ������[i][j]=20;}
				if(!(x+1>8)){if(!(y+1>8)){if(x+1==i&& y ==j) ������[i][j]=20; if(x+1==i&&y+1==j) ������[i][j]=20;} else {if(x+1==i&& y ==j) ������[i][j]=20;}}}
			if(x%2!=0){ //-1 0
				if(!(x-1<0)){if(!(y-1<0)){if(x-1==i&&y-1==j) ������[i][j]=20; if(x-1==i&& y ==j) ������[i][j]=20;} else {if(x-1==i&& y ==j) ������[i][j]=20;}}
				if(!(y-1<0)){if(!(y+1>8)){if( x ==i&&y-1==j) ������[i][j]=20; if( x ==i&&y+1==j) ������[i][j]=20;} else {if( x ==i&&y-1==j) ������[i][j]=20;}} else {if( x ==i&&y+1==j) ������[i][j]=20;}
				if(!(x+1>8)){if(!(y-1<0)){if(x+1==i&&y-1==j) ������[i][j]=20; if(x+1==i&& y ==j) ������[i][j]=20;} else {if(x+1==i&& y ==j) ������[i][j]=20;}}	
			}
			}
		  //  (����==1)  ������[i][j]=10; (����==2)  ������[i][j]=20;
		//����-------------------------------------------------------------------------------------------------------------------------------
		if(����==1){
			if(x%2==0){
			if(!(x-2<0)){if(!(y-1<0)){if(!(y+1>8)){if(x-2==i&&y-1==j) ������[i][j]=11;if(x-2==i&& y ==j) ������[i][j]=11;if(x-2==i&&y+1==j) ������[i][j]=11;} else {if(x-2==i&&y-1==j) ������[i][j]=11;if(x-2==i&& y ==j) ������[i][j]=11;} } else {if(x-2==i&& y ==j) ������[i][j]=11; if(x-2==i&&y+1==j) ������[i][j]=11;}}
			if(!(x-1<0)){if(!(y-1<0)){if(!(y+2>8)){if(x-1==i&&y-1==j) ������[i][j]=11;if(x-1==i&&y+2==j) ������[i][j]=11;} else {if(x-1==i&&y-1==j) ������[i][j]=11;}} else {if(x-1==i&&y+2==j) ������[i][j]=11;}}
			if(!(y-2<0)){if(!(y+2>8)){if( x ==i&&y-2==j) ������[i][j]=11;if( x ==i&&y+2==j) ������[i][j]=11;}else{if( x ==i&&y-2==j) ������[i][j]=11;}} else {if( x ==i&&y+2==j) ������[i][j]=11;}
			if(!(x+1>8)){if(!(y-1<0)){if(!(y+2>8)){if(x+1==i&&y-1==j) ������[i][j]=11;if(x+1==i&&y+2==j) ������[i][j]=11;} else {if(x+1==i&&y-1==j) ������[i][j]=11;}} else {if(x+1==i&&y+2==j) ������[i][j]=11;}}
			if(!(x+2>8)){if(!(y-1<0)){if(!(y+1>8)){if(x+2==i&&y-1==j) ������[i][j]=11;if(x+2==i&& y ==j) ������[i][j]=11;if(x+2==i&&y+1==j) ������[i][j]=11;} else {if(x+2==i&&y-1==j) ������[i][j]=11;if(x+2==i&& y ==j) ������[i][j]=11;} } else {if(x+2==i&& y ==j) ������[i][j]=11; if(x+2==i&&y+1==j) ������[i][j]=11;}}
		}
		if(x%2!=0){
			if(!(x-2<0)){if(!(y-1<0)){if(!(y+1>8)){if(x-2==i&&y-1==j) ������[i][j]=11;if(x-2==i&& y ==j) ������[i][j]=11;if(x-2==i&&y+1==j) ������[i][j]=11;} else {if(x-2==i&&y-1==j) ������[i][j]=11;if(x-2==i&& y ==j) ������[i][j]=11;} } else {if(x-2==i&& y ==j) ������[i][j]=11; if(x-2==i&&y+1==j) ������[i][j]=11;}}
			if(!(x-1<0)){if(!(y-2<0)){if(!(y+1>8)){if(x-1==i&&y+1==j) ������[i][j]=11;if(x-1==i&&y-2==j) ������[i][j]=11;} else {if(x-1==i&&y+1==j) ������[i][j]=11;}} else {if(x-1==i&&y-2==j) ������[i][j]=11;}}
			if(!(y-2<0)){if(!(y+2>8)){if( x ==i&&y-2==j) ������[i][j]=11;if( x ==i&&y+2==j) ������[i][j]=11;}else{if( x ==i&&y-2==j) ������[i][j]=11;}} else {if( x ==i&&y+2==j) ������[i][j]=11;}
			if(!(x+1>8)){if(!(y-2<0)){if(!(y+1>8)){if(x+1==i&&y+1==j) ������[i][j]=11;if(x+1==i&&y-2==j) ������[i][j]=11;} else {if(x+1==i&&y+1==j) ������[i][j]=11;}} else {if(x+1==i&&y-2==j) ������[i][j]=11;}}
			if(!(x+2>8)){if(!(y-1<0)){if(!(y+1>8)){if(x+2==i&&y-1==j) ������[i][j]=11;if(x+2==i&& y ==j) ������[i][j]=11;if(x+2==i&&y+1==j) ������[i][j]=11;} else {if(x+2==i&&y-1==j) ������[i][j]=11;if(x+2==i&& y ==j) ������[i][j]=11;} } else {if(x+2==i&& y ==j) ������[i][j]=11; if(x+2==i&&y+1==j) ������[i][j]=11;}}
			}
		}
		if(����!=1){
			if(x%2==0){
			if(!(x-2<0)){if(!(y-1<0)){if(!(y+1>8)){if(x-2==i&&y-1==j) ������[i][j]=22;if(x-2==i&& y ==j) ������[i][j]=22;if(x-2==i&&y+1==j) ������[i][j]=22;} else {if(x-2==i&&y-1==j) ������[i][j]=22;if(x-2==i&& y ==j) ������[i][j]=22;} } else {if(x-2==i&& y ==j) ������[i][j]=22; if(x-2==i&&y+1==j) ������[i][j]=22;}}
			if(!(x-1<0)){if(!(y-1<0)){if(!(y+2>8)){if(x-1==i&&y-1==j) ������[i][j]=22;if(x-1==i&&y+2==j) ������[i][j]=22;} else {if(x-1==i&&y-1==j) ������[i][j]=22;}} else {if(x-1==i&&y+2==j) ������[i][j]=22;}}
			if(!(y-2<0)){if(!(y+2>8)){if( x ==i&&y-2==j) ������[i][j]=22;if( x ==i&&y+2==j) ������[i][j]=22;}else{if( x ==i&&y-2==j) ������[i][j]=22;}} else {if( x ==i&&y+2==j) ������[i][j]=22;}
			if(!(x+1>8)){if(!(y-1<0)){if(!(y+2>8)){if(x+1==i&&y-1==j) ������[i][j]=22;if(x+1==i&&y+2==j) ������[i][j]=22;} else {if(x+1==i&&y-1==j) ������[i][j]=22;}} else {if(x+1==i&&y+2==j) ������[i][j]=22;}}
			if(!(x+2>8)){if(!(y-1<0)){if(!(y+1>8)){if(x+2==i&&y-1==j) ������[i][j]=22;if(x+2==i&& y ==j) ������[i][j]=22;if(x+2==i&&y+1==j) ������[i][j]=22;} else {if(x+2==i&&y-1==j) ������[i][j]=22;if(x+2==i&& y ==j) ������[i][j]=22;} } else {if(x+2==i&& y ==j) ������[i][j]=22; if(x+2==i&&y+1==j) ������[i][j]=22;}}
		}
		if(x%2!=0){
			if(!(x-2<0)){if(!(y-1<0)){if(!(y+1>8)){if(x-2==i&&y-1==j) ������[i][j]=22;if(x-2==i&& y ==j) ������[i][j]=22;if(x-2==i&&y+1==j) ������[i][j]=22;} else {if(x-2==i&&y-1==j) ������[i][j]=22;if(x-2==i&& y ==j) ������[i][j]=22;} } else {if(x-2==i&& y ==j) ������[i][j]=22; if(x-2==i&&y+1==j) ������[i][j]=22;}}
			if(!(x-1<0)){if(!(y-2<0)){if(!(y+1>8)){if(x-1==i&&y+1==j) ������[i][j]=22;if(x-1==i&&y-2==j) ������[i][j]=22;} else {if(x-1==i&&y+1==j) ������[i][j]=22;}} else {if(x-1==i&&y-2==j) ������[i][j]=22;}}
			if(!(y-2<0)){if(!(y+2>8)){if( x ==i&&y-2==j) ������[i][j]=22;if( x ==i&&y+2==j) ������[i][j]=22;}else{if( x ==i&&y-2==j) ������[i][j]=22;}} else {if( x ==i&&y+2==j) ������[i][j]=22;}
			if(!(x+1>8)){if(!(y-2<0)){if(!(y+1>8)){if(x+1==i&&y+1==j) ������[i][j]=22;if(x+1==i&&y-2==j) ������[i][j]=22;} else {if(x+1==i&&y+1==j) ������[i][j]=22;}} else {if(x+1==i&&y-2==j) ������[i][j]=22;}}
			if(!(x+2>8)){if(!(y-1<0)){if(!(y+1>8)){if(x+2==i&&y-1==j) ������[i][j]=22;if(x+2==i&& y ==j) ������[i][j]=22;if(x+2==i&&y+1==j) ������[i][j]=22;} else {if(x+2==i&&y-1==j) ������[i][j]=22;if(x+2==i&& y ==j) ������[i][j]=22;} } else {if(x+2==i&& y ==j) ������[i][j]=22; if(x+2==i&&y+1==j) ������[i][j]=22;}}
			}}
		  //  (����==1)  ������[i][j]=11; (����==2)  ������[i][j]=22;
		}
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		void Ŭ��(int x,int y){//Ŭ���� ��ǥ�� G���̿��� ����
		              ���̵���β�();
				_x = x; _y = y;
				for(int i=x-2;i<x+3;i++){
				if(i<0) {i=0;} else if(i>8) {break;}
				for(int j=y-2;j<y+3;j++){
				if(j<0) {j=0;} else if(j>8) {break;}
				if(������[i][j]==0&&!(������[i][j]==7)){
					ó����(x,y,i,j,��������);  ��ưȰ��ȭ(i,j,������[i][j]);
				}
				}}}
}
