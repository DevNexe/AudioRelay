package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class QH extends AnimatorListenerAdapter {
    public final /* synthetic */ C04287o A00;

    public QH(C04287o c04287o) {
        this.A00 = c04287o;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A00.A04.postDelayed(new KU(this), 2000L);
    }
}
