package androidx.media2.session;

import defpackage.sh5;

/* JADX INFO: loaded from: classes.dex */
public final class SessionToken implements sh5 {
    public SessionTokenImpl a;

    public interface SessionTokenImpl extends sh5 {
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SessionToken) {
            return this.a.equals(((SessionToken) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
