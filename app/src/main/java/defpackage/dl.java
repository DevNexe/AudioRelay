package defpackage;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class dl implements cl {
    public final int[] a = new int[2];
    public final float[] b = eu.c();

    @Override // defpackage.cl
    public final void a(View view, float[] fArr) {
        eu.i(fArr);
        c(view, fArr);
    }

    public final void b(float[] fArr, float f, float f2) {
        float[] fArr2 = this.b;
        eu.i(fArr2);
        eu.k(fArr2, f, f2);
        bHr.a(fArr, fArr2);
    }

    public final void c(View view, float[] fArr) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            c((View) parent, fArr);
            b(fArr, -view.getScrollX(), -view.getScrollY());
            b(fArr, view.getLeft(), view.getTop());
        } else {
            int[] iArr = this.a;
            view.getLocationInWindow(iArr);
            b(fArr, -view.getScrollX(), -view.getScrollY());
            b(fArr, iArr[0], iArr[1]);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        float[] fArr2 = this.b;
        X.D(fArr2, matrix);
        bHr.a(fArr, fArr2);
    }
}
