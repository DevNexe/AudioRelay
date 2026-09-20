package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class jc4 {

    public static final class CQf extends jc4 {
        public final List<jg4> a;

        public CQf(List<jg4> list) {
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CQf) && ur1.a(this.a, ((CQf) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "WillDisconnect(timers=" + this.a + ")";
        }
    }

    public static final class QnHx extends jc4 {
        public static final QnHx a = new QnHx();
    }
}
