package edu.niu.cs.mikerizza.chicagobulls;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Player extends Activity
{



    private TextView playerTitleTV;
    //private Button backBtn;
    private TextView playerDesc;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        //connect
       playerTitleTV = (TextView)findViewById(R.id.playerTitleTextView);
       //backBtn = (Button)findViewById(R.id.backButton);//connect back button
       playerDesc = (TextView)findViewById(R.id.playerDescTextView);

        setPlayer();


    }//end of onCreate




    public void setPlayer()
    {
        Bundle extras = getIntent().getExtras();
        if (extras != null)
        {
            String getName = (String) extras.get("playerName"); //save playerName string into getName
            playerTitleTV.setText(getName); //set player Title to getName


                switch (getName)  //setText for playerDesc
            {
                case "Derrick Rose" :
                    playerDesc.setText(playerInfo[0]);
                    break;
                case "Jimmy Butler" :
                    playerDesc.setText(playerInfo[1]);
                    break;
                case "Doug McDermott" :
                    playerDesc.setText(playerInfo[2]);
                    break;
                case "Taj Gibson" :
                    playerDesc.setText(playerInfo[3]);
                    break;
                case "Joakim Noah" :
                    playerDesc.setText(playerInfo[4]);
                    break;
                default:
                    playerDesc.setText("");
            }//end of switch



        }//end of if

    }

    //go back to main activity
    public void goBack (View view)
    {
        finish();

    }//end of goBack


    //player descriptions
    String playerInfo [] = {"Rose was selected with the first overall pick in the 2008 draft by the Chicago Bulls.[1][57] He was selected to the U.S. Select Team to scrimmage against and prepare the National Team for the Olympics in Beijing.[58][59][60] In mid-July, he played two games in the Orlando Pro Summer League until forced out by tendinitis in his right knee, ending his summer,[61] but returned in October to play all eight preseason games.[62]\n" +
            "\n" +
            "Rose became the first Bulls draftee to score 10 points or more in his first 10 games since Michael Jordan,[63] and earned Eastern Conference Rookie of the Month honors for November and December.[64][65] During the All-Star Weekend, Rose played in the Rookie Challenge,[66] and won the Skills Challenge, where he beat out several All-Stars to become the first rookie to claim the trophy.[67] Overcoming a January and February slump, Rose returned to form and won monthly rookie honors in March. Meanwhile, the Bulls, re-energized by the trade deadline acquisitions of John Salmons and Brad Miller, finished the regular season on a 12–4 spurt to qualify as the seventh seed in the Eastern Conference. Rose won Rookie of the Year, joining Michael Jordan (1985) and Elton Brand (2000) as the only Bulls to do so.[2] He was also the first number-one draft pick since LeBron James to win the award. He averaged 16.8 points on 47.5% field goal shooting, 6.3 assists (leading all rookies) and 3.9 rebounds per game and was also named to the NBA All-Rookie First Team.[68]\n" +
            "\n" +
            "In his playoff debut against the defending champion Boston Celtics, Rose recorded 36 points (tying Kareem Abdul-Jabbar's NBA record for points scored by a rookie in his playoff debut, set in 1970), 11 assists, and 4 rebounds as the Bulls prevailed in a 105–103 overtime win on the road.[69][70][71] Rose became the second player in NBA history to record 35 points and 10 assists in his playoff debut, after Chris Paul. Rose averaged 19.7 points on 47.5% shooting, 6.3 assists and 4.9 rebounds per game in his first playoff series, as the Bulls were defeated by the Celtics in seven games.[72]", "Before the 2011 draft, one NBA general manager said about Butler, \"His story is one of the most remarkable I've seen in all my years of basketball. There were so many times in his life where he was set up to fail. Every time, he overcame just enormous odds. When you talk to him—and he's hesitant to talk about his life—you just have this feeling that this kid has greatness in him.\"[1]\n" +
            "\n" +
            "Butler's father abandoned the family when he was an infant. By the time he was 13 years old and living in the Houston suburb of Tomball, his mother kicked him out of the house. As Butler remembered it in a 2011 interview, she told him, \"I don't like the look of you. You gotta go.\" He then bounced between the homes of various friends, staying for a few weeks at a time before moving to another house.[1]\n" +
            "\n" +
            "In a summer basketball league before his senior year at Tomball High School, he was noticed by Jordan Leslie, a freshman football and basketball player at the school, who challenged him to a three-point shooting contest. The two immediately became friends, and Butler began staying at Leslie's house. Although his friend's mother and stepfather, who had six other children between them, were reluctant at first, they took him in within a few months. Butler would later say, \"They accepted me into their family. And it wasn't because of basketball. She [Michelle Lambert, Leslie's mother] was just very loving. She just did stuff like that. I couldn't believe it.[1]\n" +
            "\n" +
            "As a junior at Tomball High, Butler averaged 10 points per game. As a senior and team captain in 2006–07, Butler averaged 19.9 points and 8.7 rebounds per game and was subsequently voted his team's most valuable player.\n" +
            "\n" +
            "Butler was not heavily recruited coming out of high school and chose to attend Tyler Junior College in Tyler, Texas.", "On June 26, 2014, McDermott was selected with the 11th overall pick in the 2014 NBA draft by the Denver Nuggets. He was later traded to the Chicago Bulls on draft night, along with Anthony Randolph, for both of Chicago's 2014 first round picks (16th and 19th) and a future second round pick.[22] On July 22, 2014, he signed his rookie scale contract with the Bulls after averaging 18.0 points, 4.0 rebounds and 2.8 assists per game during the 2014 NBA Summer League.[23][24] In his NBA debut on October 29, he recorded 12 points, 5 rebounds, 2 assists and 1 steal in a 104–80 win over the New York Knicks.[25] While expected to contribute with scoring and shooting for the Bulls, McDermott struggled significantly over his first 17 games, averaging just 3.2 points at 42.3 percent shooting.[26] Despite his promising debut, McDermott did not manage to eclipse 12 points before being ruled out indefinitely on December 1 due to a knee injury. He subsequently required an arthroscopic procedure on his right knee which took place on December 13.[27] He returned to action on January 22, 2015 against the San Antonio Spurs, recording no stats in two minutes of action.[28] On March 6, he scored a season-high 16 points in a loss to the Indiana Pacers.[29]\n" +
            "\n" +
            "2015–16 season[edit]\n" +
            "In July 2015, McDermott re-joined the Bulls for the 2015 NBA Summer League where he averaged 18.8 points and 4.4 rebounds in five games, impressing new coach Fred Hoiberg.[30] McDermott's Summer League form carried over into the regular season, with Hoiberg giving him plenty of game time off the bench. Over the first three games of the season, he averaged 7.3 points per game, boosting that number up to 10.2 over the first five games with 12 points scored against the Orlando Magic on November 1, and 17 points scored against the Charlotte Hornets on November 3. His impressive play off the bench earned him his first career starting assignment on November 5 against the Oklahoma City Thunder. In 23 minutes of action as the starting small forward, he scored nine points in a 104–98 win over the Thunder.[31] Four days later, he scored a then career-high 18 points in a 111–88 win over the Philadelphia 76ers.[32] On November 16, Tony Snell was reinserted into the starting line-up, moving McDermott back to a bench role.[33] On February 19, 2016, he scored a career-high 30 points off the bench in a 116–106 win over the Toronto Raptors.[34]","Gibson declared for the 2009 NBA draft,[2] and was selected 26th overall by the Chicago Bulls. He, along with fellow draft pick James Johnson, signed with the Bulls in July, 2009.[3] Gibson was the starting power forward for most of his rookie season with the Bulls and impressed many people with his high energy and good defense. During the All-Star Weekend, Gibson played in the Rookie Challenge, where the Rookie team won for the first time since 2002. The Bulls made the playoffs securing the 8th seed in the Eastern Conference. Taj averaged 7.6 points per game and 7.0 rebounds while the Bulls lost to the Cleveland Cavaliers in the first round. At the end of his first season, Taj was selected to the NBA All-Rookie First Team.[4]\n" +
            "\n" +
            "During the 2010 off-season, the Bulls signed power forward Carlos Boozer, who was expected to start at the beginning of the season rather than Gibson. Prior to the pre-season though, Boozer broke his hand, so Gibson started the first 15 games of the season. After Boozer's return, Gibson moved into a bench role for most of the season. Gibson was selected as a starter for the Sophomore squad in the 2011 NBA Rising Stars challenge at the All-Star weekend, which the Rookie team won 148-140. Gibson played 18 minutes and recorded 8 points.[5] At the end of the season, the Bulls made the playoffs as the first seed in the Eastern Conference. On May 10, 2011, Gibson helped his team take a 3-2 lead in the Eastern Conference semifinals against Atlanta, making all of his 11 points in the fourth quarter.[6]\n" +
            "\n" +
            "In May 2012, Gibson was named to the US Select Team, joining the likes of Jeremy Lin, DeMarcus Cousins, and Kyrie Irving in practicing with the US Olympic Team in preparation for the 2012 Summer Olympics in London.[7] On October 31, 2012, Gibson signed a multi-year rookie scale contract extension with the Bulls.[8] Playing mostly a bench role in 2013–14, Gibson averaged 13 points and 6.8 rebounds on the season and was among the league leaders in blocked shots per game. Gibson subsequently finished second in the NBA's Sixth Man of the Year Award, losing out to Jamal Crawford.[9] On June 16, 2015, Gibson underwent arthroscopic surgery on his left ankle and was ruled out for four months","Noah lost his starting spot to Nikola Mirotić during the 2015 pre-season, coming off the bench in his first 23 games of the 2015–16 season.[33] Following a quadruple overtime loss to the Detroit Pistons on December 18, starting center Pau Gasol did not travel to New York for the Bulls' December 19 game against the Knicks. In his absence, Noah started in his first game of the season and subsequently scored a season-high 21 points. He also grabbed 10 rebounds in the game, six of them offensive, thus becoming the Bulls' career leader in offensive boards, passing Horace Grant (1,888).[34] On December 23, he was ruled out for two to four weeks because of a slight tear within his sprained left shoulder, an injury he suffered in the Bulls' December 21 game against the Brooklyn Nets.[35] After missing nine straight games with the injury, he returned to action on January 11, recording 9 rebounds and 4 assists off the bench in a loss to the Washington Wizards.[36] On January 14, he made just his second start of the season, replacing the injured Pau Gasol. In 38 minutes of action, he recorded 6 points, 16 rebounds, 8 assists, 2 steals and 1 block in a 115–111 overtime win over the Philadelphia 76ers.[37] In the next game the following night, Noah re-injured his left shoulder against the Dallas Mavericks.[38] He was subsequently ruled out for four to six months after it was determined that he required surgery to stabilize his left shoulder.[39]"};


}// end of Player
