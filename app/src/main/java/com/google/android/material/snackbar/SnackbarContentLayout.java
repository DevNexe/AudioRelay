package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.azefsw.audioconnect.R;
import defpackage.Th;
import defpackage.bi5;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
public class SnackbarContentLayout extends LinearLayout {
    public TextView w;
    public Button x;
    public final int y;
    public int z;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Th.S);
        this.y = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final boolean a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.w.getPaddingTop() == i2 && this.w.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.w;
        Field field = bi5.a;
        if (bi5.NUlFixed.g(textView)) {
            bi5.NUlFixed.k(textView, bi5.NUlFixed.f(textView), i2, bi5.NUlFixed.e(textView), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    public Button getActionView() {
        return this.x;
    }

    public TextView getMessageView() {
        return this.w;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.w = (TextView) findViewById(R.id.snackbar_text);
        this.x = (Button) findViewById(R.id.snackbar_action);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.y;
        if (i3 > 0 && getMeasuredWidth() > i3) {
            i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            super.onMeasure(i, i2);
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        boolean z = false;
        boolean z2 = this.w.getLayout().getLineCount() > 1;
        if (!z2 || this.z <= 0 || this.x.getMeasuredWidth() <= this.z) {
            if (!z2) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (a(0, dimensionPixelSize, dimensionPixelSize)) {
                z = true;
            }
        } else if (a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            z = true;
        }
        if (z) {
            super.onMeasure(i, i2);
        }
    }

    public void setMaxInlineActionWidth(int i) {
        this.z = i;
    }
}
