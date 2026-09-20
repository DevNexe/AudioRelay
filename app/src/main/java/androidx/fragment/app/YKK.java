package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import defpackage.bn;

/* JADX INFO: loaded from: classes.dex */
public final class YKK implements bn.QnHx {
    public final /* synthetic */ View a;
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ FJCM.QnHx c;

    public YKK(View view, ViewGroup viewGroup, FJCM.QnHx qnHx) {
        this.a = view;
        this.b = viewGroup;
        this.c = qnHx;
    }

    @Override // bn.QnHx
    public final void onCancel() {
        View view = this.a;
        view.clearAnimation();
        this.b.endViewTransition(view);
        this.c.a();
    }
}
