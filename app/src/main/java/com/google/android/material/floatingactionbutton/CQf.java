package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes3.dex */
public final class CQf extends AnimatorListenerAdapter {
    public boolean w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ LPt8Fixed.YKK y;
    public final /* synthetic */ LPt8Fixed z;

    public CQf(LPt8Fixed lPt8, boolean z, QnHx qnHx) {
        this.z = lPt8;
        this.x = z;
        this.y = qnHx;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.w = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        LPt8Fixed lPt8 = this.z;
        lPt8.n = 0;
        lPt8.i = null;
        if (this.w) {
            return;
        }
        boolean z = this.x;
        lPt8.r.b(z ? 8 : 4, z);
        LPt8Fixed.YKK ykk = this.y;
        if (ykk != null) {
            QnHx qnHx = (QnHx) ykk;
            qnHx.a.a(qnHx.b);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        LPt8Fixed lPt8 = this.z;
        lPt8.r.b(0, this.x);
        lPt8.n = 1;
        lPt8.i = animator;
        this.w = false;
    }
}
