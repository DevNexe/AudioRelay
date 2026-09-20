package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o5 {
    public static /* synthetic */ char b(int i) {
        if (i == 1) {
            return '{';
        }
        if (i == 2) {
            return '[';
        }
        if (i == 3) {
            return '{';
        }
        if (i == 4) {
            return '[';
        }
        throw null;
    }

    public static /* synthetic */ char c(int i) {
        if (i == 1) {
            return '}';
        }
        if (i == 2) {
            return ']';
        }
        if (i == 3) {
            return '}';
        }
        if (i == 4) {
            return ']';
        }
        throw null;
    }

    public static String d(StringBuilder sb, Object obj, char c) {
        sb.append(obj);
        sb.append(c);
        return sb.toString();
    }

    public static /* synthetic */ String e(int i) {
        if (i == 1) {
            return "EXPONENTIAL";
        }
        return i == 2 ? "LINEAR" : "null";
    }
}
