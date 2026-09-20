package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import com.google.android.gms.internal.ads.zzeun;
import com.google.android.gms.internal.ads.zzfyx;
import com.google.android.gms.internal.ads.zzfyy;
import defpackage.ik0;
import defpackage.pi6;
import defpackage.so5;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class pi6 implements zzeun {
    public final zzfyy a;
    public final Context b;

    public pi6(zzfyy zzfyyVar, Context context) {
        this.a = zzfyyVar;
        this.b = context;
    }

    public static ResolveInfo a(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final int zza() {
        return 38;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final zzfyx zzb() {
        return this.a.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeut
            /* JADX WARN: Code duplicated, block: B:26:0x0096  */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                String str2;
                boolean zEquals;
                ActivityInfo activityInfo;
                Context context = this.zza.b;
                PackageManager packageManager = context.getPackageManager();
                Locale locale = Locale.getDefault();
                boolean z = pi6.a(packageManager, "geo:0,0?q=donuts") != null;
                boolean z2 = pi6.a(packageManager, "http://www.google.com") != null;
                String country = locale.getCountry();
                com.google.android.gms.ads.internal.zzt.zzq();
                com.google.android.gms.ads.internal.client.zzaw.zzb();
                boolean zZzq = zzcgg.zzq();
                boolean zB = ik0.b(context);
                boolean zD = ik0.d(context);
                String language = locale.getLanguage();
                ArrayList arrayList = new ArrayList();
                if (Build.VERSION.SDK_INT >= 24) {
                    LocaleList localeList = LocaleList.getDefault();
                    for (int i = 0; i < localeList.size(); i++) {
                        arrayList.add(localeList.get(i).getLanguage());
                    }
                }
                ResolveInfo resolveInfoA = pi6.a(packageManager, "market://details?id=com.google.android.gms.ads");
                if (resolveInfoA == null || (activityInfo = resolveInfoA.activityInfo) == null) {
                    str = null;
                } else {
                    try {
                        PackageInfo packageInfoB = so5.a(context).b(0, activityInfo.packageName);
                        if (packageInfoB != null) {
                            str = packageInfoB.versionCode + "." + activityInfo.packageName;
                        } else {
                            str = null;
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                try {
                    PackageInfo packageInfoB2 = so5.a(context).b(128, "com.android.vending");
                    str2 = packageInfoB2 != null ? packageInfoB2.versionCode + "." + packageInfoB2.packageName : null;
                } catch (Exception unused2) {
                }
                String str3 = Build.FINGERPRINT;
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
                ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
                List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
                if (listQueryIntentActivities == null || resolveInfoResolveActivity == null) {
                    zEquals = false;
                    break;
                }
                int i2 = 0;
                while (true) {
                    if (i2 >= listQueryIntentActivities.size()) {
                        zEquals = false;
                        break;
                    }
                    List<ResolveInfo> list = listQueryIntentActivities;
                    if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i2).activityInfo.name)) {
                        zEquals = resolveInfoResolveActivity.activityInfo.packageName.equals(zzgvf.zza(context));
                        break;
                    }
                    i2++;
                    listQueryIntentActivities = list;
                }
                com.google.android.gms.ads.internal.zzt.zzq();
                return new zzeus(z, z2, country, zZzq, zB, zD, language, arrayList, str, str2, str3, zEquals, Build.MODEL, new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024, ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zziK)).booleanValue() && ik0.a(context));
            }
        });
    }
}
