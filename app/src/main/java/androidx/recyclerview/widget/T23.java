package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class T23 extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewPropertyAnimator A;
    public final /* synthetic */ FJCM B;
    public final /* synthetic */ RecyclerView.qc w;
    public final /* synthetic */ int x;
    public final /* synthetic */ View y;
    public final /* synthetic */ int z;

    public T23(FJCM fjcm, RecyclerView.qc qcVar, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.B = fjcm;
        this.w = qcVar;
        this.x = i;
        this.y = view;
        this.z = i2;
        this.A = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.x;
        View view = this.y;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.z != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A.setListener(null);
        FJCM fjcm = this.B;
        RecyclerView.qc qcVar = this.w;
        fjcm.c(qcVar);
        fjcm.p.remove(qcVar);
        fjcm.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.B.getClass();
    }
}
