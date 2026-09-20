package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.gms.ads.AdRequest;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzerx implements zzeun {
    public final zzfyy a;
    public final ViewGroup b;
    public final Context c;
    public final Set d;

    public zzerx(zzfyy zzfyyVar, ViewGroup viewGroup, Context context, Set set) {
        this.a = zzfyyVar;
        this.d = set;
        this.b = viewGroup;
        this.c = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final int zza() {
        return 22;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final zzfyx zzb() {
        return this.a.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzerw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ViewGroup viewGroup;
                zzerx zzerxVar = this.zza;
                zzerxVar.getClass();
                boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzeU)).booleanValue();
                Set set = zzerxVar.d;
                if (zBooleanValue && (viewGroup = zzerxVar.b) != null && set.contains("banner")) {
                    return new zzery(Boolean.valueOf(viewGroup.isHardwareAccelerated()));
                }
                Boolean boolValueOf = null;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzeV)).booleanValue() && set.contains("native")) {
                    Context context = zzerxVar.c;
                    if (context instanceof Activity) {
                        Activity activity = (Activity) context;
                        Window window = activity.getWindow();
                        if (window == null || (window.getAttributes().flags & 16777216) == 0) {
                            try {
                                boolValueOf = Boolean.valueOf((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & AdRequest.MAX_CONTENT_URL_LENGTH) != 0);
                            } catch (PackageManager.NameNotFoundException unused) {
                            }
                        } else {
                            boolValueOf = Boolean.TRUE;
                        }
                        return new zzery(boolValueOf);
                    }
                }
                return new zzery(null);
            }
        });
    }
}
