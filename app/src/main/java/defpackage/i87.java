package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.gms.ads.internal.overlay.zzr;

/* JADX INFO: loaded from: classes.dex */
public final class i87 extends AnimatorListenerAdapter {
    public final /* synthetic */ zzr w;

    public i87(zzr zzrVar) {
        this.w = zzrVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        zzr zzrVar = this.w;
        zzrVar.setClickable(true);
        zzrVar.w.setClickable(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        zzr zzrVar = this.w;
        zzrVar.setClickable(true);
        zzrVar.w.setClickable(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        zzr zzrVar = this.w;
        zzrVar.setClickable(false);
        zzrVar.w.setClickable(false);
    }
}
