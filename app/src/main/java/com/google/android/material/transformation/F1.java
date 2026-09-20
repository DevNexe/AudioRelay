package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import defpackage.yq;

/* JADX INFO: loaded from: classes3.dex */
public final class F1 extends AnimatorListenerAdapter {
    public final /* synthetic */ yq w;

    public F1(yq yqVar) {
        this.w = yqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        yq yqVar = this.w;
        yq.LPt8Fixed revealInfo = yqVar.getRevealInfo();
        revealInfo.c = Float.MAX_VALUE;
        yqVar.setRevealInfo(revealInfo);
    }
}
