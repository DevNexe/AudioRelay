package com.google.android.gms.ads.internal.overlay;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbiy;

/* JADX INFO: loaded from: classes.dex */
public final class zzr extends FrameLayout implements View.OnClickListener {
    public final ImageButton w;
    public final zzad x;

    /* JADX WARN: Code restructure failed: missing block: B:33:0x005c, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzr(android.content.Context r6, com.google.android.gms.ads.internal.overlay.zzq r7, com.google.android.gms.ads.internal.overlay.zzad r8) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzr.<init>(android.content.Context, com.google.android.gms.ads.internal.overlay.zzq, com.google.android.gms.ads.internal.overlay.zzad):void");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zzad zzadVar = this.x;
        if (zzadVar != null) {
            zzadVar.zzbJ();
        }
    }

    public final void zzb(boolean z) {
        ImageButton imageButton = this.w;
        if (!z) {
            imageButton.setVisibility(0);
            return;
        }
        imageButton.setVisibility(8);
        if (((Long) zzay.zzc().zzb(zzbiy.zzaW)).longValue() > 0) {
            imageButton.animate().cancel();
            imageButton.clearAnimation();
        }
    }
}
