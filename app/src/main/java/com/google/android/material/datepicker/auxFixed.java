package com.google.android.material.datepicker;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.azefsw.audioconnect.R;
import defpackage.ai5;
import defpackage.bi5;
import defpackage.ef0;
import defpackage.lf5;
import defpackage.zg2;
import java.lang.reflect.Field;
import java.util.Calendar;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class auxFixed extends RecyclerView.LPt8Fixed<QnHx> {
    public final Context c;
    public final com.google.android.material.datepicker.QnHx d;
    public final ef0<?> e;
    public final F1.LPt8Fixed f;
    public final int g;

    public static class QnHx extends RecyclerView.qc {
        public final TextView t;
        public final MaterialCalendarGridView u;

        public QnHx(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
            this.t = textView;
            Field field = bi5.a;
            new ai5().e(textView, Boolean.TRUE);
            this.u = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
            if (z) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public auxFixed(ContextThemeWrapper contextThemeWrapper, ef0 ef0Var, com.google.android.material.datepicker.QnHx qnHx, F1.C0079F1 c0079f1) {
        Calendar calendar = qnHx.w.w;
        zg2 zg2Var = qnHx.z;
        if (calendar.compareTo(zg2Var.w) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (zg2Var.w.compareTo(qnHx.x.w) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        int i = NUlFixed.B;
        int i2 = F1.z0;
        int dimensionPixelSize = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i;
        int dimensionPixelSize2 = LPt8Fixed.R(contextThemeWrapper) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0;
        this.c = contextThemeWrapper;
        this.g = dimensionPixelSize + dimensionPixelSize2;
        this.d = qnHx;
        this.e = ef0Var;
        this.f = c0079f1;
        if (this.a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.b = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LPt8Fixed
    public final int a() {
        return this.d.B;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LPt8Fixed
    public final long b(int i) {
        Calendar calendarB = lf5.b(this.d.w.w);
        calendarB.add(2, i);
        return new zg2(calendarB).w.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LPt8Fixed
    public final void c(RecyclerView.qc qcVar, int i) {
        QnHx qnHx = (QnHx) qcVar;
        com.google.android.material.datepicker.QnHx qnHx2 = this.d;
        Calendar calendarB = lf5.b(qnHx2.w.w);
        calendarB.add(2, i);
        zg2 zg2Var = new zg2(calendarB);
        qnHx.t.setText(zg2Var.o(qnHx.a.getContext()));
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) qnHx.u.findViewById(R.id.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !zg2Var.equals(materialCalendarGridView.getAdapter().w)) {
            NUlFixed nUl = new NUlFixed(zg2Var, this.e, qnHx2);
            materialCalendarGridView.setNumColumns(zg2Var.z);
            materialCalendarGridView.setAdapter((ListAdapter) nUl);
        } else {
            materialCalendarGridView.invalidate();
            NUlFixed nUlA = materialCalendarGridView.getAdapter();
            Iterator<Long> it = nUlA.y.iterator();
            while (it.hasNext()) {
                nUlA.e(materialCalendarGridView, it.next().longValue());
            }
            ef0<?> ef0Var = nUlA.x;
            if (ef0Var != null) {
                Iterator<Long> it2 = ef0Var.s().iterator();
                while (it2.hasNext()) {
                    nUlA.e(materialCalendarGridView, it2.next().longValue());
                }
                nUlA.y = ef0Var.s();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new YKK(this, materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LPt8Fixed
    public final RecyclerView.qc d(RecyclerView recyclerView) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, (ViewGroup) recyclerView, false);
        if (!LPt8Fixed.R(recyclerView.getContext())) {
            return new QnHx(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.y(-1, this.g));
        return new QnHx(linearLayout, true);
    }
}
