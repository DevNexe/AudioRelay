package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class QnHx implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ CoordinatorLayout w;
    public final /* synthetic */ AppBarLayout x;
    public final /* synthetic */ AppBarLayout.BaseBehavior y;

    public QnHx(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        this.y = baseBehavior;
        this.w = coordinatorLayout;
        this.x = appBarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.y.A(this.w, this.x, iIntValue);
    }
}
