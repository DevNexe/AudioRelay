package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class vw extends ViewGroup {
    public final HashMap<X05, yy1> w;
    public final HashMap<yy1, X05> x;

    public vw(Context context) {
        super(context);
        setClipChildren(false);
        this.w = new HashMap<>();
        this.x = new HashMap<>();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<X05, yy1> getHolderToLayoutNode() {
        return this.w;
    }

    public final HashMap<yy1, X05> getLayoutNodeToHolder() {
        return this.x;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public final void onDescendantInvalidated(View view, View view2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (X05 x05 : this.w.keySet()) {
            x05.layout(x05.getLeft(), x05.getTop(), x05.getRight(), x05.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (!(View.MeasureSpec.getMode(i) == 1073741824)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(View.MeasureSpec.getMode(i2) == 1073741824)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        for (X05 x05 : this.w.keySet()) {
            int i4 = x05.L;
            if (i4 != Integer.MIN_VALUE && (i3 = x05.M) != Integer.MIN_VALUE) {
                x05.measure(i4, i3);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            yy1 yy1Var = this.w.get(childAt);
            if (childAt.isLayoutRequested() && yy1Var != null) {
                yy1.F1 f1 = yy1.p0;
                yy1Var.P(false);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
