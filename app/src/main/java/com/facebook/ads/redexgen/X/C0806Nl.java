package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0806Nl extends ViewGroup {
    public static final int A01 = (int) (Lr.A00 * 8.0f);
    public int A00;

    public C0806Nl(C1075Xy c1075Xy) {
        super(c1075Xy);
        setMotionEventSplittingEnabled(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childHeight = i3 - i;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            if (paddingLeft + measuredWidth > childHeight) {
                paddingLeft = getPaddingLeft();
                paddingTop += this.A00;
            }
            childAt.layout(paddingLeft, paddingTop, paddingLeft + measuredWidth, paddingTop + measuredHeight);
            paddingLeft += A01 + measuredWidth;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        int size = (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom();
        int paddingLeft = getPaddingLeft();
        int iMax = 0;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        int i4 = getChildCount() > 0 ? 1 : 0;
        for (int i5 = 0; i5 < lines; i5++) {
            View child = getChildAt(i5);
            int lines = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
            child.measure(lines, iMakeMeasureSpec);
            int measuredWidth = child.getMeasuredWidth();
            int measuredHeight = child.getMeasuredHeight();
            int childWidth = A01;
            iMax = Math.max(iMax, measuredHeight + childWidth);
            int childWidth2 = paddingLeft + measuredWidth;
            if (childWidth2 > i3) {
                i4++;
                paddingLeft = getPaddingLeft();
            }
            int childWidth3 = A01;
            paddingLeft += childWidth3 + measuredWidth;
        }
        this.A00 = iMax;
        setMeasuredDimension(i3, (this.A00 * i4) + A01);
    }
}
