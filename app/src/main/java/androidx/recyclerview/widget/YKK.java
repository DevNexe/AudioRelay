package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class YKK extends AnimatorListenerAdapter {
    public final /* synthetic */ RecyclerView.qc w;
    public final /* synthetic */ ViewPropertyAnimator x;
    public final /* synthetic */ View y;
    public final /* synthetic */ FJCM z;

    public YKK(View view, ViewPropertyAnimator viewPropertyAnimator, FJCM fjcm, RecyclerView.qc qcVar) {
        this.z = fjcm;
        this.w = qcVar;
        this.x = viewPropertyAnimator;
        this.y = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.x.setListener(null);
        this.y.setAlpha(1.0f);
        FJCM fjcm = this.z;
        RecyclerView.qc qcVar = this.w;
        fjcm.c(qcVar);
        fjcm.q.remove(qcVar);
        fjcm.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.z.getClass();
    }
}
