package androidx.media2.common;

import android.media.MediaFormat;
import android.os.Bundle;
import androidx.versionedparcelable.CustomVersionedParcelable;
import defpackage.Md5A;

/* JADX INFO: loaded from: classes.dex */
public class SessionPlayer$TrackInfo extends CustomVersionedParcelable {
    public int a;
    public int b;
    public MediaFormat c;
    public boolean d;
    public Bundle e;
    public final Object f = new Object();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SessionPlayer$TrackInfo) && this.a == ((SessionPlayer$TrackInfo) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getName());
        sb.append('#');
        sb.append(this.a);
        sb.append('{');
        int i = this.b;
        if (i == 1) {
            sb.append("VIDEO");
        } else if (i == 2) {
            sb.append("AUDIO");
        } else if (i == 4) {
            sb.append("SUBTITLE");
        } else if (i != 5) {
            sb.append("UNKNOWN");
        } else {
            sb.append("METADATA");
        }
        sb.append(", ");
        sb.append(this.c);
        sb.append(", isSelectable=");
        return Md5A.f(sb, this.d, "}");
    }
}
