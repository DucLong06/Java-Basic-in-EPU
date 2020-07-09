package com.dat.qlcd.gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.dat.qlcd.logic.CD;

public class MainPanel extends JPanel implements ActionListener {
	private static final String BT_THEM = "BT_THEM";
	private static final String BT_CLEAR = "BT_CLEAR";
	private static final String BT_LUU = "BT_LUU";
	private static final String BT_XOA = "BT_XOA";
	private static final String BT_SUA = "BT_SUA";
	private static final String BT_TIM = "BT_TIM";
	private JLabel lbTitle, lbMaSo, lbTuaDe, lbCaSi, lbSoBH, lbGiaThanh;
	private JTextField tfMaSo, tfTuaDe, tfCaSi, tfSoBH, tfGiaThanh;
	private JButton btThem, btClear, btLuu, btXoa, btSua, btTim;
	private List<CD> listCD;

	private JTable tbTable;

	public MainPanel() {
		init();
		addComps();
		addEvents();
		listCD = new ArrayList<CD>();
	}

	private void init() {
		setLayout(null);

	}

	private void addComps() {
		Font f = new Font("Arial", Font.BOLD, 20);
		Font fSmall = new Font("Arial", Font.ITALIC, 15);

		lbTitle = createLabel("THÔNG TIN CD", f, 10, 10);
		add(lbTitle);
		lbTitle.setLocation(GUI.WFRAME / 2 - lbTitle.getWidth() / 2, lbTitle.getY());
		lbMaSo = createLabel("Mã số : ", fSmall, 20, lbTitle.getY() + lbTitle.getHeight() + 10);
		add(lbMaSo);
		lbTuaDe = createLabel("Tựa đề : ", fSmall, 20, lbMaSo.getY() + lbMaSo.getHeight() + 10);
		add(lbTuaDe);
		lbCaSi = createLabel("Ca sĩ: ", fSmall, 20, lbTuaDe.getY() + lbTuaDe.getHeight() + 10);
		add(lbCaSi);
		lbSoBH = createLabel("Số bài hát : ", fSmall, 20, lbCaSi.getY() + lbCaSi.getHeight() + 10);
		add(lbSoBH);
		lbGiaThanh = createLabel("Giá thành : ", fSmall, 20, lbSoBH.getY() + lbSoBH.getHeight() + 10);
		add(lbGiaThanh);

		tfMaSo = createTextField(fSmall, lbMaSo.getX() + lbMaSo.getWidth() + 50, lbMaSo.getY(), 700);
		add(tfMaSo);
		tfTuaDe = createTextField(fSmall, tfMaSo.getX(), lbTuaDe.getY(), 700);
		add(tfTuaDe);
		tfCaSi = createTextField(fSmall, tfMaSo.getX(), lbCaSi.getY(), 700);
		add(tfCaSi);
		tfSoBH = createTextField(fSmall, tfMaSo.getX(), lbSoBH.getY(), 700);
		add(tfSoBH);
		tfGiaThanh = createTextField(fSmall, tfMaSo.getX(), lbGiaThanh.getY(), 700);
		add(tfGiaThanh);

		btThem = createButton(BT_THEM, "Thêm", f, 200, tfGiaThanh.getY() + tfGiaThanh.getHeight() + 10);
		add(btThem);
		btClear = createButton(BT_CLEAR, "Clear", f, btThem.getX() + btThem.getWidth() + 10, btThem.getY());
		add(btClear);
		btLuu = createButton(BT_LUU, "Lưu", f, btClear.getX() + btClear.getWidth() + 10, btThem.getY());
		add(btLuu);
		btXoa = createButton(BT_XOA, "Xoá", f, btLuu.getX() + btLuu.getWidth() + 10, btThem.getY());
		add(btXoa);
		btSua = createButton(BT_SUA, "Sửa", f, btXoa.getX() + btXoa.getWidth() + 10, btThem.getY());
		add(btSua);
		btTim = createButton(BT_TIM, "Tìm", f, btSua.getX() + btSua.getWidth() + 10, btThem.getY());
		add(btTim);

		tbTable = new JTable();
		tbTable.getTableHeader().setForeground(Color.RED);
		tbTable.setCellSelectionEnabled(true);
		JScrollPane scrollPane = new JScrollPane(tbTable);
		scrollPane.setSize(900, 400);
		scrollPane.setLocation(lbCaSi.getX(), btClear.getY() + btClear.getHeight() + 50);
		initModel();
		add(scrollPane);

	}

	private void initModel() {

		DefaultTableModel defaultTableModel = new DefaultTableModel() {
			@Override
			public int getColumnCount() {
				return 1;
			}

			@Override
			public int getRowCount() {
				try {
					return listCD.size();
				} catch (NullPointerException e) {
					return 0;
				}

			}

			@Override
			public String getColumnName(int column) {
				return "Danh sách CD";
			}

			@Override
			public Object getValueAt(int row, int column) {
				return listCD.get(row).toString();
			}

		};
		tbTable.setModel(defaultTableModel);
	}

	private JButton createButton(String name, String text, Font f, int x, int y) {
		JButton bt = new JButton(text);
		FontMetrics fontMetrics = getFontMetrics(f);
		int wText = bt.getInsets().left * 2 + fontMetrics.stringWidth(bt.getText()) + 10;
		int hText = fontMetrics.getHeight() + bt.getInsets().top * 2 + 10;
		bt.setName(name);
		bt.setLocation(x, y);
		bt.setSize(wText, hText);
		bt.addActionListener(this);
		return bt;
	}

	private JTextField createTextField(Font f, int x, int y, int w) {
		JTextField tf = new JTextField();
		tf.setFont(f);
		FontMetrics fontMetrics = getFontMetrics(tf.getFont());
		int hTfA = tf.getInsets().top * 2 + fontMetrics.getHeight();
		tf.setLocation(x, y);
		tf.setSize(w, hTfA);
		return tf;
	}

	private JLabel createLabel(String text, Font f, int x, int y) {
		JLabel lbTemp = new JLabel(text);
		FontMetrics fontMetrics = getFontMetrics(f);
		int wText = fontMetrics.stringWidth(lbTemp.getText()) + 10;
		int hText = fontMetrics.getHeight() + 10;
		lbTemp.setFont(f);
		lbTemp.setLocation(x, y);
		lbTemp.setSize(wText, hText);
		return lbTemp;
	}

	private void addEvents() {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Component c = (Component) e.getSource();
		String name = c.getName();
		doC(name);
	}

	private void doC(String name) {
		switch (name) {
		case BT_THEM:
			CD cd = CD.tao(tfMaSo.getText(), tfTuaDe.getText(), tfCaSi.getText(), tfSoBH.getText(),
					tfGiaThanh.getText());
			if (cd == null) {
				JOptionPane.showMessageDialog(this, "Lỗi !!!!!!!!!");
				return;
			}
			if (listCD.indexOf(cd) >= 0) {
				JOptionPane.showMessageDialog(this, "Đã tồn tại mã này trong danh sách");
				return;
			}
			listCD.add(cd);
			break;
		case BT_CLEAR:
			tfCaSi.setText("");
			tfGiaThanh.setText("");
			tfMaSo.setText("");
			tfSoBH.setText("");
			tfTuaDe.setText("");
			break;
		case BT_XOA:
			int[] row = tbTable.getSelectedRows();
			if (row.length > 0) {
				if (JOptionPane.showConfirmDialog(this, "Xác nhận ?") == 0) {
					for (int i = row.length - 1; i >= 0; i--) {
						listCD.remove(row[i]);
					}
				}
			}

			break;
		case BT_SUA:
			int row1 = tbTable.getSelectedRow();
			CD cd2 = listCD.get(row1);
			tfCaSi.setText(cd2.getCaSi());
			tfGiaThanh.setText(cd2.getGiaThanh());
			tfMaSo.setText(cd2.getMa());
			tfSoBH.setText(cd2.getSoBH());
			tfTuaDe.setText(cd2.getTuaDe());
			break;
		default:

			break;
		}
		((DefaultTableModel) tbTable.getModel()).fireTableDataChanged();
	}
}
