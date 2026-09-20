package com.google.android.gms.ads.internal.util;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.ads.zzfph;

/* JADX INFO: loaded from: classes.dex */
public final class zzf extends zzfph {
    public zzf(Looper looper) {
        super(looper);
    }

    @Override // com.google.android.gms.internal.ads.zzfph
    public final void a(Message message) {
        try {
            super.a(message);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzq();
            zzs.zzI(com.google.android.gms.ads.internal.zzt.zzp().zzc(), th);
            throw th;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.zzp().zzt(e, "AdMobHandler.handleMessage");
        }
    }
}
