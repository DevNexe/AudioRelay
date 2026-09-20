package defpackage;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes3.dex */
public final class xG implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ la2 w;

    public xG(la2 la2Var) {
        this.w = la2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.w.i(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
