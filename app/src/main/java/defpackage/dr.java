package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.textfield.QnHx;

/* JADX INFO: loaded from: classes3.dex */
public final class dr extends AnimatorListenerAdapter {
    public final /* synthetic */ QnHx w;

    public dr(QnHx qnHx) {
        this.w = qnHx;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.w.a.setEndIconVisible(false);
    }
}
