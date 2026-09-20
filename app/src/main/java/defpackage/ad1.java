package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;

/* JADX INFO: loaded from: classes3.dex */
public final class ad1 extends AnimatorListenerAdapter {
    public final /* synthetic */ HideBottomViewOnScrollBehavior w;

    public ad1(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior) {
        this.w = hideBottomViewOnScrollBehavior;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.w.d = null;
    }
}
