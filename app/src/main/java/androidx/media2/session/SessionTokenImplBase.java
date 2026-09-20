package androidx.media2.session;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import defpackage.uq2;

/* JADX INFO: loaded from: classes.dex */
final class SessionTokenImplBase implements SessionToken.SessionTokenImpl {
    public int a;
    public int b;
    public String c;
    public String d;
    public IBinder e;
    public ComponentName f;
    public Bundle g;

    public final boolean equals(Object obj) {
        if (!(obj instanceof SessionTokenImplBase)) {
            return false;
        }
        SessionTokenImplBase sessionTokenImplBase = (SessionTokenImplBase) obj;
        return this.a == sessionTokenImplBase.a && TextUtils.equals(this.c, sessionTokenImplBase.c) && TextUtils.equals(this.d, sessionTokenImplBase.d) && this.b == sessionTokenImplBase.b && uq2.a(this.e, sessionTokenImplBase.e);
    }

    public final int hashCode() {
        return uq2.b(Integer.valueOf(this.b), Integer.valueOf(this.a), this.c, this.d);
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.c + " type=" + this.b + " service=" + this.d + " IMediaSession=" + this.e + " extras=" + this.g + "}";
    }
}
