package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fy1 extends FrameLayout {
    public LineDataSet A;
    public final int w;
    public final int x;
    public LineChart y;
    public LineData z;

    public fy1(Context context) {
        super(context, null, 0);
        this.w = hH.A(Zr_O.j);
        long j = Zr_O.h;
        this.x = hH.A(j);
        LineChart lineChart = new LineChart(getContext());
        addView(lineChart, -1, -1);
        this.y = lineChart;
        LineDataSet lineDataSet = new LineDataSet(new ArrayList(), "LineValues");
        lineDataSet.setMode(LineDataSet.Mode.CUBIC_BEZIER);
        lineDataSet.setFillColor(hH.A(j));
        lineDataSet.setColor(hH.A(j));
        lineDataSet.setDrawFilled(true);
        lineDataSet.setDrawValues(false);
        lineDataSet.setDrawCircles(false);
        this.A = lineDataSet;
        LineData lineData = new LineData(lineDataSet);
        this.z = lineData;
        LineChart lineChart2 = this.y;
        if (lineChart2 == null) {
            ur1.e("lineChart");
            throw null;
        }
        lineChart2.setData(lineData);
        lineChart2.setDescription(null);
        lineChart2.setMinOffset(0.0f);
        lineChart2.setTouchEnabled(false);
        lineChart2.getAxisLeft().setEnabled(true);
        lineChart2.getAxisRight().setEnabled(false);
        lineChart2.getLegend().setEnabled(false);
        YAxis axisLeft = lineChart2.getAxisLeft();
        axisLeft.setXOffset(0.0f);
        axisLeft.setTextColor(hH.A(Zr_O.g));
        axisLeft.setGridColor(hH.A(Zr_O.f));
        axisLeft.setDrawLabels(false);
        axisLeft.setDrawGridLines(false);
        axisLeft.setDrawAxisLine(false);
        XAxis xAxis = lineChart2.getXAxis();
        xAxis.setDrawAxisLine(false);
        xAxis.setDrawLabels(false);
        xAxis.setDrawGridLines(false);
    }

    public final void a(vp vpVar) {
        LineDataSet lineDataSet = this.A;
        if (lineDataSet == null) {
            ur1.e("lineDataSet");
            throw null;
        }
        List<T> values = lineDataSet.getValues();
        if (values != 0) {
            values.clear();
        }
        List<xp> list = vpVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            xp xpVar = list.get(i);
            lineDataSet.addEntry(new Entry(xpVar.a, xpVar.b));
        }
        lineDataSet.notifyDataSetChanged();
        LineData lineData = this.z;
        if (lineData == null) {
            ur1.e("lineData");
            throw null;
        }
        lineData.notifyDataChanged();
        LineChart lineChart = this.y;
        if (lineChart == null) {
            ur1.e("lineChart");
            throw null;
        }
        lineChart.notifyDataSetChanged();
        lineChart.invalidate();
        YAxis axisLeft = lineChart.getAxisLeft();
        axisLeft.removeAllLimitLines();
        List<aq> list2 = vpVar.b;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            aq aqVar = list2.get(i2);
            LimitLine limitLine = new LimitLine(aqVar.b, aqVar.a);
            limitLine.setLabelPosition(LimitLine.LimitLabelPosition.LEFT_TOP);
            limitLine.setLineColor(this.x);
            limitLine.setTextColor(this.w);
            limitLine.setTextSize(12.0f);
            limitLine.setXOffset(10.0f);
            axisLeft.addLimitLine(limitLine);
        }
        lk5 lk5Var = vpVar.c;
        lineChart.setVisibleYRange(lk5Var.a, lk5Var.b, YAxis.AxisDependency.LEFT);
    }
}
