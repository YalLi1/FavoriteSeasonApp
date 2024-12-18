import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FavoriteSeasonApp extends JFrame {

    private JLabel resultLabel;
    private JRadioButton springRadioButton;
    private JRadioButton summerRadioButton;
    private JRadioButton autumnRadioButton;
    private JRadioButton winterRadioButton;
    private JButton answerButton;

    public FavoriteSeasonApp() {
        // Настройка фрейма
        setTitle("Favorite Season App");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Создание панели для размещения компонентов
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Создание JRadioButton для выбора времени года
        springRadioButton = new JRadioButton("Весна");
        summerRadioButton = new JRadioButton("Лето");
        autumnRadioButton = new JRadioButton("Осень");
        winterRadioButton = new JRadioButton("Зима");

        // Объединение радио-кнопок в одну группу
        ButtonGroup seasonGroup = new ButtonGroup();
        seasonGroup.add(springRadioButton);
        seasonGroup.add(summerRadioButton);
        seasonGroup.add(autumnRadioButton);
        seasonGroup.add(winterRadioButton);

        // Создание кнопки "Ответить"
        answerButton = new JButton("Ответить");
        answerButton.setMaximumSize(new Dimension(100, 30));
        answerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedSeason = "";
                if (springRadioButton.isSelected()) {
                    selectedSeason = "Весна";
                } else if (summerRadioButton.isSelected()) {
                    selectedSeason = "Лето";
                } else if (autumnRadioButton.isSelected()) {
                    selectedSeason = "Осень";
                } else if (winterRadioButton.isSelected()) {
                    selectedSeason = "Зима";
                }
                resultLabel.setText("Ответ: " + selectedSeason);
            }
        });

        // Создание метки для отображения ответа
        resultLabel = new JLabel("Ответ: ", SwingConstants.CENTER);

        // Добавление компонентов к панели
        panel.add(new JLabel("Выберите ваше любимое время года:", SwingConstants.CENTER));
        panel.add(Box.createVerticalStrut(10));
        panel.add(springRadioButton);
        panel.add(summerRadioButton);
        panel.add(autumnRadioButton);
        panel.add(winterRadioButton);
        panel.add(Box.createVerticalStrut(10));
        panel.add(answerButton);
        panel.add(Box.createVerticalStrut(10));
        panel.add(resultLabel);

        // Добавление панели к фрейму
        add(panel, BorderLayout.CENTER);

        setVisible(true);
    }
}
