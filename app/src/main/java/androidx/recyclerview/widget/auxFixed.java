package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class auxFixed extends AnimatorListenerAdapter {
    public final /* synthetic */ RecyclerView.qc w;
    public final /* synthetic */ View x;
    public final /* synthetic */ ViewPropertyAnimator y;
    public final /* synthetic */ FJCM z;

    public auxFixed(View view, ViewPropertyAnimator viewPropertyAnimator, FJCM fjcm, RecyclerView.qc qcVar) {
        this.z = fjcm;
        this.w = qcVar;
        this.x = view;
        this.y = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.x.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.y.setListener(null);
        FJCM fjcm = this.z;
        RecyclerView.qc qcVar = this.w;
        fjcm.c(qcVar);
        fjcm.o.remove(qcVar);
        fjcm.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.z.getClass();
    }
}
