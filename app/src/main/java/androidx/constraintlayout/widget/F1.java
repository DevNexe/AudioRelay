package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import defpackage.g7;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class F1 extends ViewGroup {
    public CQf w;

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new QnHx();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new QnHx(getContext(), attributeSet);
    }

    public CQf getConstraintSet() {
        if (this.w == null) {
            this.w = new CQf();
        }
        CQf cQf = this.w;
        cQf.getClass();
        int childCount = getChildCount();
        HashMap<Integer, CQf.QnHx> map = cQf.c;
        map.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            QnHx qnHx = (QnHx) childAt.getLayoutParams();
            int id = childAt.getId();
            if (cQf.b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id))) {
                map.put(Integer.valueOf(id), new CQf.QnHx());
            }
            CQf.QnHx qnHx2 = map.get(Integer.valueOf(id));
            if (childAt instanceof androidx.constraintlayout.widget.QnHx) {
                androidx.constraintlayout.widget.QnHx qnHx3 = (androidx.constraintlayout.widget.QnHx) childAt;
                qnHx2.c(id, qnHx);
                if (qnHx3 instanceof Barrier) {
                    CQf.C0021CQf c0021CQf = qnHx2.d;
                    c0021CQf.c0 = 1;
                    Barrier barrier = (Barrier) qnHx3;
                    c0021CQf.a0 = barrier.getType();
                    c0021CQf.d0 = barrier.getReferencedIds();
                    c0021CQf.b0 = barrier.getMargin();
                }
            }
            qnHx2.c(id, qnHx);
        }
        return this.w;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.QnHx(layoutParams);
    }

    public static class QnHx extends ConstraintLayout.QnHx {
        public final float m0;
        public final boolean n0;
        public final float o0;
        public final float p0;
        public final float q0;
        public final float r0;
        public final float s0;
        public final float t0;
        public final float u0;
        public final float v0;
        public final float w0;
        public final float x0;
        public final float y0;

        public QnHx() {
            this.m0 = 1.0f;
            this.n0 = false;
            this.o0 = 0.0f;
            this.p0 = 0.0f;
            this.q0 = 0.0f;
            this.r0 = 0.0f;
            this.s0 = 1.0f;
            this.t0 = 1.0f;
            this.u0 = 0.0f;
            this.v0 = 0.0f;
            this.w0 = 0.0f;
            this.x0 = 0.0f;
            this.y0 = 0.0f;
        }

        public QnHx(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.m0 = 1.0f;
            this.n0 = false;
            this.o0 = 0.0f;
            this.p0 = 0.0f;
            this.q0 = 0.0f;
            this.r0 = 0.0f;
            this.s0 = 1.0f;
            this.t0 = 1.0f;
            this.u0 = 0.0f;
            this.v0 = 0.0f;
            this.w0 = 0.0f;
            this.x0 = 0.0f;
            this.y0 = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g7.z);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 15) {
                    this.m0 = typedArrayObtainStyledAttributes.getFloat(index, this.m0);
                } else if (index == 28) {
                    this.o0 = typedArrayObtainStyledAttributes.getFloat(index, this.o0);
                    this.n0 = true;
                } else if (index == 23) {
                    this.q0 = typedArrayObtainStyledAttributes.getFloat(index, this.q0);
                } else if (index == 24) {
                    this.r0 = typedArrayObtainStyledAttributes.getFloat(index, this.r0);
                } else if (index == 22) {
                    this.p0 = typedArrayObtainStyledAttributes.getFloat(index, this.p0);
                } else if (index == 20) {
                    this.s0 = typedArrayObtainStyledAttributes.getFloat(index, this.s0);
                } else if (index == 21) {
                    this.t0 = typedArrayObtainStyledAttributes.getFloat(index, this.t0);
                } else if (index == 16) {
                    this.u0 = typedArrayObtainStyledAttributes.getFloat(index, this.u0);
                } else if (index == 17) {
                    this.v0 = typedArrayObtainStyledAttributes.getFloat(index, this.v0);
                } else if (index == 18) {
                    this.w0 = typedArrayObtainStyledAttributes.getFloat(index, this.w0);
                } else if (index == 19) {
                    this.x0 = typedArrayObtainStyledAttributes.getFloat(index, this.x0);
                } else if (index == 27) {
                    this.y0 = typedArrayObtainStyledAttributes.getFloat(index, this.y0);
                }
            }
        }
    }
}
