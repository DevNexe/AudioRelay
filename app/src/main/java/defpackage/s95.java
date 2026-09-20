package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class s95 extends AnimatorListenerAdapter {
    public final /* synthetic */ u95 w;

    public s95(u95 u95Var) {
        this.w = u95Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.w.r();
        animator.removeListener(this);
    }
}
