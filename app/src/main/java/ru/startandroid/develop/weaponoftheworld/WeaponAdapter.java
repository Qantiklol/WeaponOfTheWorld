package ru.startandroid.develop.weaponoftheworld;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class WeaponAdapter extends RecyclerView.Adapter<WeaponAdapter.ViewHolder> {

    // поля адаптера
    private final LayoutInflater inflater; // поле для трансформации layout-файла во View-элемент
    private final List<Weapon> weapons; // поле коллекции контейнера для хранения данных (объектов класса Animal)

    // конструктор адаптера
    public WeaponAdapter(Context context, List<Weapon> weapons) {
        this.inflater = LayoutInflater.from(context);
        this.weapons = weapons;
    }

    // метод onCreateViewHolder() возвращает объект ViewHolder(), который будет хранить данные по одному объекту Animal
    @Override
    public WeaponAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false); // трансформация layout-файла во View-элемент
        return new ViewHolder(view);
    }

    // метод onBindViewHolder() выполняет привязку объекта ViewHolder к объекту Animal по определенной позиции
    @Override
    public void onBindViewHolder(WeaponAdapter.ViewHolder holder, int position) {
        Weapon weapon = weapons.get(position);
        holder.weaponView.setImageResource(weapon.getWeaponResource());
        holder.nameView.setText(weapon.getName());
        holder.weaponDescriptionView.setText(weapon.getWeaponDescription());
        holder.yearOfIssueView.setText(weapon.getYearOfIssue());
    }

    // метод getItemCount() возвращает количество объектов в списке
    @Override
    public int getItemCount() {
        return weapons.size();
    }

    // созданный статический класс ViewHolder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // неизменяемые поля представления
        final ImageView weaponView;
        final TextView nameView, weaponDescriptionView, yearOfIssueView;

        // конструктор класса ViewHolder с помощью которого мы связываем поля и представление list_item.xml
        ViewHolder(View view) {
            super(view);
            weaponView = view.findViewById(R.id.weaponResource);
            nameView = view.findViewById(R.id.name);
            weaponDescriptionView = view.findViewById(R.id.weaponDescription);
            yearOfIssueView = view.findViewById(R.id.yearOfIssue);
        }
    }
}
