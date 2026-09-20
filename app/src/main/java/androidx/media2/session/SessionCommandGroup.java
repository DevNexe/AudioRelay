package androidx.media2.session;

import defpackage.sh5;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class SessionCommandGroup implements sh5 {
    public Set<SessionCommand> a = new HashSet();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionCommandGroup)) {
            return false;
        }
        SessionCommandGroup sessionCommandGroup = (SessionCommandGroup) obj;
        Set<SessionCommand> set = this.a;
        if (set == null) {
            return sessionCommandGroup.a == null;
        }
        return set.equals(sessionCommandGroup.a);
    }

    public final int hashCode() {
        Set<SessionCommand> set = this.a;
        if (set != null) {
            return set.hashCode();
        }
        return 0;
    }
}
