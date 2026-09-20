package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.e70;
import defpackage.g7;
import defpackage.k8;

/* JADX INFO: loaded from: classes.dex */
public class Barrier extends QnHx {
    public int C;
    public int D;
    public k8 E;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // androidx.constraintlayout.widget.QnHx
    public final void e(AttributeSet attributeSet) {
        super.e(attributeSet);
        this.E = new k8();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g7.y);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 15) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 14) {
                    this.E.h0 = typedArrayObtainStyledAttributes.getBoolean(index, true);
                } else if (index == 16) {
                    this.E.i0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
        }
        this.z = this.E;
        g();
    }

    @Override // androidx.constraintlayout.widget.QnHx
    public final void f(e70 e70Var, boolean z) {
        int i = this.C;
        this.D = i;
        if (z) {
            if (i == 5) {
                this.D = 1;
            } else if (i == 6) {
                this.D = 0;
            }
        } else if (i == 5) {
            this.D = 0;
        } else if (i == 6) {
            this.D = 1;
        }
        if (e70Var instanceof k8) {
            ((k8) e70Var).g0 = this.D;
        }
    }

    public int getMargin() {
        return this.E.i0;
    }

    public int getType() {
        return this.C;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.E.h0 = z;
    }

    public void setDpMargin(int i) {
        this.E.i0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.E.i0 = i;
    }

    public void setType(int i) {
        this.C = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
