package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.textfield.CQf;

/* JADX INFO: loaded from: classes3.dex */
public final class fq0 extends AnimatorListenerAdapter {
    public final /* synthetic */ CQf w;

    public fq0(CQf cQf) {
        this.w = cQf;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        CQf cQf = this.w;
        cQf.c.setChecked(cQf.j);
        cQf.p.start();
    }
}
