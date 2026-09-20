package defpackage;

import android.animation.Animator;

/* JADX INFO: loaded from: classes.dex */
public final class wh0 implements bn.QnHx {
    public final /* synthetic */ Animator a;

    public wh0(Animator animator) {
        this.a = animator;
    }

    @Override // bn.QnHx
    public final void onCancel() {
        this.a.end();
    }
}
