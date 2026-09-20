package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class lt {
    public final short a;
    public final String b;

    public enum QnHx {
        NORMAL(1000),
        /* JADX INFO: Fake field, exist only in values array */
        GOING_AWAY(1001),
        /* JADX INFO: Fake field, exist only in values array */
        PROTOCOL_ERROR(1002),
        /* JADX INFO: Fake field, exist only in values array */
        CANNOT_ACCEPT(1003),
        CLOSED_ABNORMALLY(1006),
        /* JADX INFO: Fake field, exist only in values array */
        NOT_CONSISTENT(1007),
        /* JADX INFO: Fake field, exist only in values array */
        VIOLATED_POLICY(1008),
        TOO_BIG(1009),
        /* JADX INFO: Fake field, exist only in values array */
        NO_EXTENSION(1010),
        INTERNAL_ERROR(1011),
        /* JADX INFO: Fake field, exist only in values array */
        SERVICE_RESTART(1012),
        /* JADX INFO: Fake field, exist only in values array */
        TRY_AGAIN_LATER(1013);

        public static final LinkedHashMap x;
        public final short w;

        static {
            QnHx[] qnHxArrValues = values();
            int iA = C0239D.A(qnHxArrValues.length);
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
            for (QnHx qnHx : qnHxArrValues) {
                linkedHashMap.put(Short.valueOf(qnHx.w), qnHx);
            }
            x = linkedHashMap;
        }

        QnHx(short s) {
            this.w = s;
        }
    }

    public lt(short s, String str) {
        this.a = s;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lt)) {
            return false;
        }
        lt ltVar = (lt) obj;
        return this.a == ltVar.a && ur1.a(this.b, ltVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CloseReason(reason=");
        LinkedHashMap linkedHashMap = QnHx.x;
        LinkedHashMap linkedHashMap2 = QnHx.x;
        short s = this.a;
        Object objValueOf = (QnHx) linkedHashMap2.get(Short.valueOf(s));
        if (objValueOf == null) {
            objValueOf = Short.valueOf(s);
        }
        sb.append(objValueOf);
        sb.append(", message=");
        return bl2.c(sb, this.b, ')');
    }

    public lt(QnHx qnHx, String str) {
        this(qnHx.w, str);
    }
}
