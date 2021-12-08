package com.qayratsultan.quizforfun.other;

import android.content.Context;
import android.text.TextUtils;
import android.util.Patterns;

import com.qayratsultan.quizforfun.R;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

public class Utils {

    public static boolean isValidEmail(CharSequence target) {
        return (!TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches());
    }

    public static String formatDate(long time){
        SimpleDateFormat formatter = new SimpleDateFormat(Constants.DATE_FORMAT, Locale.getDefault());

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        return formatter.format(calendar.getTime());
    }

    public static Map<String,String> getMathQuestions(){
        HashMap<String,String> questions = new HashMap<>();
        questions.put("1+1","2");
        questions.put("2+2","4");
        questions.put("3+3","6");
        questions.put("4+4","8");
        questions.put("5+5","10");
        questions.put("6+6","12");
        questions.put("7+7","14");
        questions.put("8+8","16");
        questions.put("9+9","18");
        questions.put("10+10","20");
        questions.put("11+11","22");
        questions.put("12+12","24");
        questions.put("13+13","26");
        questions.put("14+14","28");
        questions.put("15+15","30");

        return questions;
    }

    public static Map<String,String> getRandomMathQuestions(int SIZE){
        HashMap<String,String> questionsMap = new HashMap<>();
        Map<String,String> originalQuestion = getMathQuestions();
        int originalSize =  originalQuestion.size();
        ArrayList<String> keyList = new ArrayList<String>(originalQuestion.keySet());

        while (questionsMap.size()<=SIZE){
            Random random = new Random();
            int randomNumber = random.nextInt(originalSize);
            String question = keyList.get(randomNumber);
            if (!questionsMap.containsKey(question)){
                questionsMap.put(question,originalQuestion.get(question));
            }
        }
        return questionsMap;
    }



    public static Map<String,Map<String,Boolean>> getLiteratureQuestions(){
        HashMap<String,Map<String,Boolean>> questions = new HashMap<>();

        HashMap<String,Boolean> answer1 = new HashMap<>();
        answer1.put("«Путь Абая» М.Ауезова",true);
        answer1.put("Сакен Сейфуллин - Страна",false);
        answer1.put("одна и Родина - Сейфулин Рашид",false);
        answer1.put("Ер-Тостик - Тохтар Аубакиров",false);
        questions.put("Какое произведение и какого автора\n" +
                "\n" +
                "переведено более чем на 30 языков?",answer1);

        HashMap<String,Boolean> answer2 = new HashMap<>();
        answer2.put("Батыр",true);
        answer2.put("Бий",false);
        answer2.put("Хан",false);
        answer2.put("Эмир",false);
        questions.put("Почетное звание, присваиваемое особо отличившимся в военном деле\n" +
                "личным героизмом, смелостью и доблестью военачальникам и воинам. ?",answer2);

        HashMap<String,Boolean> answer3 = new HashMap<>();
        answer3.put("Кыстау",true);
        answer3.put("Кыркуйек",false);
        answer3.put("Багдаршам",false);
        answer3.put("Ауыл",false);
        questions.put("Зимнее пастбище?",answer3);

        HashMap<String,Boolean> answer4 = new HashMap<>();
        answer4.put("Отара",true);
        answer4.put("Койдар",false);
        answer4.put("Малдар",false);
        answer4.put("Тода",false);
        questions.put("Стада овец?",answer4);

        HashMap<String,Boolean> answer5 = new HashMap<>();
        answer5.put("С.Муканов ",true);
        answer5.put("Абай Конанбай",false);
        answer5.put("Кайрат Султан",false);
        answer5.put("Ма Саган",false);
        questions.put("Автор трилогии «Школа жизни»: ",answer5);

        HashMap<String,Boolean> answer6 = new HashMap<>();
        answer6.put("Отцом Баян",true);
        answer6.put("Братом Баян",false);
        answer6.put("Сестрой Баян",false);
        answer6.put("Дядя Баян",false);
        questions.put("В пьесе «Козы Корпеш-Баян сулу» Карабай является:",answer6);

        HashMap<String,Boolean> answer7 = new HashMap<>();
        answer7.put("1835-1865",true);
        answer7.put("1836-1867",false);
        answer7.put("1835-1866",false);
        answer7.put("1800-1865",false);
        questions.put("Укажите годы жизни Ш.Валиханова: ",answer7);

        HashMap<String,Boolean> answer8 = new HashMap<>();
        answer8.put("айтыс",true);
        answer8.put("баян",false);
        answer8.put("фольклор",false);
        answer8.put("литература",false);
        questions.put("Жанр, характерный именно для казахского фольклора:",answer8);

        HashMap<String,Boolean> answer9 = new HashMap<>();
        answer9.put("Кобланды батыр",true);
        answer9.put("Айтыланды батыр",false);
        answer9.put("Кобланды сабыр",false);
        answer9.put("Каны энды тандыр",false);
        questions.put("К героическому эпосу относится:",answer9);

        HashMap<String,Boolean> answer10 = new HashMap<>();
        answer10.put("Stingy",true);
        answer10.put("Rude",false);
        answer10.put("Unintelligent",false);
        answer10.put("Fanatic",false);
        questions.put("Which of the following was Elizabeth known as?",answer10);

        HashMap<String,Boolean> answer11 = new HashMap<>();
        answer11.put("Бухар",true);
        answer11.put("Тонауды",false);
        answer11.put("Айтпесе",false);
        answer11.put("Тсаукесер",false);
        questions.put("Жырау, посвятивший многие свои произведения хану Аблаю:",answer11);

        HashMap<String,Boolean> answer12 = new HashMap<>();
        answer12.put("Махамбета Утемисова",true);
        answer12.put("Абылайхан Туленов",false);
        answer12.put("Абай Конанбайулы",false);
        answer12.put("Мыржакып Дулатов",false);
        questions.put("С творчеством этого поэта связывается зарождение казахской гражданской лирики:",answer12);

        HashMap<String,Boolean> answer13 = new HashMap<>();
        answer13.put("толгау",true);
        answer13.put("атырау",false);
        answer13.put("айтыс",false);
        answer13.put("байтыс",false);
        questions.put("Самый распространенный жанр в творчестве жырау:",answer13);

        HashMap<String,Boolean> answer14 = new HashMap<>();
        answer14.put("Ш.Кудайбердиев",true);
        answer14.put("Каиргали Ш.",false);
        answer14.put("Мамбетов У.",false);
        answer14.put("Ш. Кудайбергенов",false);
        questions.put("Автор автобиографического произведения «Записки Забытого»:",answer14);

        HashMap<String,Boolean> answer15 = new HashMap<>();
        answer15.put("М.Дулатов",true);
        answer15.put("Б. Пулатов",false);
        answer15.put("Д. Мулатов",false);
        answer15.put("М. Тулепов",false);
        questions.put("Автор поэтического сборника «Проснись, казах»: ",answer15);

        return questions;
    }

    public static Map<String,Map<String,Boolean>> getGeographyQuestions(){
        HashMap<String,Map<String,Boolean>> questions = new HashMap<>();

        HashMap<String,Boolean> answer1 = new HashMap<>();
        answer1.put("Узбеки",false);
        answer1.put("Русские",false);
        answer1.put("Казахи ",true);
        answer1.put("Индусы",false);
        questions.put("Какая нация в основном проживает в Казахстане?",answer1);

        HashMap<String,Boolean> answer2 = new HashMap<>();
        answer2.put("В 1991",true);
        answer2.put("В 1994",false);
        answer2.put("В 1993",false);
        answer2.put("В 1992",false);
        questions.put("В каком году Казахстан приобрела независимость?",answer2);

        HashMap<String,Boolean> answer3 = new HashMap<>();
        answer3.put("1",false);
        answer3.put("3",true);
        answer3.put("2",false);
        answer3.put("4",false);
        questions.put("Количество мегаполисов в Казахстане",answer3);

        HashMap<String,Boolean> answer4 = new HashMap<>();
        answer4.put("Кайрат",false);
        answer4.put("Шымкент",false);
        answer4.put("Алмата",false);
        answer4.put("Нур-Султан",true);
        questions.put("Как называется нынешняя столица Казахстана?",answer4);

        HashMap<String,Boolean> answer5 = new HashMap<>();
        answer5.put("На 777 месте",false);
        answer5.put("На 9 месте",true);
        answer5.put("На втором месте",false);
        answer5.put("На 1 месте",false);
        questions.put("На каком месте стоит Казахстан по площади",answer5);

        HashMap<String,Boolean> answer6 = new HashMap<>();
        answer6.put("В Казахстане",false);
        answer6.put("В Раю",true);
        answer6.put("В Узбекистане",false);
        answer6.put("В Америке",false);
        questions.put("В каком месте хотели бы вы быть?",answer6);

        HashMap<String,Boolean> answer7 = new HashMap<>();
        answer7.put("В Казахстане",true);
        answer7.put("В России",false);
        answer7.put("В Америке",false);
        answer7.put("В Узбекистане",false);
        questions.put("Где живет мистер Кайрат?",answer7);

        HashMap<String,Boolean> answer8 = new HashMap<>();
        answer8.put("Казахстан",true);
        answer8.put("Китай",false);
        answer8.put("Армения",false);
        answer8.put("Пакистан",false);
        questions.put("Какая страна расположена на севере Узбекистана",answer8);

        HashMap<String,Boolean> answer9 = new HashMap<>();
        answer9.put("Алмата",true);
        answer9.put("Тараз",false);
        answer9.put("Ташкент",false);
        answer9.put("Шымкент",false);
        questions.put("Название города, являющиеся культурной столицей Казахстана",answer9);

        HashMap<String,Boolean> answer10 = new HashMap<>();
        answer10.put("Орёл",true);
        answer10.put("Пингвин",false);
        answer10.put("Страус",false);
        answer10.put("Жар-птица",false);
        questions.put("Какая птица изображена на флаге Казахстана?",answer10);

        HashMap<String,Boolean> answer11 = new HashMap<>();
        answer11.put("Средняя Азия",true);
        answer11.put("Африка",false);
        answer11.put("Америка",false);
        answer11.put("Европа",false);
        questions.put("В каком регионе расположен Казахстан",answer11);

        HashMap<String,Boolean> answer12 = new HashMap<>();
        answer12.put("Акмола",true);
        answer12.put("Нур-Султан",false);
        answer12.put("Алмата",false);
        answer12.put("Астана",false);
        questions.put("Самое первое название столицы Казахстана до того, как стала она столицей",answer12);

        HashMap<String,Boolean> answer13 = new HashMap<>();
        answer13.put("Шымкент",true);
        answer13.put("Актау",false);
        answer13.put("Туркестан",false);
        answer13.put("Тараз",false);
        questions.put("Южный мегаполис Казахстана",answer13);

        HashMap<String,Boolean> answer14 = new HashMap<>();
        answer14.put("Нурсултан Назарбаев",true);
        answer14.put("Касым-Жомарт Токаев",false);
        answer14.put("Ислам Каримов",false);
        answer14.put("Борис Ельцин",false);
        questions.put("Первый президент Казахстана",answer14);

        HashMap<String,Boolean> answer15 = new HashMap<>();
        answer15.put("Китай",true);
        answer15.put("Узбекистан",false);
        answer15.put("Турция",false);
        answer15.put("Россия",false);
        questions.put("С каким государством граничит Казахстан с Севера",answer15);

        return questions;
    }

    public static Map<String,Map<String,Boolean>> getRandomLiteratureAndGeographyQuestions(Context context, String subject, int SIZE){
        Map<String,Map<String,Boolean>> questionsMap = new HashMap<>();
        Map<String, Map<String, Boolean>> originalQuestion;
        if (subject.equals(context.getString(R.string.geography))){
            originalQuestion = getGeographyQuestions();
        }else{
            originalQuestion = getLiteratureQuestions();
        }

        int originalSize =  originalQuestion.size();
        ArrayList<String> keyList = new ArrayList<String>(originalQuestion.keySet());

        while (questionsMap.size()<=SIZE){
            Random random = new Random();
            int randomNumber = random.nextInt(originalSize);
            String question = keyList.get(randomNumber);
            if (!questionsMap.containsKey(question)){
                questionsMap.put(question,originalQuestion.get(question));
            }
        }
        return questionsMap;
    }

}
