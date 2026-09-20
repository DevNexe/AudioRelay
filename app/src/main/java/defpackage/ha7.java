package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.internal.ads.zzcgn;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class ha7 {
    public final Context a;
    public final String b;
    public final TreeMap c = new TreeMap();
    public String d;
    public String e;
    public final String f;

    public ha7(Context context, String str) {
        String strConcat;
        this.a = context.getApplicationContext();
        this.b = str;
        String packageName = context.getPackageName();
        try {
            strConcat = packageName + "-" + so5.a(context).b(0, context.getPackageName()).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            zzcgn.zzh("Unable to get package version name for reporting", e);
            strConcat = String.valueOf(packageName).concat("-missing");
        }
        this.f = strConcat;
    }
}
