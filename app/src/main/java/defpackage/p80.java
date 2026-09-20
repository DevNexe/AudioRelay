package defpackage;

import android.net.Uri;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class p80 {
    public final HashSet a = new HashSet();

    public static final class QnHx {
        public final Uri a;
        public final boolean b;

        public QnHx(boolean z, Uri uri) {
            this.a = uri;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || QnHx.class != obj.getClass()) {
                return false;
            }
            QnHx qnHx = (QnHx) obj;
            return this.b == qnHx.b && this.a.equals(qnHx.a);
        }

        public final int hashCode() {
            return (this.a.hashCode() * 31) + (this.b ? 1 : 0);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p80.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((p80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
