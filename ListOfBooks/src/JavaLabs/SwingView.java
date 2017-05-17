package JavaLabs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SwingView implements View {

    JFrame jFrame;

    JPanel panel1;
    JPanel panel2;
    JPanel panel3;

    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel label4;
    JLabel label5;
    JLabel label6;
    JLabel label7;
    JLabel label8;
    JLabel label9;
    JLabel label10;

    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;

    JTextField textField1;
    JTextField textField2;
    JTextField textField3;
    JTextField textField4;
    JTextField textField5;
    JTextField textField6;
    JTextField textField7;
    JTextField textField8;
    JTextField textField9;
    JTextField textField10;

    /**
     * Constructor that build our window form
     * @param width width of form
     * @param height height of form
     */
    public SwingView(int width, int height) {
        jFrame = new JFrame();
        jFrame.setSize(width, height);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



        BorderLayout layout = new BorderLayout();
        jFrame.setLayout(layout);

        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();

        //CENTER
        GridLayout centerP = new GridLayout(8, 1);
        panel1.setLayout(centerP);
        label1 = new JLabel(ISBN_BOOK);
        label2 = new JLabel(BOOK_NAME);
        label3 = new JLabel(AUTHOR_SURNAME);
        label4 = new JLabel(AUTHOR_NAME);
        label5 = new JLabel(AUTHOR_LASTNAME);
        label6 = new JLabel(PUBLISHING_HOUSE);
        label7 = new JLabel(YEAR_PUBLISHING);
        label8 = new JLabel(PRICE);
        textField1 = new JTextField(EMPTY_FIELD);
        textField2 = new JTextField(EMPTY_FIELD);
        textField3 = new JTextField(EMPTY_FIELD);
        textField4 = new JTextField(EMPTY_FIELD);
        textField5 = new JTextField(EMPTY_FIELD);
        textField6 = new JTextField(EMPTY_FIELD);
        textField7 = new JTextField(EMPTY_FIELD);
        textField8 = new JTextField(EMPTY_FIELD);
        panel1.add(label1);
        panel1.add(textField1);
        panel1.add(label2);
        panel1.add(textField2);
        panel1.add(label3);
        panel1.add(textField3);
        panel1.add(label4);
        panel1.add(textField5);
        panel1.add(label6);
        panel1.add(textField6);
        panel1.add(label7);
        panel1.add(textField7);
        panel1.add(label8);
        panel1.add(textField8);
        jFrame.add(panel1, BorderLayout.CENTER);

        //EAST
        GridLayout centerE = new GridLayout(4, 1);
        panel2.setLayout(centerE);
        button1 = new JButton(FIRST_NAME_BUTTON);
        button2 = new JButton(SECOND_NAME_BUTTON);
        button3 = new JButton(THIRD_NAME_BUTTON);
        textField9 = new JTextField(EMPTY_FIELD);
        panel2.add(button1);
        panel2.add(textField9);
        panel2.add(button2);
        panel2.add(button3);
        jFrame.add(panel2, BorderLayout.EAST);

        //SOUTH
        GridLayout centerS = new GridLayout(3, 1);
        panel3.setLayout(centerS);
        label9 = new JLabel(ISBN_BOOK_DELETE);
        textField10 = new JTextField(EMPTY_FIELD);
        button4 = new JButton(LAST_NAME_BUTTON);
        panel3.add(label9);
        panel3.add(textField10);
        panel3.add(button4);
        jFrame.add(panel3,BorderLayout.SOUTH);
    }

    /**
     * Method to set action on first button
     * @param controller controller
     */
    public void clickButton1(Controller controller) {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.showFirstArticle();
            }
        });
    }

    /**
     * Method to set action on second button
     * @param controller controller
     */
    public void clickButton2(Controller controller) {
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.nextArticle();
            }
        });
    }

    /**
     * Method to set action on third button
     * @param controller controller
     */
    public void clickButton3(Controller controller) {
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {controller.prevArticle();}
        });
    }

    /**
     * Method to set action on the last action
     * @param controller controller
     */

    public void clickButton4(Controller controller) {
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.deleteBook();
                JOptionPane.showMessageDialog(jFrame, "Книга удалена.");
            }

        });
    }

    public void setBook(String article) {textField1.setText(article);}
    public void setNameBook(String name) {
        textField2.setText(name);
    }
    public void setAuthorSurname(String name) {
        textField3.setText(name);
    }
    public void setAuthorName(String name) {
        textField4.setText(name);
    }
    public void setAuthorLastname(String name) {textField5.setText(name);}
    public void setPublishingHouse(String name) {textField6.setText(name);}
    public void setYearPublishing(String name) {textField7.setText(name);}
    public void setCost(String cost) {
        textField8.setText(cost);
    }

    public void setCurr(String curr) {
        textField9.setText(curr);
    }

    public void showView() {
        jFrame.setVisible(true);
    }

    public String getISBN() {
        return textField10.getText();
    }

    public void showInputError(String message) {
        JOptionPane.showMessageDialog(new JDialog(), INPUT_ERROR,message, JOptionPane.WARNING_MESSAGE);
    }
}






