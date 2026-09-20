package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes3.dex */
public final class F1 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean w;
    public final /* synthetic */ LPt8Fixed.YKK x;
    public final /* synthetic */ LPt8Fixed y;

    public F1(LPt8Fixed lPt8, boolean z, QnHx qnHx) {
        this.y = lPt8;
        this.w = z;
        this.x = qnHx;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        LPt8Fixed lPt8 = this.y;
        lPt8.n = 0;
        lPt8.i = null;
        LPt8Fixed.YKK ykk = this.x;
        if (ykk != null) {
            ((QnHx) ykk).a.b();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        LPt8Fixed lPt8 = this.y;
        lPt8.r.b(0, this.w);
        lPt8.n = 2;
        lPt8.i = animator;
    }
}
