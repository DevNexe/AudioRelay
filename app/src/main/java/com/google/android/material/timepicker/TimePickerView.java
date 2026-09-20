package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.azefsw.audioconnect.R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import defpackage.bi5;
import defpackage.u75;
import java.lang.reflect.Field;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
class TimePickerView extends ConstraintLayout {
    public static final /* synthetic */ int N = 0;
    public final MaterialButtonToggleGroup M;

    public class QnHx implements View.OnClickListener {
        public QnHx() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = TimePickerView.N;
            TimePickerView.this.getClass();
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        QnHx qnHx = new QnHx();
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        this.M = materialButtonToggleGroup;
        materialButtonToggleGroup.z.add(new F1(this));
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        u75 u75Var = new u75(new GestureDetector(getContext(), new LPt8Fixed(this)));
        chip.setOnTouchListener(u75Var);
        chip2.setOnTouchListener(u75Var);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(qnHx);
        chip2.setOnClickListener(qnHx);
    }

    public final void g() {
        if (this.M.getVisibility() == 0) {
            androidx.constraintlayout.widget.CQf cQf = new androidx.constraintlayout.widget.CQf();
            cQf.b(this);
            Field field = bi5.a;
            char c = bi5.NUlFixed.d(this) == 0 ? (char) 2 : (char) 1;
            HashMap<Integer, androidx.constraintlayout.widget.CQf.QnHx> map = cQf.c;
            if (map.containsKey(Integer.valueOf(R.id.material_clock_display))) {
                androidx.constraintlayout.widget.CQf.QnHx qnHx = map.get(Integer.valueOf(R.id.material_clock_display));
                switch (c) {
                    case 1:
                        androidx.constraintlayout.widget.CQf.C0021CQf c0021CQf = qnHx.d;
                        c0021CQf.h = -1;
                        c0021CQf.g = -1;
                        c0021CQf.C = -1;
                        c0021CQf.I = -1;
                        break;
                    case 2:
                        androidx.constraintlayout.widget.CQf.C0021CQf c0021CQf2 = qnHx.d;
                        c0021CQf2.j = -1;
                        c0021CQf2.i = -1;
                        c0021CQf2.D = -1;
                        c0021CQf2.K = -1;
                        break;
                    case 3:
                        androidx.constraintlayout.widget.CQf.C0021CQf c0021CQf3 = qnHx.d;
                        c0021CQf3.l = -1;
                        c0021CQf3.k = -1;
                        c0021CQf3.E = -1;
                        c0021CQf3.J = -1;
                        break;
                    case 4:
                        androidx.constraintlayout.widget.CQf.C0021CQf c0021CQf4 = qnHx.d;
                        c0021CQf4.m = -1;
                        c0021CQf4.n = -1;
                        c0021CQf4.F = -1;
                        c0021CQf4.L = -1;
                        break;
                    case 5:
                        qnHx.d.o = -1;
                        break;
                    case 6:
                        androidx.constraintlayout.widget.CQf.C0021CQf c0021CQf5 = qnHx.d;
                        c0021CQf5.p = -1;
                        c0021CQf5.q = -1;
                        c0021CQf5.H = -1;
                        c0021CQf5.N = -1;
                        break;
                    case 7:
                        androidx.constraintlayout.widget.CQf.C0021CQf c0021CQf6 = qnHx.d;
                        c0021CQf6.r = -1;
                        c0021CQf6.s = -1;
                        c0021CQf6.G = -1;
                        c0021CQf6.M = -1;
                        break;
                    default:
                        throw new IllegalArgumentException("unknown constraint");
                }
            }
            cQf.a(this);
            setConstraintSet(null);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        g();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            g();
        }
    }
}
