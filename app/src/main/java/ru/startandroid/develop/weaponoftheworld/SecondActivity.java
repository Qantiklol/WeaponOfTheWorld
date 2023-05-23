package ru.startandroid.develop.weaponoftheworld;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    // создание коллекции контейнера для данных класса Animal
    List<Weapon> weapons = new ArrayList<Weapon>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // инициализируем контейнер
        setInitialData();

        // создадим объект RecyclerView и привяжем к нему соответствующий id
        RecyclerView recyclerView = findViewById(R.id.list_animal);

        // создадим адаптер и загрузим в него контейнер с данными
        WeaponAdapter adapter = new WeaponAdapter(this, weapons);

        // на recyclerView подадим адаптер
        recyclerView.setAdapter(adapter);
    }

    // метод setInitialData() устанавливает начальный набор данных (а именно изображения из папки res/drawables)
    private void setInitialData() {
        // добавление в контейнер animals объектов сущности Animal
        weapons.add( new Weapon("АК-47", "При весе 4,3 кг скорострельность АК-47 составляет 600 выстрелов в минут, а пуля на выходе развивает скорость 715 м/с.\n" +
                "\n" +
                "Принцип действия АК основывается на использовании энергии пороховых газов, отводимых через отверстие из канала ствола. Механизм действия АК запускает спусковой крючок. Далее, под действием ударной пружины, курок бьет по ударнику. Происходит накал капсулы и воспламенение порохового снаряда. Под действием расширяющихся пороховых газов пуля врезается в нарезы и движется по каналу ствола.",
                R.drawable.ak47, "1949 год выпуска"));
        weapons.add( new Weapon("М4А1", "Этот разработанный вариант, отличающийся возможностью стрельбы непрерывными очередями подобно М16А2E3; Самозарядные варианты М4 для гражданского рынка.",
                R.drawable.m4a1, "1994 год выпуска"));
        weapons.add( new Weapon("FAMAS", " (фр. Fusil d'Assaut de la Manufacture d'Armes de St-Étienne — штурмовая винтовка разработки оружейного предприятия MAS в Сент-Этьене) — французский автомат калибра 5,56 мм, имеющий компоновку «булл-пап». Неофициальное название — «клерон» (фр. Clairon - «горн»).",
                R.drawable.famas, "1975 год выпуска"));
        weapons.add( new Weapon("QBZ-95", "QBZ-95 (сокр. от Qīngwuqi Bùqiāng-Zìdòng, кит. Лёгкая автоматическая винтовка) или Type 95 — китайское семейство оружия, включающее автомат и ручной пулемёт. Оружие выполнено по компоновке \"булл-пап\" и использует (в базовой версии) новый китайский 5,8-мм промежуточный патрон.",
                R.drawable.qbz95, "1995 год выпуска"));
        weapons.add( new Weapon("Fn SCAR", "Боевая штурмовая винтовка для сил специальных операций) — оружейная система, разработанная американским подразделением бельгийской компании FN Herstal для участия в конкурсе на создание нового автомата для бойцов USSOCOM",
                R.drawable.scar, "2003 год выпуска"));
    }
}