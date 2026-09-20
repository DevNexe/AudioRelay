package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.internal.ads.zzblo;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes.dex */
@ParametersAreNonnullByDefault
public class MediationNativeAdConfiguration extends MediationAdConfiguration {
    public final zzblo j;

    public MediationNativeAdConfiguration(Context context, String str, Bundle bundle, Bundle bundle2, boolean z, Location location, int i, int i2, String str2, String str3, zzblo zzbloVar) {
        super(context, str, bundle, bundle2, z, location, i, i2, str2, str3);
        this.j = zzbloVar;
    }

    public NativeAdOptions getNativeAdOptions() {
        return zzblo.zza(this.j);
    }
}
