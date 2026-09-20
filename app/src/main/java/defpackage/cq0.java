package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.textfield.CQf;

/* JADX INFO: loaded from: classes3.dex */
public final class cq0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ CQf w;

    public cq0(CQf cQf) {
        this.w = cQf;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.w.c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
