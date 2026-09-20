package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.transformation.ExpandableTransformationBehavior;

/* JADX INFO: loaded from: classes3.dex */
public final class pv0 extends AnimatorListenerAdapter {
    public final /* synthetic */ ExpandableTransformationBehavior w;

    public pv0(ExpandableTransformationBehavior expandableTransformationBehavior) {
        this.w = expandableTransformationBehavior;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.w.b = null;
    }
}
