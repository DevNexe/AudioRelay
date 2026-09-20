package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public class io0 extends ViewGroup {
    public boolean w;

    public io0(Context context) {
        super(context);
        setClipChildren(false);
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final void a(dn dnVar, View view, long j) {
        Canvas canvas = F6mt.a;
        super.drawChild(((ZCR) dnVar).a, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        boolean z;
        int childCount = super.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                z = false;
                break;
            }
            View childAt = getChildAt(i);
            if (childAt == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            }
            if (((ej5) childAt).D) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            this.w = true;
            try {
                super.dispatchDraw(canvas);
            } finally {
                this.w = false;
            }
        }
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.w) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }
}
