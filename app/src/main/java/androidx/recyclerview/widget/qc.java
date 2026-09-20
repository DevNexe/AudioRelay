package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class qc extends RecyclerView.byN {
    public final boolean g = true;

    @Override // androidx.recyclerview.widget.RecyclerView.byN
    public final boolean a(RecyclerView.qc qcVar, RecyclerView.qc qcVar2, RecyclerView.byN.F1 f1, RecyclerView.byN.F1 f2) {
        int i;
        int i2;
        int i3 = f1.a;
        int i4 = f1.b;
        if (qcVar2.o()) {
            int i5 = f1.a;
            i2 = f1.b;
            i = i5;
        } else {
            i = f2.a;
            i2 = f2.b;
        }
        FJCM fjcm = (FJCM) this;
        if (qcVar == qcVar2) {
            return fjcm.g(qcVar, i3, i4, i, i2);
        }
        View view = qcVar.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        fjcm.l(qcVar);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        fjcm.l(qcVar2);
        float f = -((int) ((i - i3) - translationX));
        View view2 = qcVar2.a;
        view2.setTranslationX(f);
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(0.0f);
        fjcm.k.add(new FJCM.QnHx(qcVar, qcVar2, i3, i4, i, i2));
        return true;
    }

    public abstract boolean g(RecyclerView.qc qcVar, int i, int i2, int i3, int i4);
}
