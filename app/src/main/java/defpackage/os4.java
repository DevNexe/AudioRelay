package defpackage;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedAPI"})
public class os4 extends xo0 {
    public QnHx J;
    public boolean K;

    public static class QnHx extends xo0.F1 {
        public int[][] H;

        public QnHx(QnHx qnHx, os4 os4Var, Resources resources) {
            super(qnHx, os4Var, resources);
            if (qnHx != null) {
                this.H = qnHx.H;
            } else {
                this.H = new int[this.g.length][];
            }
        }

        @Override // xo0.F1
        public void e() {
            int[][] iArr = this.H;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[] iArr3 = this.H[length];
                iArr2[length] = iArr3 != null ? (int[]) iArr3.clone() : null;
            }
            this.H = iArr2;
        }

        public final int f(int[] iArr) {
            int[][] iArr2 = this.H;
            int i = this.h;
            for (int i2 = 0; i2 < i; i2++) {
                if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                    return i2;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new os4(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new os4(this, resources);
        }
    }

    public os4(QnHx qnHx, Resources resources) {
        e(new QnHx(qnHx, this, resources));
        onStateChange(getState());
    }

    @Override // defpackage.xo0, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // defpackage.xo0
    public void e(xo0.F1 f1) {
        this.w = f1;
        int i = this.C;
        if (i >= 0) {
            Drawable drawableD = f1.d(i);
            this.y = drawableD;
            if (drawableD != null) {
                c(drawableD);
            }
        }
        this.z = null;
        if (f1 instanceof QnHx) {
            this.J = (QnHx) f1;
        }
    }

    @Override // defpackage.xo0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public QnHx b() {
        return new QnHx(this.J, this, null);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // defpackage.xo0, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.K) {
            super.mutate();
            this.J.e();
            this.K = true;
        }
        return this;
    }

    @Override // defpackage.xo0, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        int iF = this.J.f(iArr);
        if (iF < 0) {
            iF = this.J.f(StateSet.WILD_CARD);
        }
        return d(iF) || zOnStateChange;
    }

    public os4() {
    }
}
