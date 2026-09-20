package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;

/* JADX INFO: loaded from: classes3.dex */
public final class sd extends AnimatorListenerAdapter {
    public final /* synthetic */ BottomAppBar w;

    public sd(BottomAppBar bottomAppBar) {
        this.w = bottomAppBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        BottomAppBar bottomAppBar = this.w;
        bottomAppBar.getClass();
        bottomAppBar.n0 = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.w.getClass();
    }
}
