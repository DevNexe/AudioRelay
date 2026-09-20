package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

/* JADX INFO: loaded from: classes3.dex */
public final class td extends AnimatorListenerAdapter {
    public final /* synthetic */ BottomAppBar A;
    public boolean w;
    public final /* synthetic */ ActionMenuView x;
    public final /* synthetic */ int y;
    public final /* synthetic */ boolean z;

    public td(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i, boolean z) {
        this.A = bottomAppBar;
        this.x = actionMenuView;
        this.y = i;
        this.z = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.w = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.w) {
            return;
        }
        BottomAppBar bottomAppBar = this.A;
        int i = bottomAppBar.r0;
        boolean z = i != 0;
        if (i != 0) {
            bottomAppBar.r0 = 0;
            bottomAppBar.getMenu().clear();
            bottomAppBar.k(i);
        }
        bottomAppBar.w(this.x, this.y, this.z, z);
    }
}
