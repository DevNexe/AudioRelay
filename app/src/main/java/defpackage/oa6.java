package defpackage;

import android.view.View;
import com.google.android.gms.internal.ads.zzcdo;
import com.google.android.gms.internal.ads.zzcmu;

/* JADX INFO: loaded from: classes3.dex */
public final class oa6 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ zzcdo w;
    public final /* synthetic */ zzcmu x;

    public oa6(zzcmu zzcmuVar, zzcdo zzcdoVar) {
        this.x = zzcmuVar;
        this.w = zzcdoVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = zzcmu.zzb;
        this.x.d(view, this.w, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
