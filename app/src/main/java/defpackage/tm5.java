package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class tm5 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View w;
    public final /* synthetic */ uk3 x;

    public tm5(View view, uk3 uk3Var) {
        this.w = view;
        this.x = uk3Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.w.removeOnAttachStateChangeListener(this);
        this.x.t();
    }
}
