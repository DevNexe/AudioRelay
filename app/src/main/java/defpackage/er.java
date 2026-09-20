package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.textfield.QnHx;

/* JADX INFO: loaded from: classes3.dex */
public final class er implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ QnHx w;

    public er(QnHx qnHx) {
        this.w = qnHx;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.w.c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
