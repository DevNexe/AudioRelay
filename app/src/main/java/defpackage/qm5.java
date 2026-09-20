package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class qm5 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ ms1 w;

    public qm5(qr4 qr4Var) {
        this.w = qr4Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        this.w.m(null);
    }
}
