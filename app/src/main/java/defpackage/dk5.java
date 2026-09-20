package defpackage;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class dk5 extends ck5 {
    @Override // defpackage.bk5, defpackage.kd
    public final void A(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.ck5, defpackage.kd
    public final void D(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // defpackage.zj5
    public final float H(View view) {
        return view.getTransitionAlpha();
    }

    @Override // defpackage.zj5
    public final void I(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // defpackage.ak5
    public final void J(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // defpackage.ak5
    public final void K(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
