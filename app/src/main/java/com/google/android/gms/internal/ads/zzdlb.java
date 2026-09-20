package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.Set;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdlb extends zzdih {

    @GuardedBy("this")
    public boolean x;

    public zzdlb(Set set) {
        super(set);
    }

    public final void zza() {
        a(new zzdig() { // from class: com.google.android.gms.internal.ads.zzdkx
            @Override // com.google.android.gms.internal.ads.zzdig
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoEnd();
            }
        });
    }

    public final void zzb() {
        a(new zzdig() { // from class: com.google.android.gms.internal.ads.zzdkz
            @Override // com.google.android.gms.internal.ads.zzdig
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoPause();
            }
        });
    }

    public final synchronized void zzc() {
        if (!this.x) {
            a(zzdky.zza);
            this.x = true;
        }
        a(new zzdig() { // from class: com.google.android.gms.internal.ads.zzdla
            @Override // com.google.android.gms.internal.ads.zzdig
            public final void zza(Object obj) {
                ((VideoController.VideoLifecycleCallbacks) obj).onVideoPlay();
            }
        });
    }

    public final synchronized void zzd() {
        a(zzdky.zza);
        this.x = true;
    }
}
