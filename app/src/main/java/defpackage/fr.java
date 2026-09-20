package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.textfield.QnHx;

/* JADX INFO: loaded from: classes3.dex */
public final class fr implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ QnHx w;

    public fr(QnHx qnHx) {
        this.w = qnHx;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        QnHx qnHx = this.w;
        qnHx.c.setScaleX(fFloatValue);
        qnHx.c.setScaleY(fFloatValue);
    }
}
