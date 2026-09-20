package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.azefsw.audioconnect.R;
import defpackage.bi5;
import defpackage.ef0;
import defpackage.fa2;
import defpackage.gl;
import defpackage.lf5;
import defpackage.n83;
import defpackage.vy2;
import defpackage.xj5;
import defpackage.zg2;
import java.util.Calendar;

/* JADX INFO: loaded from: classes3.dex */
final class MaterialCalendarGridView extends GridView {
    public final Calendar w;
    public final boolean x;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.w = lf5.d(null);
        if (LPt8Fixed.R(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.x = LPt8Fixed.S(getContext(), R.attr.nestedScrollable);
        bi5.m(this, new fa2());
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final NUlFixed getAdapter() {
        return (NUlFixed) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int iA;
        int width;
        int iA2;
        int width2;
        int width3;
        int i;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        NUlFixed adapter = getAdapter();
        ef0<?> ef0Var = adapter.x;
        n83 n83Var = adapter.z;
        Long item = adapter.getItem(adapter.a());
        Long item2 = adapter.getItem(adapter.c());
        for (vy2<Long, Long> vy2Var : ef0Var.g()) {
            Long l = vy2Var.a;
            if (l != null) {
                Long l2 = vy2Var.b;
                if (l2 != null) {
                    long jLongValue = l.longValue();
                    long jLongValue2 = l2.longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Long lValueOf2 = Long.valueOf(jLongValue2);
                    if (!(item == null || item2 == null || lValueOf == null || lValueOf2 == null || lValueOf.longValue() > item2.longValue() || lValueOf2.longValue() < item.longValue())) {
                        boolean zA = xj5.a(this);
                        long jLongValue3 = item.longValue();
                        Calendar calendar = materialCalendarGridView.w;
                        zg2 zg2Var = adapter.w;
                        if (jLongValue < jLongValue3) {
                            iA = adapter.a();
                            width = iA % zg2Var.z == 0 ? 0 : !zA ? materialCalendarGridView.getChildAt(iA - 1).getRight() : materialCalendarGridView.getChildAt(iA - 1).getLeft();
                        } else {
                            calendar.setTimeInMillis(jLongValue);
                            iA = (calendar.get(5) - 1) + adapter.a();
                            View childAt = materialCalendarGridView.getChildAt(iA);
                            width = (childAt.getWidth() / 2) + childAt.getLeft();
                        }
                        if (jLongValue2 > item2.longValue()) {
                            iA2 = Math.min(adapter.c(), getChildCount() - 1);
                            width2 = (iA2 + 1) % zg2Var.z == 0 ? getWidth() : !zA ? materialCalendarGridView.getChildAt(iA2).getRight() : materialCalendarGridView.getChildAt(iA2).getLeft();
                        } else {
                            calendar.setTimeInMillis(jLongValue2);
                            iA2 = (calendar.get(5) - 1) + adapter.a();
                            View childAt2 = materialCalendarGridView.getChildAt(iA2);
                            width2 = (childAt2.getWidth() / 2) + childAt2.getLeft();
                        }
                        int itemId = (int) adapter.getItemId(iA);
                        int itemId2 = (int) adapter.getItemId(iA2);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            int numColumns2 = (getNumColumns() + numColumns) - 1;
                            View childAt3 = materialCalendarGridView.getChildAt(numColumns);
                            int top = childAt3.getTop() + ((gl) n83Var.a).a.top;
                            int bottom = childAt3.getBottom() - ((gl) n83Var.a).a.bottom;
                            if (zA) {
                                int i2 = iA2 > numColumns2 ? 0 : width2;
                                width3 = numColumns > iA ? getWidth() : width;
                                i = i2;
                            } else {
                                i = numColumns > iA ? 0 : width;
                                width3 = iA2 > numColumns2 ? getWidth() : width2;
                            }
                            canvas.drawRect(i, top, width3, bottom, (Paint) n83Var.h);
                            itemId++;
                            materialCalendarGridView = this;
                            adapter = adapter;
                        }
                    }
                }
            }
            materialCalendarGridView = this;
            adapter = adapter;
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (!z) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33) {
            setSelection(getAdapter().c());
        } else if (i == 130) {
            setSelection(getAdapter().a());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().a()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter().a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.x) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        if (i < getAdapter().a()) {
            super.setSelection(getAdapter().a());
        } else {
            super.setSelection(i);
        }
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof NUlFixed)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), NUlFixed.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
