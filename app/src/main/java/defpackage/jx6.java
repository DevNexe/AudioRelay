package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class jx6 {
    public static volatile hy6 a = ey6.w;
    public static final Object b = new Object();

    public static boolean a(Context context, Uri uri) {
        String authority = uri.getAuthority();
        boolean z = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            Log.e("PhenotypeClientHelper", String.valueOf(authority).concat(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."));
            return false;
        }
        if (a.b()) {
            return ((Boolean) a.a()).booleanValue();
        }
        synchronized (b) {
            if (a.b()) {
                return ((Boolean) a.a()).booleanValue();
            }
            try {
                if (!"com.google.android.gms".equals(context.getPackageName())) {
                    ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", Build.VERSION.SDK_INT < 29 ? 0 : 268435456);
                    if (providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                    }
                    a = new iy6(Boolean.valueOf(z));
                    return ((Boolean) a.a()).booleanValue();
                }
                if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                    z = true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            a = new iy6(Boolean.valueOf(z));
            return ((Boolean) a.a()).booleanValue();
        }
    }
}
