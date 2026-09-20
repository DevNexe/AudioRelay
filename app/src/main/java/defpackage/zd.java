package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes3.dex */
public final class zd implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ BottomSheetBehavior w;

    public zd(BottomSheetBehavior bottomSheetBehavior) {
        this.w = bottomSheetBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        la2 la2Var = this.w.i;
        if (la2Var != null) {
            la2.CQf cQf = la2Var.w;
            if (cQf.j != fFloatValue) {
                cQf.j = fFloatValue;
                la2Var.A = true;
                la2Var.invalidateSelf();
            }
        }
    }
}
