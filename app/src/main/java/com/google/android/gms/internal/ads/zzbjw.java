package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import defpackage.he0;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public final class zzbjw {
    public he0 a;
    public androidx.browser.customtabs.QnHx b;
    public zzgvg c;
    public zzbju d;

    public static boolean zzg(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
            for (int i = 0; i < listQueryIntentActivities.size(); i++) {
                if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i).activityInfo.name)) {
                    return resolveInfoResolveActivity.activityInfo.packageName.equals(zzgvf.zza(context));
                }
            }
        }
        return false;
    }

    public final he0 zza() {
        he0 he0VarA;
        androidx.browser.customtabs.QnHx qnHx = this.b;
        if (qnHx != null) {
            he0VarA = this.a == null ? qnHx.a() : null;
            return this.a;
        }
        this.a = he0VarA;
        return this.a;
    }

    public final void zzb(Activity activity) {
        String strZza;
        if (this.b == null && (strZza = zzgvf.zza(activity)) != null) {
            zzgvg zzgvgVar = new zzgvg(this, null);
            this.c = zzgvgVar;
            zzgvgVar.a = activity.getApplicationContext();
            Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
            if (!TextUtils.isEmpty(strZza)) {
                intent.setPackage(strZza);
            }
            activity.bindService(intent, zzgvgVar, 33);
        }
    }

    public final void zzc(androidx.browser.customtabs.QnHx qnHx) {
        this.b = qnHx;
        qnHx.getClass();
        try {
            qnHx.a.E0();
        } catch (RemoteException unused) {
        }
        zzbju zzbjuVar = this.d;
        if (zzbjuVar != null) {
            zzbjuVar.zza();
        }
    }

    public final void zzd() {
        this.b = null;
        this.a = null;
    }

    public final void zze(zzbju zzbjuVar) {
        this.d = zzbjuVar;
    }

    public final void zzf(Activity activity) {
        zzgvg zzgvgVar = this.c;
        if (zzgvgVar == null) {
            return;
        }
        activity.unbindService(zzgvgVar);
        this.b = null;
        this.a = null;
        this.c = null;
    }
}
