package com.example.expenseTracker;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.softmoore.android.graphlib.Function;
import com.softmoore.android.graphlib.Graph;
import com.softmoore.android.graphlib.GraphView;
import com.softmoore.android.graphlib.Label;
import com.softmoore.android.graphlib.Point;

public class HomeFragment extends Fragment {

    private Button button;
    private String annualIncomeString;
    private int annualIncomeInt;

    private TextView annualIncomeText;
    private TextView monthlyIncomeText;
    private TextView weeklyIncomeText;
    private TextView dailyIncomeText;

    public HomeFragment(){
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        // Inflate the fragment's layout
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        annualIncomeString = WelcomeActivity.income;
        annualIncomeInt = Integer.parseInt(annualIncomeString);

//
//        annualIncomeText = view.findViewById(R.id.annualIncomeDisplay);
//        monthlyIncomeText = view.findViewById(R.id.monthlyIncomeDisplay);
//        weeklyIncomeText = view.findViewById(R.id.weeklyIncomeDisplay);
//        dailyIncomeText = view.findViewById(R.id.dailyIncomeDisplay);
//
//        annualIncomeText.setText("Annual Income: $" + WelcomeActivity.income);
//        monthlyIncomeText.setText("Monthly Income: $" + annualIncomeInt / 12);
//        weeklyIncomeText.setText("Weekly Income: $" + annualIncomeInt / 52);
//        dailyIncomeText.setText("Daily Income: $" + annualIncomeInt / 365);

        // TODO: Format text w/ graph
        // CREATING THE GRAPH FOR INCOME BREAKDOWN
        Graph graph = new Graph.Builder().build();
        GraphView graphView = view.findViewById(R.id.graph_view);
        graphView.setGraph(graph);
        //setTitle("Empty Graph");
        TextView textView = view.findViewById(R.id.graph_view_label);
        textView.setText("Graph of Income");
        return view;
    }

}
