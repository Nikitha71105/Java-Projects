import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PaintApp extends JFrame {

    private int x1, y1, x2, y2;
    private Color currentColor = Color.BLACK;
    private JPanel drawPanel;

    public PaintApp() {
        setTitle("Simple Paint Application");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Drawing Panel
        drawPanel = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
            }
        };

        drawPanel.setBackground(Color.WHITE);

        // Mouse Events
        drawPanel.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                x1 = e.getX();
                y1 = e.getY();
            }
        });

        drawPanel.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                x2 = e.getX();
                y2 = e.getY();

                Graphics g = drawPanel.getGraphics();
                g.setColor(currentColor);
                g.drawLine(x1, y1, x2, y2);

                x1 = x2;
                y1 = y2;
            }
        });

        // Buttons
        JButton redBtn = new JButton("Red");
        JButton blueBtn = new JButton("Blue");
        JButton blackBtn = new JButton("Black");
        JButton clearBtn = new JButton("Clear");

        redBtn.addActionListener(e -> currentColor = Color.RED);
        blueBtn.addActionListener(e -> currentColor = Color.BLUE);
        blackBtn.addActionListener(e -> currentColor = Color.BLACK);

        clearBtn.addActionListener(e -> {
            drawPanel.repaint();
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(redBtn);
        buttonPanel.add(blueBtn);
        buttonPanel.add(blackBtn);
        buttonPanel.add(clearBtn);

        add(buttonPanel, BorderLayout.NORTH);
        add(drawPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new PaintApp();
    }
}