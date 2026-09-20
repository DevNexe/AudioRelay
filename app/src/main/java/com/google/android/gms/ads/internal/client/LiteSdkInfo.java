package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbvc;
import com.google.android.gms.internal.ads.zzbvf;

/* JADX INFO: loaded from: classes.dex */
public class LiteSdkInfo extends zzci {
    public LiteSdkInfo(Context context) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcj
    public zzbvf getAdapterCreator() {
        return new zzbvc();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcj
    public zzeh getLiteSdkVersion() {
        return new zzeh(ModuleDescriptor.MODULE_VERSION, ModuleDescriptor.MODULE_VERSION, "21.2.0");
    }
}
