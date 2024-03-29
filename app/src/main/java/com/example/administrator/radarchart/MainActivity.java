package com.example.administrator.radarchart;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;

import com.lwb.radarchart.RadarChartView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RadarChartView radar_chart_view = findViewById(R.id.radar_chart_view);

        radar_chart_view.compareType("法术", 700, 820, 1000);
        radar_chart_view.compareType("攻击", 900, 750, 1000);
        radar_chart_view.compareType("物抗", 550, 600, 1000);
        radar_chart_view.compareType("魔抗", 750, 800, 1000);
//        radar_chart_view.compareType("移速", 800, 750, 1000);
//        radar_chart_view.compareType("天赋", 800, 900, 1000);
//        radar_chart_view.compareType("暴击", 80, 70, 100);
//        radar_chart_view.compareType("金钱", 9000, 9500, 10000);

//        radar_chart_view.insertType("法术", 800, 1000);
//        radar_chart_view.insertType("攻击", 700, 1000);
//        radar_chart_view.insertType("物抗", 550, 1000);
//        radar_chart_view.insertType("魔抗", 500, 1000);
//        radar_chart_view.insertType("移速", 800, 1000);
//        radar_chart_view.insertType("天赋", 400, 1000);
//        radar_chart_view.insertType("暴击", 80, 100);
//        radar_chart_view.insertType("金钱", 9000, 10000);

        RadarChartView.Config config = new RadarChartView.Config()
                .setBackgroundColor(Color.GREEN)
                .setMaxLevel(5)
                .setCenterPointRadius(5)
                .setChartWidget(0.8f)
                .setFillColor(0xff268415)
                .setSecondFillColor(Color.parseColor("#666666"))//0xffcd2626
                .setValueLineSize(1)
                .setValuePointRadius(5)
                .setBackgroundColor(0x88985615)
                .setTextColor(0x88985615)
                .setTextSize(40)
                .setCanScroll(true)
                .setCanFling(true)
                .setValueBackgroundAlpha(0.2f)
                .setTextPosition(1.1f)
                .setCompareName("后裔","狄仁杰")
                .setPointRadius(2);
        radar_chart_view.setConfig(config);

        radar_chart_view.postDelayed(new Runnable() {
            @Override
            public void run() {
                radar_chart_view.clearData();
                radar_chart_view.compareType("暴击", 80, 100, 100);
                radar_chart_view.compareType("魔抗", 750, 1000, 1000);
                radar_chart_view.compareType("移速", 800, 1000, 1000);
                radar_chart_view.compareType("攻击", 900, 1000, 1000);
//                radar_chart_view.compareType("法术", 700, 820, 1000);
//                radar_chart_view.compareType("天赋", 800, 900, 1000);
//                radar_chart_view.compareType("金钱", 9000, 9500, 10000);
//                radar_chart_view.compareType("物抗", 550, 600, 1000);
                radar_chart_view.reDrawRadarChart();
            }
        },2000);
    }
}
