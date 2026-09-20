package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import defpackage.yq;

/* JADX INFO: loaded from: classes3.dex */
public final class CQf extends AnimatorListenerAdapter {
    public final /* synthetic */ yq w;
    public final /* synthetic */ Drawable x;

    public CQf(yq yqVar, Drawable drawable) {
        this.w = yqVar;
        this.x = drawable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.w.setCircularRevealOverlayDrawable(null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.w.setCircularRevealOverlayDrawable(this.x);
    }
}
