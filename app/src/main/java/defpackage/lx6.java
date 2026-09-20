package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class lx6 {
    public static final Bt7j a = new Bt7j();

    public static synchronized Uri a() {
        Bt7j bt7j = a;
        Uri uri = (Uri) bt7j.getOrDefault("com.google.android.gms.measurement", null);
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
        bt7j.put("com.google.android.gms.measurement", uri2);
        return uri2;
    }
}
