package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class r95 extends AnimatorListenerAdapter {
    public final /* synthetic */ Bt7j w;
    public final /* synthetic */ u95 x;

    public r95(u95 u95Var, Bt7j bt7j) {
        this.x = u95Var;
        this.w = bt7j;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.w.remove(animator);
        this.x.I.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.x.I.add(animator);
    }
}
