import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cricketScoreBoard {

    private JFrame frame;
    private JPanel mainPanel, buttonPanel;
    private JLabel sectionOne,live,live2,teamDes,team1,team2,displayitem1, displayitem2, figure1, gaw, numberLabel, numberLabel2;
    private JLabel team1Label, team2Label, team1ScoreLabel, team2ScoreLabel, oversLabel, wicketsLabel,wicketlabel,overlabel ;
    private JButton incrementTeam1Button, decrementTeam1Button,incrementTeam2Button, decrementTeam2Button ;
    private JButton sixTeam1Button, fourTeam1Button, sixTeam2Button, fourTeam2Button;
    private JButton incrementOversButton, decrementOversButton, incrementWicketsButton, decrementWicketsButton;
    private JLabel sponsorLogoLabel;
    private int scoreTeam1 = 0;
    private int scoreTeam2 = 0;
    private int overs = 0;
    private int wickets = 0;



    public cricketScoreBoard() {
        initialize();
    }

    private void initialize(){
        frame = new JFrame();
        frame.setTitle("CPL 2024 Scoreboard");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(1100,600);
        frame.getContentPane().setBackground(new Color(204, 204, 204));
        frame.setResizable(false);
        frame.setLayout(null);

        mainPanel = new JPanel();
        mainPanel.setBackground(Color.white);
        mainPanel.setBounds(0,0,1100,450);
        mainPanel.setLayout(null);
        frame.add(mainPanel);

        //This is the heading an image will be inserted later
        sectionOne = new JLabel("CARIBBEAN PREMIER LEAGUE CRICKET CPL T20");
        sectionOne.setForeground(Color.black);
        sectionOne.setBounds(380, 0, 400,40);
        sectionOne.setFont(new Font("Sans-serif", Font.BOLD, 16));
        mainPanel.add(sectionOne);

        live = new JLabel("LIVE");
        live.setForeground(Color.red);
        live.setFont(new Font("Sans-serif", Font.BOLD, 12));
        live.setBounds(30,30,50,40);
        mainPanel.add(live);

        live2 = new JLabel("May 2024 Guyana Amazon Warriors tour of West Indies");
        live2.setFont(new Font("Sans-serif", Font.BOLD, 11));
        live2.setBounds(30,45,300,40);
        mainPanel.add(live2);

        teamDes = new JLabel("Teams");
        teamDes.setBounds(930,45,100,40);
        mainPanel.add(teamDes);

        team1 = new JLabel("Guyana Amazon Warriors");
        team1.setBounds(890,75,150,20);
        mainPanel.add(team1);

        team2 = new JLabel("Trinabago Knight riders");
        team2.setBounds(890,95,150,20);
        mainPanel.add(team2);


        displayitem1 = new JLabel("GUYANA AMAZON WARRIORS (GAW)");
        displayitem1.setBounds(220,150,300,40);
        displayitem1.setFont(new Font("Sans-serif", Font.BOLD, 16));
        mainPanel.add(displayitem1);
        displayitem2 = new JLabel("TRINABAGO KNIGHT RIDERS (TKR)");
        displayitem2.setBounds(640,150,300,40);
        displayitem2.setFont(new Font("Sans-serif", Font.BOLD, 16));
        mainPanel.add(displayitem2);

        team1ScoreLabel = new JLabel(String.valueOf(scoreTeam1));
        team1ScoreLabel.setFont(new Font("Sans-serif", Font.BOLD, 26));
        team1ScoreLabel.setBounds(350,180,50,40);
        mainPanel.add(team1ScoreLabel);

        team2ScoreLabel = new JLabel(String.valueOf(scoreTeam1));
        team2ScoreLabel.setFont(new Font("Sans-serif", Font.BOLD, 26));
        team2ScoreLabel.setBounds(740,180,50,40);
        mainPanel.add(team2ScoreLabel);






        buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.WHITE);
        buttonPanel.setBounds(0,460,1100,300);
        buttonPanel.setLayout(null);
        frame.add(buttonPanel);

        
        gaw = new JLabel("BATTER NUMBER 1");
        gaw.setBounds(100,0,150,50);
        gaw.setFont(new Font("Sans-serif", Font.BOLD, 11));
        buttonPanel.add(gaw);


        incrementTeam1Button = new JButton("+");
        incrementTeam1Button.setBounds(50,38,45,35);
        incrementTeam1Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                scoreTeam1++;
                team1ScoreLabel.setText(String.valueOf(scoreTeam1));
                //flashSponsorLogo();
            }
        });

        buttonPanel.add(incrementTeam1Button);

        decrementTeam1Button = new JButton("-");
        decrementTeam1Button.setBounds(100,38,45,35);
        decrementTeam1Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (scoreTeam1 > 0){
                scoreTeam1--;
                team1ScoreLabel.setText(String.valueOf(scoreTeam1));
                //flashSponsorLogo();
                }
            }
        });

        buttonPanel.add(decrementTeam1Button);


        sixTeam1Button = new JButton("6");
        sixTeam1Button.setBounds(170, 38, 45, 35); 
        sixTeam1Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                scoreTeam1 += 6;
                team1ScoreLabel.setText(String.valueOf(scoreTeam1));
                //flashSponsorLogo();
            }
        });
        buttonPanel.add(sixTeam1Button);


        fourTeam1Button = new JButton("4");
        fourTeam1Button.setBounds(220, 38, 45, 35);  
        fourTeam1Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                scoreTeam1 += 4;
                team1ScoreLabel.setText(String.valueOf(scoreTeam1));
                //flashSponsorLogo();
            }
        });
        buttonPanel.add(fourTeam1Button);


        gaw = new JLabel("BATTER NUMBER 2");
        gaw.setBounds(420,0,150,50);
        gaw.setFont(new Font("Sans-serif", Font.BOLD, 11));
        buttonPanel.add(gaw);


        incrementTeam2Button = new JButton("+");
        incrementTeam2Button.setBounds(350, 38, 45, 35);
        incrementTeam2Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                scoreTeam2++;
                team2ScoreLabel.setText(String.valueOf(scoreTeam2));
                //flashSponsorLogo();
            }
        });
        buttonPanel.add(incrementTeam2Button);


        decrementTeam2Button = new JButton("-");
        decrementTeam2Button.setBounds(400, 38, 45, 35);
        decrementTeam2Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (scoreTeam2 > 0) {
                    scoreTeam2--;
                    team2ScoreLabel.setText(String.valueOf(scoreTeam2));
                }
            }
        });
        buttonPanel.add(decrementTeam2Button);


       


        sixTeam2Button = new JButton("6");
        sixTeam2Button.setBounds(475, 38, 45, 35);
        sixTeam2Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                scoreTeam2 += 6;
                team2ScoreLabel.setText(String.valueOf(scoreTeam2));
                //flashSponsorLogo();
            }
        });
        buttonPanel.add(sixTeam2Button);


        fourTeam2Button = new JButton("4");
        fourTeam2Button.setBounds(525, 38, 45, 35);
        fourTeam2Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                scoreTeam2 += 4;
                team2ScoreLabel.setText(String.valueOf(scoreTeam2));
                //flashSponsorLogo();
            }
        });
        buttonPanel.add(fourTeam2Button);



        oversLabel = new JLabel("Overs");
        oversLabel.setFont(new Font("Sans-serif", Font.BOLD, 17));
        oversLabel.setBounds(443, 260,50,40);
        numberLabel= new JLabel("" + overs);
        numberLabel.setBounds(460,288,100,30);
        numberLabel.setFont(new Font("Sans-serif", Font.BOLD, 17));
        mainPanel.add(numberLabel);
        mainPanel.add(oversLabel);


        wicketsLabel = new JLabel("Wickets");
        wicketsLabel.setFont(new Font("Sans-serif", Font.BOLD, 16));
        wicketsLabel.setBounds(610, 260,60,40);
        numberLabel2 = new JLabel("" + wickets);
        numberLabel2.setBounds(630, 288,60,30);
        numberLabel2.setFont(new Font("Sans-serif", Font.BOLD, 17));
        mainPanel.add(wicketsLabel);
        mainPanel.add(numberLabel2);






        incrementOversButton = new JButton("+");
        incrementOversButton.setBounds(800, 38, 45, 35);
        incrementOversButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                overs++;
                numberLabel.setText(String.valueOf(overs));
                //flashSponsorLogo();
            }
        });
        buttonPanel.add(incrementOversButton);

    
        incrementWicketsButton = new JButton("+");
        incrementWicketsButton.setBounds(900, 38, 45, 35);
        incrementWicketsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                wickets++;
                numberLabel2.setText(String.valueOf(wickets));
                //flashSponsorLogo();
            }
        });
        buttonPanel.add(incrementWicketsButton);

        wicketlabel = new JLabel("Wicket");
        wicketlabel.setBounds(900,0,100,50);
        buttonPanel.add(wicketlabel);

        overlabel = new JLabel("Over");
        overlabel.setBounds(800,0,100,50);
        buttonPanel.add(overlabel);

        

       // figure1 = new JLabel("100");
       // figure1.setBounds(390, 180,50,40);
        //mainPanel.add(figure1);

        //figure1 = new JLabel("100");
        //figure1.setBounds(690, 180,50,40);
        //mainPanel.add(figure1);

        //figure1 = new JLabel("Total");
        //figure1.setBounds(550, 180,50,40);
        //mainPanel.add(figure1);

        //figure1 = new JLabel("5");
        //figure1.setBounds(460, 240,50,40);
        //mainPanel.add(figure1);

        //figure1 = new JLabel("7");
        //figure1.setBounds(630, 240,50,40);
        //mainPanel.add(figure1);

        //figure1 = new JLabel("OVER");
        //figure1.setBounds(443, 260,50,40);
        //mainPanel.add(figure1);

        //figure1 = new JLabel("WICKETS");
        //figure1.setBounds(610, 260,60,40);
        //mainPanel.add(figure1);

        //figure1 = new JLabel("10");
        //figure1.setBounds(350, 310,50,40);
        //mainPanel.add(figure1);

        //figure1 = new JLabel("7");
        //figure1.setBounds(720, 310,50,40);
        //mainPanel.add(figure1);

        //figure1 = new JLabel("LASTMAN");
        //figure1.setBounds(335, 325,60,40);
        //mainPanel.add(figure1);

        //figure1 = new JLabel("OVERS");
        //figure1.setBounds(695, 327,50,40);
        //mainPanel.add(figure1);

        frame.setVisible(true);
    }
}
