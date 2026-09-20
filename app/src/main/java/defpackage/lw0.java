package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class lw0 extends ik5 {

    public static class QnHx extends AnimatorListenerAdapter {
        public final View w;
        public boolean x = false;

        public QnHx(View view) {
            this.w = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ak5 ak5Var = wj5.a;
            View view = this.w;
            ak5Var.I(view, 1.0f);
            if (this.x) {
                view.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            Field field = bi5.a;
            View view = this.w;
            if (bi5.LPt8Fixed.h(view) && view.getLayerType() == 0) {
                this.x = true;
                view.setLayerType(2, null);
            }
        }
    }

    public lw0(int i) {
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.T = i;
    }

    public final ObjectAnimator S(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        wj5.a.I(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, wj5.b, f2);
        objectAnimatorOfFloat.addListener(new QnHx(view));
        a(new kw0(view));
        return objectAnimatorOfFloat;
    }

    @Override // defpackage.u95
    public final void k(la5 la5Var) {
        Q(la5Var);
        la5Var.a.put("android:fade:transitionAlpha", Float.valueOf(wj5.a.H(la5Var.b)));
    }
}
