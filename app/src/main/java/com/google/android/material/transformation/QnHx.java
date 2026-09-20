package com.google.android.material.transformation;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class QnHx implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View w;

    public QnHx(View view) {
        this.w = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.w.invalidate();
    }
}
