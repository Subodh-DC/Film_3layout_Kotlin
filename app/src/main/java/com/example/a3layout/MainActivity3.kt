package com.example.a3layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    lateinit var Img:ImageView
    lateinit var text1:TextView
    lateinit var text2:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        Img=findViewById(R.id.imageView1)
        text1=findViewById(R.id.textView1)
        text2=findViewById(R.id.textView2)
        val call=intent.extras?.getString("p1")
        if (call.equals("0")){
            Img.setImageResource(
                R.drawable.srk
            )
            text1.text = "Shah Rukh Khan"
            text2.text = "Shah Rukh Khan, often dubbed the 'King of Bollywood,' is an iconic Indian actor, film producer, and philanthropist. Born on November 2, 1965, he has received numerous awards for his versatile performances in over 80 Bollywood films. His global appeal and charisma have earned him a massive international fan following."
        }
        else if (call.equals("1")){
            Img.setImageResource(
                R.drawable.amitabh
            )
            text1.text = "Amitabh Bachchan"
            text2.text = "Amitabh Bachchan, born on October 11, 1942, is a legendary Indian actor and film personality. Known as the 'Shahenshah of Bollywood,' he has an illustrious career spanning five decades. Bachchan's powerful performances in iconic films like 'Sholay' and 'Deewar' have made him a cultural icon, earning numerous awards and accolades."
        }
        else if (call.equals("2")){
            Img.setImageResource(
                R.drawable.amir
            )
            text1.text = "Aamir Khan"
            text2.text = "Aamir Khan, born on March 14, 1965, is a highly acclaimed Indian actor, producer, and director. Known as the 'Perfectionist' of Bollywood, he has delivered iconic performances in films like 'Lagaan,' 'Dangal,' and '3 Idiots.' Beyond acting, Aamir is celebrated for his commitment to meaningful cinema and social causes."
        }
        else if (call.equals("3")){
            Img.setImageResource(
                R.drawable.salman
            )
            text1.text = "Salman Khan"
            text2.text = "Salman Khan, known as the 'Bhai' of Bollywood, is a charismatic actor with a massive fan following. With a career spanning decades, he's starred in blockbuster hits like 'Bajrangi Bhaijaan' and 'Sultan.' Beyond acting, his philanthropy and hosting 'Bigg Boss' showcase his multifaceted presence, making him a beloved and influential figure."
        }
        else if (call.equals("4")){
            Img.setImageResource(
                R.drawable.akshay
            )
            text1.text = "Akshay Kumar"
            text2.text = "Akshay Kumar, the 'Khiladi' of Bollywood, is celebrated for his diverse roles and impeccable comic timing. With a string of box office hits, he's known for blending action and humor seamlessly. His commitment to socially relevant films adds depth to his versatile career, making him a beloved and influential figure in Indian cinema."
        }

        val call1=intent.extras?.getString("p2")
        if (call1.equals("0")){
            Img.setImageResource(
                R.drawable.deepika
            )
            text1.text = "Deepika Padukone"
            text2.text = "Deepika Padukone, a 'Bollywood luminary,' is celebrated for her 'captivating performances' and striking beauty. With roles in films like 'Padmaavat' and 'Chennai Express,' she has established herself as a 'versatile actress.' Beyond cinema, she's a global 'style icon,' recognized for her grace and contributions to the film industry."
        }
        else if (call1.equals("1")){
            Img.setImageResource(
                R.drawable.priyanka
            )
            text1.text = "Priyanka Chopra Jonas"
            text2.text = "Priyanka Chopra Jonas, an accomplished actress, producer, and global icon, 'rose to fame in Bollywood before conquering Hollywood. She's known for her versatile roles in films like 'Bajirao Mastani' and 'Quantico' series. Off-screen, she's a UNICEF Goodwill Ambassador and advocates for social causes, displaying her multifaceted talent and influence."
        }
        else if (call1.equals("2")){
            Img.setImageResource(
                R.drawable.kngana
            )
            text1.text = "Kangana Ranaut"
            text2.text = "Kangana Ranaut, a fearless and versatile actress, has carved her niche in Bollywood. With 'Queen' and 'Tanu Weds Manu' series, she showcased her acting prowess. Known for her outspoken nature, Kangana fearlessly addresses industry issues. A multiple National Award winner, she continues to challenge norms and captivate audiences with her compelling performances."
        }
        else if (call1.equals("3")){
            Img.setImageResource(
                R.drawable.alia
            )
            text1.text = "Alia Bhatt"
            text2.text = "Alia Bhatt, a 'phenomenal actress' in Bollywood, has garnered widespread acclaim for her 'versatility' and compelling performances. Beginning her career with 'Student of the Year,' she has since delivered memorable roles in diverse films like 'Raazi,' 'Gully Boy,' and 'Highway,' establishing herself as a 'dynamic force' in the Indian film industry."
        }
        else if (call1.equals("4")){
            Img.setImageResource(
                R.drawable.kareena
            )
            text1.text = "Kareena Kapoor Khan"
            text2.text = "Kareena Kapoor Khan, often referred to as the 'Begum of Bollywood,' is a versatile and celebrated Indian actress. With her charismatic screen presence and stellar performances in films like 'Jab We Met' and 'Kabhi Khushi Kabhie Gham,' she has left an indelible mark, earning accolades for her talent and style."
        }

        val call2=intent.extras?.getString("p3")
        if (call2.equals("0")){
            Img.setImageResource(
                R.drawable.karan
            )
            text1.text = "Karan Johar"
            text2.text = "Karan Johar, a prolific filmmaker, producer, and talk show host, is a key figure in Indian cinema. Renowned for his directorial prowess in movies like 'Kabhi Khushi Kabhie Gham,' he effortlessly combines family dramas with modern narratives. His 'Koffee with Karan' talk show is a platform for candid celebrity conversations."
        }
        else if (call2.equals("1")){
            Img.setImageResource(
                R.drawable.rajkumar
            )
            text1.text = "Rajkumar Hirani"
            text2.text = "Karan Johar, a prolific filmmaker, producer, and talk show host, is a key figure in Indian cinema. Renowned for his directorial prowess in movies like 'Kabhi Khushi Kabhie Gham,' he effortlessly combines family dramas with modern narratives. His 'Koffee with Karan' talk show is a platform for candid celebrity conversations.Rajkumar Hirani, the acclaimed Indian filmmaker, is celebrated for his 'heartfelt storytelling' and 'socially relevant' movies. Renowned for blockbusters like 'Munna Bhai M.B.B.S' and '3 Idiots,' his films blend 'emotional depth' with 'humor,' earning him widespread acclaim. Hirani's work reflects a commitment to 'impactful narratives' and 'cinematic excellence.'"
        }
        else if (call2.equals("2")){
            Img.setImageResource(
                R.drawable.sanjayleela
            )
            text1.text = "Sanjay Leela Bhansali"
            text2.text = "Sanjay Leela Bhansali, a visionary filmmaker, is renowned for his grandiose cinematic creations. With an emphasis on opulent visuals and emotional storytelling, Bhansali has directed iconic films like 'Devdas,' 'Padmaavat,' and 'Goliyon Ki Raasleela Ram-Leela.' His work consistently blends artistic flair with compelling narratives, earning him critical acclaim and commercial success."
        }
        else if (call2.equals("3")){
            Img.setImageResource(
                R.drawable.zoya
            )
            text1.text = "Zoya Akhtar"
            text2.text = "Zoya Akhtar, a 'visionary filmmaker,' has carved her niche in Bollywood with 'progressive storytelling.' Known for films like 'Zindagi Na Milegi Dobara' and 'Gully Boy,' she seamlessly blends 'realism' with 'cinematic flair.' Akhtar, a master storyteller, explores societal nuances with 'depth' and 'empathy,' creating a lasting impact on Indian cinema."
        }
        else if (call2.equals("4")){
            Img.setImageResource(
                R.drawable.anurag
            )
            text1.text = "Anurag Kashyap"
            text2.text = "Anurag Kashyap, a trailblazing Indian filmmaker, is renowned for his 'unconventional' approach to cinema. With a penchant for gritty narratives and bold storytelling, he has directed films like 'Gangs of Wasseypur' and 'Dev.D,' establishing himself as a 'pioneer' in the realm of Indian cinema, pushing boundaries and challenging norms."
        }

        val call3=intent.extras?.getString("p4")
        if (call3.equals("0")){
            Img.setImageResource(
                R.drawable.johnny
            )
            text1.text = "Johnny Lever"
            text2.text = "'Johnny Lever,' a comedy maestro in Bollywood, is renowned for his unparalleled timing and versatility. With a career spanning decades, he has left an indelible mark with his humor-infused performances. Lever's comic genius has graced numerous films, earning him the title of one of the industry's most beloved and respected comedians."
        }
        else if (call3.equals("1")){
            Img.setImageResource(
                R.drawable.paresh
            )
            text1.text = "Paresh Rawal"
            text2.text = "'Paresh Rawal, a seasoned Indian actor, known for his impeccable comic timing, has left an indelible mark on Bollywood. With a career spanning decades, he's portrayed diverse characters with finesse. His memorable roles in 'Hera Pheri' and 'Andaz Apna Apna' showcase his unparalleled talent, making him a beloved figure in Indian cinema."
        }
        else if (call3.equals("2")){
            Img.setImageResource(
                R.drawable.govinda
            )
            text1.text = "Govinda"
            text2.text = "'Govinda,' born Govind Ahuja, is an acclaimed Bollywood actor and comedian. Renowned for his lively persona and unmatched dancing skills, he dominated the '90s with hits like 'Coolie No. 1' and 'Hero No. 1.' Govinda's unique style and comic timing have left an enduring mark on Indian cinema."
        }
        else if (call3.equals("3")){
            Img.setImageResource(
                R.drawable.rajpal
            )
            text1.text = "Rajpal Yadav"
            text2.text = "Rajpal Yadav, a prolific Indian actor, has enlivened Bollywood with his exceptional comedic flair. Known for his distinctive expressions and impeccable timing, he has left an indelible mark in films, adding a touch of humor to diverse roles. His versatile talent has made him a beloved and respected figure in the industry."
        }
        else if (call3.equals("4")){
            Img.setImageResource(
                R.drawable.boman
            )
            text1.text = "Boman Irani"
            text2.text = "Boman Irani, a versatile Indian actor, is celebrated for his impactful performances in Bollywood. With roles ranging from comedic genius in 'Munnabhai M.B.B.S' to a strict dean in '3 Idiots,' Irani's diverse talent and nuanced portrayals have made him a respected and cherished figure in the Indian film industry."
        }

    }

}
