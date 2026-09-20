package com.google.android.material.datepicker;

import android.content.Context;
import android.icu.text.DateFormat;
import android.icu.util.TimeZone;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.azefsw.audioconnect.R;
import defpackage.ef0;
import defpackage.gl;
import defpackage.lf5;
import defpackage.n83;
import defpackage.zg2;
import j$.util.DesugarTimeZone;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class NUlFixed extends BaseAdapter {
    public static final int B = lf5.d(null).getMaximum(4);
    public final QnHx A;
    public final zg2 w;
    public final ef0<?> x;
    public Collection<Long> y;
    public n83 z;

    public NUlFixed(zg2 zg2Var, ef0<?> ef0Var, QnHx qnHx) {
        this.w = zg2Var;
        this.x = ef0Var;
        this.A = qnHx;
        this.y = ef0Var.s();
    }

    public final int a() {
        return this.w.n();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        zg2 zg2Var = this.w;
        if (i < zg2Var.n() || i > c()) {
            return null;
        }
        int iN = (i - zg2Var.n()) + 1;
        Calendar calendarB = lf5.b(zg2Var.w);
        calendarB.set(5, iN);
        return Long.valueOf(calendarB.getTimeInMillis());
    }

    public final int c() {
        zg2 zg2Var = this.w;
        return (zg2Var.n() + zg2Var.A) - 1;
    }

    public final void d(TextView textView, long j) {
        gl glVar;
        if (textView == null) {
            return;
        }
        boolean z = false;
        if (this.A.y.p(j)) {
            textView.setEnabled(true);
            Iterator<Long> it = this.x.s().iterator();
            while (it.hasNext()) {
                if (lf5.a(j) == lf5.a(it.next().longValue())) {
                    z = true;
                    break;
                }
            }
            if (z) {
                glVar = (gl) this.z.b;
            } else {
                glVar = lf5.c().getTimeInMillis() == j ? (gl) this.z.c : (gl) this.z.a;
            }
        } else {
            textView.setEnabled(false);
            glVar = (gl) this.z.g;
        }
        glVar.b(textView);
    }

    public final void e(MaterialCalendarGridView materialCalendarGridView, long j) {
        zg2 zg2VarL = zg2.l(j);
        zg2 zg2Var = this.w;
        if (zg2VarL.equals(zg2Var)) {
            Calendar calendarB = lf5.b(zg2Var.w);
            calendarB.setTimeInMillis(j);
            d((TextView) materialCalendarGridView.getChildAt((materialCalendarGridView.getAdapter().a() + (calendarB.get(5) - 1)) - materialCalendarGridView.getFirstVisiblePosition()), j);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return a() + this.w.A;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.w.z;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00fe  */
    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        CharSequence charSequence;
        CharSequence charSequence2;
        Context context = viewGroup.getContext();
        if (this.z == null) {
            this.z = new n83(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int iA = i - a();
        if (iA >= 0) {
            zg2 zg2Var = this.w;
            if (iA >= zg2Var.A) {
                textView.setVisibility(8);
                textView.setEnabled(false);
            } else {
                int i2 = iA + 1;
                textView.setTag(zg2Var);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(i2)));
                Calendar calendarB = lf5.b(zg2Var.w);
                calendarB.set(5, i2);
                long timeInMillis = calendarB.getTimeInMillis();
                Calendar calendarC = lf5.c();
                calendarC.set(5, 1);
                Calendar calendarB2 = lf5.b(calendarC);
                calendarB2.get(2);
                int i3 = calendarB2.get(1);
                calendarB2.getMaximum(7);
                calendarB2.getActualMaximum(5);
                calendarB2.getTimeInMillis();
                if (zg2Var.y == i3) {
                    Locale locale = Locale.getDefault();
                    if (Build.VERSION.SDK_INT >= 24) {
                        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("MMMEd", locale);
                        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
                        charSequence2 = instanceForSkeleton.format(new Date(timeInMillis));
                    } else {
                        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(0, locale);
                        dateInstance.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                        charSequence2 = dateInstance.format(new Date(timeInMillis));
                    }
                    textView.setContentDescription(charSequence2);
                } else {
                    Locale locale2 = Locale.getDefault();
                    if (Build.VERSION.SDK_INT >= 24) {
                        DateFormat instanceForSkeleton2 = DateFormat.getInstanceForSkeleton("yMMMEd", locale2);
                        instanceForSkeleton2.setTimeZone(TimeZone.getTimeZone("UTC"));
                        charSequence = instanceForSkeleton2.format(new Date(timeInMillis));
                    } else {
                        java.text.DateFormat dateInstance2 = java.text.DateFormat.getDateInstance(0, locale2);
                        dateInstance2.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                        charSequence = dateInstance2.format(new Date(timeInMillis));
                    }
                    textView.setContentDescription(charSequence);
                }
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        } else {
            textView.setVisibility(8);
            textView.setEnabled(false);
        }
        Long item = getItem(i);
        if (item != null) {
            d(textView, item.longValue());
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
