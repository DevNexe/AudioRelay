package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import defpackage.a83;

/* JADX INFO: loaded from: classes.dex */
public final class LPt8Fixed extends AnimatorListenerAdapter {
    public final /* synthetic */ FJCM.QnHx A;
    public final /* synthetic */ ViewGroup w;
    public final /* synthetic */ View x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ ck32.CQf z;

    public LPt8Fixed(ViewGroup viewGroup, View view, boolean z, ck32.CQf cQf, FJCM.QnHx qnHx) {
        this.w = viewGroup;
        this.x = view;
        this.y = z;
        this.z = cQf;
        this.A = qnHx;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.w;
        View view = this.x;
        viewGroup.endViewTransition(view);
        if (this.y) {
            a83.a(this.z.a, view);
        }
        this.A.a();
    }
}
