package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class tx6 {
    public final Uri a;
    public final boolean b;

    public tx6(Uri uri, boolean z, boolean z2) {
        this.a = uri;
        this.b = z;
    }

    public final ox6 a(String str, long j) {
        return new ox6(this, str, Long.valueOf(j));
    }

    public final rx6 b(String str, String str2) {
        return new rx6(this, str, str2);
    }

    public final px6 c(String str, boolean z) {
        return new px6(this, str, Boolean.valueOf(z));
    }
}
