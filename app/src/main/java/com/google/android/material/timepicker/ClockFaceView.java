package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.azefsw.audioconnect.R;
import defpackage.Th;
import defpackage.UT;
import defpackage.XTd3;
import defpackage.bi5;
import defpackage.ja2;
import defpackage.sh3;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
class ClockFaceView extends sh3 implements ClockHandView.QnHx {
    public final ClockHandView P;
    public final Rect Q;
    public final RectF R;
    public final SparseArray<TextView> S;
    public final CQf T;
    public final int[] U;
    public final float[] V;
    public final int W;
    public final int a0;
    public final int b0;
    public final int c0;
    public String[] d0;
    public float e0;
    public final ColorStateList f0;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.Q = new Rect();
        this.R = new RectF();
        SparseArray<TextView> sparseArray = new SparseArray<>();
        this.S = sparseArray;
        this.V = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Th.B, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListB = ja2.b(context, typedArrayObtainStyledAttributes, 1);
        this.f0 = colorStateListB;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.P = clockHandView;
        this.W = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateListB.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListB.getDefaultColor());
        this.U = new int[]{colorForState, colorForState, colorStateListB.getDefaultColor()};
        clockHandView.w.add(this);
        int defaultColor = XTd3.k(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListB2 = ja2.b(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateListB2 != null ? colorStateListB2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new QnHx(this));
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.T = new CQf(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.d0 = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        for (int i = 0; i < Math.max(this.d0.length, size); i++) {
            TextView textView = sparseArray.get(i);
            if (i >= this.d0.length) {
                removeView(textView);
                sparseArray.remove(i);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.d0[i]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i));
                bi5.m(textView, this.T);
                textView.setTextColor(this.f0);
            }
        }
        this.a0 = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.b0 = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.c0 = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.QnHx
    public final void a(float f) {
        if (Math.abs(this.e0 - f) > 0.001f) {
            this.e0 = f;
            h();
        }
    }

    public final void h() {
        RectF rectF = this.P.A;
        int i = 0;
        while (true) {
            SparseArray<TextView> sparseArray = this.S;
            if (i >= sparseArray.size()) {
                return;
            }
            TextView textView = sparseArray.get(i);
            if (textView != null) {
                Rect rect = this.Q;
                textView.getDrawingRect(rect);
                rect.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                offsetDescendantRectToMyCoords(textView, rect);
                RectF rectF2 = this.R;
                rectF2.set(rect);
                textView.getPaint().setShader(!RectF.intersects(rectF, rectF2) ? null : new RadialGradient(rectF.centerX() - rectF2.left, rectF.centerY() - rectF2.top, 0.5f * rectF.width(), this.U, this.V, Shader.TileMode.CLAMP));
                textView.invalidate();
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) UT.CQf.a(1, this.d0.length, 1).a);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        h();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.c0 / Math.max(Math.max(this.a0 / displayMetrics.heightPixels, this.b0 / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }
}
