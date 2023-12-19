package practicalWork4;

import javax.swing.*;
import java.awt.*;

public class FootballScore extends JFrame {
    int scoreMilan = 0, scoreMadrid = 0;


    JButton buttonMilan = new JButton("AC Milan"),
            buttonMadrid = new JButton("Real Madrid"),
            buttonReset = new JButton("Reset");
    JLabel result = new JLabel("Result: " + scoreMilan + " X " + scoreMadrid),
            lastScorer = new JLabel("Last Scorer: N/A");
    Label winner = new Label("Winner: DRAW");

    public FootballScore(){
        setLayout(null);
        buttonMilan.setBounds(100, 100, 100, 20);
        buttonMadrid.setBounds(300, 100, 100, 20);
        buttonReset.setBounds(200, 255, 100, 20);
        result.setBounds(200, 50, 100, 20);
        winner.setBounds(200, 150, 150, 20);
        lastScorer.setBounds(200, 200, 200, 20);

        buttonMilan.addActionListener(e -> {
            scoreMilan ++;
            result.setText("Result: " + scoreMilan + " X " + scoreMadrid);

            if (scoreMadrid < scoreMilan)
                winner.setText("Winner: AC Milan");
            else if (scoreMadrid == scoreMilan)
                winner.setText("Winner: DRAW");

            lastScorer.setText("Last Scorer: AC Milan");
        });

        buttonMadrid.addActionListener(e -> {
            scoreMadrid ++;
            result.setText("Result: " + scoreMilan + " X " + scoreMadrid);

            if (scoreMadrid > scoreMilan)
                winner.setText("Winner: Rear Madrid");
            else if (scoreMadrid == scoreMilan)
                winner.setText("Winner: DRAW");

            lastScorer.setText("Last Scorer: Rear Madrid");
        });

        buttonReset.addActionListener(e -> {
            scoreMilan = 0;
            scoreMadrid = 0;
            result.setText("Result: " + scoreMilan + " X " + scoreMadrid);
            winner.setText("Winner: DRAW");
            lastScorer.setText("Last Scorer: N/A");
        });

        add(buttonReset);
        add(lastScorer);
        add(winner);
        add(result);
        add(buttonMadrid);
        add(buttonMilan);
        setSize(500, 300);

    }

    public static void main(String[] args) {

        new FootballScore().setVisible(true);
    }
}
