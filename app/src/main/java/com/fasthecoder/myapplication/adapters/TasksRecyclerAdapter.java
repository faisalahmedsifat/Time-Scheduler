package com.fasthecoder.myapplication.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import com.fasthecoder.myapplication.R;
import com.fasthecoder.myapplication.models.Task;

import java.util.ArrayList;

public class TasksRecyclerAdapter extends RecyclerView.Adapter<TasksRecyclerAdapter.ViewHolder> {

    ArrayList<Task> mTasks = new ArrayList<>();

    public TasksRecyclerAdapter(ArrayList<Task> tasks) {
        this.mTasks = tasks;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_task_list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.title.setText(mTasks.get(position).getTitle());
        holder.label.setText(mTasks.get(position).getLabel());
        holder.task_time.setText(mTasks.get(position).getTask_time());
        holder.task_day.setText(mTasks.get(position).getTask_day());
    }

    @Override
    public int getItemCount() {
        return mTasks.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView title, task_time, task_day ;
        private AppCompatTextView label;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.task_title);
            task_time = itemView.findViewById(R.id.task_time);
            task_day = itemView.findViewById(R.id.task_day);
            label = itemView.findViewById(R.id.task_label);
        }
    }
}
