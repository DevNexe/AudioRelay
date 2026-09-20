package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ns4 {
    public final ArrayList<CQf> a = new ArrayList<>();
    public ValueAnimator b = null;
    public final QnHx c = new QnHx();

    public static class CQf {
        public CQf(int[] iArr, ValueAnimator valueAnimator) {
        }
    }

    public class QnHx extends AnimatorListenerAdapter {
        public QnHx() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ns4 ns4Var = ns4.this;
            if (ns4Var.b == animator) {
                ns4Var.b = null;
            }
        }
    }

    public final void a(int[] iArr, ValueAnimator valueAnimator) {
        CQf cQf = new CQf(iArr, valueAnimator);
        valueAnimator.addListener(this.c);
        this.a.add(cQf);
    }
}
