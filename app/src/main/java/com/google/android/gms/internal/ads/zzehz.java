package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import defpackage.li;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzehz implements zzegk {
    public final Context a;
    public final zzdmf b;
    public final Executor c;
    public final zzfcr d;

    public zzehz(Context context, Executor executor, zzdmf zzdmfVar, zzfcr zzfcrVar) {
        this.a = context;
        this.b = zzdmfVar;
        this.c = executor;
        this.d = zzfcrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final zzfyx zza(final zzfde zzfdeVar, final zzfcs zzfcsVar) {
        String string;
        try {
            string = zzfcsVar.zzw.getString("tab_url");
        } catch (Exception unused) {
            string = null;
        }
        final Uri uri = string != null ? Uri.parse(string) : null;
        return zzfyo.zzn(zzfyo.zzi(null), new zzfxv() { // from class: com.google.android.gms.internal.ads.zzehx
            @Override // com.google.android.gms.internal.ads.zzfxv
            public final zzfyx zza(Object obj) {
                zzehz zzehzVar = this.zza;
                Uri uri2 = uri;
                zzfde zzfdeVar2 = zzfdeVar;
                zzfcs zzfcsVar2 = zzfcsVar;
                zzehzVar.getClass();
                try {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
                        Bundle bundle = new Bundle();
                        li.b(bundle, "android.support.customtabs.extra.SESSION", null);
                        intent.putExtras(bundle);
                    }
                    intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                    intent.putExtras(new Bundle());
                    intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
                    intent.setData(uri2);
                    com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc(intent, null);
                    final zzchf zzchfVar = new zzchf();
                    zzdlf zzdlfVarZze = zzehzVar.b.zze(new zzczr(zzfdeVar2, zzfcsVar2, null), new zzdli(new zzdmn() { // from class: com.google.android.gms.internal.ads.zzehy
                        @Override // com.google.android.gms.internal.ads.zzdmn
                        public final void zza(boolean z, Context context, zzddl zzddlVar) {
                            zzchf zzchfVar2 = zzchfVar;
                            try {
                                com.google.android.gms.ads.internal.zzt.zzj();
                                com.google.android.gms.ads.internal.overlay.zzm.zza(context, (AdOverlayInfoParcel) zzchfVar2.get(), true);
                            } catch (Exception unused2) {
                            }
                        }
                    }, null));
                    zzchfVar.zzd(new AdOverlayInfoParcel(zzcVar, null, zzdlfVarZze.zza(), null, new zzcgt(0, 0, false, false, false), null, null));
                    zzehzVar.d.zza();
                    return zzfyo.zzi(zzdlfVarZze.zzg());
                } catch (Throwable th) {
                    zzcgn.zzh("Error in CustomTabsAdRenderer", th);
                    throw th;
                }
            }
        }, this.c);
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final boolean zzb(zzfde zzfdeVar, zzfcs zzfcsVar) {
        String string;
        Context context = this.a;
        if (!(context instanceof Activity) || !zzbjw.zzg(context)) {
            return false;
        }
        try {
            string = zzfcsVar.zzw.getString("tab_url");
        } catch (Exception unused) {
            string = null;
        }
        return !TextUtils.isEmpty(string);
    }
}
