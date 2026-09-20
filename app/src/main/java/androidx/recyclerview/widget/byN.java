package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class byN extends AnimatorListenerAdapter {
    public final /* synthetic */ FJCM.QnHx w;
    public final /* synthetic */ ViewPropertyAnimator x;
    public final /* synthetic */ View y;
    public final /* synthetic */ FJCM z;

    public byN(FJCM fjcm, FJCM.QnHx qnHx, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.z = fjcm;
        this.w = qnHx;
        this.x = viewPropertyAnimator;
        this.y = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.x.setListener(null);
        View view = this.y;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        FJCM.QnHx qnHx = this.w;
        RecyclerView.qc qcVar = qnHx.a;
        FJCM fjcm = this.z;
        fjcm.c(qcVar);
        fjcm.r.remove(qnHx.a);
        fjcm.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        RecyclerView.qc qcVar = this.w.a;
        this.z.getClass();
    }
}
