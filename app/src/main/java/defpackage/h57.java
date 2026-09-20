package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.internal.ads.zzbju;
import com.google.android.gms.internal.ads.zzbjw;
import com.google.android.gms.internal.ads.zzgvf;

/* JADX INFO: loaded from: classes.dex */
public final class h57 implements zzbju {
    public final /* synthetic */ zzbjw a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ Uri c;

    public h57(zzbjw zzbjwVar, Context context, Uri uri) {
        this.a = zzbjwVar;
        this.b = context;
        this.c = uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbju
    public final void zza() {
        zzbjw zzbjwVar = this.a;
        he0 he0VarZza = zzbjwVar.zza();
        Intent intent = new Intent("android.intent.action.VIEW");
        if (he0VarZza != null) {
            intent.setPackage(he0VarZza.c.getPackageName());
            IBinder iBinderAsBinder = he0VarZza.b.asBinder();
            Bundle bundle = new Bundle();
            li.b(bundle, "android.support.customtabs.extra.SESSION", iBinderAsBinder);
            PendingIntent pendingIntent = he0VarZza.d;
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            intent.putExtras(bundle);
        }
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle2 = new Bundle();
            li.b(bundle2, "android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle2);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        intent.putExtras(new Bundle());
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        Context context = this.b;
        intent.setPackage(zzgvf.zza(context));
        intent.setData(this.c);
        Object obj = r80.a;
        r80.QnHx.b(context, intent, null);
        zzbjwVar.zzf((Activity) context);
    }
}
