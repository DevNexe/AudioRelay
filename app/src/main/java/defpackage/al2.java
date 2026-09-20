package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class al2 {
    public final Uri a;
    public final String b;
    public final String c;

    public al2(Uri uri, String str, String str2) {
        this.a = uri;
        this.b = str;
        this.c = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
        Uri uri = this.a;
        if (uri != null) {
            sb.append(" uri=");
            sb.append(String.valueOf(uri));
        }
        String str = this.b;
        if (str != null) {
            sb.append(" action=");
            sb.append(str);
        }
        String str2 = this.c;
        if (str2 != null) {
            sb.append(" mimetype=");
            sb.append(str2);
        }
        sb.append(" }");
        return sb.toString();
    }
}
