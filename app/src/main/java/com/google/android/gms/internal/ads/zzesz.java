package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class zzesz implements zzeun, zzeum {
    public final ApplicationInfo a;
    public final PackageInfo b;

    public zzesz(ApplicationInfo applicationInfo, PackageInfo packageInfo) {
        this.a = applicationInfo;
        this.b = packageInfo;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final int zza() {
        return 29;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final zzfyx zzb() {
        return zzfyo.zzi(this);
    }

    @Override // com.google.android.gms.internal.ads.zzeum
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.a.packageName;
        PackageInfo packageInfo = this.b;
        Integer numValueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
        bundle.putString("pn", str);
        if (numValueOf != null) {
            bundle.putInt("vc", numValueOf.intValue());
        }
        String str2 = packageInfo != null ? packageInfo.versionName : null;
        if (str2 != null) {
            bundle.putString("vnm", str2);
        }
    }
}
